package com.example.androidsimpleform;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputName = (EditText) findViewById(R.id.id_input_name);
        EditText inputEmail = (EditText) findViewById(R.id.id_input_email);
        EditText inputPhone = (EditText) findViewById(R.id.id_input_phone);
        EditText inputPassword = (EditText) findViewById(R.id.id_input_pwd);

        Button btnSave = (Button) findViewById(R.id.id_button_save);
        btnSave.setOnClickListener(new View.OnClickListener());
		@Override
		public void OnClick(view v) {
			//kode untuk aksi dari klik button

			Log.d("--Nama--", inputName.getText().stString());	
			Log.d("--Email--", inputEmail.getText().stString());
			Log.d("--Phone--", inputPhone.getText().stString());
			;Log.d("--Password--", inputPassword.getText().stString())
		}   
    }
}
