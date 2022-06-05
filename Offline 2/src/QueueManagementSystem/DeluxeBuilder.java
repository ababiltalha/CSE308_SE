package QueueManagementSystem;

public class DeluxeBuilder implements IQMSBuilder {
    private QMSProduct product= new QMSProduct();
    private AbstractFactory displayFactory= FactoryProducer.getFactory("DISPLAY");
    private AbstractFactory processorFactory= FactoryProducer.getFactory("PROCESSOR");
    private AbstractFactory commModuleFactory= FactoryProducer.getFactory("COMM");

    @Override
    public void addDisplays(int displayCount) {
        product.addDisplays(displayFactory.getDisplay("LCD"), displayCount);
    }

    @Override
    public void addProcessor(int displayCount) {
        product.addProcessor(processorFactory.getProcessor("DELUXE", displayCount));
    }

    @Override
    public void addCommModule(int commModuleChoice) {
        product.addCommModule(commModuleFactory.getCommModule(commModuleChoice));
    }



    @Override
    public QMSProduct getProduct() {
        return product;
    }
}
