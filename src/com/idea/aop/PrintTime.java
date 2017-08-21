package com.idea.aop;

import java.util.Date;

/**
 * Created by zjl on 2017/7/13.
 */
public class PrintTime {
    public static void main(String[] args) {
        isInterleave("sdfjas;dfjoisdufzjkndfasdkfja;sdfa;dfa;dfaskdjhfasdhjdfakhdgfkajdfasdjf" +
                        "gajksdfgaksdhfasdkbfjkdsfbajksdfhakjsdfbajkdf" +
                        "bakdjsfgaksdhgfjkdsghfkdsfgadsjfgkajsdgfkjasdfh",
                    "dfnakdjnfjkzghdufguweygfasjkdfgb2gf8asf7tgbgasjkdfgasodf7asdgfajksdfguayfgaogf" +
                        "sdkagfsdhfajksdvfbgkadsghfakdsfgasduyfgajsdkfgajkdghfaksdgfuyadgfasjkdvfj" +
                        "sdkvfakfgauyksgfajkefgjkdasgfdjksfgadjkghfajksdfgaskdjfgasjkdgfuyaegfasdjkfg" +
                        "ajkdfygadjskfgjkadfg",
                    "sdfjas;dfjoisdfnakdjnfjkzghdufguwdufzjkeygfasjkdfgb2" +
                        "gf8asf7ndtgbgasjkdfgasodf7asdfgfajkasdksdfguayfgaogfsdkagfsfjadhfajksdvfbgkadsghfa" +
                        ";sdkdsfgasduyfgajsdkfgafajkdghfaksdgfuyadgfas;dfjkdvfjsdkvfakfgauyksa;dgfajkefgjkdas" +
                        "gfdjksffaskdjhfasdhjdfakhdgadjkghfajgfkajdfksdfgaskdjfgasjkdgfuasdjfgajksdfgaksdhfas" +
                        "dkbfjkdsfbajksdfyaegfasdjkfgajkdfygadjskfgjkadfghakjsdfbajkdfbakdjsfgaksdhgfjkdsghfk" +
                        "dsfgadsjfgkajsdgfkjasdfh");
    }

    /**
     * Determine whether s3 is formed by interleaving of s1 and s2.
     * @param s1, s2, s3: As description.
     * @return: true or false.
     */
    public static boolean isInterleave(String s1, String s2, String s3) {
        // write your code here
        if(s1.equals("") || s2.equals("") || s3.equals("")){
            String s4 = s1 + s2;
            if(s4.equals(s3)){
                return true;
            }else{
                return false;
            }
        }
        char c1 = s1.charAt(0);
        char c2 = s2.charAt(0);
        char c3 = s3.charAt(0);
        if(c1 != c3 && c2 != c3){
            return false;
        }

        String s5 = s3.length()>0 ? s3.substring(1,s3.length()) : "";

        if(c1 == c3){
            if(s1.length()>0){
                return isInterleave(s1.substring(1,s1.length()), s2, s5);
            }else{
                return isInterleave("", s2, s5);
            }
        }
        if(c2 == c3){
            if(s2.length() > 0){
                return isInterleave(s1, s2.substring(1,s2.length()), s5);
            }else{
                return isInterleave(s1, "", s5);
            }
        }
        return true;
    }



}
