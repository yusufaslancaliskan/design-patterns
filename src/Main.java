import com.cosef.builder.AmericanoBuilder;
import com.cosef.builder.CoffeeDirector;
import com.cosef.builder.EspressoBuilder;

public class Main {

    public static void main(String[] args) {

        CoffeeDirector barista = new CoffeeDirector(new EspressoBuilder());
        barista.hazirla();
        barista.changeBuilder(new AmericanoBuilder());
        barista.hazirla();

    }
}
