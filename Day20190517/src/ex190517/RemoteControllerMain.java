package ex190517;

public class RemoteControllerMain {

	public static  void main(String[] args) {
		
		//�������̽� Ÿ���� ���� rc�� ����
		RemoteControl rc;
		//rc�� TV��ü�� �����ؼ� TV�� �� �޼ҵ带 ȣ���ϰ�.
		rc= new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		//rc�� Audio ��ü�� �� ���ؼ� Audio�� �� �޼ҵ� ȣ��
		rc=new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		
		
	}

}
