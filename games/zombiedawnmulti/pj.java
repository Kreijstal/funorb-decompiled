/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj extends se implements co, in {
    private tf field_H;
    static long[] field_K;
    private sq field_L;
    static ta field_I;
    private gn field_G;
    static String field_J;

    private final String a(int param0) {
        if (param0 < 92) {
          return (String) null;
        }
        return "</col></u>";
    }

    public final void a(int param0, sq param1, int param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param3 == 0) {
            ge.a("terms.ws", (byte) 125);
          } else {
            if (param3 == 1) {
              ge.a("privacy.ws", (byte) 125);
            } else {
              if (2 == param3) {
                ge.a("conduct.ws", (byte) 125);
              }
            }
          }
          if (param2 <= -16) {
            return;
          }
          field_K = (long[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("pj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    pj(tf param0) {
        super(0, 0, 288, 0, (nl) null);
        String var7 = null;
        int var3 = 0;
        hq var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          this.field_H = param0;
          this.field_G = new gn(ub.field_xb, (bj) null);
          this.field_G.field_h = (nl) ((Object) new oq());
          var7 = vl.a(ng.field_a, new String[]{this.h(-1), this.a(111)}, 2);
          var3 = 20;
          var4 = new hq(ke.field_h, 0, 0, 0, 0, 16777215, -1, 3, 0, ke.field_h.field_C, -1, 2147483647, true);
          this.field_L = new sq(var7, var4);
          this.field_L.field_x = "";
          this.field_L.a(0, (byte) -107, mp.field_d);
          this.field_L.a(1, (byte) -115, mp.field_d);
          this.field_L.field_A = (bj) (this);
          this.field_L.field_n = -40 + this.field_n;
          this.field_L.a(this.field_n - 40, var3, (byte) -4, 26);
          var3 = var3 + (this.field_L.field_w + 15);
          this.b((byte) 108, this.field_L);
          var5 = 4;
          var6 = 200;
          this.field_G.b(300 - var6 >> 1, var3, 28972, var6, 40);
          this.field_G.field_A = (bj) (this);
          this.b((byte) 59, this.field_G);
          this.b(0, 0, 28972, 300, var5 + (var3 + 55));
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "pj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(boolean param0) {
        field_K = null;
        field_I = null;
        if (!param0) {
          field_K = (long[]) null;
          field_J = null;
          return;
        }
        field_J = null;
    }

    private final String h(int param0) {
        if (param0 != -1) {
          cf var3 = (cf) null;
          this.a(-29, '.', (cf) null, 60);
          return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    final static ef a(ul param0, int param1, ul param2, String param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        ef stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param0.a(param4, (byte) 105);
          if (param1 != 4) {
            field_I = (ta) null;
          }
          var6 = param0.a(param3, var5_int, param1 - 5);
          stackIn_3_0 = er.a(param2, var5_int, 0, var6, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("pj.R(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final boolean a(int param0, char param1, cf param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param0 == 98) {
            stackIn_6_0 = this.a((byte) -1, param2);
            return stackIn_6_0;
          }
          if (param0 != 99) {
            return false;
          }
          stackIn_9_0 = this.a(24, param2);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("pj.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(int param0, int param1, gn param2, int param3, int param4) {
        RuntimeException var6 = null;
        gn var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == this.field_G) {
            va.a((byte) 62);
            this.field_H.m(-7435);
          }
          if (param3 < -83) {
            return;
          }
          var7 = (gn) null;
          this.a(82, -128, (gn) null, -108, 33);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("pj.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        hn[] var11 = null;
        hn[] var7 = null;
        int var8 = 0;
        int var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var11 = new hn[ia.field_x.length + 1];
          var7 = var11;
          int var9 = 83 / ((50 - param5) / 57);
          for (var8 = 0; ia.field_x.length > var8; var8++) {
            var11[var8] = ia.field_x[var8];
          }
          var7[-1 + var7.length] = new hn(param3, param4, param1, param6, param0, param2);
          ia.field_x = var7;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "pj.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_K = new long[32];
        field_J = "Ready... ";
    }
}
