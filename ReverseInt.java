package Guvi;

public class ReverseInt {
	 public int getReverseInt(int value) {
		    int resultNumber = 0;
		    for(int i = value; i !=0; i /= 10) {
		        resultNumber = resultNumber * 10 + i % 10;
		    }
		    return resultNumber;        
		}

}
