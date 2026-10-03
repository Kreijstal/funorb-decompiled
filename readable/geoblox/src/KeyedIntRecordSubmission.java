/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class KeyedIntRecordSubmission extends IntrusiveNode {
    static String creatingYourAccountText;
    int secondValue;
    static String createAnAccountText;
    int fourthValue;
    int signedSmartKey;
    int thirdValue;
    int firstValue;
    int byteKey;

    public static void b(int param0) {
        createAnAccountText = null;
        if (param0 < 120) {
            creatingYourAccountText = (String) null;
            creatingYourAccountText = null;
            return;
        }
        creatingYourAccountText = null;
    }

    private KeyedIntRecordSubmission() throws Throwable {
        throw new Error();
    }

    static {
        creatingYourAccountText = "Creating your account";
        createAnAccountText = "Create a free Account";
    }
}
