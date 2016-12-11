package tn.enis.omardahmen.devilpacman;

import android.os.Bundle;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;

public class PlayActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        FragmentManager fragmentManager = getFragmentManager();
        Fragment fragment = new SketchActivity();
        fragmentManager.beginTransaction()
                .replace(R.id.container, fragment)
                .commit();
    }
}

