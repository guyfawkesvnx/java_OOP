package baiTap41;


import java.io.File;
 
public class listDR {
	 
	    public static void main(String[] args) {
	    	String[] dirL;
	    	
	        File dirFile = new File("C:\\Users\\Quan\\Desktop\\my-app");
	        File[] listFile = dirFile.listFiles();
	        
	        for(File dir : listFile) {
	        		System.out.println(dir.getAbsolutePath());
	        }
	        System.out.println("------------------");
	        String[] nameFile = dirFile.list();
	        boolean folder = dirFile.isDirectory();
	        for(String path : nameFile) {
	        	if(folder == true)
	        	{
	        	System.out.println(" DIR " + path);
	        	}
	        	if(folder == false)
	        	{
	        		System.out.println(" File " + path);
	        	}
	        	}
	        }
	        
	        
	 }
