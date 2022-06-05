package QueueManagementSystem;

public interface IQMSBuilder {
    void addDisplays(int displayCount);
    void addProcessor(int displayCount);
    void addCommModule(int commModuleChoice);
//    void addApplication();
    QMSProduct getProduct();

}
