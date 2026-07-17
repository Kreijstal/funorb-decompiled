/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk {
    static String field_c;
    static ut[] field_a;
    static int[] field_b;
    static boolean field_e;
    static int[] field_f;
    static String field_d;
    static bb field_h;
    static int field_g;

    final static void a(String param0, int param1, long param2, int param3, byte param4) {
        vb.field_h = param1;
        oc.field_f = param0;
        nu.field_j = true;
        if (param4 > -49) {
            return;
        }
        try {
            qh.field_c = param2;
            qs.field_K = param3;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "gk.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_h = null;
        field_c = null;
        field_b = null;
        field_f = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = false;
        field_d = "This option cannot be combined with the current '<%0>' setting.";
        field_c = "You cannot chat to <%0> because <%0> is offline in your friend list.";
        field_f = new int[]{135, 70, 115, 55, 75, 75, 75};
    }
}
