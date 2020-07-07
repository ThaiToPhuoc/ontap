/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPattern;

import java.util.ArrayList;

/**
 *
 * @author tophu
 */
public class Hoadonsingleton {
    Hoadonheader header = new Hoadonheader();
    ArrayList<CTHD> chitiet = new ArrayList<>();

    
     protected Hoadonsingleton(buildersingleton builder) {
        this.header = builder.header;
        this.chitiet = builder.chitiet;
    }

    public String hienthiCTHD(){
        String ht = "";
        for(int i = 0; i < chitiet.size(); i++){
            ht+= "\nTên sản phẩm: " + chitiet.get(i).getTenSP()
                +"\tSố lượng: " + chitiet.get(i).getSoluong()
                +"\tĐơn giá: " + chitiet.get(i).getDongia()
                +"\tChiết khấu: " + chitiet.get(i).getChietkhau();
            }
        return ht;
    }

    @Override
    public String toString() {
        return "chi tiết hóa đơn: \nMã Hóa đơn: " + header.getMaHD() +
                "\nTên khách hàng: " + header.getTenKH() +
                "\nNgày bán: " + header.getNgayban()
                +"\nDanh sách sản phẩm: " + hienthiCTHD();
    }
    
    
    public static class buildersingleton{
        Hoadonheader header = new Hoadonheader();
        ArrayList<CTHD> chitiet = new ArrayList<>();
        
        private static buildersingleton instance = new buildersingleton();
        
        public buildersingleton setheader(Hoadonheader HD){
            instance.header = HD;
            return instance;
        }
        
        public buildersingleton addchitiet(CTHD p){
            instance.chitiet.add(p);
            return instance;
        }
        
        public Hoadonsingleton build(){
            return new Hoadonsingleton(instance);
        }
    }
}
