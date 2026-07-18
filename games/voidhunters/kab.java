/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kab extends bob {
    static String field_p;
    private caa[] field_q;

    public final void a(int param0, shb param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        caa var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              dma.b(param2 - -param1.field_g, param1.field_r + param3, param1.field_h, param1.field_f, 10197915);
              if (param4) {
                if (((htb) (Object) param1).field_u) {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                } else {
                  stackOut_3_0 = 0;
                  stackIn_6_0 = stackOut_3_0;
                  break L1;
                }
              } else {
                stackOut_1_0 = 0;
                stackIn_6_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var6_int = stackIn_6_0;
              if (param4) {
                if (param1.e((byte) -120)) {
                  stackOut_10_0 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  break L2;
                } else {
                  stackOut_9_0 = 0;
                  stackIn_12_0 = stackOut_9_0;
                  break L2;
                }
              } else {
                stackOut_7_0 = 0;
                stackIn_12_0 = stackOut_7_0;
                break L2;
              }
            }
            L3: {
              var7 = stackIn_12_0;
              var8 = 0;
              if (var6_int != 0) {
                stackOut_14_0 = 2394342;
                stackIn_15_0 = stackOut_14_0;
                break L3;
              } else {
                stackOut_13_0 = 16777215;
                stackIn_15_0 = stackOut_13_0;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_15_0;
              if (var7 == 0) {
                break L4;
              } else {
                var8 = var8 | 2;
                break L4;
              }
            }
            L5: {
              if (var6_int == 0) {
                break L5;
              } else {
                var8 = var8 | 1;
                break L5;
              }
            }
            var10 = ((kab) this).field_q[var8];
            var12 = -89 % ((-27 - param0) / 35);
            var11 = param2 - (-param1.field_g - (-var10.field_h + param1.field_h) / 2);
            var13 = param3 + (param1.field_r + (-var10.field_e + param1.field_f) / 2);
            var14 = param1.field_g + param2 + param1.field_h / 2;
            var10.a(var11, var13);
            ((kab) this).field_d.a(((kab) this).b((byte) -82, param1), var14, param3, var9, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6;
            stackOut_21_1 = new StringBuilder().append("kab.A(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    kab(caa[] param0) {
        try {
            ((kab) this).field_d = loa.field_o;
            ((kab) this).field_q = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "kab.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(int param0) {
        field_p = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Hull beam";
    }
}
