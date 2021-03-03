package com.example.drawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    ImageView  IvMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IvMenu = findViewById(R.id.IvMenu);

        /*MaterialToolbar toolbar = findViewById(R.id.topAppbar);*/
        DrawerLayout drawerLayout = findViewById(R.id.drawerLayout);
        NavigationView navigationView = findViewById(R.id.navigationView);

        IvMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        /*toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                drawerLayout.openDrawer(GravityCompat.START);
            }
        });*/

        navigationView.setCheckedItem(R.id.Home);


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();
                drawerLayout.closeDrawer(GravityCompat.START);
                switch (id)
                {
                    case R.id.Home:
                        Toast.makeText(MainActivity.this, "Home is Clicked", Toast.LENGTH_SHORT).show();break;
                    case R.id.trash:
                        Toast.makeText(MainActivity.this, "trash is Clicked", Toast.LENGTH_SHORT).show();break;
                    case R.id.share:
                        Toast.makeText(MainActivity.this, "Share is Clicked", Toast.LENGTH_SHORT).show();break;
                    case R.id.settings:
                        Toast.makeText(MainActivity.this, "Settings is Clicked", Toast.LENGTH_SHORT).show();
                        Intent felix = new Intent(MainActivity.this, felix.class);
                        startActivity(felix); break;
                    case R.id.sync:
                        Toast.makeText(MainActivity.this, "Sync is Clicked", Toast.LENGTH_SHORT).show();break;
                    case R.id.rate:
                        Toast.makeText(MainActivity.this, "Rate is Clicked", Toast.LENGTH_SHORT).show();break;
                    case R.id.login:
                        Toast.makeText(MainActivity.this, "Login is Clicked", Toast.LENGTH_SHORT).show();break;
                    case R.id.message:
                        Toast.makeText(MainActivity.this, "Message is Clicked", Toast.LENGTH_SHORT).show();break;
                    default:
                        return true;
                }
                return true;
            }
        });
    }
}