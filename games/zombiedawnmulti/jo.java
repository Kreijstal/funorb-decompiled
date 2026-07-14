/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jo {
    static ma field_e;
    static String field_c;
    static int field_f;
    static ja field_d;
    static String field_a;
    static int field_b;

    final static void a(byte param0) {
        pb.field_d = 0;
        if (param0 <= 29) {
            jo.a((byte) -128);
        }
    }

    final static boolean a(ul param0, int param1) {
        if (param1 != 0) {
            field_f = -48;
            return param0.a(0);
        }
        return param0.a(0);
    }

    public static void a(boolean param0) {
        field_e = null;
        if (param0) {
            return;
        }
        field_a = null;
        field_c = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new ma();
        field_a = "";
        field_c = "Join <%0>'s game";
    }
}
