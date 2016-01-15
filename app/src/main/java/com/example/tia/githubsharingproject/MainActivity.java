package com.example.tia.githubsharingproject;


import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    Button bottoneNascosto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottoneNascosto = (Button)findViewById(R.id.Registrazione);
        SharedPreferences mPrefs = getSharedPreferences("Registrazione" , MODE_PRIVATE);
        String str = mPrefs.getString("Registrazione" , "");
        if (str.equals("2")) {
            // la registrazione è già stata fatta quindi nascondo il bottone
            bottoneNascosto.setVisibility(View.GONE);
        }
        else{

            bottoneNascosto.setVisibility(View.VISIBLE);
        }

    }

    public void onClickRegistrazione(View view){
        startActivity(new Intent(this, Registrazione.class));
    }
}
