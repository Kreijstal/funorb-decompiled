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
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        mq stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
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
        var17 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                if (param0.field_C == null) {
                  stackIn_7_0 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = param0.field_C.length;
                  break L1;
                }
              }
              L2: {
                var5_int = stackIn_7_0;
                if (null == param0.field_y) {
                  stackIn_10_0 = 0;
                  break L2;
                } else {
                  stackIn_10_0 = param0.field_y.length;
                  break L2;
                }
              }
              L3: {
                var6 = stackIn_10_0;
                var7 = var6 + var5_int;
                var8 = new String[var7];
                var21 = new char[var7];
                var19 = var21;
                var9 = var19;
                if (param2 == 0) {
                  break L3;
                } else {
                  field_g = (String) null;
                  break L3;
                }
              }
              L4: {
                var20 = new int[var7];
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
                        if (0 != (var15 ^ -1)) {
                          L9: {
                            var16 = ce.field_K.a(var15, 98);
                            var8[var12 - -var14] = var16.d((byte) 97);
                            var9[var14 + var12] = param0.field_v[var14];
                            if (-1 <= (var9[var12 - -var14] ^ -1)) {
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
              stackIn_28_0 = new mq(0L, param4, param1, param3, var11, var20, var8, var21);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var5);

            stackIn_31_1 = new StringBuilder().append("l.A(");

            if (param0 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L10;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_34_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');

            if (param1 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L11;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_37_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L12;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_40_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',');

            if (param4 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L13;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L13;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_32_0), stackIn_41_2 + ')');
        }
        return stackIn_28_0;
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
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
        field_g = "Results";
        field_e = "Equipment Store";
        field_h = "You do not have a suitable number of players for the current options.";
        field_f = "Play rated game";
        field_d = "Message team";
    }
}
