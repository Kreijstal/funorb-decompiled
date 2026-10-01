/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se extends IntrusiveNode {
    static String creatingYourAccountText;
    int field_h;
    static String createAnAccountText;
    int field_f;
    int field_j;
    int field_l;
    int field_k;
    int field_g;

    public static void b(int param0) {
        createAnAccountText = null;
        if (param0 < 120) {
            creatingYourAccountText = (String) null;
            creatingYourAccountText = null;
            return;
        }
        creatingYourAccountText = null;
    }

    private se() throws Throwable {
        throw new Error();
    }

    static {
        creatingYourAccountText = "Creating your account";
        createAnAccountText = "Create a free Account";
    }
}
