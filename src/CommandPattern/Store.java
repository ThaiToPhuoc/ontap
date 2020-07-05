/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandPattern;

import java.util.Stack;

/**
 *
 * @author tophu
 */
public class Store {
    Stack<Chitietgiohang> CTGH = new Stack<>();
    giohang giohang;

    public void nhangiohang(giohang gh)
    {
        this.giohang = gh;
        this.CTGH = gh.getCTGH();
    }

    public Stack<Chitietgiohang> getCTGH() {
        return CTGH;
    }
    
    public void muahang(Chitietgiohang product) {
        System.out.println("\n Đã thêm " + product.getTenhang() + " vào giỏ hàng!");
        CTGH.push(product);
    }
 
    public void trahanglai() {
        if (!CTGH.isEmpty()) {
            System.out.println("\n Đã bỏ " + CTGH.lastElement().getTenhang() + " ra khỏi giỏ hàng!");
            CTGH.pop();
        }
        else
            System.out.println("Giỏ hàng trống!");
    }
 
    public void tinhtien() {
        int tong = 0;
        System.out.println("\nDanh sách các món hàng đã thanh toán:");
        for (Chitietgiohang product : CTGH) {
            tong += product.getDongia()*product.getSoluong();
            System.out.println("\n Tên hàng: " + product.getTenhang());
            System.out.println("\n Số lượng: " + product.getSoluong());
            System.out.println("\n Đơn giá: " + product.getDongia());
        }
        
        System.out.println("\nTổng tiền cần thanh toán: " + tong);
    }
    
    public void khongmuanua()
    {
        CTGH.clear();
    }
    
    public void xuathoadon(giohang gh)
    {
        gh.inhoadon(this);
    }
}
