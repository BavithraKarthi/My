package com.example.admin.bank;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner banks=(Spinner)findViewById(R.id.banks);
        ArrayAdapter<CharSequence> adptr=ArrayAdapter.createFromResource(this,R.array.Bank_names,android.R.layout.simple_spinner_item);
        banks.setAdapter(adptr);

        EditText name=(EditText)findViewById(R.id.name1);
        EditText dob=(EditText)findViewById(R.id.dob1);
        EditText fname=(EditText)findViewById(R.id.fn);

        Button submit=(Button)findViewById(R.id.submit);

        private RadioGroup radioGrp;
        private RadioButton radioBtn;

        int selected=radioGrp.getCheckedRadioButtonId();
        radioBtn=(RadioButton)findViewById(selected);

        String nam=name.getText().toString();
        String birth=dob.getText().toString();
        String dn=fname.getText().toString();

    }
}
