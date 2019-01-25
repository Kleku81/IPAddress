package inet.ipaddr;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.apache.commons.lang.ArrayUtils;



public class TestAddres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IPAddress address = new IPAddressString("1.2.3.4/24").getAddress();
		
		Integer[] myArray = {897, 56, 78, 90, 12, 123, 75};
	      Iterator<Integer> iterator = Arrays.stream(myArray).iterator();
	      while(iterator.hasNext()) {
	         System.out.println(iterator.next());
	      }
		
		Byte[] b = ArrayUtils.toObject(address.getBytes());
		
		Iterator<Byte> iterator1 = Arrays.stream(b).iterator();
		
		//while(iterator1.hasNext())
		for(Byte by : b)	
			System.out.println(iterator1.next());
		
		System.out.println("address version = "+ address.getIPVersion());
		System.out.println(new HostName("[008JQWOV7O(=61h*;$LC]").getAddress());

	}

}
