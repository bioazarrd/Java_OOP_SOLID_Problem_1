package D_JavaAdvancedOOP.Lecture6_SOLID.Controllers;
import D_JavaAdvancedOOP.Lecture6_SOLID.Enums.ReportLevel;
import D_JavaAdvancedOOP.Lecture6_SOLID.Interfaces.Layout;
public class XmlLayout implements Layout {


    @Override
    public String format(String date, ReportLevel reportLevel, String message) {
        return String.format("<log>%n" +
                "<date>%s</date>%n" +
                "<level>%s</level>%n" +
                "<message>%s</message>%n" +
                "</log>", date, reportLevel.toString(), message);
    }

    @Override
    public String getType() {
        return "XmlLayout";
    }
}
