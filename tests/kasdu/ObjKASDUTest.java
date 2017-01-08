package kasdu;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Андрей on 07.01.2017.
 */
public class ObjKASDUTest {

    ObjKASDU objKASDU = new ObjKASDU("ИмяОбъектаКасду");

    @Before
    public void setUp() throws Exception {
        objKASDU.add( new SignalTS("ТС-ВКЛ", new KasduAddr("Пролетарская",5,18,14),false));
        objKASDU.add( new SignalTS("ТС-ОТКЛ", new KasduAddr("Пролетарская",5,30,15),false));
        objKASDU.add( new SignalTS("ТС-АВАР", new KasduAddr("Пролетарская",5,35,16),true));
        objKASDU.add(new CommandTU("ВКЛ", new KasduAddr("Пролетарская", 5, 18,5)));
        objKASDU.add(new ObjKASDU("ТестОбъект"));
    }

    @Test
    public void toStringTest (){
        //System.out.println(objKASDU);
        Assert.assertEquals(objKASDU.name,"ИмяОбъектаКасду");
        Assert.assertEquals(objKASDU.toString(),"ИмяОбъектаКасду[1]\nТС:3[\nТС-ВКЛ Пролетарская 5 Gr:18 O:14, \nТС-ОТКЛ Пролетарская 5 Gr:30 O:15, \nТС-АВАР Пролетарская 5 Gr:35 O:16 AlarmSig]\nТУ:1[\nВКЛ Пролетарская 5 Gr:18 O:5]");

    }

}