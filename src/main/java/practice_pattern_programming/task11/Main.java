package practice_pattern_programming.task11;

public class Main {
    public static void main(String[] args) {
        OpenTheDoor openTheDoor = new OpenTheDoor();
        CloseTheDoor closeTheDoor = new CloseTheDoor();
        BlockTheDoor blockTheDoor = new BlockTheDoor();
        DoorFacade doorFacade = new DoorFacade(openTheDoor,closeTheDoor,blockTheDoor);
        doorFacade.prepareData();

}
}
