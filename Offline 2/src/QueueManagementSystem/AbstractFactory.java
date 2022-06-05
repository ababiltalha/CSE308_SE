package QueueManagementSystem;

public abstract class AbstractFactory {
    abstract Display getDisplay(String type);
    abstract Processor getProcessor(String type, int displayCount);
    abstract CommModule getCommModule(int type);
//    abstract
}
