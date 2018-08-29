package com.TestasBT;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        DBConnect connect = new DBConnect();
        List<Studentas> studentai = new ArrayList<>();
        connect.uzkrautiDuomenis(studentai);
        studentai.sort(Comparator.comparing(Studentas::getPavarde).thenComparing(Studentas::getVardas));
        System.out.println(studentai);
        connect.kursoVidurkis(2018);


    }
}
