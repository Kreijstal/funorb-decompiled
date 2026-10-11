/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd {
    static tf field_a;
    static int field_c;
    static java.applet.Applet field_b;

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 == 70) {
          return;
        }
        bd.a((byte) -62, false, -83, 24);
    }

    final static void a(byte param0, boolean param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        ak var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        aa var9 = null;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          if (qo.field_o != qa.field_f.field_i) {
            wa.field_i = wa.field_i + (qa.field_f.field_i - qo.field_o);
            qo.field_o = qa.field_f.field_i;
          }
          if (param0 > -50) {
            return;
          }
          if (oh.field_b < qh.field_c) {
            oh.field_b = oh.field_b + 1;
          }
          if (oh.field_b <= 0) {
            return;
          }
          r.b(-96);
          ui.field_i.a(-28476, param1);
          if (td.field_b != null) {
            if (!ln.field_q) {
              td.field_b = null;
            } else {
              td.field_b.a(ui.field_i.field_gb, param1, (byte) 99, ui.field_i.field_tb);
            }
          }
          for (var4_int = 0; 5 > var4_int; var4_int++) {
            var5 = fm.field_f[var4_int];
            if (var5 != null) {
              if (var5.field_P != 0) {
                cg.a((byte) -13, var5, var4_int);
              }
              var6 = kl.a(var4_int, 0);
              fm.field_h[var4_int].field_H = h.field_V[var6];
              hk.field_e[var4_int].field_cb = rg.field_a[var6];
            }
          }
          if (0 != gh.field_u.field_P) {
            hc.field_M = new oe(gh.field_u.field_tb, gh.field_u.field_gb, gh.field_u.field_K, gh.field_u.field_nb, param3, cm.field_o, pj.field_i, ae.field_f, mg.field_h, um.field_q, dn.field_c, (String) null, 0L);
          }
          var9 = ah.a((byte) -110, fq.field_q, param2, v.field_c);
          if (var9 != null) {
            fj.a(var9, (byte) 125);
          }
          var8 = pk.a((byte) 88);
          if (var8 == null) {
            return;
          }
          up.field_o = var8;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var4), "bd.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean a(boolean param0) {
        if (!param0) {
          field_a = (tf) null;
          if (hf.field_q < 20) {
            return true;
          }
          if (!re.a(106)) {
            return true;
          }
          if (ra.field_g <= 0) {
            return false;
          }
          if (!ri.a(-81)) {
            return true;
          }
          return false;
        }
        if (hf.field_q < 20) {
          return true;
        }
        if (!re.a(106)) {
          return true;
        }
        if (ra.field_g <= 0) {
          return false;
        }
        if (!ri.a(-81)) {
          return true;
        }
        return false;
    }

    final boolean b(int param0) {
        if (param0 != -21) {
          return true;
        }
        if (kk.field_b == this) {
          return true;
        }
        if (e.field_d == this) {
          return true;
        }
        if (Pixelate.field_G != this) {
          return false;
        }
        return true;
    }

    final static void a(byte param0) {
        lm var1 = null;
        int var2 = Pixelate.field_H ? 1 : 0;
        lm var1Lifetime1;
        try {
          aj.field_t = 0;
          f.field_q = 0;
          qp.field_L = null;
          if (param0 != -1) {
            field_c = 75;
          }
          vp.field_Hb.e(param0 - 110);
          bq.field_b.e(-127);
          var1 = vm.field_b.a(-89);
          while (var1 != null) {
            var1.e(17);
            var1 = vm.field_b.a((byte) 50);
          }
          var1Lifetime1 = hq.field_q.a(-84);
          while (var1Lifetime1 != null) {
            var1Lifetime1.e(17);
            var1Lifetime1 = hq.field_q.a((byte) 50);
          }
          gk.field_db = 0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "bd.A(" + param0 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_a = new tf(270, 70);
    }
}
