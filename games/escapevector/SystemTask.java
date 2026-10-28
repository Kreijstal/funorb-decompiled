/*
 * Decompiled by CFR-JS 0.4.0.
 */
public class SystemTask {
    Object argument;
    int secondaryIntArgument;
    SystemTask next;
    public volatile Object result;
    public volatile int status;
    public int intArgument;
    int type;

    SystemTask() {
        this.status = 0;
    }
}
