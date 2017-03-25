package com.teamx.smartbuddy.SQLite;

import android.provider.BaseColumns;

public final class TaskReaderContract {

    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.
    private TaskReaderContract() {}

    /* Inner class that defines the table contents */
    public static class TaskEntry implements BaseColumns {
        public static final String TABLE_NAME = "tasks";
        public static final String COLUMN_NAME_EVENT = "event";
        public static final String COLUMN_NAME_TIME = "time";
    }
}