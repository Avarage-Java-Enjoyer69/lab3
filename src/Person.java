public abstract class Person implements Speech, UpDown, FoodTaster{
    public String name;
    public location place;
    public food dish;

    public Person() {
    }
    public abstract void go_down();
    public abstract void eat();

    public abstract String str(String words);

    public boolean equals(Person p){return this.name == p.name;}

    public String toString(){return this.name;}

    public int hashCode(){return this.name.length();}
}
