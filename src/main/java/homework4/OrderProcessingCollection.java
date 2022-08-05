package homework4;

import java.util.*;

public class OrderProcessingCollection {

    public static void main(String[] args) {

        String[] orders = {"order2", "order2", "order3", "order1", "order2", "order3", "order4", "order3", "order3"};

        Set<String> noDuplicateOrders = new HashSet<>(Arrays.asList(orders));
        Set<String> noDuplicateOrders2 = new TreeSet<>(List.of(orders));

        System.out.println(noDuplicateOrders);
        System.out.println(noDuplicateOrders2);
    }
}
