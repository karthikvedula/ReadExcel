package excelRead;

import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class ExcelHashmap {
	
	@Test
	public void excelhash() throws IOException
	{
		Map<String,String>testdata=Readexcel.getLocatorInfo();
		
		for(Entry<String, String> map:testdata.entrySet())
		{
			System.out.println("key="+map.getKey()+", value="+map.getValue());
		}
	}

}
