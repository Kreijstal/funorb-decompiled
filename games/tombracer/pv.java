/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pv extends ci {
    private boolean field_o;
    static String field_q;
    static String[] field_p;
    static String field_m;
    private boolean field_n;

    final void a(byte param0, uia param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_15_0 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_11_0 = null;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          if (param0 == 107) {
            break L0;
          } else {
            field_q = null;
            break L0;
          }
        }
        L1: {
          var4 = param2;
          if (var4 == 0) {
            L2: {
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (-2 != param1.h(param0 ^ 148)) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L2;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L2;
              }
            }
            ((pv) this).field_o = stackIn_10_1 != 0;
            break L1;
          } else {
            if (1 != var4) {
              if (var4 != -3) {
                break L1;
              } else {
                L3: {
                  stackOut_15_0 = this;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_16_0 = stackOut_15_0;
                  if (param1.h(255) != 1) {
                    stackOut_17_0 = this;
                    stackOut_17_1 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    break L3;
                  } else {
                    stackOut_16_0 = this;
                    stackOut_16_1 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    break L3;
                  }
                }
                ((pv) this).field_g = stackIn_18_1 != 0;
                break L1;
              }
            } else {
              L4: {
                stackOut_11_0 = this;
                stackIn_13_0 = stackOut_11_0;
                stackIn_12_0 = stackOut_11_0;
                if (1 != param1.h(255)) {
                  stackOut_13_0 = this;
                  stackOut_13_1 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  break L4;
                } else {
                  stackOut_12_0 = this;
                  stackOut_12_1 = 1;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  break L4;
                }
              }
              ((pv) this).field_n = stackIn_14_1 != 0;
              break L1;
            }
          }
        }
    }

    public pv() {
        super(1, false);
        ((pv) this).field_o = true;
        ((pv) this).field_n = true;
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        L0: {
          var6 = TombRacer.field_G ? 1 : 0;
          if (param0 == 1) {
            break L0;
          } else {
            int[][] discarded$2 = ((pv) this).b(52, -14);
            break L0;
          }
        }
        L1: {
          var7 = ((pv) this).field_i.a((byte) -114, param1);
          var3 = var7;
          if (!((pv) this).field_i.field_d) {
            break L1;
          } else {
            L2: {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackOut_3_2 = param0 ^ -17;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              stackIn_4_2 = stackOut_3_2;
              if (((pv) this).field_n) {
                stackOut_5_0 = this;
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = stackIn_5_2;
                stackOut_5_3 = hba.field_b - param1;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                stackIn_6_2 = stackOut_5_2;
                stackIn_6_3 = stackOut_5_3;
                break L2;
              } else {
                stackOut_4_0 = this;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = stackIn_4_2;
                stackOut_4_3 = param1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_6_2 = stackOut_4_2;
                stackIn_6_3 = stackOut_4_3;
                break L2;
              }
            }
            var4 = ((pv) this).c(stackIn_6_1, stackIn_6_2, stackIn_6_3);
            if (!((pv) this).field_o) {
              lua.a(var4, 0, var7, 0, ns.field_g);
              break L1;
            } else {
              var5 = 0;
              L3: while (true) {
                if (var5 >= ns.field_g) {
                  break L1;
                } else {
                  var7[var5] = var4[-var5 + una.field_b];
                  var5++;
                  continue L3;
                }
              }
            }
          }
        }
        return var3;
    }

    final int[][] b(int param0, int param1) {
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
        int var14 = 0;
        int[][] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[][] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[][] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[][] var30 = null;
        int[][] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        L0: {
          var12 = TombRacer.field_G ? 1 : 0;
          if (param1 == -1) {
            break L0;
          } else {
            field_p = null;
            break L0;
          }
        }
        L1: {
          var31 = ((pv) this).field_h.a(param0, (byte) 120);
          var26 = var31;
          var21 = var26;
          var16 = var21;
          var13 = var16;
          var3 = var13;
          if (!((pv) this).field_h.field_f) {
            break L1;
          } else {
            L2: {
              stackOut_3_0 = this;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (!((pv) this).field_n) {
                stackOut_5_0 = this;
                stackOut_5_1 = param0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = this;
                stackOut_4_1 = -param0 + hba.field_b;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            var30 = ((pv) this).a(stackIn_6_1, 0, param1 ^ 0);
            var32 = var30[0];
            var27 = var32;
            var22 = var27;
            var17 = var22;
            var5 = var17;
            var33 = var30[1];
            var28 = var33;
            var23 = var28;
            var18 = var23;
            var6 = var18;
            var34 = var30[2];
            var29 = var34;
            var24 = var29;
            var19 = var24;
            var7 = var19;
            var8 = var31[0];
            var9 = var31[1];
            var10 = var31[2];
            if (!((pv) this).field_o) {
              var14 = 0;
              var11 = var14;
              L3: while (true) {
                if (ns.field_g <= var14) {
                  break L1;
                } else {
                  var8[var14] = var32[var14];
                  var9[var14] = var33[var14];
                  var10[var14] = var34[var14];
                  var14++;
                  continue L3;
                }
              }
            } else {
              var11 = 0;
              L4: while (true) {
                if (var11 >= ns.field_g) {
                  break L1;
                } else {
                  var8[var11] = var5[una.field_b + -var11];
                  var9[var11] = var6[una.field_b + -var11];
                  var10[var11] = var7[una.field_b + -var11];
                  var11++;
                  continue L4;
                }
              }
            }
          }
        }
        return var3;
    }

    public static void d(byte param0) {
        field_p = null;
        field_m = null;
        if (param0 > -80) {
            field_m = null;
        }
        field_q = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_m = "Password is valid";
        field_q = "Playing";
    }
}
