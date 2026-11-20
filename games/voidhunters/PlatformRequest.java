/*
 * Decompiled by CFR-JS 0.4.0.
 */
public class PlatformRequest {
    PlatformRequest next;
    public volatile Object result;
    Object objectArgument;
    public volatile int status;
    int type;
    public int primaryIntArgument;
    int secondaryIntArgument;

    PlatformRequest() {
        this.status = 0;
    }
}
