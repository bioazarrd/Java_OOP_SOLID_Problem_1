package D_JavaAdvancedOOP.Lecture6_SOLID.Controllers;
import D_JavaAdvancedOOP.Lecture6_SOLID.Enums.ReportLevel;
import D_JavaAdvancedOOP.Lecture6_SOLID.Interfaces.Layout;
public class SimpleLayout implements Layout {


    @Override
    public String format(String date, ReportLevel reportLevel, String message) {
        return String.format("%s - %s - %s",
                date,
                reportLevel.toString(),
                message);
    }

    @Override
    public String getType() {
        return "SimpleLayout";
    }

}
