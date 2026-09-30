/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me extends hf {
    float field_k;
    int field_h;
    static int field_l;
    float field_i;
    String field_m;
    float field_n;
    static String field_j;
    int field_f;
    static sl field_g;

    final static void b(int param0) {
        if (param0 > 65) {
          if (fj.field_p != null) {
            L0: {
              fj.field_p.c();
              if (null != oh.field_a) {
                oh.field_a.c();
                break L0;
              } else {
                break L0;
              }
            }
            return;
          } else {
            L1: {
              if (null != oh.field_a) {
                oh.field_a.c();
                break L1;
              } else {
                break L1;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    public static void c(byte param0) {
        field_g = null;
        if (param0 != -40) {
            return;
        }
        field_j = null;
    }

    final static void a(byte param0) {
        jk.field_d = 1;
        if (param0 != 38) {
            me.c((byte) -26);
        }
    }

    final static void a(int param0, qc param1) {
        int var2_int = 0;
        try {
            rd.field_v = param1.b(true) << 1712561733;
            var2_int = param1.c((byte) 34);
            rd.field_v = rd.field_v + (var2_int >> 1880516451);
            h.field_b = var2_int << -1386386542 & 1835008;
            h.field_b = h.field_b + (param1.b(true) << -117028222);
            var2_int = param1.c((byte) 34);
            if (param0 <= 105) {
                me.a((byte) 114);
            }
            fe.field_g = var2_int << 1391909071 & 2064384;
            h.field_b = h.field_b + (var2_int >> -768121946);
            fe.field_g = fe.field_g + (param1.c((byte) 34) << 697285351);
            var2_int = param1.c((byte) 34);
            fe.field_g = fe.field_g + (var2_int >> 970005761);
            lc.field_b = (var2_int & 1) << 609815248;
            lc.field_b = lc.field_b + param1.b(true);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "me.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    me() {
        this.field_k = 0.0f;
        this.field_f = 0;
    }

    static {
        field_l = -1;
    }
}
