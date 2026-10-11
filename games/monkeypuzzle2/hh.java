/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh extends wj {
    static int[] field_r;
    static String field_p;
    private String field_q;
    private boolean field_s;
    static gb[] field_n;
    static gg field_u;
    static String field_t;
    static volatile boolean field_o;

    final static void f(int param0) {
        ub.field_a = lc.field_f;
        lc.field_f = false;
        sl.b(true);
        oa.j(-118);
        oi.c(106);
        if (param0 == 8500) {
          eb.m(param0 - 8377);
          return;
        }
        hh.c(true);
        eb.m(param0 - 8377);
    }

    final na a(String param0, int param1) {
        cj var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        na stackIn_2_0 = null;
        na stackIn_10_0 = null;
        na stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param0);
          if (!q.a(var4, false)) {
            stackIn_2_0 = ol.field_h;
            return stackIn_2_0;
          }
          if (param1 != 3917) {
            hh.f(-23);
          }
          if (!param0.equals(this.field_q)) {
            var3 = we.b(param0, -84);
            if (var3 != null &&
              null == var3.field_h) {
              this.field_q = param0;
              this.field_s = var3.field_b;
            } else {
              stackIn_10_0 = f.field_g;
              return stackIn_10_0;
            }
          }
          if (this.field_s) {
            stackIn_15_0 = wj.field_i;
          } else {
            stackIn_15_0 = ol.field_h;
          }
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("hh.B(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    hh(rj param0) {
        super(param0);
        this.field_s = false;
    }

    final static int a(byte param0, String param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -38 / ((param0 + 45) / 58);
          if (!param2) {
            stackIn_4_0 = fe.field_a.a(param1);
            return stackIn_4_0;
          }
          stackIn_2_0 = sl.field_o.a(param1);
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("hh.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void e(int param0) {
        field_u = null;
        field_n = null;
        field_p = null;
        field_t = null;
        field_r = null;
        if (param0 != -17202) {
          hh.c(true);
        }
    }

    final void f(byte param0) {
        this.field_q = null;
        if (param0 > -51) {
          field_p = (String) null;
        }
    }

    final String a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        cj var4 = null;
        String var5 = null;
        CharSequence var6 = null;
        String stackIn_3_0 = null;
        Object stackIn_9_0 = null;
        String stackIn_15_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = (CharSequence) ((Object) param1);
          var3 = pi.a((byte) 122, var6);
          if (var3 != null) {
            stackIn_3_0 = var3;
            return stackIn_3_0;
          }
          if (!param1.equals(this.field_q)) {
            var4 = we.b(param1, -75);
            if (var4 == null) {
              return null;
            }
            if (var4.field_h != null) {
              stackIn_9_0 = null;
              return (String) (stackIn_9_0);
            }
            this.field_s = var4.field_b;
            this.field_q = param1;
          }
          if (param0 != 1) {
            var5 = (String) null;
            hh.$cfr$intArgs$a$590e95718a07(87, (String) null, false);
          }
          if (this.field_s) {
            stackIn_17_0 = ub.field_c;
            return stackIn_17_0;
          }
          stackIn_15_0 = me.field_l;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("hh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static void c(boolean param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        hb var5 = null;
        int var6 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var11 = null;
        vl var12 = null;
        hb var13 = null;
        k var14 = null;
        int[] var15 = null;
        Object var16 = null;
        k var16_ref = null;
        int[] var17 = null;
        var16 = null;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var13 = MonkeyPuzzle2.field_D;
          var2 = var13.a((byte) 114);
          if (!param0) {
            return;
          }
          if (0 == var2) {
            var11 = cj.a((byte) 108);
            var17 = var11;
            var15 = var17;
            var3 = var15;
            var10 = var11;
            var4 = var10;
            var5 = var13;
            var6 = ((gk) ((Object) var5)).a((byte) 114);
            for (var7 = 0; var6 > var7; var7++) {
              var10[var7] = ((gk) ((Object) var5)).e(-127);
            }
            var16_ref = (k) (cj.field_a.a((byte) -117));
            if (var16_ref == null) {
              gk.a(-1);
              return;
            }
            var16_ref.field_e = var17[0];
            var16_ref.field_h = var3;
            var16_ref.field_j = true;
            var16_ref.c(-19822);
            return;
          }
          if (var2 == 1) {
            var12 = (vl) (ob.field_s.a((byte) -117));
            if (var12 == null) {
              gk.a(-1);
              return;
            }
            var12.c(-19822);
            return;
          }
          if (var2 != 2) {
            kk.a("A1: " + bh.a((byte) -31), (byte) 101, (Throwable) null);
            gk.a(-1);
            return;
          }
          var14 = (k) (cj.field_a.a((byte) -117));
          if (var14 == null) {
            gk.a(-1);
            return;
          }
          var14.field_h = cj.a((byte) 120);
          var14.field_e = var14.field_h[0];
          var14.field_j = true;
          var14.c(-19822);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "hh.F(" + param0 + ')');
        }
    }

    static {
        field_p = "Error connecting to server. Please try using a different server.";
        field_r = new int[20];
        field_t = "Achievements";
        field_o = true;
        field_n = new gb[32];
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static int $cfr$intArgs$a$590e95718a07(int param0, String param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -38 / ((param0 + 45) / 58);
          if (!param2) {
            stackIn_4_0 = fe.field_a.a(param1);
            return stackIn_4_0;
          }
          stackIn_2_0 = sl.field_o.a(param1);
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("hh.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }
}
