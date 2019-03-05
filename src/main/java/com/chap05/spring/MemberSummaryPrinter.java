package com.chap05.spring;

public class MemberSummaryPrinter extends MemberPrinter {

    @Override
    public void print(Member member){
        System.out.printf("e : %s / n : %s\n", member.getEmail(), member.getName());
    }

}
