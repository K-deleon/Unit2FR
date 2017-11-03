package com.company;

public class Code {

    private String myCode;
    private int startPos;
    private int endPos;
    private String xCode;
    private char[] codeArray;

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

        System.arraycopy(xCode, p1, codeArray, p2, (p2-p1));

    }


}


/*
Pls help this is what I wanna do???

- Take a string (pre-code word)
- Convert word to  X's
    + Store this as new String so old String isn't lost??
    + Print new string if asked? (BUT ITS VOID WHAT DOOOOO)
- When asked to recover just set new String to input???

 */