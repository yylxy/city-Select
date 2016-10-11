package lyxs916.cityselect;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import lyxs916.citylibrary.CitySelectActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "打开城市选择吗？", Snackbar.LENGTH_SHORT).setAction("是", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        CitySelectActivity.startUi(MainActivity.this);
                    }
                }).setActionTextColor(0xff00ffff).setDuration(1000).show();
            }
        });
    }


}
