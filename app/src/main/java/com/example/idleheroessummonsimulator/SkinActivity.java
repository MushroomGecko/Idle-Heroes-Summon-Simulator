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

import com.example.idleheroessummonsimulator.databinding.ActivitySkinBinding;

public class SkinActivity extends AppCompatActivity
{
    SkinSummon mySum = new SkinSummon();
    private ActivitySkinBinding binding;
    LinearLayout main_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        binding = ActivitySkinBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        main_layout = findViewById(R.id.linLay);

        binding.skinSummonButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                main_layout.removeAllViews();
                for (int i = 0; i < getInput(); i++)
                {
                    summonHero(mySum.pullSkin());
                }

            }
        });

        binding.skinBackButton.setOnClickListener(new View.OnClickListener()
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

        LinearLayout layout = new LinearLayout(SkinActivity.this);
        layout.setOrientation(LinearLayout.HORIZONTAL);

        layout.addView(image);
        layout.addView(text);

        main_layout.addView(layout);
    }

    public void summonHero(String skin)
    {
        String name = "s"+mySum.findIndex(skin);
        int index = getResources().getIdentifier(name, "drawable", getPackageName());

        ImageView image = new ImageView(SkinActivity.this);
        image.setImageResource(index);

        TextView text = new TextView(SkinActivity.this);
        text.setText(skin);
        text.setTextSize(16);
        text.setGravity(Gravity.CENTER_VERTICAL);

        addHeroToView(image, text, 250, 250);
    }

    public int getInput()
    {
        try
        {
            return Integer.parseInt(binding.skinDrawNum.getText().toString());
        }
        catch (final NumberFormatException ignored)
        {
            return 1;
        }
    }
}