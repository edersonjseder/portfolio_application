package application.register.com.portfolio_appication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainScreenActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
    }

    public void selectFirstApp(View view){
        Toast.makeText(getApplicationContext(), R.string.message_popular_movies, Toast.LENGTH_SHORT).show();
    }

    public void selectSecondApp(View view){
        Toast.makeText(getApplicationContext(), R.string.message_stock_hawk, Toast.LENGTH_SHORT).show();
    }

    public void selectThirdApp(View view){
        Toast.makeText(getApplicationContext(), R.string.message_build_it_bigger, Toast.LENGTH_SHORT).show();
    }

    public void selectFourthApp(View view){
        Toast.makeText(getApplicationContext(), R.string.message_make_your_app_material, Toast.LENGTH_SHORT).show();
    }

    public void selectFifthApp(View view){
        Toast.makeText(getApplicationContext(), R.string.message_go_ubiquitous, Toast.LENGTH_SHORT).show();
    }

    public void selectSixthApp(View view){
        Toast.makeText(getApplicationContext(), R.string.message_capstone, Toast.LENGTH_SHORT).show();
    }
}
