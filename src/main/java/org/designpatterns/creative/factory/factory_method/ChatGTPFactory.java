package org.designpatterns.creative.factory.factory_method;

import org.designpatterns.creative.factory.factory.AI;
import org.designpatterns.creative.factory.factory.ChatGTP;

public class ChatGTPFactory extends AIFactory{
    @Override
    public AI createAI() {
        return new ChatGTP();
    }
}
