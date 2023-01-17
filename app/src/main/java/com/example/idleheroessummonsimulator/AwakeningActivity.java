package com.example.idleheroessummonsimulator;

import codeassets.*;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.idleheroessummonsimulator.databinding.ActivityAwakeningBinding;

import java.util.Arrays;

public class AwakeningActivity extends AppCompatActivity
{
    AwakenHero mySum = new AwakenHero();
    private ActivityAwakeningBinding binding;
    LinearLayout main_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        binding = ActivityAwakeningBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        main_layout = findViewById(R.id.linLay);

        binding.awakenButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                main_layout.removeAllViews();
                int awakenAmount = 5;
                TextView awakens[] = new TextView[awakenAmount];
                Arrays.fill(awakens, summonTier(" "));
                for (int i = 0; i < getInput(); i++)
                {
                    if(i % 5 == 0 && i > 0)
                    {
                        addTierToView(awakens, awakenAmount);
                        Arrays.fill(awakens, summonTier(" "));
                    }
                    String summon = mySum.pullAwakening();
                    System.out.println(summon + " " + i + " " + i % awakenAmount);
                    awakens[i % 5] = summonTier(summon);
                }
                addTierToView(awakens, awakenAmount);

            }
        });

        binding.awakenBackButton.setOnClickListener(new View.OnClickListener()
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

    public void addTierToView(TextView[] text, int awakenAmount)
    {
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);

        LinearLayout.LayoutParams txtlayoutParams = new LinearLayout.LayoutParams(metrics.widthPixels / awakenAmount, 250);
        txtlayoutParams.setMargins(5, 10, 5, 10);

        for(int i  = 0; i < awakenAmount; i++)
        {
            text[i].setLayoutParams(txtlayoutParams);
        }

        LinearLayout layout = new LinearLayout(AwakeningActivity.this);
        layout.setOrientation(LinearLayout.HORIZONTAL);

        for(int i = 0; i < awakenAmount; i++)
        {
            layout.addView(text[i]);
        }


        main_layout.addView(layout);
    }

    public TextView summonTier(String tier)
    {
        TextView text = new TextView(AwakeningActivity.this);
        if(tier.contains("E"))
        {
            text.setTextColor(Color.rgb(113, 167, 225));
        }
        else if(tier.contains("D"))
        {
            text.setTextColor(Color.rgb(208, 181, 83));
        }
        else if(tier.contains("C"))
        {
            text.setTextColor(Color.rgb(186, 73, 223));
        }
        else if(tier.contains("B"))
        {
            text.setTextColor(Color.rgb(94, 216, 127));
        }
        else if(tier.contains("A"))
        {
            text.setTextColor(Color.rgb(220, 76, 71));
        }
        else
        {
            text.setTextColor(Color.rgb(222, 142, 61));
        }
        text.setText(tier);
        text.setTextSize(42);
        text.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);

        return text;
    }

    public int getInput()
    {
        try
        {
            return Integer.parseInt(binding.awakenDrawNum.getText().toString());
        }
        catch (final NumberFormatException ignored)
        {
            return 1;
        }
    }
}