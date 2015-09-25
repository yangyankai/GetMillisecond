package com.example.ykai.timecounttest;

import android.app.Activity;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;



public class MainActivity extends Activity {
    private int recLen = 0;
    private TextView txtView;
    private TextView txtView2;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        txtView = (TextView)findViewById(R.id.txttime);
        txtView2 = (TextView)findViewById(R.id.txttime2);
        long startTime = System.nanoTime();  //開始時間
       long s= System.currentTimeMillis();
//
//   这里是你要测量的代码
//
        for (int i=0;i<1000000;i++)
        {
            recLen++;
        }
        long consumingTime = System.nanoTime()-startTime;//消耗時間
        long s2= System.currentTimeMillis();

        txtView.setText(""+consumingTime);
        txtView2.setText(""+ (s2-s)*1000000);
    }


}