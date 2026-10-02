/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph extends IntrusiveNode {
    static String waitingForExtraDataText;
    static String createUsernameAvailableText;
    int field_h;
    static String createUnableText;
    int field_f;
    static PlatformTaskDispatcher archiveTaskDispatcher;

    public static void a(byte param0) {
        createUsernameAvailableText = null;
        createUnableText = null;
        archiveTaskDispatcher = null;
        if (param0 != 112) {
            createUnableText = (String) null;
            waitingForExtraDataText = null;
            return;
        }
        waitingForExtraDataText = null;
    }

    private ph() throws Throwable {
        throw new Error();
    }

    static {
        createUsernameAvailableText = "Name is available";
        waitingForExtraDataText = "Waiting for extra data";
        createUnableText = "Unfortunately we are unable to create an account for you at this time.";
    }
}
