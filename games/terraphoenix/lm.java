/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lm {
    static String field_f;
    static int field_d;
    static bg field_g;
    static int[] field_a;
    static int field_c;
    static ci field_e;
    static int field_b;

    public static void a(boolean param0) {
        field_f = null;
        field_a = null;
        field_g = null;
        if (param0) {
            return;
        }
        field_e = null;
    }

    final static void a(ee param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int stackIn_16_0 = 0;
        int[] stackIn_18_0 = null;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        dj stackIn_38_0 = null;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
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
        dj var21 = null;
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
        ee var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        byte[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        var40 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              L2: {
                var45 = param0;
                if (var45.field_f == null) {
                  break L2;
                } else {
                  if ((var45.field_I ^ -1) < -2) {
                    var61 = var45.field_f;
                    hk.a(0, -57, var61, 0, dk.field_c);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              th.a(true);
              break L1;
            }
            var55 = new int[param0.field_o];
            var50 = var55;
            var41 = var50;
            var8 = var41;
            var65 = new int[param0.field_o];
            var63 = ph.field_m;
            var62 = k.field_e;
            var64 = mg.field_p;
            var13 = 0;
            L3: while (true) {
              if (param0.field_o <= var13) {
                var44 = param5;
                var13 = var44;
                L4: while (true) {
                  if (ae.field_I <= var44) {
                    break L0;
                  } else {
                    L5: {
                      var14 = qh.field_c[var44];
                      var15 = param0.field_E[var14];
                      var16 = param0.field_n[var14];
                      var17 = param0.field_p[var14];
                      if (ph.field_m.length > param0.field_C[var14]) {
                        stackIn_25_0 = param0.field_C[var14];
                        break L5;
                      } else {
                        stackIn_25_0 = -1;
                        break L5;
                      }
                    }
                    L6: {
                      var18 = stackIn_25_0;
                      if (ph.field_m.length > param0.field_k[var14]) {
                        stackIn_28_0 = param0.field_k[var14];
                        break L6;
                      } else {
                        stackIn_28_0 = -1;
                        break L6;
                      }
                    }
                    L7: {
                      var19 = stackIn_28_0;
                      if (ph.field_m.length <= param0.field_g[var14]) {
                        stackIn_31_0 = -1;
                        break L7;
                      } else {
                        stackIn_31_0 = param0.field_g[var14];
                        break L7;
                      }
                    }
                    L8: {
                      L9: {
                        var20 = stackIn_31_0;
                        if (qk.field_l == null) {
                          break L9;
                        } else {
                          if (param0.field_x == null) {
                            break L9;
                          } else {
                            if (param0.field_x.length <= var14) {
                              break L9;
                            } else {
                              if (0 == (param0.field_x[var14] ^ -1)) {
                                break L9;
                              } else {
                                if (param0.field_x[var14] >= qk.field_l.length) {
                                  break L9;
                                } else {
                                  stackIn_38_0 = qk.field_l[param0.field_x[var14]];
                                  break L8;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackIn_38_0 = null;
                      break L8;
                    }
                    L10: {
                      L11: {
                        var21 = stackIn_38_0;
                        var22 = gm.field_l[var15];
                        var23 = nb.field_c[var15];
                        var24 = gm.field_l[var16];
                        var25 = nb.field_c[var16];
                        var26 = gm.field_l[var17];
                        var27 = nb.field_c[var17];
                        if (var18 != var19) {
                          break L11;
                        } else {
                          if (var20 == var19) {
                            L12: {
                              var28 = var55[var18];
                              var29 = var65[var18];
                              if (var21 != null) {
                                stackIn_48_0 = var21.field_b;
                                break L12;
                              } else {
                                stackIn_48_0 = 8355711;
                                break L12;
                              }
                            }
                            var30 = stackIn_48_0;
                            var31 = var30 & 16711935;
                            var32 = var30 & 65280;
                            var33 = (var28 * var31 & -16711701) >>> 177698600 | (16711762 & var32 * var28) >>> 805656712;
                            var33 = var33 + 65793 * var29;
                            ag.a(var24, var25, var22, var23, 29842, var33 >> 827491425 & 8355711, var27, var26);
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      L13: {
                        var28 = var55[var18];
                        var29 = var55[var19];
                        var30 = var55[var20];
                        var31 = var65[var18];
                        var32 = var65[var19];
                        var33 = var65[var20];
                        if (var21 != null) {
                          stackIn_44_0 = var21.field_b;
                          break L13;
                        } else {
                          stackIn_44_0 = 8355711;
                          break L13;
                        }
                      }
                      var34 = stackIn_44_0;
                      var35 = var34 & 16711935;
                      var36 = 65280 & var34;
                      var37 = -1879113473 & var35 * var28 >>> 1034123560 | (16711910 & var36 * var28) >>> -2110632728;
                      var38 = -318832385 & var35 * var29 >>> -1872182200 | var36 * var29 >>> -1309656792 & 1375796992;
                      var38 = var38 + var32 * 65793;
                      var39 = (var35 * var30 & -16711875) >>> 1378073608 | 100728576 & var36 * var30 >>> -686246968;
                      var37 = var37 + 65793 * var31;
                      var39 = var39 + var33 * 65793;
                      ak.a(255 & var39, var39 >> -1003626864, (var37 & 65286) >> 374420072, (var39 & 65475) >> -1279561432, var23, (byte) 116, var24, var22, var27, 255 & var37, var38 & 255, var38 >> 1881239568, var26, 255 & var38 >> 1165388136, var25, var37 >> -209808912);
                      break L10;
                    }
                    var44++;
                    continue L4;
                  }
                }
              } else {
                L14: {
                  var14 = param6 * var62[var13] + (var63[var13] * param2 - -(var64[var13] * param4)) >> 1681758568;
                  if (var14 < 0) {
                    var14 = -var14;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if ((var14 ^ -1) <= -1) {
                    if (-129 < (var14 ^ -1)) {
                      stackIn_16_0 = 128 + var14;
                      break L15;
                    } else {
                      stackIn_16_0 = 256;
                      break L15;
                    }
                  } else {
                    stackIn_16_0 = 128;
                    break L15;
                  }
                }
                L16: {
                  var14 = stackIn_16_0;
                  var15 = var62[var13] * param1 + (param3 * var63[var13] - -(var64[var13] * param7)) >> 1384452808;
                  stackIn_18_0 = me.field_m;

                  if (var15 < 0) {
                    stackIn_19_0 = (int[]) ((Object) stackIn_18_0);
                    stackIn_19_1 = -var15;
                    break L16;
                  } else {
                    stackIn_19_0 = (int[]) ((Object) stackIn_18_0);
                    stackIn_19_1 = var15;
                    break L16;
                  }
                }
                var15 = stackIn_19_0[stackIn_19_1];
                var14 = (-var15 + 256) * var14 >>> -1979343000;
                var55[var13] = var14;
                var65[var13] = var15;
                var13++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var8_ref = decompiledCaughtException;
            stackIn_53_0 = (RuntimeException) (var8_ref);

            stackIn_53_1 = new StringBuilder().append("lm.C(");

            if (param0 == null) {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "null";
              break L17;
            } else {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "{...}";
              break L17;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_54_0), stackIn_54_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void a(int param0, int param1, ci param2, int param3, byte param4, int param5, int param6, int param7, int param8) {
        int var9_int = param6 + param2.field_p + param0 + -param7;
        int var10 = param6 + param0 + (param2.field_p + param1);
        int var11 = (param2.field_t >> 926142657) + param2.field_v + param5;
        l.i(var9_int, 0, var10, var11 - -param3);
        param2.d(-1 + param0, param5 - 1, param8);
        param2.d(param0 - 1, param5 + 1, param8);
        l.a(rb.field_a);
        l.i(1 + var9_int, 0, var10 + 1, var11 - -param3);
        param2.d(param0 + 1, -1 + param5, param8);
        param2.d(param0 - -1, param5 + 1, param8);
        l.a(rb.field_a);
        var9_int = -param1 + -param6 + (param0 + param2.field_p) + param2.field_r;
        var10 = -param7 + (-param6 + (param2.field_r + param2.field_p + param0));
        l.i(var9_int, -param3 + var11, var10, 480);
        if (param4 < 122) {
            return;
        }
        try {
            param2.d(-1 + param0, param5 + -1, param8);
            param2.d(param0 - 1, param5 + 1, param8);
            l.a(rb.field_a);
            l.i(1 + var9_int, -param3 + var11, var10 + 1, 480);
            param2.d(param0 - -1, param5 + -1, param8);
            param2.d(1 + param0, param5 + 1, param8);
            l.a(rb.field_a);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "lm.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_f = "Clipsize: ";
        field_a = new int[8192];
        field_c = 0;
    }
}
