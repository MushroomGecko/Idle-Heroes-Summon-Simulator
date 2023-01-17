package com.example.idleheroessummonsimulator;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;

import com.example.idleheroessummonsimulator.databinding.ActivitySummonBinding;

public class SummonActivity extends AppCompatActivity
{
    private ActivitySummonBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        binding = ActivitySummonBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.summonCircleButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                changePageForward(SummonCircleActivity.class);

            }
        });

        binding.fourStarShardButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                changePageForward(FourStarShardActivity.class);
            }
        });

        binding.fiveStarShardButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                changePageForward(FiveStarShardActivity.class);
            }
        });

        binding.eliteFiveStarShardButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                changePageForward(EliteFiveStarShardActivity.class);
            }
        });

        binding.prophetOrbsButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                changePageForward(ProphetOrbsActivity.class);
            }
        });

        binding.compassButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                changePageForward(CompassActivity.class);
            }
        });

        binding.summonBackButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                changePageBack();
            }
        });


    }

    private void changePageBack()
    {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    private void changePageForward(Class c)
    {
        Intent intent = new Intent(this, c);
        startActivity(intent);
    }
}