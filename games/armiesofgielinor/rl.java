/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl extends oj {
    static gk field_C;
    static int field_A;
    private int field_B;
    static je[] field_z;
    static String field_y;

    final boolean a(at param0, byte param1, ic param2) {
        RuntimeException var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -84) {
                break L1;
              } else {
                field_y = null;
                break L1;
              }
            }
            stackOut_2_0 = ((rl) this).a((byte) -39, param2, param0, true);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("rl.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        jd var8 = null;
        jd var9 = null;
        int stackIn_3_0 = 0;
        wk stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int[][] stackIn_12_3 = null;
        wk stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int[][] stackIn_13_3 = null;
        wk stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int[][] stackIn_14_3 = null;
        int stackIn_14_4 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        wk stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int[][] stackOut_11_3 = null;
        wk stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int[][] stackOut_13_3 = null;
        int stackOut_13_4 = 0;
        wk stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int[][] stackOut_12_3 = null;
        int stackOut_12_4 = 0;
        L0: {
          var8 = vs.field_e[param1].field_c;
          var9 = var8;
          if (var9 == null) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var6 = stackIn_3_0;
        if (var6 != 0) {
          L1: {
            var7 = jf.field_C.field_q;
            if (var7 >= 0) {
              break L1;
            } else {
              var7 = bv.field_w.field_gb;
              break L1;
            }
          }
          if (!var9.field_u) {
            if (null != var9.field_x) {
              L2: {
                stackOut_11_0 = go.field_g;
                stackOut_11_1 = param2 - -10;
                stackOut_11_2 = 5 + param4;
                stackOut_11_3 = op.field_c;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_13_2 = stackOut_11_2;
                stackIn_13_3 = stackOut_11_3;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                stackIn_12_2 = stackOut_11_2;
                stackIn_12_3 = stackOut_11_3;
                if (bv.field_w.field_wb) {
                  stackOut_13_0 = (wk) (Object) stackIn_13_0;
                  stackOut_13_1 = stackIn_13_1;
                  stackOut_13_2 = stackIn_13_2;
                  stackOut_13_3 = (int[][]) (Object) stackIn_13_3;
                  stackOut_13_4 = 1;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  stackIn_14_3 = stackOut_13_3;
                  stackIn_14_4 = stackOut_13_4;
                  break L2;
                } else {
                  stackOut_12_0 = (wk) (Object) stackIn_12_0;
                  stackOut_12_1 = stackIn_12_1;
                  stackOut_12_2 = stackIn_12_2;
                  stackOut_12_3 = (int[][]) (Object) stackIn_12_3;
                  stackOut_12_4 = 0;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  stackIn_14_3 = stackOut_12_3;
                  stackIn_14_4 = stackOut_12_4;
                  break L2;
                }
              }
              ((wk) (Object) stackIn_14_0).b(stackIn_14_1, stackIn_14_2, stackIn_14_3[stackIn_14_4][var8.field_O]);
              if (jf.field_C.field_T != var9) {
                if (jf.field_C.field_oc != var9) {
                  var9.field_x.a((byte) -72, false);
                  return;
                } else {
                  go.field_g.f(10 + param2, param4 - -5, (int)(Math.sin((double)ug.field_b / 3.141592653589793) * 64.0) + 128);
                  var9.field_x.a((byte) -72, false);
                  return;
                }
              } else {
                go.field_g.f(10 + param2, param4 - -5, (int)(Math.sin((double)ug.field_b / 3.141592653589793) * 64.0) + 128);
                var9.field_x.a((byte) -72, false);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(ha param0, int param1) {
        try {
            if (param1 != -26661) {
                String discarded$0 = ((rl) this).a((byte) -70, false);
            }
            param0.field_Bb = true;
            fl.a(param0, -117);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "rl.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String a(byte param0, boolean param1) {
        if (!(!param1)) {
            System.out.println("KBD summon event debug");
            System.out.println("Player " + ((rl) this).field_B + " summonned KBD");
        }
        int var4 = 71 % ((53 - param0) / 51);
        String var3 = "EventKBD: player: " + ((rl) this).field_B;
        return var3;
    }

    public static void g() {
        field_C = null;
        field_y = null;
        field_z = null;
    }

    rl(int param0) {
        ((rl) this).field_B = param0;
        ((rl) this).field_m = -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = 0;
        field_y = "You appear to be telling someone your password - please don't!";
    }
}
