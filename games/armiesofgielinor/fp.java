/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fp extends je {
    static je field_Lb;
    private je field_Kb;
    private je field_Jb;
    static String field_Ib;

    fp(long param0, fp param1, String param2) {
        this(param0, param1.field_Jb, param1.field_Kb, param2);
    }

    final void a(byte param0, int param1, int param2, int param3, int param4, int param5) {
        ((fp) this).a(param3, -20500, param5, param1, param4);
        if (param0 != 120) {
            field_Ib = null;
        }
        this.c(param0 ^ 120, param2);
    }

    final static void a(int param0, pu param1, int param2, int param3, int param4, int param5, int param6, byte param7) {
        RuntimeException var8 = null;
        int[] var8_array = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Object var21 = null;
        bq var21_ref = null;
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
        pu var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        int[] var60 = null;
        byte[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int[] var67 = null;
        int stackIn_16_0 = 0;
        int[] stackIn_17_0 = null;
        int[] stackIn_18_0 = null;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        bq stackIn_39_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        short stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        short stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_30_0 = 0;
        short stackOut_29_0 = 0;
        bq stackOut_38_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int[] stackOut_16_0 = null;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var40 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var45 = param1;
                if (null == var45.field_K) {
                  break L2;
                } else {
                  if (var45.field_E > 1) {
                    var62 = var45.field_K;
                    el.a((byte) -105, var62, jp.field_g, 0, 0);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              mw.e((byte) -63);
              break L1;
            }
            var66 = new int[param1.field_t];
            var60 = var66;
            var55 = var60;
            var50 = var55;
            var41 = var50;
            var8_array = var41;
            var67 = new int[param1.field_t];
            var63 = ArmiesOfGielinor.field_I;
            var64 = kb.field_m;
            var65 = rj.field_Q;
            var13 = 0;
            L3: while (true) {
              if (var13 >= param1.field_t) {
                var44 = 0;
                var13 = var44;
                L4: while (true) {
                  if (var44 >= hc.field_q) {
                    break L0;
                  } else {
                    L5: {
                      var14 = ab.field_c[var44];
                      var15 = param1.field_c[var14];
                      var16 = param1.field_j[var14];
                      var17 = param1.field_e[var14];
                      if (ArmiesOfGielinor.field_I.length > param1.field_w[var14]) {
                        stackOut_24_0 = param1.field_w[var14];
                        stackIn_25_0 = stackOut_24_0;
                        break L5;
                      } else {
                        stackOut_23_0 = -1;
                        stackIn_25_0 = stackOut_23_0;
                        break L5;
                      }
                    }
                    L6: {
                      var18 = stackIn_25_0;
                      if (ArmiesOfGielinor.field_I.length > param1.field_Q[var14]) {
                        stackOut_27_0 = param1.field_Q[var14];
                        stackIn_28_0 = stackOut_27_0;
                        break L6;
                      } else {
                        stackOut_26_0 = -1;
                        stackIn_28_0 = stackOut_26_0;
                        break L6;
                      }
                    }
                    L7: {
                      var19 = stackIn_28_0;
                      if (ArmiesOfGielinor.field_I.length <= param1.field_d[var14]) {
                        stackOut_30_0 = -1;
                        stackIn_31_0 = stackOut_30_0;
                        break L7;
                      } else {
                        stackOut_29_0 = param1.field_d[var14];
                        stackIn_31_0 = stackOut_29_0;
                        break L7;
                      }
                    }
                    L8: {
                      L9: {
                        var20 = stackIn_31_0;
                        if (null == pg.field_a) {
                          break L9;
                        } else {
                          if (param1.field_u == null) {
                            break L9;
                          } else {
                            if (param1.field_u.length <= var14) {
                              break L9;
                            } else {
                              if (param1.field_u[var14] == -1) {
                                break L9;
                              } else {
                                if (pg.field_a.length > param1.field_u[var14]) {
                                  stackOut_38_0 = pg.field_a[param1.field_u[var14]];
                                  stackIn_39_0 = stackOut_38_0;
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_37_0 = null;
                      stackIn_39_0 = (bq) (Object) stackOut_37_0;
                      break L8;
                    }
                    L10: {
                      L11: {
                        var21_ref = stackIn_39_0;
                        var22 = ca.field_f[var15];
                        var23 = fa.field_k[var15];
                        var24 = ca.field_f[var16];
                        var25 = fa.field_k[var16];
                        var26 = ca.field_f[var17];
                        var27 = fa.field_k[var17];
                        if (var18 != var19) {
                          break L11;
                        } else {
                          if (var20 == var19) {
                            L12: {
                              var28 = var66[var18];
                              var29 = var67[var18];
                              if (var21_ref != null) {
                                stackOut_48_0 = var21_ref.field_e;
                                stackIn_49_0 = stackOut_48_0;
                                break L12;
                              } else {
                                stackOut_47_0 = 8355711;
                                stackIn_49_0 = stackOut_47_0;
                                break L12;
                              }
                            }
                            var30 = stackIn_49_0;
                            var31 = var30 & 16711935;
                            var32 = var30 & 65280;
                            var33 = -1090453760 & var32 * var28 >>> 8 | (var28 * var31 & -16711859) >>> 8;
                            var33 = var33 + 65793 * var29;
                            oe.a(-6, var22, var27, var24, var25, 8355711 & var33 >> 1, var23, var26);
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      L13: {
                        var28 = var66[var18];
                        var29 = var66[var19];
                        var30 = var66[var20];
                        var31 = var67[var18];
                        var32 = var67[var19];
                        var33 = var67[var20];
                        if (var21_ref == null) {
                          stackOut_44_0 = 8355711;
                          stackIn_45_0 = stackOut_44_0;
                          break L13;
                        } else {
                          stackOut_43_0 = var21_ref.field_e;
                          stackIn_45_0 = stackOut_43_0;
                          break L13;
                        }
                      }
                      var34 = stackIn_45_0;
                      var35 = var34 & 16711935;
                      var36 = 65280 & var34;
                      var37 = 335609600 & var36 * var28 >>> 8 | (-16711718 & var28 * var35) >>> 8;
                      var38 = -2113863936 & var36 * var29 >>> 8 | -83951361 & var29 * var35 >>> 8;
                      var38 = var38 + 65793 * var32;
                      var37 = var37 + 65793 * var31;
                      var39 = (var35 * var30 & -16711828) >>> 8 | (var30 * var36 & 16711711) >>> 8;
                      var39 = var39 + var33 * 65793;
                      dv.a(var23, (65292 & var39) >> 8, var22, (byte) -66, var37 & 255, (var37 & 65466) >> 8, var37 >> 16, var38 >> 16, var27, 255 & var38 >> 8, var39 >> 16, var26, var39 & 255, var38 & 255, var24, var25);
                      break L10;
                    }
                    var44++;
                    continue L4;
                  }
                }
              } else {
                L14: {
                  var14 = var63[var13] * param5 + (param3 * var64[var13] + param2 * var65[var13]) >> 8;
                  if (var14 < 0) {
                    var14 = -var14;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (var14 >= 0) {
                    if (var14 >= 128) {
                      stackOut_15_0 = 256;
                      stackIn_16_0 = stackOut_15_0;
                      break L15;
                    } else {
                      stackOut_14_0 = var14 + 128;
                      stackIn_16_0 = stackOut_14_0;
                      break L15;
                    }
                  } else {
                    stackOut_12_0 = 128;
                    stackIn_16_0 = stackOut_12_0;
                    break L15;
                  }
                }
                L16: {
                  var14 = stackIn_16_0;
                  var15 = var65[var13] * param6 + (param4 * var63[var13] + var64[var13] * param0) >> 8;
                  stackOut_16_0 = hg.field_a;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_17_0 = stackOut_16_0;
                  if (0 <= var15) {
                    stackOut_18_0 = (int[]) (Object) stackIn_18_0;
                    stackOut_18_1 = var15;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    break L16;
                  } else {
                    stackOut_17_0 = (int[]) (Object) stackIn_17_0;
                    stackOut_17_1 = -var15;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    break L16;
                  }
                }
                var15 = stackIn_19_0[stackIn_19_1];
                var14 = var14 * (256 + -var15) >>> 8;
                var66[var13] = var14;
                var67[var13] = var15;
                var13++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var8 = decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) var8;
            stackOut_52_1 = new StringBuilder().append("fp.H(").append(param0).append(',');
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param1 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L17;
            } else {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L17;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + 120 + ')');
        }
    }

    fp(long param0, wk param1, wk param2, int param3, je param4, String param5) {
        this(param0, (je) null, param4, param5);
        try {
            ((fp) this).field_Jb.field_cb = param2;
            ((fp) this).field_Jb.field_P = param1;
            ((fp) this).field_Jb.field_Fb = param3;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "fp.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static gl l(int param0) {
        String var1 = sk.i(-4938);
        if (var1 != null) {
            if (!(var1.indexOf('@') < 0)) {
                var1 = "";
            }
        }
        return new gl(sk.i(-4938), gi.a(false));
    }

    final static void a(java.math.BigInteger param0, java.math.BigInteger param1, byte param2, vh param3, vh param4) {
        try {
            ls.a(param4, 0, param0, 6727, param3.field_q, param1, param3.field_o);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "fp.G(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + 26 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private fp(long param0, je param1, je param2, String param3) {
        super(param0, (je) null);
        try {
            ((fp) this).field_Jb = new je(0L, param1);
            ((fp) this).field_Kb = new je(0L, param2);
            ((fp) this).field_Kb.field_X = param3;
            ((fp) this).a(((fp) this).field_Jb, 79);
            ((fp) this).a(((fp) this).field_Kb, 58);
            ((fp) this).i(-10027);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "fp.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void c(int param0, int param1) {
        ((fp) this).field_Jb.a(((fp) this).field_ob, -20500, ((fp) this).field_Jb.j(-53), 0, 0);
        int var3 = ((fp) this).field_Jb.field_gb + param1;
        ((fp) this).field_Kb.a(((fp) this).field_ob, param0 + -20500, ((fp) this).field_gb + -var3, param0, var3);
    }

    final static void a(String param0, byte param1) {
        try {
            gh.field_P = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "fp.B(" + (param0 != null ? "{...}" : "null") + ',' + -65 + ')');
        }
    }

    public static void k(int param0) {
        field_Lb = null;
        field_Ib = null;
    }

    final int d(int param0, int param1) {
        if (param0 < 23) {
            field_Ib = null;
        }
        return ((fp) this).field_Jb.j(-35) + (param1 - -((fp) this).field_Kb.j(102));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        String discarded$0 = db.a(true, ' ');
        field_Ib = "Open portal - Opens a single portal for a single god's forces at the current map tile";
    }
}
