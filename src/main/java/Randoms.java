import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int min, max;

    public Randoms(int min, int max) {
        this.random = new Random();
        this.min = min;
        this.max = max;
    }

    public int getRandom() {
        return random.nextInt(max - min) + 1 + min;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator(this);
    }
}