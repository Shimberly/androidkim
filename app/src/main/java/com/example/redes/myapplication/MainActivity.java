package com.example.redes.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.util.Log;



public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    String tag = "LifeCycleEvents";
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.print("Hola estoy en Create");
        Log.d(tag, "Hola estoy en Create");
        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    public void onStart()
    {
        super.onStart();
        Log.d(tag, "Hola estoy en Start");
    }
    public void onRestart()
    {
        super.onRestart();
        Log.d(tag, "Hola estoy en Restart");
    }
    public void onResume()
    {
        super.onResume();
        Log.d(tag, "Hola estoy en Resume");

    }
    public void onPause()
    {
        super.onPause();
        Log.d(tag, "Hola estoy en Pause");
    }
    public void onStop()
    {
        super.onStop();
        System.out.print("Hola estoy en Stop");
    }
    public void onDestroy()
    {
        super.onDestroy();
        System.out.print("Hola estoy en Destroy");
    }

}
