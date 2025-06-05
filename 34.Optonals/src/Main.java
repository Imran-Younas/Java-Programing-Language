import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Optional<String> name = Optional.of("Imran Younas");

        name.ifPresent(n -> System.out.println("Name: " + n));

        Optional<String> emptyName = Optional.empty();


        String finalName = emptyName.orElse("Unknown");
        System.out.println("Final name: " + finalName);
    }
}
