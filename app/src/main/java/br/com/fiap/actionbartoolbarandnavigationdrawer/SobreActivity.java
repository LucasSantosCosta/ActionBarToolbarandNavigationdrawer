package br.com.fiap.actionbartoolbarandnavigationdrawer;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class SobreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);

        ActionBar actionBar = getSupportActionBar();

        //Ativa a setinha para voltar para a tela anterior

        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        //Verifica se foi o botão de voltar da ActionBar

        if (item.getItemId() == android.R.id.home);
        finish();

        return super.onOptionsItemSelected(item);
    }
}


