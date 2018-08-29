package com.TestasBT;

public class Pazymiai {
    private Long id;

    private Long studentas_id;

    private String data;

    private int pazymys;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudentas_id() {
        return studentas_id;
    }

    public void setStudentas_id(Long studentas_id) {
        this.studentas_id = studentas_id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getPazymys() {
        return pazymys;
    }

    public void setPazymys(int pazymys) {
        this.pazymys = pazymys;
    }

    @Override
    public String toString() {
        return "Pazymiai{" +"id=" + id +", studentas_id=" + studentas_id +", data=" + data  +", pazymys=" + pazymys +'}'+ "\n";
    }
}
