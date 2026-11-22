/*
 * Decompiled by CFR-JS 0.4.0.
 */
public class SystemTask {
    public volatile int status;
    int requestType;
    Object objectArgument;
    public volatile Object result;
    public int intArgument;
    int secondaryIntArgument;
    SystemTask next;

    SystemTask() {
        this.status = 0;
    }
}
