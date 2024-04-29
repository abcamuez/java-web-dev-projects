public class Main {


    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());


        garfield.noise();
        System.out.println(garfield.noise());
        garfield.isSatisfied();
        System.out.println(garfield.isSatisfied());
        garfield.purr();
        System.out.println(garfield.purr());
        // prints true
        System.out.println();
        garfield.getFamily();
        System.out.println(garfield.getFamily());
//
//        HouseCat mittens = new HouseCat(8.4);
//        System.out.println(mittens);
//        Cat gato = new Cat(15);
//        System.out.println(gato.getWeight());


    }
}
