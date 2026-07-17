/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll {
    static String field_d;
    static String field_a;
    static int field_b;
    static String field_c;
    static lg[] field_e;

    public static void a() {
        field_e = null;
        field_c = null;
        field_a = null;
        field_d = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(byte param0, int param1) {
        wq.field_I = new int[3];
        field_b = param1;
        eo.field_l = new tn[param1 * 15];
        no.field_d = 0;
        if (param0 > -71) {
            ll.a((byte) -33, -122);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Login: ";
        field_c = "You have 1 unread message!";
        field_d = "Please send me news and updates (I can unsubscribe at any time)";
        field_e = new lg[3];
    }
}
