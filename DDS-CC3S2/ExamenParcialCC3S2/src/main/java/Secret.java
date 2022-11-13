import java.util.function.Consumer;
interface Secret {
    void magic(double d);
}
class Secret1 implements Secret {
    public void magic(double d) {
        Consumer<String> lambda = s ->System.out.println("poof");
    }
}