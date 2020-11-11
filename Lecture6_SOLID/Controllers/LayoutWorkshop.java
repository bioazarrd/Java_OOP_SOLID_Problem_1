package D_JavaAdvancedOOP.Lecture6_SOLID.Controllers;
import D_JavaAdvancedOOP.Lecture6_SOLID.Interfaces.Layout;
import D_JavaAdvancedOOP.Lecture6_SOLID.Interfaces.LayoutFactory;
public class LayoutWorkshop implements LayoutFactory {


    @Override
    public Layout produce(String type) {
        if (type.equals("SimpleLayout")) {
            return new SimpleLayout();
        } else if (type.equals("XmlLayout")) {
            return new XmlLayout();
        } else {
            throw new IllegalStateException(
                    "Not valid type of layout for" + type + " param");
        }
    }


}
