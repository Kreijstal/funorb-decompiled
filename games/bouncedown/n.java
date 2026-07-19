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
                int[] var10 = (int[]) null;
                this.a(-37, 3, 13, 1, -81, 124, 72, (int[]) null);
            }
            this.field_i = param0;
            this.field_l = param4;
            this.field_n = param3;
            this.field_h = param2;
            this.field_j = param6;
            this.field_g = param7;
            this.field_k = param5;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "n.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    n() {
    }

    static {
        field_m = 0;
    }
}
