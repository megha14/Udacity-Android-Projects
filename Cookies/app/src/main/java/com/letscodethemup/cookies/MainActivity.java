package com.letscodethemup.cookies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView hungryFull;
    private ImageView cookieImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hungryFull = (TextView)findViewById(R.id.hungryFull);
        cookieImage = (ImageView)findViewById(R.id.cookieImage);
    }

    public void setHungryFull(String Text){
        hungryFull.setText(Text);
    }

    public void setCookieImage(){
        cookieImage.setImageResource(R.drawable.after_cookie);
    }

    public void eatCookie(View view){
        setHungryFull("I'm so full");
        setCookieImage();
    }
}
