
import java.util.*;

public abstract class CoupeGlacee implements IProduit {
    protected List<Parfum> parfums;
    protected CoupeGlacee() {}
    public String description() {
        StringBuffer sb = new StringBuffer("");
        for(Iterator<Parfum> it = parfums.iterator(); it.hasNext();) {
            sb.append(it.next().toString());
            sb.append(" ");
        }
        return sb.toString();
    }
public abstract float cout();
}
