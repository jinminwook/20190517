package ex190517;

public abstract class Animal {
	
	
	//�ʵ� ����
	public String kind;
	//������ ����
	public void breathe() {
		System.out.println("���� ���ϴ�.");
	}
	
	//�߻� �޼ҵ� ����
	public abstract void sound();
}
