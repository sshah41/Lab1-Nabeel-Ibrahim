import org.junit.jupiter.api.Test;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;


class LaboneTest {
    @Test
    void main() {

    }

    @Test
    public void resultEquals1() {
        Labone lab1=new Labone();
        String expected[]=new String[]{"1"};
        assertArrayEquals(expected,lab1.fizzBuzz(1));

    }
    @Test
    public void resultEquals7() {
        Labone lab1=new Labone();
        String expected[]=new String[]{"1","2","fizz","4","buzz","fizz","7"};
        assertArrayEquals(expected,lab1.fizzBuzz(7));

    }
    @Test
    public void resultEquals17() {
        Labone lab1=new Labone();
        String expected[]=new String[]{"1","2","fizz","4","buzz","fizz","7","8","fizz","buzz","11","fizz","13","14","fizz buzz","16","17"};
        assertArrayEquals(expected,lab1.fizzBuzz(17));

    }


}


