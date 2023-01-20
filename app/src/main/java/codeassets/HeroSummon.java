package codeassets;

import java.util.Arrays;

public class HeroSummon {

    private double oneStar;

    private double twoStar;

    private double threeStar;

    private double threeStarLD;

    private double fourStarFst;
    private double fourStarFrt;
    private double fourStarAby;
    private double fourStarShd;

    private double fourStarL;
    private double fourStarD;

    private double fourStarShards;

    private double fourStarShardsL;

    private double fourStarShardsD;

    private double unNatfiveStarFst;
    private double unNatfiveStarFrt;
    private double unNatfiveStarAby;
    private double unNatfiveStarShd;

    private double unNatfiveStarL;
    private double unNatfiveStarD;

    private double fiveStarFst;
    private double fiveStarFrt;
    private double fiveStarAby;
    private double fiveStarShd;

    private double fiveStarL;
    private double fiveStarD;

    private double fiveStarEliteFst;
    private double fiveStarEliteFrt;
    private double fiveStarEliteAby;
    private double fiveStarEliteShd;

    private double fiveStarEliteL;
    private double fiveStarEliteD;

    private double fiveStarShards;

    private int HSEventTotalDraws;
    private double eventHeroRate;

    private double CoTRate;

    private double overallOneStar;
    private double overallTwoStar;
    private double overallThreeStar;
    private double overallThreeStarLD;
    private double overallFourStar;
    private double overallFourStarLD;
    private double overallUnNatFiveStar;
    private double overallUnNatFiveStarLD;
    private double overallFiveStar;
    private double overallFiveStarLD;
    private double overallFiveStarElite;
    private double overallFiveStarEliteLD;
    private double overallCoTRate;

    private int compassTotalDraws;
    private double compassHeroRate;
    private double compassHeroLDRate;
    private double resetCompassHeroRate;
    private double resetCompassHeroLDRate;


    public HeroSummon()
    {
        oneStar = 0;

        twoStar = 0;

        threeStar = 0;

        threeStarLD = 0;

        fourStarFst = 0;
        fourStarFrt = 0;
        fourStarAby = 0;
        fourStarShd = 0;

        fourStarL = 0;
        fourStarD = 0;

        fourStarShards = 0;

        fourStarShardsL = 0;

        fourStarShardsD = 0;

        unNatfiveStarFst = 0;
        unNatfiveStarFrt = 0;
        unNatfiveStarAby = 0;
        unNatfiveStarShd = 0;

        unNatfiveStarL = 0;
        unNatfiveStarD = 0;

        fiveStarFst = 0;
        fiveStarFrt = 0;
        fiveStarAby = 0;
        fiveStarShd = 0;

        fiveStarL = 0;
        fiveStarD = 0;

        fiveStarEliteFst = 0;
        fiveStarEliteFrt = 0;
        fiveStarEliteAby = 0;
        fiveStarEliteShd = 0;

        fiveStarEliteL = 0;
        fiveStarEliteD = 0;

        fiveStarShards = 0;

        eventHeroRate = 0;

        CoTRate = 0;
        compassHeroRate = 1;
        compassHeroLDRate = 0.25;
        resetCompassHeroRate = 1;
        resetCompassHeroLDRate = 0.25;

        HSEventTotalDraws = 0;
        compassTotalDraws = 0;
    }



    private static final String[] heroes =
            {
                    "Bella- 1*", "Scout- 1*", "Sailor- 1*",
                    "Imp- 1*", "Son of Flame- 1*", "Lava Beetle- 1*",
                    "Honest Man- 1*", "Woodcutter- 1*", "Old Miner- 1*",
                    "Foolish- 1*", "Dark Christian- 1*", "Luminous Body- 1*",

                    "Lavine- 2*", "Dryad- 2*", "Blue Warrior- 2*", "Ent- 2*",
                    "Golden Horn- 2*", "Silver Horn- 2*", "Johnson- 2*", "Blackstone- 2*",
                    "The Gray- 2*", "Tower Guard- 2*", "Dungeon Guard- 2*", "ZH-07- 2*",
                    "Charlotte- 2*", "Markina- 2*", "Bone Archer- 2*", "Bone Warrior- 2*",

                    "Sybil- 3*", "Undomiel- 3*", "Blue Shaman- 3*", "Frey- 3*", "Forest Captain- 3*",
                    "Abyss Guard- 3*", "Wild Beast- 3*", "Succube- 3*", "Flaming Lips- 3*", "Mirko- 3*",
                    "Reggie- 3*", "Carver- 3*", "Tara's Servant- 3*", "Fire Fist- 3*", "MK-05- 3*",
                    "Chain Hammer- 3*", "Poison Tongue- 3*", "Shirley- 3*", "Dark Priest- 3*", "Ice Troll- 3*",

                    "Holy Kid- 3*",
                    "Ghost of Aspen- 3*",

                    "Wind Walker- 4*", "Chief- 4*", "Ent Elder- 4*", "Headstriker- 4*", "Thale- 4*", "Kargath- 4*", "The Grey-eyed- 4*", "Zekkis- 4*",
                    "Rogge- 4*", "Destroyer- 4*", "Tanner- 4*", "Akasha- 4*", "Lemegeton- 4*", "Aleria- 4*", "Norma- 4*", "Immolatus- 4*",
                    "Time Mage- 4*", "Storm Hudde- 4*", "Roy- 4*", "Sierra- 4*", "Liquor- 4*", "LM-02- 4*", "Iron Bambi- 4*", "Kristian- 4*",
                    "Grumpy Corpse- 4*", "Gbagbo- 4*", "Bonecarver- 4*", "Glen- 4*", "Nightmare Knight- 4*", "Bone General- 4*", "Lamb- 4*", "Deathsworn- 4*",

                    "Divine Spirit- 4*", "Fegan- 4*", "Disciple- 4*",
                    "Dark Spirit- 4*", "Logan- 4*", "Darkness Fanella- 4*",

                    "4 Star Shards",

                    "Light 4 Star Shards",

                    "Dark 4 Star Shards",

                    "Wind Walker- 5*", "Chief- 5*", "Ent Elder- 5*", "Headstriker- 5*", "Thale- 5*", "Kargath- 5*", "The Grey-eyed- 5*", "Zekkis- 5*",
                    "Rogge- 5*", "Destroyer- 5*", "Tanner- 5*", "Akasha- 5*", "Lemegeton- 5*", "Aleria- 5*", "Norma- 5*", "Immolatus- 5*",
                    "Time Mage- 5*", "Storm Hudde- 5*", "Roy- 5*", "Sierra- 5*", "Liquor- 5*", "LM-02- 5*", "Iron Bambi- 5*", "Kristian- 5*",
                    "Grumpy Corpse- 5*", "Gbagbo- 5*", "Bonecarver- 5*", "Glen- 5*", "Nightmare Knight- 5*", "Bone General- 5*", "Lamb- 5*", "Deathsworn- 5*",

                    "Divine Spirit- 5*", "Fegan- 5*", "Disciple- 5*",
                    "Dark Spirit- 5*", "Logan- 5*", "Darkness Fanella- 5*",

                    "Eddga- 5*", "Faceless- 5*", "Dragon Slayer- 5*", "Malassa- 5*", "Groo- 5*", "Demon Hunter- 5*", "Rosa- 5*",
                    "Gusta- 5*", "Lord Balrog- 5*", "Fat Mu- 5*", "Margaret- 5*", "Queen- 5*", "Karim- 5*", "Dantalian- 5*", "Barea- 5*",
                    "Flame Strike- 5*", "Bleeker- 5*", "Honor Guard- 5*", "Mirage- 5*", "OD-01- 5*", "Iceblink- 5*", "Miki- 5*", "Emily- 5*",
                    "Dominator- 5*", "Field- 5*", "Lutz- 5*", "Kharma- 5*", "Walter- 5*", "Baade- 5*", "Blood Blade- 5*",

                    "Vesa- 5*", "Starlight- 5*", "Heart Watcher- 5*", "Valkyrie- 5*", "Oberon- 5*", "Garuda- 5*", "Elyvia- 5*", "Rogan- 5*", "Flora- 5*", "Gloria- 5*", "Xiahao- 5*", "Freya- 5*",
                    "Skerei- 5*", "King Barton- 5*", "Kroos- 5*", "Cthugha- 5*", "Nakia- 5*", "Delacium- 5*", "Ignis- 5*", "Morax- 5*", "Waldek- 5*", "Natasha- 5*", "Aranea- 5*",
                    "Ormus- 5*", "Sigmund- 5*", "Xia- 5*", "Valentino- 5*", "Penny- 5*", "UniMax-3000- 5*", "Sherlock- 5*", "Inosuke- 5*", "Fiona- 5*", "Saja- 5*", "Holmes Young- 5*",
                    "Kamath- 5*", "Aidan- 5*", "Corpsedemon- 5*", "Jahra- 5*", "Horus- 5*", "Gustin- 5*", "Ithaqua- 5*", "Tix- 5*", "Eloise- 5*", "Onkirimaru- 5*", "Annabelle- 5*", "Azrael- 5*",

                    "Michelle- 5*", "Asmodel- 5*", "Gerke- 5*",
                    "Das Moge- 5*", "Sleepless- 5*", "Dark Arthindol- 5*",

                    "Faith Blade- 5*", "Belrain- 5*", "Aida- 5*", "Tara- 5*", "Russell- 5*", "Trashilago- 5*", "Andrea- 5*", "Eos- 5*", "Vulcan- 5*",
                    "Amuvor- 5*", "Mihm- 5*", "Aspen- 5*", "Amen-Ra- 5*", "Carrie- 5*", "Drake- 5*", "Phorcys- 5*", "Mockman- 5*",

                    "5 Star Shards",

                    "Elena- 5*",

                    "Core of Transcendence"
            };

    public String[] getHeroes()
    {
        return heroes;
    }

    public double[] getRates()
    {
        double[] pullRates =
                {
                        oneStar, oneStar, oneStar,
                        oneStar, oneStar, oneStar,
                        oneStar, oneStar, oneStar,
                        oneStar, oneStar, oneStar,

                        twoStar, twoStar, twoStar, twoStar,
                        twoStar, twoStar, twoStar, twoStar,
                        twoStar, twoStar, twoStar, twoStar,
                        twoStar, twoStar, twoStar, twoStar,

                        threeStar, threeStar, threeStar, threeStar, threeStar,
                        threeStar, threeStar, threeStar, threeStar, threeStar,
                        threeStar, threeStar, threeStar, threeStar, threeStar,
                        threeStar, threeStar, threeStar, threeStar, threeStar,

                        threeStarLD,
                        threeStarLD,

                        fourStarFst, fourStarFst, fourStarFst, fourStarFst, fourStarFst, fourStarFst, fourStarFst, fourStarFst,
                        fourStarAby, fourStarAby, fourStarAby, fourStarAby, fourStarAby, fourStarAby, fourStarAby, fourStarAby,
                        fourStarFrt, fourStarFrt, fourStarFrt, fourStarFrt, fourStarFrt, fourStarFrt, fourStarFrt, fourStarFrt,
                        fourStarShd, fourStarShd, fourStarShd, fourStarShd, fourStarShd, fourStarShd, fourStarShd, fourStarShd,

                        fourStarL, fourStarL, fourStarL,
                        fourStarD, fourStarD, fourStarD,

                        fourStarShards,

                        fourStarShardsL,

                        fourStarShardsD,

                        unNatfiveStarFst, unNatfiveStarFst, unNatfiveStarFst, unNatfiveStarFst, unNatfiveStarFst, unNatfiveStarFst, unNatfiveStarFst, unNatfiveStarFst,
                        unNatfiveStarAby, unNatfiveStarAby, unNatfiveStarAby, unNatfiveStarAby, unNatfiveStarAby, unNatfiveStarAby, unNatfiveStarAby, unNatfiveStarAby,
                        unNatfiveStarFrt, unNatfiveStarFrt, unNatfiveStarFrt, unNatfiveStarFrt, unNatfiveStarFrt, unNatfiveStarFrt, unNatfiveStarFrt, unNatfiveStarFrt,
                        unNatfiveStarShd, unNatfiveStarShd, unNatfiveStarShd, unNatfiveStarShd, unNatfiveStarShd, unNatfiveStarShd, unNatfiveStarShd, unNatfiveStarShd,

                        unNatfiveStarL, unNatfiveStarL, unNatfiveStarL,
                        unNatfiveStarD, unNatfiveStarD, unNatfiveStarD,

                        fiveStarFst, fiveStarFst, fiveStarFst, fiveStarFst, fiveStarFst, fiveStarFst, fiveStarFst,
                        fiveStarAby, fiveStarAby, fiveStarAby, fiveStarAby, fiveStarAby, fiveStarAby, fiveStarAby, fiveStarAby,
                        fiveStarFrt, fiveStarFrt, fiveStarFrt, fiveStarFrt, fiveStarFrt, fiveStarFrt, fiveStarFrt, fiveStarFrt,
                        fiveStarShd, fiveStarShd, fiveStarShd, fiveStarShd, fiveStarShd, fiveStarShd, fiveStarShd,

                        fiveStarEliteFst, fiveStarEliteFst, fiveStarEliteFst, fiveStarEliteFst, fiveStarEliteFst, fiveStarEliteFst, fiveStarEliteFst, fiveStarEliteFst, fiveStarEliteFst, fiveStarEliteFst, fiveStarEliteFst, fiveStarEliteFst,
                        fiveStarEliteAby, fiveStarEliteAby, fiveStarEliteAby, fiveStarEliteAby, fiveStarEliteAby, fiveStarEliteAby, fiveStarEliteAby, fiveStarEliteAby, fiveStarEliteAby, fiveStarEliteAby, fiveStarEliteAby,
                        fiveStarEliteFrt, fiveStarEliteFrt, fiveStarEliteFrt, fiveStarEliteFrt, fiveStarEliteFrt, fiveStarEliteFrt, fiveStarEliteFrt, fiveStarEliteFrt, fiveStarEliteFrt, fiveStarEliteFrt, fiveStarEliteFrt,
                        fiveStarEliteShd, fiveStarEliteShd, fiveStarEliteShd, fiveStarEliteShd, fiveStarEliteShd, fiveStarEliteShd, fiveStarEliteShd, fiveStarEliteShd, fiveStarEliteShd, fiveStarEliteShd, fiveStarEliteShd, fiveStarEliteShd,


                        fiveStarL, fiveStarL, fiveStarL,
                        fiveStarD, fiveStarD, fiveStarD,

                        fiveStarEliteL, fiveStarEliteL, fiveStarEliteL, fiveStarEliteL, fiveStarEliteL, fiveStarEliteL, fiveStarEliteL, fiveStarEliteL, fiveStarEliteL,
                        fiveStarEliteD, fiveStarEliteD, fiveStarEliteD, fiveStarEliteD, fiveStarEliteD, fiveStarEliteD, fiveStarEliteD, fiveStarEliteD,

                        fiveStarShards,

                        eventHeroRate,

                        CoTRate
                };

        return pullRates;
    }

    // So much spaghetti code I may as well add some meatballs
    // It is imperative that I have these awful variables. It will make adding in new heroes much easier and more dynamic (Assuming DH Games doesn't change the overall summon rates for heroes)
    // Instead of hardcoding in the rates found in game every hero release like I've been doing, I'm making them auto adjust so I'm not constantly having one hand on my phone scrolling through
    // IH summon rates and one hand on my keyboard typing away at the keyboard like in Bruce Almighty
    // If you read these comments, here's a cookie (*)
    private final int oneCount = findIndex("Lavine", 2) - findIndex("Bella", 1);
    private final int twoCount = findIndex("Sybil", 3) - findIndex("Lavine", 2);
    private final int threeCount = findIndex("Holy Kid", 3) - findIndex("Sybil", 3); // 20
    private final int threeCountLD = findIndex("Wind Walker", 4) - findIndex("Holy Kid", 3); // 2
    private final int fourCount = findIndex("Divine Spirit", 4) - findIndex("Wind Walker", 4); //32
    private final int fourCountLD = findIndex("4 Star Shards") - findIndex("Divine Spirit", 4); // 6
    private final int unNatFiveCount = findIndex("Divine Spirit", 5) - findIndex("Wind Walker", 5); //32
    private final int unNatFiveCountLD = findIndex("Eddga", 5) - findIndex("Divine Spirit", 5); // 6
    private final int fiveCount = findIndex("Vesa", 5) - findIndex("Eddga", 5); // 30
    private final int fiveCountElite = findIndex("Michelle", 5) - findIndex("Vesa", 5); // 46
    private final int fiveCountLD = findIndex("Faith Blade", 5) - findIndex("Michelle", 5); // 6
    private final int fiveCountEliteLD = findIndex("5 Star Shards") - findIndex("Faith Blade", 5); // 16

    private final int fourCountFst = findIndex("Rogge", 4) - findIndex("Wind Walker", 4);
    private final int unNatFiveCountFst = findIndex("Rogge", 5) - findIndex("Wind Walker", 5);
    private final int fiveCountFst = findIndex("Gusta", 5) - findIndex("Eddga", 5);
    private final int fiveCountEliteFst = findIndex("Skerei", 5) - findIndex("Vesa", 5);

    private final int fourCountAby = findIndex("Time Mage", 4) - findIndex("Rogge", 4);
    private final int unNatFiveCountAby = findIndex("Time Mage", 5) - findIndex("Rogge", 5);
    private final int fiveCountAby = findIndex("Flame Strike", 5) - findIndex("Gusta", 5);
    private final int fiveCountEliteAby = findIndex("Ormus", 5) - findIndex("Skerei", 5);

    private final int fourCountFrt = findIndex("Grumpy Corpse", 4) - findIndex("Time Mage", 4);
    private final int unNatFiveCountFrt = findIndex("Grumpy Corpse", 5) - findIndex("Time Mage", 5);
    private final int fiveCountFrt = findIndex("Dominator", 5) - findIndex("Flame Strike", 5);
    private final int fiveCountEliteFrt = findIndex("Kamath", 5) - findIndex("Ormus", 5);

    private final int fourCountShd = findIndex("Divine Spirit", 4) - findIndex("Grumpy Corpse", 4);
    private final int unNatFiveCountShd = findIndex("Divine Spirit", 5) - findIndex("Grumpy Corpse", 5);
    private final int fiveCountShd = findIndex("Vesa", 5) - findIndex("Dominator", 5);
    private final int fiveCountEliteShd = findIndex("Michelle", 5) - findIndex("Kamath", 5);

    private final int fourCountL = findIndex("Dark Spirit", 4) - findIndex("Divine Spirit", 4);
    private final int unNatFiveCountL = findIndex("Dark Spirit", 5) - findIndex("Divine Spirit", 5);
    private final int fiveCountL = findIndex("Das Moge", 5) - findIndex("Michelle", 5);
    private final int fiveCountEliteL = findIndex("Amuvor", 5) - findIndex("Faith Blade", 5);

    private final int fourCountD = findIndex("4 Star Shards") - findIndex("Dark Spirit", 4);
    private final int unNatFiveCountD = findIndex("Eddga", 5) - findIndex("Dark Spirit", 5);
    private final int fiveCountD = findIndex("Faith Blade", 5) - findIndex("Das Moge", 5);
    private final int fiveCountEliteD = findIndex("5 Star Shards") - findIndex("Amuvor", 5);

    public boolean checkLengths()
    {
        double heroListLen = heroes.length;
        double ratesListLen = getRates().length;

        if(heroListLen == ratesListLen)
        {
            return true;
        }
        else
        {
            if(heroListLen > ratesListLen)
            {
                System.out.println("Heros list longer than rates list");
                return false;
            }
            else
            {
                System.out.println("Rates list longer than heroes list");
                return false;
            }
        }
    }

    public void resetRates()
    {
        oneStar = 0;

        twoStar = 0;

        threeStar = 0;

        threeStarLD = 0;

        fourStarFst = 0;
        fourStarFrt = 0;
        fourStarAby = 0;
        fourStarShd = 0;

        fourStarL = 0;
        fourStarD = 0;

        fourStarShards = 0;

        fourStarShardsL = 0;

        fourStarShardsD = 0;

        unNatfiveStarFst = 0;
        unNatfiveStarFrt = 0;
        unNatfiveStarAby = 0;
        unNatfiveStarShd = 0;

        unNatfiveStarL = 0;
        unNatfiveStarD = 0;

        fiveStarFst = 0;
        fiveStarFrt = 0;
        fiveStarAby = 0;
        fiveStarShd = 0;

        fiveStarL = 0;
        fiveStarD = 0;

        fiveStarEliteFst = 0;
        fiveStarEliteFrt = 0;
        fiveStarEliteAby = 0;
        fiveStarEliteShd = 0;

        fiveStarEliteL = 0;
        fiveStarEliteD = 0;

        fiveStarShards = 0;

        CoTRate = 0;
    }

    public void getPullCount()
    {
        System.out.println(HSEventTotalDraws);
        System.out.println(compassTotalDraws);
    }


    /*
     * Responsible for determining what is randomly selected
     */

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
    }


    /*
     * Basic summon
     */

    public String basicSummon()
    {
        overallOneStar = 56.0 / oneCount;
        overallTwoStar = 34.0 / twoCount;
        overallThreeStar = 6.8 / threeCount;
        overallThreeStarLD = 1.7 / threeCountLD;
        overallFourStar = 1.2 / fourCount;
        overallFourStarLD = 0.25 / fourCountLD;
        overallFiveStar = 0.05 / fiveCount;

        // System.out.println(overallOneStar + " " + overallTwoStar + " " + overallThreeStar + " " + overallThreeStarLD + " " + overallFourStar + " " + overallFourStarLD + " " + overallFiveStar);

        oneStar = overallOneStar;

        twoStar = overallTwoStar;

        threeStar = overallThreeStar;
        threeStarLD = overallThreeStarLD;

        fourStarFst = overallFourStar;
        fourStarAby = overallFourStar;
        fourStarFrt = overallFourStar;
        fourStarShd = overallFourStar;

        fourStarL = overallFourStarLD;
        fourStarD = overallFourStarLD;

        fiveStarFst = overallFiveStar;
        fiveStarAby = overallFiveStar;
        fiveStarFrt = overallFiveStar;
        fiveStarShd = overallFiveStar;

        int index = distribution(getRates());
        String hero = heroes[index];
        resetRates();
        return hero;

    }


    /*
     * Friendship summon
     */

    public String friendshipSummon()
    {
        overallTwoStar = 32.0 / twoCount;
        overallThreeStar = 44.0 / threeCount;
        overallThreeStarLD = 10.0 / threeCountLD;
        overallFourStar = 10.4 / fourCount;
        overallFourStarLD = 2.8 / fourCountLD;
        overallFiveStar = 0.8 / (fiveCount + 4);

        // System.out.println(overallTwoStar + " " + overallThreeStar + " " + overallThreeStarLD + " " + overallFourStar + " " + overallFourStarLD + " " + overallFiveStar);

        twoStar = overallTwoStar;

        threeStar = overallThreeStar;
        threeStarLD = overallThreeStarLD;

        fourStarFst = overallFourStar;
        fourStarAby = overallFourStar;
        fourStarFrt = overallFourStar;
        fourStarShd = overallFourStar;

        fourStarL = overallFourStarLD;
        fourStarD = overallFourStarLD;

        fiveStarFst = overallFiveStar;
        fiveStarAby = overallFiveStar;
        fiveStarFrt = overallFiveStar;
        fiveStarShd = overallFiveStar;

        double[] friendshipList = getRates();

        friendshipList[findIndex("Valkyrie", 5)] = overallFiveStar;
        friendshipList[findIndex("Starlight", 5)] = overallFiveStar;
        friendshipList[findIndex("Ormus", 5)] = overallFiveStar;
        friendshipList[findIndex("Aidan", 5)] = overallFiveStar;

        int index = distribution(friendshipList);
        String hero = heroes[index];
        resetRates();
        return hero;
    }


    /*
     * Heroic summons
     */

    public String heroicSummonEvent()
    {
        overallThreeStar = 65.76 / threeCount;
        overallThreeStarLD = 11.08 / threeCountLD;
        overallFourStar = 16.8 / fourCount;
        overallFourStarLD = 3.2 / fourCountLD;
        overallFiveStar = 1.92 / fiveCount;
        overallFiveStarElite = 0.96 / fiveCountElite;
        overallFiveStarLD = 0.2 / fiveCountLD;
        overallFiveStarEliteLD = 0.08 / (fiveCountEliteLD + 1);
        eventHeroRate = overallFiveStarEliteLD;

        double eventHeroRateCopy = eventHeroRate;

        System.out.println(overallThreeStar + " " + overallThreeStarLD + " " + overallFourStar + " " + overallFourStarLD + " " + overallFiveStar + " " + overallFiveStarElite + " " + overallFiveStarLD + " " + overallFiveStarEliteLD);

        threeStar = overallThreeStar;
        threeStarLD = overallThreeStarLD;

        fourStarFst = overallFourStar;
        fourStarAby = overallFourStar;
        fourStarFrt = overallFourStar;
        fourStarShd = overallFourStar;

        fourStarL = overallFourStarLD;
        fourStarD = overallFourStarLD;

        fiveStarFst = overallFiveStar;
        fiveStarAby = overallFiveStar;
        fiveStarFrt = overallFiveStar;
        fiveStarShd = overallFiveStar;

        fiveStarL = overallFiveStarLD;
        fiveStarD = overallFiveStarLD;

        fiveStarEliteFst = overallFiveStarElite;
        fiveStarEliteAby = overallFiveStarElite;
        fiveStarEliteFrt = overallFiveStarElite;
        fiveStarEliteShd = overallFiveStarElite;

        fiveStarEliteL = overallFiveStarEliteLD;
        fiveStarEliteD = overallFiveStarEliteLD;
        int index;

        HSEventTotalDraws++;
        if(HSEventTotalDraws%500 == 0)
        {
            index = heroes.length-2;
        }
        else if(HSEventTotalDraws >= 400)
        {
            eventHeroRate = eventHeroRateCopy*5;
            index = distribution(getRates());
        }
        else if(HSEventTotalDraws >= 300)
        {
            eventHeroRate = eventHeroRateCopy*4;
            index = distribution(getRates());
        }
        else if(HSEventTotalDraws >= 200)
        {
            eventHeroRate = eventHeroRateCopy*3;
            index = distribution(getRates());
        }
        else if(HSEventTotalDraws >= 100)
        {
            eventHeroRate = eventHeroRateCopy*2;
            index = distribution(getRates());
        }
        else
        {
            index = distribution(getRates());
        }

        String hero = heroes[index];

        if(index == heroes.length-2)
        {
            HSEventTotalDraws = 0;
        }
        resetRates();
        return hero;
    }

    public String getHSEventTotalDraws()
    {
        Integer total = new Integer(HSEventTotalDraws);
        return total.toString();
    }

    public String heroicSummon()
    {
        overallThreeStar = 67.2/threeCount;
        overallThreeStarLD = 11.22 / threeCountLD;
        overallFourStar = 16.8/fourCount;
        overallFourStarLD = 3.2 / fourCountLD;
        overallFiveStar = 0.96 / fiveCount;
        overallFiveStarElite = 0.48 / fiveCountElite;
        overallFiveStarLD = 0.1 / fiveCountLD;
        overallFiveStarEliteLD = 0.04 / fiveCountEliteLD;

        System.out.println(overallThreeStar + " " + overallThreeStarLD + " " + overallFourStar + " " + overallFourStarLD + " " + overallFiveStar + " " + overallFiveStarElite + " " + overallFiveStarLD + " " + overallFiveStarEliteLD);


        threeStar = overallThreeStar;
        threeStarLD = overallThreeStarLD;

        fourStarFst = overallFourStar;
        fourStarAby = overallFourStar;
        fourStarFrt = overallFourStar;
        fourStarShd = overallFourStar;

        fourStarL = overallFourStarLD;
        fourStarD = overallFourStarLD;

        fiveStarFst = overallFiveStar;
        fiveStarAby = overallFiveStar;
        fiveStarFrt = overallFiveStar;
        fiveStarShd = overallFiveStar;

        fiveStarL = overallFiveStarLD;
        fiveStarD = overallFiveStarLD;

        fiveStarEliteFst = overallFiveStarElite;
        fiveStarEliteAby = overallFiveStarElite;
        fiveStarEliteFrt = overallFiveStarElite;
        fiveStarEliteShd = overallFiveStarElite;

        fiveStarEliteL = overallFiveStarEliteLD;
        fiveStarEliteD = overallFiveStarEliteLD;

        int index = distribution(getRates());
        String hero = heroes[index];
        resetRates();
        return hero;

    }


    /*
     * Prophet summons
     */

    public String prophetSummonFst()
    {
        fourStarShards = 7.0;
        fourStarFst = 60.0 / fourCountFst;
        fiveStarShards = 24;
        unNatfiveStarFst = 4.8 / unNatFiveCountFst;
        fiveStarFst = 2.8 / fiveCountFst;
        fiveStarEliteFst = 1.4 / fiveCountEliteFst;

        // System.out.println(fourStarShards + " " + fourStarFst + " " + fiveStarShards + " " + unNatfiveStarFst + " " + fiveStarFst + " " + fiveStarEliteFst);

        double[] prophFstList = getRates();

        int index = distribution(prophFstList);
        String hero = heroes[index];
        resetRates();
        return hero;
    }

    public String prophetSummonAby()
    {
        fourStarShards = 7.0;
        fourStarAby = 60.0 / fourCountAby;
        fiveStarShards = 24;
        unNatfiveStarAby = 4.8 / unNatFiveCountAby;
        fiveStarAby = 2.8 / (fiveCountAby - 1);
        fiveStarEliteAby = 1.4 / (fiveCountEliteAby + 1);

        // System.out.println(fourStarShards + " " + fourStarAby + " " + fiveStarShards + " " + unNatfiveStarAby + " " + fiveStarAby + " " + fiveStarEliteAby);

        double[] prophAbyList = getRates();
        prophAbyList[findIndex("Barea", 5)] = fiveStarEliteAby;

        int index = distribution(prophAbyList);
        String hero = heroes[index];
        resetRates();
        return hero;
    }

    public String prophetSummonFrt()
    {
        fourStarShards = 7.0;
        fourStarFrt = 60.0 / fourCountFrt;
        fiveStarShards = 24.0;
        unNatfiveStarFrt = 4.8 / unNatFiveCountFrt;
        fiveStarFrt = 2.8 / (fiveCountFrt - 1);
        fiveStarEliteFrt = 1.4 / (fiveCountEliteFrt + 1);

        // System.out.println(fourStarShards + " " + fourStarFrt + " " + fiveStarShards + " " + unNatfiveStarFrt + " " + fiveStarFrt + " " + fiveStarEliteFrt);

        double[] prophFrtList = getRates();
        prophFrtList[findIndex("Flame Strike", 5)] = fiveStarEliteFrt;

        int index = distribution(prophFrtList);
        String hero = heroes[index];
        resetRates();
        return hero;
    }

    public String prophetSummonShd()
    {
        fourStarShards = 7.0;
        fourStarShd = 60.0 / fourCountShd;
        fiveStarShards = 24.0;
        unNatfiveStarShd = 4.8 / unNatFiveCountShd;
        fiveStarShd = 2.8 / fiveCountShd;
        fiveStarEliteShd = 1.4 / fiveCountEliteShd;

        // System.out.println(fourStarShards + " " + fourStarShd + " " + fiveStarShards + " " + unNatfiveStarShd + " " + fiveStarShd + " " + fiveStarEliteShd);

        // Why is Aiden considered normal, but BB is considered elite in PO???
        // I understand some of the prophets above require one additional non-elite in the elite pool to balance the rates, but this is ridiculous
        double[] prophShdList = getRates();
        prophShdList[findIndex("Aidan", 5)] = fiveStarShd;
        prophShdList[findIndex("Blood Blade", 5)] = fiveStarEliteShd;

        int index = distribution(prophShdList);
        String hero = heroes[index];
        resetRates();
        return hero;
    }

    public String prophetSummonLD()
    {
        fourStarShardsL = 20.0;
        fourStarShardsD = fourStarShardsL;
        fourStarL = 28.0 / fourCountLD;
        fourStarD = fourStarL;
        fiveStarShards = 28.0;
        unNatfiveStarL = 3.0 / unNatFiveCountLD;
        unNatfiveStarD = unNatfiveStarL;
        fiveStarL = 0.8 / fiveCountLD;
        fiveStarD = fiveStarL;
        fiveStarEliteL = 0.2 / fiveCountEliteLD;
        fiveStarEliteD = fiveStarEliteL;

        System.out.println(fourStarShardsL + " " + fourStarShardsD + " " + fourStarL + " " + fourStarD + " " + fiveStarShards + " " + unNatfiveStarL + " " + unNatfiveStarD + " " + fiveStarL + " " + fiveStarD + " " + fiveStarEliteL + " " + fiveStarEliteD);

        int index = distribution(getRates());
        String hero = heroes[index];
        resetRates();
        return hero;
    }


    /*
     * Three star shards
     */

    // Idk if I will add three stars in the future or not
    // Initially, I forgot to implement this function in the app itself
    public String threeStarShardSummon()
    {
        threeStar = 4.8;
        threeStarLD = 2;

        int index = distribution(getRates());
        String hero = heroes[index];
        resetRates();
        return hero;
    }

    /*
     * Four star shards
     */

    public String fourStarShardSummon()
    {
        overallFourStar = 98.0 / fourCount;
        overallFourStarLD = 2.0 / fourCountLD;

        fourStarFst = overallFourStar;
        fourStarAby = overallFourStar;
        fourStarFrt = overallFourStar;
        fourStarShd = overallFourStar;

        fourStarL = overallFourStarLD;
        fourStarD = overallFourStarLD;

        int index = distribution(getRates());
        String hero = heroes[index];
        resetRates();
        return hero;
    }

    public String fourStarShardSummonFst()
    {
        fourStarFst = 100.0 / fourCountFst;

        int index = distribution(getRates());
        String hero = heroes[index];
        resetRates();
        return hero;
    }

    public String fourStarShardSummonAby()
    {
        fourStarAby = 100.0 / fourCountAby;

        int index = distribution(getRates());
        String hero = heroes[index];
        resetRates();
        return hero;
    }

    public String fourStarShardSummonFrt()
    {
        fourStarFrt = 100.0 / fourCountFrt;

        int index = distribution(getRates());
        String hero = heroes[index];
        resetRates();
        return hero;
    }

    public String fourStarShardSummonShd()
    {
        fourStarShd = 100.0 / fourCountShd;

        int index = distribution(getRates());
        String hero = heroes[index];
        resetRates();
        return hero;
    }

    public String fourStarShardSummonL()
    {
        fourStarL = 100.0 / fourCountL;

        int index = distribution(getRates());
        String hero = heroes[index];
        resetRates();
        return hero;
    }

    public String fourStarShardSummonD()
    {
        fourStarD = 100.0 / fourCountD;

        int index = distribution(getRates());
        String hero = heroes[index];
        resetRates();
        return hero;
    }

    /*
     * 5 star shards
     */

    public String fiveStarShardSummon()
    {
        overallFiveStar = 100.0 / (fiveCount + 4);
        // System.out.println(overallFiveStar);

        fiveStarFst = overallFiveStar;
        fiveStarAby = overallFiveStar;
        fiveStarFrt = overallFiveStar;
        fiveStarShd = overallFiveStar;

        double[] fiveStarList = getRates();

        fiveStarList[findIndex("Valkyrie", 5)] = overallFiveStar;
        fiveStarList[findIndex("Starlight", 5)] = overallFiveStar;
        fiveStarList[findIndex("Ormus", 5)] = overallFiveStar;
        fiveStarList[findIndex("Aidan", 5)] = overallFiveStar;

        int index = distribution(fiveStarList);
        String hero = heroes[index];
        resetRates();
        return hero;
    }

    public String fiveStarShardSummonFst()
    {
        fiveStarFst = 100.0 / (fiveCountFst + 2);
        // System.out.println(fiveStarFst);

        double[] fiveStarFstList = getRates();

        fiveStarFstList[findIndex("Valkyrie", 5)] = fiveStarFst;
        fiveStarFstList[findIndex("Starlight", 5)] = fiveStarFst;

        int index = distribution(fiveStarFstList);
        String hero = heroes[index];
        resetRates();
        return hero;
    }

    public String fiveStarShardSummonAby()
    {
        fiveStarAby = 100.0 / fiveCountAby;
        // System.out.println(fiveStarAby);

        double[] fiveStarAbyList = getRates();

        int index = distribution(fiveStarAbyList);
        String hero = heroes[index];
        resetRates();
        return hero;
    }

    public String fiveStarShardSummonFrt()
    {
        fiveStarFrt = 100.0 / (fiveCountFrt + 1);
        // System.out.println(fiveStarFrt);

        double[] fiveStarFrtList = getRates();

        fiveStarFrtList[findIndex("Ormus", 5)] = fiveStarFrt;

        int index = distribution(fiveStarFrtList);
        String hero = heroes[index];
        resetRates();
        return hero;
    }

    public String fiveStarShardSummonShd()
    {
        fiveStarShd = 100.0 / (fiveCountShd + 1);
        // System.out.println(fiveStarShd);

        double[] fiveStarShdList = getRates();

        fiveStarShdList[findIndex("Aidan", 5)] = overallFiveStar;

        int index = distribution(fiveStarShdList);
        String hero = heroes[index];
        resetRates();
        return hero;
    }

    public String fiveStarShardSummonL()
    {
        fiveStarL = 100.0 / fiveCountL;
        // System.out.println(fiveStarL);

        int index = distribution(getRates());
        String hero = heroes[index];
        resetRates();
        return hero;
    }

    public String fiveStarShardSummonD()
    {
        fiveStarD = 100.0 / fiveCountD;
        // System.out.println(fiveStarD);

        int index = distribution(getRates());
        String hero = heroes[index];
        resetRates();
        return hero;
    }

    // WHY are some heroes more elite than others? "All heroes are elite, but some heroes are more elite than others." - George Orwell (probably)
    public String fiveStarEliteShardSummon()
    {
        overallFiveStarElite = 0.77;

        fiveStarEliteFst = overallFiveStarElite;
        fiveStarEliteAby = overallFiveStarElite;
        fiveStarEliteFrt = overallFiveStarElite;
        fiveStarEliteShd = overallFiveStarElite;

        double[] eliteList = getRates();

        double lowerRates = 4.375;
        eliteList[findIndex("King Barton", 5)] = lowerRates;
        eliteList[findIndex("Kamath", 5)] = lowerRates;
        eliteList[findIndex("Skerei", 5)] = lowerRates;
        eliteList[findIndex("Corpsedemon", 5)] = lowerRates;
        eliteList[findIndex("Vesa", 5)] = lowerRates;
        eliteList[findIndex("Sigmund", 5)] = lowerRates;
        eliteList[findIndex("Valentino", 5)] = lowerRates;
        eliteList[findIndex("Oberon", 5)] = lowerRates;

        double upperRates = 5.625;
        eliteList[findIndex("Garuda", 5)] = upperRates;
        eliteList[findIndex("Heart Watcher", 5)] = upperRates;
        eliteList[findIndex("Penny", 5)] = upperRates;
        eliteList[findIndex("Horus", 5)] = upperRates;
        eliteList[findIndex("Kroos", 5)] = upperRates;
        eliteList[findIndex("Jahra", 5)] = upperRates;
        eliteList[findIndex("Cthugha", 5)] = upperRates;
        eliteList[findIndex("Xia", 5)] = upperRates;

        double none = 0;
        eliteList[findIndex("Valkyrie", 5)] = none;
        eliteList[findIndex("Starlight", 5)] = none;
        eliteList[findIndex("Ormus", 5)] = none;
        eliteList[findIndex("Aidan", 5)] = none;

        int index = distribution(eliteList);
        String hero = heroes[index];
        resetRates();
        return hero;
    }

    // What did FB and Belrain ever do to you? :(
    public String fiveStarEliteShardSummonL()
    {
        fiveStarEliteL = 40.0 / (fiveCountEliteL - 2);

        double[] eliteListL = getRates();

        double upperRates = 60.0 / 2;
        eliteListL[findIndex("Belrain", 5)] = upperRates;
        eliteListL[findIndex("Faith Blade", 5)] = upperRates;

        System.out.println(fiveStarEliteL + " " + upperRates);

        int index = distribution(eliteListL);
        String hero = heroes[index];
        resetRates();
        return hero;
    }

    public String fiveStarEliteShardSummonD()
    {
        fiveStarEliteD = 40.0 / (fiveCountEliteD - 2);

        double[] eliteListD = getRates();

        double upperRates = 60.0 / 2;
        eliteListD[findIndex("Mihm", 5)] = upperRates;
        eliteListD[findIndex("Amuvor", 5)] = upperRates;

        System.out.println(fiveStarEliteD + " " + upperRates);

        int index = distribution(eliteListD);
        String hero = heroes[index];
        resetRates();
        return hero;
    }

    public String[] getCompassRegHeroes()
    {
        int first = findIndex("Vesa", 5);
        int last = findIndex("Michelle", 5) - 1;
        // System.out.println(first + " " + heroes[first]);
        // System.out.println(last + " " + heroes[last]);

        String[] regularHeroes = new String[(last-first) + 1];

        for(int i = 0; i <= last-first; i++)
        {
            regularHeroes[i] = heroes[first + i];
        }

        /*
        for(int i = 0; i < regularHeroes.length; i++)
        {
            System.out.println(regularHeroes[i]);
        }
        */

        return regularHeroes;
    }

    public String[] getCompassLDHeroes()
    {
        int first = findIndex("Faith Blade", 5);
        int last = findIndex("5 Star Shards") - 1;
        // System.out.println(first + " " + heroes[first]);
        // System.out.println(last + " " + heroes[last]);

        String[] ldHeroes = new String[(last-first) + 1];

        for(int i = 0; i <= last-first; i++)
        {
            ldHeroes[i] = heroes[first + i];
        }

        /*
        for(int i = 0; i < ldHeroes.length; i++)
        {
            System.out.println(ldHeroes[i]);
        }
        */

        return ldHeroes;
    }

    public String compassOfTranscendedFate(String heroReg, String heroLD)
    {
        overallUnNatFiveStarLD = 10.0 / unNatFiveCountLD;
        overallUnNatFiveStar = 52.0 / unNatFiveCount;
        overallFiveStar = 28.0 / fiveCount;
        overallFiveStarLD = 5.0 / fiveCountLD;
        overallFiveStarElite = 4.0 / fiveCountElite;
        overallFiveStarEliteLD = 1.0 / fiveCountEliteLD;
        overallCoTRate = 6.67;
        // System.out.println(overallUnNatFiveStarLD + " " + overallUnNatFiveStar + " " + overallFiveStar + " " + overallFiveStarLD + " " + overallFiveStarElite + " " + overallFiveStarEliteLD + " " + overallCoTRate);


        unNatfiveStarL = overallUnNatFiveStarLD;
        unNatfiveStarD = overallUnNatFiveStarLD;

        unNatfiveStarFst = overallUnNatFiveStar;
        unNatfiveStarAby = overallUnNatFiveStar;
        unNatfiveStarFrt = overallUnNatFiveStar;
        unNatfiveStarShd = overallUnNatFiveStar;

        fiveStarFst = overallFiveStar;
        fiveStarAby = overallFiveStar;
        fiveStarFrt = overallFiveStar;
        fiveStarShd = overallFiveStar;

        fiveStarL = overallFiveStarLD;
        fiveStarD = overallFiveStarLD;

        fiveStarEliteFst = overallFiveStarElite;
        fiveStarEliteAby = overallFiveStarElite;
        fiveStarEliteFrt = overallFiveStarElite;
        fiveStarEliteShd = overallFiveStarElite;

        fiveStarEliteL = overallFiveStarEliteLD;
        fiveStarEliteD = overallFiveStarEliteLD;

        CoTRate = overallCoTRate;

        compassHeroRate += 0.1;
        compassHeroLDRate += 0.025;
        compassTotalDraws = 0;

        double[] compassList = getRates();
        compassList[findIndex(heroReg)] = compassHeroRate;
        compassList[findIndex(heroLD)] = compassHeroLDRate;

        int index = distribution(compassList);
        String hero = heroes[index];

        if(index == findIndex(heroReg))
        {
            compassHeroRate = resetCompassHeroRate;
        }
        if(index == findIndex(heroLD))
        {
            compassHeroLDRate = resetCompassHeroLDRate;
        }

        resetRates();
        // printCompassRates();
        return hero;
    }

    public String compassOfTranscendedGuidance(String heroReg, String heroLD)
    {
        overallUnNatFiveStarLD = 10.0 / unNatFiveCountLD;
        overallUnNatFiveStar = 52.0 / unNatFiveCount;
        overallFiveStar = 28.0 / fiveCount;
        overallFiveStarLD = 5.0 / fiveCountLD;
        overallFiveStarElite = 4.0 / fiveCountElite;
        overallFiveStarEliteLD = 1.0 / fiveCountEliteLD;
        // System.out.println(overallUnNatFiveStarLD + " " + overallUnNatFiveStar + " " + overallFiveStar + " " + overallFiveStarLD + " " + overallFiveStarElite + " " + overallFiveStarEliteLD);


        unNatfiveStarL = overallUnNatFiveStarLD;
        unNatfiveStarD = overallUnNatFiveStarLD;

        unNatfiveStarFst = overallUnNatFiveStar;
        unNatfiveStarAby = overallUnNatFiveStar;
        unNatfiveStarFrt = overallUnNatFiveStar;
        unNatfiveStarShd = overallUnNatFiveStar;

        fiveStarFst = overallFiveStar;
        fiveStarAby = overallFiveStar;
        fiveStarFrt = overallFiveStar;
        fiveStarShd = overallFiveStar;

        fiveStarL = overallFiveStarLD;
        fiveStarD = overallFiveStarLD;

        fiveStarEliteFst = overallFiveStarElite;
        fiveStarEliteAby = overallFiveStarElite;
        fiveStarEliteFrt = overallFiveStarElite;
        fiveStarEliteShd = overallFiveStarElite;

        fiveStarEliteL = overallFiveStarEliteLD;
        fiveStarEliteD = overallFiveStarEliteLD;


        int index;

        compassHeroRate += 0.1;
        compassHeroLDRate += 0.025;
        compassTotalDraws++;

        if(compassTotalDraws == 15)
        {
            compassTotalDraws = 0;
            index = heroes.length-1;
        }
        else
        {
            double[] compassList = getRates();
            compassList[findIndex(heroReg)] = compassHeroRate;
            compassList[findIndex(heroLD)] = compassHeroLDRate;

            index = distribution(compassList);
        }
        String hero = heroes[index];

        if(index == findIndex(heroReg))
        {
            compassHeroRate = resetCompassHeroRate;
        }
        if(index == findIndex(heroLD))
        {
            compassHeroLDRate = resetCompassHeroLDRate;
        }
        resetRates();
        // printCompassRates();
        return hero;
    }

    public int findIndex(String heroName)
    {
        return Arrays.asList(heroes).lastIndexOf(heroName);
    }

    public int findIndex(String heroName, int star)
    {
        String strInt = String.valueOf(star);

        String[] heroesCopy = new String[heroes.length];
        for(int i = 0; i < heroes.length; i++)
        {
            heroesCopy[i] = heroes[i].toLowerCase();
        }


        heroName = heroName.toLowerCase();
        String output = heroName + "- " + strInt + "*";

        return Arrays.asList(heroesCopy).lastIndexOf(output);
    }

    public void printCompassRates()
    {
        System.out.println("Hero rate: "+String.format("%.2f", compassHeroRate));
        System.out.println("Hero LD rate: "+String.format("%.3f", compassHeroLDRate));
    }

    public String getCompassRegRate()
    {
        return String.format("%.2f", compassHeroRate);
    }

    public String getCompassLDRate()
    {
        return String.format("%.3f", compassHeroLDRate);
    }

    public void printTotalSize()
    {
        System.out.println(heroes.length);
    }

    public void printIndex(int find)
    {
        System.out.println(heroes[find]);
    }

    public int getTotalSize() { return heroes.length; }

    public String returnIndex(int find)
    {
        return heroes[find];
    }

    public String returnCompassTotalDraws()
    {
        Integer total = new Integer(compassTotalDraws);
        return total.toString();
    }

    public String compareLengths()
    {
        if(heroes.length < getRates().length)
        {
            return "Rates list longer than hereos list";
        }
        else if(heroes.length > getRates().length)
        {
            return "Heroes list longer than rates list";
        }
        else
        {
            return "Sizes are equal";
        }
    }

}

