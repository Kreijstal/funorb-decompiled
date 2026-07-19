/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rq extends tc {
    static int[] field_n;
    String field_l;
    static wk[] field_k;
    static int field_m;
    static String field_o;
    static ci[] field_p;

    public static void a(int param0) {
        field_p = null;
        field_k = null;
        field_o = null;
        if (param0 != -22823) {
            rq.a(53);
            field_n = null;
            return;
        }
        field_n = null;
    }

    final static void a(byte param0) {
        fg var1 = null;
        L0: {
          var1 = (fg) ((Object) vb.field_q.c((byte) -121));
          if (var1 == null) {
            var1 = new fg();
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != -56) {
          return;
        } else {
          var1.a(qn.field_f, qn.field_j, qn.field_e, qn.field_d, qn.field_a, qn.field_g, qn.field_l, -89);
          md.field_y.a((byte) -119, (tc) (var1));
          return;
        }
    }

    final static void a(boolean param0) {
        ga.field_g = new kd();
        if (param0) {
            rq.a((byte) 79);
            lt.field_g.a(ga.field_g, (byte) 78);
            return;
        }
        lt.field_g.a(ga.field_g, (byte) 78);
    }

    rq(String param0) {
        try {
            this.field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "rq.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = ce.a(-68);
        field_o = "Invalid password.";
        field_p = new ci[29];
    }
}
