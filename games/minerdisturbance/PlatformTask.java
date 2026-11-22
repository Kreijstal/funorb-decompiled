/*
 * Decompiled by CFR-JS 0.4.0.
 */
public class PlatformTask {
    int requestType;
    int secondaryIntArgument;
    public int intArgument;
    Object objectArgument;
    public volatile int status;
    PlatformTask next;
    public volatile Object result;

    PlatformTask() {
        this.status = 0;
    }
}
