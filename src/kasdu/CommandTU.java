package kasdu;

/**
 * Created by Андрей on 25.12.2016.
 */
public class CommandTU {
    public final String name;
    private final KasduAddr addr;

    public CommandTU(String name, KasduAddr addr) {
        this.name = name;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public KasduAddr getAddr() {
        return addr;
    }
}
