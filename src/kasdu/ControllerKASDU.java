package kasdu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Андрей on 27.12.2016.
 */
public class ControllerKASDU {
    private final String nameId;
    private final String nameKP;
    private final int numKP;
    private final int maxGroups;
    private final int maxSignals;
    private List<SignalTS> signalsTS;
    private List<CommandTU> commandsTU;

    public ControllerKASDU(String nameId, String nameKP, int numKP, int maxGroups, int maxSignals) {
        this.nameId = nameId;
        this.nameKP = nameKP;
        this.numKP = numKP;
        this.maxGroups = maxGroups;
        this.maxSignals = maxSignals;
        signalsTS = new ArrayList<>();
        commandsTU = new ArrayList<>();
    }
}
