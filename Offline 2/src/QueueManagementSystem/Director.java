package QueueManagementSystem;

public class Director {
    private IQMSBuilder builder;

    public void construct(IQMSBuilder builder,int commModuleChoice,int displayCount){ //1 wifi 2 mobile data
        this.builder=builder;
        this.builder.addDisplays(displayCount);
        this.builder.addProcessor(displayCount);
//        this.builder.addApplication();
        this.builder.addCommModule(commModuleChoice);
        //
        ;
    }
}
