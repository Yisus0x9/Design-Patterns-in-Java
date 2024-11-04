package org.designpatterns.creative.factory.factory_method;

import org.designpatterns.creative.factory.factory.AI;
import org.designpatterns.creative.factory.factory.MetaAI;

public class MetaAIFactory extends   AIFactory{
    @Override
    public AI createAI() {
        return new MetaAI();
    }
}
