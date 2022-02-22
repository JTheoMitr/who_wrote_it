package android.example.whowroteit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText mBookInput;
    TextView titleView;
    TextView authorView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBookInput = findViewById(R.id.bookInput);
        titleView = findViewById(R.id.titleText);
        authorView = findViewById(R.id.authorText);

    }

    public void searchBooks(View view) {

        String queryString = mBookInput.getText().toString();

    }
}