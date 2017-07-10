package com.javaex.problem03;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        /*
        if("앱".equals(str)){
            playApplication();
        }else if("음악".equals(str)){
            super.execute(str);
        } else {
        	call();
        }*/
        //코드작성
        if("앱".equals(str)){
            playApplication();
        }else {
            super.execute(str);
        }
        
    }
 
    //메소드작성
    protected void playApplication(){
        System.out.println("앱실행");
    }
    //메소드작성
    private void call(){
        System.out.println("통화기능시작");
    }
    
    
    
}
