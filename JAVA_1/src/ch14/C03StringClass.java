package ch14;

import java.util.Scanner;

public class C03StringClass {

	public static void main(String[] args) {
		int alength, blength;
		char achar, bchar;
		
		String str1 = new String("java Powerful");
		String str2 = new String("java Programming");
		String str3 = str1 + str2;	
		
		System.out.println(str3);
		
		alength = str1.length();	// length() : 문자열의 길이를 반환
		blength = str2.length();
		achar = str1.charAt(5);		// charAt(index) : index에 있는 문자를 반환
		bchar = str2.charAt(10);
		
		System.out.println("str1에 저장 =" + str1 + " 길이 = " + alength);
		System.out.println("str2에 저장 =" + str2 + " 길이 = " + blength);
		System.out.println("str1의 5번째 문자 = " + achar);
		System.out.println("str2의 10번째 문자 = " + bchar);
		System.out.println();
		
		System.out.println("str1의 대문자로 변환 : " + str1.toUpperCase());
		System.out.println("str1의 소문자로 변환 : " + str1.toLowerCase());
		System.out.println("str2의 a를 A로 변환 : " + str2.replace('a', 'A'));
		System.out.println();
		
		// trim() : 공백 또는 제거하고 싶은 문자
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		
		System.out.println(tmp);
		System.out.println(tmp.trim());
		System.out.println();
		
		// subString() : 문자열 자르기
		System.out.println(tmp.substring(2));	// 2번째 index부터 끝까지 출력
		System.out.println(tmp.substring(0, 2));	// 0~1 출력
		
		// indexOf("문자열") : 문자열의 index 번호 확인 (앞에서부터 검색했을 때 최초 발견되는 문자열의 index)
		System.out.println(tmp.indexOf("H"));	// H 없으면 -1 return
		
		// lastIndexOf("문자열") : 문자열의 index 번호 확인 (뒤에서부터 검색했을 때 최초 발견되는 문자열의 index)
		System.out.println(tmp.lastIndexOf("H"));
		
		// contains("문자열") : 문자열 포함 여부
		System.out.println(tmp.contains("H"));
	}

}
