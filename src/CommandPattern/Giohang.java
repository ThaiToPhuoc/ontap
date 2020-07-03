/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tophu
 */
public class Giohang {
    List<command> giohang = new ArrayList<>();
    Store store;
    int d = -1;
    
    public Giohang(Store store) {
        this.store = store;
    }
    
    public void xacnhanmua(String tenhang, int soluong, int dongia)
    {
        command ctgh = new Chitietgiohang(tenhang,soluong,dongia,store);
        ctgh.mua();
        giohang.add(ctgh);
        d++;
    }
    
    public void xacnhanhuy()
    {
        if(d >=0)
        {
            giohang.remove(d);
            d--;
        }
    }
    
    
    public void tongtien()
    {
        System.out.println("Tổng số tiền đã mua: "+ store.getTongtienmua());
    }
}
