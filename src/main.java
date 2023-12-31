import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Care drink1 = new Care("hot coffee", "hot", 300);
        Care drink2 = new Care("ice coffee", "cold", 300);
        Care drink3 = new Care("special coffee", "hot", 500);
        Care drink4 = new Care("wow coffee", "apollon", 1000000000);

        List<Care> menulist = new ArrayList<>();
        menulist.add(drink1);
        menulist.add(drink2);
        menulist.add(drink3);
        menulist.add(drink4);

        menulist.stream()
                .filter(Care -> Care.getTemperture().equals("apollon"))
                .forEach(Care -> {
                    System.out.println("^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^");
                    System.out.println("メニュー名：" + Care.getName());
                    System.out.println("値段：" + Care.getPrice());
                    System.out.println("^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^");
                });
    }
}