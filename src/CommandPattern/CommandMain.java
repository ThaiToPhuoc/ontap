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
        giohang gh = new giohang();
        Command cmd1 = new Command(new Chitietgiohang("CPU", 1, 100),store);
        Command cmd2 = new Command(new Chitietgiohang("RAM", 3, 50),store);
        Command cmd3 = new Command(new Chitietgiohang("USB", 2, 40),store);
        
        gh.duyet(cmd1);
        gh.duyet(cmd2);
        gh.duyet(cmd3);
        gh.xacnhanmua();
        
        gh.huyduyet();
        gh.xacnhanmua();
    }
}
