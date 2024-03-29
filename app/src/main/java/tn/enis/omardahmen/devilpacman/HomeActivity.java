package tn.enis.omardahmen.devilpacman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void showPlay(View v){
        Intent i = new Intent(HomeActivity.this,PlayActivity.class) ;
        startActivity(i);
    }
    public void showSettings(View v){
        Intent i = new Intent(HomeActivity.this,SettingsActivity.class) ;
        startActivity(i);
    }
    public void showHighScore(View v){
        Intent i = new Intent(HomeActivity.this,HighScoreActivity.class) ;
        startActivity(i);
    }
    public void showHelp(View v){
        Intent i = new Intent(HomeActivity.this,HelpActivity.class) ;
        startActivity(i);
    }
    public void showAbout(View v){
        Intent i = new Intent(HomeActivity.this,AboutActivity.class) ;
        startActivity(i);
    }
    public void quit(View v){
        this.finishAffinity();
    }
}
