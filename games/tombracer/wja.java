/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wja extends ci {
    private int field_m;
    private int field_n;
    static String field_o;

    final static void a(String param0, int param1) {
        rv.field_c.field_r = param0;
        uv.field_o = true;
        int var2 = gn.field_C.field_f;
        int var3 = gn.field_C.field_e;
        if (param1 != 15165) {
            return;
        }
        int var4 = rv.field_c.field_H.a(param0, 272, rv.field_c.field_P);
        int var5 = -(var4 / 2) + (-103 + var3 / 2);
        wo.field_k.a(320, -(2 * var5) + (var3 - 120), -23776, var5, (-320 + var2) / 2);
        wo.field_k.field_w = hca.c(wo.field_k.field_t, 2105376, 3, 11579568, -118, 8421504);
        rv.field_c.a(-24 + (wo.field_k.field_G + -24), -20 + wo.field_k.field_t + -24, -23776, 16, 24);
        bma.field_v.a(80, 24, param1 ^ -26595, -24 + wo.field_k.field_t - 20, 120);
    }

    final void a(byte param0, uia param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          var4 = param2;
          if (-1 != (var4 ^ -1)) {
            if (1 == var4) {
              ((wja) this).field_m = param1.d(param0 + 16);
              break L0;
            } else {
              if (2 != var4) {
                break L0;
              } else {
                L1: {
                  stackOut_7_0 = this;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (-2 != (param1.h(255) ^ -1)) {
                    stackOut_9_0 = this;
                    stackOut_9_1 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    break L1;
                  } else {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    break L1;
                  }
                }
                ((wja) this).field_g = stackIn_10_1 != 0;
                break L0;
              }
            }
          } else {
            ((wja) this).field_n = param1.d(127);
            break L0;
          }
        }
        L2: {
          if (param0 == 107) {
            break L2;
          } else {
            ((wja) this).field_n = 41;
            break L2;
          }
        }
    }

    public static void c(int param0) {
        if (param0 != 0) {
            return;
        }
        field_o = null;
    }

    public wja() {
        super(1, false);
        ((wja) this).field_n = 0;
        ((wja) this).field_m = 4096;
    }

    final static void d(byte param0) {
        if (param0 != 96) {
            field_o = null;
        }
    }

    final int[][] b(int param0, int param1) {
        int[][] var3 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[][] var16 = null;
        int[][] var18 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[][] var26 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[][] var34 = null;
        int[] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[][] var41 = null;
        int[][] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        var15 = TombRacer.field_G ? 1 : 0;
        if (param1 == -1) {
          L0: {
            var42 = ((wja) this).field_h.a(param0, (byte) 18);
            var34 = var42;
            var26 = var34;
            var18 = var26;
            var16 = var18;
            var3 = var16;
            if (!((wja) this).field_h.field_f) {
              break L0;
            } else {
              var41 = ((wja) this).a(param0, 0, param1 ^ 0);
              var43 = var41[0];
              var44 = var41[1];
              var45 = var41[2];
              var46 = var42[0];
              var38 = var46;
              var30 = var38;
              var22 = var30;
              var8 = var22;
              var47 = var42[1];
              var39 = var47;
              var31 = var39;
              var23 = var31;
              var9 = var23;
              var48 = var42[2];
              var40 = var48;
              var32 = var40;
              var24 = var32;
              var10 = var24;
              var11 = 0;
              L1: while (true) {
                if (var11 >= ns.field_g) {
                  break L0;
                } else {
                  L2: {
                    var12 = var43[var11];
                    var13 = var44[var11];
                    var14 = var45[var11];
                    if (((wja) this).field_n <= var12) {
                      if (var12 > ((wja) this).field_m) {
                        var8[var11] = ((wja) this).field_m;
                        break L2;
                      } else {
                        var46[var11] = var12;
                        break L2;
                      }
                    } else {
                      var8[var11] = ((wja) this).field_n;
                      break L2;
                    }
                  }
                  L3: {
                    if (var13 < ((wja) this).field_n) {
                      var9[var11] = ((wja) this).field_n;
                      break L3;
                    } else {
                      if (((wja) this).field_m >= var13) {
                        var47[var11] = var13;
                        break L3;
                      } else {
                        var9[var11] = ((wja) this).field_m;
                        break L3;
                      }
                    }
                  }
                  if (var14 >= ((wja) this).field_n) {
                    if (((wja) this).field_m < var14) {
                      var10[var11] = ((wja) this).field_m;
                      var11++;
                      continue L1;
                    } else {
                      var48[var11] = var14;
                      var11++;
                      continue L1;
                    }
                  } else {
                    var10[var11] = ((wja) this).field_n;
                    var11++;
                    continue L1;
                  }
                }
              }
            }
          }
          return var3;
        } else {
          return null;
        }
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          var3 = ((wja) this).field_i.a((byte) 84, param1);
          if (param0 == 1) {
            break L0;
          } else {
            wja.c(18);
            break L0;
          }
        }
        L1: {
          if (!((wja) this).field_i.field_d) {
            break L1;
          } else {
            var4 = ((wja) this).c(0, -101, param1);
            var5 = 0;
            L2: while (true) {
              if (var5 >= ns.field_g) {
                break L1;
              } else {
                var6 = var4[var5];
                if (((wja) this).field_n <= var6) {
                  if (var6 <= ((wja) this).field_m) {
                    var3[var5] = var6;
                    var5++;
                    continue L2;
                  } else {
                    var3[var5] = ((wja) this).field_m;
                    var5++;
                    continue L2;
                  }
                } else {
                  var3[var5] = ((wja) this).field_n;
                  var5++;
                  continue L2;
                }
              }
            }
          }
        }
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Please Log In";
    }
}
