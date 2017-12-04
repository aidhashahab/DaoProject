/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoproject.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class PersonDAO {

    public Person findPerson(String nama) {
        Person person = new Person();

        try {
            Scanner scan = new Scanner(new File("C:/DEV/persondata.txt"));

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] data = line.split(",");
                if (data[0].equalsIgnoreCase(nama)) {
                    person.setName(data[0]);
                    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                    person.setDateOfBirth(sdf.parse(data[1]));
                    person.setInfoBirthday(data[1]);
                    break;
                }
            }

        } catch (FileNotFoundException fileErr) {
            System.out.println("ga ada");
            
        } catch (ParseException pe) {
            System.out.println("Parasing tanggal salah");
        }

//        Calendar cal = GregorianCalendar.getInstance();
//        cal.set(1990, 3, 15);
//        Date dob = cal.getTime();
//        Person person = new Person("Baby", dob);
        return person;
    }

    public Person createPerson(String nama, Date dob) {
        Person person = new Person(nama, dob);



//nanti ajan disimpan ke database dan membuat .
        return person;
    }

    public List<Person> getPersonList() {
        List<Person> personalist = new ArrayList<>();
//disini akan diisi dengan data
        return personalist;
    }

}
