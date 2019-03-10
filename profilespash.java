package com.example.shubhamgupta.shiksa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class CustomerSplash extends AppCompatActivity {

    private int SLEEP_TIMER=3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_customer_splash);
        getSupportActionBar().hide();
        Logolauncher logolauncher=new Logolauncher();
        logolauncher.start();
    }
    private class Logolauncher extends Thread{
        public void run(){
            try{
                sleep(1000*SLEEP_TIMER);

            }catch(InterruptedException e){
                e.printStackTrace();
            }
            Intent intent=new Intent(CustomerSplash.this,CustomerDashboard.class);
            startActivity(intent);
            CustomerSplash.this.finish();
        }
    }
}
