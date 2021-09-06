package com.ajidsolehudin.sharebutton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.share_menu, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.share:
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String bodyText = "Masukkan text di sini";
                intent.putExtra(Intent.EXTRA_SUBJECT, "jika ingin masukan subjek, masukan disini");
                intent.putExtra(Intent.EXTRA_TEXT, bodyText);
                startActivity(Intent.createChooser(intent, "Sharing option"));
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }


}