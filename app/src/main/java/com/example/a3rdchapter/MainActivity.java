package com.example.a3rdchapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import java.text.BreakIterator;
import java.text.StringCharacterIterator;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView t;

        t = (TextView)findViewById(R.id.theader);
        t.setText(Html.fromHtml(getString(R.string.header)));

        t = (TextView)findViewById(R.id.t1);
        t.setText(Html.fromHtml(getString(R.string.stress_health)));


        t = (TextView)findViewById(R.id.twwt);
        t.setText(Html.fromHtml(getString(R.string.wwt)));

        t = (TextView)findViewById(R.id.tcws);
        t.setText(Html.fromHtml(getString(R.string.cws)));

        t = (TextView)findViewById(R.id.tsyrtr);
        t.setText(Html.fromHtml(getString(R.string.syrtr)));


        t = (TextView)findViewById(R.id.tresil);
        t.setText(Html.fromHtml(getString(R.string.resil)));


        t = (TextView)findViewById(R.id.tresou);
        t.setText(Html.fromHtml(getString(R.string.resou)));

        t = (TextView)findViewById(R.id.tdesi);
        t.setText(Html.fromHtml(getString(R.string.desi)));
    }

}