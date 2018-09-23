package generics.genericClass;

public class Main {
    public static void main(String[] args) {
        Foo<String> stringFoo = new Foo<>();
        stringFoo.setObj("islam");
        System.out.println(stringFoo.getObj());
    }
}
