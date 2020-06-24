/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author quoc0
 */
@Entity
@Table(name = "NhanSu")
public class NhanSu implements Serializable{

    @Id
    @Column(name = "manhanvien")
    public String manhanvien;
    @Column(name = "hoten")
    public String hoten;
    @Column(name = "ngaysinh")
    public String ngaysinh;
    @Column(name = "chuyennganh")
    public String chuyennganh;
    @Column(name = "vitricongviec")
    public String vitricongviec;
    @Column(name = "donvicongtac")
    public String donvicongtac;
    @Column(name = "email")
    public String email;
    @Column(name = "dienthoai")
    public String dienthoai;
    @Column(name = "thongtinkhac")
    public String thongtinkhac;

    public NhanSu() {
    }

    public NhanSu(String manhanvien, String hoten, String ngaysinh, String chuyennganh, String vitricongviec, String donvicongtac, String email, String dienthoai, String thongtinkhac) {
        this.manhanvien = manhanvien;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.chuyennganh = chuyennganh;
        this.vitricongviec = vitricongviec;
        this.donvicongtac = donvicongtac;
        this.email = email;
        this.dienthoai = dienthoai;
        this.thongtinkhac = thongtinkhac;
    }

    public String getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        this.manhanvien = manhanvien;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getChuyennganh() {
        return chuyennganh;
    }

    public void setChuyennganh(String chuyennganh) {
        this.chuyennganh = chuyennganh;
    }

    public String getVitricongviec() {
        return vitricongviec;
    }

    public void setVitricongviec(String vitricongviec) {
        this.vitricongviec = vitricongviec;
    }

    public String getDonvicongtac() {
        return donvicongtac;
    }

    public void setDonvicongtac(String donvicongtac) {
        this.donvicongtac = donvicongtac;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public String getThongtinkhac() {
        return thongtinkhac;
    }

    public void setThongtinkhac(String thongtinkhac) {
        this.thongtinkhac = thongtinkhac;
    }
    
}
