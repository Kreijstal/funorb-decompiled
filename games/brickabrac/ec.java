/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec extends ib implements en {
    static int field_J;
    static String field_L;
    private int[] field_T;
    private d[] field_I;
    private int field_M;
    static boolean field_O;
    static tg field_P;
    static int[] field_N;
    private String field_R;
    static String field_S;
    private dh field_H;
    private lp field_K;
    static ki field_Q;

    final void a(boolean param0, String param1, int param2) {
        if (param0) {
            Object var5 = null;
            ((ec) this).a(117, -42, (byte) 27, -108, (d) null);
        }
        int var4 = ((ec) this).field_M;
        this.a((byte) -106, 1 + var4);
        ((ec) this).field_I[var4] = ((ec) this).a((byte) 126, param1, (uh) this);
        ((ec) this).field_T[var4] = param2;
    }

    public final void a(int param0, int param1, byte param2, int param3, d param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = BrickABrac.field_J ? 1 : 0;
        for (var6 = 0; var6 < ((ec) this).field_M; var6++) {
            if (param4 == ((ec) this).field_I[var6]) {
                var7 = ((ec) this).field_T[var6];
                if (var7 == -1) {
                    ((ec) this).field_K.m(17);
                    break;
                }
                bd.a(((ec) this).field_T[var6], true);
                break;
            }
        }
        if (param2 > -22) {
            field_O = false;
        }
    }

    final static void h(int param0) {
        lm.a(-1);
        cg.field_l = true;
        sa.field_E = true;
        mf.field_f.a(-126);
        if (param0 != 6846) {
            ec.a(-62);
        }
        pq.a(0, gf.field_b, false);
    }

    final void a(int param0, int param1, int param2, byte param3) {
        super.a(param0, param1, param2, param3);
        int discarded$0 = ((ec) this).field_H.a(((ec) this).field_R, 14 + (param1 - -((ec) this).field_o), 10 + (param0 - -((ec) this).field_w), ((ec) this).field_t - 28, ((ec) this).field_s, 16777215, -1, 0, 0, ((ec) this).field_H.field_F);
    }

    final d a(byte param0, String param1, uh param2) {
        int var4 = -104 / ((param0 - 89) / 37);
        d var5 = new d(param1, param2);
        var5.field_l = (ub) (Object) new hi();
        int var6 = ((ec) this).field_s + -2;
        ((ec) this).a(34 + ((ec) this).field_s, 0, 0, (byte) -119, ((ec) this).field_t);
        var5.a(30, 7, var6, (byte) -119, -14 + ((ec) this).field_t);
        ((ec) this).a((oc) (Object) var5, true);
        return var5;
    }

    private final void a(byte param0, int param1) {
        int var5 = 0;
        int var6 = BrickABrac.field_J ? 1 : 0;
        if (!(param1 > ((ec) this).field_M)) {
            return;
        }
        d[] var7 = new d[param1];
        d[] var3 = var7;
        int[] var4 = new int[param1];
        for (var5 = 0; var5 < ((ec) this).field_M; var5++) {
            var7[var5] = ((ec) this).field_I[var5];
            var4[var5] = ((ec) this).field_T[var5];
        }
        ((ec) this).field_T = var4;
        if (param0 > -54) {
            return;
        }
        ((ec) this).field_I = var3;
        ((ec) this).field_M = param1;
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        jp var17 = null;
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
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        L0: {
          var31 = BrickABrac.field_J ? 1 : 0;
          var8 = param2 + (-param1 + -param7);
          var9 = -param7 + param4 - param1;
          var10 = param1 + (param2 + param7);
          if (lb.field_f >= var10) {
            break L0;
          } else {
            var10 = lb.field_f;
            break L0;
          }
        }
        L1: {
          if (lb.field_i <= var8) {
            break L1;
          } else {
            var8 = lb.field_i;
            break L1;
          }
        }
        L2: {
          var11 = param4 + param1 + param7;
          if (var9 < lb.field_b) {
            var9 = lb.field_b;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (var11 > lb.field_j) {
            var11 = lb.field_j;
            break L3;
          } else {
            break L3;
          }
        }
        var35 = new int[32];
        var34 = var35;
        var33 = var34;
        var32 = var33;
        var12 = var32;
        var13 = 16711935 & param0;
        var14 = 65280 & param0;
        var15 = 0;
        L4: while (true) {
          if (var15 >= 16) {
            L5: {
              var15 = var10 - var8;
              var16 = -var9 + var11;
              if (param3 == 99) {
                break L5;
              } else {
                field_O = false;
                break L5;
              }
            }
            L6: {
              if (var15 <= 0) {
                break L6;
              } else {
                if ((var16 ^ -1) >= -1) {
                  break L6;
                } else {
                  var17 = new jp(var15, var16);
                  var18 = param1 * param1;
                  var19 = (param7 + param1) * (param7 + param1);
                  var20 = 0;
                  var21 = -param4 + var9;
                  var22 = 0;
                  L7: while (true) {
                    if (var22 >= var16) {
                      var17.d(var8, var9);
                      lb.b(param2 << 115531684, param4 << 1836466148, param7 + param1 << -1406578268, 255, var35);
                      return;
                    } else {
                      var23 = -param2 + var8;
                      var24 = var23 * var23 + var21 * var21;
                      var25 = 0;
                      L8: while (true) {
                        if (var25 >= var15) {
                          var22++;
                          var21++;
                          continue L7;
                        } else {
                          L9: {
                            var26 = var22 + var9;
                            var27 = var25 + var8;
                            if (-1 != (var24 ^ -1)) {
                              if (var24 < var18) {
                                L10: {
                                  var28 = ap.a(var24 << -1374747828, -55);
                                  var29 = (param1 << -994024410) - var28;
                                  var30 = var28 + -((-BrickABrac.c(2048, (var29 << 1673200391) / param1) + 65536) * param5 >> -2094138581);
                                  var26 = var21 * var30 / var28 + param4;
                                  var27 = var30 * var23 / var28 + param2;
                                  if (lb.field_i <= var27) {
                                    break L10;
                                  } else {
                                    var27 = lb.field_i;
                                    break L10;
                                  }
                                }
                                L11: {
                                  if (lb.field_b > var26) {
                                    var26 = lb.field_b;
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                L12: {
                                  if (var27 < lb.field_f) {
                                    break L12;
                                  } else {
                                    var27 = lb.field_f;
                                    break L12;
                                  }
                                }
                                if (var26 >= lb.field_j) {
                                  var26 = lb.field_j;
                                  break L9;
                                } else {
                                  break L9;
                                }
                              } else {
                                if (var19 > var24) {
                                  L13: {
                                    var28 = ap.a(var24 << 1166374924, -100);
                                    var29 = -(param1 << -769204474) + var28;
                                    var30 = var28 - (param5 * (-BrickABrac.c(2048, (var29 << 582318919) / param7) + 65536) >> 427691819);
                                    var27 = param2 - -(var23 * var30 / var28);
                                    var26 = var30 * var21 / var28 + param4;
                                    if (lb.field_i <= var27) {
                                      break L13;
                                    } else {
                                      var27 = lb.field_i;
                                      break L13;
                                    }
                                  }
                                  L14: {
                                    if (lb.field_b > var26) {
                                      var26 = lb.field_b;
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                  L15: {
                                    if (lb.field_j > var26) {
                                      break L15;
                                    } else {
                                      var26 = lb.field_j;
                                      break L15;
                                    }
                                  }
                                  if (var27 < lb.field_f) {
                                    break L9;
                                  } else {
                                    var27 = lb.field_f;
                                    break L9;
                                  }
                                } else {
                                  var17.field_G[var20] = lb.field_l[lb.field_c * var26 - -var27];
                                  var20++;
                                  var23++;
                                  var25++;
                                  var24 = var24 + (-1 + var23 * 2);
                                  continue L8;
                                }
                              }
                            } else {
                              break L9;
                            }
                          }
                          var17.field_G[var20] = lb.field_l[lb.field_c * var26 - -var27];
                          var20++;
                          var23++;
                          var25++;
                          var24 = var24 + (-1 + var23 * 2);
                          continue L8;
                        }
                      }
                    }
                  }
                }
              }
            }
            return;
          } else {
            var16 = param6 * var15 >> -1834423452;
            var12[var15] = ud.d(ik.a(var16 * var14, 16711680), ik.a(var13 * var16, -16711936)) >>> 281720008;
            var12[-var15 + 31] = ud.d(ik.a(var16 * var13, -16711936), ik.a(16711680, var16 * var14)) >>> -618571864;
            var15++;
            continue L4;
          }
        }
    }

    ec(lp param0, dh param1, String param2) {
        super(0, 0, 288, 0, (ub) null);
        ((ec) this).field_M = 0;
        ((ec) this).field_K = param0;
        ((ec) this).field_R = param2;
        ((ec) this).field_H = param1;
        int var4 = ((ec) this).field_R == null ? 0 : ((ec) this).field_H.b(((ec) this).field_R, 260, ((ec) this).field_H.field_F);
        ((ec) this).a(22 + var4, 0, 0, (byte) -119, 288);
    }

    public static void a(int param0) {
        field_Q = null;
        if (param0 != 0) {
            field_Q = null;
        }
        field_N = null;
        field_L = null;
        field_S = null;
        field_P = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "Reload game";
        field_J = 15;
        field_S = "Offline";
    }
}
