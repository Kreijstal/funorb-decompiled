/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nt extends tc {
    int field_q;
    int field_r;
    static String field_p;
    int[][] field_n;
    boolean field_l;
    int field_k;
    String[][] field_t;
    int field_o;
    int field_s;
    int field_m;

    public static void a(byte param0) {
        field_p = null;
        if (param0 != 97) {
            field_p = null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        wk stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        wk stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        wk stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        wk stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        wk stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        wk stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        int stackIn_18_4 = 0;
        int stackOut_5_0 = 0;
        wk stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        wk stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        wk stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        wk stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        wk stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        int stackOut_17_4 = 0;
        wk stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        int stackOut_16_4 = 0;
        L0: {
          var9 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 == 894) {
            break L0;
          } else {
            nt.a((byte) 82);
            break L0;
          }
        }
        L1: {
          if (cu.field_a) {
            var5 = param1 & 3;
            param1 = param1 | param1 << 589217800;
            var6 = 0;
            L2: while (true) {
              L3: {
                stackOut_5_0 = var6;
                stackIn_8_0 = stackOut_5_0;
                stackIn_6_0 = stackOut_5_0;
                if (!cu.field_a) {
                  if (stackIn_8_0 >= 1) {
                    break L1;
                  } else {
                    break L3;
                  }
                } else {
                  if (stackIn_6_0 >= 4) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                var7 = (((15 & param1) + 15) * param2 / 16 + var6 * 20 - -(param1 & 15)) % 320;
                var8 = 0;
                if (64 > var7) {
                  var8 = -var7 + 64 << -1044545695;
                  break L4;
                } else {
                  var8 = var7 - 64 >> 1864204449;
                  break L4;
                }
              }
              L5: {
                stackOut_12_0 = vf.field_j[var5];
                stackOut_12_1 = param3;
                stackOut_12_2 = param4 + -(var7 / 4);
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_14_2 = stackOut_12_2;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                stackIn_13_2 = stackOut_12_2;
                if (cu.field_a) {
                  stackOut_14_0 = (wk) (Object) stackIn_14_0;
                  stackOut_14_1 = stackIn_14_1;
                  stackOut_14_2 = stackIn_14_2;
                  stackOut_14_3 = 1;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  stackIn_15_3 = stackOut_14_3;
                  break L5;
                } else {
                  stackOut_13_0 = (wk) (Object) stackIn_13_0;
                  stackOut_13_1 = stackIn_13_1;
                  stackOut_13_2 = stackIn_13_2;
                  stackOut_13_3 = 2;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  stackIn_15_3 = stackOut_13_3;
                  break L5;
                }
              }
              L6: {
                fe.a((wk) (Object) stackIn_15_0, stackIn_15_1, stackIn_15_2, stackIn_15_3 * (-var8 + 128));
                param1 = param1 >> 2;
                stackOut_15_0 = vf.field_j[4 + var5];
                stackOut_15_1 = var5 + param3;
                stackOut_15_2 = -(var7 / 4) + param4;
                stackOut_15_3 = 64 + -(var8 / 2);
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_17_2 = stackOut_15_2;
                stackIn_17_3 = stackOut_15_3;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                stackIn_16_2 = stackOut_15_2;
                stackIn_16_3 = stackOut_15_3;
                if (cu.field_a) {
                  stackOut_17_0 = (wk) (Object) stackIn_17_0;
                  stackOut_17_1 = stackIn_17_1;
                  stackOut_17_2 = stackIn_17_2;
                  stackOut_17_3 = stackIn_17_3;
                  stackOut_17_4 = 1;
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  stackIn_18_3 = stackOut_17_3;
                  stackIn_18_4 = stackOut_17_4;
                  break L6;
                } else {
                  stackOut_16_0 = (wk) (Object) stackIn_16_0;
                  stackOut_16_1 = stackIn_16_1;
                  stackOut_16_2 = stackIn_16_2;
                  stackOut_16_3 = stackIn_16_3;
                  stackOut_16_4 = 2;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  stackIn_18_3 = stackOut_16_3;
                  stackIn_18_4 = stackOut_16_4;
                  break L6;
                }
              }
              ((wk) (Object) stackIn_18_0).f(stackIn_18_1, stackIn_18_2, stackIn_18_3 * stackIn_18_4);
              var5 = 3 & (var5 ^ param1);
              var6++;
              continue L2;
            }
          } else {
            fe.a(vf.field_j[3 & param1], param3, param4);
            param1 = param1 >> 2;
            vf.field_j[(3 & param1) + 4].f(param3, -4 + param4, 128);
            break L1;
          }
        }
    }

    final static String a(int param0, String param1) {
        int var2 = kl.c(tf.field_l, -76, hi.field_j);
        if (!(var2 != -2)) {
            param1 = "<img=0>" + param1;
        }
        if (-3 == var2) {
            param1 = "<img=1>" + param1;
        }
        int var3 = 103 % ((param0 - -62) / 38);
        return param1;
    }

    nt() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Yes";
    }
}
