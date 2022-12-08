package net.godaa.DependencyInjection.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Model {

    //  property based dependency injection
//    @Autowired
    ModelDao modelDao;
//     using this way will make junit test is hard to do
//     we can instead autowire the setter
//     we can instead use constructor


//    setter based dependency injection
//    set as public is breaks encapsulation
//    not widely used
//    @Autowired
//    public void setModelDao(ModelDao modelDao) {
//        this.modelDao = modelDao;
//    }

    /**   constructor:
       be default it will be injected if there is only one constructor
       if there is more than on constructor I need to @Autowire the constructor and empty constructor will be called
    */
    public Model() {
    }

    public Model(ModelDao modelDao) {
        this.modelDao = modelDao;
    }

    public ModelDao getModelDao() {
        return modelDao;
    }
}
