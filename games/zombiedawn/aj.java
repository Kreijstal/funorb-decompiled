/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj extends RuntimeException {
    Throwable field_c;
    String field_b;
    static int field_a;
    static String field_d;

    final static byte[] a(int param0, String param1) {
        int var2 = 121 / ((param0 - 47) / 53);
        return kp.field_f.a(param1, -101, "");
    }

    public static void a(byte param0) {
        if (param0 <= 28) {
            aj.a((byte) -72);
            field_d = null;
            return;
        }
        field_d = null;
    }

    aj(Throwable param0, String param1) {
        ((aj) this).field_b = param1;
        ((aj) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Overall score: ";
        field_a = 468;
    }
}
