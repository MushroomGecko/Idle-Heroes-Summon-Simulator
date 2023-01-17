package com.example.idleheroessummonsimulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.idleheroessummonsimulator.databinding.ActivityBagBinding;

import java.util.Arrays;

import codeassets.AwakenHero;
import codeassets.HeroSummon;

public class BagActivity extends AppCompatActivity {

    private ActivityBagBinding binding;
    LinearLayout main_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBagBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        main_layout = findViewById(R.id.linLay);

        standardView();

        binding.bagExtendedViewButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                main_layout.removeAllViews();
                extendedView();
            }
        });

        binding.bagStandardViewButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                main_layout.removeAllViews();
                standardView();
            }
        });

        binding.bagBackButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                changePage();
            }
        });

        binding.bagClearButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                MainActivity.name_bag.clear();
                MainActivity.draw_bag.clear();
                main_layout.removeAllViews();
            }
        });

    }

    private void extendedView()
    {
        for(int i = 0; i < MainActivity.name_bag.size(); i++)
        {
            ImageView image = new ImageView(BagActivity.this);
            image.setImageResource(MainActivity.draw_bag.get(i).intValue());

            TextView text = new TextView(BagActivity.this);
            text.setText(MainActivity.name_bag.get(i));
            text.setTextSize(20);
            text.setGravity(Gravity.CENTER_VERTICAL);

            addHero(image, text, 250, 250);
        }
    }

    private void standardView()
    {
        for(int i = 0; i < MainActivity.overview.size(); i++)
        {
            String name = "h"+i;
            int index = getResources().getIdentifier(name, "drawable", getPackageName());
            ImageView image = new ImageView(BagActivity.this);
            image.setImageResource(index);

            TextView text = new TextView(BagActivity.this);
            text.setText(String.valueOf(MainActivity.overview.get(i)));
            text.setTextSize(20);
            text.setGravity(Gravity.CENTER_VERTICAL);

            addHero(image, text, 250, 250);
        }
    }

    private void changePage()
    {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    public void addHero(ImageView image, TextView text, int width, int height)
    {
        LinearLayout.LayoutParams imglayoutParams = new LinearLayout.LayoutParams(width, height);
        imglayoutParams.setMargins(25, 10, 25, 10);

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        LinearLayout.LayoutParams txtlayoutParams = new LinearLayout.LayoutParams(metrics.widthPixels, height);
        imglayoutParams.setMargins(5, 10, 5, 10);

        image.setLayoutParams(imglayoutParams);
        text.setLayoutParams(txtlayoutParams);

        LinearLayout layout = new LinearLayout(BagActivity.this);
        layout.setOrientation(LinearLayout.HORIZONTAL);

        layout.addView(image);
        layout.addView(text);

        main_layout.addView(layout);
    }
}