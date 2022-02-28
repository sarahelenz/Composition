/**
 * Created by bob.brown on 3/9/17.
 */
public class CompositionLecture {
    public static void main(String args[]){
        Animal[] a = new Animal[3];
        a[0] = new Dog("Ben");
        a[1] = new Cat("Mittens");
        a[2] = new Cat("Nibbles");

        PetStore PetCo = new PetStore(a);
        ((Cat)PetCo.allAnimals[1]).playWithYarn();
    }

    public static void printArray(Animal[] array)
    {
        System.out.print("[");
        for( int x = 0; x < array.length; x++)
        {
            System.out.print(array[x]);
            if(x != array.length - 1)
                System.out.print(",");
        }
        System.out.println("]");
    }

}
