class def_constructor{
	def_constructor(){
		System.out.println("This is a Default Constructor");
	}
	
	def_constructor(int a){
		System.out.println("This is parameterised Constructor");
	}
}

public class Test{
		public static void main(String[] args){
			System.out.println("Hello");
			def_constructor c = new def_constructor();
			def_constructor d = new def_constructor(10);
			System.out.println("End");
		}
}