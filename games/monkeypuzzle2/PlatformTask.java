/*
 * Decompiled by CFR-JS 0.4.0.
 */
public class PlatformTask {
    public volatile Object result;
    public volatile int status;
    int requestType;
    public int intArgument;
    PlatformTask next;
    int secondaryIntArgument;
    Object objectArgument;

    PlatformTask() {
        this.status = 0;
    }
}
