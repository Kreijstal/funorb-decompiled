/*
 * Decompiled by CFR-JS 0.4.0.
 */
public class PlatformTask {
    public volatile Object result;
    int secondaryIntArgument;
    public int intArgument;
    public volatile int status;
    int requestType;
    PlatformTask next;
    Object objectArgument;

    PlatformTask() {
        this.status = 0;
    }
}
