package Listing_8_3;
import Listing_8_1.Pair;

public class PairAlg {
    public static boolean hasNulls(Pair<?> p) {
        return p.getFirst() == null || p.getSecond() == null;
    }

    public static void swap(Pair<?> p) { swapHelper(p); }

    public static <T> void swapHelper(Pair<T> p) {
        T temp = p.getFirst();
        p.setFirst(p.getSecond());
        p.setSecond(temp);
    }
}