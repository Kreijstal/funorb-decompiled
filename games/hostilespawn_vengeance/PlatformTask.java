/*
 * Decompiled by CFR-JS 0.4.0.
 */
public class PlatformTask {
    public volatile Object result;
    public int intArgument;
    public volatile int status;
    int secondaryIntArgument;
    Object objectArgument;
    PlatformTask next;
    int requestType;

    PlatformTask() {
        this.status = 0;
    }
}
