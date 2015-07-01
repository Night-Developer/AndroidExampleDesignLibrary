package org.shadow.androidlibdesingproject;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity implements DrawerLayout.DrawerListener
        , NavigationView.OnNavigationItemSelectedListener{

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private Toolbar toolbar;

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

        this.setupToolbar();

        this.setupDrawerMenu();
    }

    private void setupToolbar(){
       this.toolbar = (Toolbar) findViewById(R.id.main_toolbar);

        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar == null) return;
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);
    }

    private void setupDrawerMenu(){

        this.drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        this.navigationView = (NavigationView)findViewById(R.id.navigation_view);

        ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout,toolbar,  R.string.drawer_open_string, R.string.drawer_close_string) {

            /** Called when a drawer has settled in a completely closed state. */
            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
            }

            /** Called when a drawer has settled in a completely open state. */
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }
        };

        this.drawerLayout.setDrawerListener(mDrawerToggle);
        mDrawerToggle.syncState();
        this.drawerLayout.setDrawerListener(this);

        this.navigationView.setNavigationItemSelectedListener(this);
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

    @Override
    public void onDrawerSlide(View drawerView, float slideOffset) {

    }

    @Override
    public void onDrawerOpened(View drawerView) {

    }

    @Override
    public void onDrawerClosed(View drawerView) {

    }

    @Override
    public void onDrawerStateChanged(int newState) {

    }

    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {

        switch(menuItem.getItemId()){
            default:
                //action
        }

        menuItem.setChecked(true);

        return false;
    }
}
