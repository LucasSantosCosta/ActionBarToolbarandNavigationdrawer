package br.com.fiap.actionbartoolbarandnavigationdrawer;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Exemplo");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        return super.onCreateOptionsMenu(menu);
    }
}
