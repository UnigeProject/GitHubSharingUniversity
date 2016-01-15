package com.example.tia.githubsharingproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bottoneCheNascondere = (Button) findViewById(R.id.BottoneCheNasconde);
    Button bottoneNascosto =(Button) findViewById(R.id.BottoneCheSiNasconde);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClickNascondino(){
        bottoneNascosto.setVisibility(View.GONE);
    }

    public void updatedaFisso (){
        int g = 0;
        int y = 0;
    }
}
