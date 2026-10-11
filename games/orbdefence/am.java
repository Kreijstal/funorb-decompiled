/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am {
    static sl field_h;
    static hj[] field_d;
    static int field_e;
    static String field_g;
    static String field_c;
    static ki field_b;
    static long field_a;
    static String field_f;

    public static void a(byte param0) {
        field_g = null;
        field_b = null;
        field_h = null;
        if (param0 == 29) {
          field_f = null;
          field_c = null;
          field_d = null;
          return;
        }
        am.b(-56);
        field_f = null;
        field_c = null;
        field_d = null;
    }

    final static void a(int param0) {
        if (param0 != -4062) {
          am.a(-120);
          if (null == cd.field_w) {
            if (null == wf.field_b) {
              return;
            }
            wf.field_b.c();
            return;
          }
          cd.field_w.c();
          if (null != wf.field_b) {
            wf.field_b.c();
            return;
          }
          return;
        }
        if (null != cd.field_w) {
          cd.field_w.c();
          if (null == wf.field_b) {
            return;
          }
          wf.field_b.c();
          return;
        }
        if (null == wf.field_b) {
          return;
        }
        wf.field_b.c();
    }

    final static String b(int param0) {
        if (qc.field_g == mg.field_m) {
          return bh.field_e;
        }
        if (tg.field_c == mg.field_m) {
          return pg.field_a;
        }
        if (bd.field_u.a(false)) {
          int var1 = 8 % ((55 - param0) / 40);
          return vh.field_k;
        }
        return pg.field_a;
    }

    final static void a(int param0, int param1) {
        int var2_int = 0;
        ca var2 = null;
        ha var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          var2_int = 6 % ((param1 - 15) / 33);
          var3 = (ha) (oa.field_d.b((byte) -111));
          while (var3 != null) {
            tl.a(-128, var3, param0);
            var3 = (ha) (oa.field_d.d(853));
          }
          var2 = mj.field_m.b((byte) -123);
          while (var2 != null) {
            tg.a(-126, param0);
            var2 = mj.field_m.d(853);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2_ref), "am.C(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_g = "CHAIN SHOT";
        field_c = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_f = "This password is part of your Player Name, and would be easy to guess";
    }
}
