/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class se extends ak {
    static tg field_A;
    static String field_F;
    static String field_B;
    static String[] field_E;
    static int field_C;

    private se(int param0, int param1, int param2, int param3, fc param4, sk param5, lk param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            ((se) this).field_x = param6;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "se.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 44 + (param6 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1, lk param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        bj var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3, (int) (char)param4, param5);
              var7 = nd.field_A;
              if (var7 == null) {
                break L1;
              } else {
                if (((se) this).c(param5, param4 ^ 34, param3, param1, param0)) {
                  if (!(((se) this).field_n instanceof df)) {
                    if (var7.field_n instanceof df) {
                      ((df) (Object) var7.field_n).a(var7, (byte) 90, (se) this);
                      nd.field_A = null;
                      break L1;
                    } else {
                      return;
                    }
                  } else {
                    ((df) (Object) ((se) this).field_n).a(var7, (byte) -56, (se) this);
                    nd.field_A = null;
                    return;
                  }
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("se.MA(").append(param0).append(44).append(param1).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    public static void a() {
        field_B = null;
        field_F = null;
        field_E = null;
        field_A = null;
    }

    final static String a(int param0, long param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        lj.field_c.setTime(new Date(param1));
        var3 = lj.field_c.get(7);
        var4 = lj.field_c.get(5);
        if (param0 > -79) {
          field_F = null;
          var5 = lj.field_c.get(2);
          var6 = lj.field_c.get(1);
          var7 = lj.field_c.get(11);
          var8 = lj.field_c.get(12);
          var9 = lj.field_c.get(13);
          return ll.field_A[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + vk.field_d[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        } else {
          var5 = lj.field_c.get(2);
          var6 = lj.field_c.get(1);
          var7 = lj.field_c.get(11);
          var8 = lj.field_c.get(12);
          var9 = lj.field_c.get(13);
          return ll.field_A[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + vk.field_d[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "Waiting for extra data";
        field_B = "If you do nothing the game will revert to normal view in <%0> seconds.";
    }
}
