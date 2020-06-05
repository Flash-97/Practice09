package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Goods> list = new ArrayList<Goods>();
		int total = 0;
		String str = new String();

		System.out.println("상품을 입력해주세요(종료 q)");

		while (true) {
			str = sc.nextLine();

			if (str.equals("q")) {
				break;
			}

			String[] a = str.split(",");
			Goods goods = new Goods(a[0], Integer.parseInt(a[1]), Integer.parseInt(a[2]));
			list.add(goods);
		}

		for (int i = 0; i < list.size(); i++) {
			total += list.get(i).getCount();
			list.get(i).showInfo();
		}

		System.out.println("모든 상품의 갯수는 " + total + "개입니다.");

		sc.close();
	}

}