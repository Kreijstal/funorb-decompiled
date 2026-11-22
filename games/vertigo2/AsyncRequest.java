/*
 * Decompiled by CFR-JS 0.4.0.
 */
public class AsyncRequest {
    Object objectArgument;
    int secondaryIntArgument;
    public volatile Object result;
    int requestType;
    public int intArgument;
    AsyncRequest next;
    public volatile int status;

    AsyncRequest() {
        this.status = 0;
    }
}
