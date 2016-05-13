package ujian.rkppl;

import org.apache.log4j.Logger;

public class Log4JDemo {

    final static Logger logger = Logger.getLogger(Log4JDemo.class);

    
    public void Logging(String parameter) {

        logger.debug("Ini adalah debug Message : " + parameter);
        logger.info("Ini adalah info Message : " + parameter);
        logger.warn("Ini adalah warn Message : " + parameter);
        logger.error("Ini adalah error Message : " + parameter);
        logger.fatal("Ini adalah fatal Message : " + parameter);

    }
    
    
    public static void main(String[] args) {

        Log4JDemo obj = new Log4JDemo();
        obj.Logging("Log4J");

    }
    
    

    

}
