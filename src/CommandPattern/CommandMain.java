/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandPattern;

/**
 *
 * @author tophu
 */
public class CommandMain {
    public static void main(String[] args) {
      giohang gh = new giohang();
      Store store = new Store();
      
      gh.duyethang(new Chitietgiohang("USB", 5, 10000));
      gh.duyethang(new Chitietgiohang("CPU", 6, 20000));
      gh.duyethang(new Chitietgiohang("RAM", 2, 30000));
      
      store.nhangiohang(gh);
      gh.inhoadon(store);
      
      gh.huyduyethang();
      
      store.nhangiohang(gh);
      
      System.out.println("\n Sau khi hủy: ");
      gh.inhoadon(store);
      
    }
}
