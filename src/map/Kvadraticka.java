package map;

import java.util.Scanner;
import java.lang.Math;

public class Kvadraticka extends Rovnica
{
    private float c;

    public Kvadraticka(float _a, float _b, float _c) //TODO: osetri a = 0
    {
        a = _a;
        b = _b;
        c = _c;
    }


    @Override
    protected void vypisRovnicu()
    {
        System.out.printf("%.2fx^2 %+.2fy %.2f \n", a, b, c);
    }

    @Override
    protected float[] getKorene()
    {
        float diskriminant = (b*b) - (4*a*c);

        float[] korene = null;

        if (diskriminant > 0)
        {
            korene = new float[2];

            korene[0] = (-b + (float)Math.sqrt((double)diskriminant)) / 2 * a;
            korene[1] = (-b - (float)Math.sqrt((double)diskriminant)) / 2 * a;
        }
        else if (diskriminant == 0)
        {
            korene = new float[1];
            korene[0] = (-b /(2 * a));
        }
        else
        {
            System.out.println("Rovnica nema riesenie v realnych cislach");
            return null;
        }

        return korene;
    }

    @Override
    protected void vypisKorene()
    {
        float[] korene = getKorene();

        if (korene != null)
        {
            if (korene.length == 2)
            {
                System.out.printf("Korene rovnice su %.2f a %.2f", korene[0], korene[1]);
            }
            else
            {
                System.out.printf("Rovnica ma jeden dvojnasobny koren %.2f", korene[0]);
            }
        }
    }

    @Override
    public String toString()
    {
        return null;
    }
}
