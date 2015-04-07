package com.versprite.crackme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.net.Uri;
import android.widget.EditText;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Toast;
import com.versprite.crackme.emulator.Detect;



public class KeyActivity extends Activity {

    private EditText key;
    private Button submitbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_key);

        Detect detect = new Detect();

        if(detect.detectEmulator().equals(Boolean.TRUE)){
            Log.d("Emulator Detected!", "Uninstalling ...");
            Intent intent = new Intent(Intent.ACTION_UNINSTALL_PACKAGE);
            intent.setData(Uri.parse("package:com.versprite.crackme"));
            startActivity(intent);
            KeyActivity.this.finish();
        }

        addListenerOnButton();

    }

    public void addListenerOnButton() {

        key = (EditText) findViewById(R.id.txtKey);
        submitbtn = (Button) findViewById(R.id.button_submit);
        submitbtn.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {

                // Wrap this
                String result = String.valueOf(key.getText());
                Intent intent = new Intent();
                intent.setAction("com.versprite.crackme.GENERATE");
                intent.putExtra("key", result);
                sendBroadcast(intent);
                Toast.makeText(getApplicationContext(), "Checking Key ...", Toast.LENGTH_SHORT).show();

            }
        });
    }

}
