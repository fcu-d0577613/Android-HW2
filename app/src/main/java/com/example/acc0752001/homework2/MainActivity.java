package com.example.acc0752001.homework2;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {
    Button button1;
    EditText edittext1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);



        button1 = (Button)findViewById(R.id.button);
        edittext1 = (EditText)findViewById(R.id.editText2);
        edittext1.setOnClickListener(hello);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    private OnClickListener hello = new OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast t = Toast.makeText(MainActivity.this,"Hello " + edittext1.getText(),Toast.LENGTH_SHORT);
            t.show();

        }
    };

    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_about:
                AlertDialog.Builder ad = new AlertDialog.Builder(this);
                ad.setTitle("About this app");
                ad.setMessage("Author : Chung-Ti Lin");

                DialogInterface.OnClickListener listener =
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface di, int i) {
                            }
                        };
                ad.setPositiveButton("OK", listener);
                ad.show();
                break;
            case R.id.action_reset:
                edittext1.setText("");
                break;
        }
        return super.onOptionsItemSelected(item);
    }


}
