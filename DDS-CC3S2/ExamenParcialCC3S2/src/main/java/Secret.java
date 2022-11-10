import java.util.function.Predicate;
interface Secret {
    String magic(double d);
}
class Secret1 implements Secret {
    public String magic(double d) {
        d=1;
        Predicate<Double> pred= s -> s<10;
        String result=pred.test(d)?"poof":"";
        return result;
    }
}