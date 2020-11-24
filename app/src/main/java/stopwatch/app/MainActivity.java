package stopwatch.app;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;

public class MainActivity extends Activity {

    private int sekunde = 0;
    private boolean jeliUkljuceno;
    private boolean jeliBiloUkljuceno;

    Button gumbStart,gumbStop,gumbResetiraj;
    TextView mjestoBrojanja;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gumbStart = findViewById(R.id.gumbStart);
        gumbStop = findViewById(R.id.gumbStop);
        gumbResetiraj = findViewById(R.id.gumbResetiraj);
        mjestoBrojanja = findViewById(R.id.mjestoBrojanja);

        if (savedInstanceState != null){
            sekunde = savedInstanceState.getInt("sekunde");
            jeliUkljuceno = savedInstanceState.getBoolean("ukljuceno");
            jeliBiloUkljuceno = savedInstanceState.getBoolean("biloUkljuceno");
        }

    }
    
    public void startBrojanje(View view){
        jeliUkljuceno = true;
    }

    public void stopBrojanje(View view){
        jeliUkljuceno = false;
    }

    public void resetirajBrojanje(View view){
        jeliUkljuceno = false;
        sekunde = 0;
    }

}