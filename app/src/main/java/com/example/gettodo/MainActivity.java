package com.example.gettodo;

import android.content.ContentResolver;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button getDATA;
    TextView textView;
    ContentResolver contentResolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDATA = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        contentResolver = getContentResolver();

        getDATA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAllToDo();
            }
        });
    }

    public void setAllToDo() {
        Cursor cursor = contentResolver.query(ToDoConstants.CONTENT_URI_1, null, null, null,null,null);

        StringBuilder stringBuilder = new StringBuilder("");
        if (cursor != null && cursor.getCount() > 0) {
            while (cursor.moveToNext()) {
                stringBuilder.append(cursor.getLong(0) + ",  " + cursor.getString(1) + "\n");
            }
        }

        textView.setText(stringBuilder.toString());
    }
}