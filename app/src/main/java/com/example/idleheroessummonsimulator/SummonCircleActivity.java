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

import com.example.idleheroessummonsimulator.databinding.ActivitySummonCircleBinding;

public class SummonCircleActivity extends AppCompatActivity
{
    HeroSummon mySum = new HeroSummon();
    private ActivitySummonCircleBinding binding;
    LinearLayout main_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        binding = ActivitySummonCircleBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        main_layout = findViewById(R.id.linLay);

        // Compare Lengths is used for debugging in case I'm stupid and can't count indexes correctly whenever I add a new hero
        // System.out.println(mySum.compareLengths());

        binding.basicButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                main_layout.removeAllViews();
                for (int i = 0; i < getInput(); i++)
                {
                    summonHero(mySum.basicSummon());
                }

            }
        });

        binding.heroicButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                main_layout.removeAllViews();
                for (int i = 0; i < getInput(); i++)
                {
                    summonHero(mySum.heroicSummon());
                }
            }
        });

        binding.friendshipButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                main_layout.removeAllViews();
                for (int i = 0; i < getInput(); i++)
                {
                    summonHero(mySum.friendshipSummon());
                }
            }
        });

        binding.heroicEventButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                main_layout.removeAllViews();
                for (int i = 0; i < getInput(); i++)
                {
                    summonHero(mySum.heroicSummonEvent());
                    binding.heroicEventCounter.setText(mySum.getHSEventTotalDraws() + "/500");
                }
            }
        });



        binding.summonCircleBackButton.setOnClickListener(new View.OnClickListener()
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
        Intent intent = new Intent(this, SummonActivity.class);
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

        LinearLayout layout = new LinearLayout(SummonCircleActivity.this);
        layout.setOrientation(LinearLayout.HORIZONTAL);

        layout.addView(image);
        layout.addView(text);

        main_layout.addView(layout);
    }

    public void summonHero(String hero)
    {
        int position = mySum.findIndex(hero);
        String name = "h"+position;
        int index = getResources().getIdentifier(name, "drawable", getPackageName());

        ImageView image = new ImageView(SummonCircleActivity.this);
        image.setImageResource(index);

        TextView text = new TextView(SummonCircleActivity.this);
        text.setText(hero);
        text.setTextSize(20);
        text.setGravity(Gravity.CENTER_VERTICAL);

        addHeroToView(image, text, 250, 250);

        MainActivity.overview.set(position, MainActivity.overview.get(position)+1);
        MainActivity.name_bag.add(hero);
        Integer intIndex = new Integer(index);
        MainActivity.draw_bag.add(intIndex);
    }

    public int getInput()
    {
        try
        {
            return Integer.parseInt(binding.summonCircleDrawNum.getText().toString());
        }
        catch (final NumberFormatException ignored)
        {
            return 1;
        }
    }
}