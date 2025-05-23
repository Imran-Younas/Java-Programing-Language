import java.util.HashSet;

public class Main {
    public static void main(String[] args){
        HashSet<Integer> numberSet = new HashSet<>();
        numberSet.add(1);
        numberSet.add(2);
        numberSet.add(3);
        numberSet.add(5);
        numberSet.add(3);  // repetition is not allowd

        System.out.println("Size of HashSet: "+ numberSet.size());
        System.out.println(numberSet);
        System.out.println(numberSet.contains(1));
        numberSet.remove(2);
        System.out.println(numberSet);

        HashSet<Integer> Copyset = (HashSet<Integer>) numberSet.clone();   // why clone function?
        System.out.println("Copy: "+Copyset);  // why not printing in order

//        System.out.println("Copy: "+Copyset);



        HashSet<Integer> SecondCopy = numberSet; // why not this?

        System.out.println("Second Copy: "+ SecondCopy);






        numberSet.clear();
        System.out.println(numberSet);
        System.out.println(numberSet.contains(1));
        System.out.println(numberSet.isEmpty());


    }
}