/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kba extends k {
    private int field_k;

    final void d(byte param0) {
        gea.a(4231);
        if (param0 != -68) {
            Object var3 = null;
            ((kba) this).a((byte) 21, (lu) null, 123);
        }
    }

    final void a(byte param0, lu param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackOut_14_0 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        var5 = BachelorFridge.field_y;
        if (param0 == -71) {
          var4 = param2;
          if (-1 != (var4 ^ -1)) {
            if (1 != var4) {
              return;
            } else {
              L0: {
                stackOut_14_0 = this;
                stackIn_16_0 = stackOut_14_0;
                stackIn_15_0 = stackOut_14_0;
                if (param1.b(16711935) != 1) {
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
              ((kba) this).field_f = stackIn_17_1 != 0;
              return;
            }
          } else {
            ((kba) this).field_k = param1.e((byte) 76) << 634121444;
            return;
          }
        } else {
          var6 = null;
          ((kba) this).a((byte) 39, (lu) null, -88);
          var4 = param2;
          if (-1 != (var4 ^ -1)) {
            L1: {
              if (1 == var4) {
                L2: {
                  stackOut_5_0 = this;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (param1.b(16711935) != 1) {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    break L2;
                  } else {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    break L2;
                  }
                }
                ((kba) this).field_f = stackIn_8_1 != 0;
                break L1;
              } else {
                break L1;
              }
            }
            return;
          } else {
            ((kba) this).field_k = param1.e((byte) 76) << 634121444;
            return;
          }
        }
    }

    final int[][] a(boolean param0, int param1) {
        int[][] var3 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var17 = 0;
        int[][] var18 = null;
        int[][] var19 = null;
        int[][] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[][] var28 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[][] var37 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[][] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[][] var44 = null;
        var17 = BachelorFridge.field_y;
        var37 = ((kba) this).field_h.a(param1, -858);
        var28 = var37;
        var23 = var28;
        var19 = var23;
        var18 = var19;
        var3 = var18;
        if (!param0) {
          if (((kba) this).field_h.field_b) {
            var42 = ((kba) this).a(1, param1, (byte) 109);
            var43 = ((kba) this).a(2, param1, (byte) 126);
            var6 = var37[0];
            var7 = var37[1];
            var8 = var37[2];
            var9 = 0;
            L0: while (true) {
              if (hh.field_d > var9) {
                var10 = 255 * var42[var9] >> 1423240172 & 255;
                var11 = var43[var9] * ((kba) this).field_k >> -1011297652;
                var12 = var11 * am.field_R[var10] >> -116138612;
                var13 = baa.field_z[var10] * var11 >> 306869932;
                var14 = var9 + (var12 >> 671536492) & wp.field_r;
                var15 = param1 + (var13 >> 2079965644) & it.field_r;
                var44 = ((kba) this).a((byte) -82, 0, var15);
                var6[var9] = var44[0][var14];
                var7[var9] = var44[1][var14];
                var8[var9] = var44[2][var14];
                var9++;
                continue L0;
              } else {
                return var18;
              }
            }
          } else {
            return var18;
          }
        } else {
          int[][] discarded$1 = ((kba) this).a(false, -31);
          if (((kba) this).field_h.field_b) {
            var39 = ((kba) this).a(1, param1, (byte) 109);
            var30 = var39;
            var24 = var30;
            var40 = ((kba) this).a(2, param1, (byte) 126);
            var31 = var40;
            var25 = var31;
            var6 = var37[0];
            var7 = var37[1];
            var8 = var37[2];
            var9 = 0;
            L1: while (true) {
              if (hh.field_d > var9) {
                var10 = 255 * var39[var9] >> 1423240172 & 255;
                var11 = var40[var9] * ((kba) this).field_k >> -1011297652;
                var12 = var11 * am.field_R[var10] >> -116138612;
                var13 = baa.field_z[var10] * var11 >> 306869932;
                var14 = var9 + (var12 >> 671536492) & wp.field_r;
                var15 = param1 + (var13 >> 2079965644) & it.field_r;
                var41 = ((kba) this).a((byte) -82, 0, var15);
                var6[var9] = var41[0][var14];
                var7[var9] = var41[1][var14];
                var8[var9] = var41[2][var14];
                var9++;
                continue L1;
              } else {
                return var18;
              }
            }
          } else {
            return var18;
          }
        }
    }

    public kba() {
        super(3, false);
        ((kba) this).field_k = 32768;
    }

    final int[] a(int param0, int param1) {
        int[] var3 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int[] var15 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        var14 = BachelorFridge.field_y;
        var15 = ((kba) this).field_j.a(param0, -1);
        var3 = var15;
        if (((kba) this).field_j.field_m) {
          var25 = ((kba) this).a(1, param0, (byte) 123);
          var26 = ((kba) this).a(2, param0, (byte) 108);
          var6 = 0;
          L0: while (true) {
            if (hh.field_d > var6) {
              var7 = var25[var6] >> 1329176772 & 255;
              var8 = ((kba) this).field_k * var26[var6] >> 1999941932;
              var9 = var8 * am.field_R[var7] >> -2080816180;
              var10 = baa.field_z[var7] * var8 >> -1104300852;
              var11 = wp.field_r & (var9 >> 1846540108) + var6;
              var12 = param0 - -(var10 >> -1011705844) & it.field_r;
              var27 = ((kba) this).a(0, var12, (byte) 105);
              var15[var6] = var27[var11];
              var6++;
              continue L0;
            } else {
              if (param1 != 0) {
                ((kba) this).field_k = -80;
                return var3;
              } else {
                return var3;
              }
            }
          }
        } else {
          if (param1 != 0) {
            ((kba) this).field_k = -80;
            return var3;
          } else {
            return var3;
          }
        }
    }

    final static String a(int param0, String param1) {
        int var2 = 0;
        Object var3 = null;
        L0: {
          var2 = de.d(hka.field_i, -257, hea.field_r);
          if ((var2 ^ -1) != -2) {
            break L0;
          } else {
            param1 = "<img=0>" + param1;
            break L0;
          }
        }
        if (param0 > -120) {
          L1: {
            var3 = null;
            String discarded$6 = kba.a(-83, (String) null);
            if (-3 == var2) {
              param1 = "<img=1>" + param1;
              break L1;
            } else {
              break L1;
            }
          }
          return param1;
        } else {
          L2: {
            if (-3 == var2) {
              param1 = "<img=1>" + param1;
              break L2;
            } else {
              break L2;
            }
          }
          return param1;
        }
    }

    static {
    }
}
