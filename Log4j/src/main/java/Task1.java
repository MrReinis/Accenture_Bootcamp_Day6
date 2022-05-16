import appender.MyAppender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;


public class Task1 {
    public static class Main {

  static final Logger logger = Logger.getLogger(Task1.class);



        public static void main (String [] args){

            ConsoleAppender consoleAppender = new ConsoleAppender();
            consoleAppender.setThreshold(Level.INFO);
            consoleAppender.setLayout(new PatternLayout("%d [%p|%c|%C{1}] %m%n"));
            consoleAppender.activateOptions();
            Logger.getRootLogger().addAppender(consoleAppender);
            Logger.getRootLogger().addAppender(new MyAppender());


            String carNumber = "42";
            logger.error(
                    "Race car number failed. Car number " +carNumber, new Exception()
            );

            try {



            }catch (Exception e){

                logger.warn(e.getMessage(), e);

            }


    }





    }
}
