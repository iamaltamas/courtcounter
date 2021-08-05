package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 int TeamScroeA = 0;
 int TeamScroeB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Team A Activity code
    public void ScroeThreeadd(View v){
        TeamScroeA  =  TeamScroeA+3;
        DisplayScroeA(TeamScroeA);
    }
    public void ScroeTwoadd(View v){
        TeamScroeA = TeamScroeA + 2;
        DisplayScroeA(TeamScroeA);
    }
    public void ScroeOneadd(View v){
        TeamScroeA = TeamScroeA + 1;
        DisplayScroeA(TeamScroeA);
    }

    private void DisplayScroeA(int score){
        TextView ScroeTeamA = (TextView)findViewById(R.id.Team_a_score);
        ScroeTeamA.setText(String.valueOf(score));
    }

    //Team B Activity code
    public void Scroe_Three_team_b(View v){
        TeamScroeB = TeamScroeB + 3;
        DisplayScroeB(TeamScroeB);
    }
    public void Scroe_Two_team_b(View v){
        TeamScroeB = TeamScroeB + 2;
        DisplayScroeB(TeamScroeB);
    }

    public void Scroe_One_team_b(View v){
        TeamScroeB = TeamScroeB + 1;
        DisplayScroeB(TeamScroeB);
    }
     private void DisplayScroeB(int scroe){
        TextView ScroeTeamB = (TextView)findViewById(R.id.Team_b_score);
        ScroeTeamB.setText(String.valueOf(scroe));
     }
        public void Score_restore(View v){
        TeamScroeA = 0;
        TeamScroeB = 0;
        DisplayRestor (TeamScroeA);
        DisplayRestor (TeamScroeB);
        }

    private void DisplayRestor(int scroe){
        TextView ScroeTeamB = (TextView)findViewById(R.id.Team_b_score);
        ScroeTeamB.setText(String.valueOf(scroe));
        TextView ScroeTeamA = (TextView)findViewById(R.id.Team_a_score);
        ScroeTeamA.setText(String.valueOf(scroe));
    }

}








