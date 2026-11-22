/*
 * Decompiled by CFR-JS 0.4.0.
 */
public class PlatformTask {
    public int intArgument;
    PlatformTask next;
    public volatile Object result;
    int requestType;
    public volatile int status;
    Object objectArgument;
    int secondaryIntArgument;

    PlatformTask() {
        this.status = 0;
    }
}
