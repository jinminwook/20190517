package ex190517;
//�߻�Ŭ���� ���� Ŭ���� �տ� abstract
public abstract class Phone {
	/*
	 * �߻�Ŭ���� ����ϴ� ����
	 * 	-�߻�Ŭ������ ��üŬ����(�ڽ�Ŭ����)�� �԰��� ������ �� ����.
	 * 	:�԰��̶�� �ϴ� ���� �ʵ�,������,�޼ҵ带 �ǹ�
	 * 	-��ü Ŭ������ �߻�Ŭ�������� ���ǵ��� ���� �߰� �ʵ�,�޼ҵ常
	 * �����ϸ� �Ǳ� ������ �ڵ带 ���� �� ����.
	 * 	-�߻�޼ҵ嵵 ������ �� ������,
	 * 	�߻�޼ҵ�� ���೻���� ���� �̸��� ����� ������.
	 *  - ��,�߻�Ŭ������ ��ü�� ���� �� ����.
	 */
	
	
	
	//�ʵ弱��
	public String owner;
	
	//������ ����
	public Phone(String owner) {
		this.owner=owner;
	}
	//�޼ҵ� ����
	public void turnOn() {
		System.out.println("�� ���� ��");
	}
	public void turnOff() {
		System.out.println("�� ���� ��");
	}
	
}