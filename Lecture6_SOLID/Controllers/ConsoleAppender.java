package D_JavaAdvancedOOP.Lecture6_SOLID.Controllers;
import D_JavaAdvancedOOP.Lecture6_SOLID.Enums.ReportLevel;
import D_JavaAdvancedOOP.Lecture6_SOLID.Interfaces.Layout;
public class ConsoleAppender extends AbstractAppender {


    public ConsoleAppender(ReportLevel reportLevel, Layout layout) {
        super(reportLevel, layout);
    }

    @Override
    protected String getType() {
        return "ConsoleAppender";
    }


    // beshe SimpleLayout... no go promenihme na LAYOUT - zashtoto ni trqbva abstrakciqta,
    // a ne konkretno simplelayout - vsqkakyv layout iskame


    @Override
    public void append(String date, ReportLevel reportLevel, String message) {
        System.out.println(this.getLayout().format(date, reportLevel, message));
        this.incrementAppendsCount();
    }



}
