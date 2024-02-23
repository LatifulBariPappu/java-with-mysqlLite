package com.example.mysqllitedatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {
    EditText titleInput,authorInpur,pagesInput;
    Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        titleInput=findViewById(R.id.title_input);
        authorInpur=findViewById(R.id.author_input);
        pagesInput=findViewById(R.id.pages_input);
        addButton=findViewById(R.id.add_button);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDatabaseHeLper myDB=new MyDatabaseHeLper(AddActivity.this);
                myDB.addBook(titleInput.getText().toString().trim(),
                        authorInpur.getText().toString().trim(),
                        Integer.valueOf(pagesInput.getText().toString().trim()));
            }
        });
    }
}