package kasdu;


public class SignalTS {
    private final String name;
    private final KasduAddr addr;
    private final boolean alarm;
    private boolean currentValue = false;
    private boolean valueIsDefined = false;

    public SignalTS(String name, KasduAddr addr, boolean alarm) {
        this.name = name;
        this.addr = addr;
        this.alarm = alarm;
    }

    public String getName() {
        return name;
    }

    public KasduAddr getAddr() {
        return addr;
    }

    public boolean getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(boolean currentValue) {
        this.currentValue = currentValue;
    }

    public boolean isValueDefined() {
        return valueIsDefined;
    }

    public void setValueDefined(boolean valueIsDefined) {
        this.valueIsDefined = valueIsDefined;
    }
}
