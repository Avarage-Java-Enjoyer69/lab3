public class Neznayka extends Person{
    public Neznayka(){
        this.name = "Незнайка";
        location loc = this.place;
        this.place = location.rest_room;
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
}
