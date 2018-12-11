class Machine {
  public void start(){
    System.out.println("Starting Machine...");
  }
}

interface Plant{
  public void grow();
}

public class Main{
  public static void main(String[] args){
    /* Anonymous Class - Class that doesnt have name
     * In bytecode, it generates Main$1.class and Main$2.class
     * Advantage:
     *  It can make interface class into an object within inline
     *  Every 1 Anonymous class declaration = 1 bytecode
     */
    Machine machine1 = new Machine(){
      @Override
        public void start(){
          System.out.println("Camera Snapping...");
        }
    };
    Machine machine2 = new Machine(){
      @Override
        public void start(){
          System.out.println("Phone Destroyed!");
        }
    };

    machine1.start();
    machine2.start();

    Plant plant1 = new Plant(){
      @Override
        public void grow(){
          System.out.println("Plant is growing..");
        }
    };

    plant1.grow();

  }
}
