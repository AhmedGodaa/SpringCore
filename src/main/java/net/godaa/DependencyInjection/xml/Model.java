package net.godaa.DependencyInjection.xml;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Model {

    private ModelDao modelDao;

    // we use constructor to inject (byConstructor)
//    when init bean it will search the type required in the constructor
    public Model(ModelDao modelDao) {
        this.modelDao = modelDao;
    }

    // we use setter method to inject (ByType)
    public void setModelDao(ModelDao modelDao) {
        this.modelDao = modelDao;
    }

    public ModelDao getModelDao() {
        return modelDao;
    }
}
