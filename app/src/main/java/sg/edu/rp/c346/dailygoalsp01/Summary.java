package sg.edu.rp.c346.dailygoalsp01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class Summary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        Intent i = getIntent();

        String[] info = i.getStringArrayExtra("info");

        //Get the textView object
        TextView tv1 = findViewById(R.id.textViewSummary);

        tv1.setText("Read up on materials before class: "+ info[0]
                    + "\n Arrive on time so as not to miss important part of the lesson: "+info[1]+ "\n Attempt the problem myself: "+info[2]+"\n Reflection: "+info[3] );

        Button btnClose = findViewById(R.id.btnClose);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Summary.this,MainActivity.class));
            }
        });

    }
}
