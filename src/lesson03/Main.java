package lesson03;

import ru.javawebinar.webapp.model.Contact;
import ru.javawebinar.webapp.model.ContactType;

/**
 * valeri
 * 03.07.2016.
 */
public class Main {
    public static void main(String[] args) {
        Contact cont = new Contact(ContactType.PHONE, "125337788");
    }
}
