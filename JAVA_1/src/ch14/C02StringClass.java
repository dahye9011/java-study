package ch14;

public class C02StringClass {

	public static void main(String[] args) {
		// 1 => 같은 메모리 주소 참조
		String str1 = "java";
		String str2 = "java";
		
		// 2 => 서로 다른 메모리 주소
		// 같은 문자열이라도 new 키워드를 사용하면 항상 새로운 객체가 생성됨
		String str3 = new String("java");
		String str4 = new String("java");
		
		// System.identityhashcode() : 실제 주소를 기준으로 Hashing 한 값을 출력
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println();
		
		// hashCode() : 객체의 내용("java")을 기준으로 Hashing 한 값을 출력
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println();
		// 같은 hashCode를 가지더라도 서로 다른 객체일 수 O
		
		// "=="은 서로 동일한 인스턴스인지, 같은 메모리 주소값을 지니는지 <- 객체가 참조하고 있는 메모리 값을 비교
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str3 == str4 : " + (str3 == str4));
		System.out.println("str1 == str3 : " + (str1 == str3));
		System.out.println("str1 == str4 : " + (str1 == str4));
		System.out.println();
		
		// equals 메서드 사용하여 문자열 내용 비교
		// 객체가 가리키고 있는 값 자체 == 문자열 자체 비교, 객체가 참조하고 있는 메모리 내의 값을 비교
		System.out.println("str1 == str2 : " + (str1.equals(str2)));
		System.out.println("str3 == str4 : " + (str3.equals(str4)));
		System.out.println("str1 == str3 : " + (str1.equals(str3)));
		System.out.println("str1 == str4 : " + (str1.equals(str4)));
	}

}
