package com.example.wil.ciguenial;
import android.app.FragmentTransaction;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.Transition;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, FragmentArequipa.OnFragmentInteractionListener, FragmentCuzco.OnFragmentInteractionListener,
        FragmentPiura.OnFragmentInteractionListener, FragmentTrujillo.OnFragmentInteractionListener  {

    Button btnare, btncuz, btnpiu, btntru;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentArequipa arequipa = new FragmentArequipa();

        getSupportFragmentManager().beginTransaction().add(R.id.contenedor, arequipa);

        btnare = (Button)findViewById(R.id.btnarequipa);
        btncuz = (Button)findViewById(R.id.btncuzco);
        btnpiu = (Button)findViewById(R.id.btpiura);
        btntru = (Button)findViewById(R.id.btntrujillo);

        btnare.setOnClickListener(this);
        btncuz.setOnClickListener(this);
        btnpiu.setOnClickListener(this);
        btntru.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.btnarequipa:
                FragmentArequipa frag1 = new FragmentArequipa();
                android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.contenedor, frag1);
                transaction.commit();
                break;

            case R.id.btncuzco:
                FragmentCuzco frag2 = new FragmentCuzco();
                android.support.v4.app.FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                transaction1.replace(R.id.contenedor, frag2);
                transaction1.commit();
                break;

            case R.id.btpiura:
                FragmentPiura frag3 = new FragmentPiura();
                android.support.v4.app.FragmentTransaction transaction2 = getSupportFragmentManager().beginTransaction();
                transaction2.replace(R.id.contenedor, frag3);
                transaction2.commit();
                break;

            case R.id.btntrujillo:
                FragmentTrujillo frag4 = new FragmentTrujillo();
                android.support.v4.app.FragmentTransaction transaction3 = getSupportFragmentManager().beginTransaction();
                transaction3.replace(R.id.contenedor, frag4);
                transaction3.commit();
                break;
        }

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
