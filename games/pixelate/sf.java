/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf {
    static String field_a;

    public static void a(byte param0) {
        field_a = null;
        int var1 = 110 / ((-2 - param0) / 55);
    }

    final static void a(int param0) {
        int var1_int = 0;
        int var2 = Pixelate.field_H ? 1 : 0;
        try {
            gn.field_y.a(true);
            for (var1_int = param0; 32 > var1_int; var1_int++) {
                rh.field_x[var1_int] = 0L;
            }
            for (var1_int = 0; 32 > var1_int; var1_int++) {
                gf.field_a[var1_int] = 0L;
            }
            id.field_b = 0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "sf.B(" + param0 + ')');
        }
    }

    static {
        field_a = "Hide private chat and appear offline to friends";
    }
}
