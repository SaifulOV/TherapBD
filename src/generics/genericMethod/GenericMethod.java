package generics.genericMethod;

import java.util.List;

public class GenericMethod {
    public static <T> boolean findElementInList(T obj, List<T> list) {
        for (T elements : list) {
            if (elements.equals(obj))
                return true;
        }

        return false;
    }
}
