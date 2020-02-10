package com.togettech.kmerdelices.ui.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.login.LoginManager;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.togettech.kmerdelices.R;
import com.togettech.kmerdelices.login.LoginActivity;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfilActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;

    CircleImageView image_profile;
    TextView username;

    ImageView logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mAuth = FirebaseAuth.getInstance();

        username = findViewById(R.id.username);
        image_profile = findViewById(R.id.image_profile);

        //Se deconnecter
        logout = findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signOut();
                LoginManager.getInstance().logOut();

                updateUI();
            }
        });



    }

    @Override
    public void onStart() {
        super.onStart();
        FirebaseUser currentUser = mAuth.getCurrentUser();

        if (currentUser != null){
            username.setText(currentUser.getDisplayName());
            image_profile.setImageURI(currentUser.getPhotoUrl());

        } else {
            updateUI();
        }

    }

    private void updateUI() {
        Toast.makeText(ProfilActivity.this, "Vous êtes déconnecté", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(ProfilActivity.this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
