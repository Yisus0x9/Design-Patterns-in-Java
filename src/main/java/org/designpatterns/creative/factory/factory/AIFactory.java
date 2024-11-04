package org.designpatterns.creative.factory.factory;

public class AIFactory {
    public AI createAI(String nameAI){
        switch (nameAI){
            case "ChatGTP":
                return new ChatGTP();
            case "Claude":
                return  new Claude();
            case "MetaAI":
                return new MetaAI();
        }

        return null;
    }
}
