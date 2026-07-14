/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ms {
    static String field_a;
    static int field_b;

    final static void a(String param0, int param1, int param2, boolean param3, int param4, int param5) {
        Object var7 = null;
        ic.a(param2, param0, false, (String) null, param5, false, param3, param1);
        if (param4 != 0) {
            field_b = -32;
        }
    }

    final static void a(int param0, int param1) {
        wd.field_n[param0] = param1;
        if (sk.field_d != null) {
            sk.field_d.a(0, param1, (byte) -85);
        }
    }

    public static void a(byte param0) {
        if (param0 != 53) {
            ms.a(-17, -62);
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "<gt>";
    }
}
