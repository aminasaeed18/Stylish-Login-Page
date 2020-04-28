package com.example.stylishloginpage;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView)findViewById(R.id.text1);
        TextView textView2 = (TextView)findViewById(R.id.text2);
        TextView textView3 = (TextView)findViewById(R.id.text3);
        TextView textView4 = (TextView)findViewById(R.id.text4);
        EditText editText1 = (EditText)findViewById(R.id.edit1);
        EditText editText2 = (EditText)findViewById(R.id.edit2);

        textView.setText("Welcome      Back");
        Typeface MLight = Typeface.createFromAsset(getAssets(), "fonts/MLight.ttf");
        Typeface MMedium = Typeface.createFromAsset(getAssets(), "fonts/MMedium.ttf");
        Typeface Vidaloka = Typeface.createFromAsset(getAssets(), "fonts/Vidaloka.ttf");
        Typeface MrDeHaviland = Typeface.createFromAsset(getAssets(), "fonts/MrDeHaviland-Regular.ttf");
        Typeface NotoSansBold = Typeface.createFromAsset(getAssets(), "fonts/NotoSans-Bold.ttf");
        Typeface NotoSansReg = Typeface.createFromAsset(getAssets(), "fonts/NotoSans-Regular.ttf");

        textView.setTypeface(NotoSansBold);
        textView2.setTypeface(NotoSansBold);
        textView3.setTypeface(NotoSansReg);
        textView4.setTypeface(NotoSansReg);
        editText1.setTypeface(NotoSansReg);
        editText2.setTypeface(NotoSansReg);


    }
}
