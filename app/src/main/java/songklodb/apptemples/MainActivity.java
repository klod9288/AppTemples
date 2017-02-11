package songklodb.apptemples;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
        int[] iconInts = new int[]{
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
        String[] nameStrings = getResources().getStringArray(R.array.my_name);
        String[] detailStrings = getResources().getStringArray(R.array.my_drtail);




    }
}//Main Class
