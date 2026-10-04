/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ByteShortQuery extends IntrusiveNode {
    static String waitingForExtraDataText;
    static String createUsernameAvailableText;
    int queryShort;
    static String createUnableText;
    int queryByte;
    static PlatformTaskDispatcher archiveTaskDispatcher;

    public static void releaseStaticReferences(byte methodGuard) {
        createUsernameAvailableText = null;
        createUnableText = null;
        archiveTaskDispatcher = null;
        if (methodGuard != 112) {
            createUnableText = (String) null;
            waitingForExtraDataText = null;
            return;
        }
        waitingForExtraDataText = null;
    }

    private ByteShortQuery() throws Throwable {
        throw new Error();
    }

    static {
        createUsernameAvailableText = "Name is available";
        waitingForExtraDataText = "Waiting for extra data";
        createUnableText = "Unfortunately we are unable to create an account for you at this time.";
    }
}
