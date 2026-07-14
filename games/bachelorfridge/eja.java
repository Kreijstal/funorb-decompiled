/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eja extends ana {
    private nb field_v;
    static kv field_w;

    final boolean c(byte param0) {
        ad var2 = ((eja) this).field_v.field_l.a(-27449, ((eja) this).field_q);
        int var3 = 61 / ((param0 - 71) / 47);
        ((eja) this).field_l = ((eja) this).field_l - 1;
        if (!(0 > ((eja) this).field_l - 1)) {
            if (!(((eja) this).field_l != 25)) {
                this.e((byte) 94);
            }
            if (((eja) this).field_l != 45) {
                return false;
            }
            var2.b(-1, 20);
            id.e(49, var2.field_s.field_o.field_e);
            return false;
        }
        this.d(107);
        return true;
    }

    private final void d(int param0) {
        if (param0 <= 57) {
            field_w = null;
        }
    }

    private final void e(byte param0) {
        aga var2 = null;
        pp var3 = null;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        var2 = ((eja) this).field_v.field_l.a(73, ((eja) this).field_q.field_h);
        if (!var2.i(82)) {
          if (param0 == 94) {
            var3 = (pp) (Object) ((eja) this).field_v.field_o.b((byte) 90);
            oha discarded$19 = al.a(99, ((eja) this).field_v.field_k);
            L0: while (true) {
              if (var3 == null) {
                return;
              } else {
                var3.a(var2, ((eja) this).field_q.field_h, 12);
                var3 = (pp) (Object) ((eja) this).field_v.field_o.c(0);
                continue L0;
              }
            }
          } else {
            boolean discarded$20 = ((eja) this).c((byte) 60);
            var3 = (pp) (Object) ((eja) this).field_v.field_o.b((byte) 90);
            oha discarded$21 = al.a(99, ((eja) this).field_v.field_k);
            L1: while (true) {
              if (var3 == null) {
                return;
              } else {
                var3.a(var2, ((eja) this).field_q.field_h, 12);
                var3 = (pp) (Object) ((eja) this).field_v.field_o.c(0);
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    eja(gj param0, nb param1) {
        super(param0, (bca) (Object) param1);
        ((eja) this).field_v = param1;
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        int var17 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        int[] var46 = null;
        int[] var48 = null;
        int[] var49 = null;
        int[] var50 = null;
        int[] var51 = null;
        int[] var52 = null;
        int[] var53 = null;
        int[] var54 = null;
        int[] var55 = null;
        int stackIn_22_0 = 0;
        int stackIn_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        var25 = BachelorFridge.field_y;
        if (param0 == -60) {
          L0: {
            gp.a(true, param1);
            var7 = 0;
            var8 = -param2 + param1;
            if (-1 < (var8 ^ -1)) {
              var8 = 0;
              break L0;
            } else {
              break L0;
            }
          }
          var9 = param1;
          var10 = -param1;
          var11 = var8;
          var12 = -var8;
          var13 = -1;
          var14 = -1;
          var55 = tj.field_b[param3];
          var16 = param6 + -var8;
          hba.a(param4, param6 - param1, var55, param0 + 67, var16);
          var17 = param6 - -var8;
          hba.a(param5, var16, var55, 7, var17);
          hba.a(param4, var17, var55, param0 ^ -61, param1 + param6);
          L1: while (true) {
            if (var9 <= var7) {
              return;
            } else {
              L2: {
                var13 += 2;
                var14 += 2;
                var12 = var12 + var14;
                var10 = var10 + var13;
                if (0 > var12) {
                  break L2;
                } else {
                  if (-2 >= (var11 ^ -1)) {
                    it.field_l[var11] = var7;
                    var11--;
                    var12 = var12 - (var11 << 1343124225);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                var7++;
                if (var10 >= 0) {
                  var9--;
                  var10 = var10 - (var9 << 579710817);
                  if (var8 > var9) {
                    var50 = tj.field_b[param3 + var9];
                    var51 = tj.field_b[-var9 + param3];
                    var20 = it.field_l[var9];
                    var21 = param6 - -var7;
                    var22 = -var7 + param6;
                    var23 = var20 + param6;
                    var24 = -var20 + param6;
                    hba.a(param4, var22, var50, param0 ^ -61, var24);
                    hba.a(param5, var24, var50, 7, var23);
                    hba.a(param4, var23, var50, 7, var21);
                    hba.a(param4, var22, var51, 7, var24);
                    hba.a(param5, var24, var51, 7, var23);
                    hba.a(param4, var23, var51, 7, var21);
                    break L3;
                  } else {
                    var48 = tj.field_b[param3 + var9];
                    var49 = tj.field_b[-var9 + param3];
                    var20 = var7 + param6;
                    var21 = param6 - var7;
                    hba.a(param4, var21, var48, 7, var20);
                    hba.a(param4, var21, var49, 7, var20);
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              var52 = tj.field_b[var7 + param3];
              var53 = tj.field_b[-var7 + param3];
              var20 = param6 + var9;
              var21 = -var9 + param6;
              if (var7 < var8) {
                L4: {
                  if (var11 < var7) {
                    stackOut_41_0 = it.field_l[var7];
                    stackIn_42_0 = stackOut_41_0;
                    break L4;
                  } else {
                    stackOut_40_0 = var11;
                    stackIn_42_0 = stackOut_40_0;
                    break L4;
                  }
                }
                var22 = stackIn_42_0;
                var23 = var22 + param6;
                var24 = -var22 + param6;
                hba.a(param4, var21, var52, param0 + 67, var24);
                hba.a(param5, var24, var52, param0 + 67, var23);
                hba.a(param4, var23, var52, 7, var20);
                hba.a(param4, var21, var53, param0 + 67, var24);
                hba.a(param5, var24, var53, 7, var23);
                hba.a(param4, var23, var53, 7, var20);
                continue L1;
              } else {
                hba.a(param4, var21, var52, param0 ^ -61, var20);
                hba.a(param4, var21, var53, 7, var20);
                continue L1;
              }
            }
          }
        } else {
          L5: {
            field_w = null;
            gp.a(true, param1);
            var7 = 0;
            var8 = -param2 + param1;
            if (-1 < (var8 ^ -1)) {
              var8 = 0;
              break L5;
            } else {
              break L5;
            }
          }
          var9 = param1;
          var10 = -param1;
          var11 = var8;
          var12 = -var8;
          var13 = -1;
          var14 = -1;
          var54 = tj.field_b[param3];
          var16 = param6 + -var8;
          hba.a(param4, param6 - param1, var54, param0 + 67, var16);
          var17 = param6 - -var8;
          hba.a(param5, var16, var54, 7, var17);
          hba.a(param4, var17, var54, param0 ^ -61, param1 + param6);
          L6: while (true) {
            if (var9 > var7) {
              L7: {
                var13 += 2;
                var14 += 2;
                var12 = var12 + var14;
                var10 = var10 + var13;
                if (0 > var12) {
                  break L7;
                } else {
                  if (-2 >= (var11 ^ -1)) {
                    it.field_l[var11] = var7;
                    var11--;
                    var12 = var12 - (var11 << 1343124225);
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              L8: {
                var7++;
                if (var10 >= 0) {
                  var9--;
                  var10 = var10 - (var9 << 579710817);
                  if (var8 > var9) {
                    var43 = tj.field_b[param3 + var9];
                    var44 = tj.field_b[-var9 + param3];
                    var20 = it.field_l[var9];
                    var21 = param6 - -var7;
                    var22 = -var7 + param6;
                    var23 = var20 + param6;
                    var24 = -var20 + param6;
                    hba.a(param4, var22, var43, param0 ^ -61, var24);
                    hba.a(param5, var24, var43, 7, var23);
                    hba.a(param4, var23, var43, 7, var21);
                    hba.a(param4, var22, var44, 7, var24);
                    hba.a(param5, var24, var44, 7, var23);
                    hba.a(param4, var23, var44, 7, var21);
                    break L8;
                  } else {
                    var41 = tj.field_b[param3 + var9];
                    var42 = tj.field_b[-var9 + param3];
                    var20 = var7 + param6;
                    var21 = param6 - var7;
                    hba.a(param4, var21, var41, 7, var20);
                    hba.a(param4, var21, var42, 7, var20);
                    break L8;
                  }
                } else {
                  break L8;
                }
              }
              var45 = tj.field_b[var7 + param3];
              var46 = tj.field_b[-var7 + param3];
              var20 = param6 + var9;
              var21 = -var9 + param6;
              if (var7 < var8) {
                L9: {
                  if (var11 < var7) {
                    stackOut_21_0 = it.field_l[var7];
                    stackIn_22_0 = stackOut_21_0;
                    break L9;
                  } else {
                    stackOut_20_0 = var11;
                    stackIn_22_0 = stackOut_20_0;
                    break L9;
                  }
                }
                var22 = stackIn_22_0;
                var23 = var22 + param6;
                var24 = -var22 + param6;
                hba.a(param4, var21, var45, param0 + 67, var24);
                hba.a(param5, var24, var45, param0 + 67, var23);
                hba.a(param4, var23, var45, 7, var20);
                hba.a(param4, var21, var46, param0 + 67, var24);
                hba.a(param5, var24, var46, 7, var23);
                hba.a(param4, var23, var46, 7, var20);
                continue L6;
              } else {
                hba.a(param4, var21, var45, param0 ^ -61, var20);
                hba.a(param4, var21, var46, 7, var20);
                continue L6;
              }
            } else {
              return;
            }
          }
        }
    }

    public static void e(int param0) {
        if (param0 < 94) {
            field_w = null;
            field_w = null;
            return;
        }
        field_w = null;
    }

    static {
    }
}
