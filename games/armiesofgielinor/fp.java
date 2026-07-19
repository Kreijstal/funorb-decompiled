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
        pu var44 = null;
        int[] var49 = null;
        int[] var54 = null;
        byte[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int stackIn_12_0 = 0;
        int stackIn_20_0 = 0;
        int[] stackIn_21_0 = null;
        int[] stackIn_22_0 = null;
        int[] stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        bq stackIn_45_0 = null;
        int stackIn_51_0 = 0;
        int stackIn_55_0 = 0;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int[] stackOut_20_0 = null;
        int[] stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int[] stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_24_0 = 0;
        short stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        short stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_36_0 = 0;
        short stackOut_35_0 = 0;
        bq stackOut_44_0 = null;
        Object stackOut_43_0 = null;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
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
                L4: {
                  var44 = param1;
                  if (null == var44.field_K) {
                    break L4;
                  } else {
                    if (var44.field_E > 1) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                mw.e((byte) -63);
                if (var40 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
              var60 = var44.field_K;
              el.a((byte) -105, var60, jp.field_g, 0, 0);
              break L2;
            }
            var54 = new int[param1.field_t];
            var49 = var54;
            var41 = var49;
            var8_array = var41;
            var64 = new int[param1.field_t];
            var61 = ArmiesOfGielinor.field_I;
            var62 = kb.field_m;
            var63 = rj.field_Q;
            var13 = 0;
            L5: while (true) {
              L6: {
                L7: {
                  if (var13 >= param1.field_t) {
                    break L7;
                  } else {
                    var14 = var61[var13] * param5 + (param3 * var62[var13] + param2 * var63[var13]) >> 1739176040;
                    stackOut_11_0 = var14;
                    stackIn_25_0 = stackOut_11_0;
                    stackIn_12_0 = stackOut_11_0;
                    if (var40 != 0) {
                      break L6;
                    } else {
                      L8: {
                        if (stackIn_12_0 < 0) {
                          var14 = -var14;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        if ((var14 ^ -1) <= -1) {
                          if ((var14 ^ -1) <= -129) {
                            stackOut_19_0 = 256;
                            stackIn_20_0 = stackOut_19_0;
                            break L9;
                          } else {
                            stackOut_18_0 = var14 + 128;
                            stackIn_20_0 = stackOut_18_0;
                            break L9;
                          }
                        } else {
                          stackOut_16_0 = 128;
                          stackIn_20_0 = stackOut_16_0;
                          break L9;
                        }
                      }
                      L10: {
                        var14 = stackIn_20_0;
                        var15 = var63[var13] * param6 + (param4 * var61[var13] + var62[var13] * param0) >> 2137179176;
                        stackOut_20_0 = hg.field_a;
                        stackIn_22_0 = stackOut_20_0;
                        stackIn_21_0 = stackOut_20_0;
                        if (0 <= var15) {
                          stackOut_22_0 = (int[]) ((Object) stackIn_22_0);
                          stackOut_22_1 = var15;
                          stackIn_23_0 = stackOut_22_0;
                          stackIn_23_1 = stackOut_22_1;
                          break L10;
                        } else {
                          stackOut_21_0 = (int[]) ((Object) stackIn_21_0);
                          stackOut_21_1 = -var15;
                          stackIn_23_0 = stackOut_21_0;
                          stackIn_23_1 = stackOut_21_1;
                          break L10;
                        }
                      }
                      var15 = stackIn_23_0[stackIn_23_1];
                      var14 = var14 * (256 + -var15) >>> 161441384;
                      var54[var13] = var14;
                      var64[var13] = var15;
                      var13++;
                      if (var40 == 0) {
                        continue L5;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                stackOut_24_0 = 0;
                stackIn_25_0 = stackOut_24_0;
                break L6;
              }
              var13 = stackIn_25_0;
              L11: while (true) {
                L12: {
                  if (var13 >= hc.field_q) {
                    break L12;
                  } else {
                    var14 = ab.field_c[var13];
                    var15 = param1.field_c[var14];
                    var16 = param1.field_j[var14];
                    var17 = param1.field_e[var14];
                    if (var40 != 0) {
                      break L12;
                    } else {
                      L13: {
                        if (ArmiesOfGielinor.field_I.length > param1.field_w[var14]) {
                          stackOut_30_0 = param1.field_w[var14];
                          stackIn_31_0 = stackOut_30_0;
                          break L13;
                        } else {
                          stackOut_29_0 = -1;
                          stackIn_31_0 = stackOut_29_0;
                          break L13;
                        }
                      }
                      L14: {
                        var18 = stackIn_31_0;
                        if (ArmiesOfGielinor.field_I.length > param1.field_Q[var14]) {
                          stackOut_33_0 = param1.field_Q[var14];
                          stackIn_34_0 = stackOut_33_0;
                          break L14;
                        } else {
                          stackOut_32_0 = -1;
                          stackIn_34_0 = stackOut_32_0;
                          break L14;
                        }
                      }
                      L15: {
                        var19 = stackIn_34_0;
                        if (ArmiesOfGielinor.field_I.length <= param1.field_d[var14]) {
                          stackOut_36_0 = -1;
                          stackIn_37_0 = stackOut_36_0;
                          break L15;
                        } else {
                          stackOut_35_0 = param1.field_d[var14];
                          stackIn_37_0 = stackOut_35_0;
                          break L15;
                        }
                      }
                      L16: {
                        L17: {
                          var20 = stackIn_37_0;
                          if (null == pg.field_a) {
                            break L17;
                          } else {
                            if (param1.field_u == null) {
                              break L17;
                            } else {
                              if (param1.field_u.length <= var14) {
                                break L17;
                              } else {
                                if ((param1.field_u[var14] ^ -1) == 0) {
                                  break L17;
                                } else {
                                  if (pg.field_a.length > param1.field_u[var14]) {
                                    stackOut_44_0 = pg.field_a[param1.field_u[var14]];
                                    stackIn_45_0 = stackOut_44_0;
                                    break L16;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                            }
                          }
                        }
                        stackOut_43_0 = null;
                        stackIn_45_0 = (bq) ((Object) stackOut_43_0);
                        break L16;
                      }
                      L18: {
                        L19: {
                          L20: {
                            var21_ref = stackIn_45_0;
                            var22 = ca.field_f[var15];
                            var23 = fa.field_k[var15];
                            var24 = ca.field_f[var16];
                            var25 = fa.field_k[var16];
                            var26 = ca.field_f[var17];
                            var27 = fa.field_k[var17];
                            if (var18 != var19) {
                              break L20;
                            } else {
                              if (var20 == var19) {
                                break L19;
                              } else {
                                break L20;
                              }
                            }
                          }
                          L21: {
                            var28 = var54[var18];
                            var29 = var54[var19];
                            var30 = var54[var20];
                            var31 = var64[var18];
                            var32 = var64[var19];
                            var33 = var64[var20];
                            if (var21_ref == null) {
                              stackOut_50_0 = 8355711;
                              stackIn_51_0 = stackOut_50_0;
                              break L21;
                            } else {
                              stackOut_49_0 = var21_ref.field_e;
                              stackIn_51_0 = stackOut_49_0;
                              break L21;
                            }
                          }
                          var34 = stackIn_51_0;
                          var35 = var34 & 16711935;
                          var36 = 65280 & var34;
                          var37 = 335609600 & var36 * var28 >>> 913413128 | (-16711718 & var28 * var35) >>> 214103016;
                          var38 = -2113863936 & var36 * var29 >>> 419436360 | -83951361 & var29 * var35 >>> -191381176;
                          var38 = var38 + 65793 * var32;
                          var37 = var37 + 65793 * var31;
                          var39 = (var35 * var30 & -16711828) >>> 883478760 | (var30 * var36 & 16711711) >>> -1862092184;
                          var39 = var39 + var33 * 65793;
                          dv.a(var23, (65292 & var39) >> 494264392, var22, (byte) -66, var37 & 255, (var37 & 65466) >> 673254536, var37 >> -2027344112, var38 >> -1275809296, var27, 255 & var38 >> 1124488808, var39 >> 1810170416, var26, var39 & 255, var38 & 255, var24, var25);
                          if (var40 == 0) {
                            break L18;
                          } else {
                            break L19;
                          }
                        }
                        L22: {
                          var28 = var54[var18];
                          var29 = var64[var18];
                          if (var21_ref != null) {
                            stackOut_54_0 = var21_ref.field_e;
                            stackIn_55_0 = stackOut_54_0;
                            break L22;
                          } else {
                            stackOut_53_0 = 8355711;
                            stackIn_55_0 = stackOut_53_0;
                            break L22;
                          }
                        }
                        var30 = stackIn_55_0;
                        var31 = var30 & 16711935;
                        var32 = var30 & 65280;
                        var33 = -1090453760 & var32 * var28 >>> -765773752 | (var28 * var31 & -16711859) >>> -56804472;
                        var33 = var33 + 65793 * var29;
                        oe.a(-6, var22, var27, var24, var25, 8355711 & var33 >> 1542048033, var23, var26);
                        break L18;
                      }
                      var13++;
                      continue L11;
                    }
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var8 = decompiledCaughtException;
            stackOut_58_0 = (RuntimeException) (var8);
            stackOut_58_1 = new StringBuilder().append("fp.H(").append(param0).append(',');
            stackIn_60_0 = stackOut_58_0;
            stackIn_60_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param1 == null) {
              stackOut_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackOut_60_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackOut_60_2 = "null";
              stackIn_61_0 = stackOut_60_0;
              stackIn_61_1 = stackOut_60_1;
              stackIn_61_2 = stackOut_60_2;
              break L23;
            } else {
              stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackOut_59_2 = "{...}";
              stackIn_61_0 = stackOut_59_0;
              stackIn_61_1 = stackOut_59_1;
              stackIn_61_2 = stackOut_59_2;
              break L23;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_61_0), stackIn_61_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
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
        String var1 = null;
        if (param0 >= -110) {
          return (gl) null;
        } else {
          L0: {
            var1 = sk.i(-4938);
            if (var1 == null) {
              break L0;
            } else {
              if (-1 >= (var1.indexOf('@') ^ -1)) {
                var1 = "";
                break L0;
              } else {
                break L0;
              }
            }
          }
          return new gl(sk.i(-4938), gi.a(false));
        }
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
        String discarded$0 = db.a(true, ' ');
        field_Ib = "Open portal - Opens a single portal for a single god's forces at the current map tile";
    }
}
