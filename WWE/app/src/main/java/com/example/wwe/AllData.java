package com.example.wwe;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AllData extends AppCompatActivity {

    private ImageView profile;
    private TextView name;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_all_data);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        profile = findViewById(R.id.profile);
        name = findViewById(R.id.name);

        String playerName = getIntent().getStringExtra("playerName");

        assert playerName != null;
        if (playerName.equals("John Cena")) {
            profile.setImageResource(R.drawable.john);
            name.setText(playerName);
        }
        else if (playerName.equals("Brock Lesner")) {
            profile.setImageResource(R.drawable.brock);
            name.setText(playerName);
        }
        else if (playerName.equals("The Rock")) {
            profile.setImageResource(R.drawable.rock);
            name.setText(playerName);
        }
        else if (playerName.equals("Randy Orton")) {
            profile.setImageResource(R.drawable.randy);
            name.setText(playerName);
        }
        else if (playerName.equals("Roman Reings")) {
            profile.setImageResource(R.drawable.roman);
            name.setText(playerName);
        }
        else if (playerName.equals("Triple H")) {
            profile.setImageResource(R.drawable.h);
            name.setText(playerName);
        }
        else if (playerName.equals("Kane")) {
            profile.setImageResource(R.drawable.kane);
            name.setText(playerName);
        }
        else if (playerName.equals("Undertaker")) {
            profile.setImageResource(R.drawable.taker);
            name.setText(playerName);
        }
        else if (playerName.equals("Stone Cold")) {
            profile.setImageResource(R.drawable.stone);
            name.setText(playerName);
        }
        else if (playerName.equals("Bret Hart")) {
            profile.setImageResource(R.drawable.bret);
            name.setText(playerName);
        }
    }
}