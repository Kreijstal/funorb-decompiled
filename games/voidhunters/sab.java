/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sab extends rqa {
    static int field_o;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
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
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int[] var39 = null;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        int var47 = 0;
        int[] var48 = null;
        int[] var49 = null;
        int[] var50 = null;
        int[] var51 = null;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        var47 = VoidHunters.field_G;
        var8 = 0;
        var9 = param1;
        var10 = 0;
        var11 = param2 + -param5;
        var12 = param1 + -param5;
        var13 = param2 * param2;
        var14 = param1 * param1;
        var15 = var11 * var11;
        var16 = var12 * var12;
        var17 = var14 << 921547905;
        var18 = var13 << 2037485057;
        var19 = var16 << -779836255;
        var20 = var15 << -483815647;
        var21 = param1 << 404474721;
        var22 = var12 << 996034113;
        var23 = var17 + var13 * (1 - var21);
        var24 = -((-1 + var21) * var18) + var14;
        var25 = var19 + var15 * (1 - var22);
        var26 = -(var20 * (var22 + -1)) + var16;
        var27 = var13 << -125148606;
        var28 = var14 << 340418562;
        var29 = var15 << -706511262;
        var30 = var16 << 2109724354;
        var31 = 3 * var17;
        var32 = var18 * (var21 + -3);
        var33 = 3 * var19;
        var34 = (var22 + -3) * var20;
        var35 = var28;
        var36 = var27 * (-1 + param1);
        var37 = var30;
        var38 = (var12 - 1) * var29;
        var51 = rba.field_b[param3];
        var50 = var51;
        var49 = var50;
        var48 = var49;
        var39 = var48;
        ww.a(param6, -var11 + param4, var39, (byte) 75, param4 + -param2);
        ww.a(param0, param4 + var11, var51, (byte) 75, param4 - var11);
        ww.a(param6, param4 + param2, var51, (byte) 75, param4 + var11);
        L0: while (true) {
          if (-1 <= var9) {
            if (param7 != 21601) {
              field_o = -43;
              return;
            } else {
              return;
            }
          } else {
            L1: {
              if (var12 < var9) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              var40 = stackIn_5_0;
              if (-1 > var23) {
                L3: while (true) {
                  if (-1 >= (var23 ^ -1)) {
                    break L2;
                  } else {
                    var23 = var23 + var31;
                    var24 = var24 + var35;
                    var35 = var35 + var28;
                    var31 = var31 + var28;
                    var8++;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            L4: {
              if (var40 == 0) {
                break L4;
              } else {
                L5: {
                  if (0 > var25) {
                    L6: while (true) {
                      if (0 <= var25) {
                        break L5;
                      } else {
                        var25 = var25 + var33;
                        var26 = var26 + var37;
                        var37 = var37 + var30;
                        var10++;
                        var33 = var33 + var30;
                        continue L6;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                L7: {
                  if (var26 >= 0) {
                    break L7;
                  } else {
                    var26 = var26 + var37;
                    var25 = var25 + var33;
                    var10++;
                    var33 = var33 + var30;
                    var37 = var37 + var30;
                    break L7;
                  }
                }
                var25 = var25 + -var38;
                var26 = var26 + -var34;
                var38 = var38 - var29;
                var34 = var34 - var29;
                break L4;
              }
            }
            L8: {
              if (var24 >= 0) {
                break L8;
              } else {
                var23 = var23 + var31;
                var24 = var24 + var35;
                var31 = var31 + var28;
                var35 = var35 + var28;
                var8++;
                break L8;
              }
            }
            var23 = var23 + -var36;
            var24 = var24 + -var32;
            var36 = var36 - var27;
            var9--;
            var32 = var32 - var27;
            var41 = -var9 + param3;
            var42 = param3 + var9;
            var43 = param4 - -var8;
            var44 = param4 - var8;
            if (var40 != 0) {
              var45 = var10 + param4;
              var46 = -var10 + param4;
              ww.a(param6, var46, rba.field_b[var41], (byte) 75, var44);
              ww.a(param0, var45, rba.field_b[var41], (byte) 75, var46);
              ww.a(param6, var43, rba.field_b[var41], (byte) 75, var45);
              ww.a(param6, var46, rba.field_b[var42], (byte) 75, var44);
              ww.a(param0, var45, rba.field_b[var42], (byte) 75, var46);
              ww.a(param6, var43, rba.field_b[var42], (byte) 75, var45);
              continue L0;
            } else {
              ww.a(param6, var43, rba.field_b[var41], (byte) 75, var44);
              ww.a(param6, var43, rba.field_b[var42], (byte) 75, var44);
              continue L0;
            }
          }
        }
    }

    final static boolean e(byte param0) {
        int var1 = 26 % ((-51 - param0) / 45);
        if (!(gpb.a("jaclib", (byte) 114))) {
            return false;
        }
        return gpb.a("hw3d", (byte) 114);
    }

    final static boolean[] a(boolean[] param0, int param1, boolean[] param2) {
        if (param1 == -31567) {
          if (param2 == null) {
            return null;
          } else {
            L0: {
              L1: {
                if (param0 == null) {
                  break L1;
                } else {
                  if (param2.length != param0.length) {
                    break L1;
                  } else {
                    break L0;
                  }
                }
              }
              param0 = new boolean[param2.length];
              break L0;
            }
            cua.a(param2, 0, param0, 0, param2.length);
            return param0;
          }
        } else {
          field_o = 43;
          if (param2 != null) {
            if (param0 != null) {
              if (param2.length != param0.length) {
                param0 = new boolean[param2.length];
                cua.a(param2, 0, param0, 0, param2.length);
                return param0;
              } else {
                cua.a(param2, 0, param0, 0, param2.length);
                return param0;
              }
            } else {
              param0 = new boolean[param2.length];
              cua.a(param2, 0, param0, 0, param2.length);
              return param0;
            }
          } else {
            return null;
          }
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          field_o = -92;
          return new nc((Object) (Object) frb.a(23, 118));
        } else {
          return new nc((Object) (Object) frb.a(23, 118));
        }
    }

    sab(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
