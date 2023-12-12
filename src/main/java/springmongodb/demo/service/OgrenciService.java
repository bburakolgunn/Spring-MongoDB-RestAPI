package springmongodb.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springmongodb.demo.entitiy.Ogrenci;
import springmongodb.demo.repository.OgrenciRepository;

import java.util.List;
import java.util.Optional;

@Service
public class OgrenciService implements IOgrenciService {


    private  final OgrenciRepository ogrenciRepository;

    @Autowired
    public OgrenciService(OgrenciRepository ogrenciRepository) {
        this.ogrenciRepository = ogrenciRepository;
    }

    @Override
    public List<Ogrenci> getAll() {
        //select * from Kullanici
    List<Ogrenci> ogrenciListesi = ogrenciRepository.findAll();
    return  ogrenciListesi;
    }

    @Override
    public Ogrenci getById(Long id) {
        // select * from Kullanici where id = id
        Optional<Ogrenci> kullaniciDetayOptional = ogrenciRepository.findById(id);

        // Eğer kullanıcı bulunduysa, Optional'dan çıkar
        Ogrenci ogrenciDetay = kullaniciDetayOptional.orElse(null);
        return ogrenciDetay;

    }

    @Override
    public Ogrenci save(Ogrenci ogrenci) {
       //insert into Kullanici
        Ogrenci ogrenciKaydedilen = ogrenciRepository.save(ogrenci);
        return ogrenciKaydedilen;

    }

    @Override
    public Ogrenci update(Ogrenci ogrenci) {
        Optional<Ogrenci> optionalOgrenci = ogrenciRepository.findById(ogrenci.getOkulNo());
        Ogrenci guncellemeOgrenci = optionalOgrenci.orElse(null);

        // Kullanici bulunamadıysa null döndür
        guncellemeOgrenci.setOkulNo(ogrenci.getOkulNo());
        guncellemeOgrenci.setAdi(ogrenci.getAdi());
        guncellemeOgrenci.setSoyadi(ogrenci.getSoyadi());
        guncellemeOgrenci.setVelininAdı(ogrenci.getVelininAdı());
        guncellemeOgrenci.setTelno(ogrenci.getTelno());
        guncellemeOgrenci.setSinif(ogrenci.getSinif());
        guncellemeOgrenci.setDersler(ogrenci.getDersler());
        Ogrenci guncellenmisOgrenci = ogrenciRepository.save(guncellemeOgrenci);
        return guncellenmisOgrenci;

    }

    @Override
    public Ogrenci delete(Long okulNo) {
        Optional<Ogrenci> ogrenciOptional = ogrenciRepository.findByOkulNo(okulNo);

        if (ogrenciOptional.isPresent()) {
            ogrenciRepository.deleteByOkulNo(okulNo);
            return ogrenciOptional.get();
        } else {
            return null;
        }
    }


}




