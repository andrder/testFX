package kasdu;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Андрей on 03.01.2017.
 */
public class CommandTUTest {

    KasduAddr kasduAddr = new KasduAddr("Пролетарская",5,34,19);
    CommandTU commandTU = new CommandTU("ИМЯ.КомандыТУ.ВКЛ", kasduAddr);



}