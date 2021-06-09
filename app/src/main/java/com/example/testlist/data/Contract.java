package com.example.testlist.data;

import android.provider.BaseColumns;

public class Contract {
    public static abstract class HeadphoneEntry implements BaseColumns {

        public static final String TABLE_NAME = "wallpapers";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_PRICE = "price";
        public static final String COLUMN_RESOLUTION = "resolution";
        public static final String COLUMN_STOCK = "stock";
        public static final String COLUMN_IMAGE = "image";

        /**
         * Possible values for the style of the headphone.
         */
        public static final int RESOLUTION_720p = 0;
        public static final int RESOLUTION_1080p = 1;
        public static final int RESOLUTION_4k = 2;


    }
}
