package android.example.whowroteit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.bookInput);
        TextView titleView = findViewById(R.id.titleText);
        TextView authorView = findViewById(R.id.authorText);

    }

    public void searchBooks(View view) {

    }
}