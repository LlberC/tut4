package packageid1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalc {
    @Test
    public void test1(){
    Calc a = new Calc();
    Assertions.assertEquals(3,a.add(1,2));
}

//    @Test
//    public void test2(){
//    Calc t = new Calc();
//    int res = t.subtract(1,2);
//    Assertions.assertEquals(-1,res);
//}
}
