package com.javaex.ex03;

public class Shape {
	//둘째로 상속하고있는 전역변수를 가져와서 쓰고 싶어하는 것같은데
    //공부하기로는 protected는 상속클래스 클래스도 거쳐간다고 배웠다.
	protected String fillColor;
	protected String lineColor;
	//빙고!
	
	//첫째로
	//트라이앵글은 shape를 상속하고있다
	//객체를 만들어 인스턴스화 시킬떄에 shape의 생성자를 훍고간다
	//현재 triangle에는 현재 shape의 유일한 생성자인
	//스트링이 2개가 매개변수로 있는 생성자를 사용하지않고있다
	//그러므로 아무것도 들지않은 일반생성자를 지나가는데
	//없으니 에러가 나는 것 같다. 일단 넣어보겠다
	
	public Shape() {
		
	}
	//빙고!

	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
}

