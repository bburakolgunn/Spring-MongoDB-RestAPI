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
public class Kullanici {

    @Id
    private Long id;
    private String adi;
    private String soyadi;

    private HashMap ozellikler; //Şemasını bilmediğimizi yazabiliriz.Yaşı,,Boyu herhangi bir özelliği.

    public Long getId() {
        return id;
    }

    public String getAdi() {
        return adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public HashMap getOzellikler() {
        return ozellikler;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public void setOzellikler(HashMap ozellikler) {
        this.ozellikler = ozellikler;
    }

    public Kullanici(Long id, String adi, String soyadi, HashMap ozellikler) {
        this.id = id;
        this.adi = adi;
        this.soyadi = soyadi;
        this.ozellikler = ozellikler;
    }

    public Kullanici(){

    }
}
