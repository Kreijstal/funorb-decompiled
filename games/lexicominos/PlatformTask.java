/*
 * Decompiled by CFR-JS 0.4.0.
 */
public class PlatformTask {
    public int intArgument;
    int secondaryIntArgument;
    int requestType;
    PlatformTask next;
    public volatile int status;
    public volatile Object result;
    Object objectArgument;

    PlatformTask() {
        this.status = 0;
    }
}
