class Main {
  public static void main(String[] args) {
    
    Main fibtest = new Main();


    System.out.println(fibtest.fib(8));

  }


  public int fib (int x) 
  {
    if (x == 0) {
      return 0;
    }
    if (x == 1) {
      return 1;
    }
    else {
      return fib(x-1) + fib(x-2);
    }
  }


}