package pack;

import java.util.Scanner;

public class Quest3 {
	public static void main(String[] args) {
		int totalDays = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("�⵵�� �Է��ϼ��� :");
		int year = sc.nextInt();

		System.out.println("���� �Է��ϼ��� :");
		int month = sc.nextInt();

		System.out.println("���� �Է��ϼ��� :");
		int day = sc.nextInt();

		// ���� �⵵������ �� �� ��� (1���� 365�Ϸ� ����ϰ� �ű⿡ ������ ȸ���� ���ؼ� ���Ѵ�.)
		totalDays = (year - 1) * 365
				+ ((year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400);

		// ���� �������� �� ���� ���ؼ� totalDays�� �����Ѵ�.
		for (int i = 1; i < month; i++) {
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10) { // 31�ϱ���
																				// �ִ�
																				// ��
				totalDays += 31;
			} else if (i == 4 || i == 6 || i == 9 || i == 11) { // 30�ϱ��� �ִ� ��
				totalDays += 30;
			} else { // 2���� ����, ��� �˻� �� 28�� �Ǵ� 29�Ϸ� ���
				if (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0)) {
					totalDays += 29;
				} else {
					totalDays += 28;
				}
			}
		}

		totalDays += day; // �̹� ���� ���ñ����� �� ���� totalDays�� ����

		String dayOfWeek = "";

		switch (totalDays % 7) {
		case 0:
			dayOfWeek = "�Ͽ���";
			break;
		case 1:
			dayOfWeek = "������";
			break;
		case 2:
			dayOfWeek = "ȭ����";
			break;
		case 3:
			dayOfWeek = "������";
			break;
		case 4:
			dayOfWeek = "�����";
			break;
		case 5:
			dayOfWeek = "�ݿ���";
			break;
		case 6:
			dayOfWeek = "�����";
			break;
		}
		System.out.println(year + "��" + month + "��" + day + "����" + dayOfWeek
				+ "�Դϴ�.");
		System.out.println("");
	}
	

}
