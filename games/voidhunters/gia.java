/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gia extends le {
    private boolean field_l;
    private int field_i;
    static eab field_k;
    static String field_j;

    final void a(int param0, int param1, ds param2) {
        int var4 = 0;
        int var5 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackOut_14_0 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        var5 = VoidHunters.field_G;
        if (param1 < -60) {
          var4 = param0;
          if (var4 != 0) {
            if ((var4 ^ -1) == -2) {
              L0: {
                stackOut_14_0 = this;
                stackIn_16_0 = stackOut_14_0;
                stackIn_15_0 = stackOut_14_0;
                if ((param2.e((byte) -118) ^ -1) != -2) {
                  stackOut_16_0 = this;
                  stackOut_16_1 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  break L0;
                } else {
                  stackOut_15_0 = this;
                  stackOut_15_1 = 1;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  break L0;
                }
              }
              ((gia) this).field_l = stackIn_17_1 != 0;
              return;
            } else {
              return;
            }
          } else {
            ((gia) this).field_i = param2.e(1869);
            return;
          }
        } else {
          field_k = null;
          var4 = param0;
          if (var4 == 0) {
            ((gia) this).field_i = param2.e(1869);
            return;
          } else {
            L1: {
              if ((var4 ^ -1) != -2) {
                break L1;
              } else {
                L2: {
                  stackOut_3_0 = this;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if ((param2.e((byte) -118) ^ -1) != -2) {
                    stackOut_5_0 = this;
                    stackOut_5_1 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    break L2;
                  } else {
                    stackOut_4_0 = this;
                    stackOut_4_1 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    break L2;
                  }
                }
                ((gia) this).field_l = stackIn_6_1 != 0;
                break L1;
              }
            }
            return;
          }
        }
    }

    public gia() {
        super(1, false);
        ((gia) this).field_i = 4096;
        ((gia) this).field_l = true;
    }

    final int[][] a(int param0, int param1) {
        int[][] var3 = null;
        int[] var5 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int[][] var22 = null;
        int[][] var23 = null;
        int[][] var29 = null;
        int[][] var35 = null;
        int[][] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        int[] var46 = null;
        var21 = VoidHunters.field_G;
        var41 = ((gia) this).field_d.a(param1, (byte) -85);
        var35 = var41;
        var29 = var35;
        var23 = var29;
        var22 = var23;
        var3 = var22;
        if (param0 == 255) {
          if (!((gia) this).field_d.field_g) {
            return var22;
          } else {
            var43 = ((gia) this).a(0, wf.field_d & param1 - 1, 255);
            var5 = ((gia) this).a(0, param1, 255);
            var42 = ((gia) this).a(0, 1 + param1 & wf.field_d, 255);
            var44 = var41[0];
            var45 = var41[1];
            var46 = var41[2];
            var10 = 0;
            L0: while (true) {
              if (hob.field_d <= var10) {
                return var22;
              } else {
                L1: {
                  var14 = ((gia) this).field_i * (var42[var10] - var43[var10]);
                  var15 = (var5[gbb.field_q & var10 - -1] - var5[gbb.field_q & -1 + var10]) * ((gia) this).field_i;
                  var16 = var15 >> 749562700;
                  var17 = var14 >> -426725108;
                  var18 = var16 * var16 >> -1497329268;
                  var19 = var17 * var17 >> -334275284;
                  var20 = (int)(Math.sqrt((double)((float)(4096 + (var19 + var18)) / 4096.0f)) * 4096.0);
                  if (var20 != 0) {
                    var12 = var14 / var20;
                    var13 = 16777216 / var20;
                    var11 = var15 / var20;
                    break L1;
                  } else {
                    var13 = 0;
                    var12 = 0;
                    var11 = 0;
                    break L1;
                  }
                }
                L2: {
                  if (!((gia) this).field_l) {
                    break L2;
                  } else {
                    var13 = 2048 - -(var13 >> -63435647);
                    var11 = 2048 + (var11 >> -111119967);
                    var12 = 2048 - -(var12 >> 2111853921);
                    break L2;
                  }
                }
                var44[var10] = var11;
                var45[var10] = var12;
                var46[var10] = var13;
                var10++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    public static void a(boolean param0) {
        field_j = null;
        field_k = null;
        if (param0) {
            gia.a(true);
        }
    }

    final static int d(int param0) {
        if (param0 != -2) {
            field_j = null;
            return rpa.field_b;
        }
        return rpa.field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Boosters";
    }
}
