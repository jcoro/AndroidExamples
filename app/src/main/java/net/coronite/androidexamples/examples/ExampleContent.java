package net.coronite.androidexamples.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for building the list of examples in the app.
 */
public class ExampleContent {

    /**
     * An array of example items.
     */
    public static final List<ExampleItem> ITEMS = new ArrayList<>();

    /**
     * An array of the names of ExampleItems.
     */
    private static final String[] ITEMNAMES = {"Google Maps", "Drawer Navigation"};

    /**
     * An array of the descriptions of ExampleItems.
     */
    private static final String[] ITEMDESC = {"Launch Google Maps with various inputs", "Utilize the Drawer Navigation"};

    /**
     * A map of example items, by ID.
     */
    public static final Map<String, ExampleItem> ITEM_MAP = new HashMap<>();

    private static final int COUNT = ITEMNAMES.length;

    static {
        // Create and add the items, one for each entry in ITEMNAMES.
        for (int i = 0; i < COUNT; i++) {
            addItem(createItem(i));
        }
    }

    private static void addItem(ExampleItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static ExampleItem createItem(int position) {
        return new ExampleItem(String.valueOf(position + 1), ITEMNAMES[position], makeDetails(position));
    }

    private static String makeDetails(int position) {
        return ITEMDESC[position];
    }

    /**
     * An example item representing a piece of content.
     */
    public static class ExampleItem {
        public final String id;
        public final String content;
        public final String details;

        ExampleItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

    }
}
