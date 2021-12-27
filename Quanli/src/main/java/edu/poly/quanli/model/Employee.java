/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.quanli.model;

/**
 *
 * @author Van Tien
 */
public class Employee {
    private String Id, Ten, Nhom;
    private int Gia, so;

    public Employee() {
    }

    public Employee(String Id, String Ten, String Nhom, int Gia, int so) {
        this.Id = Id;
        this.Ten = Ten;
        this.Nhom = Nhom;
        this.Gia = Gia;
        this.so = so;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getNhom() {
        return Nhom;
    }

    public void setNhom(String Nhom) {
        this.Nhom = Nhom;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }

    public int getSo() {
        return so;
    }

    public void setSo(int so) {
        this.so = so;
    }
    
}
