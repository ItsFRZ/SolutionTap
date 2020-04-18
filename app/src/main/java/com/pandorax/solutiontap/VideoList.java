package com.pandorax.solutiontap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;

public class VideoList extends AppCompatActivity {



    LinearLayout linearLayout1,linearLayout2,linearLayout3,linearLayout4,linearLayout5,linearLayout6,linearLayout7;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_list);


        button = (Button) findViewById(R.id.pre);

        linearLayout1 = (LinearLayout) findViewById(R.id.nextl1);
        linearLayout2 = (LinearLayout) findViewById(R.id.nextl2);
        linearLayout3 = (LinearLayout) findViewById(R.id.nextl3);
        linearLayout4 = (LinearLayout) findViewById(R.id.nextl4);
        linearLayout5 = (LinearLayout) findViewById(R.id.nextl5);
        linearLayout6 = (LinearLayout) findViewById(R.id.nextl6);
        linearLayout7 = (LinearLayout) findViewById(R.id.nextl7);

        linearLayout1.setVisibility(View.VISIBLE);
        linearLayout2.setVisibility(View.GONE);
        linearLayout3.setVisibility(View.GONE);
        linearLayout4.setVisibility(View.GONE);
        linearLayout5.setVisibility(View.GONE);
        linearLayout6.setVisibility(View.GONE);
        linearLayout7.setVisibility(View.GONE);




    }

    public void next1(View view) {


        linearLayout1.setVisibility(View.GONE);
        linearLayout2.setVisibility(View.VISIBLE);
        linearLayout3.setVisibility(View.GONE);
        linearLayout4.setVisibility(View.GONE);
        linearLayout5.setVisibility(View.GONE);
        linearLayout6.setVisibility(View.GONE);
        linearLayout7.setVisibility(View.GONE);


    }


    public void next2(View view) {


        linearLayout1.setVisibility(View.GONE);
        linearLayout2.setVisibility(View.GONE);
        linearLayout3.setVisibility(View.VISIBLE);
        linearLayout4.setVisibility(View.GONE);
        linearLayout5.setVisibility(View.GONE);
        linearLayout6.setVisibility(View.GONE);
        linearLayout7.setVisibility(View.GONE);


    }



    public void next3(View view) {


        linearLayout1.setVisibility(View.GONE);
        linearLayout2.setVisibility(View.GONE);
        linearLayout3.setVisibility(View.GONE);
        linearLayout4.setVisibility(View.VISIBLE);
        linearLayout5.setVisibility(View.GONE);
        linearLayout6.setVisibility(View.GONE);
        linearLayout7.setVisibility(View.GONE);


    }




    public void next4(View view) {


        linearLayout1.setVisibility(View.GONE);
        linearLayout2.setVisibility(View.GONE);
        linearLayout3.setVisibility(View.GONE);
        linearLayout4.setVisibility(View.GONE);
        linearLayout5.setVisibility(View.VISIBLE);
        linearLayout6.setVisibility(View.GONE);
        linearLayout7.setVisibility(View.GONE);


    }




    public void next5(View view) {


        linearLayout1.setVisibility(View.GONE);
        linearLayout2.setVisibility(View.GONE);
        linearLayout3.setVisibility(View.GONE);
        linearLayout4.setVisibility(View.GONE);
        linearLayout5.setVisibility(View.GONE);
        linearLayout6.setVisibility(View.VISIBLE);
        linearLayout7.setVisibility(View.GONE);


    }



    public void next6(View view) {


        linearLayout1.setVisibility(View.GONE);
        linearLayout2.setVisibility(View.GONE);
        linearLayout3.setVisibility(View.GONE);
        linearLayout4.setVisibility(View.GONE);
        linearLayout5.setVisibility(View.GONE);
        linearLayout6.setVisibility(View.GONE);
        linearLayout7.setVisibility(View.VISIBLE);


    }
    public void next7(View view) {


        linearLayout1.setVisibility(View.VISIBLE);
        linearLayout2.setVisibility(View.GONE);
        linearLayout3.setVisibility(View.GONE);
        linearLayout4.setVisibility(View.GONE);
        linearLayout5.setVisibility(View.GONE);
        linearLayout6.setVisibility(View.GONE);
        linearLayout7.setVisibility(View.GONE);


    }

}
