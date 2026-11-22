/*
 * Decompiled by CFR-JS 0.4.0.
 */
public class PlatformTask {
    PlatformTask next;
    Object objectArgument;
    int requestType;
    public int intArgument;
    int secondaryIntArgument;
    public volatile Object result;
    public volatile int status;

    PlatformTask() {
        this.status = 0;
    }
}
