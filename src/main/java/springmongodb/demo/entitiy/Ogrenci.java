package springmongodb.demo.entitiy;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.processing.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 Document anotasyonu  sınıfın MongoDB'deki bir belge (document) olarak kabul edilmesini sağlar.
Yani,bu sınıfın nesneleri MongoDB koleksiyonlarında depolanabilir.
 */

@Document
public class Ogrenci {

    List<String> dersler = new ArrayList<>();

    @Id
    private Long okulNo;
    private String adi;
    private String soyadi;
    private String velininAdı;
    private String telno;

    private String sinif;


    public Ogrenci() {
    }

    public Ogrenci(List<String> dersler, Long okulNo, String adi, String soyadi, String velininAdı, String telno, String sinif) {
        this.dersler = dersler;
        this.okulNo = okulNo;
        this.adi = adi;
        this.soyadi = soyadi;
        this.velininAdı = velininAdı;
        this.telno = telno;
        this.sinif = sinif;
    }

    public List<String> getDersler() {
        return dersler;
    }

    public void setDersler(List<String> dersler) {
        this.dersler = dersler;
    }

    public Long getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(Long okulNo) {
        this.okulNo = okulNo;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getVelininAdı() {
        return velininAdı;
    }

    public void setVelininAdı(String velininAdı) {
        this.velininAdı = velininAdı;
    }

    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }
}


