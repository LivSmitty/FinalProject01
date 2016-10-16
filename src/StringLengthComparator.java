import java.util.Comparator;

/**
 * Created by scott_000 on 10/15/2016.
 */
class AlphabeticalOrder implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {

        return o1.compareTo(o2);
    }
}
