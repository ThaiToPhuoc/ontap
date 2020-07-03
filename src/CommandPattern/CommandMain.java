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
        Store store = new Store();
        
        Giohang gh = new Giohang(store);
        System.out.println("Các món hàng: \n");
        gh.xacnhanmua("USB", 2, 100);
        gh.xacnhanmua("Laptop", 1, 2400);
        gh.xacnhanmua("Chuot", 10, 20);
        
        gh.tongtien();
    }
}
