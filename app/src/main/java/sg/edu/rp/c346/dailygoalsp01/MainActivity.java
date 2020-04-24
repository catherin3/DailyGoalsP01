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
import android.widget.TextView;

import org.w3c.dom.Text;

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
                TextView tv1 = (TextView) findViewById(R.id.textViewReadUp);
                TextView tv2 = (TextView) findViewById(R.id.textViewArrive);
                TextView tv3 = (TextView) findViewById(R.id.textViewAttempt);

               String[] info = {tv1.getText().toString(),(String) rb.getText(),tv2.getText().toString() ,
                               (String) rb2.getText(),tv3.getText().toString(),(String) rb3.getText(),etReflect.getText().toString()};

                Intent i = new Intent(MainActivity.this, Summary.class);

                // Pass the String array holding the name & age to new activity
                i.putExtra("info", info);

                // Start the new activity
                startActivity(i);

            }
        });
        }
    }

