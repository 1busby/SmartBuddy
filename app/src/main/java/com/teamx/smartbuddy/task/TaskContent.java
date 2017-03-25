package com.teamx.smartbuddy.task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<com.teamx.smartbuddy.task.TaskContent.TaskItem> ITEMS = new ArrayList<com.teamx.smartbuddy.task.TaskContent.TaskItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, com.teamx.smartbuddy.task.TaskContent.TaskItem> ITEM_MAP = new HashMap<String, com.teamx.smartbuddy.task.TaskContent.TaskItem>();

    static {
        addItem(createTaskItem(1, "Bathroom", "5 min"));
        addItem(createTaskItem(2, "Dress Up", "5 min"));
        addItem(createTaskItem(3, "Shower", "10 min"));
        addItem(createTaskItem(4, "Breakfast", "10 min"));
    }

    private static void addItem(com.teamx.smartbuddy.task.TaskContent.TaskItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static com.teamx.smartbuddy.task.TaskContent.TaskItem createTaskItem(int position, String eventName, String time) {
        return new com.teamx.smartbuddy.task.TaskContent.TaskItem(String.valueOf(position), eventName, time, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class TaskItem {
        public final String id;
        public final String task;
        public final String time;
        public final String details;

        public TaskItem(String id, String task, String time, String details) {
            this.id = id;
            this.task = task;
            this.time = time;
            this.details = details;
        }

        @Override
        public String toString() {
            return task;
        }
    }
}
