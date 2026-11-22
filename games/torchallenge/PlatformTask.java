/*
 * Decompiled by CFR-JS 0.4.0.
 */
public class PlatformTask {
    int secondInt;
    public int firstInt;
    public volatile Object result;
    PlatformTask next;
    Object argument;
    public volatile int status;
    int kind;

    PlatformTask() {
        this.status = 0;
    }
}
