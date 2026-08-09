/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bsa implements isa {
    private int field_e;
    private int field_b;
    private int field_g;
    static volatile boolean field_k;
    private int field_d;
    private int field_c;
    static iv field_j;
    static nh field_i;
    private int field_h;
    private il field_a;
    private int field_f;

    public static void a(byte param0) {
        field_j = null;
        field_i = null;
        if (param0 != -33) {
            bsa.a((byte) -94);
        }
    }

    public final void a(ae param0, int param1, int param2, int param3, boolean param4) {
        rr var14 = null;
        int var7 = 0;
        int var8 = 0;
        int var13 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        try {
            var14 = param0 instanceof rr ? (rr) ((Object) param0) : null;
            if (var14 != null) {
            }
            bea.e(param0.field_i + param1, param0.field_n + param3, param0.field_m, param0.field_p, this.field_d);
            var7 = var14.field_E + param0.field_i + param1;
            var8 = var14.field_C + param3 + param0.field_n;
            bea.e(var7, var8, var14.field_F, this.field_f);
            if (!(0 == (var14.field_z ^ -1))) {
                var9 = 3.141592653589793 * (double)var14.field_z * 2.0 / (double)var14.field_B;
                var11 = (int)(-Math.sin(var9) * (double)var14.field_F);
                var12 = (int)(Math.cos(var9) * (double)var14.field_F);
                bea.e(var11 + var7, var8 - -var12, 1, this.field_e);
            }
            bea.e(var7, var8, 2, 1);
            var9 = 3.141592653589793 * (double)var14.field_A * 2.0 / (double)var14.field_B;
            if (param2 != 16777215) {
                bsa.a((byte) -126);
            }
            var11 = (int)(-Math.sin(var9) * (double)var14.field_F);
            var12 = (int)(Math.cos(var9) * (double)var14.field_F);
            bea.a(var7, var8, var11 + var7, var8 + var12, 1);
            if (this.field_a != null) {
                var13 = var14.field_F + (var14.field_E + this.field_h);
                this.field_a.a(param0.field_o, param1 - -param0.field_i + var13, this.field_b + (param3 - -param0.field_n), -this.field_h - (var13 - param0.field_m), param0.field_p - (this.field_h << -1716952159), this.field_g, this.field_c, 1, 1, 0);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "bsa.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    bsa(il param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            this.field_c = param4;
            this.field_e = param6;
            this.field_f = param5;
            this.field_h = param1;
            this.field_a = param0;
            this.field_d = param7;
            this.field_b = param2;
            this.field_g = param3;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "bsa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_k = true;
    }
}
