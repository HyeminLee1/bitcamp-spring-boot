package com.example.demo.himart.controller;

import com.example.demo.himart.domain.PhoneApp;
import com.example.demo.himart.service.HimartService;
import com.example.demo.himart.service.HimartServiceImpl;
import com.example.demo.util.service.LambdaUtils;

import java.util.Scanner;

public class HimartController extends LambdaUtils {
    private HimartService himartService;

    public HimartController(){
        himartService = new HimartServiceImpl();
    }

    public void main(){
        Scanner scanner = new Scanner(System.in);
        PhoneApp phoneApp = new PhoneApp();
        PhoneApp.Phone phone = null;
        PhoneApp.CelPhone celPhone = null;
        PhoneApp.IPhone iPhone = null;
        PhoneApp.GalaxyNote galaxyNote = null;
        while(true) {
            print.accept("0.종료 1.집전화 2.스마트폰 3.아이폰 4.갤럭시 \n");
            switch (scanner.next()) {
                case "0":
                    return;
                case "1":
                    phone = phoneApp.new Phone();
                    phone.setKind("집전화");
                    print.accept("회사?");
                    phone.setCompany(scanner.next());
                    print.accept("전화?");
                    phone.setCall(scanner.next());
                    break;
                case "2":
                    celPhone = phoneApp.new CelPhone();
                    celPhone.setKind(scanner.next());
                    print.accept("회사?");
                    celPhone.setCompany(scanner.next());
                    print.accept("전화?");
                    celPhone.setCall(scanner.next());
                    print.accept("이동?");
                    celPhone.setMove(scanner.next());
                    print.accept("맞아?");
                    celPhone.isPortable();

                break;
                case "3":
                    iPhone = phoneApp.new IPhone();
                    iPhone.setKind(PhoneApp.IPhone.BRAND);
                    iPhone.setCompany("애플");
                    iPhone.setCall("전화중");
                    iPhone.setMove("이동");
                    iPhone.setInternet("구글에 접속");
                    break;
                case "4":
                    galaxyNote= phoneApp.new GalaxyNote();
                    galaxyNote.setKind(PhoneApp.IPhone.BRAND);
                    galaxyNote.setCompany("삼성");
                    galaxyNote.setCall("전화중임");
                    galaxyNote.setMove("이동했다");
                    galaxyNote.setInternet("네이버에 접속");
                    galaxyNote.setPencil("노트펜슬 에압");

                    break;
            }
        }
    }
    public void phoneMain(Scanner scanner){
        while (true){
            print.accept("[Menu] 0-종료 1-집전화 2-휴대폰 3-아이폰 4-갤럭시)");
            switch (scanner.next()){
                case "0" : return;
                case "1" : break;
                case "2" : break;
                case "3" : break;
            }
        }
    }
}
