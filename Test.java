import java.util.*;
import com.educode.runtime.*;
import com.educode.runtime.types.*;
import com.educode.helper.*;

public class Test extends ScriptBase
{
Double glob2 = 0.000000;
Double global = 3.000000;
public void main() throws InterruptedException
{
Double a = 10.000000;
a = (a + 2.000000);
Coordinates c = new Coordinates(0.000000, 0.000000, 0.000000);
c = c.add(new Coordinates(0.000000, 1.000000, 2.000000), true);
System.out.println(("Test:" + round(5.232310)));
System.out.println(("Out:" + c.toString()));
}
public void hej(Double a) throws InterruptedException
{
a = 10.000000;
}
public void test() throws InterruptedException
{
Double a = 0.000000;
}
public Double round(Double num) throws InterruptedException
{
return (num - (num % 1.250000));
}
}