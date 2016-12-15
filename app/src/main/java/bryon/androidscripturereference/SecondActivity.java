package bryon.androidscripturereference;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


// Receives book, chapter, and verse from fisrt activity
// Displays this info
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String s = getIntent().getStringExtra("Reference");
        TextView displayRef = (TextView) findViewById(R.id.DisplayRef);
        Intent myIntent = getIntent(); // gets the previously created intent
        displayRef.setText(myIntent.getStringExtra("Reference"));
    }
}