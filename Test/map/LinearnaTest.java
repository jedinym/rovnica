package map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinearnaTest
{
    Linearna a;
    Linearna b;
    Linearna c;


    @BeforeEach
    void setUp()
    {
        a = new Linearna(1,1);
        b = new Linearna(-3, 6);
        c = new Linearna(-3, 3);
    }

    @Test
    void getKorene()
    {

    }
}
