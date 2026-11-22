/*
 * Decompiled by CFR-JS 0.4.0.
 */
public class PlatformTask {
    Object objectArgument;
    int requestType;
    public volatile Object result;
    PlatformTask next;
    public volatile int status;
    int secondaryIntArgument;
    public int intArgument;

    PlatformTask() {
        this.status = 0;
    }
}
