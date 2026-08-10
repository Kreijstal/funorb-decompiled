/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh implements t {
    static boolean field_k;
    static String field_c;
    private int field_g;
    private int field_j;
    private int field_f;
    static String field_e;
    private int field_b;
    private oh field_d;
    private int field_a;
    private int field_i;
    private int field_h;

    public static void b(int param0) {
        field_e = null;
        field_c = null;
        if (param0 != 8462) {
            gh.a(-64);
        }
    }

    final static boolean a(int param0) {
        if (param0 != 3100) {
            return false;
        }
        if (null == r.field_i) {
            return false;
        }
        if (ka.field_b != jc.field_a) {
            return false;
        }
        return true;
    }

    public final void a(int param0, al param1, int param2, boolean param3, int param4) {
        int var8 = 0;
        int var13 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        fe var14 = !(param1 instanceof fe) ? null : (fe) ((Object) param1);
        ll.c(param4 + param1.field_p, param1.field_m + param2, param1.field_x, param1.field_u, this.field_h);
        if (var14 == null) {
        }
        int var7 = var14.field_S + param1.field_p + param4;
        if (param0 != -24969) {
            return;
        }
        try {
            var8 = param2 + param1.field_m - -var14.field_R;
            ll.f(var7, var8, var14.field_I, this.field_a);
            if (0 != (var14.field_K ^ -1)) {
                var9 = (double)var14.field_K * 3.141592653589793 * 2.0 / (double)var14.field_M;
                var11 = (int)(-Math.sin(var9) * (double)var14.field_I);
                var12 = (int)(Math.cos(var9) * (double)var14.field_I);
                ll.f(var7 - -var11, var8 - -var12, 1, this.field_i);
            }
            ll.f(var7, var8, 2, 1);
            var9 = (double)var14.field_O * 3.141592653589793 * 2.0 / (double)var14.field_M;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_I);
            var12 = (int)(Math.cos(var9) * (double)var14.field_I);
            ll.e(var7, var8, var11 + var7, var8 + var12, 1);
            if (null != this.field_d) {
                var13 = var14.field_I + (var14.field_S - -this.field_b);
                this.field_d.a(param1.field_s, var13 + (param4 - -param1.field_p), this.field_f + (param1.field_m + param2), -this.field_b + -var13 + param1.field_x, -(this.field_b << -594462207) + param1.field_u, this.field_j, this.field_g, 1, 1, 0);
            }
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "gh.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    gh(oh param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            this.field_b = param1;
            this.field_h = param7;
            this.field_f = param2;
            this.field_g = param4;
            this.field_a = param5;
            this.field_j = param3;
            this.field_d = param0;
            this.field_i = param6;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "gh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_k = false;
        field_c = "Unfortunately we are unable to create an account for you at this time.";
        field_e = "Move around the exhibition rooms using the arrow keys or mouse. Note that mouse clicks should be in the same row or column as your character.";
    }
}
