/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd extends jm {
    static int[] field_p;
    private ll[] field_r;
    static String field_q;
    static String field_s;

    final static void d(int param0) {
        mn.e(98);
        if (param0 != 16777215) {
            field_q = null;
        }
    }

    final static java.applet.Applet e(int param0) {
        if (param0 <= 102) {
            return null;
        }
        if (bd.field_c != null) {
            return bd.field_c;
        }
        return (java.applet.Applet) (Object) ug.field_k;
    }

    public final void a(qm param0, int param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ll var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            L1: {
              de.a(param0.field_n + param2, param0.field_j + param3, param0.field_v, param0.field_k, 10197915);
              if (param4) {
                if (((ag) (Object) param0).field_z) {
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
                if (param0.d(-2116)) {
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
              if (var6_int == 0) {
                stackOut_14_0 = 16777215;
                stackIn_15_0 = stackOut_14_0;
                break L3;
              } else {
                stackOut_13_0 = 2394342;
                stackIn_15_0 = stackOut_13_0;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_15_0;
              if (var7 != 0) {
                var8 = var8 | 2;
                break L4;
              } else {
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
            var10 = ((cd) this).field_r[var8];
            var11 = (param0.field_v + -var10.field_h) / 2 + (param2 - -param0.field_n);
            var12 = param0.field_j + param3 - -((-var10.field_c + param0.field_k) / 2);
            var13 = param0.field_v / 2 + param0.field_n + param2;
            var10.a(var11, var12);
            ((cd) this).field_g.b(((cd) this).a(false, param0), var13, param3, var9, -1);
            if (param1 == 5592405) {
              break L0;
            } else {
              var14 = null;
              ((cd) this).a((qm) null, 3, -30, -126, true);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var6;
            stackOut_23_1 = new StringBuilder().append("cd.A(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L6;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public static void a(byte param0) {
        field_q = null;
        field_p = null;
        field_s = null;
    }

    cd(ll[] param0) {
        try {
            ((cd) this).field_g = ia.field_c;
            ((cd) this).field_r = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "cd.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new int[]{61, 62, 63};
        field_q = "You appear to be telling someone your password - please don't!";
        field_s = "Please try changing the following settings:  ";
    }
}
