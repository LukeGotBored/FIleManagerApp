package ml.lukegotbored.filemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.FileNotFoundException;

public class MainActivity extends AppCompatActivity {

    Button btnLeggi;
    Button btnScrivi;
    TextView txtContenuto;
    GestoreFile gf;
    Context c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLeggi = findViewById(R.id.btnLeggi);
        btnScrivi = findViewById(R.id.btnScrivi);
        txtContenuto = findViewById(R.id.txtContent);

        gf = new GestoreFile();


        btnLeggi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    String text = gf.readFile("textFile.txt", getApplicationContext());
                    txtContenuto.setText(text);
                }
            });

    }

}