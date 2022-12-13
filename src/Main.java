
public class Main {
    public static void main(String[] args) {
        Ponchik p = new Ponchik();
        Neznayka n = new Neznayka();
        Rocket r = new Rocket();
        Sun s = new Sun();
        Moon m = new Moon();
        Space sp = new Space();
        Space.Stars st = sp.new Stars();
        levitation levi = new levitation();
        try {
            p.check();
        }catch (TypeException e){
            System.out.println(e.getMessage());
        }
        try {
            n.check();
        }catch (TypeException e){
            System.out.println(e.getMessage());
        }
        p.seem();
        p.dr.dream();
        p.go_up();
        n.go_up();
        System.out.println(" Друзья быстро поднялись в астрономическую кабину. ");
        r.watch();
        sp.getTogether();
        st.dot();
        s.shine();
        System.out.println("Казалось, был день, но в то же время была и ночь. Так на Земле никогда не бывает.");
        System.out.println("Когда на Земле видно "+ s+", то не видно звезд, и, наоборот, когда есть звезды -- нет солнца.");
        m.glow();
        m.seem();
        System.out.println("Теперь, когда " + p + " окончательно убедился, что о возвращении на Землю не может быть никакой речи,"+p);
        System.out.println("понемногу успокоился и сказал: \""+p.str("Что ж, раз на Землю вернуться уже не получится, пойдем поедим")+"\"");
        p.go_down();
        n.go_down();
        System.out.println("Друзья спустились в пищевой отсек. "+ n + " совсем еще не хотел есть, и он");
        System.out.println("только для того, чтоб составить компанию другу по имени "+p+" съел одну космическую котлетку");
        n.eat();
        System.out.println("Но "+p+" решил не теряться в создавшейся обстановке и отнесся к делу со всей серьезностью.");
        System.out.println(p + " заявил, что должен произвести в пищевом остеке ревизию и проверить качество всех космических блюд.");
        System.out.println("А для этого ему нужно съесть хотя бы по одной порции каждого блюда.");
        p.eat();
        p.eat1();
        p.setSleep();
        try {
            p.sleep();
            levi.levitate();
        } catch (SleepException e) {
            System.out.println(e.getMessage());


        }
    }
    static class levitation{
        public void levitate(){
            System.out.println("В этом ничего удивительного не было, так как ночью Пончик спал мало, к тому же каждый, кто находится в состоянии невесомости, может заснуть в любой позе, не укладываясь для этого специально в постель.");
        }
    }
}