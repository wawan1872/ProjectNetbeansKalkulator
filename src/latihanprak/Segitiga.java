/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanprak;

public class Segitiga extends BangunDatar{
    String nama;
    double alas, tinggi, sisi1, sisi2, sisi3;
    
    public Segitiga(String nama, double alas, double tinggi, double sisi1,double sisi2,double sisi3){
    this.nama=nama;
    this.alas=alas;
    this.tinggi=tinggi;
    this.sisi1=sisi1;
    this.sisi2=sisi2;
    this.sisi3=sisi3;
    }
    
    public Segitiga(){
        this.alas=this.tinggi=this.sisi1=this.sisi2=this.sisi3=0;
    }
    
    public double luas(){
    super.luas();
    return 0.5*alas*tinggi;
    }
    public double keliling(){
        super.keliling();
        return sisi1+sisi2+sisi3;
    }
}
