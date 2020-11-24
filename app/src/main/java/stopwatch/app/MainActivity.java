package stopwatch.app;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class MainActivity extends Activity {

    private int sekunde = 0;
    private boolean isRunning;
    private boolean wasRunning;

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
            isRunning = savedInstanceState.getBoolean("ukljuceno");
            wasRunning = savedInstanceState.getBoolean("biloUkljuceno");
        }
        runningTimer();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    protected void onPause() {
        super.onPause();
        wasRunning = isRunning;
        isRunning = false;

    }

    @Override
    protected void onResume() {
        super.onResume();
        if (wasRunning){
            isRunning = true;
        }
    }

    public void startBrojanje(View view){
        isRunning = true;
    }

    public void stopBrojanje(View view){
        isRunning = false;
    }

    public void resetirajBrojanje(View view){
        isRunning = false;
        sekunde = 0;
    }

    private void runningTimer(){



    }

}