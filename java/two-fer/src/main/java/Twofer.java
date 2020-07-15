import java.util.Optional;

public class Twofer {
    public String twofer(String name) {
        Optional<String> nameOptional = Optional.ofNullable(name);
        if(!nameOptional.isPresent()) {
            name = "you";
        }

        return "One for " + name + ", one for me.";
    }
}