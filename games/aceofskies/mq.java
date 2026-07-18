/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mq extends wf {
    static eg field_h;
    bo field_j;
    ha field_f;
    static Object field_e;
    static st field_g;
    static String field_i;

    final static sn[] a(byte param0, int[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        sn[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        sn[] stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        sn[] stackOut_12_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1[-1 + param1.length] != 0) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var2_int = stackIn_4_0;
              if (var2_int == 0) {
                stackOut_6_0 = 1 + param1.length;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = param1.length;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            var3 = new sn[stackIn_7_0];
            var4 = 0;
            var4 = 0;
            L3: while (true) {
              if (param1.length <= var4) {
                L4: {
                  if (var4 >= var3.length) {
                    break L4;
                  } else {
                    var3[var4] = new sn(0, 2);
                    break L4;
                  }
                }
                stackOut_12_0 = (sn[]) var3;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                var3[var4] = new sn(param1[var4], 2);
                var4++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("mq.B(").append(122).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
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
          throw pn.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_13_0;
    }

    public static void a(int param0) {
        field_g = null;
        field_i = null;
        field_e = null;
        field_h = null;
    }

    final static int a(byte param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        L0: {
          var5 = param3 & 15;
          if (8 <= var5) {
            stackOut_2_0 = param4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = param1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var6 = stackIn_3_0;
        var8 = -45 / ((-12 - param0) / 50);
        if (var5 <= -5) {
          if (-13 != var5) {
            if (var5 == 14) {
              L1: {
                var7 = param1;
                if (0 != (var5 & 2)) {
                  stackOut_33_0 = -var7;
                  stackIn_34_0 = stackOut_33_0;
                  break L1;
                } else {
                  stackOut_32_0 = var7;
                  stackIn_34_0 = stackOut_32_0;
                  break L1;
                }
              }
              L2: {
                stackOut_34_0 = stackIn_34_0;
                stackIn_36_0 = stackOut_34_0;
                stackIn_35_0 = stackOut_34_0;
                if ((1 & var5) != 0) {
                  stackOut_36_0 = stackIn_36_0;
                  stackOut_36_1 = -var6;
                  stackIn_37_0 = stackOut_36_0;
                  stackIn_37_1 = stackOut_36_1;
                  break L2;
                } else {
                  stackOut_35_0 = stackIn_35_0;
                  stackOut_35_1 = var6;
                  stackIn_37_0 = stackOut_35_0;
                  stackIn_37_1 = stackOut_35_1;
                  break L2;
                }
              }
              return stackIn_37_0 + stackIn_37_1;
            } else {
              stackOut_22_0 = param2;
              stackIn_24_0 = stackOut_22_0;
              L3: {
                var7 = stackIn_24_0;
                if (0 != (var5 & 2)) {
                  stackOut_26_0 = -var7;
                  stackIn_27_0 = stackOut_26_0;
                  break L3;
                } else {
                  stackOut_25_0 = var7;
                  stackIn_27_0 = stackOut_25_0;
                  break L3;
                }
              }
              L4: {
                stackOut_27_0 = stackIn_27_0;
                stackIn_29_0 = stackOut_27_0;
                stackIn_28_0 = stackOut_27_0;
                if ((1 & var5) != 0) {
                  stackOut_29_0 = stackIn_29_0;
                  stackOut_29_1 = -var6;
                  stackIn_30_0 = stackOut_29_0;
                  stackIn_30_1 = stackOut_29_1;
                  break L4;
                } else {
                  stackOut_28_0 = stackIn_28_0;
                  stackOut_28_1 = var6;
                  stackIn_30_0 = stackOut_28_0;
                  stackIn_30_1 = stackOut_28_1;
                  break L4;
                }
              }
              return stackIn_30_0 + stackIn_30_1;
            }
          } else {
            stackOut_12_0 = param1;
            stackIn_14_0 = stackOut_12_0;
            L5: {
              var7 = stackIn_14_0;
              if (0 != (var5 & 2)) {
                stackOut_16_0 = -var7;
                stackIn_17_0 = stackOut_16_0;
                break L5;
              } else {
                stackOut_15_0 = var7;
                stackIn_17_0 = stackOut_15_0;
                break L5;
              }
            }
            L6: {
              stackOut_17_0 = stackIn_17_0;
              stackIn_19_0 = stackOut_17_0;
              stackIn_18_0 = stackOut_17_0;
              if ((1 & var5) != 0) {
                stackOut_19_0 = stackIn_19_0;
                stackOut_19_1 = -var6;
                stackIn_20_0 = stackOut_19_0;
                stackIn_20_1 = stackOut_19_1;
                break L6;
              } else {
                stackOut_18_0 = stackIn_18_0;
                stackOut_18_1 = var6;
                stackIn_20_0 = stackOut_18_0;
                stackIn_20_1 = stackOut_18_1;
                break L6;
              }
            }
            return stackIn_20_0 + stackIn_20_1;
          }
        } else {
          L7: {
            var7 = param4;
            if (0 != (var5 & 2)) {
              stackOut_6_0 = -var7;
              stackIn_7_0 = stackOut_6_0;
              break L7;
            } else {
              stackOut_5_0 = var7;
              stackIn_7_0 = stackOut_5_0;
              break L7;
            }
          }
          L8: {
            stackOut_7_0 = stackIn_7_0;
            stackIn_9_0 = stackOut_7_0;
            stackIn_8_0 = stackOut_7_0;
            if ((1 & var5) != 0) {
              stackOut_9_0 = stackIn_9_0;
              stackOut_9_1 = -var6;
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              break L8;
            } else {
              stackOut_8_0 = stackIn_8_0;
              stackOut_8_1 = var6;
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              break L8;
            }
          }
          return stackIn_10_0 + stackIn_10_1;
        }
    }

    mq(ha param0, bo param1) {
        try {
            ((mq) this).field_f = param0;
            ((mq) this).field_j = param1;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "mq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new eg();
        field_i = "Continue";
        field_g = new st();
    }
}
