package org.designpatterns.creative.factory.factory_method;

import org.designpatterns.creative.factory.factory.AI;


// LAS CLASES METAAI,CLAUDE,CHATGTP,AI, SE REUTILIZAN DE LA CARPETA FACTORY

public class TestFactoryMethod {
    public static void main(String[] args) {
        AI ai;

        ai=new ClaudeFactory().createAI();
        System.out.println(ai.request());
        ai=new ChatGTPFactory().createAI();
        System.out.println(ai.request());
        ai=new MetaAIFactory().createAI();
        System.out.println(ai.request());
    }
}
