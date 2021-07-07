package com.example.demo;

class TvControll {
    public static void main(String[] args) {
        //생성자 초기화 (오버로딩)
        Tv lgTv = new Tv("LG");
        Tv sTv = new Tv("Samsung");
        Tv hTv = new Tv("HP",2048);

        System.out.println(hTv.getCurrent_channel());
        hTv.setCurrent_channel(11);
        System.out.println(hTv.getCurrent_channel());

        //System.out.println(hTv.current_channel);
        //hTv.current_channel=11;
        //System.out.println(hTv.current_channel);

        //System.out.println(hTv.resolution);
        //System.out.println(hTv.getChannel());   //값이 아닌 배열의 시작 주소 출력

        int[] arr = hTv.getChannel();           //getChannel을 배열로 만들어 값 확인 가능
        //System.out.println(arr[1]);             //getChannel의 1번 배열 출력 확인가능
       // for(int i=0; i<arr.length; i++)
         //   System.out.println(arr[i]);
    }
}
class Tv {
    //속성
    String model_name;
    int[] channel;          //배열(int형 배열)
    private int current_channel;
    int resolution;
    boolean power;
    //생성자
    Tv(String model_name){
        this.model_name = model_name;
        resolution = 1024;
        power = false;
        current_channel = 0;
        channel = new int[100];  //[]안은 만들 배열 개수 생성
        for(int i = 0; i < channel.length; i++) {    //횟수 제한, 배열은 0부터 시작 /channel.length channel 값 리턴해줌 여기서는 100을 의미 추후 유지보수를 위해 사용
            channel[i] = i + 1;
            }
        }
    Tv(String model_name, int resolution) {
        this.model_name = model_name;
        this.resolution = resolution;
        power = false;
        current_channel = 0;
        channel = new int[100];  //[]안은 만들 배열 개수 생성
        for (int i = 0; i < channel.length; i++) {    //횟수 제한, 배열은 0부터 시작 /channel.length channel 값 리턴해줌 여기서는 100을 의미 추후 유지보수를 위해 사용
            channel[i] = i + 1;
            }
        }
             //Getter Setter
            public int[] getChannel() {
                return channel;
            }

            public void setChannel(int[] channel) {
                this.channel = channel;
            }

            public int getCurrent_channel() {
                return current_channel;
            }

            public void setCurrent_channel(int current_channel) {
                if(current_channel > 100) {
                    System.out.println("입력오류");
                }
                else {
                    this.current_channel = current_channel;
                }
            }

        /*
        channel[0] = 1;  /for문을 통해 배열 값 자동 생성 가능
        channel[1] = 2;
        channel[2]
        .
        .
        channel[98]
        channel[99]
        => 400 byte / 반복적인 일처리를 할때 편리하게 사용위해 이용.'=
        * 반복
        for/while
        while(ture){} -> 멈추는 조건이 없다면 무한루프/ 특정 조건을 반복하고 싶을때
        for(){} -> 횟수 조건, 끝이 있음  /횟수가 정해져있을때
         */
    }

    //기능

    // void onOff(){ } //void boolean 두가지는 선택(출력방식?)
