import com.cosef.abstractFactory.SuvFactory;
import com.cosef.abstractFactory.VehicleProductionManager;
import com.cosef.builder.AmericanoBuilder;
import com.cosef.builder.CoffeeDirector;
import com.cosef.builder.EspressoBuilder;
import com.cosef.decorator.*;
import com.cosef.factory.Dictionary;
import com.cosef.factory.EnglishDictionary;
import com.cosef.factory.TurkishDictionary;

public class Main {

    public static void main(String[] args) {

        //testBuilder();
        //testFactory();
        //testAbstractFactory();
        //testDecorator();

    }

    private static void testDecorator() {
        Type movie = new Movie("Reservoir Dogs", "Tarantino");
        movie = new Action(movie);
        movie = new Detective(movie);
        System.out.println(movie.getContents());

        Type book = new Book("Ýnce Memed", "Yaþar Kemal");
        book = new Biographical(book);
        book = new Action(book);
        System.out.println(book.getContents());
    }

    private static void testAbstractFactory() {
        VehicleProductionManager vehicleProductionManager = new VehicleProductionManager(new SuvFactory());
        vehicleProductionManager.choose();
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
