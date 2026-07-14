/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ll {
    static int field_d;
    static int field_b;
    static String field_c;
    static String field_a;

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        int var1 = 10 % ((param0 - 41) / 60);
    }

    final static String a(byte param0, CharSequence[] param1) {
        if (param0 < 6) {
            return null;
        }
        return mh.a(param1, (byte) 111, 0, param1.length);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_c = "Username: ";
        field_a = "Error connecting to server. Please try using a different server.";
    }
}
