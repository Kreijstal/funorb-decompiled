/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb implements bf {
    private int field_j;
    static String field_h;
    static int field_f;
    private vd field_d;
    private int field_b;
    private int field_k;
    static String field_a;
    private int field_g;
    private int field_c;
    private int field_e;
    private int field_i;

    public static void a(int param0) {
        field_a = null;
        field_h = null;
        int var1 = 20 % ((-69 - param0) / 50);
    }

    public final void a(int param0, int param1, ub param2, boolean param3, boolean param4) {
        ug var15 = null;
        int var7 = 0;
        int var8 = 0;
        int var13 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        try {
            var15 = param2 instanceof ug ? (ug) ((Object) param2) : null;
            if (var15 == null) {
            }
            ed.c(param2.field_o + param0, param2.field_l + param1, param2.field_r, param2.field_n, this.field_g);
            var7 = var15.field_J + param0 - -param2.field_o;
            var8 = var15.field_L + param1 + param2.field_l;
            if (!param3) {
                ub var14 = (ub) null;
                this.a(121, 51, (ub) null, true, false);
            }
            ed.a(var7, var8, var15.field_G, this.field_b);
            if (!(0 == (var15.field_K ^ -1))) {
                var9 = (double)var15.field_K * 3.141592653589793 * 2.0 / (double)var15.field_O;
                var11 = (int)(-Math.sin(var9) * (double)var15.field_G);
                var12 = (int)(Math.cos(var9) * (double)var15.field_G);
                ed.a(var7 - -var11, var12 + var8, 1, this.field_e);
            }
            ed.a(var7, var8, 2, 1);
            var9 = 3.141592653589793 * (double)var15.field_M * 2.0 / (double)var15.field_O;
            var11 = (int)(-Math.sin(var9) * (double)var15.field_G);
            var12 = (int)(Math.cos(var9) * (double)var15.field_G);
            ed.e(var7, var8, var7 + var11, var12 + var8, 1);
            if (this.field_d != null) {
                var13 = var15.field_G + (var15.field_J + this.field_k);
                this.field_d.a(param2.field_k, var13 + (param2.field_o + param0), this.field_j + (param1 + param2.field_l), param2.field_r - (var13 - -this.field_k), param2.field_n - (this.field_k << 1959325185), this.field_c, this.field_i, 1, 1, 0);
            }
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "wb.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    wb(vd param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            this.field_e = param6;
            this.field_k = param1;
            this.field_g = param7;
            this.field_j = param2;
            this.field_d = param0;
            this.field_c = param3;
            this.field_b = param5;
            this.field_i = param4;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "wb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_a = "Press <%1> or UP";
        field_h = "Cancel";
    }
}
