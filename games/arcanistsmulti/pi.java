/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi {
    static String field_e;
    static oc field_b;
    static boolean field_c;
    static int field_a;
    static kc field_d;

    final static void a(boolean param0) {
        la.field_b = new vn();
        if (!param0) {
            pi.a((byte) 83);
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_d = null;
        if (param0 > -19) {
            pi.a(true);
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
        field_e = "";
        field_a = 0;
        field_b = new oc();
    }
}
