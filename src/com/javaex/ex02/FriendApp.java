package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("친구를 3명 등록해 주세요.");
    	
    	ArrayList<Friend> fList = new ArrayList<Friend>();
    	Friend friend[] = new Friend[3];
    	
    	for(int i=0; i<friend.length; i++) {
    		String a = sc.nextLine();
    		String sArray[] = a.split(" ");
    		friend[i] = new Friend(sArray[0], sArray[1], sArray[2]);
    		fList.add(friend[i]);
    		
    	}
    	
    	for (int i=0; i<friend.length; i++) {
    		fList.get(i).showInfo();
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	sc.close();	
    }
    
}
