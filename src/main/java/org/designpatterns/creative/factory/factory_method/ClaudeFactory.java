package org.designpatterns.creative.factory.factory_method;

import org.designpatterns.creative.factory.factory.AI;
import org.designpatterns.creative.factory.factory.Claude;

public class ClaudeFactory extends AIFactory{
    @Override
    public AI createAI() {
        return new Claude();
    }
}
