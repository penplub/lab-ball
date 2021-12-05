public class labtv {
    public static void main(String[] args) {
        TV newTV = new TV();
        System.out.println("The initial states of TV object are:");
        System.out.println("Current chanel is:" + newTV.getChanel());
        System.out.println("Current volume is:" + newTV.getVolume());
        System.out.println("Current status is:" + newTV.getFlag());

        newTV.turnOnOff();
        newTV.setChannel(20);
        newTV.incVolume();
        newTV.incVolume();

        System.out.println("The initial states of TV object are:");
        System.out.println("Current chanel is:" + newTV.getChanel());
        System.out.println("Current volume is:" + newTV.getVolume());
        System.out.println("Current status is:" + newTV.getFlag());

    }

}
