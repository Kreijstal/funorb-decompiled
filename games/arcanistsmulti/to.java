/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class to extends tf {
    static qb field_q;
    static String field_n;
    static int[] field_r;
    static hf field_s;
    static String field_o;
    static int field_p;
    static int field_m;

    public static void c() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_s = null;
            field_o = null;
            field_n = null;
            field_q = null;
            field_r = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "to.NA(" + false + ')');
        }
    }

    final static void a(boolean param0, byte param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!pn.a((byte) 111)) {
                break L1;
              } else {
                param0 = false;
                break L1;
              }
            }
            L2: {
              ej.a(-11837, param0);
              var2_int = 125 / ((25 - param1) / 59);
              if (!ua.field_J) {
                break L2;
              } else {
                de.b(tn.field_Ob.field_c.field_T, tn.field_Ob.field_c.field_db, tn.field_Ob.field_c.field_x, tn.field_Ob.field_c.field_I);
                tn.field_Ob.field_c.a(param0, true);
                break L2;
              }
            }
            int discarded$2 = -73;
            bg.a(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.a((Throwable) (Object) runtimeException, "to.LA(" + param0 + ',' + param1 + ')');
        }
    }

    to() {
    }

    final static void a(byte[] param0, boolean param1, int[] param2, int param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            L1: while (true) {
              if (kl.field_B.length <= var5_int) {
                L2: {
                  if (0 == 0) {
                    break L2;
                  } else {
                    field_p = 100;
                    break L2;
                  }
                }
                break L0;
              } else {
                param3 = kl.field_B[var5_int];
                var6 = var5_int << 4;
                L3: while (true) {
                  int incrementValue$62 = param3;
                  param3--;
                  if (incrementValue$62 == 0) {
                    var5_int++;
                    continue L1;
                  } else {
                    int incrementValue$63 = var6;
                    var6++;
                    param4 = w.field_Lb[incrementValue$63];
                    param2[param0[param4]] = param2[param0[param4]] + 1;
                    w.field_Lb[param2[param0[param4]]] = param4;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("to.OA(");
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(false).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static int d() {
        try {
            IOException var1 = null;
            RuntimeException var1_ref = null;
            wk var1_ref2 = null;
            int var1_int = 0;
            int stackIn_5_0 = 0;
            int stackIn_8_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_23_0 = 0;
            int stackIn_39_0 = 0;
            int stackIn_47_0 = 0;
            int stackIn_50_0 = 0;
            int stackIn_52_0 = 0;
            int stackIn_54_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_9_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_22_0 = 0;
            int stackOut_46_0 = 0;
            int stackOut_38_0 = 0;
            int stackOut_51_0 = 0;
            int stackOut_49_0 = 0;
            int stackOut_53_0 = 0;
            try {
              if (4 <= jl.field_c.field_i) {
                if (jl.field_c.field_o != -1) {
                  if (jl.field_c.field_o != -2) {
                    stackOut_9_0 = 1;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    stackOut_7_0 = 4;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  }
                } else {
                  stackOut_4_0 = 3;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0;
                }
              } else {
                L0: {
                  if (0 == uh.field_m) {
                    hg.field_a = ri.field_g.a(ed.field_Hb, true, jd.field_g);
                    uh.field_m = uh.field_m + 1;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                L1: {
                  if (uh.field_m != 1) {
                    break L1;
                  } else {
                    if (hg.field_a.field_e != 2) {
                      if (hg.field_a.field_e != 1) {
                        break L1;
                      } else {
                        uh.field_m = uh.field_m + 1;
                        break L1;
                      }
                    } else {
                      stackOut_22_0 = hg.a((byte) 110, -1);
                      stackIn_23_0 = stackOut_22_0;
                      return stackIn_23_0;
                    }
                  }
                }
                L2: {
                  if (uh.field_m == 2) {
                    td.field_E = new k((java.net.Socket) hg.field_a.field_g, ri.field_g);
                    var1_ref2 = new wk(13);
                    jb.a(var1_ref2, ne.field_b, ib.field_u, ce.field_o, 123);
                    var1_ref2.f(15, (byte) -28);
                    var1_ref2.a(hd.field_a, (byte) -101);
                    td.field_E.a(13, 0, (byte) 126, var1_ref2.field_j);
                    uh.field_m = uh.field_m + 1;
                    ud.field_E = qj.b(-26572) + 30000L;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (3 == uh.field_m) {
                    if (td.field_E.b(0) <= 0) {
                      if (qj.b(-26572) > ud.field_E) {
                        stackOut_46_0 = hg.a((byte) 110, -2);
                        stackIn_47_0 = stackOut_46_0;
                        return stackIn_47_0;
                      } else {
                        break L3;
                      }
                    } else {
                      var1_int = td.field_E.a((byte) 120);
                      if (var1_int != 0) {
                        stackOut_38_0 = hg.a((byte) 110, var1_int);
                        stackIn_39_0 = stackOut_38_0;
                        return stackIn_39_0;
                      } else {
                        uh.field_m = uh.field_m + 1;
                        break L3;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                if (uh.field_m != 4) {
                  stackOut_51_0 = -1;
                  stackIn_52_0 = stackOut_51_0;
                  return stackIn_52_0;
                } else {
                  jl.field_c.a(ab.field_n, true, (Object) (Object) td.field_E);
                  hg.field_a = null;
                  td.field_E = null;
                  uh.field_m = 0;
                  stackOut_49_0 = 0;
                  stackIn_50_0 = stackOut_49_0;
                  return stackIn_50_0;
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (IOException) (Object) decompiledCaughtException;
              stackOut_53_0 = hg.a((byte) 110, -3);
              stackIn_54_0 = stackOut_53_0;
              return stackIn_54_0;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw aa.a((Throwable) (Object) var1_ref, "to.MA(" + true + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, int[] param1, int[] param2, boolean param3, vg param4) {
        RuntimeException var7 = null;
        int var7_int = 0;
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
        int stackIn_56_0 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_54_0 = 0;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        var31 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var7_int = 2147483647;
            var8 = -2147483648;
            var15 = -16;
            var22 = param1[3] >> 2;
            var23 = param1[4] >> 2;
            var24 = param1[5] >> 2;
            var25 = param1[6] >> 2;
            var26 = param1[7] >> 2;
            var27 = param1[8] >> 2;
            var28 = param1[9] >> 2;
            var29 = param1[10] >> 2;
            var30 = param1[11] >> 2;
            var12 = param2[5] * var24 + (param2[4] * var23 + param2[3] * var22) >> 14;
            var13 = var25 * param2[3] + (var26 * param2[4] + var27 * param2[5]) >> 14;
            var14 = var28 * param2[3] - -(var29 * param2[4]) + param2[5] * var30 >> 14;
            var16 = var24 * param2[8] + var22 * param2[6] + var23 * param2[7] >> 14;
            var17 = var26 * param2[7] + (var25 * param2[6] + var27 * param2[8]) >> 14;
            var21 = var29 * param2[10] + (var28 * param2[9] - -(var30 * param2[11])) >> 14;
            var20 = param2[9] * var25 + (var26 * param2[10] + var27 * param2[11]) >> 14;
            var18 = param2[8] * var30 + param2[6] * var28 + var29 * param2[7] >> 14;
            var19 = var23 * param2[10] + param2[9] * var22 - -(var24 * param2[11]) >> 14;
            var22 = -param1[0] + param2[0];
            var23 = param2[1] - param1[1];
            var24 = -param1[2] + param2[2];
            var9 = var24 * param1[5] + (param1[3] * var22 + param1[4] * var23) >> 16 + -tj.field_C;
            var10 = var24 * param1[8] + (param1[7] * var23 + var22 * param1[6]) >> 16 - tj.field_C;
            var11 = var24 * param1[11] + (var23 * param1[10] + param1[9] * var22) >> 16;
            var22 = id.field_i;
            var23 = id.field_g;
            var24 = 0;
            L1: while (true) {
              if (~var24 <= ~param4.field_f) {
                L2: {
                  if (null == param4.field_y) {
                    break L2;
                  } else {
                    if (param4.field_g == null) {
                      break L2;
                    } else {
                      if (param4.field_x == null) {
                        break L2;
                      } else {
                        if (null == param4.field_J) {
                          break L2;
                        } else {
                          if (param4.field_a == null) {
                            break L2;
                          } else {
                            if (param4.field_j == null) {
                              break L2;
                            } else {
                              if (param4.field_o == null) {
                                break L2;
                              } else {
                                if (param4.field_E == null) {
                                  break L2;
                                } else {
                                  if (param4.field_p != null) {
                                    var24 = 0;
                                    L3: while (true) {
                                      if (~param4.field_G >= ~var24) {
                                        break L2;
                                      } else {
                                        var25 = param4.field_y[var24];
                                        var26 = param4.field_g[var24];
                                        var27 = param4.field_x[var24];
                                        sl.field_V[var24] = (var16 * var26 + (var25 * var12 + var19 * var27) >> 16) + var9;
                                        k.field_m[var24] = var10 + (var27 * var20 + var26 * var17 + var25 * var13 >> 16);
                                        kc.field_N[var24] = (var21 * var27 + var18 * var26 + var25 * var14 >> 16) + var11;
                                        var25 = param4.field_J[var24];
                                        var26 = param4.field_a[var24];
                                        var27 = param4.field_j[var24];
                                        cn.field_M[var24] = var9 - -(var27 * var19 + (var16 * var26 + var12 * var25) >> 16);
                                        q.field_E[var24] = (var25 * var13 - -(var26 * var17) + var27 * var20 >> 16) + var10;
                                        dh.field_Db[var24] = (var26 * var18 + var25 * var14 + var27 * var21 >> 16) + var11;
                                        var25 = param4.field_o[var24];
                                        var26 = param4.field_E[var24];
                                        var27 = param4.field_p[var24];
                                        ik.field_d[var24] = (var19 * var27 + var12 * var25 - -(var26 * var16) >> 16) + var9;
                                        be.field_m[var24] = (var27 * var20 + (var13 * var25 + var17 * var26) >> 16) + var10;
                                        lm.field_b[var24] = var11 + (var21 * var27 + (var26 * var18 + var25 * var14) >> 16);
                                        var24++;
                                        continue L3;
                                      }
                                    }
                                  } else {
                                    break L2;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                var9 = param2[3];
                var10 = param2[4];
                var11 = param2[5];
                var12 = param2[6];
                var13 = param2[7];
                var14 = param2[8];
                var15 = param2[9];
                var16 = param2[10];
                var17 = param2[11];
                var18 = 0;
                L4: while (true) {
                  L5: {
                    if (~param4.field_A >= ~var18) {
                      break L5;
                    } else {
                      stackOut_54_0 = ~var18;
                      stackIn_56_0 = stackOut_54_0;
                      if (stackIn_56_0 <= ~dc.field_k.length) {
                        break L5;
                      } else {
                        var19 = param4.field_r[var18];
                        var20 = param4.field_e[var18];
                        var21 = param4.field_S[var18];
                        dc.field_k[var18] = var9 * var19 - (-(var12 * var20) - var21 * var15) >> 16;
                        nf.field_Lb[var18] = var16 * var21 + var13 * var20 + var10 * var19 >> 16;
                        mf.field_b[var18] = var21 * var17 + var19 * var11 - -(var20 * var14) >> 16;
                        var18++;
                        continue L4;
                      }
                    }
                  }
                  ig.a(false, param4, var8, (byte) -79, var7_int);
                  break L0;
                }
              } else {
                L6: {
                  var25 = param4.field_b[var24];
                  var26 = param4.field_B[var24];
                  var27 = param4.field_L[var24];
                  var28 = var9 - -(var25 * var12 - (-(var26 * var16) - var27 * var19) >> -tj.field_C + 16);
                  var29 = (var20 * var27 + var17 * var26 + var13 * var25 >> 16 - tj.field_C) + var10;
                  var30 = var11 - -(var27 * var21 + var14 * var25 - -(var18 * var26) >> 16);
                  if (50 > var30) {
                    eg.field_a[var24] = -2147483648;
                    break L6;
                  } else {
                    L7: {
                      ud.field_p[var24] = var28 / var30 + var22;
                      v.field_g[var24] = var29 / var30 + var23;
                      if (~var30 >= ~var8) {
                        break L7;
                      } else {
                        var8 = var30;
                        break L7;
                      }
                    }
                    eg.field_a[var24] = var30;
                    if (var30 < var7_int) {
                      var7_int = var30;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                var24++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackOut_62_0 = (RuntimeException) var7;
            stackOut_62_1 = new StringBuilder().append("to.KA(").append(-61).append(',');
            stackIn_65_0 = stackOut_62_0;
            stackIn_65_1 = stackOut_62_1;
            stackIn_63_0 = stackOut_62_0;
            stackIn_63_1 = stackOut_62_1;
            if (param1 == null) {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "null";
              stackIn_66_0 = stackOut_65_0;
              stackIn_66_1 = stackOut_65_1;
              stackIn_66_2 = stackOut_65_2;
              break L8;
            } else {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "{...}";
              stackIn_66_0 = stackOut_63_0;
              stackIn_66_1 = stackOut_63_1;
              stackIn_66_2 = stackOut_63_2;
              break L8;
            }
          }
          L9: {
            stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
            stackOut_66_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_66_2).append(',');
            stackIn_69_0 = stackOut_66_0;
            stackIn_69_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param2 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L9;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_70_0 = stackOut_67_0;
              stackIn_70_1 = stackOut_67_1;
              stackIn_70_2 = stackOut_67_2;
              break L9;
            }
          }
          L10: {
            stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',').append(true).append(',');
            stackIn_73_0 = stackOut_70_0;
            stackIn_73_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param4 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L10;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_74_0 = stackOut_71_0;
              stackIn_74_1 = stackOut_71_1;
              stackIn_74_2 = stackOut_71_2;
              break L10;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + ',' + false + ',' + false + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "You need a rating of <%1> to play with the current options.";
        field_o = "If you run out of Imps, just summon some more. Move an Imp to a target and blow it up!";
        field_r = new int[228];
    }
}
