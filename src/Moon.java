public class Moon implements Seem{
    String name;
    public Moon(){
        this.name = "Луна";
    }
    @Override
    public void seem(){
        System.out.println("Она казалась несколько крупнее, чем обычно кажется нам с Земли.");
    }
    public void glow(){
        System.out.println("В одном из верхних иллюминаторов ярко светилась "+name+".");
    }
}
