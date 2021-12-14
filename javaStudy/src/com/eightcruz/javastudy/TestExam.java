package com.eightcruz.javastudy;

import javaStudy.AccessObj;

public class TestExam {

		public static void main(String[] args) {
			AccessObj obj = new AccessObj();
			
			System.out.println(obj.p);
//			System.out.println(obj.p2);
//			//팩키지가 달라
//			System.out.println(obj.k);
			
			//System.out.println(obj.p3);
			//실행조차 안됨, 접근제어자 - 자기자신만 쓰기에
			
		}

	}
