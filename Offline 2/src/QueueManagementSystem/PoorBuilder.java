package QueueManagementSystem;

public class PoorBuilder implements IQMSBuilder{
    private QMSProduct product= new QMSProduct();
    private AbstractFactory processorFactory= FactoryProducer.getFactory("PROCESSOR");
    private AbstractFactory displayFactory= FactoryProducer.getFactory("DISPLAY");
    private AbstractFactory commModuleFactory= FactoryProducer.getFactory("COMM");

    @Override
    public void addDisplays(int displayCount) {
        product.addDisplays(displayFactory.getDisplay("LED"), displayCount);
    }

    @Override
    public void addProcessor(int displayCount) {
        product.addProcessor(processorFactory.getProcessor("POOR", displayCount));
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
