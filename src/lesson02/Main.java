package lesson02;

import ru.javawebinar.webapp.model.Link;

/**
 * valeri
 * 27.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        Link link = new Link("Curs Java", "java.com");
        Link link2 = link;
        Link link3 = new Link(link);
        System.out.println(link.getClass());
        System.out.println(link.equals(link2));
        System.out.println(link3.equals(link));
        System.out.println(link);
    }
}
