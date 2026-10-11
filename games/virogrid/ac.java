/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac {
    static p field_d;
    static ua field_c;
    static String field_a;
    static String field_b;
    static boolean field_e;

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        if (param0 >= -32) {
          return;
        }
        field_c = null;
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        km var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        cj var9 = null;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          if (ve.field_t > db.field_D) {
            db.field_D = db.field_D + 1;
          }
          if (p.field_h != ca.field_M.field_b) {
            vf.field_c = vf.field_c + (ca.field_M.field_b - p.field_h);
            p.field_h = ca.field_M.field_b;
          }
          if (0 >= db.field_D) {
            return;
          }
          ib.b(param1 - 39);
          we.field_c.a(param3, (byte) 125);
          if (null != fh.field_c) {
            if (wg.field_f) {
              fh.field_c.a(we.field_c.field_J, we.field_c.field_Bb, (byte) -128, param3);
            } else {
              fh.field_c = null;
            }
          }
          for (var4_int = 0; 5 > var4_int; var4_int++) {
            var5 = ln.field_i[var4_int];
            if (var5 != null) {
              if (var5.field_nb != 0) {
                kh.a(var5, var4_int, 20435);
              }
              var6 = id.a(var4_int, (byte) 119);
              og.field_g[var4_int].field_qb = j.field_k[var6];
              th.field_o[var4_int].field_V = hn.field_i[var6];
            }
          }
          if (~af.field_d.field_nb != param1) {
            km.field_yb = new bg(af.field_d.field_Bb, af.field_d.field_J, af.field_d.field_K, af.field_d.field_ub, param2, fn.field_e, wh.field_a, eb.field_b, ti.field_h, vd.field_Z, ma.field_e, (String) null, 0L);
          }
          var9 = da.a(param1 ^ 1402, param0, qi.field_d, pg.field_e);
          if (var9 != null) {
            jb.a(-44, var9);
          }
          var8 = id.a(3063);
          if (var8 == null) {
            return;
          }
          wc.field_g = var8;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var4), "ac.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_a = "Report abuse";
        field_e = false;
        field_b = "Detail: ";
    }
}
