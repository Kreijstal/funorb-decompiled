/*
 * Decompiled by CFR-JS 0.4.0.
 */
public class PlatformTask {
    public int intArgument;
    int requestType;
    public volatile Object result;
    public volatile int status;
    int secondaryIntArgument;
    PlatformTask next;
    Object objectArgument;

    PlatformTask() {
        this.status = 0;
    }
}
