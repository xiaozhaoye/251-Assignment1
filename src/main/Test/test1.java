import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class test1 extends Function {
    @Test
    void TestNew() throws IOException {
        File file=new File("src/main/TestNew.txt");
        ArrayList<String> L=OPENfunction(file);
        for(String i:L){
            Assert.assertEquals("Hello World"+ "\r\n",i);
        }
    }
    @Test
    void TestSave() throws IOException {
        String s="There are some words for testing save function.";
        File file = new File("src/main/TestSave.txt");
        Main.SAVEfunction(file,s);
        ArrayList<String> L=OPENfunction(file);
        for(String i:L){
            Assert.assertEquals(s+ "\r\n",i);
        }
    }
    @Test
    void TestSearch(){
        String s="There are some words for testing search function.";
        int i=SEARCHfunction2(s,"e");
        int j=SEARCHfunction2(s,"b");
        Assert.assertEquals(1,i);
        Assert.assertEquals(0,j);
    }
}
