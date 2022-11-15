public class Ponchik extends Person{
    public Ponchik(){
        this.name = "Пончик";
        location loc = this.place;
        this.place = location.rest_room;
    }
    public void go_down() {
        location loc = this.place;
        this.place = location.food_compartment;
    }
    public void eat(){
        food f1 = this.dish;
        this.dish = food.CosmoVegetables;
    }
    public void eat1(){
        food f1 = this.dish;
        this.dish = food.CosmoCutlet;
    }
    public String str(String words){return words;}
}
