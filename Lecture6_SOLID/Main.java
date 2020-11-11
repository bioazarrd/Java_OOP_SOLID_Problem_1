package D_JavaAdvancedOOP.Lecture6_SOLID;
import D_JavaAdvancedOOP.Lecture6_SOLID.Controllers.AppenderWorkshop;
import D_JavaAdvancedOOP.Lecture6_SOLID.Controllers.LayoutWorkshop;
import D_JavaAdvancedOOP.Lecture6_SOLID.Enums.ReportLevel;
import D_JavaAdvancedOOP.Lecture6_SOLID.Interfaces.Appender;
import D_JavaAdvancedOOP.Lecture6_SOLID.Interfaces.AppenderFactory;
import D_JavaAdvancedOOP.Lecture6_SOLID.Interfaces.LayoutFactory;
import D_JavaAdvancedOOP.Lecture6_SOLID.Logger.Logger;
import D_JavaAdvancedOOP.Lecture6_SOLID.Logger.MessageLogger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));


        //Layout simpleLayout = new SimpleLayout();
        //Appender consoleAppender = new ConsoleAppender(simpleLayout);
        //Logger logger = new MessageLogger(consoleAppender);
//
        //logger.logError("3/26/2015 2:08:11 PM", "Error parsing JSON.");
        //logger.logInfo("3/26/2015 2:08:11 PM", "User Pesho successfully registered.");
//



        int n = Integer.parseInt(scanner.readLine());
        AppenderFactory appenderFactory = new AppenderWorkshop();
        LayoutFactory layoutFactory = new LayoutWorkshop();


        Logger logger = new MessageLogger();

        while (n-- > 0) {
            String[] tokens = scanner.readLine().split("\\s+");


            ReportLevel reportLevel = tokens.length == 3
                    ? ReportLevel.valueOf(tokens[2].toUpperCase())
                    : ReportLevel.INFO;
            Appender appender = appenderFactory.produce(tokens[0], reportLevel, layoutFactory.produce(tokens[1]));

            logger.addAppender(appender);
        }

        String input = scanner.readLine();

        while (!input.equals("END")) {
            String[] tokens = input.split("\\|");
            ReportLevel reportLevel = ReportLevel.valueOf(tokens[0]);
            String date = tokens[1];
            String message = tokens[2];

            if (reportLevel.equals(ReportLevel.INFO)) {
                logger.logInfo(date, message);
            } else if (reportLevel.equals(ReportLevel.WARNING)) {
                logger.logWarning(date, message);
            } else if (reportLevel.equals(ReportLevel.ERROR)) {
                logger.logError(date, message);
            } else if (reportLevel.equals(ReportLevel.CRITICAL)) {
                logger.logCritical(date, message);
            } else if (reportLevel.equals(ReportLevel.FATAL)) {
                logger.logFatal(date, message);
            } else {
                throw new IllegalStateException("Unknown enum value for " + reportLevel);
            }
            input = scanner.readLine();
        }


        System.out.println(logger.toString());


    }
}
