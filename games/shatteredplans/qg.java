/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg extends me {
    private int[] field_s;
    static int field_q;
    static String field_o;
    static int[] field_r;
    static int[] field_t;
    static int[] field_l;
    static String field_k;
    static int[][] field_p;
    static int[] field_m;
    private int[] field_n;

    final void a(ob param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -109) {
                break L1;
              } else {
                int discarded$2 = ((qg) this).b(true);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("qg.G(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static void a(ob param0, boolean param1) {
        int var2_int = 0;
        try {
            np.field_j = param0.f(-20976) << 5;
            var2_int = param0.j(-101);
            np.field_j = np.field_j + (var2_int >> 3);
            gp.field_c = 1835008 & var2_int << 18;
            gp.field_c = gp.field_c + (param0.f(-20976) << 2);
            var2_int = param0.j(-120);
            gp.field_c = gp.field_c + (var2_int >> 6);
            ig.field_d = 2064384 & var2_int << 15;
            ig.field_d = ig.field_d + (param0.j(-122) << 7);
            var2_int = param0.j(-127);
            na.field_L = (1 & var2_int) << 16;
            ig.field_d = ig.field_d + (var2_int >> 1);
            na.field_L = na.field_L + param0.f(-20976);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "qg.B(" + (param0 != null ? "{...}" : "null") + ',' + false + ')');
        }
    }

    final void a(byte param0, dc param1, kq param2) {
        RuntimeException var4 = null;
        int[] var4_array = null;
        int var5 = 0;
        int[] var6 = null;
        int var7_int = 0;
        fs[] var7 = null;
        int var8_int = 0;
        int[] var8 = null;
        int[] var9 = null;
        int var10_int = 0;
        fs[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        double var13 = 0.0;
        int var15 = 0;
        double var16 = 0.0;
        int var18 = 0;
        int[] var19 = null;
        int[] var20 = null;
        int var21 = 0;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        qk[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        var18 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var38 = new int[((qg) this).field_i.length];
            var33 = var38;
            var28 = var33;
            var22 = var28;
            var19 = var22;
            var40 = var19;
            var35 = var40;
            var30 = var35;
            var24 = var30;
            var4_array = var24;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var38.length) {
                L2: {
                  if (param0 < -9) {
                    break L2;
                  } else {
                    qg.c(-41);
                    break L2;
                  }
                }
                var5 = 0;
                var39 = ((qg) this).field_n;
                var34 = var39;
                var29 = var34;
                var23 = var29;
                var20 = var23;
                var6 = var20;
                var7_int = 0;
                L3: while (true) {
                  if (var7_int >= var39.length) {
                    L4: {
                      if (var5 <= 0) {
                        break L4;
                      } else {
                        lh.a((byte) 50, var4_array, (int[]) ((qg) this).field_n.clone());
                        break L4;
                      }
                    }
                    var27 = new qk[]{new qk(0, 0, 182, rs.field_Cb.field_J, re.a(ShatteredPlansClient.field_J, 4371, new String[1]))};
                    var7 = new fs[((qg) this).field_i.length];
                    var42 = new int[((qg) this).field_i.length];
                    var37 = var42;
                    var32 = var37;
                    var26 = var32;
                    var8 = var26;
                    var41 = new int[((qg) this).field_i.length];
                    var36 = var41;
                    var31 = var36;
                    var25 = var31;
                    var9 = var25;
                    var10_int = 0;
                    L5: while (true) {
                      if (var10_int >= ((qg) this).field_i.length) {
                        L6: {
                          if (null != ((qg) this).field_g) {
                            var10 = ((qg) this).field_g;
                            var11 = 0;
                            break L6;
                          } else {
                            var12 = 0;
                            var13 = 1.7976931348623157e+308;
                            var15 = 0;
                            L7: while (true) {
                              if (((qg) this).field_i.length <= var15) {
                                if (var12 == 0) {
                                  var10 = new fs[]{};
                                  var11 = 0;
                                  break L6;
                                } else {
                                  var10 = new fs[var12];
                                  var21 = 0;
                                  var15 = var21;
                                  L8: while (true) {
                                    if (var21 >= ((qg) this).field_i.length) {
                                      var11 = (int)Math.ceil(var13);
                                      break L6;
                                    } else {
                                      L9: {
                                        if (((qg) this).field_s[var21] != 0) {
                                          var16 = (double)(-((qg) this).field_n[var21] + 10) / (double)((qg) this).field_s[var21];
                                          if (var16 == var13) {
                                            var12--;
                                            var10[var12] = ((qg) this).field_i[var21];
                                            break L9;
                                          } else {
                                            break L9;
                                          }
                                        } else {
                                          break L9;
                                        }
                                      }
                                      var21++;
                                      continue L8;
                                    }
                                  }
                                }
                              } else {
                                L10: {
                                  if (((qg) this).field_s[var15] == 0) {
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                }
                                var15++;
                                continue L7;
                              }
                            }
                          }
                        }
                        param2.a(10, var7, var41, var42, var10, var27, (byte) -47, var11);
                        break L0;
                      } else {
                        var7[var10_int] = ((qg) this).field_i[var40[var10_int]];
                        var8[var10_int] = ((qg) this).field_n[var40[var10_int]];
                        var9[var10_int] = ((qg) this).field_s[var40[var10_int]];
                        var10_int++;
                        continue L5;
                      }
                    }
                  } else {
                    var8_int = var39[var7_int];
                    var5 = var5 + var8_int;
                    var7_int++;
                    continue L3;
                  }
                }
              } else {
                var38[var5] = var5;
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_45_0 = (RuntimeException) var4;
            stackOut_45_1 = new StringBuilder().append("qg.I(").append(param0).append(',');
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param1 == null) {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L11;
            } else {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L11;
            }
          }
          L12: {
            stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
            stackOut_48_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',');
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param2 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L12;
            } else {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L12;
            }
          }
          throw r.a((Throwable) (Object) stackIn_51_0, stackIn_51_2 + ')');
        }
    }

    final int b(boolean param0) {
        if (param0) {
            field_p = null;
        }
        return 4 * cc.field_n + rs.field_Cb.field_J;
    }

    final boolean a(dc param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if ((param0.field_w & 1) == 0) {
              if (6 <= kb.field_x) {
                if (param1 >= 23) {
                  if (0 == (4 & param0.field_w)) {
                    stackOut_18_0 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    break L0;
                  } else {
                    ((qg) this).field_g = new fs[1];
                    ((qg) this).field_g[0] = param0.field_v[0];
                    stackOut_16_0 = 1;
                    stackIn_17_0 = stackOut_16_0;
                    return stackIn_17_0 != 0;
                  }
                } else {
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0 != 0;
                }
              } else {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                return stackIn_11_0 != 0;
              }
            } else {
              ((qg) this).field_g = new fs[1];
              var3_int = 1;
              L1: while (true) {
                if (param0.field_v.length <= var3_int) {
                  stackOut_7_0 = 1;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                } else {
                  L2: {
                    if ((param0.field_w & 1 << var3_int) != 0) {
                      break L2;
                    } else {
                      ((qg) this).field_g[0] = param0.field_v[var3_int];
                      break L2;
                    }
                  }
                  var3_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("qg.F(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L3;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param1 + ')');
        }
        return stackIn_19_0 != 0;
    }

    qg(fs[] param0) {
        super(param0);
        try {
            ((qg) this).field_n = new int[((qg) this).field_i.length];
            ((qg) this).field_s = new int[((qg) this).field_i.length];
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "qg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final fs[] b(int param0) {
        if (param0 != 0) {
            ((qg) this).field_n = null;
        }
        return new fs[]{};
    }

    public static void c(int param0) {
        field_k = null;
        if (param0 >= -93) {
            Object var2 = null;
            qg.a(-23, (mj) null, -88, (ub) null, -99, 99, (byte) 109);
        }
        field_r = null;
        field_o = null;
        field_t = null;
        field_p = null;
        field_m = null;
        field_l = null;
    }

    final void a(int param0, ob param1) {
        try {
            int var3_int = 1 / ((-72 - param0) / 45);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "qg.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, mj param1, int param2, ub param3, int param4, int param5, byte param6) {
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        fc var12 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              tp.a((int[]) null, param1.field_Ib, param1.field_Cb, param1.field_Db, 293, param3, (qr) (Object) param1, -1, -1);
              hp.field_m.a(true, param6 ^ -16763);
              hp.field_m.a((int[]) null, 0, (byte) -36);
              hp.field_m.b(17);
              var12 = hp.field_m;
              var8 = param0;
              var9 = param2;
              var10 = param4;
              var11 = param5;
              var12.field_j.b(var10, var11, 0, var8, var9);
              if (param6 == 110) {
                break L1;
              } else {
                field_t = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var7;
            stackOut_3_1 = new StringBuilder().append("qg.E(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new int[14];
        field_l = new int[14];
        field_o = "Remove name";
        field_p = new int[14][];
        field_q = 0;
        field_m = new int[14];
        field_r = new int[14];
        field_k = "This password is part of your Player Name, and would be easy to guess";
        qd.a(25, 0, 400, new int[8], (byte) -5, 200, 0);
        qd.a(25, 0, 320, new int[5], (byte) -5, 150, 1);
        qd.a(25, 0, 320, new int[7], (byte) -5, 150, 2);
        qd.a(25, 0, 370, new int[6], (byte) -5, 150, 3);
        qd.a(25, 0, 320, new int[5], (byte) -5, 150, 4);
        qd.a(25, 0, 400, new int[2], (byte) -5, 380, 5);
        qd.a(25, 320, 500, new int[2], (byte) -5, 70, 6);
        qd.a(25, 320, 500, new int[1], (byte) -5, 50, 7);
        qd.a(25, 0, 500, new int[2], (byte) -5, 400, 8);
        qd.a(25, 0, 500, new int[2], (byte) -5, 200, 9);
        qd.a(25, 0, 320, new int[1], (byte) -5, 400, 10);
        qd.a(25, 0, 0, new int[0], (byte) -5, 200, 11);
        qd.a(25, 0, 500, new int[4], (byte) -5, 200, 12);
        qd.a(25, 0, 400, new int[6], (byte) -5, 200, 13);
    }
}
