package mcm.edu.ph.takumicorporations_narrative;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        TextView txtStory = findViewById(R.id.txtStory);
        Button txtNext = findViewById(R.id.txtNext);
        txtNext.setOnClickListener(this);

        txtStory.setText("You safely arrived at your home and turned on your computer to watch some youtube videos while eating your food");
    }
    @Override
    public void onClick(View view){

    }
}