package day07_actionsClass_fileTestleri;

import org.junit.Test;
import utilities.TestBase;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_FilePath {

    @Test
    public void test01(){

        // Masaustundeki Delta dosyasi yolu
        // C:\Users\User\Desktop\TheDelta.docx

        // Indirilenler dosyasi yolu
        // C:\Users\User\Downloads

        String dosyaYolu = "C:/Users/User/Desktop/TheDelta.docx";


        boolean sonuc = Files.exists(Paths.get(dosyaYolu));
        System.out.println(sonuc);


        /*
           Bilgisayarimizda bir dosyanin var oldugunu test etmek icin
           dosya yoluna ihtiyacimiz var

           Ancak herkesin bilgisayarindaki dosya yollari
           farkliliklar gosterir

           Herkesin bilgisayarina gore farkli olan kismi
           Java'dan bir komut ile elde edebiliriz

         */

        System.out.println(System.getProperty("user.home"));
        dosyaYolu= "C:/Users/User/Desktop/TheDelta.docx";
        dosyaYolu= System.getProperty("user.home") + "/Delta/Thedelta.docx";

        System.out.println("===============================================");

        // Bilgisayarinizin Temel Dosya Yolu : user.home

        // Icinde bulundugumuz projenin temel yolu user.dir

        // C:\Users\User\IdeaProjects\seleniumTeam108\src\test\java\day07_actionsClass_fileTestleri\text.txt

        System.out.println(System.getProperty("user.dir"));


    }
}
