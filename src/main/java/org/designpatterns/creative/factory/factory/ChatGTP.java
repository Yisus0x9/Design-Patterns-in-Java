package org.designpatterns.creative.factory.factory;

public class ChatGTP implements AI {


    @Override
    public String request() {
        return "Esta recibiendo una respuesta de OpenAi con el model chatgpt-4";
    }
}
