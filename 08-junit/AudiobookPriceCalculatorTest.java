package put.io.testing.audiobooks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//5.1 White-box
//5.2 4

class AudiobookPriceCalculatorTest {

    @Test
    public void SubscriberTest(){
        Customer klient = new Customer("Krzyś", Customer.LoyaltyLevel.SILVER,true);
        Audiobook audiobook = new Audiobook("Zimny płomień",100);
        AudiobookPriceCalculator kalkulator = new AudiobookPriceCalculator();
        assertEquals(0,kalkulator.calculate(klient,audiobook));
    }
    @Test
    public void SilverTest(){
        Customer klient = new Customer("Krzyś", Customer.LoyaltyLevel.SILVER,false);
        Audiobook audiobook = new Audiobook("Zimny płomień",100);
        AudiobookPriceCalculator kalkulator = new AudiobookPriceCalculator();
        assertEquals(90,kalkulator.calculate(klient,audiobook));
    }
    @Test
    public void GoldTest(){
        Customer klient = new Customer("Krzyś", Customer.LoyaltyLevel.GOLD,false);
        Audiobook audiobook = new Audiobook("Zimny płomień",100);
        AudiobookPriceCalculator kalkulator = new AudiobookPriceCalculator();
        assertEquals(80,kalkulator.calculate(klient,audiobook));
    }
    @Test
    public void StandardTest(){
        Customer klient = new Customer("Krzyś", Customer.LoyaltyLevel.STANDARD,false);
        Audiobook audiobook = new Audiobook("Zimny płomień",100);
        AudiobookPriceCalculator kalkulator = new AudiobookPriceCalculator();
        assertEquals(100,kalkulator.calculate(klient,audiobook));
    }
}