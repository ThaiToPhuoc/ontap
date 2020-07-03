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
public class Chitietgiohang implements command{
    String tenhang;
    int soluong;
    int dongia;
    Store store;

    public Chitietgiohang(String tenhang, int soluong, int dongia, Store store) {
        this.tenhang = tenhang;
        this.soluong = soluong;
        this.dongia = dongia;
        this.store = store;
    }

    @Override
    public void mua() {
        System.out.println(store.muahang(tenhang, soluong, dongia));
    }
    
}
