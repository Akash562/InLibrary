package com.akash.inlibrary;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.akash.rodielibrary.Custom_Toast;
import com.akash.rodielibrary.Single_Alert;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_main);


        findViewById(R.id.one).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                Single_Alert PSA = new Single_Alert();
                PSA.Single_Alert(MainActivity.this);
                PSA.setTitle("TITLE");
                PSA.setTitleSize(14);
                PSA.setIcon(R.drawable.ic_android);
                PSA.setContent("Custom ALert Body");
                PSA.setContentSize(14);
                PSA.show(new Single_Alert.OnClickListener() {
                    @Override
                    public void onPositiveButtonClick() {
                        Toast.makeText(MainActivity.this, "Click Action Button", Toast.LENGTH_SHORT).show();
                        PSA.dismiss();
                    }
                });
            }
        });


        // toast success
        findViewById(R.id.toasts).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                new Custom_Toast().Toast_Success(MainActivity.this, "Android Toast by PirateAK", 16);
            }
        });


        // toast error
        findViewById(R.id.toaste).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                new Custom_Toast().Toast_Error(MainActivity.this, "Android Toast by PirateAK", 16);
            }
        });


        // toast warning
        findViewById(R.id.toastw).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                new Custom_Toast().Toast_Warning(MainActivity.this, "Android Toast by PirateAK", 16);
            }
        });


    }
}