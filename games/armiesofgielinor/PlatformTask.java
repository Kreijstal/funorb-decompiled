/*
 * Decompiled by CFR-JS 0.4.0.
 */
public class PlatformTask {
    public int integerArgument;
    int secondIntegerArgument;
    public volatile int status;
    int taskType;
    public volatile Object result;
    Object objectArgument;
    PlatformTask nextTask;

    PlatformTask() {
        this.status = 0;
    }
}
