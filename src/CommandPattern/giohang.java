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
public class giohang {
    List<Command> CTGH = new ArrayList<>();
    Store store = new Store();

    public giohang() {
    }

    public List<Command> getCTGH() {
        return CTGH;
    }

    
    public void chuyentoistore(Store store) {
        this.store = store;
        store.nhangiohang(this);
    }
    
     public void duyet(Command cmd) {
         System.out.println("\n Đã thêm " + cmd.getProduct().getTenhang() + " vào giỏ hàng!");
         CTGH.add(cmd);
    }
 
    public void huyduyet() {
        if (!CTGH.isEmpty()) {
            System.out.println("\n Đã bỏ " + CTGH.get(CTGH.size()-1).getProduct().getTenhang() + " ra khỏi giỏ hàng!");
            CTGH.remove(CTGH.size() - 1);
        } else {
            System.out.println("Không còn hàng để hủy!");
        }
    }
    
    public void xacnhanmua()
    {
        int tong = 0;
        System.out.println("Danh sách các món hàng đã mua:");
        for(Command cmd : CTGH)
        {
            cmd.excute();
            tong += cmd.tinhtien();
        }
        System.out.println("\n Tổng cộng: " + tong);
    }
}
