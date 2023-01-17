package com.example.idleheroessummonsimulator;

import codeassets.*;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.idleheroessummonsimulator.databinding.ActivityCompassBinding;

public class CompassActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{
    HeroSummon mySum = new HeroSummon();
    private ActivityCompassBinding binding;
    LinearLayout main_layout;

    String heroReg = "Vesa- 5*";
    String heroLD = "Faith Blade- 5*";


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        binding = ActivityCompassBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        main_layout = findViewById(R.id.linLay);


        ArrayAdapter<String> regAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, mySum.getCompassRegHeroes());
        regAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner regSpinner = (Spinner) findViewById(R.id.compassSpinnerReg);
        regSpinner.setAdapter(regAdapter);
        regSpinner.setOnItemSelectedListener(this);

        ArrayAdapter<String> ldAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, mySum.getCompassLDHeroes());
        ldAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner ldSpinner = (Spinner) findViewById(R.id.compassSpinnerLD);
        ldSpinner.setAdapter(ldAdapter);
        ldSpinner.setOnItemSelectedListener(this);

        binding.compassRegRate.setText(mySum.getCompassRegRate() + "%");
        binding.compassLDRate.setText(mySum.getCompassLDRate() + "%");

        binding.compassFateButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                main_layout.removeAllViews();
                for (int i = 0; i < getInput(); i++)
                {
                    summonHero(mySum.compassOfTranscendedFate(heroReg, heroLD));
                    binding.compassRegRate.setText(mySum.getCompassRegRate() + "%");
                    binding.compassLDRate.setText(mySum.getCompassLDRate() + "%");
                    binding.compassGuidanceCounter.setText("Guidance Counter: " + mySum.returnCompassTotalDraws() + "/15");
                }
            }
        });

        binding.compassGuidanceButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                main_layout.removeAllViews();
                for (int i = 0; i < getInput(); i++)
                {
                    summonHero(mySum.compassOfTranscendedGuidance(heroReg, heroLD));
                    binding.compassRegRate.setText(mySum.getCompassRegRate() + "%");
                    binding.compassLDRate.setText(mySum.getCompassLDRate() + "%");
                    binding.compassGuidanceCounter.setText("Guidance Counter: " + mySum.returnCompassTotalDraws() + "/15");
                }
            }
        });

        binding.compassBackButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                changePage();
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
    {
        String name;
        int index;
        switch(adapterView.getId())
        {
            case R.id.compassSpinnerReg:
                heroReg = mySum.returnIndex(mySum.findIndex("Vesa", 5) + i);
                name = "h"+(mySum.findIndex("Vesa", 5) + i);
                index = getResources().getIdentifier(name, "drawable", getPackageName());
                System.out.println(index);
                System.out.println(name);

                binding.compassRegPortrait.setImageResource(index);
                break;
            case R.id.compassSpinnerLD:
                heroLD = mySum.returnIndex(mySum.findIndex("Faith Blade", 5) + i);
                name = "h"+(mySum.findIndex("Faith Blade", 5) + i);
                index = getResources().getIdentifier(name, "drawable", getPackageName());
                System.out.println(index);
                System.out.println(name);

                binding.compassLDPortrait.setImageResource(index);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView)
    {

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

        LinearLayout layout = new LinearLayout(CompassActivity.this);
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

        ImageView image = new ImageView(CompassActivity.this);
        image.setImageResource(index);

        TextView text = new TextView(CompassActivity.this);
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
            return Integer.parseInt(binding.compassDrawNum.getText().toString());
        }
        catch (final NumberFormatException ignored)
        {
            return 1;
        }
    }
}