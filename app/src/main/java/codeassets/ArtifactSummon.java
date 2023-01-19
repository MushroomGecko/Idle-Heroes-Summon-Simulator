package codeassets;

import java.util.Arrays;

public class ArtifactSummon {

    private double purple;
    private double green;
    private double redex;
    private double red;
    private double orangeex;
    private double orange;
    private double p2w;

    public ArtifactSummon()
    {
        purple = 0;

        green = 0;

        redex = 0;
        red = 0;

        orangeex = 0;
        orange = 0;

        p2w = 0;
    }

    private static final String[] artifacts =
            {
                    // Purple
                    "Snow Meaning", "Chaos Stone", "Heaven Spine", "Spirit Locker", "Scarlet Scar",

                    // Green
                    "Executioner", "Walker's Boots", "Godly Favor", "Space Crack", "Bestowed Sword", "Cross of Destiny", "Emperor's Ambition",

                    // Red Exclusive
                    "The Blade of Freedom", "Deep Eyes", "The Silver Key",
                    "Angel's Pendant", "Shadow Cloak", "Emerald Butterfly", "Oak's Heart", "Elf's Blessed Bow", "Delusion", "Blood",
                    "Immerse", "Magic Energy Armlet", "Flying Thor", "Shadow Cape", "Cursed Sandglass", "Golden Compass", "Confined Spirit",

                    // Red
                    "Talisman of Block", "The Black Sword", "Mirror Chain",
                    "Light Shield", "Traveler's Ring", "Eternal Chapter", "Luna's Sorrow", "Crying Undead", "Death Dance", "Satan's Heart",

                    // Orange Exclusive
                    "Awakening of Divine Power", "Time Control",
                    "Guardian Angel", "Bright Holy Water", "Evil Holy Grail", "Ghost Cloak", "Taboo Seal", "Curse of Medusa", "Flower Language",
                    "Forest Reverberation", "Poisonous Rose", "Magical Sacrifice", "Necronomicon", "The Sword of Archangel", "Reaper's Scythe", "Elf Tears",
                    "Destruction Box", "The Demon Whisper", "The Masked Lover", "Rage of the Dragon", "Murmur", "The King of Demons", "Warhammer of Hopelessness",
                    "Barrier of Destiny", "Tread of Lightness", "Withered Armor", "Shadow Cape", "Sword of Justice", "Guilty Crown", "The Golden Key",
                    "Spear of Destiny", "Orb of Annihilation", "Sigh", "Rune's Power", "Golden Bow", "Engulf", "Queen's Blade",
                    "Margaret's Legacy", "Energy Core", "Yubashiri", "Frost Sword", "Aiden's Fury", "Field's Compass", "Kharma's Eye",

                    // Orange
                    "Invisible", "Echo of Death", "Magic Source", "Plate of the Courageous",
                    "Heavenly Bead", "Wind God Messenger", "Eye of the Hell", "Ancient God's Whisper", "Azrael", "Fiend's Touch", "Nail of Destiny",

                    // P2W
                    "Demon Bell", "Antlers Cane", "Staff: Punisher of Immortal", "Magic Stone Sword", "Augustus Magic Ball", "The Kiss of Ghost", "Lucky Candy Bar",
                    "Wildfire Torch", "Golden Crown", "Ruyi Scepter", "Snow Heart", "Melodic Strings"
            };

    public double[] getRates()
    {
        double[] pullRates =
                {
                        purple, purple, purple, purple, purple,

                        green, green, green, green, green, green, green,

                        redex, redex, redex,
                        redex, redex, redex, redex, redex, redex, redex,
                        redex, redex, redex, redex, redex, redex, redex,

                        red, red, red,
                        red, red, red, red, red, red, red,

                        orangeex, orangeex,
                        orangeex, orangeex, orangeex, orangeex, orangeex, orangeex, orangeex,
                        orangeex, orangeex, orangeex, orangeex, orangeex, orangeex, orangeex,
                        orangeex, orangeex, orangeex, orangeex, orangeex, orangeex, orangeex,
                        orangeex, orangeex, orangeex, orangeex, orangeex, orangeex, orangeex,
                        orangeex, orangeex, orangeex, orangeex, orangeex, orangeex, orangeex,
                        orangeex, orangeex, orangeex, orangeex, orangeex, orangeex, orangeex,

                        orange, orange, orange, orange,
                        orange, orange, orange, orange, orange, orange, orange,

                        p2w, p2w, p2w, p2w, p2w, p2w, p2w,
                        p2w, p2w, p2w, p2w, p2w
                };
        return pullRates;
    }

    public void resetRates()
    {
        purple = 0;

        green = 0;

        redex = 0;
        red = 0;

        orangeex = 0;
        orange = 0;

        p2w = 0;
    }

    public static int distribution(double[] items)
    {
        // Compute the total weight of all items together
        double totalWeight = 0.0d;
        for (double i : items)
        {
            totalWeight += i;
        }
        // Now choose a random item
        int randomIndex = -1;
        double random = Math.random() * totalWeight;
        for (int i = 0; i < items.length; ++i)
        {
            random -= items[i];
            if (random <= 0.0d)
            {
                randomIndex = i;
                break;
            }
        }
        return randomIndex;
    };

    public String purpleShards()
    {
        purple = 20;

        int index = distribution(getRates());
        String status = artifacts[index];
        resetRates();
        return status;
    }

    public String greenShards()
    {
        green = 14.3;

        int index = distribution(getRates());
        String status = artifacts[index];
        resetRates();
        return status;
    }

    public String redExclusiveShards()
    {
        redex = 5.88;

        int index = distribution(getRates());
        String status = artifacts[index];
        resetRates();
        return status;
    }

    public String redShards()
    {
        red = 10;

        int index = distribution(getRates());
        String status = artifacts[index];
        resetRates();
        return status;
    }

    public String orangeExclusiveShards()
    {
        orangeex = 2.273;

        int index = distribution(getRates());
        String status = artifacts[index];
        resetRates();
        return status;
    }

    public String orangeShards()
    {
        orange = 9.09;

        int index = distribution(getRates());
        String status = artifacts[index];
        resetRates();
        return status;
    }

    public String comebackChest()
    {
        p2w = 8.3;

        int index = distribution(getRates());
        String status = artifacts[index];
        resetRates();
        return status;
    }

    public int findIndex(String artifactName)
    {
        return Arrays.asList(artifacts).lastIndexOf(artifactName);
    }


}
