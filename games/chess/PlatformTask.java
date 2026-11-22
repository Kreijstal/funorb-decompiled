/*
 * Decompiled by CFR-JS 0.4.0.
 */
public class PlatformTask {
    Object objectArgument;
    public int intArgument;
    public volatile Object result;
    public volatile int status;
    int secondaryIntArgument;
    PlatformTask next;
    int requestType;

    PlatformTask() {
        this.status = 0;
    }
}
