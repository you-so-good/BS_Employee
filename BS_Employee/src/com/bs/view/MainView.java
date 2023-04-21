package com.bs.view;

import java.util.Scanner;

import com.bs.controller.EmployeeController;

public class MainView {
// 어쩌면 dept랑 job 서브메뉴를 다른 클래스에? 넣을 필요까지는 없나?
	
	public void MainMenu() {
		EmployeeController controller=new EmployeeController();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println(" ==== 사원관리 프로그램 메인메뉴 ==== ");
			System.out.println("1. 전체 사원 조회");
			System.out.println("2. 선택하여 사원조회");
			System.out.println("3. 신규 사원 등록");
			System.out.println("4. 사원 정보 수정");
			System.out.println("5. 사원 삭제");
			System.out.println("6. 부서관리 메뉴로 이동");
			System.out.println("7. 직책관리 메뉴로 이동");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 번호 선택 : ");
			int menuSelect=sc.nextInt();
			switch(menuSelect) {
			case 1:controller.
			case 2:controller.
			case 3:controller.
			case 4:controller.
			case 5:controller.
			case 6:controller.
			case 7:controller.
			case 0:System.out.println("프로그램을 종료합니다."); return;
			default:System.out.println("없는 메뉴를 선택하셨습니다."); break;
			}
		}
	}
	
	
	
	
	
	
	
	
}
