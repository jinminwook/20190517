package ex190517;

public class EmployeeMain {

	public static void main(String[] args) {
			//�� ���޺� ������ ���� ��ü�� ����
		Employee emp=new Employee("���",200);
		
		//�޿��� �λ����ְ�
		//�� ������ �̸�,�޿�,���ʽ�,����ɼ��� ���� ����Ѵ�.
		System.out.println("�̸� "+emp.getName());
		System.out.println("�޿� "+emp.getSal());
		emp.raise();
		System.out.println("�̸� "+emp.getName());
		System.out.println("�޿� "+emp.getSal());
	}

}
