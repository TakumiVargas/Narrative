package mcm.edu.ph.takumicorporations_narrative;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        TextView txtLore = findViewById(R.id.txtLore);
        Button txtNext2 = findViewById(R.id.txtNext2);
        txtNext2.setOnClickListener(this);

        txtLore.setText("You woke up in the middle of the night and felt hungry. You decided to go to the nearest Convenience Store.");
    }

    @Override
    public void onClick(View view) {


        TextView txtLore = findViewById(R.id.txtLore);

        Intent i = new Intent(Activity2.this,Activity3.class);

        startActivity(i);
    }
}

