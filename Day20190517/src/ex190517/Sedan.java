package ex190517;

public class Sedan extends Car {

	Sedan(String Color, int Speed) {
		super(Color, Speed);
		this.jim();
		
	}
	@Override
	void jim() {
		System.out.println(this.color+"Sedan��"+"����� ���� �� �ִ�."+"�ӵ���"+this.Speed+"�ӵ��� �޸������Դϴ�.");
	}
	
}
