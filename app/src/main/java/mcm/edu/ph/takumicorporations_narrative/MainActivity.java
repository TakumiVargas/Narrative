package mcm.edu.ph.takumicorporations_narrative;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNext =findViewById(R.id.btnNext);

        btnNext.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {

        TextView textView = findViewById(R.id.textView);

        Intent i = new Intent(MainActivity.this,Activity2.class);

        startActivity(i);


    }
}