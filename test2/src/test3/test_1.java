package test3;

import java.util.Objects;

public class test_1{
	class Apple {
		public String color;
		public int w;
		public Apple(String c,int w) {this.color=c;this.w=w;}
		public String getcolor() {return color;}
	}
	@FunctionalInterface
	public interface Consumer<T> {

	    void accept(T t);
	   
	    

	    default Consumer<T> andThen(Consumer<? super T> after) {
	        Objects.requireNonNull(after);
	        return (T t) -> { accept(t); after.accept(t); };
	    }
	}
	static class test{	
		public static void ConsumerApple(Apple[] apps,Consumer<Apple> c){
		 for(Apple app:apps){
			 c.accept(app);
		 }
	 }


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test_1 t=new test_1();
		test_1.Apple a1=t.new Apple("红",1);
		
		Apple[] app=new Apple[2];
		app[0]=a1;
		app[1]=a1;
		test.ConsumerApple(app,(Apple a)-> System.out.println(a.color+a.w)
		 );
		test.ConsumerApple(app, new Consumer<Apple>(){

			@Override
			public void accept(Apple a) {
		
				System.out.println(a.color+a.w);
			}
			   
		});
	}

}

