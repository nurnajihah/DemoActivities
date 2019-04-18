package sg.edu.rp.c346.demoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etName;
    EditText etAge;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.editText);
        etAge = findViewById(R.id.editText2);

        btn = findViewById(R.id.btnDone);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] info = {etName.getText().toString(), etAge.getText().toString()};

                Intent i = new Intent(MainActivity.this, DemoActivities.class);

                i.putExtra("info", info);

                startActivity(i);
            }
        });
    }
}
