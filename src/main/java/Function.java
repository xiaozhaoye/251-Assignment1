import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class Function{
    public static ArrayList OPENfunction(File file) throws IOException {
        ArrayList<String> L=new ArrayList<String>();
        BufferedReader bufr = new BufferedReader(new FileReader(file));
        String line;
        while ((line = bufr.readLine()) != null) {
            L.add(line + "\r\n");
        }
        bufr.close();
        return L;
    }
    public static void SAVEfunction(File file,String s) throws IOException {
        BufferedWriter bufw = new BufferedWriter(new FileWriter(file));
        bufw.write(s);
        bufw.close();
    }
    public static int SEARCHfunction1(String text,String findText){
        int k=0;
        int i=0;
        JTextArea ta=new JTextArea();
        final String strA,strB;
        strA=text.toUpperCase();
        strB=findText.toUpperCase();
        ta.append(strA);
        if(ta.getSelectedText()==null)
            k=strA.lastIndexOf(strB,ta.getCaretPosition()-1);
        else
            k=strA.lastIndexOf(strB, ta.getCaretPosition()-findText.length()-1);
        if(k>-1)
        {
            ta.setCaretPosition(k);
            ta.select(k,k+strB.length());
            i= 1;
        }
        else
        {   JOptionPane.showMessageDialog(null,"can't find！","",JOptionPane.INFORMATION_MESSAGE);

        }
        return i;

    }
    public static int SEARCHfunction2(String text,String findText){
        int k=0;
        int i=0;
        JTextArea ta=new JTextArea();
        final String strA,strB;
        strA=text.toUpperCase();
        strB=findText.toUpperCase();
        ta.append(strA);
        if(ta.getSelectedText()==null)
            k=strA.indexOf(strB,ta.getCaretPosition()+1);
        else
            k=strA.indexOf(strB, ta.getCaretPosition()-findText.length()+1);
        if(k>-1)
        {
            ta.setCaretPosition(k);
            ta.select(k,k+strB.length());
            i=1;
        }
        else
        {   JOptionPane.showMessageDialog(null,"can't find!","",JOptionPane.INFORMATION_MESSAGE);
            }
        return i;
    }


}
