package com.example.hugo.libro.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

   // private static final int COUNT = 25;

    static {
        // Add some sample items.
     //   for (int i = 1; i <= COUNT; i++) {
       //     addItem(createDummyItem(i));
        addItem(new DummyItem("1","Women in Sports: 50 Fearless Athletes Who Played to Win","https://www.amazon.com/gp/product/1607749785/ref=s9_acsd_hps_bw_c_x_5_w?pf_rd_m=ATVPDKIKX0DER&pf_rd_s=merchandised-search-5&pf_rd_r=Y0ESB44PJXT782SHW611&pf_rd_r=Y0ESB44PJXT782SHW611&pf_rd_t=101&pf_rd_p=69277066-3b06-4a94-9da5-e2cd41f7b175&pf_rd_p=69277066-3b06-4a94-9da5-e2cd41f7b175&pf_rd_i=2"));
        addItem(new DummyItem("2","The Dudes Abide: The Coen Brothers and the Making of The Big Lebowski (Kindle Single) Kindle Edition","https://www.amazon.com/gp/product/B00M0DTYV6/ref=s9_acsd_top_hd_bw_bWa_c_x_2_w?pf_rd_m=ATVPDKIKX0DER&pf_rd_s=merchandised-search-4&pf_rd_r=9CYPBBAMZGDHHDC8Q49D&pf_rd_t=101&pf_rd_p=c389fb1e-6c93-51ff-8e51-8b0048060841&pf_rd_i=2020"));
        addItem(new DummyItem("2","The Animator's Survival Kit: A Manual of Methods, Principles and Formulas for Classical, Computer, Games, Stop Motion and Internet Animators ","https://www.amazon.com/gp/product/086547897X/ref=s9_acsd_top_hd_bw_b9PYT7z_c_x_w?pf_rd_m=ATVPDKIKX0DER&pf_rd_s=merchandised-search-4&pf_rd_r=BFPJCSB3PZB6N9KR7XHY&pf_rd_t=101&pf_rd_p=1d3bb0c8-7ea1-5dcd-b42f-a0705573f6f0&pf_rd_i=8622819011"));
        }
  //  }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

  /*  private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }*/
/*
    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }*/

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;

        public DummyItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
