/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nma extends ana {
    static kv field_v;
    private vha field_w;

    private final void c(boolean param0) {
        if (param0) {
            this.c(true);
        }
    }

    final static boolean e(int param0) {
        int discarded$0 = 15000;
        return paa.a();
    }

    final static void a(vr param0, boolean param1, boolean param2, vr param3) {
        try {
            int discarded$0 = 1;
            qq.a(uaa.field_i, gfa.field_f, qf.field_y, rea.field_g, (po) (Object) hl.field_H, ina.field_n, qs.field_m, oe.field_c, dla.field_k, -30803, nu.field_c);
            gi.field_b = gw.a("lobby", "chatfilter", param3, -112);
            qo.field_a[0] = wj.field_x;
            qo.field_a[2] = cn.field_i;
            qo.field_a[1] = de.field_K;
            int discarded$1 = -95;
            gaa.a((po) (Object) ds.field_l, param0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "nma.G(" + (param0 != null ? "{...}" : "null") + 44 + 1 + 44 + 1 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean c(byte param0) {
        int var2 = 0;
        int fieldTemp$4 = ((nma) this).field_l - 1;
        ((nma) this).field_l = ((nma) this).field_l - 1;
        if (fieldTemp$4 >= 0) {
          if (25 == ((nma) this).field_l) {
            int discarded$5 = 100;
            this.e();
            return false;
          } else {
            return false;
          }
        } else {
          var2 = -29 / ((param0 - 71) / 47);
          this.c(false);
          return true;
        }
    }

    final static Boolean b() {
        Boolean var1 = vg.field_l;
        vg.field_l = null;
        return var1;
    }

    private final void e() {
        aga var2 = null;
        int var3 = 0;
        iv var4 = null;
        ad var5 = null;
        int var6 = 0;
        var6 = BachelorFridge.field_y;
        var2 = ((nma) this).field_w.field_l.a(95, ((nma) this).field_q.field_h);
        var3 = 0;
        if (var2.i(84)) {
          return;
        } else {
          var4 = (iv) (Object) ((nma) this).field_w.field_o.b((byte) 90);
          oha discarded$1 = al.a(-42, ((nma) this).field_w.field_k);
          L0: while (true) {
            if (var4 == null) {
              return;
            } else {
              var4.a(var2, ((nma) this).field_q.field_h, 12);
              var5 = var4.field_h.a(-27449, ((nma) this).field_q);
              var5.b(-1, 6);
              var5.a(24831, 44, kw.field_g);
              var4 = (iv) (Object) ((nma) this).field_w.field_o.c(0);
              continue L0;
            }
          }
        }
    }

    public static void d(int param0) {
        field_v = null;
    }

    nma(gj param0, vha param1) {
        super(param0, (bca) (Object) param1);
        try {
            ((nma) this).field_w = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "nma.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
