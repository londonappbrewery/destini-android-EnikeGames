package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView TvStory;
    Button BtnTop;
    Button BtnBottom;
    int index = 1;

    Story[] story = new Story[]  {new Story(R.string.T1_Story,R.string.T1_Ans1,R.string.T1_Ans2),
                                   new Story(R.string.T2_Story,R.string.T2_Ans1,R.string.T2_Ans2),
                                  new Story(R.string.T3_Story,R.string.T3_Ans1,R.string.T3_Ans2)};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        TvStory = findViewById(R.id.storyTextView);
        BtnTop = findViewById(R.id.buttonTop);
        BtnBottom = findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        BtnTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index == 1) {
                    int question = story[3].getStory();
                    int ans1 = story[3].getAnswer1();
                    int ans2 = story[3].getAnswer2();
                    TvStory.setText(question);
                    BtnTop.setText(ans1);
                    BtnBottom.setText(ans2);
                    index = 4;
                }
                else if (index ==4){
                    TvStory.setText(R.string.T6_End);
                }

            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        BtnBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index = 1;
                int question = story[1].getStory();
                int ans1 = story[1].getAnswer1();
                int ans2 = story[1].getAnswer2();
                TvStory.setText(question);
                BtnTop.setText(ans1);
                BtnBottom.setText(ans2);


            }
        });

    }

    public void Update (int index){

    }


}
