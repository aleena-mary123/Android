package com.example.commsms;
import android.app.Activity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    EditText e1,e2;
    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.ed1);
        e2=(EditText)findViewById(R.id.ed2);
    }
    public void onsend(View v){
        String phoneNumber = e1.getText().toString();
        SmsManager sms = SmsManager.getDefault();
        /* Reading the text from the textbox */
        String msg =e2.getText().toString();
        /* Sending the sms */
        sms.sendTextMessage(phoneNumber, null, msg, null, null);
    }
}