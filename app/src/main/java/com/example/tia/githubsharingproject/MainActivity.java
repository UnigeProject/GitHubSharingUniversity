package com.example.tia.githubsharingproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bottoneNascosto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottoneNascosto  =(Button) findViewById(R.id.BottoneCheSiNasconde);

    }

    public void onClickNascondino(){
        bottoneNascosto.setVisibility(View.GONE);
    }

    public void onClickDaNascosto(){
        Toast.makeText(this, "Anche da nascosto", Toast.LENGTH_SHORT).show();
    }
}
