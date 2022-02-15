package ml.lukegotbored.filemanager;

import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class GestoreFile {
    String nomeFile;

    public GestoreFile(){

    }

    public GestoreFile(String nomeFile) {
        this.nomeFile = nomeFile;
    }



    public String readFile(String nf, Context c) {
        StringBuilder sb = new StringBuilder();
        String str = "";
        try {
            BufferedReader bfr = new BufferedReader(new InputStreamReader(c.openFileInput(nf)));
            str = bfr.readLine();

        } catch (FileNotFoundException e) {
            Log.e("Whops!", "File not found!");
        } catch (IOException e) {
            Log.e("Whops!", e.toString());
        }
        return str;
    }


    public void createFile(String fileName){
        String content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyata";

        FileOutputStream fileout=openFileOutput("mytextfile.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriter=new OutputStreamWriter(fileout);
        outputWriter.write(textmsg.getText().toString());
        outputWriter.close();
        //display file saved message
        Toast.makeText(getBaseContext(), "File saved successfully!",
                Toast.LENGTH_SHORT).show();
    }
}
