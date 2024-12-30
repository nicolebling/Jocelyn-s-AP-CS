public class Animal {
    private String name; //attributes
    private boolean isPet;
    private int age;

    public Animal(String animalName, boolean isAnimalPet, int animalAge)
    {
        name = animalName;
        isPet = isAnimalPet;
        age = animalAge;
    }

    public String getName()
    {
        return name;
    }

    public boolean getPetStatus()
    {
        return isPet;
    }

    public int getAge()
    {
        return age;
    }

    public String toString()
    {
        String aInfo = "This animal's name is " + name + ". They are currently a pet: " +
        isPet + ". The animal is " + age + " years old.";

        return aInfo;
    }
}
