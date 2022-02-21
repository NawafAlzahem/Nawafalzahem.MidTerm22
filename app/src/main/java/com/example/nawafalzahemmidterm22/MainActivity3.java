package com.example.nawafalzahemmidterm22;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity3 extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_main3);
        String[]items={"Alfaisal link","clickable music","google link","amazon link"};

        setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_main3,R.id.t1,items));




    }
    protected void onListItemClick(ListView listView,View view,int position,long id){
switch(position){
    case 0:
        startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.alfaisal.edu")));
        break;
    case 1:
        startActivity(new Intent(MainActivity3.this,MainActivity4.class));
        MediaPlayer MP= MediaPlayer.create(getApplicationContext(),R.raw.song1);
        MP.start();
        break;
    case 2:
        startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com")));
        break;
    case 3:
        startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.amazon.com")));
        break;



}
    }
}