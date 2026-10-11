/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lc extends fe {
    private int field_S;
    static Random field_P;
    private ip field_N;
    static String field_Q;
    static vh field_U;
    static int field_V;
    static String field_T;
    static String field_R;
    static lr field_O;

    final static void a(boolean param0, String param1, int param2, int param3, long param4, int param5) {
        int var7_int = 0;
        try {
          ej.field_j.b(false, param3);
          ej.field_j.field_v = ej.field_j.field_v + 1;
          int var8 = 55 % ((param5 + 38) / 51);
          var7_int = ej.field_j.field_v;
          ej.field_j.a(param4, (byte) -79);
          ej.field_j.a(-9946, param1);
          ej.field_j.a(param2, false);
          ej.field_j.a(!param0 ? 0 : 1, false);
          ej.field_j.b(ej.field_j.field_v - var7_int, true);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "lc.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final String e(int param0) {
        if (this.field_s) {
          return this.field_N.a(98);
        }
        if (param0 <= -10) {
          return null;
        }
        return (String) null;
    }

    public static void g(byte param0) {
        field_P = null;
        field_Q = null;
        field_T = null;
        int var1 = -32 / ((29 - param0) / 48);
        field_U = null;
        field_O = null;
        field_R = null;
    }

    lc(ip param0) {
        try {
          this.field_N = param0;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "lc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(ei param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -87 % ((param1 + 43) / 47);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("lc.M(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(ei param0, int param1, int param2, int param3) {
        try {
          this.field_S = this.field_S + 1;
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "lc.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        na var9;
        int var10;
        int var11;
        int var12;
        dd var13;
        dd var14;
        dd var15;
        var12 = Pool.field_O;
        super.a(param0, (byte) -122, param2, param3);
        if (param0 != 0) {
          return;
        }
        var5 = (this.field_l >> 1) + (this.field_C + param2);
        var7 = 1 % ((-42 - param1) / 53);
        var6 = (this.field_y >> 1) + (param3 + this.field_D);
        var9 = this.field_N.c(-31873);
        if (ji.field_h != var9 &&
          no.field_k != var9) {
          if (var9 == gp.field_d) {
            var15 = bo.field_a[2];
            var15.c(-(var15.field_z >> 1) + var5, var6 - (var15.field_A >> 1), 256);
          } else if (var9 == kr.field_e) {
            var14 = bo.field_a[1];
            var14.c(-(var14.field_z >> 1) + var5, -(var14.field_A >> 1) + var6, 256);
          }
        } else {
          var13 = bo.field_a[0];
          var10 = var13.field_w << 1;
          var11 = var13.field_y << 1;
          if (null != sm.field_z &&
            sm.field_z.field_z >= var10 &&
            sm.field_z.field_A >= var11) {
            kj.a(104, sm.field_z);
            qh.d();
          } else {
            sm.field_z = new dd(var10, var11);
            kj.a(56, sm.field_z);
          }
          var13.b(112, 144, var13.field_w << 4, var13.field_y << 4, -this.field_S << 10, 4096);
          oc.a(112);
          sm.field_z.c(-var13.field_w + var5, var6 - var13.field_y, 256);
        }
    }

    final static int a(int param0, int param1, eh param2, oj param3) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var8 = 0;
        var8 = Pool.field_O;
        try {
          if (param2 != null &&
            param2.field_z != null &&
            param3 != null &&
            param2.field_A == param3.field_l) {
            var4_int = param3.field_z.length;
            var5 = param2.field_z[param0].length / var4_int;
            for (var6 = param1; var6 < var5; var6++) {
              boolean decompiledFrameCompleted0 = true;
              if (param3.field_w == param2.field_q[param0][var6] &&
                or.a((byte) 3, param2.field_m[param0][var6])) {
                for (var7 = 0; var7 < var4_int; var7++) {
                  if (param3.field_z[var7] != param2.field_z[param0][var7 + var6 * var4_int]) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
                if (decompiledFrameCompleted0) {
                  stackIn_18_0 = var6;
                  return stackIn_18_0;
                }
              }
            }
            stackIn_21_0 = -1;
            return stackIn_21_0;
          }
          stackIn_7_0 = -1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("lc.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    static {
        field_P = new Random();
        field_V = 20;
        field_Q = "Go Back";
        field_T = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_R = "Unpacking models";
    }
}
