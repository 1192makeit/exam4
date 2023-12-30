import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        care drink1 = new care("hot coffee", "hot", 300);
        care drink2 = new care("ice coffee", "cold", 300);
        care drink3 = new care("special coffee", "hot", 500);
        care drink4 = new care("wow coffee", "apollon", 1000000000);

        List<care> menulist = new ArrayList<>();
        menulist.add(drink1);
        menulist.add(drink2);
        menulist.add(drink3);
        menulist.add(drink4);

        menulist.stream()
                .filter(care -> care.gettemperture().equals("apollon"))
                .forEach(care -> {
                    System.out.println("^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^");
                    System.out.println("メニュー名：" + care.getname());
                    System.out.println("値段：" + care.getprice());
                    System.out.println("^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^");
                });
    }
}