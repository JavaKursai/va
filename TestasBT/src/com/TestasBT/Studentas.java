package com.TestasBT;

import java.util.ArrayList;
import java.util.List;

public class Studentas  {
    private Long id;

    private String vardas;

    private String pavarde;

    private String el_pastas;

    private List<Pazymiai> pazymiai = new ArrayList<>();


    public Long getId() {
        return id;
    }

    public String getEl_pastas() {
        return el_pastas;
    }

    public void setEl_pastas(String el_pastas) {
        this.el_pastas = el_pastas;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public List<Pazymiai> getPazymiai() {
        return pazymiai;
    }

    public void setPazymiai(List<Pazymiai> pazymiai) {
        this.pazymiai = pazymiai;
    }

    @Override
    public String toString() {
        return "Studentas{" + "id=" + id + ", vardas=" + vardas + ", pavarde=" + pavarde + ", el_pastas=" + el_pastas +", pazymiai=" + pazymiai + '}';
    }
}
