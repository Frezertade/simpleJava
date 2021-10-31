package hello;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class GreeterTest {
    private Greeter greeter = new Greeter();
    @Test
    public void greeterSayHello(){
        assertThat(greeter.sayHello(),containsString("Hello"));
    }
    @Test
    public void sayGoodMorning(){
        assertThat(greeter.sayGoodMorning(),containsString("Morning"));
    }
    @Test
    public void sayGoodEvening(){
        assertThat(greeter.sayGoodEvening(),containsString("Evening"));
    }
    @Test
    public void sayGoodNight(){
        assertThat(greeter.sayGoodNight(),containsString("Night"));
    }
}
