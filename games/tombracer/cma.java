/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cma extends ci {
    private int field_p;
    private int field_r;
    private int field_q;
    private int[] field_o;
    static int field_m;
    private int field_n;

    final static su[] c(int param0) {
        int var1 = 23 % ((-4 - param0) / 36);
        return new su[]{uk.field_M, ula.field_v, csa.field_y, ll.field_d, sga.field_n, bi.field_d, dp.field_g, wc.field_e, vna.field_a, wsa.field_v, al.field_f, kea.field_c, lfa.field_o, oc.field_H};
    }

    public cma() {
        super(1, false);
        ((cma) this).field_p = 4096;
        ((cma) this).field_q = 4096;
        ((cma) this).field_o = new int[3];
        ((cma) this).field_r = 4096;
        ((cma) this).field_n = 409;
    }

    final void a(byte param0, uia param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        if (param0 == 107) {
          var5 = param2;
          if (var5 != 0) {
            if (var5 != 1) {
              if (2 != var5) {
                if (-4 != (var5 ^ -1)) {
                  if (4 == var5) {
                    var4 = param1.a(-32768);
                    ((cma) this).field_o[2] = sea.c(var4, 255) >> -1933885940;
                    ((cma) this).field_o[0] = sea.c(267386880, var4 << -721881788);
                    ((cma) this).field_o[1] = sea.c(4080, var4 >> 456341860);
                    return;
                  } else {
                    return;
                  }
                } else {
                  ((cma) this).field_q = param1.d(123);
                  return;
                }
              } else {
                ((cma) this).field_r = param1.d(param0 + 20);
                return;
              }
            } else {
              ((cma) this).field_p = param1.d(124);
              return;
            }
          } else {
            ((cma) this).field_n = param1.d(param0 ^ 17);
            return;
          }
        } else {
          var7 = null;
          ((cma) this).a((byte) -33, (uia) null, 70);
          var5 = param2;
          if (var5 != 0) {
            if (var5 != 1) {
              if (2 != var5) {
                if (-4 != (var5 ^ -1)) {
                  if (4 != var5) {
                    return;
                  } else {
                    var4 = param1.a(-32768);
                    ((cma) this).field_o[2] = sea.c(var4, 255) >> -1933885940;
                    ((cma) this).field_o[0] = sea.c(267386880, var4 << -721881788);
                    ((cma) this).field_o[1] = sea.c(4080, var4 >> 456341860);
                    return;
                  }
                } else {
                  ((cma) this).field_q = param1.d(123);
                  return;
                }
              } else {
                ((cma) this).field_r = param1.d(param0 + 20);
                return;
              }
            } else {
              ((cma) this).field_p = param1.d(124);
              return;
            }
          } else {
            ((cma) this).field_n = param1.d(param0 ^ 17);
            return;
          }
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
        int var16 = 0;
        int[][] var17 = null;
        int[][] var19 = null;
        int[] var21 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[][] var27 = null;
        int[] var29 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[][] var35 = null;
        int[] var37 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[][] var42 = null;
        int[][] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        int[] var49 = null;
        var16 = TombRacer.field_G ? 1 : 0;
        var43 = ((cma) this).field_h.a(param0, (byte) 122);
        var35 = var43;
        var27 = var35;
        var19 = var27;
        var17 = var19;
        var3 = var17;
        if (param1 == -1) {
          if (((cma) this).field_h.field_f) {
            var42 = ((cma) this).a(param0, 0, -1);
            var44 = var42[0];
            var46 = var42[1];
            var47 = var42[2];
            var45 = var43[0];
            var37 = var45;
            var29 = var37;
            var21 = var29;
            var8 = var21;
            var48 = var43[1];
            var40 = var48;
            var32 = var40;
            var24 = var32;
            var9 = var24;
            var49 = var43[2];
            var41 = var49;
            var33 = var41;
            var25 = var33;
            var10 = var25;
            var11 = 0;
            L0: while (true) {
              if (ns.field_g <= var11) {
                return var3;
              } else {
                L1: {
                  var13 = var44[var11];
                  var12 = var13 - ((cma) this).field_o[0];
                  if (0 > var12) {
                    var12 = -var12;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                if (((cma) this).field_n < var12) {
                  var45 = var43[0];
                  var46 = var42[1];
                  var48 = var43[1];
                  var45[var11] = var13;
                  var9[var11] = var46[var11];
                  var10[var11] = var47[var11];
                  var11++;
                  var11++;
                  continue L0;
                } else {
                  L2: {
                    var45 = var43[0];
                    var46 = var42[1];
                    var48 = var43[1];
                    var14 = var46[var11];
                    var12 = -((cma) this).field_o[1] + var14;
                    if (var12 < 0) {
                      var12 = -var12;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  if (((cma) this).field_n >= var12) {
                    L3: {
                      var15 = var47[var11];
                      var12 = -((cma) this).field_o[2] + var15;
                      if (-1 < (var12 ^ -1)) {
                        var12 = -var12;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    if (var12 > ((cma) this).field_n) {
                      var45[var11] = var13;
                      var48[var11] = var14;
                      var49[var11] = var15;
                      var11++;
                      continue L0;
                    } else {
                      var8[var11] = var13 * ((cma) this).field_q >> -2111631668;
                      var9[var11] = var14 * ((cma) this).field_r >> -1020975412;
                      var10[var11] = ((cma) this).field_p * var15 >> -1598030036;
                      var11++;
                      continue L0;
                    }
                  } else {
                    var45[var11] = var13;
                    var48[var11] = var14;
                    var10[var11] = var47[var11];
                    var11++;
                    var11++;
                    continue L0;
                  }
                }
              }
            }
          } else {
            return var3;
          }
        } else {
          return null;
        }
    }

    static {
    }
}
