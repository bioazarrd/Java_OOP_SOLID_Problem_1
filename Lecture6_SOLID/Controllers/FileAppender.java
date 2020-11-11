package D_JavaAdvancedOOP.Lecture6_SOLID.Controllers;
import D_JavaAdvancedOOP.Lecture6_SOLID.Enums.ReportLevel;
import D_JavaAdvancedOOP.Lecture6_SOLID.Interfaces.File;
import D_JavaAdvancedOOP.Lecture6_SOLID.Interfaces.Layout;
import D_JavaAdvancedOOP.Lecture6_SOLID.Logger.LogFile;
public class FileAppender extends AbstractAppender {

    private File file;

    public FileAppender(ReportLevel reportLevel, Layout layout) {
        super(reportLevel, layout);
        this.file = new LogFile();
    }

    @Override
    protected String getType() {
        return "FileAppender";
    }


    @Override
    public void append(String date, ReportLevel reportLevel, String message) {
        String formatted = this.getLayout().format(date, reportLevel, message);
        this.file.write(formatted);
        super.incrementAppendsCount();
    }

    @Override
    public String toString() {
        return super.toString() + ", File size: " + this.file.getSize();
    }
}
