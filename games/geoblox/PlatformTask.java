/*
 * Decompiled by CFR-JS 0.4.0.
 */
public class PlatformTask {
    public volatile int status;
    Object input;
    int taskType;
    public int firstIntArgument;
    public volatile Object result;
    PlatformTask next;
    int secondIntArgument;

    PlatformTask() {
        this.status = 0;
    }
}
