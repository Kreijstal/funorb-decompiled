/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei implements gj {
    private hu field_k;
    static String field_c;
    static boolean field_n;
    static String field_f;
    private int field_i;
    private int field_h;
    static int field_e;
    static hd field_b;
    private int field_a;
    private int field_g;
    private int field_l;
    static al field_d;
    private int field_j;
    private int field_m;

    public static void a(int param0) {
        field_b = null;
        field_f = null;
        field_d = null;
        field_c = null;
        if (param0 != -19485) {
            field_n = false;
        }
    }

    public final void a(int param0, boolean param1, int param2, fd param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        s var15 = null;
        fd stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        fd stackOut_1_0 = null;
        L0: {
          if (!(param3 instanceof s)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (fd) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (fd) param3;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var15 = (s) (Object) stackIn_3_0;
          if (var15 != null) {
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          on.a(param4 + param3.field_t, param2 - -param3.field_g, param3.field_n, param3.field_i, ((ei) this).field_m);
          var7 = param4 + (param3.field_t - -var15.field_H);
          var8 = param3.field_g + (param2 - -var15.field_G);
          on.d(var7, var8, var15.field_J, ((ei) this).field_i);
          var12 = -80 % ((59 - param0) / 53);
          if ((var15.field_I ^ -1) == 0) {
            break L2;
          } else {
            var9 = 2.0 * (3.141592653589793 * (double)var15.field_I) / (double)var15.field_K;
            var11 = (int)(-Math.sin(var9) * (double)var15.field_J);
            var13 = (int)(Math.cos(var9) * (double)var15.field_J);
            on.d(var11 + var7, var13 + var8, 1, ((ei) this).field_g);
            break L2;
          }
        }
        L3: {
          on.d(var7, var8, 2, 1);
          var9 = 2.0 * (3.141592653589793 * (double)var15.field_L) / (double)var15.field_K;
          var11 = (int)(-Math.sin(var9) * (double)var15.field_J);
          var13 = (int)(Math.cos(var9) * (double)var15.field_J);
          on.b(var7, var8, var11 + var7, var13 + var8, 1);
          if (((ei) this).field_k != null) {
            var14 = ((ei) this).field_h + (var15.field_J + var15.field_H);
            int discarded$1 = ((ei) this).field_k.a(param3.field_q, param4 - (-param3.field_t - var14), param2 + (param3.field_g - -((ei) this).field_a), -var14 + -((ei) this).field_h + param3.field_n, param3.field_i + -(((ei) this).field_h << 1653596513), ((ei) this).field_l, ((ei) this).field_j, 1, 1, 0);
            break L3;
          } else {
            break L3;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, kk param6, int param7) {
        int[] var8 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        gf var21 = null;
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
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        int var44 = 0;
        kk var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        int[] var60 = null;
        byte[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int[] var67 = null;
        int stackIn_15_0 = 0;
        int[] stackIn_16_0 = null;
        int[] stackIn_17_0 = null;
        int[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        gf stackIn_38_0 = null;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        int stackOut_23_0 = 0;
        short stackOut_22_0 = 0;
        int stackOut_26_0 = 0;
        short stackOut_25_0 = 0;
        int stackOut_29_0 = 0;
        short stackOut_28_0 = 0;
        gf stackOut_37_0 = null;
        Object stackOut_36_0 = null;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int[] stackOut_15_0 = null;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        L0: {
          L1: {
            var40 = Kickabout.field_G;
            var45 = param6;
            if (null == var45.field_G) {
              break L1;
            } else {
              if (1 >= var45.field_u) {
                break L1;
              } else {
                var62 = var45.field_G;
                th.a(param5 ^ -125, 0, var62, vu.field_zb, 0);
                break L0;
              }
            }
          }
          or.b(false);
          break L0;
        }
        L2: {
          var66 = new int[param6.field_k];
          var60 = var66;
          var55 = var60;
          var50 = var55;
          var41 = var50;
          var8 = var41;
          var67 = new int[param6.field_k];
          var64 = pv.field_F;
          if (param5 == -125) {
            break L2;
          } else {
            ei.a(0);
            break L2;
          }
        }
        var65 = ba.field_q;
        var63 = el.field_E;
        var13 = 0;
        L3: while (true) {
          if (param6.field_k <= var13) {
            var44 = 0;
            var13 = var44;
            L4: while (true) {
              if (var44 >= sp.field_Ob) {
                return;
              } else {
                L5: {
                  var14 = nb.field_e[var44];
                  var15 = param6.field_n[var14];
                  var16 = param6.field_z[var14];
                  var17 = param6.field_T[var14];
                  if (pv.field_F.length <= param6.field_M[var14]) {
                    stackOut_23_0 = -1;
                    stackIn_24_0 = stackOut_23_0;
                    break L5;
                  } else {
                    stackOut_22_0 = param6.field_M[var14];
                    stackIn_24_0 = stackOut_22_0;
                    break L5;
                  }
                }
                L6: {
                  var18 = stackIn_24_0;
                  if (param6.field_U[var14] >= pv.field_F.length) {
                    stackOut_26_0 = -1;
                    stackIn_27_0 = stackOut_26_0;
                    break L6;
                  } else {
                    stackOut_25_0 = param6.field_U[var14];
                    stackIn_27_0 = stackOut_25_0;
                    break L6;
                  }
                }
                L7: {
                  var19 = stackIn_27_0;
                  if (param6.field_l[var14] >= pv.field_F.length) {
                    stackOut_29_0 = -1;
                    stackIn_30_0 = stackOut_29_0;
                    break L7;
                  } else {
                    stackOut_28_0 = param6.field_l[var14];
                    stackIn_30_0 = stackOut_28_0;
                    break L7;
                  }
                }
                L8: {
                  L9: {
                    var20 = stackIn_30_0;
                    if (sq.field_H == null) {
                      break L9;
                    } else {
                      if (null == param6.field_o) {
                        break L9;
                      } else {
                        if (param6.field_o.length <= var14) {
                          break L9;
                        } else {
                          if (-1 == param6.field_o[var14]) {
                            break L9;
                          } else {
                            if (param6.field_o[var14] < sq.field_H.length) {
                              stackOut_37_0 = sq.field_H[param6.field_o[var14]];
                              stackIn_38_0 = stackOut_37_0;
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_36_0 = null;
                  stackIn_38_0 = (gf) (Object) stackOut_36_0;
                  break L8;
                }
                L10: {
                  var21 = stackIn_38_0;
                  var22 = fb.field_M[var15];
                  var23 = fk.field_k[var15];
                  var24 = fb.field_M[var16];
                  var25 = fk.field_k[var16];
                  var26 = fb.field_M[var17];
                  var27 = fk.field_k[var17];
                  if (var18 != var19) {
                    break L10;
                  } else {
                    if (var19 == var20) {
                      L11: {
                        var28 = var66[var18];
                        var29 = var67[var18];
                        if (var21 != null) {
                          stackOut_47_0 = var21.field_g;
                          stackIn_48_0 = stackOut_47_0;
                          break L11;
                        } else {
                          stackOut_46_0 = 8355711;
                          stackIn_48_0 = stackOut_46_0;
                          break L11;
                        }
                      }
                      var30 = stackIn_48_0;
                      var31 = 16711935 & var30;
                      var32 = var30 & 65280;
                      var33 = var28 * var31 >>> 1843385864 & -671153921 | -1090453760 & var28 * var32 >>> -1155875192;
                      var33 = var33 + var29 * 65793;
                      lw.a(var23, var27, var25, (byte) -56, var22, var24, var26, (var33 & 16711422) >> -1444030111);
                      var44++;
                      continue L4;
                    } else {
                      break L10;
                    }
                  }
                }
                L12: {
                  var28 = var66[var18];
                  var29 = var66[var19];
                  var30 = var66[var20];
                  var31 = var67[var18];
                  var32 = var67[var19];
                  var33 = var67[var20];
                  if (var21 != null) {
                    stackOut_43_0 = var21.field_g;
                    stackIn_44_0 = stackOut_43_0;
                    break L12;
                  } else {
                    stackOut_42_0 = 8355711;
                    stackIn_44_0 = stackOut_42_0;
                    break L12;
                  }
                }
                var34 = stackIn_44_0;
                var35 = 16711935 & var34;
                var36 = 65280 & var34;
                var37 = (var28 * var35 & -16711794) >>> 1437704200 | (var28 * var36 & 16711732) >>> 1789880520;
                var38 = var35 * var29 >>> 641524680 & -335609601 | (var36 * var29 & 16711773) >>> 858961096;
                var39 = (16711933 & var36 * var30) >>> 44150344 | (-16711773 & var35 * var30) >>> 1355273256;
                var38 = var38 + 65793 * var32;
                var37 = var37 + 65793 * var31;
                var39 = var39 + 65793 * var33;
                os.a(var26, (var38 & 65313) >> 869113448, var25, (65336 & var37) >> 754575784, var37 & 255, 255 & var39, (var39 & 65385) >> -1361480888, var37 >> 80429456, var38 >> 1885103120, var38 & 255, var24, var39 >> 643159600, var23, -15343, var27, var22);
                var44++;
                continue L4;
              }
            }
          } else {
            L13: {
              var14 = param3 * var63[var13] + (var64[var13] * param1 - -(param0 * var65[var13])) >> -1868544856;
              if (var14 <= -1) {
                break L13;
              } else {
                var14 = -var14;
                break L13;
              }
            }
            L14: {
              if (0 > var14) {
                stackOut_14_0 = 128;
                stackIn_15_0 = stackOut_14_0;
                break L14;
              } else {
                if (-129 <= var14) {
                  stackOut_13_0 = 256;
                  stackIn_15_0 = stackOut_13_0;
                  break L14;
                } else {
                  stackOut_12_0 = 128 + var14;
                  stackIn_15_0 = stackOut_12_0;
                  break L14;
                }
              }
            }
            L15: {
              var14 = stackIn_15_0;
              var15 = param4 * var65[var13] + param2 * var64[var13] - -(var63[var13] * param7) >> -1724257144;
              stackOut_15_0 = mr.field_Y;
              stackIn_17_0 = stackOut_15_0;
              stackIn_16_0 = stackOut_15_0;
              if ((var15 ^ -1) > -1) {
                stackOut_17_0 = (int[]) (Object) stackIn_17_0;
                stackOut_17_1 = -var15;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                break L15;
              } else {
                stackOut_16_0 = (int[]) (Object) stackIn_16_0;
                stackOut_16_1 = var15;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                break L15;
              }
            }
            var15 = stackIn_18_0[stackIn_18_1];
            var14 = var14 * (-var15 + 256) >>> 153844232;
            var66[var13] = var14;
            var67[var13] = var15;
            var13++;
            continue L3;
          }
        }
    }

    final static int a(int param0, byte param1) {
        if (param1 != -23) {
            field_f = null;
        }
        param0 = param0 & 8191;
        if (4096 <= param0) {
            return -6145 < (param0 ^ -1) ? -mg.field_b[param0 - 4096] : -mg.field_b[8192 - param0];
        }
        return param0 >= 2048 ? mg.field_b[-param0 + 4096] : mg.field_b[param0];
    }

    ei(hu param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((ei) this).field_g = param6;
        ((ei) this).field_j = param4;
        ((ei) this).field_l = param3;
        ((ei) this).field_m = param7;
        ((ei) this).field_h = param1;
        ((ei) this).field_a = param2;
        ((ei) this).field_i = param5;
        ((ei) this).field_k = param0;
    }

    final static void a(boolean param0, boolean param1) {
        er.a((byte) 71, param0);
        if (!(null == sn.field_e)) {
            ar.a(15707, sn.field_e);
        }
        if (param1) {
            field_n = true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "<%0>%";
        field_f = "Previous";
        field_n = true;
    }
}
