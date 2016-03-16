package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        String version = System.getProperty("java.version");
        return Double.parseDouble(version.substring(0, 3));
    }

    public static void main(String[] args) {
	    
    }
}
