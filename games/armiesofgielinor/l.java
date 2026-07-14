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
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        mq[] var11 = null;
        int var12 = 0;
        va var13_ref = null;
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
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var17 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 != null) {
          L0: {
            if (param0.field_C == null) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = param0.field_C.length;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var5 = stackIn_5_0;
            if (null == param0.field_y) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = param0.field_y.length;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          L2: {
            var6 = stackIn_8_0;
            var7 = var6 + var5;
            var8 = new String[var7];
            var25 = new char[var7];
            var23 = var25;
            var21 = var23;
            var19 = var21;
            var9 = var19;
            if (param2 == 0) {
              break L2;
            } else {
              field_g = null;
              break L2;
            }
          }
          L3: {
            var24 = new int[var7];
            var22 = var24;
            var20 = var22;
            var18 = var20;
            var10 = var18;
            var11 = new mq[var7];
            if (null != param0.field_C) {
              var12 = 0;
              L4: while (true) {
                if (var12 >= param0.field_C.length) {
                  break L3;
                } else {
                  var13_ref = mp.field_Sb.a(param0.field_C[var12], true);
                  var8[var12] = var13_ref.field_E;
                  var9[var12] = param0.field_x[var12];
                  var11[var12] = l.a(var13_ref, param1, 0, param3, param4);
                  var12++;
                  continue L4;
                }
              }
            } else {
              break L3;
            }
          }
          L5: {
            if (param0.field_y == null) {
              break L5;
            } else {
              var12 = var5;
              var13 = 49;
              var14 = 0;
              L6: while (true) {
                if (param0.field_y.length <= var14) {
                  break L5;
                } else {
                  var15 = param0.field_y[var14];
                  if (0 != (var15 ^ -1)) {
                    L7: {
                      var16 = ce.field_K.a(var15, 98);
                      var8[var12 - -var14] = var16.d((byte) 97);
                      var9[var14 + var12] = param0.field_v[var14];
                      if (-1 <= (var9[var12 - -var14] ^ -1)) {
                        var13 = (char)(var13 + 1);
                        var9[var12 - -var14] = (char)var13;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var10[var14 + var12] = param0.field_y[var14];
                    var14++;
                    continue L6;
                  } else {
                    var8[var14 + var12] = oj.field_x;
                    var9[var12 + var14] = param0.field_v[var14];
                    var10[var14 + var12] = param0.field_y[var14];
                    var14++;
                    continue L6;
                  }
                }
              }
            }
          }
          return new mq(0L, param4, param1, param3, var11, var24, var8, var25);
        } else {
          return null;
        }
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
