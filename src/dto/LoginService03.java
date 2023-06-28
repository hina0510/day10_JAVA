package dto;

import java.util.Scanner;

import time.TimeService;

public class LoginService03 {
	public void display() {
		LoginDTO03 dto = new LoginDTO03();
		Scanner input = new Scanner(System.in);
		TimeService tser = new TimeService();
		String id, pw, gid, gpw, lid, lpw;
		int num;
		
		while(true) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 탈퇴");
			System.out.println("4. 종료");
			System.out.print(">>>");
			num = input.nextInt();
			switch (num) {
			case 1: 
				gid = dto.getId();
				gpw = dto.getPw();
				if(gid==null) {
					System.out.println("저장하세요");
				}else {
					System.out.print("id : ");
					lid = input.next();
					System.out.print("pw : ");
					lpw = input.next();
					
					if(lid.equals(gid)==true) {
						if(lpw.equals(gpw)==true) {
							System.out.println("인증 통과");
							System.out.println("서비스 시간 설정");
							tser.setStTime();
						}else {
							System.out.println("비번 틀림");
						}
					}else {
						System.out.println("존재하지 않는 id");
					}
				}
				break;
			case 2: 
				System.out.print("id : ");
				id = input.next();
				gid = dto.getId();
				if(gid!=null) {
					System.out.println("사용자가 존재함");
				}else {
					dto.setId(id);
					System.out.print("pw : ");
					pw = input.next();
					dto.setPw(pw);
				}
				break;
			case 3: 
				gid = dto.getId();
				if(gid==null) {
					System.out.println("등록값 없음");
				}else {
					dto.setId(null);
					dto.setPw(null);
					System.out.println("탈퇴하였습니다");
				}
				break;
			case 4: 
				tser.setEndTime();
				tser.useTime();
				break;
			}
		}
	}
}
