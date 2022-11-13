import java.util.function.Supplier;
interface Secret {
    void magic(double d);
}
class Secret1 implements Secret {
    String str="poof";
    public void magic(double d) {
        Supplier<String> lambda = () -> str;
        System.out.println(lambda.get());
    }
}