package mcm.edu.ph.takumicorporations_narrative;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Activity3 extends AppCompatActivity implements View.OnClickListener {

    TextView textView3;
    Button txtDecision1, txtDecision2;
    int condition = 0;
    int condition1, condition2;
    String conditionsMain = "You grab some money and head out to the Convenience store \n \nYou went in and cannot decide what to eat. Do you wanna eat riceballs?";
    String txtLore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        TextView textView3 = findViewById(R.id.textView3);


        txtDecision1 = findViewById(R.id.txtDecision1);
        txtDecision2 = findViewById(R.id.txtDecision2);

        txtDecision1.setOnClickListener(this);
        txtDecision2.setOnClickListener(this);

        textView3.setText(conditionsMain);
    }

    @Override
    public void onClick(View view) {
        textView3 = findViewById(R.id.textView3);

        switch (view.getId()) {
            case R.id.txtDecision1:
                if (condition > 0 && condition1 > 0) {
                    condition2 = 1;
                    txtDecision1.setEnabled(false);
                    txtDecision2.setEnabled(false);
                    break;
                }
                if (condition > 0) {
                    condition1 = 1;
                    break;
                }
                if (condition == 0) {
                    condition = 1;
                }
                break;

            case R.id.txtDecision2:
                if (condition > 0 && condition1 > 0) {
                    condition2 = 2;
                    txtDecision1.setEnabled(false);
                    txtDecision2.setEnabled(false);
                    break;
                }
                if (condition > 0) {
                    condition1 = 2;
                    break;
                }
                if (condition == 0) {
                    condition = 2;
                }
                break;
        }
        if (condition == 1) {
            txtLore = "You happily bought 5 riceballs and a juice, do you wanna eat it here?";
            if (condition1 == 1) {
                txtLore = "You ate it here peacefully and got full, so you went back home to sleep. Do you wanna go to sleep?";
                if (condition2 == 1) {
                    txtLore = "You went to sleep and woke up at 12:00pm in the afternoon and ate lunch, turned on your computer and play until 10:00pm \n \nThats the daily life of a NEET, Thank you for playing and have a good day!";
                } else if (condition2 == 2) {
                    txtLore = "You played til 2am and went to sleep after. You woke up at 12:00pm in the afternoon and ate lunch, turned on your computer and play until 10:00pm \n \nThats the daily life of a NEET, Thank you for playing and have a good day!";
                }
            } else if (condition1 == 2) {
                txtLore = "You went back home and turned on your computer and eat it while watching some youtube videos. after you finished watching, do you want to go to sleep?";
                if (condition2 == 1) {
                    txtLore = "You went to sleep and woke up at 12:00pm in the afternoon and ate lunch, turned on your computer and play until 10:00pm \n \nThats the daily life of a NEET, Thank you for playing and have a good day!";

                } else if (condition2 == 2) {
                    txtLore = "You played til 2am and went to sleep after. You woke up at 12:00pm in the afternoon and ate lunch, turned on your computer and play until 10:00pm \n \nThats the daily life of a NEET, Thank you for playing and have a good day!";
                }
            }
        } else if (condition == 2) {
            txtLore = "You bought some chips and soda. Do you wanna eat it here?";
            if (condition1 == 1) {
                txtLore = "You ate it here peacefully and got full so you went back home to sleep. Do you want to go to sleep?";
                if (condition2 == 1) {
                    txtLore = "You went to sleep and woke up at 12:00pm in the afternoon and ate lunch, turned on your computer and play until 10:00pm \n \nThats the daily life of a NEET, Thank you for playing and have a good day!";

                } else if (condition2 == 2) {
                    txtLore = "You played til 2am and went to sleep after. You woke up at 12:00pm in the afternoon and ate lunch, turned on your computer and play until 10:00pm \n \nThats the daily life of a NEET, Thank you for playing and have a good day!";
                }
            } else if (condition1 == 2) {
                txtLore = "you went back home and turned on your computer and eat it while watching some youtube videos. after you finished watching, do you want to go to sleep?";
                if (condition2 == 1) {
                    txtLore = "You went to sleep and woke up at 12:00pm in the afternoon and ate lunch, turned on your computer and play until 10:00pm \n \nThats the daily life of a NEET, Thank you for playing and have a good day!";

                } else if (condition2 == 2) {
                    txtLore = "You played til 2am and went to sleep after. You woke up at 12:00pm in the afternoon and ate lunch, turned on your computer and play until 10:00pm \n \nThats the daily life of a NEET, Thank you for playing and have a good day";
                }
            }
        }
        textView3.setText(txtLore);
    }
}





