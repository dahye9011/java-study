package ch16;

import java.util.Scanner;

public class C03PracArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score[][] = new int[5][3];
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				score[i][j] = sc.nextInt();
			}
		}
		
		int i = 1;
		for(int[] n : score) {
			System.out.print(i + "학생 점수 입력(국/영/수 순서) : ");
			for(int m : n ) {
				System.out.print(m + " ");
			}
			System.out.println();
			i++;
		}
		
		double avg;
		
		int j = 1;
		
		for(int[] n : score) {
			int sum = 0; // 합계 0으로 초기화해야 점수 누적 X
			for(int m : n) {
				sum += m;
			}
			avg = (double)sum / 3;
			System.out.println(j + "학생 총점 : " + sum + "\t평균 : " +avg);
			j++;
		}
		
		int kall = 0;
		int eall = 0;
		int mall = 0;
		
		double kavg, eavg, mavg;
		
		for(int l = 0; l < score.length; l++) {
			kall += score[l][0];
			eall += score[l][1];
			mall += score[l][2];
		}
		kavg = (double)kall / 5;
		eavg = (double)eall / 5;
		mavg = (double)mall / 5;
		
		System.out.printf("국어 총점 : %d\t 국어 평균 : %f\n", kall, kavg);
		System.out.printf("영어 총점 : %d\t 영어 평균 : %f\n", eall, eavg);
		System.out.printf("수학 총점 : %d\t 수학 평균 : %f\n", mall, mavg);
	}
}
