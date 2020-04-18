package com.pandorax.solutiontap;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Switch;

import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    FrameLayout frameLayout1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.framelayout1,new PollFrag())
                .commit();

        frameLayout1 = (FrameLayout) findViewById(R.id.framelayout1);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                Fragment SelectFragment = null;
                switch (item.getItemId())
                {
                    case R.id.status:
                        SelectFragment = new PollFrag();
                        break;

                    case R.id.query:
                        SelectFragment = new Queries();
                        break;


                    case R.id.video:
                        SelectFragment = new Video();
                        break;

                }

                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.framelayout1,SelectFragment)
                        .commit();


                return true;


            }
        });

    }
}
