package com.example.abubakarzahid.sharedpreference;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etinput;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etinput =(EditText)findViewById(R.id.editText);
        btn = (Button)findViewById(R.id.button);

        final SharedPreferences sp = getSharedPreferences("My file",MODE_PRIVATE);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = etinput.getText().toString();

                SharedPreferences.Editor editor =sp.edit();
                editor.putString("Input",n);
                editor.commit();

                Toast.makeText(MainActivity.this,"Paper practise",Toast.LENGTH_SHORT).show();
            }
        });
    }
}