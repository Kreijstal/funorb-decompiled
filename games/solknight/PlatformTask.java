/*
 * Decompiled by CFR-JS 0.4.0.
 */
public class PlatformTask {
    public volatile int status;
    int requestType;
    int secondaryIntArgument;
    public int intArgument;
    Object objectArgument;
    public volatile Object result;
    PlatformTask next;

    PlatformTask() {
        this.status = 0;
    }
}
