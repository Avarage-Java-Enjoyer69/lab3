
public class Main {
    public static void main(String[] args) {
        Ponchik p = new Ponchik();
        Neznayka n = new Neznayka();
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


    }
}