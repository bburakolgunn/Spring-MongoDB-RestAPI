package springmongodb.demo.entitiy;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.processing.Generated;
import java.util.HashMap;

/*
 Document anotasyonu  sınıfın MongoDB'deki bir belge (document) olarak kabul edilmesini sağlar.
Yani,bu sınıfın nesneleri MongoDB koleksiyonlarında depolanabilir.
 */

@Document
public class Ogrenci {

    @Id
    private Long id;
    private String okulNo;
    private String adi;
    private String soyadi;
    private String velininAdı;

    private String telno;
    public Ogrenci() {
    }

    public Ogrenci(Long id, String okulNo, String adi, String soyadi, String velininAdı, String telno) {
        this.id = id;
        this.okulNo = okulNo;
        this.adi = adi;
        this.soyadi = soyadi;
        this.velininAdı = velininAdı;
        this.telno = telno;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(String okulNo) {
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
}


