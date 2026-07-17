/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf {
    static int field_a;
    private static String field_z;

    final static int a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        L0: {
          var5 = param3 & 15;
          if (var5 >= param2) {
            stackOut_2_0 = param0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = param4;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var6 = stackIn_3_0;
        if (var5 >= 4) {
          if (12 != var5) {
            if (var5 == 14) {
              L1: {
                var7 = param4;
                if ((2 & var5) == 0) {
                  stackOut_25_0 = var7;
                  stackIn_26_0 = stackOut_25_0;
                  break L1;
                } else {
                  stackOut_24_0 = -var7;
                  stackIn_26_0 = stackOut_24_0;
                  break L1;
                }
              }
              L2: {
                stackOut_26_0 = stackIn_26_0;
                stackIn_28_0 = stackOut_26_0;
                stackIn_27_0 = stackOut_26_0;
                if ((var5 & 1) == 0) {
                  stackOut_28_0 = stackIn_28_0;
                  stackOut_28_1 = var6;
                  stackIn_29_0 = stackOut_28_0;
                  stackIn_29_1 = stackOut_28_1;
                  break L2;
                } else {
                  stackOut_27_0 = stackIn_27_0;
                  stackOut_27_1 = -var6;
                  stackIn_29_0 = stackOut_27_0;
                  stackIn_29_1 = stackOut_27_1;
                  break L2;
                }
              }
              return stackIn_29_0 + stackIn_29_1;
            } else {
              L3: {
                var7 = param1;
                if ((2 & var5) == 0) {
                  stackOut_18_0 = var7;
                  stackIn_19_0 = stackOut_18_0;
                  break L3;
                } else {
                  stackOut_17_0 = -var7;
                  stackIn_19_0 = stackOut_17_0;
                  break L3;
                }
              }
              L4: {
                stackOut_19_0 = stackIn_19_0;
                stackIn_21_0 = stackOut_19_0;
                stackIn_20_0 = stackOut_19_0;
                if ((var5 & 1) == 0) {
                  stackOut_21_0 = stackIn_21_0;
                  stackOut_21_1 = var6;
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  break L4;
                } else {
                  stackOut_20_0 = stackIn_20_0;
                  stackOut_20_1 = -var6;
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_22_1 = stackOut_20_1;
                  break L4;
                }
              }
              return stackIn_22_0 + stackIn_22_1;
            }
          } else {
            stackOut_6_0 = param4;
            stackIn_8_0 = stackOut_6_0;
            L5: {
              var7 = stackIn_8_0;
              if ((2 & var5) == 0) {
                stackOut_10_0 = var7;
                stackIn_11_0 = stackOut_10_0;
                break L5;
              } else {
                stackOut_9_0 = -var7;
                stackIn_11_0 = stackOut_9_0;
                break L5;
              }
            }
            L6: {
              stackOut_11_0 = stackIn_11_0;
              stackIn_13_0 = stackOut_11_0;
              stackIn_12_0 = stackOut_11_0;
              if ((var5 & 1) == 0) {
                stackOut_13_0 = stackIn_13_0;
                stackOut_13_1 = var6;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                break L6;
              } else {
                stackOut_12_0 = stackIn_12_0;
                stackOut_12_1 = -var6;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                break L6;
              }
            }
            return stackIn_14_0 + stackIn_14_1;
          }
        } else {
          stackOut_4_0 = param0;
          stackIn_31_0 = stackOut_4_0;
          L7: {
            var7 = stackIn_31_0;
            if ((2 & var5) == 0) {
              stackOut_33_0 = var7;
              stackIn_34_0 = stackOut_33_0;
              break L7;
            } else {
              stackOut_32_0 = -var7;
              stackIn_34_0 = stackOut_32_0;
              break L7;
            }
          }
          L8: {
            stackOut_34_0 = stackIn_34_0;
            stackIn_36_0 = stackOut_34_0;
            stackIn_35_0 = stackOut_34_0;
            if ((var5 & 1) == 0) {
              stackOut_36_0 = stackIn_36_0;
              stackOut_36_1 = var6;
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              break L8;
            } else {
              stackOut_35_0 = stackIn_35_0;
              stackOut_35_1 = -var6;
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              break L8;
            }
          }
          return stackIn_37_0 + stackIn_37_1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "qf.A(";
        field_a = 0;
    }
}
