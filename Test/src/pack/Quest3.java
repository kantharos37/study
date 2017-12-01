package pack;

import java.util.Scanner;

public class Quest3 {
	public static void main(String[] args) {
		int totalDays = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("년도를 입력하세요 :");
		int year = sc.nextInt();

		System.out.println("월을 입력하세요 :");
		int month = sc.nextInt();

		System.out.println("날을 입력하세요 :");
		int day = sc.nextInt();

		// 이전 년도까지의 날 수 계산 (1년은 365일로 계산하고 거기에 윤년의 회수를 구해서 더한다.)
		totalDays = (year - 1) * 365
				+ ((year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400);

		// 이전 월까지의 날 수를 구해서 totalDays에 누적한다.
		for (int i = 1; i < month; i++) {
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10) { // 31일까지
																				// 있는
																				// 달
				totalDays += 31;
			} else if (i == 4 || i == 6 || i == 9 || i == 11) { // 30일까지 있는 달
				totalDays += 30;
			} else { // 2월은 윤달, 평달 검사 후 28일 또는 29일로 계산
				if (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0)) {
					totalDays += 29;
				} else {
					totalDays += 28;
				}
			}
		}

		totalDays += day; // 이번 달의 오늘까지의 날 수를 totalDays에 누적

		String dayOfWeek = "";

		switch (totalDays % 7) {
		case 0:
			dayOfWeek = "일요일";
			break;
		case 1:
			dayOfWeek = "월요일";
			break;
		case 2:
			dayOfWeek = "화요일";
			break;
		case 3:
			dayOfWeek = "수요일";
			break;
		case 4:
			dayOfWeek = "목요일";
			break;
		case 5:
			dayOfWeek = "금요일";
			break;
		case 6:
			dayOfWeek = "토요일";
			break;
		}
		System.out.println(year + "년" + month + "월" + day + "일은" + dayOfWeek
				+ "입니다.");
		System.out.println("");
	}
	

}
