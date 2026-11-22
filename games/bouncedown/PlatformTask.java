/*
 * Decompiled by CFR-JS 0.4.0.
 */
public class PlatformTask {
    public volatile int status;
    PlatformTask next;
    public volatile Object result;
    int requestType;
    public int intArgument;
    Object objectArgument;
    int secondaryIntArgument;

    PlatformTask() {
        this.status = 0;
    }
}
