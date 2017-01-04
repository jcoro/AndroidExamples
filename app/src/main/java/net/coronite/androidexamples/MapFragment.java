package net.coronite.androidexamples;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MapFragment extends ItemDetailFragment {

    private static final String ADDRESS = "1600 Amphitheatre Parkway, Mountain View, CA 94043";


    public MapFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_map, container, false);

        ((TextView) rootView.findViewById(R.id.item_detail_map)).setText(getString(R.string.map_fragment_description));
        Button btn = (Button) rootView.findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                showMapFromAddress(ADDRESS);
            }
        });

        return rootView;
    }

    public void showMapFromAddress(String address) {
        Uri geoLocation = Uri.parse("geo:" + address);
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(geoLocation);
        if (intent.resolveActivity(getContext().getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Toast.makeText(getContext(), getString(R.string.map_error_message), Toast.LENGTH_SHORT).show();
        }
    }

}
