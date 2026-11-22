/*
 * Decompiled by CFR-JS 0.4.0.
 */
public class PlatformTask {
    public volatile int status;
    Object objectArgument;
    PlatformTask next;
    public volatile Object result;
    public int intArgument;
    int secondaryIntArgument;
    int requestType;

    PlatformTask() {
        this.status = 0;
    }
}
