package org.designpatterns.creative.factory.factory;

public class TestAIFactory {
    public static void main(String[] args) {
        AIFactory aiFactory=new AIFactory();
        AI ai;
        ai=aiFactory.createAI("ChatGTP");
        System.out.println(ai.request());
        ai=aiFactory.createAI("Claude");
        System.out.println(ai.request());
        ai=aiFactory.createAI("MetaAI");
        System.out.println(ai.request());
    }
}
