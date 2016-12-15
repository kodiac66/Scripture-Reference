package bryon.androidscripturereference;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    private EditText book;
    private EditText chapter;
    private EditText verse;
    private String reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create Text boxes
        book = (EditText) findViewById(R.id.Book);
        chapter = (EditText) findViewById(R.id.Chapter);
        verse = (EditText) findViewById(R.id.Verse);

        // add share button to go to second activity
        Button share = (Button) findViewById(R.id.Share);

        // Use listener to change activity
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Put the reference together
                reference = String.valueOf(book.getText()) + " "
                        + String.valueOf(chapter.getText()) + ":"
                        + String.valueOf(verse.getText());

                Intent i = new Intent(getApplicationContext(), SecondActivity.class);
                i.putExtra("Reference", reference);
                startActivity(i);
            }
        });


    }
}