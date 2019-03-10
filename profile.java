package com.example.shubhamgupta.shiksha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CustomerDashboard extends AppCompatActivity {
    private Button call;
    private Button notes;
    private Button feedback;
    private Button chat;
    private Button profile;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_dashboard);

        phone=(Button)findViewById(R.id.phone);
        notes=(Button)findViewById(R.id.notes);
        feedback=(Button)findViewById(R.id.feedback);
        chat=(Button)findViewById(R.id.chat);
        profile=(Button)findViewById(R.id.profile);

        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CustomerDashboard.this,CustomerMapActivity.class);
                startActivity(intent);
            }
        });
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CustomerDashboard.this,UploadMain.class);
                startActivity(intent);

            }
        });
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CustomerDashboard.this,UploadPic.class);
                startActivity(intent);

            }
        });

    }
}