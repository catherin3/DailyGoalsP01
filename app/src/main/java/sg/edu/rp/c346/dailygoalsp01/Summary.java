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

        tv1.setText(info[0]+ ":"+ info[1]
                    + "\n "+info[2]+": " +info[3]
                    +"\n " + info[4] +": " +info[5]
                    +"\n Reflection: "+info[6] );

        Button btnClose = findViewById(R.id.btnClose);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Summary.this,MainActivity.class));
            }
        });

    }
}
