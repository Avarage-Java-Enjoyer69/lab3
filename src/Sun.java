 public class Sun {
    String name;
    public Sun(){
        this.name = "Солнце";
    }
    public void shine(){
        System.out.println("Среди которых сияло ослепительно яркое "+name+".");
    }
     @Override
     public String toString(){return this.name;}

}
