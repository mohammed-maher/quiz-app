package com.re_coded.example.android.simplequiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkAnswers(View view){
        EditText firstQuestion=(EditText)findViewById(R.id.first_question_edit_text);

        if (firstQuestion.getText().toString().toLowerCase().replaceAll("\\s+","").toString().equals("jimmycarter")){
            score++;
        }

        RadioGroup secondQuestion = (RadioGroup) findViewById(R.id.question_2_radio_group);
        if(secondQuestion.getCheckedRadioButtonId()==R.id.question_2_a){
            score++;
        }

        CheckBox questionThreeA=(CheckBox)findViewById(R.id.question_3_a);
        CheckBox questionThreeB=(CheckBox)findViewById(R.id.question_3_b);
        CheckBox questionThreeC=(CheckBox)findViewById(R.id.question_3_c);
        CheckBox questionThreeD=(CheckBox)findViewById(R.id.question_3_d);

        if(questionThreeA.isChecked()==false && questionThreeB.isChecked()==true && questionThreeC.isChecked()==true && questionThreeD.isChecked()==false){
            score++;
        }

        EditText fourthQuestion=(EditText)findViewById(R.id.fourth_question_edit_text);
        if (fourthQuestion.getText().toString().toLowerCase().replaceAll("\\s+","").toString().equals("ottawa")){
            score++;
        }

        if(score==4) {
            Toast.makeText(getApplicationContext(), "Great job! You answered all the question currectly", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getApplicationContext(), "You answered +" +score+" correctly", Toast.LENGTH_LONG).show();
        }

        score=0;
    }

}
