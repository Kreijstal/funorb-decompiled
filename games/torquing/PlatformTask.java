/*
 * Decompiled by CFR-JS 0.4.0.
 */
public class PlatformTask {
    Object objectArgument;
    public volatile int status;
    int requestType;
    public int intArgument;
    public volatile Object result;
    PlatformTask next;
    int secondaryIntArgument;

    PlatformTask() {
        this.status = 0;
    }
}
