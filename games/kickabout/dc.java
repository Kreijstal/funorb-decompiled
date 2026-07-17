/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc {
    static hd field_a;
    static int field_d;
    static ut field_b;
    static int field_c;

    final static void a(int param0, byte param1) {
        vs var2 = null;
        int var3 = 0;
        int var4 = Kickabout.field_G;
        try {
            var2 = ue.field_f[param0];
            if (param1 < 25) {
                field_d = 122;
            }
            for (var3 = param0; var3 > 0; var3--) {
                ue.field_f[var3] = ue.field_f[var3 - 1];
            }
            ue.field_f[0] = var2;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "dc.B(" + param0 + 44 + param1 + 41);
        }
    }

    public static void a(int param0) {
        int var1 = -119;
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ut(104, 150);
        field_c = -1;
    }
}
