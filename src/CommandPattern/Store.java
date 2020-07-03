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
public class Store {
    int tongtienmua = 0;

    public Store() {
    }
    
    public String muahang(String tenhang, int soluong, int dongia)
    {
        tongtienmua += soluong*dongia;
        StringBuilder builder = new StringBuilder();
        builder.append(tenhang)
                .append(" | ")
                .append(soluong)
                .append(" | ")
                .append(soluong*dongia)
                .append("\n");
        return builder.toString();
    }

    public int getTongtienmua() {
        return tongtienmua;
    }
    
}
