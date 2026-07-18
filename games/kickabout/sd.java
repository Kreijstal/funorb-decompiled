/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd {
    static String field_e;
    static hd field_a;
    static int field_b;
    static r field_d;
    static String field_c;

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        field_a = null;
        field_c = null;
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final static void a(ut param0, byte param1) {
        int var2_int = 0;
        int var3 = Kickabout.field_G;
        for (var2_int = 0; param0.field_y.length > var2_int; var2_int++) {
            if (param0.field_y[var2_int] == 0) {
                param0.field_y[var2_int] = 65793;
            } else {
                var2_int++;
            }
        }
        param0.field_y[0] = 0;
        try {
            param0.field_y[-1 + param0.field_o] = 0;
            param0.field_y[(-1 + param0.field_v) * param0.field_o] = 0;
            param0.field_y[-1 + param0.field_y.length] = 0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "sd.A(" + (param0 != null ? "{...}" : "null") + ',' + -51 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "buyout can't go below starting price";
        field_c = "Only show lobby chat from my friends";
        field_b = 370;
        field_d = new r();
    }
}
