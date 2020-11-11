package D_JavaAdvancedOOP.Lecture6_SOLID.Logger;
import D_JavaAdvancedOOP.Lecture6_SOLID.Interfaces.Appender;

public interface Logger {

    //interface - zashtoto moje da imame stream logger, message logger... vsqkakyv vid loggeri

    void logInfo(String date, String message);
    void logWarning(String date, String message);
    void logError(String date, String message);
    void logCritical(String date, String message);
    void logFatal(String date, String message);
    void addAppender(Appender appender);


}
