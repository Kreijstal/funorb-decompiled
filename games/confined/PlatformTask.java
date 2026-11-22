/*
 * Decompiled by CFR-JS 0.4.0.
 */
public class PlatformTask {
    int requestType;
    Object objectArgument;
    int secondaryIntArgument;
    public int intArgument;
    PlatformTask next;
    public volatile Object result;
    public volatile int status;

    PlatformTask() {
        this.status = 0;
    }
}
