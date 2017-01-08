package kasdu;

/**
 * Created by Андрей on 25.12.2016.
 */
public class CommandTU {
    public final String name;
    public final KasduAddr addr;

    public CommandTU(String name, KasduAddr addr) {
        this.name = name;
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "\n"+name+" "+addr;
    }
}
