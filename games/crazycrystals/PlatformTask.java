/*
 * Decompiled by CFR-JS 0.4.0.
 */
public class PlatformTask {
    PlatformTask next;
    Object objectArgument;
    public volatile int status;
    public volatile Object result;
    int requestType;
    int secondaryIntArgument;
    public int intArgument;

    PlatformTask() {
        this.status = 0;
    }
}
