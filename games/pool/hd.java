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
        int var2;
        int var3;
        dd var4;
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
                  if ((cr.field_m.field_D[var2] & -16777216 ^ -1) == -1) {
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
            var4 = (dd) null;
            hd.a(-122, -16, 103, (dd) null, 91, -103, -122, -85);
            break L2;
          }
        }
    }

    final static void a(int param0, int param1, boolean param2, int[] param3, int[] param4, int[] param5, int[] param6) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Pool.field_O;
        try {
          L0: {
            if (param2) {
              var7_int = param1;
              L1: while (true) {
                if (param0 <= var7_int) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var8 = param3[var7_int];
                  var9 = param5[var7_int];
                  var10 = param4[var7_int];
                  param3[var7_int] = (var8 * param6[3] - (-(param6[4] * var9) + -(var10 * param6[5])) >> -1991863984) + param6[0];
                  param5[var7_int] = (param6[6] * var8 + param6[7] * var9 - -(var10 * param6[8]) >> -735994096) + param6[1];
                  param4[var7_int] = param6[2] + (param6[11] * var10 + (var9 * param6[10] + var8 * param6[9]) >> 297706256);
                  var7_int++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var7);

            stackIn_9_1 = new StringBuilder().append("hd.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param5 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param6 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
        if (!((var2 ^ -1) != -2)) {
            fq.a(-3405, 0, sq.field_b, false);
        }
        if (!((var2 ^ -1) != -3)) {
            fq.a(-3405, 0, sq.field_b, true);
        }
    }

    final static void a(int param0, int param1, int param2, dd param3, int param4, int param5, int param6, int param7) {
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
        int[] var29 = null;
        int[] var30 = null;
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
              if (qh.field_j < param6 + param5) {
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
              if (param2 + param7 <= qh.field_g) {
                break L4;
              } else {
                param2 = qh.field_g + -param7;
                break L4;
              }
            }
            L5: {
              if (-1 <= (param5 ^ -1)) {
                break L5;
              } else {
                if (0 >= param2) {
                  break L5;
                } else {
                  var21 = param3.d();
                  var30 = qh.field_d;
                  var10 = qh.field_l;
                  var11 = qh.field_f;
                  var29 = new int[param4];
                  qh.a(var29);
                  param3.e();
                  qh.d(var29[0], var29[1], var29[2], var29[3]);
                  var13 = param6 - -(param3.field_z * param7);
                  var14 = param3.field_z + -param5;
                  var25 = var21.field_D;
                  var22 = var25;
                  var15 = var22;
                  var16 = param7;
                  L6: while (true) {
                    if (var16 >= param7 + param2) {
                      var21.c(-param3.field_G, -param3.field_B);
                      qh.a(var30, var10, var11);
                      qh.b(var29);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var17 = param6;
                      L7: while (true) {
                        if (var17 >= param5 + param6) {
                          var13 = var13 + var14;
                          var16++;
                          continue L6;
                        } else {
                          L8: {
                            var18 = var25[var13];
                            if (-1 == (var18 ^ -1)) {
                              break L8;
                            } else {
                              L9: {
                                if (-1 <= (var17 ^ -1)) {
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
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var8 = decompiledCaughtException;
            stackIn_42_0 = (RuntimeException) (var8);

            stackIn_42_1 = new StringBuilder().append("hd.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L12;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L12;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_K = "Security";
    }
}
