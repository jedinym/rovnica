package map;

import java.util.Scanner;


public class Linearna extends Rovnica
{
    private float koren;

    private static Scanner sc = new Scanner(System.in);

    public Linearna(float _a, float _b)
    {
        a = _a;
        b = _b;
    }

    public Linearna(float _a)
    {
        this(_a,_a);
    }

    public Linearna()
    {
        System.out.println("Zadaj koeficient a: ");
        a = getFloat(false, sc.nextLine());
        System.out.println("Zadaj koeficient b: ");
        b = getFloat(true, sc.nextLine());
    }

    @Override
    public void vypisRovnicu()
    {
        System.out.printf("%.2fx%+.2f = 0 \n", a, b);
    }

    @Override
    public float[] getKorene()
    {
        if (a == 0)
        {
            return null;
        }

        float[] arr = new float[1];

        arr[0] = -(b/a);

        return arr;
    }

    @Override
    protected void vypisKorene()
    {
        System.out.printf("Koren je %f\n", getKorene()[0]);
    }

    @Override
    public String toString()
    {
        return String.format("%.2fx %+.2f = 0 \n", a, b);
    }
}
