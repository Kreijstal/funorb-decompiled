/*
 * Decompiled by CFR-JS 0.4.0.
 */
public class PlatformTask {
    public volatile Object result;
    Object payload;
    public int argumentOne;
    int argumentTwo;
    int operation;
    public volatile int status;
    PlatformTask next;

    PlatformTask() {
        this.status = 0;
    }
}
