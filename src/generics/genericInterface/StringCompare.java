package generics.genericInterface;

public class StringCompare implements Comparetor<String> {

    @Override
    public int comparetor(String obj1, String obj2) {
        return obj1.length() - obj2.length();
    }
}
