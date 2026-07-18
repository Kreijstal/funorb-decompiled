/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n extends ai {
    int field_k;
    static int field_m;
    int field_h;
    int field_j;
    int field_l;
    int field_n;
    int[] field_g;
    int field_i;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7) {
        try {
            if (param1 >= -65) {
                Object var10 = null;
                ((n) this).a(-37, 3, 13, 1, -81, 124, 72, (int[]) null);
            }
            ((n) this).field_i = param0;
            ((n) this).field_l = param4;
            ((n) this).field_n = param3;
            ((n) this).field_h = param2;
            ((n) this).field_j = param6;
            ((n) this).field_g = param7;
            ((n) this).field_k = param5;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "n.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    n() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 0;
    }
}
