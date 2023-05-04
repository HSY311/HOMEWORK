package day19;

class Member5{
	String name;
	String tel;
	String address;
	
	Member5(){
		this("no name");
		System.out.println("Parameter가 없는 생성자의 this() 후");
	}
	
	Member5(String name){
		this("test", "222", "NY");
		System.out.println("Parameter 1개를 갖는 생성자의 this() 후");
		System.out.println("전달받은 Parameter : " + name);
	}
	
	Member5(String name, String tel, String address){
		System.out.println("Parameter 3개를 가진 생성자가 호출됨");
		this.name = name;
		this.name = tel;
		this.name = address;
	}
	
	void print() {
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("address : " + address);
	}
}

public class Member5Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member5 m = new Member5();
		m.print();
	}

}
