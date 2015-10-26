/**
 * Created by holdenhughes on 10/26/15.
 */
public class AnonymousClassExample {
    public static void main(String[] args) {
        //create alligator from separate class
        Alligator a1 = new Alligator();
        System.out.println(a1);

        //create alligator from anonymous class
        Reptile a2 = new Reptile(){
            @Override
        public String toString(){
                return "Alligator";
            }

        };
        System.out.println(a2);
    }
}

class Alligator extends Reptile {
    @Override
    public String toString() {
        return "Alligator";
    }
}