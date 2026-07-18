/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wt extends dr {
    static boolean field_G;
    static String field_E;
    static String field_F;

    wt(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nd a(int param0, nd[] param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        nd stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nd stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -24872) {
                break L1;
              } else {
                var4 = null;
                nd discarded$2 = ((wt) this).a(-63, (nd[]) null);
                break L1;
              }
            }
            stackOut_2_0 = new nd((Object) (Object) te.b(128, param1[0].a(2)));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("wt.C(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw ig.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void e(byte param0) {
        field_E = null;
        field_F = null;
    }

    final static boolean a(CharSequence param0, byte param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            if (!wn.a(param0, 1, false)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var4 = 0;
              L1: while (true) {
                if (var4 >= param0.length()) {
                  stackOut_12_0 = 1;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  if (!wg.a(param0.charAt(var4), -3904)) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0 != 0;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("wt.D(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + 65 + ',' + false + ')');
        }
        return stackIn_13_0 != 0;
    }

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        int stackIn_10_4 = 0;
        int stackIn_10_5 = 0;
        int stackIn_10_6 = 0;
        int stackIn_10_7 = 0;
        int stackIn_10_8 = 0;
        int stackIn_10_9 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        int stackIn_11_4 = 0;
        int stackIn_11_5 = 0;
        int stackIn_11_6 = 0;
        int stackIn_11_7 = 0;
        int stackIn_11_8 = 0;
        int stackIn_11_9 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        int stackIn_12_4 = 0;
        int stackIn_12_5 = 0;
        int stackIn_12_6 = 0;
        int stackIn_12_7 = 0;
        int stackIn_12_8 = 0;
        int stackIn_12_9 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        int stackIn_13_4 = 0;
        int stackIn_13_5 = 0;
        int stackIn_13_6 = 0;
        int stackIn_13_7 = 0;
        int stackIn_13_8 = 0;
        int stackIn_13_9 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        int stackIn_14_4 = 0;
        int stackIn_14_5 = 0;
        int stackIn_14_6 = 0;
        int stackIn_14_7 = 0;
        int stackIn_14_8 = 0;
        int stackIn_14_9 = 0;
        int stackIn_14_10 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        int stackOut_9_4 = 0;
        int stackOut_9_5 = 0;
        int stackOut_9_6 = 0;
        int stackOut_9_7 = 0;
        int stackOut_9_8 = 0;
        int stackOut_9_9 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        int stackOut_10_4 = 0;
        int stackOut_10_5 = 0;
        int stackOut_10_6 = 0;
        int stackOut_10_7 = 0;
        int stackOut_10_8 = 0;
        int stackOut_10_9 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        int stackOut_13_4 = 0;
        int stackOut_13_5 = 0;
        int stackOut_13_6 = 0;
        int stackOut_13_7 = 0;
        int stackOut_13_8 = 0;
        int stackOut_13_9 = 0;
        int stackOut_13_10 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        int stackOut_11_4 = 0;
        int stackOut_11_5 = 0;
        int stackOut_11_6 = 0;
        int stackOut_11_7 = 0;
        int stackOut_11_8 = 0;
        int stackOut_11_9 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        int stackOut_12_4 = 0;
        int stackOut_12_5 = 0;
        int stackOut_12_6 = 0;
        int stackOut_12_7 = 0;
        int stackOut_12_8 = 0;
        int stackOut_12_9 = 0;
        int stackOut_12_10 = 0;
        L0: {
          ad.a(-117);
          if (vu.field_M != null) {
            if (r.c(vu.field_M.field_Ub, 2)) {
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_6_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 0;
            stackIn_6_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_6_0;
          stackOut_6_0 = 1;
          stackOut_6_1 = 65524;
          stackOut_6_2 = 15;
          stackIn_8_0 = stackOut_6_0;
          stackIn_8_1 = stackOut_6_1;
          stackIn_8_2 = stackOut_6_2;
          stackIn_7_0 = stackOut_6_0;
          stackIn_7_1 = stackOut_6_1;
          stackIn_7_2 = stackOut_6_2;
          if (50 >= r.field_u) {
            stackOut_8_0 = stackIn_8_0;
            stackOut_8_1 = stackIn_8_1;
            stackOut_8_2 = stackIn_8_2;
            stackOut_8_3 = 0;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            stackIn_9_2 = stackOut_8_2;
            stackIn_9_3 = stackOut_8_3;
            break L1;
          } else {
            stackOut_7_0 = stackIn_7_0;
            stackOut_7_1 = stackIn_7_1;
            stackOut_7_2 = stackIn_7_2;
            stackOut_7_3 = 1;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_9_2 = stackOut_7_2;
            stackIn_9_3 = stackOut_7_3;
            break L1;
          }
        }
        L2: {
          L3: {
            stackOut_9_0 = stackIn_9_0;
            stackOut_9_1 = stackIn_9_1;
            stackOut_9_2 = stackIn_9_2;
            stackOut_9_3 = stackIn_9_3;
            stackOut_9_4 = el.field_d;
            stackOut_9_5 = 65528;
            stackOut_9_6 = 14;
            stackOut_9_7 = 13;
            stackOut_9_8 = 1;
            stackOut_9_9 = 11;
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_12_2 = stackOut_9_2;
            stackIn_12_3 = stackOut_9_3;
            stackIn_12_4 = stackOut_9_4;
            stackIn_12_5 = stackOut_9_5;
            stackIn_12_6 = stackOut_9_6;
            stackIn_12_7 = stackOut_9_7;
            stackIn_12_8 = stackOut_9_8;
            stackIn_12_9 = stackOut_9_9;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            stackIn_10_2 = stackOut_9_2;
            stackIn_10_3 = stackOut_9_3;
            stackIn_10_4 = stackOut_9_4;
            stackIn_10_5 = stackOut_9_5;
            stackIn_10_6 = stackOut_9_6;
            stackIn_10_7 = stackOut_9_7;
            stackIn_10_8 = stackOut_9_8;
            stackIn_10_9 = stackOut_9_9;
            if (fj.field_c) {
              break L3;
            } else {
              stackOut_10_0 = stackIn_10_0;
              stackOut_10_1 = stackIn_10_1;
              stackOut_10_2 = stackIn_10_2;
              stackOut_10_3 = stackIn_10_3;
              stackOut_10_4 = stackIn_10_4;
              stackOut_10_5 = stackIn_10_5;
              stackOut_10_6 = stackIn_10_6;
              stackOut_10_7 = stackIn_10_7;
              stackOut_10_8 = stackIn_10_8;
              stackOut_10_9 = stackIn_10_9;
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              stackIn_13_3 = stackOut_10_3;
              stackIn_13_4 = stackOut_10_4;
              stackIn_13_5 = stackOut_10_5;
              stackIn_13_6 = stackOut_10_6;
              stackIn_13_7 = stackOut_10_7;
              stackIn_13_8 = stackOut_10_8;
              stackIn_13_9 = stackOut_10_9;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              stackIn_11_3 = stackOut_10_3;
              stackIn_11_4 = stackOut_10_4;
              stackIn_11_5 = stackOut_10_5;
              stackIn_11_6 = stackOut_10_6;
              stackIn_11_7 = stackOut_10_7;
              stackIn_11_8 = stackOut_10_8;
              stackIn_11_9 = stackOut_10_9;
              if (!gk.field_H) {
                stackOut_13_0 = stackIn_13_0;
                stackOut_13_1 = stackIn_13_1;
                stackOut_13_2 = stackIn_13_2;
                stackOut_13_3 = stackIn_13_3;
                stackOut_13_4 = stackIn_13_4;
                stackOut_13_5 = stackIn_13_5;
                stackOut_13_6 = stackIn_13_6;
                stackOut_13_7 = stackIn_13_7;
                stackOut_13_8 = stackIn_13_8;
                stackOut_13_9 = stackIn_13_9;
                stackOut_13_10 = 0;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                stackIn_14_2 = stackOut_13_2;
                stackIn_14_3 = stackOut_13_3;
                stackIn_14_4 = stackOut_13_4;
                stackIn_14_5 = stackOut_13_5;
                stackIn_14_6 = stackOut_13_6;
                stackIn_14_7 = stackOut_13_7;
                stackIn_14_8 = stackOut_13_8;
                stackIn_14_9 = stackOut_13_9;
                stackIn_14_10 = stackOut_13_10;
                break L2;
              } else {
                stackOut_11_0 = stackIn_11_0;
                stackOut_11_1 = stackIn_11_1;
                stackOut_11_2 = stackIn_11_2;
                stackOut_11_3 = stackIn_11_3;
                stackOut_11_4 = stackIn_11_4;
                stackOut_11_5 = stackIn_11_5;
                stackOut_11_6 = stackIn_11_6;
                stackOut_11_7 = stackIn_11_7;
                stackOut_11_8 = stackIn_11_8;
                stackOut_11_9 = stackIn_11_9;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                stackIn_12_2 = stackOut_11_2;
                stackIn_12_3 = stackOut_11_3;
                stackIn_12_4 = stackOut_11_4;
                stackIn_12_5 = stackOut_11_5;
                stackIn_12_6 = stackOut_11_6;
                stackIn_12_7 = stackOut_11_7;
                stackIn_12_8 = stackOut_11_8;
                stackIn_12_9 = stackOut_11_9;
                break L3;
              }
            }
          }
          stackOut_12_0 = stackIn_12_0;
          stackOut_12_1 = stackIn_12_1;
          stackOut_12_2 = stackIn_12_2;
          stackOut_12_3 = stackIn_12_3;
          stackOut_12_4 = stackIn_12_4;
          stackOut_12_5 = stackIn_12_5;
          stackOut_12_6 = stackIn_12_6;
          stackOut_12_7 = stackIn_12_7;
          stackOut_12_8 = stackIn_12_8;
          stackOut_12_9 = stackIn_12_9;
          stackOut_12_10 = 1;
          stackIn_14_0 = stackOut_12_0;
          stackIn_14_1 = stackOut_12_1;
          stackIn_14_2 = stackOut_12_2;
          stackIn_14_3 = stackOut_12_3;
          stackIn_14_4 = stackOut_12_4;
          stackIn_14_5 = stackOut_12_5;
          stackIn_14_6 = stackOut_12_6;
          stackIn_14_7 = stackOut_12_7;
          stackIn_14_8 = stackOut_12_8;
          stackIn_14_9 = stackOut_12_9;
          stackIn_14_10 = stackOut_12_10;
          break L2;
        }
        L4: {
          hb.a(stackIn_14_0 != 0, stackIn_14_1, stackIn_14_2, stackIn_14_3 != 0, stackIn_14_4, stackIn_14_5, stackIn_14_6, stackIn_14_7, stackIn_14_8 != 0, stackIn_14_9, stackIn_14_10 != 0, param1, var2 != 0, 0);
          if (!cp.field_h) {
            break L4;
          } else {
            vl.field_n.h(32161, 64);
            cp.field_h = false;
            break L4;
          }
        }
        L5: {
          if (!cg.field_a) {
            break L5;
          } else {
            vl.field_n.h(32161, 10);
            cg.field_a = false;
            break L5;
          }
        }
        L6: {
          if (mo.field_w) {
            ld.a(1, uh.field_a, true, (byte) 90, false);
            mo.field_w = false;
            break L6;
          } else {
            break L6;
          }
        }
        var3 = -60;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = false;
        field_E = "Encouraging rule breaking";
        field_F = "Waiting for <%0> to start the game...";
    }
}
