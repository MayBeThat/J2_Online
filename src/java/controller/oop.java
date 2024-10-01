/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import java.util.Scanner;
import models.Coder;
import models.Person;

/**
 *
 * @author ASUS
 */
public class oop {

    public static void main(String[] args) {

        // parameter: tham số : thongbao(String baocao)
        // aguments: ở hàm main hay phương thức khác
        //thongbao("hom nay nghi sớm hơn 30p")
        // từ khoas this: phăn biệt biến instance với:
        // biến cục bộ - parameter có cùng tên
        //instanceof() -> trả về true, false 
        //toán tử instanceof() sẽ được sử dụng để kiểm tra 
        //xem 1 đối tượng có thuộc về 1 kiểu dữ liệu cụ thể nào hay ko(có thể là lớp interface)
        
        
        
        Coder coder1 = new Coder();
        Coder coder2 = new Coder();

        Scanner sc = new Scanner(System.in);

        System.out.println("Yeu cau nhap ten: ");
        String name = sc.next();
        coder1.setName(name);

        System.out.println("yeu cau nhap tuoi: ");
        int age = sc.nextInt();
        coder1.setAge(age);
        while (coder1.getAge() == 0) {
            age = sc.nextInt();
            coder1.setAge(age);
        }
        System.out.println("yeu cau nhap sdt: ");
        String phone = sc.next();
        coder1.setPhone(phone);

        System.out.println("ngon ngu lap trinh: ");
        String lang = sc.next();
        coder1.setProgramming_Language(lang);

        System.out.println("name" + coder1.getName()
                + "\ntuoi" + coder1.getAge()
                + "\nsdt" + coder1.getPhone()
                + "\nlang" + coder1.getProgramming_Language());
        
        Person ps1 = new Person();
        System.out.println(coder1 instanceof Person);
        System.out.println(ps1 instanceof Coder);
    }
}
