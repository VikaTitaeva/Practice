package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }
    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate( R.menu.menu,menu );
        return super.onCreateOptionsMenu( menu );
    }
    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        Intent intent=null;
        switch (item.getItemId())
        {
            case R.id.m1: intent = new Intent(this, cinema.class);
            break;
            case R.id.m2: intent = new Intent(this, film.class);
                break;
            case R.id.m3: intent = new Intent(this, newcinema.class);
                break;
            case R.id.m4: intent = new Intent(this, newfilm.class);
                break;
            default: return super.onOptionsItemSelected( item );
        }
        startActivity( intent );
        return super.onOptionsItemSelected( item );
    }
}