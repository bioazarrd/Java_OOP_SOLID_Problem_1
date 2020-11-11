package D_JavaAdvancedOOP.Lecture6_SOLID.Controllers;
import D_JavaAdvancedOOP.Lecture6_SOLID.Enums.ReportLevel;
import D_JavaAdvancedOOP.Lecture6_SOLID.Interfaces.Appender;
import D_JavaAdvancedOOP.Lecture6_SOLID.Interfaces.AppenderFactory;
import D_JavaAdvancedOOP.Lecture6_SOLID.Interfaces.Layout;
public class AppenderWorkshop implements AppenderFactory {
    
    
    
    
    @Override
    public Appender produce(String type, ReportLevel reportLevel, Layout layout) {
        if (type.equals("ConsoleAppender")) {
            return new ConsoleAppender(reportLevel, layout);
        } else if (type.equals("FileAppender")) {
            return new FileAppender(reportLevel, layout);
        } else {
            throw new IllegalStateException(
                    "Not valid type of appender for " + type + " param");
        }
    }




}
