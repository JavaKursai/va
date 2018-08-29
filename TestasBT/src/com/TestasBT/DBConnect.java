package com.TestasBT;

import java.sql.*;
import java.util.List;


public class DBConnect {

    private Connection con;
    private Statement st;
    private ResultSet rs;

    public DBConnect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dienynas?verifyServerCertificate=false&useSSL=true", "root", "rokas");
            st = con.createStatement();

        } catch (Exception ex) {
            System.out.println("Error: "+ex);
        }
    }

    public void uzkrautiDuomenis(List<Studentas> studentai) {
        try {
            String query = "SELECT * FROM studentai";
            rs =   st.executeQuery(query);
            System.out.println("Records from database: ");
            while(rs.next()){
//              ************************************************************************FOR SAVING
                Studentas naujasStudentas = new Studentas();
                naujasStudentas.setId(rs.getLong("id"));
                naujasStudentas.setVardas(rs.getString("vardas"));
                naujasStudentas.setPavarde(rs.getString("pavarde"));
                naujasStudentas.setEl_pastas(rs.getString("el_pastas"));
                studentai.add(naujasStudentas);
//              ************************************************************************FOR PRINTING
                System.out.println(naujasStudentas);
            }
            String query2 = "SELECT * FROM pažymiai";
            rs = st.executeQuery(query2);
            System.out.println("Records2 from database: ");
            while (rs.next()){
                Pazymiai pazymiai1 = new Pazymiai();
                pazymiai1.setId(rs.getLong("id"));
                pazymiai1.setStudentas_id(rs.getLong("studentas_id"));
                pazymiai1.setData(rs.getString("data"));
                pazymiai1.setPazymys(rs.getInt("pazymys"));
                for (Studentas stud: studentai){
                    if (stud.getId() == pazymiai1.getStudentas_id()){
                        List<Pazymiai> studPaz = stud.getPazymiai();
                        studPaz.add(pazymiai1);
                        stud.setPazymiai(studPaz);
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    public void kursoVidurkis(int metai){
        try {
            String query3 = "SELECT  AVG(pažymiai.pazymys) as vidurkis, pažymiai.data FROM  pažymiai WHERE (data LIKE '%"+metai+"%')";
            rs =   st.executeQuery(query3);
            while(rs.next()){
                System.out.println("Mokiniu metnis vidurkis "+metai+" metais: "+ rs.getString("vidurkis"));
            }
        } catch (Exception ex) {
            System.out.println("Error: "+ex);
        }

    }
}

