/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wm extends gn {
    private la field_R;
    static ul field_V;
    static String field_U;
    static String field_P;
    private int field_O;
    static int[] field_Q;
    static String field_S;
    int field_N;
    int field_M;
    static String field_T;

    public static void h(byte param0) {
        field_P = null;
        field_S = null;
        field_Q = null;
        if (param0 >= 5) {
          field_T = null;
          field_V = null;
          field_U = null;
          return;
        }
        field_T = (String) null;
        field_T = null;
        field_V = null;
        field_U = null;
    }

    final int a(byte param0) {
        int var2 = 111 / ((param0 + 8) / 48);
        return this.field_R.b(1);
    }

    final static ao[] b(boolean param0) {
        if (!param0) {
          wm.b(false);
          return new ao[]{hd.field_r, sf.field_d, so.field_o, km.field_W, mk.field_g, ae.field_h, bq.field_i, ka.field_b, mo.field_Lb, ha.field_i, cn.field_j, hd.field_w, oa.field_a, eb.field_w};
        }
        return new ao[]{hd.field_r, sf.field_d, so.field_o, km.field_W, mk.field_g, ae.field_h, bq.field_i, ka.field_b, mo.field_Lb, ha.field_i, cn.field_j, hd.field_w, oa.field_a, eb.field_w};
    }

    final int g(byte param0) {
        if (param0 != -106) {
          return -4;
        }
        return this.field_O;
    }

    final static ul a(int param0, int param1, boolean param2, boolean param3, int param4, boolean param5) {
        try {
          int var6_int = 0;
          IOException var6 = null;
          Object var7 = null;
          Object var8 = null;
          cn var9 = null;
          ul stackIn_12_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            var6_int = 122 % ((-63 - param4) / 63);
            var7 = null;
            if (p.field_a.field_i != null) {
              hc.field_b = new of(p.field_a.field_i, 5200, 0);
              p.field_a.field_i = null;
              var7 = new bq(255, hc.field_b, new of(p.field_a.field_k, 12000, 0), 2097152);
            }
            var8 = null;
            if (hc.field_b != null) {
              if (rl.field_r == null) {
                rl.field_r = new of[p.field_a.field_t.length];
              }
              if (rl.field_r[param0] == null) {
                rl.field_r[param0] = new of(p.field_a.field_t[param0], 12000, 0);
                p.field_a.field_t[param0] = null;
              }
              var8 = new bq(param0, hc.field_b, rl.field_r[param0], 2097152);
            }
            var9 = tj.field_a.a(param0, (bq) (var7), -15893, (bq) (var8), param3);
            if (param5) {
              var9.a(false);
            }
            stackIn_12_0 = new ul(var9, param2, param1);
            return stackIn_12_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (IOException) (Object) decompiledCaughtException;
            throw new RuntimeException(var6.toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int f(int param0) {
        if (param0 != 1) {
          wm.f(-92);
          return 1;
        }
        return 1;
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          if (param0 != -1) {
            wm.a(0, -46, true, false, 5, false);
          }
          ra.a(param1, -89, "");
          em.a(false, param1);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "wm.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private wm() throws Throwable {
        throw new Error();
    }

    final int a(int param0, boolean param1) {
        if (param0 < 0) {
          return -1;
        }
        if (param0 >= this.field_R.b(1)) {
          return -1;
        }
        if (!param1) {
          return this.field_R.a((byte) 105, param0);
        }
        this.field_M = -39;
        return this.field_R.a((byte) 105, param0);
    }

    final boolean a(int param0, int param1, int param2, cf param3, int param4, int param5, int param6) {
        int var12 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = -param5 + param1 - this.field_M;
          var9 = this.field_n - this.field_M * 2;
          if (var8_int > var9) {
            var8_int = var9;
          }
          if (var8_int < 0) {
            var8_int = 0;
          }
          var8_int = var8_int * this.field_O / var9;
          if (param2 == 1) {
            this.field_R.b((byte) -7, var8_int);
          } else {
            if (param2 == 2) {
              var10 = 2147483647;
              var11 = -1;
              for (var12 = 0; this.field_R.b(1) > var12; var12++) {
                var13 = this.field_R.a((byte) 105, var12) - var8_int;
                var13 = var13 * var13;
                if (var13 < var10) {
                  var10 = var13;
                  var11 = var12;
                }
              }
              if (var11 >= 0) {
                this.field_R.a(-102, var11);
              }
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_28_0 = var8;
          stackIn_28_1 = new StringBuilder().append("wm.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_U = "Select any zombie!";
        field_P = "Keep them away from the other portals.";
        field_S = "To Customer Support";
        field_Q = new int[10];
        field_T = "Invalid date";
    }
}
