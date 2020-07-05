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
public class dathang implements ICommand{
    Chitietgiohang product;
    Store store;

    public dathang(Chitietgiohang product, Store store) {
        this.product = product;
        this.store = store;
    }

    public Chitietgiohang getProduct() {
        return product;
    }
    
    

    @Override
    public void excute() {
        System.out.println("\n" + product.getTenhang() + ", " + product.getSoluong() + ", "+ product.getDongia());
    }

    @Override
    public void unexcute() {
        store.huy();
    }
    
    public int tinhtien()
    {
        return store.tinhtien(product);
    }
}
