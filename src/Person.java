 abstract class Person implements Speech, Down, FoodTaster, Up{
    public String name;
    public location place;
    public food dish;

    public Person() {
    }
    public abstract void go_down();
    public abstract void eat();
    public abstract void go_up();

    public abstract String str(String words);

    public boolean equals(Person p){return this.name == p.name;}

    @Override
    public String toString(){return this.name;}

    @Override
    public int hashCode(){return this.name.length();}
}
