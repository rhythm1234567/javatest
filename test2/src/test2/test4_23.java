package test2;


	
	
	class MyException extends Exception{

		public MyException(String string) {
			// TODO Auto-generated constructor stub
			super(string);
		}
		
	}
	 class tool{
		public static int parseInt(String str) throws MyException
		{int x=0;
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
			
				return x;
			}else {
				throw new MyException("输入有误");
			}
			
			}
		return 0;
		}
	}
	public class test4_23 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tool t=new tool();
		try {
			int x=t.parseInt("z2");
		}catch(MyException e) {
		
		
			e.printStackTrace();
		
		}
	}
	}










