package mobiletesting.betraditional;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
public class Homepage extends AppCompatActivity {
    Button button2_sbm;
    Button button5_sbm;
    Button button3_sbm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        button2_sbm = (Button)findViewById(R.id.button3);
        button2_sbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent("mobiletesting.betraditional.trendsetter");
                startActivity(intent);
            }


        });
        onClickButtonListener();
        onClickButtonListener2();


    }
    public void onClickButtonListener2()
    {
        button5_sbm = (Button)findViewById(R.id.button2);
        button5_sbm.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent("mobiletesting.betraditional.newarrivals");
                startActivity(intent);
            }
        });
    }


    public void onClickButtonListener()
    {
        button3_sbm = (Button)findViewById(R.id.button4);
        button3_sbm.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent("mobiletesting.betraditional.categories");
                startActivity(intent);
            }
        });
    }

}
