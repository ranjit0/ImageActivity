package com.ranjit.imageactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RadioButton rdoApple, rdoMango, rdoGrapes;
    private ImageView ivPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdoApple = findViewById(R.id.rdoApple);
        rdoMango = findViewById(R.id.rdoMango);
        rdoGrapes = findViewById(R.id.rdoGrapes);

        ivPhoto = findViewById(R.id.ivphoto);

        rdoGrapes.setOnClickListener(this);
        rdoMango.setOnClickListener(this);
        rdoApple.setOnClickListener(this);
    }
        @Override
        public void onClick (View v){

            switch(v.getId())
            {
                case R.id.rdoApple:
                    ivPhoto.setImageResource(R.drawable.apple);
                    break;

                case R.id.rdoGrapes:
                    ivPhoto.setImageResource((R.drawable.grapes));
                    break;

                case R.id.rdoMango:
                    ivPhoto.setImageResource(R.drawable.mango);
                    break;
            }

        }
    }
