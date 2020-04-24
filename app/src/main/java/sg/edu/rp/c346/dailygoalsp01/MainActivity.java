package sg.edu.rp.c346.dailygoalsp01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOk = (Button) findViewById(R.id.buttonOk);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RadioGroup rg1 = (RadioGroup) findViewById(R.id.radioGroup1);
                RadioGroup rg2 = (RadioGroup) findViewById(R.id.radioGroup2);
                RadioGroup rg3 = (RadioGroup) findViewById(R.id.radioGroup3);

                int selectButtonId = rg1.getCheckedRadioButtonId();
                int selectButtonId2 = rg2.getCheckedRadioButtonId();
                int selectButtonId3 = rg3.getCheckedRadioButtonId();

                RadioButton rb = (RadioButton) findViewById(selectButtonId);
                RadioButton rb2 = (RadioButton) findViewById(selectButtonId2);
                RadioButton rb3 = (RadioButton) findViewById(selectButtonId3);

                EditText etReflect = (EditText) findViewById(R.id.editTextReflection);

                
               String[] info = {(String) rb.getText(), (String) rb2.getText(),(String) rb2.getText(),etReflect.getText().toString()};

                Intent i = new Intent(MainActivity.this, Summary.class);

                // Pass the String array holding the name & age to new activity
                i.putExtra("info", info);

                // Start the new activity
                startActivity(i);

            }
        });
        }
    }

