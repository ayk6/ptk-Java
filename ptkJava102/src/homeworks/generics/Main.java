package homeworks.generics;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(8);
        myList.add(9);

        System.out.println("There is " + myList.arraySize()+ " elements in array.");
        System.out.println("Array Capacity is " + myList.getCapacity());
        System.out.println("Array Size is " + myList.arraySize());
        System.out.println("1. index is : " + myList.getIndex(1));
        System.out.println("My list to string : " + myList.toString());

        System.out.println("List Status : " + (myList.isEmpty() ? "Is empty" : "Is not empty"));

        myList.remove(4);

        System.out.println("Removed 4. index :" + myList.toString());

        System.out.println("Last index of list: " + myList.lastIndexOf(9));


        System.out.println(myList.subList(1, 1));
        System.out.println(myList.isContains(10));

    }
}
