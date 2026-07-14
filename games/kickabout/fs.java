/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fs {
    static int field_b;
    static String field_c;
    static String[] field_a;

    public static void a(int param0) {
        if (param0 > -80) {
            fs.a((byte) 122);
            field_a = null;
            field_c = null;
            return;
        }
        field_a = null;
        field_c = null;
    }

    final static ut[] a(int param0, int param1, int param2, int param3, int param4, byte param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        ut var9 = null;
        ut var10 = null;
        ut var11 = null;
        ut var14 = null;
        int[] var15 = null;
        int[] var17 = null;
        int[] var18 = null;
        ut var19 = null;
        ut var20 = null;
        ut var21 = null;
        int[] var22 = null;
        ut var23 = null;
        ut var24 = null;
        ut var25 = null;
        int[] var26 = null;
        var26 = on.field_a;
        var22 = var26;
        var18 = var22;
        var17 = var18;
        var15 = var17;
        var6 = var15;
        var7 = on.field_g;
        var8 = on.field_f;
        var9 = new ut(param1, param0 + -(param1 * 2));
        var9.e();
        on.g(0, 0, param1, -(2 * param1) + param0, param3, param4);
        var10 = new ut(param1, param1);
        var10.e();
        on.a(0, 0, param1, param1, param3);
        var11 = new ut(16, param1);
        var11.e();
        on.a(0, 0, 16, param1, param3);
        if (param5 <= 77) {
          L0: {
            field_a = null;
            var19 = new ut(param1, param1);
            var19.e();
            on.a(0, 0, param1, param1, param4);
            var20 = new ut(16, param1);
            var20.e();
            on.a(0, 0, 16, param1, param4);
            var14 = null;
            if (-1 <= (param2 ^ -1)) {
              break L0;
            } else {
              var21 = new ut(16, 16);
              var14 = var21;
              var21.e();
              on.a(0, 0, 16, 16, param2);
              break L0;
            }
          }
          on.a(var26, var7, var8);
          return new ut[]{var10, var11, var10, var9, var14, var9, var19, var20, var19};
        } else {
          L1: {
            var23 = new ut(param1, param1);
            var23.e();
            on.a(0, 0, param1, param1, param4);
            var24 = new ut(16, param1);
            var24.e();
            on.a(0, 0, 16, param1, param4);
            var14 = null;
            if (-1 <= (param2 ^ -1)) {
              break L1;
            } else {
              var25 = new ut(16, 16);
              var14 = var25;
              var25.e();
              on.a(0, 0, 16, 16, param2);
              break L1;
            }
          }
          on.a(var26, var7, var8);
          return new ut[]{var10, var11, var10, var9, var14, var9, var23, var24, var23};
        }
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, ml param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var10 = 59 % ((-62 - param0) / 61);
        var10 = param7.l(2, 59);
        if (-1 != (var10 ^ -1)) {
          if (var10 != -2) {
            if (-3 != var10) {
              if ((var10 ^ -1) != -4) {
                throw new IllegalStateException();
              } else {
                L0: {
                  if (0 != param8) {
                    stackOut_24_0 = aq.a(param8, -30273, param7);
                    stackIn_25_0 = stackOut_24_0;
                    break L0;
                  } else {
                    stackOut_23_0 = 0;
                    stackIn_25_0 = stackOut_23_0;
                    break L0;
                  }
                }
                L1: {
                  var11 = stackIn_25_0;
                  var12 = param1 + param6 + param2;
                  if (0 <= var11) {
                    stackOut_27_0 = var12 + var11;
                    stackIn_28_0 = stackOut_27_0;
                    break L1;
                  } else {
                    stackOut_26_0 = var11 + -var12;
                    stackIn_28_0 = stackOut_26_0;
                    break L1;
                  }
                }
                return stackIn_28_0;
              }
            } else {
              L2: {
                if (0 == param3) {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L2;
                } else {
                  stackOut_15_0 = aq.a(param3, -30273, param7);
                  stackIn_17_0 = stackOut_15_0;
                  break L2;
                }
              }
              L3: {
                var11 = stackIn_17_0;
                var12 = param2 + param1;
                if (0 <= var11) {
                  stackOut_19_0 = var11 - -var12;
                  stackIn_20_0 = stackOut_19_0;
                  break L3;
                } else {
                  stackOut_18_0 = var11 - var12;
                  stackIn_20_0 = stackOut_18_0;
                  break L3;
                }
              }
              return stackIn_20_0;
            }
          } else {
            L4: {
              if (param4 == 0) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L4;
              } else {
                stackOut_7_0 = aq.a(param4, -30273, param7);
                stackIn_9_0 = stackOut_7_0;
                break L4;
              }
            }
            L5: {
              var11 = stackIn_9_0;
              var12 = param1;
              if (-1 < (var11 ^ -1)) {
                stackOut_11_0 = -var12 + var11;
                stackIn_12_0 = stackOut_11_0;
                break L5;
              } else {
                stackOut_10_0 = var12 + var11;
                stackIn_12_0 = stackOut_10_0;
                break L5;
              }
            }
            return stackIn_12_0;
          }
        } else {
          L6: {
            if (0 == param9) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L6;
            } else {
              stackOut_2_0 = aq.a(param9, -30273, param7);
              stackIn_4_0 = stackOut_2_0;
              break L6;
            }
          }
          return stackIn_4_0;
        }
    }

    final static void a(int param0, gm param1, int param2) {
        ui.g(0).a(param1, param0, true);
        if (param2 < 103) {
            field_c = null;
        }
    }

    final static void a(byte param0) {
        if (param0 == -126) {
          if (up.field_p != 0 + -qt.field_l) {
            if (up.field_p == -qt.field_l + 250) {
              up.field_p = up.field_p + 1;
              return;
            } else {
              up.field_p = up.field_p + 1;
              return;
            }
          } else {
            up.field_p = up.field_p + 1;
            return;
          }
        } else {
          field_a = null;
          if (up.field_p != 0 + -qt.field_l) {
            if (up.field_p == -qt.field_l + 250) {
              up.field_p = up.field_p + 1;
              return;
            } else {
              up.field_p = up.field_p + 1;
              return;
            }
          } else {
            up.field_p = up.field_p + 1;
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Staff impersonation";
        field_b = -1;
    }
}
