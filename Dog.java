package Lab1;

public class Dog {
    private String name;
    private int age;
    private String breed;
    public Dog(String dogname, int dogage, String dogbreed) {
        name = dogname;
        age = dogage;
        breed = dogbreed;
    }

    public Dog(int dogage, String dogbreed) {
        name = "puppy";
        age = dogage;
        breed = dogbreed;
    }

    public Dog(String dogname, String dogbreed) {
        name = dogname;
        age = 0;
        breed = dogbreed;
    }

    public Dog(String dogname, int dogage) {
        name = dogname;
        age = dogage;
        breed = "mongrel";
    }

    public String GN()
    {
        return name;
    }
    public int GA()
    {
        return age;
    }
    public String GB()
    {
        return breed;
    }

    public void SA(int dogage) {
        this.age = dogage;
    }
    public void SN(String dogname) {
        this.name = dogname;
    }

    public void SB(String dogbreed) {
        this.breed = dogbreed;
    }

    public String toString(){return "Name of a dog: " + this.name + ", age of a dog:" + this.age + ", breed of a dog: " + this.breed;}
    public static void main(String[] args) {
        Dog dog1 = new Dog("Шарик", 2);
        Dog dog2 = new Dog(3, "Mastif");
        Dog dog3 = new Dog("Бусинка", "Spitz");
        dog3.SA(1);
        System.out.println(dog1);
    }
}


