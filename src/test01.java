
interface inter{
	float methodA(int x, float y);
}

class parent{
	int a;
	float b;
	
	parent(){}
	parent(int a, float b){
		this.a = a;
		this.b = b;
	}
}

class child extends parent implements inter{
	@Override
	public float methodA(int x, float y) {
		return x+y;
	}
}


public class test01 {

	public static void main(String[] args) {
		parent p = new parent(3,3.7f);
		inter in = new child();
		float result = in.methodA(p.a, p.b);
		System.out.println(result);
	}

}