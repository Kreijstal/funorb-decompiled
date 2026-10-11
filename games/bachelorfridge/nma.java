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
        if (param0 != -8774) {
          field_v = (kv) null;
          return paa.a(15000);
        }
        return paa.a(15000);
    }

    final static void a(vr param0, boolean param1, boolean param2, vr param3) {
        try {
          if (!param1) {
            nma.d(126);
          }
          qq.a(uaa.field_i, gfa.field_f, qf.field_y, rea.field_g, hl.field_H, ina.field_n, qs.field_m, oe.field_c, dla.field_k, -30803, nu.field_c, param2);
          gi.field_b = gw.a("lobby", "chatfilter", param3, -112);
          qo.field_a[0] = wj.field_x;
          qo.field_a[2] = cn.field_i;
          qo.field_a[1] = de.field_K;
          gaa.a(ds.field_l, param0, -95);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "nma.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean c(byte param0) {
        int fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (fieldTemp$0 < 0) {
          int var2 = -29 / ((param0 - 71) / 47);
          this.c(false);
          return true;
        }
        if (25 != this.field_l) {
          return false;
        }
        this.e((byte) 100);
        return false;
    }

    final static Boolean b(boolean param0) {
        Boolean var1 = null;
        Boolean var1Lifetime1;
        if (!param0) {
          field_v = (kv) null;
          var1 = vg.field_l;
          vg.field_l = null;
          return var1;
        }
        var1Lifetime1 = vg.field_l;
        vg.field_l = null;
        return var1Lifetime1;
    }

    private final void e(byte param0) {
        iv var4 = null;
        ad var5 = null;
        int var6 = BachelorFridge.field_y;
        aga var2 = this.field_w.field_l.a(95, this.field_q.field_h);
        int var3 = 22 % ((param0 - 16) / 42);
        if (!var2.i(84)) {
          var4 = (iv) (this.field_w.field_o.b((byte) 90));
          al.a(-42, this.field_w.field_k);
          while (var4 != null) {
            var4.a(var2, this.field_q.field_h, 12);
            var5 = var4.field_h.a(-27449, this.field_q);
            var5.b(-1, 6);
            var5.a(24831, 44, kw.field_g);
            var4 = (iv) (this.field_w.field_o.c(0));
          }
          return;
        }
    }

    public static void d(int param0) {
        if (param0 != -1) {
          vr var2 = (vr) null;
          nma.a((vr) null, true, true, (vr) null);
          field_v = null;
          return;
        }
        field_v = null;
    }

    nma(gj param0, vha param1) {
        super(param0, param1);
        try {
          this.field_w = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "nma.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
