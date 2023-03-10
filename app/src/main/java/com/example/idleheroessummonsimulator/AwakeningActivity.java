package com.example.idleheroessummonsimulator;

import codeassets.*;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;

import com.example.idleheroessummonsimulator.databinding.ActivityAwakeningBinding;

public class AwakeningActivity extends AppCompatActivity
{
    AwakenHero mySum = new AwakenHero();
    private ActivityAwakeningBinding binding;
    LinearLayout main_layout;

    private final String[] awaken_ranks = new String[]{"E-", "E", "E+", "D-", "D", "D+", "C-", "C", "C+", "B-", "B", "B+", "A-", "A", "A+", "S"};
    private final int[] awaken_bag = new int[awaken_ranks.length];

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
                Arrays.fill(awaken_bag, 0);
                int awakenAmount = 5;
                TextView[] awakens = new TextView[awakenAmount];
                Arrays.fill(awakens, summonTier(""));
                for (int i = 0; i < getInput(); i++)
                {
                    if(i % 5 == 0 && i > 0)
                    {
                        addTierToView(awakens, 250, awakenAmount);
                        Arrays.fill(awakens, summonTier(""));
                    }
                    awakens[i % 5] = summonTier(mySum.pullAwakening());
                }
                int lastRow = 0;
                for(int i = 0; i < awakenAmount; i++)
                {
                    if(awakens[i].getText() != "")
                    {
                        lastRow++;
                    }
                    else
                    {
                        break;
                    }
                }
                addTierToView(awakens, 250, lastRow);

            }
        });

        binding.awakenOverviewButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                alert();
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

    public void addTierToView(TextView[] text, int height, int awakenAmount)
    {
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);


        LinearLayout.LayoutParams txtlayoutParams = new LinearLayout.LayoutParams(metrics.widthPixels / awakenAmount, height);
        txtlayoutParams.setMargins(5, 10, 5, 10);

        LinearLayout layout = new LinearLayout(AwakeningActivity.this);
        layout.setOrientation(LinearLayout.HORIZONTAL);

        for(int i = 0; i < awakenAmount; i++)
        {
            text[i].setLayoutParams(txtlayoutParams);
            layout.addView(text[i]);
        }

        main_layout.addView(layout);
    }

    public TextView summonTier(String tier)
    {
        for(int i = 0; i < awaken_ranks.length; i++)
        {
            if(tier.equals(awaken_ranks[i]))
            {
                awaken_bag[i]++;
            }
        }

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

    private void alert()
    {
        AlertDialog alertDialog = new AlertDialog.Builder(AwakeningActivity.this).create();
        alertDialog.setTitle("Awakenings Overview");

        String overview = "";
        for(int i = 0; i < awaken_bag.length; i++)
        {
            if(awaken_ranks[i].length() == 1)
            {
                overview = overview.concat(awaken_ranks[i] + " " + ": " + awaken_bag[i] + "\n");
            }
            else
            {
                overview = overview.concat(awaken_ranks[i] + ": " + awaken_bag[i] + "\n");
            }

        }

        alertDialog.setMessage(overview);
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK", (dialog, which) -> dialog.dismiss());
        alertDialog.show();
    }
}