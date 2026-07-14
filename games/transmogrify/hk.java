/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk {
    static java.awt.Image field_c;
    static mi field_a;
    static String field_b;

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        if (param0 < 26) {
            hk.a((byte) 26);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(kg param0, int param1, int param2, kg param3) {
        gd.field_m = param2;
        tb.field_c = param3;
        ce.field_b = param0;
        me.a(false, sb.field_c / param1, sb.field_g / 2);
        dc.a(param0.field_D, param3.field_D, -47, param0.field_D + param0.field_t, param3.field_D + param3.field_t);
    }

    final static String a(int param0, int param1, char param2) {
        int var4 = 0;
        int var5 = Transmogrify.field_A ? 1 : 0;
        char[] var6 = new char[param1];
        char[] var3 = var6;
        for (var4 = param0; param1 > var4; var4++) {
            var6[var4] = param2;
        }
        return new String(var6);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Email address is unavailable";
    }
}
