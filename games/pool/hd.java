/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd extends ob {
    static int field_J;
    static int field_H;
    static String field_K;
    static int field_I;

    public static void b(boolean param0) {
        if (!param0) {
            return;
        }
        field_K = null;
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        L0: {
          var3 = Pool.field_O;
          pn.field_l.a(0, 0);
          if (cm.f((byte) 109)) {
            ae.a(-2);
            if (!ea.field_l) {
              var2 = 0;
              L1: while (true) {
                if (var2 >= cr.field_m.field_D.length) {
                  ea.field_l = true;
                  ae.a(-2);
                  break L0;
                } else {
                  if ((cr.field_m.field_D[var2] & -16777216) == 0) {
                    if (0 != (cr.field_m.field_D[var2] & 16777215)) {
                      cr.field_m.field_D[var2] = md.a(cr.field_m.field_D[var2], -16777216);
                      var2++;
                      continue L1;
                    } else {
                      var2++;
                      continue L1;
                    }
                  } else {
                    var2++;
                    continue L1;
                  }
                }
              }
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        L2: {
          if (param0 > 36) {
            break L2;
          } else {
            var4 = null;
            hd.a(-122, -16, 103, (dd) null, 91, -103, -122, -85);
            break L2;
          }
        }
    }

    final static void a(int param0, int param1, boolean param2, int[] param3, int[] param4, int[] param5, int[] param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var11 = Pool.field_O;
        try {
          L0: {
            if (param2) {
              var7_int = param1;
              L1: while (true) {
                if (param0 <= var7_int) {
                  break L0;
                } else {
                  var8 = param3[var7_int];
                  var9 = param5[var7_int];
                  var10 = param4[var7_int];
                  param3[var7_int] = (var8 * param6[3] - (-(param6[4] * var9) + -(var10 * param6[5])) >> 16) + param6[0];
                  param5[var7_int] = (param6[6] * var8 + param6[7] * var9 - -(var10 * param6[8]) >> 16) + param6[1];
                  param4[var7_int] = param6[2] + (param6[11] * var10 + (var9 * param6[10] + var8 * param6[9]) >> 16);
                  var7_int++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var7;
            stackOut_7_1 = new StringBuilder().append("hd.E(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param4 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param5 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param6 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
    }

    hd(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super((dd) null, param0, param1, param2, param3, param4, param5);
    }

    final void d(int param0) {
        int var2 = 0;
        if (param0 == -1) {
            var2 = fd.a(!ue.a(11) ? true : false, (byte) 65);
        } else {
            hd.b(false);
            var2 = fd.a(!ue.a(11) ? true : false, (byte) 65);
        }
        if (3 == var2) {
            if (!(ne.field_u == null)) {
                tq.d((byte) -106);
            }
            s.a(hk.d(58), 2056898529);
        }
        if (!(var2 != 1)) {
            fq.a(-3405, 0, sq.field_b, false);
        }
        if (!(var2 != 2)) {
            fq.a(-3405, 0, sq.field_b, true);
        }
    }

    final static void a(int param0, int param1, int param2, dd param3, int param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        dd var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var28 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var19 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (qh.field_b > param6) {
                param5 = param5 - (-param6 + qh.field_b);
                param6 = qh.field_b;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (~qh.field_j > ~(param6 + param5)) {
                param5 = qh.field_j + -param6;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param7 >= qh.field_c) {
                break L3;
              } else {
                param2 = param2 - (qh.field_c + -param7);
                param7 = qh.field_c;
                break L3;
              }
            }
            L4: {
              if (~(param2 + param7) >= ~qh.field_g) {
                break L4;
              } else {
                param2 = qh.field_g + -param7;
                break L4;
              }
            }
            L5: {
              if (param5 <= 0) {
                break L5;
              } else {
                if (0 >= param2) {
                  break L5;
                } else {
                  var21 = param3.d();
                  var32 = qh.field_d;
                  var10 = qh.field_l;
                  var11 = qh.field_f;
                  var30 = new int[param4];
                  qh.a(var30);
                  param3.e();
                  qh.d(var30[0], var30[1], var30[2], var30[3]);
                  var13 = param6 - -(param3.field_z * param7);
                  var14 = param3.field_z + -param5;
                  var31 = var21.field_D;
                  var28 = var31;
                  var25 = var28;
                  var22 = var25;
                  var15 = var22;
                  var16 = param7;
                  L6: while (true) {
                    if (var16 >= param7 + param2) {
                      var21.c(-param3.field_G, -param3.field_B);
                      qh.a(var32, var10, var11);
                      qh.b(var30);
                      break L0;
                    } else {
                      var17 = param6;
                      L7: while (true) {
                        if (~var17 <= ~(param5 + param6)) {
                          var13 = var13 + var14;
                          var16++;
                          continue L6;
                        } else {
                          L8: {
                            var18 = var31[var13];
                            if (var18 == 0) {
                              break L8;
                            } else {
                              L9: {
                                if (var17 <= 0) {
                                  break L9;
                                } else {
                                  if (0 == var15[-1 + var13]) {
                                    qh.a(var17, var16, param1, param0);
                                    break L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              L10: {
                                if (var16 <= 0) {
                                  break L10;
                                } else {
                                  if (var15[var13 + -param3.field_z] == 0) {
                                    qh.a(var17, var16, param1, param0);
                                    break L8;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              L11: {
                                if (var17 >= param3.field_z + -1) {
                                  break L11;
                                } else {
                                  if (0 == var15[1 + var13]) {
                                    qh.a(var17, var16, param1, param0);
                                    break L8;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              if (var16 >= param3.field_A + -1) {
                                break L8;
                              } else {
                                if (0 != var15[param3.field_z + var13]) {
                                  break L8;
                                } else {
                                  qh.a(var17, var16, param1, param0);
                                  break L8;
                                }
                              }
                            }
                          }
                          var13++;
                          var17++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var8 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var8;
            stackOut_40_1 = new StringBuilder().append("hd.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param3 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L12;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L12;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "Security";
    }
}
