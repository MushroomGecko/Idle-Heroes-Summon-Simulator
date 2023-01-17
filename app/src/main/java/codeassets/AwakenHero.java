package codeassets;

public class AwakenHero {
    private double eminus;
    private double e;
    private double eplus;

    private double dminus;
    private double d;
    private double dplus;

    private double cminus;
    private double c;
    private double cplus;

    private double bminus;
    private double b;
    private double bplus;

    private double aminus;
    private double a;
    private double aplus;

    private double s;

    public AwakenHero()
    {
        eminus = 4.3;
        e = 19.8;
        eplus = 28.8;

        dminus = 20;
        d = 9.2;
        dplus = 4.8;

        cminus = 4.4;
        c = 4.3;
        cplus = 2.13;

        bminus = 1.62;
        b = 0.55;
        bplus = 0.0745;

        aminus = 0.015;
        a = 0.0065;
        aplus = 0.0025;

        s = 0.0015;
    }

    private static final String awaken[] =
            {
                    "E-", "E", "E+",
                    "D-", "D", "D+",
                    "C-", "C", "C+",
                    "B-", "B", "B+",
                    "A-", "A", "A+",
                    "S"
            };

    public String[] getAwakenTiers()
    {
        return awaken;
    }

    public double[] getRates()
    {
        double pullRates[] =
                {
                        eminus, e, eplus,
                        dminus, d, dplus,
                        cminus, c, cplus,
                        bminus, b, bplus,
                        aminus, a, aplus,
                        s
                };
        return pullRates;
    }

    public static int distribution(double items[])
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

    public String pullAwakening()
    {
        int index = distribution(getRates());
        String status = awaken[index];
        return status;
    }
}
