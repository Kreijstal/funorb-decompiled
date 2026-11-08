/*
 * Decompiled by CFR-JS 0.4.0.
 */
public class PlatformTask {
    int operation;
    public volatile Object result;
    PlatformTask next;
    public int intArgument;
    int secondIntArgument;
    Object objectArgument;
    public volatile int status;

    PlatformTask() {
        this.status = 0;
    }
}
