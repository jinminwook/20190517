package ex190517;

public class Truck extends Car{

	Truck(String Color, int Speed) {
		super(Color, Speed);
		this.jim();
	}
	@Override
	void jim() {
		System.out.println(this.color+"Truck��"+"���� ���� �� �ִ�."+"�ӵ���"+this.Speed+"�ӵ��� �޸������Դϴ�.");
	}

}
