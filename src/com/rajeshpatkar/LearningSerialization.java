package com.rajeshpatkar;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;

public class LearningSerialization {

   public static void main(String[] args) throws Exception {
   
       FileOutputStream fos = new FileOutputStream("D:\\output.txt");
       ObjectOutputStream oos = new ObjectOutputStream(fos);
       C2 obj2 = new C2(99, 88);
       C1 obj1 = new C1(10, 20, obj2);
       System.out.println(obj1);
       oos.writeObject(obj1);
       System.out.println("successfully written the object in the file");
       System.out.println("attempting the deserialize the object....");
       FileInputStream fis = new FileInputStream("D:\\output.txt");
       ObjectInputStream ois = new ObjectInputStream(fis);
       C1 obj3 = (C1) ois.readObject();
       System.out.println("reading compelete .. ");
       System.out.println("printing the deserialized object");
       System.out.println(obj3);
    }
}