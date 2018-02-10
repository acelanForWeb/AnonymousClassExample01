package tw.acelan;

public class Test {
	public static void main(String[] args){
		//實體化一個實作男人「吃」方法的匿名類別
		Person man = new Person(){
			@Override
			public void eat() {
				System.out.println("男人狼吞虎嚥的吃");
			}
			
		};
		
		//實體化一個實作女人「吃」方法的匿名類別
		Person woman = new Person(){

			@Override
			public void eat() {
				System.out.println("女人細嚼慢嚥的吃");
			}
			
		};
		
		man.eat();
		woman.eat();
	}
}
