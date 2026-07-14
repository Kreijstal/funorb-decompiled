/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h {
    static String[][] field_b;
    static String field_c;
    static String field_d;
    static String field_a;
    static hd field_e;
    static String field_f;

    final static bb a(int param0, tc param1, hd param2, hd param3, hd param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        bb[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        tc var13_ref = null;
        int var14 = 0;
        int var15 = 0;
        bg var16 = null;
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
        var17 = Kickabout.field_G;
        if (param1 != null) {
          L0: {
            if (param1.field_o != null) {
              stackOut_4_0 = param1.field_o.length;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var5 = stackIn_5_0;
            if (param1.field_n != null) {
              stackOut_7_0 = param1.field_n.length;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = 0;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          var6 = stackIn_8_0;
          var7 = var5 - -var6;
          var8 = new String[var7];
          var25 = new char[var7];
          var23 = var25;
          var21 = var23;
          var19 = var21;
          var9 = var19;
          var24 = new int[var7];
          var22 = var24;
          var20 = var22;
          var18 = var20;
          var10 = var18;
          var11 = new bb[var7];
          if (param0 == 0) {
            L2: {
              if (param1.field_o == null) {
                break L2;
              } else {
                var12 = 0;
                L3: while (true) {
                  if (var12 >= param1.field_o.length) {
                    break L2;
                  } else {
                    var13_ref = vc.field_x.a(200, param1.field_o[var12]);
                    var8[var12] = var13_ref.field_r;
                    var9[var12] = param1.field_q[var12];
                    var11[var12] = h.a(0, var13_ref, param2, param3, param4);
                    var12++;
                    continue L3;
                  }
                }
              }
            }
            L4: {
              if (null == param1.field_n) {
                break L4;
              } else {
                var12 = var5;
                var13 = 49;
                var14 = 0;
                L5: while (true) {
                  if (param1.field_n.length <= var14) {
                    break L4;
                  } else {
                    var15 = param1.field_n[var14];
                    if ((var15 ^ -1) == 0) {
                      var8[var14 + var12] = vp.field_b;
                      var9[var12 + var14] = param1.field_p[var14];
                      var10[var12 - -var14] = param1.field_n[var14];
                      var14++;
                      continue L5;
                    } else {
                      L6: {
                        var16 = lm.field_j.a(param0 ^ 6, var15);
                        var8[var14 + var12] = var16.g((byte) -105);
                        var9[var14 + var12] = param1.field_p[var14];
                        if (var9[var12 + var14] <= 0) {
                          var13 = (char)(var13 + 1);
                          var9[var14 + var12] = (char)var13;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var10[var12 + var14] = param1.field_n[var14];
                      var14++;
                      continue L5;
                    }
                  }
                }
              }
            }
            return new bb(0L, param3, param2, param4, var11, var24, var8, var25);
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static tv a(int param0) {
        if (-1 == (vb.field_j ^ -1)) {
            return null;
        }
        if (param0 != 17475) {
            return null;
        }
        return fu.field_b[-1 + vb.field_j];
    }

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
        field_e = null;
        field_f = null;
        field_d = null;
        if (param0) {
            field_d = null;
        }
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Loading street";
        field_b = new String[][]{new String[4], new String[4], new String[4]};
        field_c = "Multiplayer Lobby";
        field_a = "<%0>: Hide Chat";
    }
}
