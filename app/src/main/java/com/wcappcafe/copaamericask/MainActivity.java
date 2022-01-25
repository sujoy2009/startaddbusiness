package com.wcappcafe.copaamericask;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.Toast;


import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDK;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adlisteners.VideoListener;
import com.wcappcafe.copaamericask.R;

public class MainActivity extends AppCompatActivity {
    ImageButton b11,b12,b21,b22,b31,b32,b41,b42,brec;
    String url;
    String name;
    public WebView webView;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("FIFA World Cup 2022");
      //  StartAppSDK.setTestAdsEnabled(BuildConfig.DEBUG);



        b11=(ImageButton)findViewById(R.id.sheduleid);
        b12=(ImageButton)findViewById(R.id.liveid);
        b21=(ImageButton)findViewById(R.id.winid);
        b22=(ImageButton)findViewById(R.id.stadiumid);
        b31=(ImageButton)findViewById(R.id.pointstableid);
        b32=(ImageButton)findViewById(R.id.teamid);
        b42=(ImageButton)findViewById(R.id.livetvid);
        b41=(ImageButton)findViewById(R.id.highid);
        brec=(ImageButton)findViewById(R.id.recid);

        ConnectivityManager manager=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        final NetworkInfo activeNetwork=manager.getActiveNetworkInfo();


        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(MainActivity.this);
                } else {
                    // Log.d("TAG", "The interstitial ad wasn't ready yet.")
                }

                 */

                if (null == activeNetwork) {

                    Toast.makeText(getApplicationContext(), "No internet connection", Toast.LENGTH_LONG).show();

                } else {




                    Intent intent = new Intent(MainActivity.this, webviewactivity.class);
                    name = "Shedule";
                    url="https://cutt.ly/Mn59Nee";
                    intent.putExtra("urlkey", url);
                    intent.putExtra("namekey", name);
                    // Toast.makeText(getApplicationContext(),"Long press to solve problem",Toast.LENGTH_LONG).show();

                    startActivity(intent);
                    StartAppAd.showAd(MainActivity.this);





                }
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (null == activeNetwork) {

                    Toast.makeText(getApplicationContext(), "No internet connection", Toast.LENGTH_LONG).show();

                } else {


                    Intent intent = new Intent(MainActivity.this, webviewactivity.class);
                    url = "https://livescore.football365.com/";
                    name = "Live score";

                    intent.putExtra("urlkey", url);
                    intent.putExtra("namekey", name);
                    // Toast.makeText(getApplicationContext(),"Long press to solve problem",Toast.LENGTH_LONG).show();

                    startActivity(intent);
                    StartAppAd.showAd(MainActivity.this);


                }


            }
        });
        b21.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {




                    Intent intent = new Intent(MainActivity.this, winneractivity.class);
                  //  url = "https://cutt.ly/0n53orL";
                    name = "Winners of FIFA";

                    intent.putExtra("urlkey", url);
                    intent.putExtra("namekey", name);
                    // Toast.makeText(getApplicationContext(),"Long press to solve problem",Toast.LENGTH_LONG).show();

                    startActivity(intent);
                    StartAppAd.showAd(MainActivity.this);
                  StartAppAd.showAd(MainActivity.this);





            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {





                    Intent intent = new Intent(MainActivity.this,stadium.class);
                   // url = "https://cutt.ly/En53mQ9";
                    name = "Stadium";

                    intent.putExtra("urlkey", url);
                    intent.putExtra("namekey", name);
                    // Toast.makeText(getApplicationContext(),"Long press to solve problem",Toast.LENGTH_LONG).show();

                    startActivity(intent);
                StartAppAd.showAd(MainActivity.this);




            }
        });
        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (null == activeNetwork) {


                    Toast.makeText(getApplicationContext(), "No internet connection", Toast.LENGTH_LONG).show();

                } else {


                    Intent intent = new Intent(MainActivity.this, webviewactivity.class);
                    name = "Points table";
                  //  url="https://cutt.ly/OnTgg2a";
                    intent.putExtra("urlkey", url);
                    intent.putExtra("namekey", name);
                    // Toast.makeText(getApplicationContext(),"Long press to solve problem",Toast.LENGTH_LONG).show();

                    startActivity(intent);
                    StartAppAd.showAd(MainActivity.this);


                }

            }
        });
        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StartAppAd.showAd(MainActivity.this);

            }
        });
        b41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (null == activeNetwork) {

                    Toast.makeText(getApplicationContext(), "No internet connection", Toast.LENGTH_LONG).show();

                } else {



                    Intent intent = new Intent(MainActivity.this, webviewactivity.class);
                    name = "Highlight";
                  //  url="https://cutt.ly/NnTfqdd";
                    intent.putExtra("urlkey", url);
                    intent.putExtra("namekey", name);
                    // Toast.makeText(getApplicationContext(),"Long press to solve problem",Toast.LENGTH_LONG).show();

                    startActivity(intent);
                    StartAppAd.showAd(MainActivity.this);


                }
            }
        });
        b42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (null == activeNetwork) {

                    Toast.makeText(getApplicationContext(), "No internet connection", Toast.LENGTH_LONG).show();

                } else {



                    Intent intent = new Intent(MainActivity.this, webviewactivity.class);
                    name = "Live Tv";
                  //  url="https://cutt.ly/NnTfqdd";
                    intent.putExtra("urlkey", url);
                    intent.putExtra("namekey", name);
                    // Toast.makeText(getApplicationContext(),"Long press to solve problem",Toast.LENGTH_LONG).show();

                    startActivity(intent);
                    final StartAppAd rewardedVideo = new StartAppAd(MainActivity.this);

                    rewardedVideo.setVideoListener(new VideoListener() {
                        @Override
                        public void onVideoCompleted() {
                            Toast.makeText(getApplicationContext(), "Grant the reward to user", Toast.LENGTH_SHORT).show();
                        }
                    });

                    rewardedVideo.loadAd(StartAppAd.AdMode.REWARDED_VIDEO, new AdEventListener() {
                        @Override
                        public void onReceiveAd(Ad ad) {
                            rewardedVideo.showAd();
                        }

                        @Override
                        public void onFailedToReceiveAd(Ad ad) {
                            Toast.makeText(getApplicationContext(), "Can't show rewarded video", Toast.LENGTH_SHORT).show();
                        }
                    });


                }



            }

        });
        brec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, rec_activity.class);
                startActivity(intent);


            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.helpid)
        {
            try {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("market://details?id=" + "com.wcappcafe.copaamericask")));
            } catch (ActivityNotFoundException e) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName())));
            }


        }
        else if(item.getItemId()==R.id.shareid)
        {
            Intent inttt=new Intent(Intent.ACTION_SEND);
            inttt.setType("text/plain");
            String subject="An APP for world cup 2022 ";
            String body="An APP for world cup 2022 https://play.google.com/store/apps/details?id=com.wcappcafe.copaamericask";
            inttt.putExtra(Intent.EXTRA_SUBJECT,subject);
            inttt.putExtra(Intent.EXTRA_TEXT,body);


            startActivity(Intent.createChooser(inttt,"Share with"));
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        StartAppAd.onBackPressed(this);
        super.onBackPressed();
    }
}
