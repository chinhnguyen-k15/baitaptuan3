
package com.mycompany.javaapplication.Tuan3;
//ĐỒNG BỘ LUỒNG 1
public class VD01 {
    private int count=0;
    public synchronized void demTang()//ham dong bo hoa
    {
        count++;
    }
}
