/*
 * Decompiled by CFR-JS 0.4.0.
 */
public class AsyncRequest {
    int secondaryIntArgument;
    int requestType;
    Object objectArgument;
    public int intArgument;
    AsyncRequest next;
    public volatile Object result;
    public volatile int status;

    AsyncRequest() {
        this.status = 0;
    }
}
