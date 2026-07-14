/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oba extends k {
    private boolean field_k;
    private boolean field_l;

    final int[][] a(boolean param0, int param1) {
        int[][] var3 = null;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int[][] var13 = null;
        int[][] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[][] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[][] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[][] var29 = null;
        int[][] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        L0: {
          var12 = BachelorFridge.field_y;
          var30 = ((oba) this).field_h.a(param1, -858);
          var25 = var30;
          var20 = var25;
          var15 = var20;
          var13 = var15;
          var3 = var13;
          if (((oba) this).field_h.field_b) {
            L1: {
              stackOut_2_0 = this;
              stackOut_2_1 = -80;
              stackOut_2_2 = 0;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_4_2 = stackOut_2_2;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              stackIn_3_2 = stackOut_2_2;
              if (((oba) this).field_l) {
                stackOut_4_0 = this;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = stackIn_4_2;
                stackOut_4_3 = -param1 + it.field_r;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                stackIn_5_2 = stackOut_4_2;
                stackIn_5_3 = stackOut_4_3;
                break L1;
              } else {
                stackOut_3_0 = this;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = stackIn_3_2;
                stackOut_3_3 = param1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_5_2 = stackOut_3_2;
                stackIn_5_3 = stackOut_3_3;
                break L1;
              }
            }
            var29 = ((oba) this).a((byte) stackIn_5_1, stackIn_5_2, stackIn_5_3);
            var31 = var29[0];
            var26 = var31;
            var21 = var26;
            var16 = var21;
            var5 = var16;
            var32 = var29[1];
            var27 = var32;
            var22 = var27;
            var17 = var22;
            var6 = var17;
            var33 = var29[2];
            var28 = var33;
            var23 = var28;
            var18 = var23;
            var7 = var18;
            var8 = var30[0];
            var9 = var30[1];
            var10 = var30[2];
            if (((oba) this).field_k) {
              var11 = 0;
              L2: while (true) {
                if (hh.field_d <= var11) {
                  break L0;
                } else {
                  var8[var11] = var5[wp.field_r + -var11];
                  var9[var11] = var6[-var11 + wp.field_r];
                  var10[var11] = var7[-var11 + wp.field_r];
                  var11++;
                  continue L2;
                }
              }
            } else {
              var11 = 0;
              L3: while (true) {
                if (var11 >= hh.field_d) {
                  break L0;
                } else {
                  var8[var11] = var31[var11];
                  var9[var11] = var32[var11];
                  var10[var11] = var33[var11];
                  var11++;
                  continue L3;
                }
              }
            }
          } else {
            break L0;
          }
        }
        if (!param0) {
          return var3;
        } else {
          return null;
        }
    }

    public oba() {
        super(1, false);
        ((oba) this).field_k = true;
        ((oba) this).field_l = true;
    }

    final static void d(int param0) {
        int var1 = pfa.c(26858);
        int var2 = bv.a((byte) -71);
        if (param0 != -1488922239) {
            return;
        }
        it.field_s.a(var2 + (lda.field_a << -1488922239), 56, -fh.field_v + io.field_p, ql.field_s + -lda.field_a, var1 + (fh.field_v << -161976671));
        pfa.b(param0 ^ -1488922240);
    }

    final int[] a(int param0, int param1) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = BachelorFridge.field_y;
        int[] var7 = ((oba) this).field_j.a(param0, -1);
        int[] var3 = var7;
        if (!((oba) this).field_j.field_m) {
        } else {
            var4 = ((oba) this).a(0, ((oba) this).field_l ? -param0 + it.field_r : param0, (byte) 109);
            if (!((oba) this).field_k) {
                bl.a(var4, 0, var7, 0, hh.field_d);
            } else {
                for (var5 = 0; hh.field_d > var5; var5++) {
                    var3[var5] = var4[wp.field_r + -var5];
                }
            }
        }
        if (param1 != 0) {
            oba.d(13);
        }
        return var3;
    }

    final void a(byte param0, lu param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_12_0 = null;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        L0: {
          var5 = BachelorFridge.field_y;
          if (param0 == -71) {
            break L0;
          } else {
            ((oba) this).field_k = false;
            break L0;
          }
        }
        L1: {
          var4 = param2;
          if (0 != var4) {
            if (1 != var4) {
              if (-3 != (var4 ^ -1)) {
                break L1;
              } else {
                L2: {
                  stackOut_16_0 = this;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_17_0 = stackOut_16_0;
                  if (-2 != param1.b(16711935)) {
                    stackOut_18_0 = this;
                    stackOut_18_1 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    break L2;
                  } else {
                    stackOut_17_0 = this;
                    stackOut_17_1 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    break L2;
                  }
                }
                ((oba) this).field_f = stackIn_19_1 != 0;
                break L1;
              }
            } else {
              L3: {
                stackOut_12_0 = this;
                stackIn_14_0 = stackOut_12_0;
                stackIn_13_0 = stackOut_12_0;
                if (-2 != param1.b(16711935)) {
                  stackOut_14_0 = this;
                  stackOut_14_1 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  break L3;
                } else {
                  stackOut_13_0 = this;
                  stackOut_13_1 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  break L3;
                }
              }
              ((oba) this).field_l = stackIn_15_1 != 0;
              break L1;
            }
          } else {
            L4: {
              stackOut_8_0 = this;
              stackIn_10_0 = stackOut_8_0;
              stackIn_9_0 = stackOut_8_0;
              if (1 != param1.b(16711935)) {
                stackOut_10_0 = this;
                stackOut_10_1 = 0;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                break L4;
              } else {
                stackOut_9_0 = this;
                stackOut_9_1 = 1;
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                break L4;
              }
            }
            ((oba) this).field_k = stackIn_11_1 != 0;
            break L1;
          }
        }
    }

    static {
    }
}
