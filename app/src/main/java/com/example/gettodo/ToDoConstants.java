package com.example.gettodo;

import android.net.Uri;

public interface ToDoConstants {

    Uri CONTENT_URI_1 = Uri.parse("content://com.example.todos/TODO_LIST");
    Uri CONTENT_URI_2 = Uri.parse("content://com.example.todos/TODO_LIST_FROM_PLACE");
    Uri CONTENT_URI_3 = Uri.parse("content://com.example.todos/TODOS_COUNT");

    String COLUMN_TODO_ID = "task_id";
    String COLUMN_TODO = "todo";
    String COULUMN_PLACE = "place";
}
