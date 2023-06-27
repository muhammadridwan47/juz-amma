package app.aplikasiuts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
public class MenuPembelajaranActivity extends AppCompatActivity {

    int kondisi = 0;
    ImageButton imagebuttonnext,imagebuttonprev,imagebuttonplay, imgBtnStop;
    ImageView imageviewobjek;
    MediaPlayer mediaplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_pembelajaran);

        imagebuttonnext =findViewById(R.id.imagebuttonnext);
        imagebuttonprev =findViewById(R.id.imagebuttonprev);
        imagebuttonplay =findViewById(R.id.imagebuttonplay);
        imgBtnStop =findViewById(R.id.imgbtn_stop);

        imageviewobjek =findViewById(R.id.imageviewobjek);

        imageviewobjek.setImageResource(R.drawable.ic_alfatihah);


        imagebuttonnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kondisi == 0) {
                    imageviewobjek.setImageResource(R.drawable.ic_alfalaq);
                    kondisi =1;
                    imagebuttonprev.setVisibility(View.VISIBLE);
                }
                else   if (kondisi == 1) {

                    imageviewobjek.setImageResource(R.drawable.ic_alikhlas);
                    kondisi =2;
                }

                else   if (kondisi == 2) {

                    imageviewobjek.setImageResource(R.drawable.ic_allahab);
                    kondisi =3;
                }


                else   if (kondisi == 3) {

                    imageviewobjek.setImageResource(R.drawable.ic_annas);
                    kondisi =4;
                }

                else   if (kondisi == 4) {

                    imageviewobjek.setImageResource(R.drawable.ic_annasr);
                    kondisi =5;
                    imagebuttonnext.setVisibility(View.GONE);
                }


            }
        });


        imagebuttonprev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (kondisi == 1) {

                    imageviewobjek.setImageResource(R.drawable.ic_alfatihah);
                    kondisi = 0;
                    imagebuttonprev.setVisibility(View.GONE);
                }

                else   if (kondisi == 2) {

                    imageviewobjek.setImageResource(R.drawable.ic_alfalaq);
                    kondisi =1;
                }


                else   if (kondisi == 3) {

                    imageviewobjek.setImageResource(R.drawable.ic_alikhlas);
                    kondisi =2;
                }

                else   if (kondisi == 4) {

                    imageviewobjek.setImageResource(R.drawable.ic_allahab);
                    kondisi =3;
                }

                else   if (kondisi == 5) {

                    imageviewobjek.setImageResource(R.drawable.ic_annas);
                    kondisi =4;
                    imagebuttonnext.setVisibility(View.VISIBLE);
                }

            }
        });

        imagebuttonplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaplayer != null ) {
                    mediaplayer.stop();
                }
                if (kondisi == 0) {
                    mediaplayer = MediaPlayer.create(getApplicationContext(), R.raw.al_fatihah);
                    mediaplayer.start();

                }
                else   if (kondisi == 1) {
                    mediaplayer = MediaPlayer.create(getApplicationContext(), R.raw.al_falaq);
                    mediaplayer.start();
                }

                else   if (kondisi == 2) {
                    mediaplayer = MediaPlayer.create(getApplicationContext(), R.raw.al_iklash);
                    mediaplayer.start();
                }


                else   if (kondisi == 3) {
                    mediaplayer = MediaPlayer.create(getApplicationContext(), R.raw.al_lahab);
                    mediaplayer.start();
                }

                else   if (kondisi == 4) {
                    mediaplayer = MediaPlayer.create(getApplicationContext(), R.raw.an_nas);
                    mediaplayer.start();
                }

                else   if (kondisi == 5) {
                    mediaplayer = MediaPlayer.create(getApplicationContext(), R.raw.an_nasr);
                    mediaplayer.start();
                }


            }
        });

        imgBtnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaplayer != null) {
                    mediaplayer.stop();
                }
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaplayer != null) {
            mediaplayer.stop();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mediaplayer != null) {
            mediaplayer.stop();
        }
    }
}