package songklodb.apptemples;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    //Explicit

    private ListView templesListView;
    private Button AboutButton;
    private static final String ulAbout = "https://www.facebook.com/Eekkasitnongkon/?ref=page_internal";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        templesListView = (ListView) findViewById(R.id.listView);
        AboutButton = (Button) findViewById(R.id.button2);
        //conterlor of button
        AboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //sound fefect
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(),
                        R.raw.beep1);
                mediaPlayer.start();
                //Inten wepView
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(ulAbout));
                startActivities(intent);

            }//on Click

            private void startActivities(Intent intent) {



            }


        });

        //Create lisview
        //1.setup array type simple
        final int[] iconInts = new int[]{
                R.drawable.background, R.drawable.background,
                R.drawable.background, R.drawable.background,
                R.drawable.background, R.drawable.background,
                R.drawable.background, R.drawable.background,
                R.drawable.background, R.drawable.background,
                R.drawable.background, R.drawable.background,
                R.drawable.background, R.drawable.background,
                R.drawable.background, R.drawable.background,
                R.drawable.background, R.drawable.background,
                R.drawable.background,R.drawable.background, };

        //2.By xml
        final String[] nameStrings = getResources().getStringArray(R.array.my_name);
        String[] detailStrings = getResources().getStringArray(R.array.my_drtail);

        //3.ทำการโยนทั้งตัวแปรทั้ง 3 อย่างขึ้นมา Adapter แปลงค่าออกมาแสดงบนจอภาพ
        MyAdapter myAdapter = new MyAdapter(this, iconInts, nameStrings, detailStrings);
        templesListView.setAdapter(myAdapter);
        templesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("name", nameStrings[position]);
                intent.putExtra("icon", iconInts[position]);
                intent.putExtra("index", position);
                startActivities(intent);

            }

            private void startActivities(Intent intent) {



            }
        });



    }//Method


}//Main Class
