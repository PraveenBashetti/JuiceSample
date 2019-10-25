package com.example.juicesample;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;

import java.util.Timer;
import java.util.TimerTask;

public class DashboardActivity extends AppCompatActivity {
    ViewPager viewPager;
    CardView juices,milkshakes,mastanis,faloodas,lassis,snacks,teas,icecreams;
    int images[] = {R.drawable.mangojuice, R.drawable.pineapple, R.drawable.applejuice, R.drawable.orangejuice};
    MyCustomPagerAdapter myCustomPagerAdapter;

    private View convertView;

    int currentPage = 0;
    Timer timer;
    final long DELAY_MS = 500;//delay in milliseconds before task is to be executed
    final long PERIOD_MS = 3000; // time in milliseconds between successive task executions.
    private int NUM_PAGES;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        viewPager=findViewById(R.id.slider_juices);
        myCustomPagerAdapter = new MyCustomPagerAdapter(DashboardActivity.this, images);
        viewPager.setAdapter(myCustomPagerAdapter);

        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == NUM_PAGES-1) {
                    currentPage = 0;
                }
                viewPager.setCurrentItem(currentPage++, true);
            }
        };

        timer = new Timer(); // This will create a new Thread
        timer.schedule(new TimerTask() { // task to be scheduled
            @Override
            public void run() {
                handler.post(Update);
            }
        }, DELAY_MS, PERIOD_MS);

      juices=findViewById(R.id.juices);
        juices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashboardActivity.this, SubMenuJuice.class);
                intent.putExtra("type",1);
                startActivity(intent);
            }
        });

        milkshakes=findViewById(R.id.milkshakes);
        milkshakes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashboardActivity.this, SubMenuJuice.class);
                intent.putExtra("type",2);
                startActivity(intent);
            }
        });
        /*
        mastanis=findViewById(R.id.mastanis);
        mastanis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashboardActivity.this,ListView.class);
                startActivity(intent);
            }
        });

        faloodas=findViewById(R.id.faloodas);
        faloodas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashboardActivity.this,ListView.class);
                startActivity(intent);
            }
        });

        snacks=findViewById(R.id.snacks);
        snacks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashboardActivity.this,ListView.class);
                startActivity(intent);
            }
        });
        lassis=findViewById(R.id.lassis);
        lassis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashboardActivity.this,ListView.class);
                startActivity(intent);
            }
        });
        teas=findViewById(R.id.teas);
        teas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashboardActivity.this,ListView.class);
                startActivity(intent);
            }
        });
        icecreams=findViewById(R.id.icecreams);
        icecreams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashboardActivity.this,ListView.class);
                startActivity(intent);
            }
        });*/

    }




}