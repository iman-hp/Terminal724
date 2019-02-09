package ir.terminal724.www.terminal724.Public;

import android.content.Context;
import android.support.multidex.MultiDexApplication;

import java.util.ArrayList;
import java.util.List;

import ir.terminal724.www.terminal724.Search_City.POJO_Cities;
import ir.terminal724.www.terminal724.Search_City.Passenger;

public  class tmpApplication extends MultiDexApplication {
    public static Context context;
    public static List<POJO_Cities> cities = new ArrayList<>();
    public static List<Passenger> passengers = new ArrayList<>();

    public static ArrayList createData() {
        POJO_Cities mashhad = new POJO_Cities("مشهد", "mashhad", "MHD", "ایران");
        POJO_Cities kish = new POJO_Cities("کیش", "kish", "KIH", "ایران");
        POJO_Cities esfahan = new POJO_Cities("اصفهان", "esfahan", "IFN", "ایران");
        POJO_Cities shiraz = new POJO_Cities("شیراز", "shiraz", "SYZ", "ایران");
        POJO_Cities tabriz = new POJO_Cities("تبریز", "tabriz", "TBZ", "ایران");
        POJO_Cities qeshm = new POJO_Cities("قشم", "qeshm", "GSM", "ایران");
        POJO_Cities bandar_abas = new POJO_Cities("بندر عباس", "bandar abas", "BND", "ایران");
        POJO_Cities abadan = new POJO_Cities("آبادان", "abadan", "ABD", "ایران");
        POJO_Cities yazd = new POJO_Cities("یزد", "yazd", "AZD", "ایران");
        POJO_Cities kerman = new POJO_Cities("کرمان", "kerman", "KER", "ایران");
        POJO_Cities boushehr = new POJO_Cities("بوشهر", "boushehr", "BUZ", "ایران");
        POJO_Cities sanandaj = new POJO_Cities("سنندج", "sanandaj", "SDG", "ایران");
        POJO_Cities khoram_abad = new POJO_Cities("خرم آباد", "khoram_abad", "KHD", "ایران");
        POJO_Cities kermanshah = new POJO_Cities("کرمانشاه", "kermanshah", "KSH", "ایران");
        POJO_Cities hamedan = new POJO_Cities("همدان", "hamedan", "HDM", "ایران");
        POJO_Cities arak = new POJO_Cities("اراک", "arak", "AJK", "ایران");
        POJO_Cities ardebil = new POJO_Cities("اردبیل", "ardebil", "ADU", "ایران");
        POJO_Cities oroumie = new POJO_Cities("ارومیه", "oroumie", "OMH", "ایران");
        POJO_Cities ilam = new POJO_Cities("ایلام", "ilam", "IIL", "ایران");
        POJO_Cities bojnord = new POJO_Cities("بجنورد", "bojnord", "BJB", "ایران");
        POJO_Cities bam = new POJO_Cities("بم", "bam", "BXR", "ایران");
        POJO_Cities bandar_lenge = new POJO_Cities("بندر لنگه", "bandar_lenge", "BDH", "ایران");
        POJO_Cities najaf = new POJO_Cities("نجف", "najaf", "NJF", "عراق");
        POJO_Cities istanbul = new POJO_Cities("استانبول", "istanbul", "IST", "ترکیه");
        POJO_Cities antalia = new POJO_Cities("آنتالیا", "antalia", "AYT", "ترکیه");
        POJO_Cities dubai = new POJO_Cities("دبی", "dubai", "DXB", "امارات");
        POJO_Cities baghdad = new POJO_Cities("بغداد", "baghdad", "BGW", "عراق");
        POJO_Cities birjand = new POJO_Cities("بیرجند", "birjand", "XBJ", "ایران");
        POJO_Cities chabahar = new POJO_Cities("چابهار", "chabahar", "ZBR", "ایران");
        POJO_Cities dezfoul = new POJO_Cities("دزفول", "dezfoul", "DEF", "ایران");
        POJO_Cities ramsar = new POJO_Cities("رامسر", "ramsar", "RZR", "ایران");
        POJO_Cities rasht = new POJO_Cities("رشت", "rasht", "RAS", "ایران");
        POJO_Cities zahedan = new POJO_Cities("زاهدان", "zahedan", "ZAH", "ایران");
        POJO_Cities zanjan = new POJO_Cities("زنجان", "zanjan", "JWN", "ایران");
        POJO_Cities sari = new POJO_Cities("ساری", "sari", "SRY", "ایران");
        POJO_Cities sabzevar = new POJO_Cities("سبزوار", "sabzevar", "AFZ", "ایران");
        POJO_Cities shahroud = new POJO_Cities("شاهرود", "shahroud", "RUD", "ایران");
        POJO_Cities shahr_kord = new POJO_Cities("شهر کرد", "shahr_kord", "CQD", "ایران");
        POJO_Cities kashan = new POJO_Cities("کاشان", "kashan", "", "ایران");
        POJO_Cities gorgan = new POJO_Cities("گرگان", "gorgan", "GBT", "ایران");
        POJO_Cities yasouj = new POJO_Cities("یاسوج", "yasouj", "YES", "ایران");
        POJO_Cities tehran = new POJO_Cities("تهران", "tehran", "THR", "ایران");
        POJO_Cities teflis = new POJO_Cities("تفلیس", "teflis", "TBS", "گرجستان");
        POJO_Cities abouzabi = new POJO_Cities("ابوظبی", "abouzabi", "AUH", "امارات");
        POJO_Cities paris = new POJO_Cities("پاریس", "paris", "ORY", "فرانسه");
        POJO_Cities hongkong = new POJO_Cities("هنگ کونگ", "hongkong", "HKG", "چین");
        POJO_Cities shanghai = new POJO_Cities("شانگهای", "shanghai", "SHF", "چین");
        POJO_Cities sanpeterzburg = new POJO_Cities("سن پترزبورگ", "sanpeterzburg", "PIE", "روسیه");
        POJO_Cities bumbai = new POJO_Cities("بمبئی", "bumbai", "BOM", "هند");
        POJO_Cities amesterdam = new POJO_Cities("آمستردام", "amesterdam", "AMS", "هلند");
        POJO_Cities dehli = new POJO_Cities("دهلی", "dehli", "DEL", "هند");
        POJO_Cities kuwait = new POJO_Cities("کویت", "kuwait", "KWI", "کویت");
        POJO_Cities kualalumpur = new POJO_Cities("کوالالانپور", "kualalumpur", "KUL", "مالزی");
        POJO_Cities kiev = new POJO_Cities("کی یف", "kiev", "IEV", "اکراین");
        POJO_Cities hamburg = new POJO_Cities("هامبورگ", "hamburg", "HAM", "آلمان");
        POJO_Cities milan = new POJO_Cities("میلان", "milan", "MIL", "ایتالیا");
        POJO_Cities damascus = new POJO_Cities("دمشق", "damascus", "DAM", "سوریه");
        POJO_Cities moscow = new POJO_Cities("مسکو", "moscow", "VKO", "روسیه");
        POJO_Cities ahvaz = new POJO_Cities("اهواز", "ahvaz", "AWZ", "ایران");
        cities.add(mashhad);
        cities.add(kish);
        cities.add(esfahan);
        cities.add(shiraz);
        cities.add(ahvaz);
        cities.add(tabriz);
        cities.add(qeshm);
        cities.add(bandar_abas);
        cities.add(abadan);
        cities.add(yazd);
        cities.add(kerman);
        cities.add(boushehr);
        cities.add(sanandaj);
        cities.add(khoram_abad);
        cities.add(kermanshah);
        cities.add(hamedan);
        cities.add(arak);
        cities.add(ardebil);
        cities.add(oroumie);
        cities.add(ilam);
        cities.add(bojnord);
        cities.add(bam);
        cities.add(bandar_lenge);
        cities.add(najaf);
        cities.add(istanbul);
        cities.add(antalia);
        cities.add(dubai);
        cities.add(baghdad);
        cities.add(birjand);
        cities.add(chabahar);
        cities.add(dezfoul);
        cities.add(ramsar);
        cities.add(rasht);
        cities.add(zahedan);
        cities.add(sari);
        cities.add(sabzevar);
        cities.add(shahroud);
        cities.add(shahr_kord);
        cities.add(kashan);
        cities.add(gorgan);
        cities.add(yasouj);
        cities.add(tehran);
        cities.add(teflis);//
        cities.add(abouzabi);//
        cities.add(paris);
        cities.add(hongkong);//
        cities.add(shanghai);//
        cities.add(sanpeterzburg);
        cities.add(bumbai);
        cities.add(amesterdam);
        cities.add(dehli);
        cities.add(kuwait);
        cities.add(kualalumpur);
        cities.add(kiev);
        cities.add(hamburg);
        cities.add(milan);
        cities.add(damascus);
        cities.add(moscow);
        return (ArrayList) cities;
    }


    @Override
    public void onCreate() {
        super.onCreate();
//        Fabric.with(this, new Crashlytics());
        context = getApplicationContext();
        createData();
    }
}
