package com.idea.algorithm.others;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lipengd@zbj.com on 2017/9/11.
 */
public class Test extends JFrame{


    private static final String COMMOND_PREFIX = "taskkill -f -im ";

    public List<String> Tasklist()
    {
        List<String> list=new ArrayList<String>();
        try
        {
            Process process = Runtime.getRuntime().exec("tasklist");
            Scanner in=new Scanner(process.getInputStream());
            while(in.hasNextLine()){
                String p=in.nextLine();
                list.add(p);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return list;
    }
    public List<String> rtTasklist(List<String> list)
    {
        List<String> array=new ArrayList<>();
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).indexOf(".EXE")!=-1)
            {
                array.add(list.get(i));
            }
            else if(list.get(i).indexOf(".exe")!=-1)
            {
                array.add(list.get(i));
            }
        }
        return array;
    }



    public static void main(String[] args) {
        Test test=new Test();
        List<String> array=test.Tasklist();
        List<String> list=test.rtTasklist(array);
        list.add("129AC88D-A36C-4896-9168-8E06DC19FB54.exe");
        Pattern pattern = Pattern.compile("\\w{7,8}-\\w{4}-\\w{4}-\\w{4}-\\w{12}.exe");


        for(int i=0;i<list.size();i++)
        {
            String str = list.get(i);
            Matcher matcher = pattern.matcher(str);
            if(matcher.find()){
                try {
                    File file = new File("C:\\Users\\Administrator.O3N4E19WTVWX6C1\\Desktop\\useless\\killnetkeeper.bat");
                    FileWriter writer = new FileWriter(file);
                    writer.write(COMMOND_PREFIX + str);
                    writer.flush();
                    writer.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
        //System.out.println(list.size());
    }
}
