package ToGetInformationFromThePropertiesFile;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;  
public class Test {  
public static void main(String[] args)throws Exception{  
  
Properties p=System.getProperties();  
Set<Entry<Object, Object>> set=p.entrySet();  
  
Iterator<Entry<Object, Object>> itr=set.iterator();  
while(itr.hasNext()){  
Entry<Object, Object> entry=itr.next();  
System.out.println(entry.getKey()+" = "+entry.getValue());  
}  
  
}  
}  