package map;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Rovnica
{
    protected float a;
    protected float b;

    protected abstract void vypisRovnicu();
    protected abstract float[] getKorene();
    protected abstract void vypisKorene();
    public abstract String toString();

    protected float getFloat(boolean alZero, String text) //TODO: FIX FOR float text
    {
        Scanner sc = new Scanner(text);
        Scanner s2 = new Scanner(System.in);

        float a;

        while (true)
        {
            try
            {
                a = sc.nextFloat();

                if (!alZero && a == 0)
                {
                    throw new ZeroException();
                }

                return a;
            }
            catch (InputMismatchException ex)
            {
                System.out.println("Musi byt typ float!");
                sc = new Scanner(s2.nextLine());
            }
            catch (ZeroException ex)
            {
                System.out.println("Nesmie byt 0!");
                sc = new Scanner(s2.nextLine());
            }
        }
    }

    private static class ZeroException extends Exception{}
}
