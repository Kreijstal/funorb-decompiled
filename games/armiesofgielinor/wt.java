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
        nd discarded$2 = null;
        RuntimeException var3 = null;
        nd[] var4 = null;
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
                var4 = (nd[]) null;
                discarded$2 = this.a(-63, (nd[]) null);
                break L1;
              }
            }
            stackOut_2_0 = new nd(te.b(128, param1[0].a(2)));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("wt.C(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
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
        boolean stackIn_8_0 = false;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_7_0 = false;
        int stackOut_10_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_int = -83 % ((-9 - param1) / 39);
            if (!wn.a(param0, 1, param2)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var4 >= param0.length()) {
                      break L3;
                    } else {
                      stackOut_7_0 = wg.a(param0.charAt(var4), -3904);
                      stackIn_14_0 = stackOut_7_0 ? 1 : 0;
                      stackIn_8_0 = stackOut_7_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        if (!stackIn_8_0) {
                          stackOut_10_0 = 0;
                          stackIn_11_0 = stackOut_10_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          var4++;
                          if (var5 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackOut_13_0 = 1;
                  stackIn_14_0 = stackOut_13_0;
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3);
            stackOut_15_1 = new StringBuilder().append("wt.D(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            return stackIn_11_0 != 0;
          }
        }
    }

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        int stackIn_5_5 = 0;
        int stackIn_5_6 = 0;
        int stackIn_5_7 = 0;
        int stackIn_5_8 = 0;
        int stackIn_5_9 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_6_4 = 0;
        int stackIn_6_5 = 0;
        int stackIn_6_6 = 0;
        int stackIn_6_7 = 0;
        int stackIn_6_8 = 0;
        int stackIn_6_9 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        int stackIn_7_5 = 0;
        int stackIn_7_6 = 0;
        int stackIn_7_7 = 0;
        int stackIn_7_8 = 0;
        int stackIn_7_9 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        int stackIn_8_5 = 0;
        int stackIn_8_6 = 0;
        int stackIn_8_7 = 0;
        int stackIn_8_8 = 0;
        int stackIn_8_9 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        int stackIn_9_4 = 0;
        int stackIn_9_5 = 0;
        int stackIn_9_6 = 0;
        int stackIn_9_7 = 0;
        int stackIn_9_8 = 0;
        int stackIn_9_9 = 0;
        int stackIn_9_10 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_26_4 = 0;
        int stackIn_26_5 = 0;
        int stackIn_26_6 = 0;
        int stackIn_26_7 = 0;
        int stackIn_26_8 = 0;
        int stackIn_26_9 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        int stackIn_27_5 = 0;
        int stackIn_27_6 = 0;
        int stackIn_27_7 = 0;
        int stackIn_27_8 = 0;
        int stackIn_27_9 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        int stackIn_28_3 = 0;
        int stackIn_28_4 = 0;
        int stackIn_28_5 = 0;
        int stackIn_28_6 = 0;
        int stackIn_28_7 = 0;
        int stackIn_28_8 = 0;
        int stackIn_28_9 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        int stackIn_29_3 = 0;
        int stackIn_29_4 = 0;
        int stackIn_29_5 = 0;
        int stackIn_29_6 = 0;
        int stackIn_29_7 = 0;
        int stackIn_29_8 = 0;
        int stackIn_29_9 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        int stackIn_30_3 = 0;
        int stackIn_30_4 = 0;
        int stackIn_30_5 = 0;
        int stackIn_30_6 = 0;
        int stackIn_30_7 = 0;
        int stackIn_30_8 = 0;
        int stackIn_30_9 = 0;
        int stackIn_30_10 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_43_2 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_45_2 = 0;
        int stackIn_45_3 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_46_2 = 0;
        int stackIn_46_3 = 0;
        int stackIn_46_4 = 0;
        int stackIn_46_5 = 0;
        int stackIn_46_6 = 0;
        int stackIn_46_7 = 0;
        int stackIn_46_8 = 0;
        int stackIn_46_9 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_47_2 = 0;
        int stackIn_47_3 = 0;
        int stackIn_47_4 = 0;
        int stackIn_47_5 = 0;
        int stackIn_47_6 = 0;
        int stackIn_47_7 = 0;
        int stackIn_47_8 = 0;
        int stackIn_47_9 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_48_2 = 0;
        int stackIn_48_3 = 0;
        int stackIn_48_4 = 0;
        int stackIn_48_5 = 0;
        int stackIn_48_6 = 0;
        int stackIn_48_7 = 0;
        int stackIn_48_8 = 0;
        int stackIn_48_9 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        int stackIn_49_3 = 0;
        int stackIn_49_4 = 0;
        int stackIn_49_5 = 0;
        int stackIn_49_6 = 0;
        int stackIn_49_7 = 0;
        int stackIn_49_8 = 0;
        int stackIn_49_9 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        int stackIn_50_3 = 0;
        int stackIn_50_4 = 0;
        int stackIn_50_5 = 0;
        int stackIn_50_6 = 0;
        int stackIn_50_7 = 0;
        int stackIn_50_8 = 0;
        int stackIn_50_9 = 0;
        int stackIn_50_10 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        int stackOut_42_2 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        int stackOut_44_2 = 0;
        int stackOut_44_3 = 0;
        int stackOut_43_0 = 0;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
        int stackOut_43_3 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_45_2 = 0;
        int stackOut_45_3 = 0;
        int stackOut_45_4 = 0;
        int stackOut_45_5 = 0;
        int stackOut_45_6 = 0;
        int stackOut_45_7 = 0;
        int stackOut_45_8 = 0;
        int stackOut_45_9 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        int stackOut_46_3 = 0;
        int stackOut_46_4 = 0;
        int stackOut_46_5 = 0;
        int stackOut_46_6 = 0;
        int stackOut_46_7 = 0;
        int stackOut_46_8 = 0;
        int stackOut_46_9 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        int stackOut_49_3 = 0;
        int stackOut_49_4 = 0;
        int stackOut_49_5 = 0;
        int stackOut_49_6 = 0;
        int stackOut_49_7 = 0;
        int stackOut_49_8 = 0;
        int stackOut_49_9 = 0;
        int stackOut_49_10 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_47_2 = 0;
        int stackOut_47_3 = 0;
        int stackOut_47_4 = 0;
        int stackOut_47_5 = 0;
        int stackOut_47_6 = 0;
        int stackOut_47_7 = 0;
        int stackOut_47_8 = 0;
        int stackOut_47_9 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        int stackOut_48_3 = 0;
        int stackOut_48_4 = 0;
        int stackOut_48_5 = 0;
        int stackOut_48_6 = 0;
        int stackOut_48_7 = 0;
        int stackOut_48_8 = 0;
        int stackOut_48_9 = 0;
        int stackOut_48_10 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_25_4 = 0;
        int stackOut_25_5 = 0;
        int stackOut_25_6 = 0;
        int stackOut_25_7 = 0;
        int stackOut_25_8 = 0;
        int stackOut_25_9 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int stackOut_26_4 = 0;
        int stackOut_26_5 = 0;
        int stackOut_26_6 = 0;
        int stackOut_26_7 = 0;
        int stackOut_26_8 = 0;
        int stackOut_26_9 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        int stackOut_29_3 = 0;
        int stackOut_29_4 = 0;
        int stackOut_29_5 = 0;
        int stackOut_29_6 = 0;
        int stackOut_29_7 = 0;
        int stackOut_29_8 = 0;
        int stackOut_29_9 = 0;
        int stackOut_29_10 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        int stackOut_27_3 = 0;
        int stackOut_27_4 = 0;
        int stackOut_27_5 = 0;
        int stackOut_27_6 = 0;
        int stackOut_27_7 = 0;
        int stackOut_27_8 = 0;
        int stackOut_27_9 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        int stackOut_28_3 = 0;
        int stackOut_28_4 = 0;
        int stackOut_28_5 = 0;
        int stackOut_28_6 = 0;
        int stackOut_28_7 = 0;
        int stackOut_28_8 = 0;
        int stackOut_28_9 = 0;
        int stackOut_28_10 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        int stackOut_4_5 = 0;
        int stackOut_4_6 = 0;
        int stackOut_4_7 = 0;
        int stackOut_4_8 = 0;
        int stackOut_4_9 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        int stackOut_5_5 = 0;
        int stackOut_5_6 = 0;
        int stackOut_5_7 = 0;
        int stackOut_5_8 = 0;
        int stackOut_5_9 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        int stackOut_8_4 = 0;
        int stackOut_8_5 = 0;
        int stackOut_8_6 = 0;
        int stackOut_8_7 = 0;
        int stackOut_8_8 = 0;
        int stackOut_8_9 = 0;
        int stackOut_8_10 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        int stackOut_6_5 = 0;
        int stackOut_6_6 = 0;
        int stackOut_6_7 = 0;
        int stackOut_6_8 = 0;
        int stackOut_6_9 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        int stackOut_7_5 = 0;
        int stackOut_7_6 = 0;
        int stackOut_7_7 = 0;
        int stackOut_7_8 = 0;
        int stackOut_7_9 = 0;
        int stackOut_7_10 = 0;
        ad.a(-117);
        if (vu.field_M != null) {
          if (r.c(vu.field_M.field_Ub, 2)) {
            L0: {
              var2 = 1;
              stackOut_42_0 = 1;
              stackOut_42_1 = 65524;
              stackOut_42_2 = 15;
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              if (50 >= r.field_u) {
                stackOut_44_0 = stackIn_44_0;
                stackOut_44_1 = stackIn_44_1;
                stackOut_44_2 = stackIn_44_2;
                stackOut_44_3 = 0;
                stackIn_45_0 = stackOut_44_0;
                stackIn_45_1 = stackOut_44_1;
                stackIn_45_2 = stackOut_44_2;
                stackIn_45_3 = stackOut_44_3;
                break L0;
              } else {
                stackOut_43_0 = stackIn_43_0;
                stackOut_43_1 = stackIn_43_1;
                stackOut_43_2 = stackIn_43_2;
                stackOut_43_3 = 1;
                stackIn_45_0 = stackOut_43_0;
                stackIn_45_1 = stackOut_43_1;
                stackIn_45_2 = stackOut_43_2;
                stackIn_45_3 = stackOut_43_3;
                break L0;
              }
            }
            L1: {
              L2: {
                stackOut_45_0 = stackIn_45_0;
                stackOut_45_1 = stackIn_45_1;
                stackOut_45_2 = stackIn_45_2;
                stackOut_45_3 = stackIn_45_3;
                stackOut_45_4 = el.field_d;
                stackOut_45_5 = 65528;
                stackOut_45_6 = 14;
                stackOut_45_7 = 13;
                stackOut_45_8 = 1;
                stackOut_45_9 = 11;
                stackIn_48_0 = stackOut_45_0;
                stackIn_48_1 = stackOut_45_1;
                stackIn_48_2 = stackOut_45_2;
                stackIn_48_3 = stackOut_45_3;
                stackIn_48_4 = stackOut_45_4;
                stackIn_48_5 = stackOut_45_5;
                stackIn_48_6 = stackOut_45_6;
                stackIn_48_7 = stackOut_45_7;
                stackIn_48_8 = stackOut_45_8;
                stackIn_48_9 = stackOut_45_9;
                stackIn_46_0 = stackOut_45_0;
                stackIn_46_1 = stackOut_45_1;
                stackIn_46_2 = stackOut_45_2;
                stackIn_46_3 = stackOut_45_3;
                stackIn_46_4 = stackOut_45_4;
                stackIn_46_5 = stackOut_45_5;
                stackIn_46_6 = stackOut_45_6;
                stackIn_46_7 = stackOut_45_7;
                stackIn_46_8 = stackOut_45_8;
                stackIn_46_9 = stackOut_45_9;
                if (fj.field_c) {
                  break L2;
                } else {
                  stackOut_46_0 = stackIn_46_0;
                  stackOut_46_1 = stackIn_46_1;
                  stackOut_46_2 = stackIn_46_2;
                  stackOut_46_3 = stackIn_46_3;
                  stackOut_46_4 = stackIn_46_4;
                  stackOut_46_5 = stackIn_46_5;
                  stackOut_46_6 = stackIn_46_6;
                  stackOut_46_7 = stackIn_46_7;
                  stackOut_46_8 = stackIn_46_8;
                  stackOut_46_9 = stackIn_46_9;
                  stackIn_49_0 = stackOut_46_0;
                  stackIn_49_1 = stackOut_46_1;
                  stackIn_49_2 = stackOut_46_2;
                  stackIn_49_3 = stackOut_46_3;
                  stackIn_49_4 = stackOut_46_4;
                  stackIn_49_5 = stackOut_46_5;
                  stackIn_49_6 = stackOut_46_6;
                  stackIn_49_7 = stackOut_46_7;
                  stackIn_49_8 = stackOut_46_8;
                  stackIn_49_9 = stackOut_46_9;
                  stackIn_47_0 = stackOut_46_0;
                  stackIn_47_1 = stackOut_46_1;
                  stackIn_47_2 = stackOut_46_2;
                  stackIn_47_3 = stackOut_46_3;
                  stackIn_47_4 = stackOut_46_4;
                  stackIn_47_5 = stackOut_46_5;
                  stackIn_47_6 = stackOut_46_6;
                  stackIn_47_7 = stackOut_46_7;
                  stackIn_47_8 = stackOut_46_8;
                  stackIn_47_9 = stackOut_46_9;
                  if (!gk.field_H) {
                    stackOut_49_0 = stackIn_49_0;
                    stackOut_49_1 = stackIn_49_1;
                    stackOut_49_2 = stackIn_49_2;
                    stackOut_49_3 = stackIn_49_3;
                    stackOut_49_4 = stackIn_49_4;
                    stackOut_49_5 = stackIn_49_5;
                    stackOut_49_6 = stackIn_49_6;
                    stackOut_49_7 = stackIn_49_7;
                    stackOut_49_8 = stackIn_49_8;
                    stackOut_49_9 = stackIn_49_9;
                    stackOut_49_10 = 0;
                    stackIn_50_0 = stackOut_49_0;
                    stackIn_50_1 = stackOut_49_1;
                    stackIn_50_2 = stackOut_49_2;
                    stackIn_50_3 = stackOut_49_3;
                    stackIn_50_4 = stackOut_49_4;
                    stackIn_50_5 = stackOut_49_5;
                    stackIn_50_6 = stackOut_49_6;
                    stackIn_50_7 = stackOut_49_7;
                    stackIn_50_8 = stackOut_49_8;
                    stackIn_50_9 = stackOut_49_9;
                    stackIn_50_10 = stackOut_49_10;
                    break L1;
                  } else {
                    stackOut_47_0 = stackIn_47_0;
                    stackOut_47_1 = stackIn_47_1;
                    stackOut_47_2 = stackIn_47_2;
                    stackOut_47_3 = stackIn_47_3;
                    stackOut_47_4 = stackIn_47_4;
                    stackOut_47_5 = stackIn_47_5;
                    stackOut_47_6 = stackIn_47_6;
                    stackOut_47_7 = stackIn_47_7;
                    stackOut_47_8 = stackIn_47_8;
                    stackOut_47_9 = stackIn_47_9;
                    stackIn_48_0 = stackOut_47_0;
                    stackIn_48_1 = stackOut_47_1;
                    stackIn_48_2 = stackOut_47_2;
                    stackIn_48_3 = stackOut_47_3;
                    stackIn_48_4 = stackOut_47_4;
                    stackIn_48_5 = stackOut_47_5;
                    stackIn_48_6 = stackOut_47_6;
                    stackIn_48_7 = stackOut_47_7;
                    stackIn_48_8 = stackOut_47_8;
                    stackIn_48_9 = stackOut_47_9;
                    break L2;
                  }
                }
              }
              stackOut_48_0 = stackIn_48_0;
              stackOut_48_1 = stackIn_48_1;
              stackOut_48_2 = stackIn_48_2;
              stackOut_48_3 = stackIn_48_3;
              stackOut_48_4 = stackIn_48_4;
              stackOut_48_5 = stackIn_48_5;
              stackOut_48_6 = stackIn_48_6;
              stackOut_48_7 = stackIn_48_7;
              stackOut_48_8 = stackIn_48_8;
              stackOut_48_9 = stackIn_48_9;
              stackOut_48_10 = 1;
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              stackIn_50_3 = stackOut_48_3;
              stackIn_50_4 = stackOut_48_4;
              stackIn_50_5 = stackOut_48_5;
              stackIn_50_6 = stackOut_48_6;
              stackIn_50_7 = stackOut_48_7;
              stackIn_50_8 = stackOut_48_8;
              stackIn_50_9 = stackOut_48_9;
              stackIn_50_10 = stackOut_48_10;
              break L1;
            }
            hb.a(stackIn_50_0 != 0, stackIn_50_1, stackIn_50_2, stackIn_50_3 != 0, stackIn_50_4, stackIn_50_5, stackIn_50_6, stackIn_50_7, stackIn_50_8 != 0, stackIn_50_9, stackIn_50_10 != 0, param1, var2 != 0, 0);
            if (!cp.field_h) {
              if (!cg.field_a) {
                L3: {
                  if (mo.field_w) {
                    ld.a(1, uh.field_a, true, (byte) 90, false);
                    mo.field_w = false;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var3 = 121 / ((-20 - param0) / 45);
                return;
              } else {
                L4: {
                  vl.field_n.h(32161, 10);
                  cg.field_a = false;
                  if (mo.field_w) {
                    ld.a(1, uh.field_a, true, (byte) 90, false);
                    mo.field_w = false;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var3 = 121 / ((-20 - param0) / 45);
                return;
              }
            } else {
              vl.field_n.h(32161, 64);
              cp.field_h = false;
              if (!cg.field_a) {
                L5: {
                  if (mo.field_w) {
                    ld.a(1, uh.field_a, true, (byte) 90, false);
                    mo.field_w = false;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var3 = 121 / ((-20 - param0) / 45);
                return;
              } else {
                L6: {
                  vl.field_n.h(32161, 10);
                  cg.field_a = false;
                  if (mo.field_w) {
                    ld.a(1, uh.field_a, true, (byte) 90, false);
                    mo.field_w = false;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var3 = 121 / ((-20 - param0) / 45);
                return;
              }
            }
          } else {
            L7: {
              var2 = 0;
              stackOut_22_0 = 1;
              stackOut_22_1 = 65524;
              stackOut_22_2 = 15;
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              if (50 >= r.field_u) {
                stackOut_24_0 = stackIn_24_0;
                stackOut_24_1 = stackIn_24_1;
                stackOut_24_2 = stackIn_24_2;
                stackOut_24_3 = 0;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                stackIn_25_2 = stackOut_24_2;
                stackIn_25_3 = stackOut_24_3;
                break L7;
              } else {
                stackOut_23_0 = stackIn_23_0;
                stackOut_23_1 = stackIn_23_1;
                stackOut_23_2 = stackIn_23_2;
                stackOut_23_3 = 1;
                stackIn_25_0 = stackOut_23_0;
                stackIn_25_1 = stackOut_23_1;
                stackIn_25_2 = stackOut_23_2;
                stackIn_25_3 = stackOut_23_3;
                break L7;
              }
            }
            L8: {
              L9: {
                stackOut_25_0 = stackIn_25_0;
                stackOut_25_1 = stackIn_25_1;
                stackOut_25_2 = stackIn_25_2;
                stackOut_25_3 = stackIn_25_3;
                stackOut_25_4 = el.field_d;
                stackOut_25_5 = 65528;
                stackOut_25_6 = 14;
                stackOut_25_7 = 13;
                stackOut_25_8 = 1;
                stackOut_25_9 = 11;
                stackIn_28_0 = stackOut_25_0;
                stackIn_28_1 = stackOut_25_1;
                stackIn_28_2 = stackOut_25_2;
                stackIn_28_3 = stackOut_25_3;
                stackIn_28_4 = stackOut_25_4;
                stackIn_28_5 = stackOut_25_5;
                stackIn_28_6 = stackOut_25_6;
                stackIn_28_7 = stackOut_25_7;
                stackIn_28_8 = stackOut_25_8;
                stackIn_28_9 = stackOut_25_9;
                stackIn_26_0 = stackOut_25_0;
                stackIn_26_1 = stackOut_25_1;
                stackIn_26_2 = stackOut_25_2;
                stackIn_26_3 = stackOut_25_3;
                stackIn_26_4 = stackOut_25_4;
                stackIn_26_5 = stackOut_25_5;
                stackIn_26_6 = stackOut_25_6;
                stackIn_26_7 = stackOut_25_7;
                stackIn_26_8 = stackOut_25_8;
                stackIn_26_9 = stackOut_25_9;
                if (fj.field_c) {
                  break L9;
                } else {
                  stackOut_26_0 = stackIn_26_0;
                  stackOut_26_1 = stackIn_26_1;
                  stackOut_26_2 = stackIn_26_2;
                  stackOut_26_3 = stackIn_26_3;
                  stackOut_26_4 = stackIn_26_4;
                  stackOut_26_5 = stackIn_26_5;
                  stackOut_26_6 = stackIn_26_6;
                  stackOut_26_7 = stackIn_26_7;
                  stackOut_26_8 = stackIn_26_8;
                  stackOut_26_9 = stackIn_26_9;
                  stackIn_29_0 = stackOut_26_0;
                  stackIn_29_1 = stackOut_26_1;
                  stackIn_29_2 = stackOut_26_2;
                  stackIn_29_3 = stackOut_26_3;
                  stackIn_29_4 = stackOut_26_4;
                  stackIn_29_5 = stackOut_26_5;
                  stackIn_29_6 = stackOut_26_6;
                  stackIn_29_7 = stackOut_26_7;
                  stackIn_29_8 = stackOut_26_8;
                  stackIn_29_9 = stackOut_26_9;
                  stackIn_27_0 = stackOut_26_0;
                  stackIn_27_1 = stackOut_26_1;
                  stackIn_27_2 = stackOut_26_2;
                  stackIn_27_3 = stackOut_26_3;
                  stackIn_27_4 = stackOut_26_4;
                  stackIn_27_5 = stackOut_26_5;
                  stackIn_27_6 = stackOut_26_6;
                  stackIn_27_7 = stackOut_26_7;
                  stackIn_27_8 = stackOut_26_8;
                  stackIn_27_9 = stackOut_26_9;
                  if (!gk.field_H) {
                    stackOut_29_0 = stackIn_29_0;
                    stackOut_29_1 = stackIn_29_1;
                    stackOut_29_2 = stackIn_29_2;
                    stackOut_29_3 = stackIn_29_3;
                    stackOut_29_4 = stackIn_29_4;
                    stackOut_29_5 = stackIn_29_5;
                    stackOut_29_6 = stackIn_29_6;
                    stackOut_29_7 = stackIn_29_7;
                    stackOut_29_8 = stackIn_29_8;
                    stackOut_29_9 = stackIn_29_9;
                    stackOut_29_10 = 0;
                    stackIn_30_0 = stackOut_29_0;
                    stackIn_30_1 = stackOut_29_1;
                    stackIn_30_2 = stackOut_29_2;
                    stackIn_30_3 = stackOut_29_3;
                    stackIn_30_4 = stackOut_29_4;
                    stackIn_30_5 = stackOut_29_5;
                    stackIn_30_6 = stackOut_29_6;
                    stackIn_30_7 = stackOut_29_7;
                    stackIn_30_8 = stackOut_29_8;
                    stackIn_30_9 = stackOut_29_9;
                    stackIn_30_10 = stackOut_29_10;
                    break L8;
                  } else {
                    stackOut_27_0 = stackIn_27_0;
                    stackOut_27_1 = stackIn_27_1;
                    stackOut_27_2 = stackIn_27_2;
                    stackOut_27_3 = stackIn_27_3;
                    stackOut_27_4 = stackIn_27_4;
                    stackOut_27_5 = stackIn_27_5;
                    stackOut_27_6 = stackIn_27_6;
                    stackOut_27_7 = stackIn_27_7;
                    stackOut_27_8 = stackIn_27_8;
                    stackOut_27_9 = stackIn_27_9;
                    stackIn_28_0 = stackOut_27_0;
                    stackIn_28_1 = stackOut_27_1;
                    stackIn_28_2 = stackOut_27_2;
                    stackIn_28_3 = stackOut_27_3;
                    stackIn_28_4 = stackOut_27_4;
                    stackIn_28_5 = stackOut_27_5;
                    stackIn_28_6 = stackOut_27_6;
                    stackIn_28_7 = stackOut_27_7;
                    stackIn_28_8 = stackOut_27_8;
                    stackIn_28_9 = stackOut_27_9;
                    break L9;
                  }
                }
              }
              stackOut_28_0 = stackIn_28_0;
              stackOut_28_1 = stackIn_28_1;
              stackOut_28_2 = stackIn_28_2;
              stackOut_28_3 = stackIn_28_3;
              stackOut_28_4 = stackIn_28_4;
              stackOut_28_5 = stackIn_28_5;
              stackOut_28_6 = stackIn_28_6;
              stackOut_28_7 = stackIn_28_7;
              stackOut_28_8 = stackIn_28_8;
              stackOut_28_9 = stackIn_28_9;
              stackOut_28_10 = 1;
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              stackIn_30_3 = stackOut_28_3;
              stackIn_30_4 = stackOut_28_4;
              stackIn_30_5 = stackOut_28_5;
              stackIn_30_6 = stackOut_28_6;
              stackIn_30_7 = stackOut_28_7;
              stackIn_30_8 = stackOut_28_8;
              stackIn_30_9 = stackOut_28_9;
              stackIn_30_10 = stackOut_28_10;
              break L8;
            }
            L10: {
              hb.a(stackIn_30_0 != 0, stackIn_30_1, stackIn_30_2, stackIn_30_3 != 0, stackIn_30_4, stackIn_30_5, stackIn_30_6, stackIn_30_7, stackIn_30_8 != 0, stackIn_30_9, stackIn_30_10 != 0, param1, var2 != 0, 0);
              if (!cp.field_h) {
                break L10;
              } else {
                vl.field_n.h(32161, 64);
                cp.field_h = false;
                break L10;
              }
            }
            if (cg.field_a) {
              L11: {
                vl.field_n.h(32161, 10);
                cg.field_a = false;
                if (mo.field_w) {
                  ld.a(1, uh.field_a, true, (byte) 90, false);
                  mo.field_w = false;
                  break L11;
                } else {
                  break L11;
                }
              }
              var3 = 121 / ((-20 - param0) / 45);
              return;
            } else {
              L12: {
                if (mo.field_w) {
                  ld.a(1, uh.field_a, true, (byte) 90, false);
                  mo.field_w = false;
                  break L12;
                } else {
                  break L12;
                }
              }
              var3 = 121 / ((-20 - param0) / 45);
              return;
            }
          }
        } else {
          L13: {
            var2 = 0;
            stackOut_1_0 = 1;
            stackOut_1_1 = 65524;
            stackOut_1_2 = 15;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_2_0 = stackOut_1_0;
            stackIn_2_1 = stackOut_1_1;
            stackIn_2_2 = stackOut_1_2;
            if (50 >= r.field_u) {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = stackIn_3_1;
              stackOut_3_2 = stackIn_3_2;
              stackOut_3_3 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              stackIn_4_2 = stackOut_3_2;
              stackIn_4_3 = stackOut_3_3;
              break L13;
            } else {
              stackOut_2_0 = stackIn_2_0;
              stackOut_2_1 = stackIn_2_1;
              stackOut_2_2 = stackIn_2_2;
              stackOut_2_3 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_4_2 = stackOut_2_2;
              stackIn_4_3 = stackOut_2_3;
              break L13;
            }
          }
          L14: {
            L15: {
              stackOut_4_0 = stackIn_4_0;
              stackOut_4_1 = stackIn_4_1;
              stackOut_4_2 = stackIn_4_2;
              stackOut_4_3 = stackIn_4_3;
              stackOut_4_4 = el.field_d;
              stackOut_4_5 = 65528;
              stackOut_4_6 = 14;
              stackOut_4_7 = 13;
              stackOut_4_8 = 1;
              stackOut_4_9 = 11;
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              stackIn_7_3 = stackOut_4_3;
              stackIn_7_4 = stackOut_4_4;
              stackIn_7_5 = stackOut_4_5;
              stackIn_7_6 = stackOut_4_6;
              stackIn_7_7 = stackOut_4_7;
              stackIn_7_8 = stackOut_4_8;
              stackIn_7_9 = stackOut_4_9;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              stackIn_5_3 = stackOut_4_3;
              stackIn_5_4 = stackOut_4_4;
              stackIn_5_5 = stackOut_4_5;
              stackIn_5_6 = stackOut_4_6;
              stackIn_5_7 = stackOut_4_7;
              stackIn_5_8 = stackOut_4_8;
              stackIn_5_9 = stackOut_4_9;
              if (fj.field_c) {
                break L15;
              } else {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = stackIn_5_2;
                stackOut_5_3 = stackIn_5_3;
                stackOut_5_4 = stackIn_5_4;
                stackOut_5_5 = stackIn_5_5;
                stackOut_5_6 = stackIn_5_6;
                stackOut_5_7 = stackIn_5_7;
                stackOut_5_8 = stackIn_5_8;
                stackOut_5_9 = stackIn_5_9;
                stackIn_8_0 = stackOut_5_0;
                stackIn_8_1 = stackOut_5_1;
                stackIn_8_2 = stackOut_5_2;
                stackIn_8_3 = stackOut_5_3;
                stackIn_8_4 = stackOut_5_4;
                stackIn_8_5 = stackOut_5_5;
                stackIn_8_6 = stackOut_5_6;
                stackIn_8_7 = stackOut_5_7;
                stackIn_8_8 = stackOut_5_8;
                stackIn_8_9 = stackOut_5_9;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                stackIn_6_2 = stackOut_5_2;
                stackIn_6_3 = stackOut_5_3;
                stackIn_6_4 = stackOut_5_4;
                stackIn_6_5 = stackOut_5_5;
                stackIn_6_6 = stackOut_5_6;
                stackIn_6_7 = stackOut_5_7;
                stackIn_6_8 = stackOut_5_8;
                stackIn_6_9 = stackOut_5_9;
                if (!gk.field_H) {
                  stackOut_8_0 = stackIn_8_0;
                  stackOut_8_1 = stackIn_8_1;
                  stackOut_8_2 = stackIn_8_2;
                  stackOut_8_3 = stackIn_8_3;
                  stackOut_8_4 = stackIn_8_4;
                  stackOut_8_5 = stackIn_8_5;
                  stackOut_8_6 = stackIn_8_6;
                  stackOut_8_7 = stackIn_8_7;
                  stackOut_8_8 = stackIn_8_8;
                  stackOut_8_9 = stackIn_8_9;
                  stackOut_8_10 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  stackIn_9_3 = stackOut_8_3;
                  stackIn_9_4 = stackOut_8_4;
                  stackIn_9_5 = stackOut_8_5;
                  stackIn_9_6 = stackOut_8_6;
                  stackIn_9_7 = stackOut_8_7;
                  stackIn_9_8 = stackOut_8_8;
                  stackIn_9_9 = stackOut_8_9;
                  stackIn_9_10 = stackOut_8_10;
                  break L14;
                } else {
                  stackOut_6_0 = stackIn_6_0;
                  stackOut_6_1 = stackIn_6_1;
                  stackOut_6_2 = stackIn_6_2;
                  stackOut_6_3 = stackIn_6_3;
                  stackOut_6_4 = stackIn_6_4;
                  stackOut_6_5 = stackIn_6_5;
                  stackOut_6_6 = stackIn_6_6;
                  stackOut_6_7 = stackIn_6_7;
                  stackOut_6_8 = stackIn_6_8;
                  stackOut_6_9 = stackIn_6_9;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  stackIn_7_3 = stackOut_6_3;
                  stackIn_7_4 = stackOut_6_4;
                  stackIn_7_5 = stackOut_6_5;
                  stackIn_7_6 = stackOut_6_6;
                  stackIn_7_7 = stackOut_6_7;
                  stackIn_7_8 = stackOut_6_8;
                  stackIn_7_9 = stackOut_6_9;
                  break L15;
                }
              }
            }
            stackOut_7_0 = stackIn_7_0;
            stackOut_7_1 = stackIn_7_1;
            stackOut_7_2 = stackIn_7_2;
            stackOut_7_3 = stackIn_7_3;
            stackOut_7_4 = stackIn_7_4;
            stackOut_7_5 = stackIn_7_5;
            stackOut_7_6 = stackIn_7_6;
            stackOut_7_7 = stackIn_7_7;
            stackOut_7_8 = stackIn_7_8;
            stackOut_7_9 = stackIn_7_9;
            stackOut_7_10 = 1;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_9_2 = stackOut_7_2;
            stackIn_9_3 = stackOut_7_3;
            stackIn_9_4 = stackOut_7_4;
            stackIn_9_5 = stackOut_7_5;
            stackIn_9_6 = stackOut_7_6;
            stackIn_9_7 = stackOut_7_7;
            stackIn_9_8 = stackOut_7_8;
            stackIn_9_9 = stackOut_7_9;
            stackIn_9_10 = stackOut_7_10;
            break L14;
          }
          L16: {
            hb.a(stackIn_9_0 != 0, stackIn_9_1, stackIn_9_2, stackIn_9_3 != 0, stackIn_9_4, stackIn_9_5, stackIn_9_6, stackIn_9_7, stackIn_9_8 != 0, stackIn_9_9, stackIn_9_10 != 0, param1, var2 != 0, 0);
            if (!cp.field_h) {
              break L16;
            } else {
              vl.field_n.h(32161, 64);
              cp.field_h = false;
              break L16;
            }
          }
          if (cg.field_a) {
            L17: {
              vl.field_n.h(32161, 10);
              cg.field_a = false;
              if (mo.field_w) {
                ld.a(1, uh.field_a, true, (byte) 90, false);
                mo.field_w = false;
                break L17;
              } else {
                break L17;
              }
            }
            var3 = 121 / ((-20 - param0) / 45);
            return;
          } else {
            L18: {
              if (mo.field_w) {
                ld.a(1, uh.field_a, true, (byte) 90, false);
                mo.field_w = false;
                break L18;
              } else {
                break L18;
              }
            }
            var3 = 121 / ((-20 - param0) / 45);
            return;
          }
        }
    }

    static {
        field_G = false;
        field_E = "Encouraging rule breaking";
        field_F = "Waiting for <%0> to start the game...";
    }
}
