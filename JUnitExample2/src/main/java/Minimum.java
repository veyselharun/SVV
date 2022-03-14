import java.util.Iterator;
import java.util.List;


public class Minimum {

    /**
     * Returns the mininum element in a list
     * @param list Comparable list of elements to search
     * @return the minimum element in the list
     * @throws NullPointerException if list is null or
     *         if any list elements are null
     * @throws ClassCastException if list elements are not mutually comparable
     * @throws IllegalArgumentException if list is empty
     */
    public static <T extends Comparable<? super T>> T findMin (List<? extends T> list) {

        if (list == null) {
            // throw new IllegalArgumentException("IllegalArgumentException Exception. List is null.");
            throw new NullPointerException("NullPointer Exception. The list is null.");
        }

        if (list.size() == 0) {
            throw new IllegalArgumentException("IllegalArgument Exception. The list is empty.");
        }

        Iterator<? extends T> itr = list.iterator();
        T result = itr.next();

        // Other elements may also be Null. They should also be checked.
        if (result == null) throw new NullPointerException("NullPointer Exception. The first element is null.");

        // Should also check NullPointerException and ClassCastException in this loop.
        while (itr.hasNext()) {
            T comp = itr.next();
            if (comp.compareTo(result) < 0) {
                result = comp;
            }
        }
        return result;
    }

}
