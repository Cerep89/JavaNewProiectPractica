package ru.javawebinar.webapp.model;

/**
 * valeri
 * 27.06.2016.
 */
public class Contact {
  private  final   ContactType type;
  private  final  String value;

    public Contact(ContactType type, String value) {
        this.type = type;
        this.value = value;
    }

    public ContactType getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

}
