package model;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class CharacterAndLetter {
    private String s;

    public CharacterAndLetter() {
    }

    public CharacterAndLetter(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
    
    public void makePerfect(){
        s=s.trim();
        s=s.replaceAll("\\s+"," ");
    }
    
    public void countCharacter(){
        ArrayList result = new ArrayList();
        StringTokenizer b = new StringTokenizer(s," ");
        boolean add;
        while(b.hasMoreTokens()){
            add=true;
            String t = b.nextToken();
            for(int i=0;i<t.length();i++){
                if(!(((int)t.charAt(i)>=65&(int)t.charAt(i)<=90)||((int)t.charAt(i)>=97&(int)t.charAt(i)<=122))){
                    add=false;
                }
            }
            if(add) result.add(t);
        }
        int n;
        String m;
        for (int i=0;i<result.size();i++){
            n=1;
            m="";
            for(int j=i+1;j<result.size();j++){
                if(result.get(i).equals(result.get(j))){
                    n++;
                    result.remove(j);
                    j--;
                }
            }
            m=result.get(i).toString()+"="+n;
            result.remove(i);
            result.add(i, m);
        }
        System.out.println(result);
    }
    
    public void countLectter(){
        ArrayList result = new ArrayList();
        int[] a = new int[256];
        for (int i = 0; i < 256; i++) {
            a[i] = 0;
        }
        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i)]++;
        }
        for (int i =65;i<=90;i++){
            if(a[i]>0)  a[i+32]+=a[i];
        }
        for (int i =97;i<=122;i++){
            if(a[i]>0)  result.add((char)i+"="+a[i]);
        }
        System.out.println(result);
    }
    
}
