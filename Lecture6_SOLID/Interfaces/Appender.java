package D_JavaAdvancedOOP.Lecture6_SOLID.Interfaces;
import D_JavaAdvancedOOP.Lecture6_SOLID.Enums.ReportLevel;

public interface Appender {

    void append(String date, ReportLevel reportLevel, String message);


    ReportLevel getReportLevel();
}
