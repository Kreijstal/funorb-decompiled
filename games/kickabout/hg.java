/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg extends i {
    static String field_H;
    static ut field_G;
    static int[] field_I;
    static String field_F;

    hg(int param0) {
        super(10);
        String var6 = Integer.toString(ps.field_d[param0]);
        String var2 = var6;
        String var3 = q.field_h[param0];
        String var4 = vo.$cfr$intArgs$a$53ce4ab4c593(-18, gd.field_e[10], new String[]{var6, var3});
        ut var5 = kb.field_E[param0];
        this.a(var4, this.field_t, var5, -110, this.field_u);
        this.a(ds.a(this.field_y, 1), pg.a(false, 10), 1054928844);
    }

    final static void a(int param0, byte param1) {
        int var3 = 0;
        hr var4 = null;
        dl var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Kickabout.field_G;
        try {
          var4 = (hr) (ti.field_c.g(24009));
          while (var4 != null) {
            rf.a(var4, param0, true);
            var4 = (hr) (ti.field_c.c(33));
          }
          if (param1 >= -120) {
            hg.h(96);
          }
          var5 = (dl) (ru.field_M.g(24009));
          while (var5 != null) {
            pf.a(param0, var5, (byte) -114);
            var5 = (dl) (ru.field_M.c(33));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2), "hg.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static int g(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Kickabout.field_G;
        try {
          wd.field_l.a(cq.field_n, 31947, iw.field_i, true);
          var1_int = -43 % ((param0 + 39) / 43);
          wd.field_l.n(2);
          while (nk.$cfr$intArgs$b$c4997cb15529(-59)) {
            wd.field_l.a(il.field_c, (byte) -88, cc.field_e);
          }
          if (kt.field_j != -1) {
            var2 = kt.field_j;
            qd.b(38, -1);
            stackIn_7_0 = var2;
            return stackIn_7_0;
          }
          if (wq.field_g) {
            stackIn_10_0 = 3;
            return stackIn_10_0;
          }
          if (mj.field_a == nr.field_f) {
            stackIn_14_0 = 1;
            return stackIn_14_0;
          }
          if (!lc.field_e.a((byte) -80)) {
            stackIn_18_0 = 1;
            return stackIn_18_0;
          }
          if (wk.field_f != nr.field_f) {
            stackIn_23_0 = -1;
            return stackIn_23_0;
          }
          stackIn_21_0 = 2;
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "hg.A(" + param0 + ')');
        }
    }

    public static void h(int param0) {
        if (param0 == 22100) {
          field_F = null;
          field_G = null;
          field_I = null;
          field_H = null;
          return;
        }
        field_I = (int[]) null;
        field_F = null;
        field_G = null;
        field_I = null;
        field_H = null;
    }

    static {
        field_I = new int[8192];
        field_F = "total: <%0> ";
        field_H = "Class: ";
        field_G = new ut(32, 64);
    }
}
