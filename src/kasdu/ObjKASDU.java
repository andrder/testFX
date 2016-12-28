package kasdu;

import java.util.LinkedList;
import java.util.List;

/**
 * Устройство КАСДУ с набором ТС,ТУ, и, возможно вложенными такими же объектами (т.е. группа)
 */
public class ObjKASDU {
    private final String name;
    private List<ObjKASDU> listObj = new LinkedList<>(); //Список вложенных объектов экземпляра
    private List<SignalTS> listTS = new LinkedList<>();//сигналы ТС экземпляра
    private List<CommandTU> listTU = new LinkedList<>(); //команды ТУ экземпляра

    public ObjKASDU(String name) {
        this.name = name;
    }

    public void addObj (ObjKASDU obj) {
        listObj.add(obj);
    }

    public void addTS (SignalTS signalTS){
        listTS.add(signalTS);
    }

    public void addTU (CommandTU commandTU){
        listTU.add(commandTU);
    }
}
