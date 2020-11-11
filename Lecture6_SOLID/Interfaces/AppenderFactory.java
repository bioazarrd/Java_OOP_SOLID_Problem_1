package D_JavaAdvancedOOP.Lecture6_SOLID.Interfaces;

import D_JavaAdvancedOOP.Lecture6_SOLID.Enums.ReportLevel;

public interface AppenderFactory {

    Appender produce(String type, ReportLevel reportLevel, Layout layout);





}
