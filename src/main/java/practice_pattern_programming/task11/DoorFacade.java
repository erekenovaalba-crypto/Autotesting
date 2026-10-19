package practice_pattern_programming.task11;

public class DoorFacade {
    private OpenTheDoor openTheDoor;
    private CloseTheDoor closeTheDoor;
    private  BlockTheDoor blockTheDoor;

    public DoorFacade(OpenTheDoor openTheDoor, CloseTheDoor closeTheDoor, BlockTheDoor blockTheDoor) {
        this.openTheDoor = openTheDoor;
        this.closeTheDoor = closeTheDoor;
        this.blockTheDoor = blockTheDoor;
    }
    public void prepareData(){
        openTheDoor.open();
        closeTheDoor.close();
        blockTheDoor.block();
    }
}
