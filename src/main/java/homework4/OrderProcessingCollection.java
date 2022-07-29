package homework4;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class OrderProcessingCollection {

    public static void main(String[] args) {

        String[] orders = {"002", "004", "003", "001", "005", "001", "002", "004", "005"};

        Set<String> noDuplicateOrders = new HashSet<>(List.of(orders));
        Set<String> noDuplicateOrders2 = new TreeSet<>(List.of(orders));

        System.out.println(noDuplicateOrders);
        System.out.println(noDuplicateOrders2);
    }
}
