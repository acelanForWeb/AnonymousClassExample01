package tw.acelan;

public class Test {
	public static void main(String[] args){
		//����Ƥ@�ӹ�@�k�H�u�Y�v��k���ΦW���O
		Person man = new Person(){
			@Override
			public void eat() {
				System.out.println("�k�H�T�]���`���Y");
			}
			
		};
		
		//����Ƥ@�ӹ�@�k�H�u�Y�v��k���ΦW���O
		Person woman = new Person(){

			@Override
			public void eat() {
				System.out.println("�k�H���Z�C�`���Y");
			}
			
		};
		
		man.eat();
		woman.eat();
	}
}
