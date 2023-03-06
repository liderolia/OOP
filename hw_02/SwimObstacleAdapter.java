package hw_02;

public class SwimObstacleAdapter implements Obstacle {
    
    private final SwimmingPoll swimmingPoll;

    public SwimObstacleAdapter(SwimmingPoll swimmingPoll) {
        this.swimmingPoll = swimmingPoll;
    }

    @Override
    public boolean pass(Participant participant) {
        return swimmingPoll.pass(participant);
    }
}
