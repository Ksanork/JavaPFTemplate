package mj.template.javapftemplates.ejb.facades;

import javax.ejb.Stateless;
import java.util.concurrent.ThreadLocalRandom;

@Stateless
public class RandomFacade {

    public int randomInt() {
        return ThreadLocalRandom.current().nextInt(0, 100);
    }

    public double randomDouble() {
        return ThreadLocalRandom.current().nextDouble(0, 100);
    }
}
