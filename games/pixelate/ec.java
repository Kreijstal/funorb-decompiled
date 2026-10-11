/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec extends mg {
    static String field_n;
    private boolean field_s;
    static int field_t;
    static String field_m;
    static int field_r;
    static java.awt.Canvas field_u;
    static tf field_q;
    private String field_p;
    static String field_o;

    final String a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        id var4 = null;
        CharSequence var5 = null;
        String stackIn_3_0 = null;
        String stackIn_15_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (CharSequence) ((Object) param1);
          var3 = sn.a(var5, 0);
          if (var3 != null) {
            stackIn_3_0 = var3;
            return stackIn_3_0;
          }
          if (param0 > -76) {
            ec.a(true, 49, -104);
          }
          if (!param1.equals(this.field_p)) {
            var4 = ig.a(200, param1);
            if (var4 == null) {
              return null;
            }
            if (var4.field_c != null) {
              return null;
            }
            this.field_p = param1;
            this.field_s = var4.field_g;
          }
          if (this.field_s) {
            stackIn_17_0 = vi.field_L;
            return stackIn_17_0;
          }
          stackIn_15_0 = ek.field_e;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("ec.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void f(int param0) {
        this.field_p = null;
        int var2 = -118 / ((param0 + 56) / 56);
    }

    ec(c param0) {
        super(param0);
        this.field_s = false;
    }

    final static int a(boolean param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_12_0 = false;
        int stackIn_12_1 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          var3_int = 0;
          var4 = ce.field_c;
          while (var3_int < pl.field_J.length) {
            var5 = uf.field_e[var3_int];
            if (var5 >= 0) {
              var6 = jp.a(pl.field_J[var3_int], 8192, true);
              var4 = var4 + ki.field_e;
              var7 = bq.field_d - (var6 >> 1);
              if (mn.a(param1, var4, 59, (lf.field_b << 1) + dk.field_d, -uf.field_a + var7, param2, (uf.field_a << 1) + var6)) {
                stackIn_7_0 = var5;
                return stackIn_7_0;
              }
              var4 = var4 + ((lf.field_b << 1) + ki.field_e + dk.field_d);
            } else {
              var4 = var4 + da.field_m;
            }
            var3_int++;
          }
          if (param0) {
            stackIn_12_0 = true;
            stackIn_12_1 = 50;
            ec.a(stackIn_12_0, stackIn_12_1, 69);
          }
          stackIn_14_0 = -1;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "ec.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(boolean param0, fm param1) {
        tf var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
          var2 = new tf(param1.a((byte) 24, "", "final_frame.jpg"), (java.awt.Component) ((Object) field_u));
          var3 = var2.field_F;
          var4 = var2.field_E;
          ti.a(param0);
          th.field_b = new tf(var3, 3 * var4 / 4);
          th.field_b.c();
          var2.f(0, 0);
          in.field_s = new tf(var3, var4 - th.field_b.field_E);
          in.field_s.c();
          var2.f(0, -th.field_b.field_E);
          in.field_s.field_y = th.field_b.field_E;
          ia.a((byte) 92);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ec.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(int param0) {
        if (param0 != 0) {
          return;
        }
        field_q = null;
        field_n = null;
        field_u = null;
        field_m = null;
        field_o = null;
    }

    final dj a(String param0, boolean param1) {
        id var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        dj stackIn_2_0 = null;
        dj stackIn_5_0 = null;
        dj stackIn_12_0 = null;
        dj stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param0);
          if (!fm.a((byte) 63, var4)) {
            stackIn_2_0 = sk.field_a;
            return stackIn_2_0;
          }
          if (!param1) {
            stackIn_5_0 = (dj) null;
            return stackIn_5_0;
          }
          if (!param0.equals(this.field_p)) {
            var3 = ig.a(200, param0);
            if (var3 != null &&
              null == var3.field_c) {
              this.field_p = param0;
              this.field_s = var3.field_g;
            } else {
              stackIn_12_0 = tg.field_j;
              return stackIn_12_0;
            }
          }
          if (this.field_s) {
            stackIn_17_0 = qk.field_g;
          } else {
            stackIn_17_0 = sk.field_a;
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("ec.D(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_m = "Checking";
        field_n = "Hide game chat";
        field_o = "Close";
    }
}
