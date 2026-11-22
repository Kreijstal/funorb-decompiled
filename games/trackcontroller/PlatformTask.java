/*
 * Decompiled by CFR-JS 0.4.0.
 */
public class PlatformTask {
    public volatile int status;
    public volatile Object result;
    int requestType;
    Object objectArgument;
    PlatformTask next;
    int secondaryIntArgument;
    public int intArgument;

    PlatformTask() {
        this.status = 0;
    }
}
