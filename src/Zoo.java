public class Zoo {

    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25];
        // Q6: Object creation becomes simpler and cleaner
    }

    public void displayZoo() {
        System.out.println("Zoo name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of cages: " + nbrCages);
    }

    @Override
    public String toString() {
        // Q8 & Q9: println(myZoo) calls toString() automatically
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }
}
