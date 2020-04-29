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
    int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            index = savedInstanceState.getInt("state");
        } else {
            index = 1;
        }


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        TvStory = findViewById(R.id.storyTextView);
        BtnTop = findViewById(R.id.buttonTop);
        BtnBottom = findViewById(R.id.buttonBottom);

        if (index == 1) {
            TvStory.setText(R.string.T1_Story);
            BtnTop.setText(R.string.T1_Ans1);
            BtnBottom.setText(R.string.T1_Ans2);
        } else if (index == 2) {
            TvStory.setText(R.string.T2_Story);
            BtnTop.setText(R.string.T2_Ans1);
            BtnBottom.setText(R.string.T2_Ans2);
        } else if (index == 3) {
            TvStory.setText(R.string.T3_Story);
            BtnTop.setText(R.string.T3_Ans1);
            BtnBottom.setText(R.string.T3_Ans2);
        }



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        BtnTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index ==1){
                    TvStory.setText(R.string.T3_Story);
                    BtnTop.setText(R.string.T3_Ans1);
                    BtnBottom.setText(R.string.T3_Ans2);
                    index = 3;
                }else if(index ==3){
                    TvStory.setText(R.string.T6_End);
                    BtnTop.setVisibility(View.GONE);
                    BtnBottom.setVisibility(View.GONE);
                    index =3;
                }else if (index ==2){
                    TvStory.setText(R.string.T3_Story);
                    BtnTop.setText(R.string.T3_Ans1);
                    BtnBottom.setText(R.string.T3_Ans2);
                    index = 3;
                }

            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        BtnBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index == 1) {
                    TvStory.setText(R.string.T2_Story);
                    BtnTop.setText(R.string.T2_Ans1);
                    BtnBottom.setText(R.string.T2_Ans2);
                    index = 2;
                }else if(index ==2){
                    TvStory.setText(R.string.T4_End);
                    BtnBottom.setVisibility(View.GONE);
                    BtnTop.setVisibility(View.GONE);
                }
                else if (index ==3){
                    TvStory.setText(R.string.T5_End);
                    BtnBottom.setVisibility(View.GONE);
                    BtnTop.setVisibility(View.GONE);
                }




            }
        });

    }

     @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("state", index);

     }

}
