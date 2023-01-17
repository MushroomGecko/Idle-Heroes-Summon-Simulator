package codeassets;

import java.util.Arrays;

public class SkinSummon {
    private static final String skins[] =
            {
                    "King of War- Asmodel", "Arrival of Demon- Barea", "Black Warrior- Das Moge", "Champion Golden Sword- Iceblink", "Arctic Blade- Blood Blade",
                    "Last Wish- Demon Hunter", "Night Witch- Malassa", "Chaos Messenger- Faith Blade", "Celestial Messenger- Amuvor", "Gothic Alice- Vesa",
                    "Miss Storm- Flame Strike", "Legend of the Dead- Corpsedemon", "No.0- Karim", "Dragon Warrior- Miki", "Wandering Soul- Aiden",
                    "Dr. Ormus- Ormus", "Galaxy Defender- Groo", "Forest Guardian- Rosa", "Gothic Queen- Margaret", "Cowboy in the Wilderness- Eddga",
                    "Devil Regeneration- Walter", "Apocalypse*Blast- Mirage", "Doomsday Killer- Faceless", "BBQ Master- Fat Mu", "The Great Magician- Field",
                    "Half-dragon- Dragon Slayer", "Arctic Tundra- Dantalian", "Shapeshifter- Sleepless", "Original Sin*Bloodmist- Baade", "Christmas Elf- Valkyrie"
            };
    private double rate;

    public SkinSummon()
    {
        rate = 100.0 / skins.length;
    }

    public double[] getRates()
    {
        double pullRates[] =
                {
                        rate, rate, rate, rate, rate,
                        rate, rate, rate, rate, rate,
                        rate, rate, rate, rate, rate,
                        rate, rate, rate, rate, rate,
                        rate, rate, rate, rate, rate,
                        rate, rate, rate, rate, rate
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

    public String pullSkin()
    {
        int index = distribution(getRates());
        String skin = skins[index];
        return skin;
    }

    public int findIndex(String skinName)
    {
        int index = Arrays.asList(skins).lastIndexOf(skinName);
        return index;
    }


}
