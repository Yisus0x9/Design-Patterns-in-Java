package org.designpatterns.creative.factory.factory_method;

import org.designpatterns.creative.factory.factory.AI;

//No se puede instanciar
public abstract class AIFactory {

    public abstract AI createAI();
}
