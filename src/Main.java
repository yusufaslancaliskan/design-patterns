import com.cosef.builder.AmericanoBuilder;
import com.cosef.builder.CoffeeDirector;
import com.cosef.builder.EspressoBuilder;
import com.cosef.factory.Dictionary;
import com.cosef.factory.EnglishDictionary;
import com.cosef.factory.TurkishDictionary;

public class Main {

    public static void main(String[] args) {

        //testBuilder();
        //testFactory();


    }

    private static void testFactory() {
        Dictionary dictionary;
        String word = "merhaba";
        if (word.equals("hi")) {
            dictionary = new EnglishDictionary();
        } else {
            dictionary = new TurkishDictionary();
        }

        dictionary.translate();
    }

    private static void testBuilder() {
        CoffeeDirector barista = new CoffeeDirector(new EspressoBuilder());
        barista.hazirla();
        barista.changeBuilder(new AmericanoBuilder());
        barista.hazirla();
    }
}
