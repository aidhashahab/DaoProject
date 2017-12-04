/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoproject.model;

import java.util.Calendar;
import java.util.Date;

//file ini di sebut Plain Ordinary Java Object. ada memvar, contructor, setter getter (mungkin juga method lain yg berhubungan dengan method ini)
public class Person {

    private String name;
    private Date dateOfBirth;
    private String infoBirthday;

    public Person() {
    }

    public Person(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;

    }

    public Person(String name, Date dateOfBirth, String infoBirthday) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.infoBirthday = infoBirthday;
    }

    public boolean deletePErson(Person person) {
        return true;
    }

    public Person updatePerson(Person person) {
        return person;
    }

    public int getAge() { // --> ini adalah method lain yg relevan dengan method ini.
        Date now = new Date();
        if (now.before(dateOfBirth)) {  // dicek dulu. 
            return 0;                   // kalau true maka return 0 di abaikan dan lanjut ke bawah.
        }                               // jika  false maka akan mengeksekusi return 0.

        Calendar calNow = Calendar.getInstance();
        calNow.setTime(now);
        Calendar calDob = Calendar.getInstance();
        calDob.setTime(dateOfBirth);
        int umur = calNow.get(Calendar.YEAR) - calDob.get(Calendar.YEAR);

        return umur;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return the infoBirthday
     */
    public String getInfoBirthday() {
        return infoBirthday;
    }

    /**
     * @param infoBirthday the infoBirthday to set
     */
    public void setInfoBirthday(String infoBirthday) {
        this.infoBirthday = infoBirthday;
    }

}
