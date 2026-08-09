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
        this.a(param3, -20500, param5, param1, param4);
        if (param0 != 120) {
            field_Ib = (String) null;
        }
        this.c(param0 ^ 120, param2);
    }

    final static void a(int param0, pu param1, int param2, int param3, int param4, int param5, int param6, byte param7) {
        int stackIn_18_0 = 0;
        int[] stackIn_20_0 = null;
        int[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        bq stackIn_41_0 = null;
        int stackIn_47_0 = 0;
        int stackIn_51_0 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
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
        bq var21 = null;
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
        byte[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        var40 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param7 == 120) {
                break L1;
              } else {
                field_Ib = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                var45 = param1;
                if (null == var45.field_K) {
                  break L3;
                } else {
                  if (var45.field_E > 1) {
                    var61 = var45.field_K;
                    el.a((byte) -105, var61, jp.field_g, 0, 0);
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              mw.e((byte) -63);
              break L2;
            }
            var55 = new int[param1.field_t];
            var50 = var55;
            var41 = var50;
            var8 = var41;
            var65 = new int[param1.field_t];
            var62 = ArmiesOfGielinor.field_I;
            var63 = kb.field_m;
            var64 = rj.field_Q;
            var13 = 0;
            L4: while (true) {
              if (var13 >= param1.field_t) {
                var44 = 0;
                var13 = var44;
                L5: while (true) {
                  if (var44 >= hc.field_q) {
                    break L0;
                  } else {
                    L6: {
                      var14 = ab.field_c[var44];
                      var15 = param1.field_c[var14];
                      var16 = param1.field_j[var14];
                      var17 = param1.field_e[var14];
                      if (ArmiesOfGielinor.field_I.length > param1.field_w[var14]) {
                        stackIn_27_0 = param1.field_w[var14];
                        break L6;
                      } else {
                        stackIn_27_0 = -1;
                        break L6;
                      }
                    }
                    L7: {
                      var18 = stackIn_27_0;
                      if (ArmiesOfGielinor.field_I.length > param1.field_Q[var14]) {
                        stackIn_30_0 = param1.field_Q[var14];
                        break L7;
                      } else {
                        stackIn_30_0 = -1;
                        break L7;
                      }
                    }
                    L8: {
                      var19 = stackIn_30_0;
                      if (ArmiesOfGielinor.field_I.length <= param1.field_d[var14]) {
                        stackIn_33_0 = -1;
                        break L8;
                      } else {
                        stackIn_33_0 = param1.field_d[var14];
                        break L8;
                      }
                    }
                    L9: {
                      L10: {
                        var20 = stackIn_33_0;
                        if (null == pg.field_a) {
                          break L10;
                        } else {
                          if (param1.field_u == null) {
                            break L10;
                          } else {
                            if (param1.field_u.length <= var14) {
                              break L10;
                            } else {
                              if ((param1.field_u[var14] ^ -1) == 0) {
                                break L10;
                              } else {
                                if (pg.field_a.length > param1.field_u[var14]) {
                                  stackIn_41_0 = pg.field_a[param1.field_u[var14]];
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackIn_41_0 = null;
                      break L9;
                    }
                    L11: {
                      L12: {
                        var21 = stackIn_41_0;
                        var22 = ca.field_f[var15];
                        var23 = fa.field_k[var15];
                        var24 = ca.field_f[var16];
                        var25 = fa.field_k[var16];
                        var26 = ca.field_f[var17];
                        var27 = fa.field_k[var17];
                        if (var18 != var19) {
                          break L12;
                        } else {
                          if (var20 == var19) {
                            L13: {
                              var28 = var55[var18];
                              var29 = var65[var18];
                              if (var21 != null) {
                                stackIn_51_0 = var21.field_e;
                                break L13;
                              } else {
                                stackIn_51_0 = 8355711;
                                break L13;
                              }
                            }
                            var30 = stackIn_51_0;
                            var31 = var30 & 16711935;
                            var32 = var30 & 65280;
                            var33 = -1090453760 & var32 * var28 >>> -765773752 | (var28 * var31 & -16711859) >>> -56804472;
                            var33 = var33 + 65793 * var29;
                            oe.a(-6, var22, var27, var24, var25, 8355711 & var33 >> 1542048033, var23, var26);
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      L14: {
                        var28 = var55[var18];
                        var29 = var55[var19];
                        var30 = var55[var20];
                        var31 = var65[var18];
                        var32 = var65[var19];
                        var33 = var65[var20];
                        if (var21 == null) {
                          stackIn_47_0 = 8355711;
                          break L14;
                        } else {
                          stackIn_47_0 = var21.field_e;
                          break L14;
                        }
                      }
                      var34 = stackIn_47_0;
                      var35 = var34 & 16711935;
                      var36 = 65280 & var34;
                      var37 = 335609600 & var36 * var28 >>> 913413128 | (-16711718 & var28 * var35) >>> 214103016;
                      var38 = -2113863936 & var36 * var29 >>> 419436360 | -83951361 & var29 * var35 >>> -191381176;
                      var38 = var38 + 65793 * var32;
                      var37 = var37 + 65793 * var31;
                      var39 = (var35 * var30 & -16711828) >>> 883478760 | (var30 * var36 & 16711711) >>> -1862092184;
                      var39 = var39 + var33 * 65793;
                      dv.a(var23, (65292 & var39) >> 494264392, var22, (byte) -66, var37 & 255, (var37 & 65466) >> 673254536, var37 >> -2027344112, var38 >> -1275809296, var27, 255 & var38 >> 1124488808, var39 >> 1810170416, var26, var39 & 255, var38 & 255, var24, var25);
                      break L11;
                    }
                    var44++;
                    continue L5;
                  }
                }
              } else {
                L15: {
                  var14 = var62[var13] * param5 + (param3 * var63[var13] + param2 * var64[var13]) >> 1739176040;
                  if (var14 < 0) {
                    var14 = -var14;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if ((var14 ^ -1) <= -1) {
                    if ((var14 ^ -1) <= -129) {
                      stackIn_18_0 = 256;
                      break L16;
                    } else {
                      stackIn_18_0 = var14 + 128;
                      break L16;
                    }
                  } else {
                    stackIn_18_0 = 128;
                    break L16;
                  }
                }
                L17: {
                  var14 = stackIn_18_0;
                  var15 = var64[var13] * param6 + (param4 * var62[var13] + var63[var13] * param0) >> 2137179176;
                  stackIn_20_0 = hg.field_a;

                  if (0 <= var15) {
                    stackIn_21_0 = (int[]) ((Object) stackIn_20_0);
                    stackIn_21_1 = var15;
                    break L17;
                  } else {
                    stackIn_21_0 = (int[]) ((Object) stackIn_20_0);
                    stackIn_21_1 = -var15;
                    break L17;
                  }
                }
                var15 = stackIn_21_0[stackIn_21_1];
                var14 = var14 * (256 + -var15) >>> 161441384;
                var55[var13] = var14;
                var65[var13] = var15;
                var13++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var8_ref = decompiledCaughtException;
            stackIn_56_0 = (RuntimeException) (var8_ref);

            stackIn_56_1 = new StringBuilder().append("fp.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_57_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "null";
              break L18;
            } else {
              stackIn_57_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "{...}";
              break L18;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_57_0), stackIn_57_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    fp(long param0, wk param1, wk param2, int param3, je param4, String param5) {
        this(param0, (je) null, param4, param5);
        try {
            this.field_Jb.field_cb = param2;
            this.field_Jb.field_P = param1;
            this.field_Jb.field_Fb = param3;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "fp.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static gl l(int param0) {
        if (param0 >= -110) {
            return (gl) null;
        }
        String var1 = sk.i(-4938);
        if (var1 != null) {
            if (!(-1 < (var1.indexOf('@') ^ -1))) {
                var1 = "";
            }
        }
        return new gl(sk.i(-4938), gi.a(false));
    }

    final static void a(java.math.BigInteger param0, java.math.BigInteger param1, byte param2, vh param3, vh param4) {
        try {
            if (param2 != 26) {
                field_Lb = (je) null;
            }
            ls.a(param4, 0, param0, 6727, param3.field_q, param1, param3.field_o);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "fp.G(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private fp(long param0, je param1, je param2, String param3) {
        super(param0, (je) null);
        try {
            this.field_Jb = new je(0L, param1);
            this.field_Kb = new je(0L, param2);
            this.field_Kb.field_X = param3;
            this.a(this.field_Jb, 79);
            this.a(this.field_Kb, 58);
            this.i(-10027);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "fp.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void c(int param0, int param1) {
        this.field_Jb.a(this.field_ob, -20500, this.field_Jb.j(-53), 0, 0);
        int var3 = this.field_Jb.field_gb + param1;
        this.field_Kb.a(this.field_ob, param0 + -20500, this.field_gb + -var3, param0, var3);
    }

    final static void a(String param0, byte param1) {
        if (param1 >= -59) {
            return;
        }
        try {
            gh.field_P = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "fp.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void k(int param0) {
        if (param0 != 21755) {
            field_Lb = (je) null;
        }
        field_Lb = null;
        field_Ib = null;
    }

    final int d(int param0, int param1) {
        if (param0 < 23) {
            field_Ib = (String) null;
        }
        return this.field_Jb.j(-35) + (param1 - -this.field_Kb.j(102));
    }

    static {
        db.a(true, ' ');
        field_Ib = "Open portal - Opens a single portal for a single god's forces at the current map tile";
    }
}
