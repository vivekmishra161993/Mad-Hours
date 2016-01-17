package com.madhours.activities;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.madhours.R;

/**
 * Created by Home on 26-12-2015.
 */
public class ActivitySignUp extends AppCompatActivity {
    Button btn_login, signup,btn_signup;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_signup);
        btn_login= (Button) findViewById(R.id.login);
        signup = (Button) findViewById(R.id.signup);
        btn_signup= (Button) findViewById(R.id.btn_signup);
        imageView= (ImageView) findViewById(R.id.iv_profile);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivitySignUp.this, ActivityLogin.class);
                startActivity(intent);
                finish();
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, 1);
            }
        });
btn_signup.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(ActivitySignUp.this,ActivityNavigationDrawer.class);
        startActivity(intent);
        finish();
    }
});
        /*signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivitySignUp.this, ActivitySignUp.class);
                startActivity(intent);
            }
        });*/
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1 && resultCode==-1) {
            Bitmap image = (Bitmap) data.getExtras().get("data");
            imageView.setImageBitmap(image);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        }
    }
}
