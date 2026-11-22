/*
 * Decompiled by CFR-JS 0.4.0.
 */
public class PlatformTask {
    public int intArgument;
    Object objectArgument;
    public volatile int status;
    PlatformTask next;
    int requestType;
    public volatile Object result;
    int secondaryIntArgument;

    PlatformTask() {
        this.status = 0;
    }
}
