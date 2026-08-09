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
        nd[] var4 = null;
        nd stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -24872) {
                break L1;
              } else {
                var4 = (nd[]) null;
                this.a(-63, (nd[]) null);
                break L1;
              }
            }
            stackIn_3_0 = new nd(te.b(128, param1[0].a(2)));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("wt.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void e(byte param0) {
        field_E = null;
        field_F = null;
        if (param0 != 120) {
            field_G = false;
        }
    }

    final static boolean a(CharSequence param0, byte param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_int = -83 % ((-9 - param1) / 39);
            if (!wn.a(param0, 1, param2)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4 = 0;
              L1: while (true) {
                if (var4 >= param0.length()) {
                  stackIn_13_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!wg.a(param0.charAt(var4), -3904)) {
                    stackIn_10_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
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
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("wt.D(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    final static void a(int param0, boolean param1) {
        int var2;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        int stackIn_12_4;
        int stackIn_12_5;
        int stackIn_12_6;
        int stackIn_12_7;
        int stackIn_12_8;
        int stackIn_12_9;
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
        int var3;
        L0: {
          ad.a(-117);
          if (vu.field_M != null) {
            if (r.c(vu.field_M.field_Ub, 2)) {
              stackIn_6_0 = 1;
              break L0;
            } else {
              stackIn_6_0 = 0;
              break L0;
            }
          } else {
            stackIn_6_0 = 0;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_6_0;
          stackIn_8_0 = 1;

          stackIn_8_1 = 65524;

          stackIn_8_2 = 15;

          if (50 >= r.field_u) {
            stackIn_9_0 = stackIn_8_0;
            stackIn_9_1 = stackIn_8_1;
            stackIn_9_2 = stackIn_8_2;
            stackIn_9_3 = 0;
            break L1;
          } else {
            stackIn_9_0 = stackIn_8_0;
            stackIn_9_1 = stackIn_8_1;
            stackIn_9_2 = stackIn_8_2;
            stackIn_9_3 = 1;
            break L1;
          }
        }
        L2: {
          L3: {

            stackIn_12_4 = el.field_d;

            stackIn_12_5 = 65528;

            stackIn_12_6 = 14;

            stackIn_12_7 = 13;

            stackIn_12_8 = 1;

            stackIn_12_9 = 11;

            if (fj.field_c) {
              break L3;
            } else {




















              if (!gk.field_H) {
                stackIn_14_0 = stackIn_9_0;
                stackIn_14_1 = stackIn_9_1;
                stackIn_14_2 = stackIn_9_2;
                stackIn_14_3 = stackIn_9_3;
                stackIn_14_4 = stackIn_12_4;
                stackIn_14_5 = stackIn_12_5;
                stackIn_14_6 = stackIn_12_6;
                stackIn_14_7 = stackIn_12_7;
                stackIn_14_8 = stackIn_12_8;
                stackIn_14_9 = stackIn_12_9;
                stackIn_14_10 = 0;
                break L2;
              } else {










                break L3;
              }
            }
          }
          stackIn_14_0 = stackIn_9_0;
          stackIn_14_1 = stackIn_9_1;
          stackIn_14_2 = stackIn_9_2;
          stackIn_14_3 = stackIn_9_3;
          stackIn_14_4 = stackIn_12_4;
          stackIn_14_5 = stackIn_12_5;
          stackIn_14_6 = stackIn_12_6;
          stackIn_14_7 = stackIn_12_7;
          stackIn_14_8 = stackIn_12_8;
          stackIn_14_9 = stackIn_12_9;
          stackIn_14_10 = 1;
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
        var3 = 121 / ((-20 - param0) / 45);
    }

    static {
        field_G = false;
        field_E = "Encouraging rule breaking";
        field_F = "Waiting for <%0> to start the game...";
    }
}
