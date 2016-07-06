package ru.javawebinar.webapp.model;

/**
 * valeri
 * 03.07.2016.
 */
public enum SectionType {
    OBJECTIVE("Позицыя"),
    ACHIEVEMENT("Достижения"),
    QUALIFICATIONS("Квалификция"),
    EXPERIENCE("Опыт Работы"),
    EDUCATION("Оброзование");

    private  String title;

    SectionType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
