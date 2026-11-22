/*
 * Decompiled by CFR-JS 0.4.0.
 */
public class AsyncRequest {
    Object objectArgument;
    public volatile int status;
    public volatile Object result;
    int secondaryIntArgument;
    int requestType;
    public int intArgument;
    AsyncRequest next;

    AsyncRequest() {
        this.status = 0;
    }
}
