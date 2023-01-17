package com.example.idleheroessummonsimulator;

import codeassets.*;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.idleheroessummonsimulator.databinding.ActivityArtifactBinding;

public class ArtifactActivity extends AppCompatActivity
{
    ArtifactSummon mySum = new ArtifactSummon();
    private ActivityArtifactBinding binding;
    LinearLayout main_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        binding = ActivityArtifactBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        main_layout = findViewById(R.id.linLay);

        binding.artifactP2WButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                main_layout.removeAllViews();
                for (int i = 0; i < getInput(); i++)
                {
                    summonHero(mySum.comebackChest());
                }

            }
        });

        binding.artifactPurpleButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                main_layout.removeAllViews();
                for (int i = 0; i < getInput(); i++)
                {
                    summonHero(mySum.purpleShards());
                }
            }
        });

        binding.artifactGreenSummon.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                main_layout.removeAllViews();
                for (int i = 0; i < getInput(); i++)
                {
                    summonHero(mySum.greenShards());
                }
            }
        });

        binding.artifactRedExButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                main_layout.removeAllViews();
                for (int i = 0; i < getInput(); i++)
                {
                    summonHero(mySum.redExclusiveShards());
                }
            }
        });

        binding.artifactRedButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                main_layout.removeAllViews();
                for (int i = 0; i < getInput(); i++)
                {
                    summonHero(mySum.redShards());
                }
            }
        });

        binding.artifactOrangeExButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                main_layout.removeAllViews();
                for (int i = 0; i < getInput(); i++)
                {
                    summonHero(mySum.orangeExclusiveShards());
                }
            }
        });

        binding.artifactOrangeButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                main_layout.removeAllViews();
                for (int i = 0; i < getInput(); i++)
                {
                    summonHero(mySum.orangeShards());
                }
            }
        });

        binding.artifactBackButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                changePage();
            }
        });
    }

    private void changePage()
    {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    public void addHeroToView(ImageView image, TextView text, int width, int height)
    {
        LinearLayout.LayoutParams imglayoutParams = new LinearLayout.LayoutParams(width, height);
        imglayoutParams.setMargins(25, 10, 25, 10);

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);

        LinearLayout.LayoutParams txtlayoutParams = new LinearLayout.LayoutParams(metrics.widthPixels, height);
        imglayoutParams.setMargins(5, 10, 5, 10);

        image.setLayoutParams(imglayoutParams);
        text.setLayoutParams(txtlayoutParams);

        LinearLayout layout = new LinearLayout(ArtifactActivity.this);
        layout.setOrientation(LinearLayout.HORIZONTAL);

        layout.addView(image);
        layout.addView(text);

        main_layout.addView(layout);
    }

    public void summonHero(String arti)
    {
        String name = "a"+mySum.findIndex(arti);
        int index = getResources().getIdentifier(name, "drawable", getPackageName());

        ImageView image = new ImageView(ArtifactActivity.this);
        image.setImageResource(index);

        TextView text = new TextView(ArtifactActivity.this);
        text.setText(arti);
        text.setTextSize(20);
        text.setGravity(Gravity.CENTER_VERTICAL);

        addHeroToView(image, text, 250, 250);
    }

    public int getInput()
    {
        try
        {
            return Integer.parseInt(binding.artifactDrawNum.getText().toString());
        }
        catch (final NumberFormatException ignored)
        {
            return 1;
        }
    }
}