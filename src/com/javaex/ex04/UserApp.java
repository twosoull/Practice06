package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		//배열로 묶기위해 월급과 직원의 부모인 고객의 자료형으로 묶고 
		//오버라이딩을 이용하기위해 포인트전역변수가 있는 고객의 객체를 인스턴스해 사용함
		User uc01=new Customer("jws","j1234","정우성",1000);
//		uc01.showInfo();
		User uc02=new Customer("yjs","y2345","이효리",2000);
//		uc02.showInfo();
		
		//같은 방식으로 월급을 사용하기위해 직원객체로 불러옴
		//약간의 실험을 위해 다른방식을 사용해봄
		User ue01 = new Employee("master","m7788","운영자");
//		ue01.showInfo();//아직 월급이없음
		//캐스팅으로 5000000을 추가해줌 //다운캐스팅 일거같은데..ㅜㅜ 
		((Employee)ue01).setSalary(5000000);
//		ue01.showInfo();//이제 월급이 생김 이제 돈을 받을수있다!
		
		//이제 for문으로 돌려주도록 하기위해서 user타입의 배열을 만든다
		User[] uArray = new User[3];//아직 user타입을 받을수있는 통이 3개의통이 만들어졌을뿐이다
		uArray[0] = uc01;//주소를 담아줘야 한다
		uArray[1] = uc02;//객체는 총 3개이고(6개된거아님) 자료형만 같을 뿐 객체는 2개커스토머 1개 엠플로이임을 잊지말자
		uArray[2] = ue01;
		
		for(int i = 0 ; i<uArray.length; i++) {
			uArray[i].showInfo();
		}
		//이제 운영자의 월급을 읽어주자 2가지 방법이 생각나는데..
		//Employee에 메소드를 하나 만들어 읽어주는 방식이있지만
		//캐스팅 연습겸 시스템아웃을 써보자
		System.out.println("운영자의 월급은 "+((Employee)ue01).getSalary()+"원 입니다.");
		//끝으로 이렇게 (Employee)명시적타입변환을 해주지 않으면  ue01의 자료형은 주소는
		//user객체만을 보고 있기 때문에 Employee 객체를 둘려보는게 불가능하다.
	}

}
