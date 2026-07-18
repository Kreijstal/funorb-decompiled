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
            param1.removeMouseListener((java.awt.event.MouseListener) (Object) pd.field_j);
            param1.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) pd.field_j);
            param1.removeFocusListener((java.awt.event.FocusListener) (Object) pd.field_j);
            v.field_d = 0;
            int var2_int = -1;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "sb.A(" + 89 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    sb(float param0, float param1, float param2, float param3, float param4, float param5, float param6, float param7) {
        int var9 = 0;
        ((sb) this).field_o = new float[50];
        ((sb) this).field_s = param7;
        ((sb) this).field_n = param1;
        ((sb) this).field_r = param6;
        ((sb) this).field_m = param5;
        ((sb) this).field_j = param3;
        ((sb) this).field_p = param4;
        ((sb) this).field_i = new float[50];
        ((sb) this).field_l = param0;
        ((sb) this).field_k = param2;
        for (var9 = 0; var9 < 50; var9++) {
            ((sb) this).field_o[var9] = ((sb) this).field_l;
            ((sb) this).field_i[var9] = ((sb) this).field_n;
        }
        ((sb) this).field_q = 0;
    }

    static {
    }
}
