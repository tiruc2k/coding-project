package org.tc.ebay;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class test implements Cloneable{
	
	public static void main(String ... strings) throws CloneNotSupportedException{
		test t = new test();
		System.out.println(t.clone());
	}

}

class MySerializable implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 int id;  
	 String name;  
	 public MySerializable(int id, String name) {  
	  this.id = id;  
	  this.name = name;  
	 }  
	 
	 public static void serialize(){
		 MySerializable s1 =new MySerializable(211,"ravi");  
		  try{
			  ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("f.txt"));  
			  out.writeObject(s1);  
			  out.flush();  
		  }catch(Exception ex){
			  ex.printStackTrace();
		  }
		  finally{
			  
		  }
		  System.out.println("success");
	 }
	 
	 public static MySerializable deserialize(){
		 MySerializable obj = null;
		 ObjectInputStream in = null;
		 try{
			   in=new ObjectInputStream(new FileInputStream("f.txt"));  
			   obj =(MySerializable) in.readObject();  
		      
		  }catch(Exception ex){
			  
		  }
		  finally{
			  if(in != null)
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
		  }
		  System.out.println("success");
		 return obj;
	 }
	 
	 public static void main(String ... args){
		 serialize();
		 MySerializable obj = deserialize();
		 System.out.println(obj.id +":"+obj.name);
		 
	 }
	
	
}

