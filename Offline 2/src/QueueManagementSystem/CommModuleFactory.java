package QueueManagementSystem;

public class CommModuleFactory extends AbstractFactory {
    @Override
    Display getDisplay(String type) {
        return null;
    }

    @Override
    Processor getProcessor(String type, int displayCount) {
        return null;
    }

    @Override
    CommModule getCommModule(int type) {
        if(type==1){
            return new WiFiModule();
        }
        else if(type==2){
            return new SIMCard();
        }

        return null;

    }
}
