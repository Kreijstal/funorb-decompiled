/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb implements dh {
    static int[] field_l;
    static int field_b;
    static rh field_n;
    private int field_m;
    static String field_h;
    private int field_e;
    private m field_a;
    private int field_i;
    private int field_g;
    private int field_c;
    private int field_f;
    private int field_k;
    static wa field_j;
    static dm[] field_d;

    public final void a(int param0, int param1, int param2, boolean param3, el param4) {
        int var13 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        qb var14 = param4 instanceof qb ? (qb) ((Object) param4) : null;
        vb.a(param0 - -param4.field_v, param4.field_m + param2, param4.field_r, param4.field_h, this.field_f);
        if (var14 != null) {
        }
        int var7 = param4.field_v + param0 - -var14.field_E;
        int var8 = param4.field_m + param2 - -var14.field_O;
        vb.d(var7, var8, var14.field_K, this.field_e);
        if (var14.field_J != -1) {
            var9 = (double)var14.field_J * 3.141592653589793 * 2.0 / (double)var14.field_H;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_K);
            var12 = (int)(Math.cos(var9) * (double)var14.field_K);
            vb.d(var7 + var11, var8 - -var12, 1, this.field_g);
        }
        vb.d(var7, var8, 2, 1);
        var9 = 2.0 * (3.141592653589793 * (double)var14.field_I) / (double)var14.field_H;
        var11 = (int)(-Math.sin(var9) * (double)var14.field_K);
        var12 = (int)(Math.cos(var9) * (double)var14.field_K);
        if (param1 > -5) {
            return;
        }
        try {
            vb.g(var7, var8, var11 + var7, var12 + var8, 1);
            if (this.field_a != null) {
                var13 = this.field_c + (var14.field_E - -var14.field_K);
                this.field_a.a(param4.field_s, var13 + (param0 + param4.field_v), param2 - -param4.field_m - -this.field_i, param4.field_r - (this.field_c + var13), -(this.field_c << 1444492961) + param4.field_h, this.field_m, this.field_k, 1, 1, 0);
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "hb.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_n = null;
        field_h = null;
        if (param0 != 0) {
          field_h = (String) null;
          field_l = null;
          field_j = null;
          field_d = null;
          return;
        } else {
          field_l = null;
          field_j = null;
          field_d = null;
          return;
        }
    }

    hb(m param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            this.field_e = param5;
            this.field_f = param7;
            this.field_m = param3;
            this.field_a = param0;
            this.field_c = param1;
            this.field_k = param4;
            this.field_g = param6;
            this.field_i = param2;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "hb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_b = 0;
        field_h = "Play free version";
    }
}
