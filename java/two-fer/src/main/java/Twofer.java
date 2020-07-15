import java.util.Optional;

public class Twofer {
    public String twofer(String name) {
        return "One for " + Optional.ofNullable(name).orElse("you") + ", one for me.";
    }
}