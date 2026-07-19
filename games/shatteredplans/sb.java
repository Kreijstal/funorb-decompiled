/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb extends oh {
    float field_p;
    float field_k;
    float field_n;
    float[] field_i;
    float[] field_o;
    float field_r;
    float field_m;
    float field_j;
    int field_q;
    float field_s;
    static int field_h;
    float field_l;

    final static void a(byte param0, java.awt.Component param1) {
        try {
            param1.removeMouseListener(pd.field_j);
            param1.removeMouseMotionListener(pd.field_j);
            param1.removeFocusListener(pd.field_j);
            v.field_d = 0;
            int var2_int = -125 % ((param0 - -60) / 36);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "sb.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    sb(float param0, float param1, float param2, float param3, float param4, float param5, float param6, float param7) {
        int var9 = 0;
        this.field_o = new float[50];
        this.field_s = param7;
        this.field_n = param1;
        this.field_r = param6;
        this.field_m = param5;
        this.field_j = param3;
        this.field_p = param4;
        this.field_i = new float[50];
        this.field_l = param0;
        this.field_k = param2;
        for (var9 = 0; var9 < 50; var9++) {
            this.field_o[var9] = this.field_l;
            this.field_i[var9] = this.field_n;
        }
        this.field_q = 0;
    }

    static {
    }
}
