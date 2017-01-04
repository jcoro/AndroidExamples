package net.coronite.androidexamples;


public class Utility {

    public static ItemDetailFragment chooseFragment(String id) {
        ItemDetailFragment returnFrag;
        switch (id) {
            case "1": returnFrag = new MapFragment();
                break;
            default: returnFrag = new ItemDetailFragment();
                break;
        }
        return returnFrag;
    }

}
