/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobakalkulator;

/**
 *
 * @author dell
 */
public class operasi {
double hasil;
double angka1;
double angka2;

public operasi(double angka1, double angka2){
this.angka1 = angka1;
this.angka2 = angka2;
}
public void penjumlahan (){
hasil = angka1 + angka2;
}   
public void pengurangan (){
hasil = angka1 - angka2; 
}
public void perkalian(){
for(int i=0;i<angka2;i++){
hasil += angka1;
}
}
public void pembagian(){
if(angka1<angka2){}
else{

 for(double j=(angka1-angka2);j>=(angka1%angka2);j-=angka2){
     hasil +=1;
    }
}}
public double infohasil(){
return  hasil;
}
}
