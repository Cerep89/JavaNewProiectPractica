package ru.javawebinar.webapp.model;

/**
 * valeri
 * 02.07.2016.
 */
public enum ContactType {
    PHONE("Тел"),
    MOBILE("Мобилиныи"),
    HOME_PHONE("Домащнии"),
    SKYPE("Skype"),
    EMAIL("Почта"),
    ICQ("Icq");

    private  String title;

    ContactType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
