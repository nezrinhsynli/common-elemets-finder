import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 2 List'in ortaq elementlerinin tapilmasi
        Scanner scan = new Scanner(System.in);

        List<Integer> list1 = new ArrayList<>();
        System.out.println("Enter the count of elements in the first list.");
        int list1CountOfElements = scan.nextInt();
        System.out.println("Add the elements of the first List:");
        for (int i = 0; i < list1CountOfElements; i++) {
            list1.add(scan.nextInt());
        }

        List<Integer> list2 = new ArrayList<>();
        System.out.println("Enter the count of elements in the second list.");
        int list2CountOfElements = scan.nextInt();
        System.out.println("Add the elements of the second List:");
        for (int i = 0; i < list2CountOfElements; i++) {
            list2.add(scan.nextInt());
        }

        //list1'i Set'e ceviririk. Bu, her bir ortaq elementin yalnız bir defe saxlanmasini temin edir
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set = new HashSet<>();

        //set1'in (yeni list1'in) elementi list2'deki elementle eyni olarsa Set'e elave edilir
        for (int list : list2) {
            if (set1.contains(list)) {
                set.add(list);
            }
        }

        //eger hec bir element eyni deyilse uygun mesaj cap edilir
        if (set.isEmpty()) {
            System.out.println("No common elements found.");
        } else {
            System.out.println("Same elements in List 1 and List 2: " + set);
        }

    }

}