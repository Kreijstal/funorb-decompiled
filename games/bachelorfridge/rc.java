/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc extends k {
    static String field_k;
    static kv field_l;

    final int[] a(int param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        var6 = BachelorFridge.field_y;
        var7 = ((rc) this).field_j.a(param0, -1);
        var3 = var7;
        if (((rc) this).field_j.field_m) {
          var4 = ((rc) this).a(0, param0, (byte) 120);
          var5 = 0;
          L0: while (true) {
            if (hh.field_d <= var5) {
              if (param1 != 0) {
                return null;
              } else {
                return var3;
              }
            } else {
              var7[var5] = 4096 - var4[var5];
              var5++;
              continue L0;
            }
          }
        } else {
          if (param1 != 0) {
            return null;
          } else {
            return var3;
          }
        }
    }

    public static void d(int param0) {
        field_l = null;
        if (param0 != -2) {
            return;
        }
        field_k = null;
    }

    public rc() {
        super(1, false);
    }

    final static sba a(vr param0, byte param1, vr param2, String param3, String param4) {
        int var5 = 0;
        int var6 = 0;
        if (param1 != 113) {
          return null;
        } else {
          var5 = param2.a(param4, false);
          var6 = param2.a((byte) 6, var5, param3);
          return ev.a(128, var6, param2, param0, var5);
        }
    }

    final void a(byte param0, lu param1, int param2) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        if (param0 != -71) {
          return;
        } else {
          L0: {
            if (-1 != param2) {
              break L0;
            } else {
              L1: {
                stackOut_2_0 = this;
                stackIn_4_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (-2 != param1.b(16711935)) {
                  stackOut_4_0 = this;
                  stackOut_4_1 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  break L1;
                } else {
                  stackOut_3_0 = this;
                  stackOut_3_1 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  break L1;
                }
              }
              ((rc) this).field_f = stackIn_5_1 != 0;
              break L0;
            }
          }
          return;
        }
    }

    final int[][] a(boolean param0, int param1) {
        int[][] var3 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int[][] var13 = null;
        int[][] var15 = null;
        int[][] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[][] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[][] var30 = null;
        int[][] var34 = null;
        int[][] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[][] var39 = null;
        int[][] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        var12 = BachelorFridge.field_y;
        if (!param0) {
          var40 = ((rc) this).field_h.a(param1, -858);
          var30 = var40;
          var20 = var30;
          var15 = var20;
          var13 = var15;
          var3 = var13;
          if (((rc) this).field_h.field_b) {
            var39 = ((rc) this).a((byte) -91, 0, param1);
            var41 = var39[0];
            var42 = var39[1];
            var43 = var39[2];
            var8 = var40[0];
            var9 = var40[1];
            var10 = var40[2];
            var11 = 0;
            L0: while (true) {
              if (hh.field_d > var11) {
                var8[var11] = -var41[var11] + 4096;
                var9[var11] = -var42[var11] + 4096;
                var10[var11] = -var43[var11] + 4096;
                var11++;
                continue L0;
              } else {
                return var13;
              }
            }
          } else {
            return var13;
          }
        } else {
          field_l = null;
          var35 = ((rc) this).field_h.a(param1, -858);
          var25 = var35;
          var20 = var25;
          var15 = var20;
          var13 = var15;
          var3 = var13;
          if (((rc) this).field_h.field_b) {
            var34 = ((rc) this).a((byte) -91, 0, param1);
            var36 = var34[0];
            var26 = var36;
            var21 = var26;
            var37 = var34[1];
            var27 = var37;
            var22 = var27;
            var38 = var34[2];
            var28 = var38;
            var23 = var28;
            var8 = var35[0];
            var9 = var35[1];
            var10 = var35[2];
            var11 = 0;
            L1: while (true) {
              if (hh.field_d > var11) {
                var8[var11] = -var36[var11] + 4096;
                var9[var11] = -var37[var11] + 4096;
                var10[var11] = -var38[var11] + 4096;
                var11++;
                continue L1;
              } else {
                return var13;
              }
            }
          } else {
            return var13;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Achievements";
    }
}
