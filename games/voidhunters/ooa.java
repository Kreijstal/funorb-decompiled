/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ooa extends llb {
    private llb[] field_yb;
    private llb[] field_vb;
    int field_Ab;
    private llb field_wb;
    static String field_zb;
    static int field_xb;

    ooa(long param0, llb param1, String[] param2, llb param3, llb[] param4, int param5) {
        super(param0, (llb) null);
        int var8 = 0;
        llb var9 = null;
        ((ooa) this).field_yb = new llb[param2.length];
        ((ooa) this).field_wb = new llb(0L, param3);
        ((ooa) this).field_vb = param4;
        for (var8 = 0; var8 < param2.length; var8++) {
            var9 = new llb(0L, param1);
            var9.field_R = param2[var8];
            ((ooa) this).field_yb[var8] = var9;
            ((ooa) this).b(-561, var9);
        }
        ((ooa) this).b(-561, ((ooa) this).field_wb);
        int var11 = 0;
        var8 = var11;
        while (param4.length > var11) {
            ((ooa) this).field_wb.b(-561, param4[var11]);
            var11++;
        }
        ((ooa) this).field_Ab = param5;
        ((ooa) this).field_yb[param5].field_J = true;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((ooa) this).field_hb = param1;
        ((ooa) this).field_K = param0;
        ((ooa) this).field_G = param5;
        ((ooa) this).field_L = param6;
        this.a(param3, (byte) -107, param2);
        int var8 = -32 % ((param4 - 15) / 35);
    }

    public static void h(int param0) {
        if (param0 <= 18) {
            return;
        }
        field_zb = null;
    }

    private final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var7 = VoidHunters.field_G;
        var4 = 0;
        L0: while (true) {
          if (var4 >= ((ooa) this).field_yb.length) {
            ((ooa) this).field_wb.a(0, -65, ((ooa) this).field_hb, param2, ((ooa) this).field_G + -param2);
            var8 = 0;
            var4 = var8;
            L1: while (true) {
              if (((ooa) this).field_vb.length <= var8) {
                L2: {
                  if (param1 == -107) {
                    break L2;
                  } else {
                    this.a(-69, (byte) 80, 46);
                    break L2;
                  }
                }
                return;
              } else {
                ((ooa) this).field_vb[var8].a(param0, -48, -(param0 * 2) + ((ooa) this).field_wb.field_hb, param0, -(2 * param0) + ((ooa) this).field_wb.field_G);
                if (var8 != ((ooa) this).field_Ab) {
                  ((ooa) this).field_vb[var8].field_L = ((ooa) this).field_vb[var8].field_L + 10000;
                  var8++;
                  continue L1;
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            var5 = ((ooa) this).field_hb * var4 / ((ooa) this).field_yb.length;
            var6 = (var4 - -1) * ((ooa) this).field_hb / ((ooa) this).field_yb.length;
            ((ooa) this).field_yb[var4].field_L = var5;
            ((ooa) this).field_yb[var4].field_K = 0;
            ((ooa) this).field_yb[var4].field_hb = -var5 + var6;
            ((ooa) this).field_yb[var4].field_G = param2;
            var4++;
            continue L0;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
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
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        L0: {
          L1: {
            var35 = VoidHunters.field_G;
            if (param2 != param9) {
              break L1;
            } else {
              if (param3 != param6) {
                break L1;
              } else {
                if (param5 != param0) {
                  break L1;
                } else {
                  if (param1 == param7) {
                    ew.a(param3, param5, (byte) 52, param9, param1, param8);
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          var10 = param9;
          var11 = param3;
          var12 = 3 * param9;
          var13 = 3 * param3;
          var14 = 3 * param2;
          var15 = param6 * 3;
          var16 = 3 * param0;
          var17 = 3 * param7;
          var18 = var14 + param5 - var16 + -param9;
          var19 = -var17 + (param1 - -var15) - param3;
          var20 = -var14 + var16 + (-var14 - -var12);
          var21 = -var15 + -var15 + (var17 - -var13);
          var22 = var14 - var12;
          var23 = -var13 + var15;
          var24 = 128;
          L2: while (true) {
            if (-4097 > (var24 ^ -1)) {
              break L0;
            } else {
              var25 = var24 * var24 >> -103430388;
              var26 = var24 * var25 >> -1202127092;
              var27 = var26 * var18;
              var28 = var19 * var26;
              var29 = var20 * var25;
              var30 = var25 * var21;
              var31 = var22 * var24;
              var32 = var24 * var23;
              var33 = param9 + (var31 + var29 + var27 >> 878526252);
              var34 = param3 - -(var32 + (var30 + var28) >> -291127220);
              ew.a(var11, var33, (byte) 110, var10, var34, param8);
              var11 = var34;
              var10 = var33;
              // wide iinc 24 128
              continue L2;
            }
          }
        }
        L3: {
          if (param4 == -17572) {
            break L3;
          } else {
            ooa.h(79);
            break L3;
          }
        }
    }

    final void i(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = VoidHunters.field_G;
          if (param0 == 10000) {
            break L0;
          } else {
            ((ooa) this).field_vb = null;
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (var2 >= ((ooa) this).field_yb.length) {
            return;
          } else {
            if (var2 != ((ooa) this).field_Ab) {
              if (((ooa) this).field_yb[var2].field_o != 0) {
                ((ooa) this).field_yb[((ooa) this).field_Ab].field_J = false;
                ((ooa) this).field_vb[((ooa) this).field_Ab].field_L = ((ooa) this).field_vb[((ooa) this).field_Ab].field_L + 10000;
                ((ooa) this).field_Ab = var2;
                ((ooa) this).field_yb[var2].field_J = true;
                ((ooa) this).field_vb[var2].field_L = ((ooa) this).field_vb[var2].field_L - 10000;
                var2++;
                continue L1;
              } else {
                var2++;
                continue L1;
              }
            } else {
              var2++;
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_zb = "You have not yet unlocked this option for use.";
        field_xb = 8;
    }
}
