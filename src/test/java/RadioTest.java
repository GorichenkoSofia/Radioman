import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void test() {
        Radio radio = new Radio();
        radio.setStationNumber(4);

        int expected = 4;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void test2() {
        Radio radio = new Radio();
        radio.setStationNumber(15);

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void test3() {
        Radio radio = new Radio();
        radio.setStationNumber(-5);

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void test4() {
        Radio radio = new Radio();
        radio.setStationNumber(0);

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void test5() {
        Radio radio = new Radio();
        radio.setStationNumber(9);
        radio.next();

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        Radio radio = new Radio();
        radio.setStationNumber(9);
        radio.next();

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test7() {
        Radio radio = new Radio();
        radio.setStationNumber(9);
        radio.prev();

        int expected = 8;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test8() {
        Radio radio = new Radio();
        radio.setStationNumber(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test9() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.volumeMax();

        int expected = 10;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test10() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.volumeMin();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}
