package com.example.hp.implicit;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext=findViewById(R.id.editText);
    }

    public void first(View view) {
        Uri uri=Uri.parse("tel:"+edittext.getText().toString());
        Intent i=new Intent(Intent.ACTION_DIAL,uri);
        if (i.resolveActivity(getPackageManager())!=null)
        {
            startActivity(i);
        }
    }

    public void second(View view) {
        Uri u=Uri.parse("https://"+edittext.getText().toString());
        Intent i=new Intent(Intent.ACTION_VIEW,u);
        if (i.resolveActivity(getPackageManager())!=null)
        {
            startActivity(i);
        }
    }

    public void third(View view) {
        Uri uri=Uri.parse("geo:0,0?q="+edittext.getText().toString());
        Intent i=new Intent(Intent.ACTION_VIEW,uri);
        if (i.resolveActivity(getPackageManager())!=null)
        {
            startActivity(i);
        }

    }
}
