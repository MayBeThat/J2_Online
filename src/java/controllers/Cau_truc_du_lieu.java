/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import models.Coder;

/**
 *
 * @author MSII
 */
public class Cau_truc_du_lieu {
    public static void main(String[] args) {
        //ArrayList đây là môt cấu trúc dữ liệu lưu trữ các phần tử có cùng kiểu dữ liệu
    //và có kích thước cố đinh. Các pt cững đc đánh số theo index(0).
    ArrayList<String> alist = new ArrayList();
    Coder coder1 = new Coder();
    alist.add("Hoang");
    alist.add("Ngo");
        System.out.println(alist.get(0));
        //LinkedList đây là một danh sách liên kết trong đó mỗi phần tử chứa 1 liên kết
        // đến phần tử tiếp theo
        //head-pt1-pt2-pt3-tall
        LinkedList<String> llist = new LinkedList();
        llist.addFirst("");
        llist.addLast("");
        //Stack: là cấu trúc dữ liệu hoạt động theo nguyên tắc LIFO(Last in- first out)
        // push() thêm phần tử - pop() lấy phần tử
        Stack<String> slist = new Stack();
        slist.push("Hoang");
        slist.push("Ngo");
        String s = slist.pop();
        System.out.println(s);
        //Queue cấu trúc dữ liệu hoạt động theo nguyên tắc FIFO(First in - First out)
        //Queue thường sẽ được triển khai bằng LinkedList
        Queue<String> qlist = new LinkedList();
        qlist.add("Hoang");
        qlist.poll();
        //Hashmap một cấu trúc dữ liệu 
        
        
        
        
        
        
        
        //HashSet là cấu trúc dữ liệu chỉ lưu giữ giá trị duy nhất - k được trùng lặp
        HashSet<String> setlist = new HashSet<>();
        setlist.add("Hoang");
        setlist.add("Ngo");
        System.out.println(setlist);
        //Collection Framwork
        //Thư viện cung cấp cấu trúc dữ liệu và thuật toán được tích hợp sẵn
        //nhằm mục đích hỗ trợ ltv dễ dàng xử lí dữ liệu hơn
        //Một số phương thức phổ biến
        //add(): Thêm phần tử 
        //remove(): Xóa phần tử 
        //contains(): Kiểm tra xem bộ sưu tập có chứa phần tử cụ thể hay không Boolean
        //size(): Trả về số lượng phần tử của bộ sưu tập
        //
    }}
    
    

