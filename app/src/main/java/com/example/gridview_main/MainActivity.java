package com.example.gridview_main;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;


import fr.albumfr;
import fr.imagefr;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        BottomNavigationView navigationView =findViewById(R.id.nav_view);

        openFragment(imagefr.newInstance("",""));

        navigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.all_image:
                        openFragment(imagefr.newInstance("1","2"));
                        return;
                    case R.id.album:
                        openFragment(albumfr.newInstance("1","2"));
                        return ;



                }
                return;
            }

        });

    }






    public void openFragment(Fragment fragment){
        FragmentTransaction transaction= getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.flmain, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }}