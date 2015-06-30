package org.shadow.androidlibdesingproject;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FloatingActionButton button = (FloatingActionButton)findViewById(R.id.floating_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //here
            }
        });
    }

    public void Scroll_toolbar(View btn){
        startActivity(new Intent(this, HideToolbar.class));
    }

    public void collapsing_toolbar(View btn){
        startActivity(new Intent(this,CollapsingToolbar.class));
    }

    public void mostrar(View btn){
        Snackbar snack = Snackbar.make(this.findViewById(android.R.id.content), "Mensaje", Snackbar.LENGTH_LONG)
                .setAction("Click", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //do some awesome stuff
                    }
                });

        snack.getView().setBackgroundColor(Color.CYAN);

        snack.show();
    }
}
