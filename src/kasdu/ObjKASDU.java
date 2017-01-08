package kasdu;

import java.util.ArrayList;
import java.util.List;

/**
 * Устройство КАСДУ с набором ТС,ТУ, и, возможно вложенными такими же объектами (т.е. группа)
 */
public class ObjKASDU {
    public final String name;
    private List<ObjKASDU> listObj = new ArrayList<>(); //Список вложенных объектов экземпляра
    private List<SignalTS> listTS = new  ArrayList<>();//сигналы ТС экземпляра
    private List<CommandTU> listTU = new ArrayList<>(); //команды ТУ экземпляра

    public ObjKASDU(String name) {
        this.name = name;
    }

    public void add(ObjKASDU obj) {
        listObj.add(obj);
    }

    public void add(SignalTS signalTS){
        listTS.add(signalTS);
    }

    public void add(CommandTU commandTU){
        listTU.add(commandTU);
    }

    @Override
    public String toString() {
        String printStringObjKASDU = name + "[" + listObj.size()+ "]" + "\nТС:" + listTS.size() + listTS + "\nТУ:" + listTU.size() + listTU;
        return printStringObjKASDU;
    }
}
