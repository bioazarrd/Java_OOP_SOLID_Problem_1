package D_JavaAdvancedOOP.Lecture6_SOLID.Controllers;
import D_JavaAdvancedOOP.Lecture6_SOLID.Enums.ReportLevel;
import D_JavaAdvancedOOP.Lecture6_SOLID.Interfaces.Appender;
import D_JavaAdvancedOOP.Lecture6_SOLID.Interfaces.Layout;
public abstract class AbstractAppender implements Appender {

    private Layout layout;
    private ReportLevel reportLevel;
    private int appendsCount;

    public AbstractAppender(ReportLevel reportLevel, Layout layout) {
        this.reportLevel = reportLevel;
        this.layout = layout;
    }

    public AbstractAppender(Layout layout) {
        this(ReportLevel.INFO, layout);
    }


    protected Layout getLayout() {
        return layout;
    }

    @Override
    public ReportLevel getReportLevel() {
        return this.reportLevel;
    }

    protected abstract String getType();

    @Override
    public String toString() {
        //Appender type: ConsoleAppender, Layout type: SimpleLayout, Report level: CRITICAL, Messages appended: 2"
        StringBuilder builder = new StringBuilder("Appender type: ");
        builder.append(this.getType())
                .append(", Layout type: ")
                .append(this.layout.getType())
                .append(", ")
                .append(String.format("Report level: %s", this.getReportLevel()))
                .append("Messages appended:")
                .append(this.appendsCount);

        return builder.toString();
    }

    protected void incrementAppendsCount() {
        appendsCount++;
    }
}
