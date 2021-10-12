package mj.template.javapftemplates.ejb.facades;

import javax.ejb.Stateless;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

@Stateless
public class RandomFacade {

    public int randomInt() {
        return ThreadLocalRandom.current().nextInt(0, 100);
    }

    public double randomDouble() {
        return ThreadLocalRandom.current().nextDouble(0, 100);
    }

    public List<Double> randomDoubleList(int size) {
        List<Double> doubleList = ThreadLocalRandom.current()
                .doubles(0, 100)
                .limit(10)
                .boxed()
                .collect(Collectors.toList());

        return doubleList;
    }
}
