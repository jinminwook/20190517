package ex190517;

public class Employee {
	//������ �̸�,�޿� ������ ����������.
	public String name;
	public double sal;
	Employee(String name,double sal){
		this.name=name;
		this.sal=sal;
	}
	
	//�޿� �λ� ���� �޼ҵ带 ����.(�λ����� 10%)
	void raise() {
		this.sal=this.sal*1.1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	
	
}
