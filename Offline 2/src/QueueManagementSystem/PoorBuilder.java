package QueueManagementSystem;

public class PoorBuilder implements IQMSBuilder{
    private QMSProduct product= new QMSProduct();
    private AbstractFactory processorFactory= FactoryProducer.getFactory("PROCESSOR");
    private AbstractFactory displayFactory= FactoryProducer.getFactory("DISPLAY");
    private AbstractFactory commModuleFactory= FactoryProducer.getFactory("COMM");

    @Override
    public void addDisplays(int displayCount) {
        for (int i = 0; i < displayCount; i++) 
            product.addParts(displayFactory.getDisplay("LED"));
    }

    @Override
    public void addProcessor(int displayCount) {
        product.addParts(processorFactory.getProcessor("POOR", displayCount));
    }

    @Override
    public void addCommModule(int commModuleChoice) {
        product.addParts(commModuleFactory.getCommModule(commModuleChoice));
    }



    @Override
    public QMSProduct getProduct() {
        return product;
    }
}
