package app.aplikasiuts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
public class MenuUtamaActivity extends AppCompatActivity {
    ImageButton button1,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        button1 =findViewById(R.id.button1);
        button2 =findViewById(R.id.button2);
        button3 =findViewById(R.id.button3);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MenuUtamaActivity.this, MenuPembelajaranActivity.class);

                startActivity(intent);


            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MenuUtamaActivity.this, MenuInfoActivity.class);

                startActivity(intent);


            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MenuUtamaActivity.this, MenuPengaturanActivity.class);

                startActivity(intent);

            }
        });
    }
}