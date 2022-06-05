package QueueManagementSystem;

public class DisplayFactory extends AbstractFactory{
    @Override
    Display getDisplay(String type) {
        if(type==null){
            return null;
        }
        else if(type.equalsIgnoreCase("LED")){
            return new LEDMatrix();
        }
        else if(type.equalsIgnoreCase("LCD")){
            return new LCDPanel();
        }

        return null;
    }

    @Override
    Processor getProcessor(String type, int displayCount) {
        return null;
    }

    @Override
    CommModule getCommModule(int type) {
        return null;
    }
}
