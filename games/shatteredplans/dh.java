/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh {
    static qb field_a;
    static String field_d;
    static String field_b;
    static re field_c;

    final static boolean a(int param0) {
        if (param0 != -12165) {
            return false;
        }
        return true;
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 > -74) {
            return;
        }
        field_b = null;
        field_c = null;
        field_d = null;
    }

    static {
        field_b = "Unfortunately we are unable to create an account for you at this time.";
        field_d = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
    }
}
