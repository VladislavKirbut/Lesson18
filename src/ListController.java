import teachmeskills.kirbut.hw18.intlist.IntArrayList;
import teachmeskills.kirbut.hw18.intlist.IntLinkedList;
import teachmeskills.kirbut.hw18.intlist.IntList;

import java.util.Scanner;

public class ListController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntList arrayList = new IntArrayList();
        IntList linkedList = new IntLinkedList();

        while (true) {
            System.out.println("""
                    1. Method get()
                    2. Method set()
                    3. Method size()
                    4. Method add()
                    5. Method remove()
                    6. Method lastIndexOf()
                    0. Exit.
                    """);

            System.out.print("> ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Method get");
                    System.out.println("-----------------------");
                    System.out.println("Enter index of element: ");
                    int index = scanner.nextInt();

                    System.out.println("(ArrayList) Element: " + arrayList.get(index));
                    System.out.println("(LinkedList) Element: " + linkedList.get(index));

                    printList(arrayList, linkedList);
                }
                case 2 -> {
                    System.out.println("Method set");
                    System.out.println("-----------------------");

                    System.out.println("Enter index of element:");
                    int index = scanner.nextInt();
                    System.out.println("Enter element:");
                    int element = scanner.nextInt();

                    System.out.println("(ArrayList) element: " + arrayList.set(index, element));
                    System.out.println("(LinkedList) element: " + linkedList.set(index, element));

                    printList(arrayList, linkedList);
                }
                case 3 -> {
                    System.out.println("Method size");
                    System.out.println("-----------------------");

                    System.out.println("ArrayList size: " + arrayList.size());
                    System.out.println("LinkedList size: " + linkedList.size() + "\n");

                    printList(arrayList, linkedList);
                }
                case 4 -> {
                    System.out.println("Method add");
                    System.out.println("-----------------------");

                    System.out.println("Enter element: ");
                    int element = scanner.nextInt();

                    arrayList.add(element);
                    linkedList.add(element);

                    printList(arrayList, linkedList);
                }
                case 5 -> {
                    System.out.println("Method remove");
                    System.out.println("-----------------------");

                    System.out.println("Enter index of element:");
                    int index = scanner.nextInt();

                    System.out.println("(ArrayList) RemovedElement: " + arrayList.remove(index));
                    System.out.println("(LinkedList) RemovedElement: " + linkedList.remove(index));

                    printList(arrayList, linkedList);
                }
                case 6 -> {
                    System.out.println("Method lastIndexOf");
                    System.out.println("-----------------------");

                    System.out.println("Enter element:");
                    int element = scanner.nextInt();

                    System.out.println("(ArrayList) lastIndex: " + arrayList.lastIndexOf(element));
                    System.out.println("(LinkedList) lastIndex: " + linkedList.lastIndexOf(element));

                    printList(arrayList, linkedList);
                }
                default -> System.out.println("Enter correct task number!");
            }
        }
    }

    public static void printList(IntList arrayList, IntList linkedList) {
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList + "\n");
    }
}