public class Neznayka extends Person{
    public Neznayka(){
        this.name = "Незнайка";
        location loc = this.place;
        this.place = location.rest_room;
    }
    public void go_up(){
        location loc = this.place;
        this.place = location.astronomy_cabin;
    }
    public void go_down(){
        location loc = this.place;
        this.place = location.food_compartment;
    }
    public void eat(){
        food f1 = this.dish;
        this.dish = food.CosmoCutlet;
    }
    public String str(String words){return words;}
    public void check() throws TypeException{
        if (name.length() > 3){
            System.out.println("");
        } else {
            throw new TypeException(name + " - неподходящее имя!");
        }
    }
}
