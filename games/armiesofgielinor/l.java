/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l {
    static String field_h;
    static String field_e;
    static ru[] field_b;
    static om field_c;
    static String field_g;
    static rc field_a;
    static String field_d;
    static String field_f;

    final static mq a(va param0, je param1, int param2, je param3, je param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        mq[] var11 = null;
        int var12 = 0;
        va var13_ref_va = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        ar var16 = null;
        int var17 = 0;
        int[] var18 = null;
        char[] var19 = null;
        int[] var20 = null;
        char[] var21 = null;
        int[] var22 = null;
        char[] var23 = null;
        int[] var24 = null;
        char[] var25 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        mq stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        mq stackOut_27_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var17 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                if (param0.field_C == null) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = param0.field_C.length;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              L2: {
                var5_int = stackIn_7_0;
                if (null == param0.field_y) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = param0.field_y.length;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              L3: {
                var6 = stackIn_10_0;
                var7 = var6 + var5_int;
                var8 = new String[var7];
                var25 = new char[var7];
                var23 = var25;
                var21 = var23;
                var19 = var21;
                var9 = var19;
                if (param2 == 0) {
                  break L3;
                } else {
                  field_g = null;
                  break L3;
                }
              }
              L4: {
                var24 = new int[var7];
                var22 = var24;
                var20 = var22;
                var18 = var20;
                var10 = var18;
                var11 = new mq[var7];
                if (null != param0.field_C) {
                  var12 = 0;
                  L5: while (true) {
                    if (var12 >= param0.field_C.length) {
                      break L4;
                    } else {
                      var13_ref_va = mp.field_Sb.a(param0.field_C[var12], true);
                      var8[var12] = var13_ref_va.field_E;
                      var9[var12] = param0.field_x[var12];
                      var11[var12] = l.a(var13_ref_va, param1, 0, param3, param4);
                      var12++;
                      continue L5;
                    }
                  }
                } else {
                  break L4;
                }
              }
              L6: {
                if (param0.field_y == null) {
                  break L6;
                } else {
                  var12 = var5_int;
                  var13 = 49;
                  var14 = 0;
                  L7: while (true) {
                    if (param0.field_y.length <= var14) {
                      break L6;
                    } else {
                      L8: {
                        var15 = param0.field_y[var14];
                        if (var15 != -1) {
                          L9: {
                            var16 = ce.field_K.a(var15, 98);
                            var8[var12 - -var14] = var16.d((byte) 97);
                            var9[var14 + var12] = param0.field_v[var14];
                            if (var9[var12 - -var14] <= 0) {
                              var13 = (char)(var13 + 1);
                              var9[var12 - -var14] = (char)var13;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var10[var14 + var12] = param0.field_y[var14];
                          break L8;
                        } else {
                          var8[var14 + var12] = oj.field_x;
                          var9[var12 + var14] = param0.field_v[var14];
                          var10[var14 + var12] = param0.field_y[var14];
                          break L8;
                        }
                      }
                      var14++;
                      continue L7;
                    }
                  }
                }
              }
              stackOut_27_0 = new mq(0L, param4, param1, param3, var11, var24, var8, var25);
              stackIn_28_0 = stackOut_27_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var5;
            stackOut_29_1 = new StringBuilder().append("l.A(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L10;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L10;
            }
          }
          L11: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(44);
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L11;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L11;
            }
          }
          L12: {
            stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(44).append(param2).append(44);
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param3 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L12;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L12;
            }
          }
          L13: {
            stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
            stackOut_38_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(44);
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param4 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L13;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L13;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 41);
        }
        return stackIn_28_0;
    }

    public static void a(boolean param0) {
        field_g = null;
        field_a = null;
        field_e = null;
        field_h = null;
        field_f = null;
        field_d = null;
        field_b = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Results";
        field_e = "Equipment Store";
        field_h = "You do not have a suitable number of players for the current options.";
        field_f = "Play rated game";
        field_d = "Message team";
    }
}
