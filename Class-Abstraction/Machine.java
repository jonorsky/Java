public abstract class Machine{ // <-- Abstract Class
  private int id;

  public int getId(){
    return this.id;
  }

  public final void setId(int id){ // <-- final methods which will force the subclass not to change the body of the method
    this.id = id;
  }

  // Abstract Method =  abstract method doesn’t have body. Alternative? run(){}
  // Abstract Method forces to Override by the subclasses
  public abstract void run();
}
