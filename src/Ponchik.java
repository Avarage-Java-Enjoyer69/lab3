public class Ponchik extends Person implements Seem{
    public status stat;
    public Ponchik(){
        this.name = "Пончик";
        this.place = location.rest_room;
        this.stat = status.NotSleep;

    }

    public void go_up(){
        this.place = location.astronomy_cabin;
    }
    public void go_down() {
        this.place = location.food_compartment;
    }
    public void eat(){
        this.dish = food.CosmoVegetables;
    }
    public void eat1(){
        this.dish = food.CosmoCutlet;
    }
    public void setSleep(){
        this.stat = status.Sleep;

    }
    @Override
    public void seem(){
        System.out.println("И ему стало казаться, что ничего страшного не произошло");
    }

    Dream dr = new Dream() {
        @Override
        public void dream() {
            System.out.print("ракета не летит вовсе, а продолжает стоять на земле.");

        }
    };

    public String str(String words){return words;}
    public void sleep() throws SleepException{
        if (this.stat == status.Sleep){
            System.out.println("Эта задача оказалась, однако, для него не под силу, потому что уже на десятой или на одиннадцатой порции его сморил сон, и Пончик заснул с недоеденной космической сосиской во рту.");
        } else {
            throw new SleepException(name + "должен уснуть");
        }
    }
    public void check() throws TypeException{
        if (name.length() > 3){
            System.out.println("");
        } else {
            throw new TypeException(name + " - неподходящее имя!");
        }
    }




    //static class Dream{
        //public void NotFly(String R){System.out.println("не летит вовсе, а продолжает стоять на земле");}

    //}

}
