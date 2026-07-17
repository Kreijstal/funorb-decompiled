/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class fl implements ad {
    private int field_i;
    private int field_m;
    static bj field_f;
    private we field_k;
    static int field_c;
    static boolean field_d;
    private int field_g;
    private int field_e;
    static String[] field_b;
    static String field_h;
    static ln[] field_j;
    private int field_a;
    private int field_l;

    public final void a(int param0, int param1, fe param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ne var12 = null;
        fe stackIn_4_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        fe stackOut_3_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var11 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (param2 instanceof ne) {
                stackOut_3_0 = (fe) param2;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = null;
                stackIn_4_0 = (fe) (Object) stackOut_2_0;
                break L1;
              }
            }
            var12 = (ne) (Object) stackIn_4_0;
            eh.e(param1 + param2.field_u, param3 + param2.field_t, param2.field_v, param2.field_q, ((fl) this).field_l);
            if (param0 == 12088) {
              L2: {
                if (var12 != null) {
                  break L2;
                } else {
                  break L2;
                }
              }
              var7 = -(var12.field_J * 2) + param2.field_v;
              var8 = param1 + (param2.field_u + var12.field_J);
              var9 = var12.field_P + (param2.field_t + param3);
              eh.d(var8, var9, var8 + var7, var9, ((fl) this).field_m);
              var10 = var12.m(22302) - 1;
              L3: while (true) {
                if (var10 < 0) {
                  L4: {
                    if (((fl) this).field_k != null) {
                      ((fl) this).field_k.b(var12.field_s, var7 / 2 + var8, var12.field_P + (((fl) this).field_k.field_G + var9), ((fl) this).field_e, ((fl) this).field_g);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  break L0;
                } else {
                  eh.c(var7 * var12.a(var10, true) / var12.a((byte) -84) + var8, var9, ((fl) this).field_a, ((fl) this).field_i);
                  var10--;
                  continue L3;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var6;
            stackOut_14_1 = new StringBuilder().append("fl.B(").append(param0).append(44).append(param1).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_j = null;
        field_h = null;
        field_b = null;
    }

    final static void a(byte param0) {
        int var1 = -104 % ((param0 - -15) / 41);
        Object var2 = null;
        ed.a((String) null, "", -1);
    }

    final static String a(byte param0, CharSequence param1, boolean param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_9_0 = null;
        Object stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_11_0 = null;
        String stackOut_8_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = MinerDisturbance.field_ab;
        try {
          L0: {
            var3 = qh.a(false, param1, false);
            if (var3 == null) {
              var4 = 0;
              L1: while (true) {
                if (var4 >= param1.length()) {
                  var4 = -56 % ((param0 - -37) / 55);
                  stackOut_11_0 = null;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  if (!rb.a((byte) 121, param1.charAt(var4))) {
                    stackOut_8_0 = ti.field_K;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = (String) var3;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("fl.C(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + 0 + 41);
        }
        return (String) (Object) stackIn_12_0;
    }

    fl(we param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            ((fl) this).field_a = param5;
            ((fl) this).field_i = param6;
            ((fl) this).field_g = param2;
            ((fl) this).field_m = param3;
            ((fl) this).field_l = param4;
            ((fl) this).field_k = param0;
            ((fl) this).field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "fl.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = false;
        field_h = "<%0> <times> 750 = <%1>";
        field_b = new String[255];
    }
}
