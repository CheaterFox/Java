

public class Main {
    public static void main(String[] args) {
        NewList<Integer> myList = new NewList<>();
        System.out.println("Number of Elements in the Array : " + myList.size());
        System.out.println("Array's Capacity : " + myList.getCapacity());
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        System.out.println("Number of Elements in the Array : " + myList.size());
        System.out.println("Array's Capacity : " + myList.getCapacity());
        myList.add(50);
        myList.add(60);
        myList.add(70);
        myList.add(80);
        myList.add(90);
        myList.add(100);
        myList.add(110);
        System.out.println("Number of Elements in the Array : " + myList.size());
        System.out.println("Array's Capacity : " + myList.getCapacity());
        System.out.println("2nd index value : " + myList.get(2));
        myList.remove(2);
        myList.add(40);
        myList.set(0, 100);
        System.out.println("2nd index value : " + myList.get(2));
        System.out.println(myList.toString());
        NewList<Integer> list = new NewList<>();
        System.out.println("List Status : " + (list.isEmpty() ? "Empty" : "Filled"));
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(20);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println("List Status : " + (list.isEmpty() ? "Empty" : "Filled"));

        // First index of the value
        System.out.println("Index : " + list.indexOf(20));

        // Return -1 if array doesn't contain value
        System.out.println("Index :" + list.indexOf(100));

        // Last index of the value
        System.out.println("Index : " + list.lastIndexOf(20));

        // Returns the list as an Object[] array.
        Object[] array = list.toArray();
        System.out.println("First element of the Object array : " + array[0]);

        // Created a sublist of list data type
        NewList<Integer> altList = list.sublist(0,50);
        System.out.println(altList.toString());

        //Questioned if my value is in the list
        System.out.println("Value 20 is in my list : " + list.contains(20));
        System.out.println("Value 120 is in my list : " + list.contains(120));

        // Clear the list completely and reverts it to its default size
        list.clear();
        System.out.println(list.toString());
        System.out.println("List Status : " + (list.isEmpty() ? "Empty" : "Filled"));



    }
}
