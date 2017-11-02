package com.company;

public class Code {

    private String myCode;
    private int startPos;
    private int endPos;
    private String xCode;
    private char[] codeArray;
    private String regCode;

    public Code(String code){

        myCode = code;
        codeArray = myCode.toCharArray();

    }

    public String getCode(){
        return myCode;
    }

    public void hide(int p1, int p2){
        startPos = p1;
        endPos = p2;
        for(int i = startPos; i < endPos; i++){
            codeArray[i] = 'X';
        }
        xCode = codeArray.toString();


    }

    public void recover(int p1, int p2){

        regCode = myCode;

    }


}
