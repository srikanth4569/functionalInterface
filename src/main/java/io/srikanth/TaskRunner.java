package io.srikanth;

import java.time.LocalDateTime;

public class TaskRunner {

    public static void runner(Task task){

        System.out.println("Strat time :" + LocalDateTime.now());
        task.run();
        System.out.println("end  time :" + LocalDateTime.now());
    }
    public static void main(String[] args) {
        Task task= new HelloTask();
        TaskRunner.runner(task);
    }
}
interface Task{
    public void run();

        }
  class HelloTask implements Task{

      @Override
      public void run() {
          System.out.println("Hello world");
      }
  }
