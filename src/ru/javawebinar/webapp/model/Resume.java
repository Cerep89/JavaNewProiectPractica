package ru.javawebinar.webapp.model;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

/**
 * valeri
 * 26.06.2016.
 */
public class Resume {
   private  String uuid;
   private String fullNamme;
   private  String location;
   private  String homePage;
   List<Contact> contacts = new LinkedList<>();
   List<Section> sections = new LinkedList<>();

   public void  addSection(Section section){
sections.add(section);
   }public void  addContact(Contact contact){
      contacts.add(contact);
   }
   public Resume(String fullNamme, String location) {
      this(UUID.randomUUID().toString(),fullNamme,location);
   }

   public String getUuid() {
      return uuid;
   }

   public String getLocation() {
      return location;
   }

   public String getFullNamme() {
      return fullNamme;
   }

   public String getHomePage() {
      return homePage;
   }

   public List<Contact> getContacts() {
      return contacts;
   }

   public List<Section> getSections() {
      return sections;
   }

   public Resume(String uuid, String fullNamme, String location) {
      this.uuid = uuid;
      this.fullNamme = fullNamme;
      this.location = location;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof Resume)) return false;

      Resume resume = (Resume) o;

      return uuid.equals(resume.uuid);

   }

   @Override
   public int hashCode() {
      return uuid.hashCode();
   }
}
