package com.example.convert;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void convert(View view){
        EditText inp=findViewById(R.id.input);
        Editable num= inp.getText();
        String s=num.toString();
        double number=Integer.parseInt(s);
        RadioGroup group=(RadioGroup) findViewById(R.id.radioGroup);
        int idRadioButtonCheked=group.getCheckedRadioButtonId();
        RadioButton selectedRadioButton=(RadioButton)findViewById(idRadioButtonCheked);
        String radioButtonText= selectedRadioButton.getText().toString();
        TextView viewTEXT=(TextView)findViewById(R.id.textView);
       // Log.d("info","it's here");
        if (radioButtonText.equals("Euro to Dinar")){
            number=((double)number/3);
            //String val=numbe
          // Log.d("info","it's here2");
            viewTEXT.setText(String.valueOf(number));

        }
        if (radioButtonText.equals("Dinar to Euro")){
            double newNumber=(double)number*3.4;
            viewTEXT.setText(String.valueOf(newNumber));
        }else{
            Toast.makeText(getApplicationContext(),"Please check a type",Toast.LENGTH_LONG).show();
        }
    }
}