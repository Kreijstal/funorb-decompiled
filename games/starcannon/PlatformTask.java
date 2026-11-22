/*
 * Decompiled by CFR-JS 0.4.0.
 */
public class PlatformTask {
    Object objectArgument;
    int requestType;
    public int intArgument;
    PlatformTask next;
    public volatile int status;
    public volatile Object result;
    int secondaryIntArgument;

    PlatformTask() {
        this.status = 0;
    }
}
