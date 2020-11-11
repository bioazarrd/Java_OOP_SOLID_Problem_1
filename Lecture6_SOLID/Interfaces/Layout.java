package D_JavaAdvancedOOP.Lecture6_SOLID.Interfaces;
import D_JavaAdvancedOOP.Lecture6_SOLID.Enums.ReportLevel;
public interface Layout {

    String format(String date, ReportLevel reportLevel, String message);
    String getType();

}
