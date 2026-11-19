/*
 * Decompiled by CFR-JS 0.4.0.
 */
public class AsyncRequest {
    public volatile int status;
    AsyncRequest next;
    public int argument;
    Object input;
    int taskType;
    public volatile Object result;
    int secondaryArgument;

    AsyncRequest() {
        this.status = 0;
    }
}
