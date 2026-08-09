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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              if (!(param3 instanceof s)) {
                stackIn_3_0 = null;
                break L1;
              } else {
                stackIn_3_0 = (fd) (param3);
                break L1;
              }
            }
            L2: {
              var15 = (s) ((Object) stackIn_3_0);
              if (var15 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              on.a(param4 + param3.field_t, param2 - -param3.field_g, param3.field_n, param3.field_i, this.field_m);
              var7 = param4 + (param3.field_t - -var15.field_H);
              var8 = param3.field_g + (param2 - -var15.field_G);
              on.d(var7, var8, var15.field_J, this.field_i);
              var12 = -80 % ((59 - param0) / 53);
              if ((var15.field_I ^ -1) == 0) {
                break L3;
              } else {
                var9 = 2.0 * (3.141592653589793 * (double)var15.field_I) / (double)var15.field_K;
                var11 = (int)(-Math.sin(var9) * (double)var15.field_J);
                var13 = (int)(Math.cos(var9) * (double)var15.field_J);
                on.d(var11 + var7, var13 + var8, 1, this.field_g);
                break L3;
              }
            }
            L4: {
              on.d(var7, var8, 2, 1);
              var9 = 2.0 * (3.141592653589793 * (double)var15.field_L) / (double)var15.field_K;
              var11 = (int)(-Math.sin(var9) * (double)var15.field_J);
              var13 = (int)(Math.cos(var9) * (double)var15.field_J);
              on.b(var7, var8, var11 + var7, var13 + var8, 1);
              if (this.field_k != null) {
                var14 = this.field_h + (var15.field_J + var15.field_H);
                this.field_k.a(param3.field_q, param4 - (-param3.field_t - var14), param2 + (param3.field_g - -this.field_a), -var14 + -this.field_h + param3.field_n, param3.field_i + -(this.field_h << 1653596513), this.field_l, this.field_j, 1, 1, 0);
                break L4;
              } else {
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var6);

            stackIn_12_1 = new StringBuilder().append("ei.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L5;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, kk param6, int param7) {
        int stackIn_16_0 = 0;
        int[] stackIn_18_0 = null;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        gf stackIn_39_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
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
        kk var44 = null;
        int[] var49 = null;
        int[] var54 = null;
        byte[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        var40 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              L2: {
                var44 = param6;
                if (null == var44.field_G) {
                  break L2;
                } else {
                  if (1 >= var44.field_u) {
                    break L2;
                  } else {
                    var60 = var44.field_G;
                    th.a(param5 ^ -125, 0, var60, vu.field_zb, 0);
                    break L1;
                  }
                }
              }
              or.b(false);
              break L1;
            }
            L3: {
              var54 = new int[param6.field_k];
              var49 = var54;
              var41 = var49;
              var8 = var41;
              var64 = new int[param6.field_k];
              var62 = pv.field_F;
              if (param5 == -125) {
                break L3;
              } else {
                ei.a(0);
                break L3;
              }
            }
            var63 = ba.field_q;
            var61 = el.field_E;
            var13 = 0;
            L4: while (true) {
              if (param6.field_k <= var13) {
                var13 = 0;
                L5: while (true) {
                  if (var13 >= sp.field_Ob) {
                    break L0;
                  } else {
                    L6: {
                      var14 = nb.field_e[var13];
                      var15 = param6.field_n[var14];
                      var16 = param6.field_z[var14];
                      var17 = param6.field_T[var14];
                      if (pv.field_F.length <= param6.field_M[var14]) {
                        stackIn_25_0 = -1;
                        break L6;
                      } else {
                        stackIn_25_0 = param6.field_M[var14];
                        break L6;
                      }
                    }
                    L7: {
                      var18 = stackIn_25_0;
                      if (param6.field_U[var14] >= pv.field_F.length) {
                        stackIn_28_0 = -1;
                        break L7;
                      } else {
                        stackIn_28_0 = param6.field_U[var14];
                        break L7;
                      }
                    }
                    L8: {
                      var19 = stackIn_28_0;
                      if (param6.field_l[var14] >= pv.field_F.length) {
                        stackIn_31_0 = -1;
                        break L8;
                      } else {
                        stackIn_31_0 = param6.field_l[var14];
                        break L8;
                      }
                    }
                    L9: {
                      L10: {
                        var20 = stackIn_31_0;
                        if (sq.field_H == null) {
                          break L10;
                        } else {
                          if (null == param6.field_o) {
                            break L10;
                          } else {
                            if (param6.field_o.length <= var14) {
                              break L10;
                            } else {
                              if (-1 == param6.field_o[var14]) {
                                break L10;
                              } else {
                                if (param6.field_o[var14] < sq.field_H.length) {
                                  stackIn_39_0 = sq.field_H[param6.field_o[var14]];
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackIn_39_0 = null;
                      break L9;
                    }
                    L11: {
                      L12: {
                        var21 = stackIn_39_0;
                        var22 = fb.field_M[var15];
                        var23 = fk.field_k[var15];
                        var24 = fb.field_M[var16];
                        var25 = fk.field_k[var16];
                        var26 = fb.field_M[var17];
                        var27 = fk.field_k[var17];
                        if (var18 != var19) {
                          break L12;
                        } else {
                          if (var19 == var20) {
                            L13: {
                              var28 = var54[var18];
                              var29 = var64[var18];
                              if (var21 != null) {
                                stackIn_49_0 = var21.field_g;
                                break L13;
                              } else {
                                stackIn_49_0 = 8355711;
                                break L13;
                              }
                            }
                            var30 = stackIn_49_0;
                            var31 = 16711935 & var30;
                            var32 = var30 & 65280;
                            var33 = var28 * var31 >>> 1843385864 & -671153921 | -1090453760 & var28 * var32 >>> -1155875192;
                            var33 = var33 + var29 * 65793;
                            lw.a(var23, var27, var25, (byte) -56, var22, var24, var26, (var33 & 16711422) >> -1444030111);
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      L14: {
                        var28 = var54[var18];
                        var29 = var54[var19];
                        var30 = var54[var20];
                        var31 = var64[var18];
                        var32 = var64[var19];
                        var33 = var64[var20];
                        if (var21 != null) {
                          stackIn_45_0 = var21.field_g;
                          break L14;
                        } else {
                          stackIn_45_0 = 8355711;
                          break L14;
                        }
                      }
                      var34 = stackIn_45_0;
                      var35 = 16711935 & var34;
                      var36 = 65280 & var34;
                      var37 = (var28 * var35 & -16711794) >>> 1437704200 | (var28 * var36 & 16711732) >>> 1789880520;
                      var38 = var35 * var29 >>> 641524680 & -335609601 | (var36 * var29 & 16711773) >>> 858961096;
                      var39 = (16711933 & var36 * var30) >>> 44150344 | (-16711773 & var35 * var30) >>> 1355273256;
                      var38 = var38 + 65793 * var32;
                      var37 = var37 + 65793 * var31;
                      var39 = var39 + 65793 * var33;
                      os.a(var26, (var38 & 65313) >> 869113448, var25, (65336 & var37) >> 754575784, var37 & 255, 255 & var39, (var39 & 65385) >> -1361480888, var37 >> 80429456, var38 >> 1885103120, var38 & 255, var24, var39 >> 643159600, var23, -15343, var27, var22);
                      break L11;
                    }
                    var13++;
                    continue L5;
                  }
                }
              } else {
                L15: {
                  var14 = param3 * var61[var13] + (var62[var13] * param1 - -(param0 * var63[var13])) >> -1868544856;
                  if ((var14 ^ -1) <= -1) {
                    break L15;
                  } else {
                    var14 = -var14;
                    break L15;
                  }
                }
                L16: {
                  if (0 > var14) {
                    stackIn_16_0 = 128;
                    break L16;
                  } else {
                    if (-129 >= (var14 ^ -1)) {
                      stackIn_16_0 = 256;
                      break L16;
                    } else {
                      stackIn_16_0 = 128 + var14;
                      break L16;
                    }
                  }
                }
                L17: {
                  var14 = stackIn_16_0;
                  var15 = param4 * var63[var13] + param2 * var62[var13] - -(var61[var13] * param7) >> -1724257144;
                  stackIn_18_0 = mr.field_Y;

                  if ((var15 ^ -1) > -1) {
                    stackIn_19_0 = (int[]) ((Object) stackIn_18_0);
                    stackIn_19_1 = -var15;
                    break L17;
                  } else {
                    stackIn_19_0 = (int[]) ((Object) stackIn_18_0);
                    stackIn_19_1 = var15;
                    break L17;
                  }
                }
                var15 = stackIn_19_0[stackIn_19_1];
                var14 = var14 * (-var15 + 256) >>> 153844232;
                var54[var13] = var14;
                var64[var13] = var15;
                var13++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var8_ref = decompiledCaughtException;
            stackIn_54_0 = (RuntimeException) (var8_ref);

            stackIn_54_1 = new StringBuilder().append("ei.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "null";
              break L18;
            } else {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "{...}";
              break L18;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_55_0), stackIn_55_2 + ',' + param7 + ')');
        }
    }

    final static int a(int param0, byte param1) {
        if (param1 != -23) {
            field_f = (String) null;
        }
        param0 = param0 & 8191;
        if (4096 <= param0) {
            return -6145 < (param0 ^ -1) ? -mg.field_b[param0 - 4096] : -mg.field_b[8192 - param0];
        }
        return param0 >= 2048 ? mg.field_b[-param0 + 4096] : mg.field_b[param0];
    }

    ei(hu param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            this.field_g = param6;
            this.field_j = param4;
            this.field_l = param3;
            this.field_m = param7;
            this.field_h = param1;
            this.field_a = param2;
            this.field_i = param5;
            this.field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "ei.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
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
        field_c = "<%0>%";
        field_f = "Previous";
        field_n = true;
    }
}
