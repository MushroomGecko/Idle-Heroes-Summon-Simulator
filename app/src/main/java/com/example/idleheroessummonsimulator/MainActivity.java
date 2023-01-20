package com.example.idleheroessummonsimulator;

import java.util.ArrayList;
import java.util.Collections;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import com.example.idleheroessummonsimulator.databinding.ActivityMainBinding;

import codeassets.HeroSummon;

public class MainActivity extends AppCompatActivity
{
    private ActivityMainBinding binding;
    public static ArrayList<String> name_bag = new ArrayList();
    public static ArrayList<Integer> draw_bag = new ArrayList();

    static HeroSummon mySum = new HeroSummon();
    public static ArrayList<Integer> overview = new ArrayList(Collections.nCopies(mySum.getTotalSize(), 0));


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.summonButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                changePage(SummonActivity.class);
            }
        });

        binding.awakeningButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                changePage(AwakeningActivity.class);
            }
        });

        binding.skinButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                changePage(SkinActivity.class);
            }
        });

        binding.artifactButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                changePage(ArtifactActivity.class);
            }
        });

        binding.bagButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                changePage(BagActivity.class);
            }
        });

        binding.aboutButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String androidVersion = "1.30.27";
                String iosVersion = "1.38.11";
                alert(
                        "App version: " + BuildConfig.VERSION_NAME + "\n\n" +
                        "Idle Heroes Summon Simulator is an app that allows you to simulate various things from the game " +
                        "Idle Heroes so that you can make informed decisions on what you should do in the game and how you should spend your resources. " +
                        "Summon rates are identical to how they are found in Idle Heroes in their respective areas of the game.\n\n" +
                        "All hero and item portraits, hero skins, and other game assets used in this project rightfully belong to DH Games and Idle Heroes. " +
                        "All hero, item, skin, mode and other asset names originate from Idle Heroes.\n" +
                        "The summon menu background rightfully belongs to DH Games and Idle Heroes. \n" +
                        "The main menu background image rightfully belongs to AnuPatten on DeviantArt.\n\n" +
                        "This project is completely free and open source under the GNU General Public License v3.0 and can be found on \n" +
                        "https://github.com/MushroomGecko/Idle-Heroes-Summon-Simulator\n\n" +
                        "This project is currently up to date with Idle Heroes versions\n" +
                        "Android:\t" + androidVersion + "\n" +
                        "iOS:\t" + iosVersion
                );
            }
        });
    }

    private void changePage(Class c)
    {
        Intent intent = new Intent(this, c);
        startActivity(intent);
    }

    private void alert(String message)
    {
        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle("About");
        alertDialog.setMessage(message);
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK", (dialog, which) -> dialog.dismiss());
        alertDialog.show();
    }
}