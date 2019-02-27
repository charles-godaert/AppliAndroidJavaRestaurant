package iut.g17002638.tp1;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button button = (Button) findViewById(R.id.button_id);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView maCategorie = findViewById(R.id.nomSandwich);
                final TextView monMessage = findViewById(R.id.recetteSandwich);

                if(maCategorie.getText().equals("Kebab"))
                    monMessage.setText("Salade tomate oignon");
                else if(maCategorie.getText().equals("CBO"))
                    monMessage.setText("Huummmmm du bon vomito");
                else
                    monMessage.setText("Swipe dans les autres catégories !");
            }
        });

        mTextMessage = (TextView) findViewById(R.id.nomSandwich);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.enBas);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }



}
