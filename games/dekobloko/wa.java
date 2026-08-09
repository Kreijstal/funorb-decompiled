/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa {
    static String field_b;
    static int field_c;
    static String field_e;
    static w field_a;
    static String field_f;
    static int[] field_d;

    final static ig a(int[] param0, w param1, byte param2, w param3, w param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        String[] var6 = null;
        char[] var7 = null;
        ig[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        me var11 = null;
        int var12 = 0;
        char[] var13 = null;
        char[] var14 = null;
        ig stackIn_3_0 = null;
        Object stackIn_12_0 = null;
        ig stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        Exception var10 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 == -127) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = (ig) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        var5_int = param0.length;
                        var6 = new String[var5_int];
                        var14 = new char[var5_int];
                        var13 = var14;
                        var7 = var13;
                        var8 = new ig[var5_int];
                        var9 = 49;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var10_int = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = ((Object) stateCaught_5 instanceof Exception ? 11 : 15);
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var5_int <= var10_int) {
                            statePc = 13;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = ((Object) stateCaught_6 instanceof Exception ? 11 : 15);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var11 = wj.field_Qb.a(126, param0[var10_int]);
                        var6[var10_int] = var11.f((byte) -92);
                        var9 = (char)(var9 + 1);
                        var7[var10_int] = (char)var9;
                        var8[var10_int] = null;
                        var10_int++;
                        if (var12 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = ((Object) stateCaught_7 instanceof Exception ? 11 : 15);
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var12 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = ((Object) stateCaught_8 instanceof Exception ? 11 : 15);
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = ((Object) stateCaught_9 instanceof Exception ? 11 : 15);
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var10 = (Exception) ((Object) caughtException);
                        stackIn_12_0 = null;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return (ig) ((Object) stackIn_12_0);
                }
                case 13: {
                    try {
                        stackIn_14_0 = new ig(0L, param1, param3, param4, var8, param0, var6, var14);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return stackIn_14_0;
                }
                case 15: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_17_0 = (RuntimeException) (var5);
                    stackIn_16_0 = stackIn_17_0;
                    stackIn_17_1 = new StringBuilder().append("wa.D(");
                    stackIn_16_1 = stackIn_17_1;
                    if (param0 == null) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_18_2 = "{...}";
                    statePc = 18;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_18_2 = "null";
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_19_0 = stackIn_20_0;
                    stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
                    stackIn_19_1 = stackIn_20_1;
                    if (param1 == null) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_19_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_19_1);
                    stackIn_21_2 = "{...}";
                    statePc = 21;
                    continue stateLoop;
                }
                case 20: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                    stackIn_21_2 = "null";
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_21_0);
                    stackIn_22_0 = stackIn_23_0;
                    stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param2).append(',');
                    stackIn_22_1 = stackIn_23_1;
                    if (param3 == null) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackIn_24_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_24_1 = (StringBuilder) ((Object) stackIn_22_1);
                    stackIn_24_2 = "{...}";
                    statePc = 24;
                    continue stateLoop;
                }
                case 23: {
                    stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
                    stackIn_24_2 = "null";
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    stackIn_26_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_25_0 = stackIn_26_0;
                    stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
                    stackIn_25_1 = stackIn_26_1;
                    if (param4 == null) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_25_0);
                    stackIn_27_1 = (StringBuilder) ((Object) stackIn_25_1);
                    stackIn_27_2 = "{...}";
                    statePc = 27;
                    continue stateLoop;
                }
                case 26: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_27_2 = "null";
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    throw dh.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        ff var4 = null;
        sb var5 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4 = (ff) ((Object) cd.field_c.c((byte) 119));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var4 == null) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        mc.a(true, var4, param1);
                        var4 = (ff) ((Object) cd.field_c.d(true));
                        if (var3 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param0 == 3) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return;
                }
                case 8: {
                    try {
                        var5 = (sb) ((Object) ef.field_S.c((byte) 80));
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var5 == null) {
                            statePc = 16;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        oi.a(param0 ^ -87, param1, var5);
                        var5 = (sb) ((Object) ef.field_S.d(true));
                        if (var3 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        return;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var3 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        return;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw dh.a((Throwable) ((Object) var2), "wa.A(" + param0 + ',' + param1 + ')');
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static w a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, mm param12) {
        w var13 = null;
        RuntimeException var13_ref = null;
        w var14 = null;
        w stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var13 = new w(0L, (w) null);
              var13.field_lb = df.a(param9, 0, param6);
              var13.field_S = df.a(param3, 0, param1);
              var13.field_eb = df.a(param0, 0, param5);
              var13.field_Q = df.a(param4, param11 + 24447, param8);
              var13.field_Ab = df.a(param10, 0, param7);
              var13.field_G = param2;
              if (param11 == -24447) {
                break L1;
              } else {
                var14 = (w) null;
                wa.a((int[]) null, (w) null, (byte) -92, (w) null, (w) null);
                break L1;
              }
            }
            var13.field_J = param12;
            stackIn_3_0 = (w) (var13);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var13_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var13_ref);

            stackIn_6_1 = new StringBuilder().append("wa.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');

            if (param12 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 18) {
          wa.a(-113, -90);
          field_a = null;
          field_d = null;
          field_f = null;
          field_e = null;
          return;
        } else {
          field_a = null;
          field_d = null;
          field_f = null;
          field_e = null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7;
        int var8;
        int var9;
        int stackIn_3_0 = 0;
        L0: {
          var9 = client.field_A ? 1 : 0;
          if ((param6 ^ -1) > -81) {
            stackIn_3_0 = param6 / 20 * 18;
            break L0;
          } else {
            stackIn_3_0 = 54;
            break L0;
          }
        }
        var7 = stackIn_3_0;
        var8 = 0;
        if ((param6 ^ -1) <= -61) {
          if ((param6 ^ -1) > -81) {
            var7 = var7 + vl.a(23841, 80, 18 * param1 - -40);
            if (var9 != 0) {
              if (93 <= param6) {
                hk.a(param3 - 3, param2 + 36 - 3, 60, 60, 4, 65280, 100);
                if (var9 == 0) {
                  cg.a(param5, 2, 6, param3, 1 + (72 + param2), 2, -2);
                  cg.a(param5, 2, 12, param3, 1 + (param2 - -54), 2, param4);
                  cg.a(param5, 2, 8, param3, 36 + (param2 + 1), 2, -1);
                  cg.a(param5, 2, 1, param3 + 18, param2 + 72 - -1, 1, -2);
                  fb.field_c[param5][2].c(param3 - -18, param2 + 36, 18, 18);
                  fb.field_c[param5][2].c(param3 + 18, 54 + param2, 18, 18);
                  fb.field_c[param5][2].c(param3 + 36, 72 + param2, 18, 18);
                  fb.field_c[param5][2].c(36 + param3, var7 + (param2 + var8), 18, 18 - var8);
                  return;
                } else {
                  var8 = vl.a(23841, 80, ve.field_ic[1 + param6 - 80] * 18 + 40);
                  var7 = var7 + vl.a(23841, 80, 40 + 18 * param0);
                  cg.a(param5, 2, 6, param3, 1 + (72 + param2), 2, -2);
                  cg.a(param5, 2, 12, param3, 1 + (param2 - -54), 2, param4);
                  cg.a(param5, 2, 8, param3, 36 + (param2 + 1), 2, -1);
                  cg.a(param5, 2, 1, param3 + 18, param2 + 72 - -1, 1, -2);
                  fb.field_c[param5][2].c(param3 - -18, param2 + 36, 18, 18);
                  fb.field_c[param5][2].c(param3 + 18, 54 + param2, 18, 18);
                  fb.field_c[param5][2].c(param3 + 36, 72 + param2, 18, 18);
                  fb.field_c[param5][2].c(36 + param3, var7 + (param2 + var8), 18, 18 - var8);
                  return;
                }
              } else {
                L1: {
                  var8 = vl.a(23841, 80, ve.field_ic[1 + param6 - 80] * 18 + 40);
                  if (var9 == 0) {
                    break L1;
                  } else {
                    var7 = var7 + vl.a(23841, 80, 40 + 18 * param0);
                    break L1;
                  }
                }
                cg.a(param5, 2, 6, param3, 1 + (72 + param2), 2, -2);
                cg.a(param5, 2, 12, param3, 1 + (param2 - -54), 2, param4);
                cg.a(param5, 2, 8, param3, 36 + (param2 + 1), 2, -1);
                cg.a(param5, 2, 1, param3 + 18, param2 + 72 - -1, 1, -2);
                fb.field_c[param5][2].c(param3 - -18, param2 + 36, 18, 18);
                fb.field_c[param5][2].c(param3 + 18, 54 + param2, 18, 18);
                fb.field_c[param5][2].c(param3 + 36, 72 + param2, 18, 18);
                fb.field_c[param5][2].c(36 + param3, var7 + (param2 + var8), 18, 18 - var8);
                return;
              }
            } else {
              cg.a(param5, 2, 6, param3, 1 + (72 + param2), 2, -2);
              cg.a(param5, 2, 12, param3, 1 + (param2 - -54), 2, param4);
              cg.a(param5, 2, 8, param3, 36 + (param2 + 1), 2, -1);
              cg.a(param5, 2, 1, param3 + 18, param2 + 72 - -1, 1, -2);
              fb.field_c[param5][2].c(param3 - -18, param2 + 36, 18, 18);
              fb.field_c[param5][2].c(param3 + 18, 54 + param2, 18, 18);
              fb.field_c[param5][2].c(param3 + 36, 72 + param2, 18, 18);
              fb.field_c[param5][2].c(36 + param3, var7 + (param2 + var8), 18, 18 - var8);
              return;
            }
          } else {
            if (93 <= param6) {
              hk.a(param3 - 3, param2 + 36 - 3, 60, 60, 4, 65280, 100);
              if (var9 == 0) {
                cg.a(param5, 2, 6, param3, 1 + (72 + param2), 2, -2);
                cg.a(param5, 2, 12, param3, 1 + (param2 - -54), 2, param4);
                cg.a(param5, 2, 8, param3, 36 + (param2 + 1), 2, -1);
                cg.a(param5, 2, 1, param3 + 18, param2 + 72 - -1, 1, -2);
                fb.field_c[param5][2].c(param3 - -18, param2 + 36, 18, 18);
                fb.field_c[param5][2].c(param3 + 18, 54 + param2, 18, 18);
                fb.field_c[param5][2].c(param3 + 36, 72 + param2, 18, 18);
                fb.field_c[param5][2].c(36 + param3, var7 + (param2 + var8), 18, 18 - var8);
                return;
              } else {
                var8 = vl.a(23841, 80, ve.field_ic[1 + param6 - 80] * 18 + 40);
                var7 = var7 + vl.a(23841, 80, 40 + 18 * param0);
                cg.a(param5, 2, 6, param3, 1 + (72 + param2), 2, -2);
                cg.a(param5, 2, 12, param3, 1 + (param2 - -54), 2, param4);
                cg.a(param5, 2, 8, param3, 36 + (param2 + 1), 2, -1);
                cg.a(param5, 2, 1, param3 + 18, param2 + 72 - -1, 1, -2);
                fb.field_c[param5][2].c(param3 - -18, param2 + 36, 18, 18);
                fb.field_c[param5][2].c(param3 + 18, 54 + param2, 18, 18);
                fb.field_c[param5][2].c(param3 + 36, 72 + param2, 18, 18);
                fb.field_c[param5][2].c(36 + param3, var7 + (param2 + var8), 18, 18 - var8);
                return;
              }
            } else {
              L2: {
                var8 = vl.a(23841, 80, ve.field_ic[1 + param6 - 80] * 18 + 40);
                if (var9 == 0) {
                  break L2;
                } else {
                  var7 = var7 + vl.a(23841, 80, 40 + 18 * param0);
                  break L2;
                }
              }
              cg.a(param5, 2, 6, param3, 1 + (72 + param2), 2, -2);
              cg.a(param5, 2, 12, param3, 1 + (param2 - -54), 2, param4);
              cg.a(param5, 2, 8, param3, 36 + (param2 + 1), 2, -1);
              cg.a(param5, 2, 1, param3 + 18, param2 + 72 - -1, 1, -2);
              fb.field_c[param5][2].c(param3 - -18, param2 + 36, 18, 18);
              fb.field_c[param5][2].c(param3 + 18, 54 + param2, 18, 18);
              fb.field_c[param5][2].c(param3 + 36, 72 + param2, 18, 18);
              fb.field_c[param5][2].c(36 + param3, var7 + (param2 + var8), 18, 18 - var8);
              return;
            }
          }
        } else {
          var7 = var7 + vl.a(23841, 80, 40 + 18 * param0);
          cg.a(param5, 2, 6, param3, 1 + (72 + param2), 2, -2);
          cg.a(param5, 2, 12, param3, 1 + (param2 - -54), 2, param4);
          cg.a(param5, 2, 8, param3, 36 + (param2 + 1), 2, -1);
          cg.a(param5, 2, 1, param3 + 18, param2 + 72 - -1, 1, -2);
          fb.field_c[param5][2].c(param3 - -18, param2 + 36, 18, 18);
          fb.field_c[param5][2].c(param3 + 18, 54 + param2, 18, 18);
          fb.field_c[param5][2].c(param3 + 36, 72 + param2, 18, 18);
          fb.field_c[param5][2].c(36 + param3, var7 + (param2 + var8), 18, 18 - var8);
          return;
        }
    }

    static {
        field_b = "Invalid password.";
        field_f = "You can join this game";
        field_e = "Send private Quick Chat to <%0>";
    }
}
