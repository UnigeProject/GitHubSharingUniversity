package com.example.tia.githubsharingproject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Registrazione extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrazione);
    }

    public void onClickFineReg(View view){
        // simulando il fatto che ho "finito" la registrazione
        // cambio la preference in false e se è false io nascondo il button
        // registrazione

        SharedPreferences mPrefs = getSharedPreferences("Registrazione" , MODE_PRIVATE );
        SharedPreferences.Editor editor = mPrefs.edit();

        editor.putString("Registrazione" , "2");
        editor.apply();


        Intent intent = new Intent(this , MainActivity.class);
        startActivity(intent);
    }
}
