/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_tuan3;

/**
 *
 * @author VŨ ĐỨC
 */
public class Phan_so {
    public static void main(String[] args){
        
    }
    
    // Cong 2 phan so
    
    public static Phan_so congPS(Phan_so ps1, Phan_so ps2){
        // ket qua cua phep cong 2 phan so
        Phan_so ans= new Phan_so();
        // Check xem 2 phan so co chung mau so khong
        if(ps1.mau == ps2.mau){
            ans.mau = ps1.mau;
            ans.tu = ps1.tu + ps2.tu;
        }
        else{
            ans.mau = ps1.mau * ps2.mau;
            ans.tu = ps1.tu*ps2.mau + ps2.tu*ps1.mau;
        }
        return ans;
    }
    
    // Tru 2 phan so
    
    public static Phan_so truPS(Phan_so ps1, Phan_so ps2){
        // ket qua cua phep tru 2 phan so
        Phan_so ans= new Phan_so();
        // Check xem 2 phan so co chung mau so khong
        if(ps1.mau == ps2.mau){
            ans.mau = ps1.mau;
            ans.tu = ps1.tu - ps2.tu;
        }
        else{
            ans.mau = ps1.mau * ps2.mau;
            ans.tu = ps1.tu*ps2.mau - ps2.tu*ps1.mau;
        }
        return ans;
    }
    
    // Phep nhan 2 phan so
    
    public static Phan_so nhanPS(Phan_so ps1, Phan_so ps2){
        // ket qua cua phep cong 2 phan so
        Phan_so ans= new Phan_so();
        // Check xem 2 phan so co chung mau so khong
        ans.tu = ps1.tu*ps2.tu;
        ans.mau = ps1.mau*ps2.mau;
        return ans;
    }
    
    // Phep chia 2 phan so
    
     public static Phan_so chiaPS(Phan_so ps1, Phan_so ps2){
        // ket qua cua phep cong 2 phan so
        Phan_so ans= new Phan_so();
        // Check xem 2 phan so co chung mau so khong
        ans.tu = ps1.tu*ps2.mau;
        ans.mau = ps1.mau*ps2.tu;
        return ans;
    }
     
     // Check 2 phan so bang nhau
     
     public static boolean equals(Phan_so ps1, Phan_so ps2){
         return ps1.tu * ps2.mau == ps1.mau * ps2.tu;
     }
     
     private int tu;
     private int mau;
     // Constructor
     
     public Phan_so(int tu, int mau){
        if(mau!=0){
           this.mau = mau;
           this.tu = tu;
        }
        else{
            System.out.print("Mau so phai so gia tri khac 0");
            return;
        } 
     }
     
     public Phan_so(){
         // constructor rong
     }
    
    // 2 ham tra ve mau so va tu so cua phan so
    
    public int getMauso(){return mau;}
    public int getTuso(){return tu;}
    
   
}
