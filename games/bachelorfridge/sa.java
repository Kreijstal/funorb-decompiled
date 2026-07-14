/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends pu {
    static String field_l;

    final static ma a(boolean param0, pf param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        ma var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        ma stackIn_40_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        ma stackOut_39_0 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = param1.d(8, (byte) -80);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var2_int <= 0) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        throw new IllegalStateException("" + var2_int);
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3 = fa.a((byte) -75, param1) ? 1 : 0;
                        var4 = fa.a((byte) -75, param1) ? 1 : 0;
                        var5 = new ma();
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (!param0) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ma discarded$2 = sa.a(true, (pf) null);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5.field_g = (short)param1.d(16, (byte) 121);
                        var5.field_x = as.a(var5.field_x, 127, param1, 16);
                        var5.field_O = as.a(var5.field_O, 99, param1, 16);
                        var5.field_r = as.a(var5.field_r, 102, param1, 16);
                        var5.field_K = (short)param1.d(16, (byte) -64);
                        var5.field_C = as.a(var5.field_C, 82, param1, 16);
                        var5.field_h = as.a(var5.field_h, 123, param1, 16);
                        var5.field_t = as.a(var5.field_t, 88, param1, 16);
                        if (var3 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5.field_i = (short)param1.d(16, (byte) 51);
                        var5.field_f = as.a(var5.field_f, 122, param1, 16);
                        var5.field_N = as.a(var5.field_N, 75, param1, 16);
                        var5.field_b = as.a(var5.field_b, 93, param1, 16);
                        var5.field_F = as.a(var5.field_F, 96, param1, 16);
                        var5.field_c = as.a(var5.field_c, 60, param1, 16);
                        var5.field_e = as.a(var5.field_e, 83, param1, 16);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var4 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        int discarded$3 = param1.d(16, (byte) -85);
                        var5.field_y = as.a(var5.field_y, 90, param1, 16);
                        var5.field_m = as.a(var5.field_m, 59, param1, 16);
                        var5.field_l = as.a(var5.field_l, 97, param1, 16);
                        var5.field_H = as.a(var5.field_H, 96, param1, 16);
                        var5.field_v = as.a(var5.field_v, 75, param1, 16);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (!fa.a((byte) -75, param1)) {
                            statePc = 22;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var5.field_w = as.a(var5.field_w, 81, param1, 16);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (!fa.a((byte) -75, param1)) {
                            statePc = 39;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var5.field_d = hd.a(var5.field_d, param1, (byte) 103, 16);
                        var6 = 0;
                        var7 = 0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if ((var7 ^ -1) <= (var5.field_d.length ^ -1)) {
                            statePc = 31;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = var6;
                        stackOut_25_1 = var5.field_d[var7] & 255;
                        stackIn_32_0 = stackOut_25_0;
                        stackIn_32_1 = stackOut_25_1;
                        stackIn_26_0 = stackOut_25_0;
                        stackIn_26_1 = stackOut_25_1;
                        if (var8 != 0) {
                            statePc = 32;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (stackIn_26_0 >= stackIn_26_1) {
                            statePc = 30;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var6 = var5.field_d[var7] & 255;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var7++;
                        if (var8 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackOut_31_0 = -1;
                        stackOut_31_1 = var6 ^ -1;
                        stackIn_32_0 = stackOut_31_0;
                        stackIn_32_1 = stackOut_31_1;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (stackIn_32_0 != stackIn_32_1) {
                            statePc = 36;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var5.field_d = null;
                        if (var8 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var5.field_n = (byte)(1 + var6);
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackOut_39_0 = (ma) var5;
                        stackIn_40_0 = stackOut_39_0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 40: {
                    return (ma) (Object) stackIn_40_0;
                }
                case 41: {
                    var2 = (RuntimeException) (Object) caughtException;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    try {
                        stackOut_42_0 = (RuntimeException) var2;
                        stackOut_42_1 = new StringBuilder().append("sa.A(").append(param0).append(44);
                        stackIn_45_0 = stackOut_42_0;
                        stackIn_45_1 = stackOut_42_1;
                        stackIn_43_0 = stackOut_42_0;
                        stackIn_43_1 = stackOut_42_1;
                        if (param1 == null) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
                        stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
                        stackOut_43_2 = "{...}";
                        stackIn_46_0 = stackOut_43_0;
                        stackIn_46_1 = stackOut_43_1;
                        stackIn_46_2 = stackOut_43_2;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 44: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 45: {
                    stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
                    stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
                    stackOut_45_2 = "null";
                    stackIn_46_0 = stackOut_45_0;
                    stackIn_46_1 = stackOut_45_1;
                    stackIn_46_2 = stackOut_45_2;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    throw pe.a((Throwable) (Object) stackIn_46_0, (String) (Object) (stackIn_46_2 + 41));
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(int param0) {
        try {
            field_l = null;
            if (param0 != 0) {
                ma discarded$0 = sa.a(true, (pf) null);
            }
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "sa.C(" + param0 + 41);
        }
    }

    final static void c(int param0) {
        try {
            ud.a(nia.d(-31768), (byte) 95);
            if (param0 >= -82) {
                sa.b(116);
            }
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "sa.D(" + param0 + 41);
        }
    }

    final static void d(int param0) {
        pf var1 = null;
        int var2 = 0;
        ema var3_ref_ema = null;
        int var3 = 0;
        long var3_long = 0L;
        uha var3_ref_uha = null;
        uha var4 = null;
        int var4_int = 0;
        uha var4_ref = null;
        String var5 = null;
        int var5_int = 0;
        uha var5_ref = null;
        String var6 = null;
        String var7 = null;
        ema var8_ref = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_16_0 = 0;
        ema stackIn_23_0 = null;
        ema stackIn_24_0 = null;
        ema stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        String stackIn_139_0 = null;
        String stackIn_140_0 = null;
        String stackIn_141_0 = null;
        int stackIn_141_1 = 0;
        boolean stackIn_172_0 = false;
        boolean stackIn_173_0 = false;
        int stackIn_183_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        ema stackOut_22_0 = null;
        ema stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        ema stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        String stackOut_138_0 = null;
        String stackOut_140_0 = null;
        int stackOut_140_1 = 0;
        String stackOut_139_0 = null;
        int stackOut_139_1 = 0;
        boolean stackOut_171_0 = false;
        boolean stackOut_172_0 = false;
        int stackOut_182_0 = 0;
        L0: {
          var11 = BachelorFridge.field_y;
          var1 = ig.field_m;
          if (param0 == -7) {
            break L0;
          } else {
            sa.c(41);
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              var2 = ((lu) (Object) var1).b(16711935);
              if ((var2 ^ -1) == -1) {
                break L3;
              } else {
                if ((var2 ^ -1) == -2) {
                  break L3;
                } else {
                  if (2 == var2) {
                    break L3;
                  } else {
                    if ((var2 ^ -1) == -4) {
                      break L3;
                    } else {
                      if ((var2 ^ -1) == -5) {
                        break L3;
                      } else {
                        L4: {
                          if (-6 != (var2 ^ -1)) {
                            break L4;
                          } else {
                            L5: {
                              var3_long = ((lu) (Object) var1).c(-124);
                              var5 = ((lu) (Object) var1).g(113);
                              var6 = ((lu) (Object) var1).g(65);
                              var7 = ((lu) (Object) var1).g(-70);
                              var8_ref = gf.a(var3_long, false);
                              if (var6.equals((Object) (Object) "")) {
                                stackOut_15_0 = 0;
                                stackIn_16_0 = stackOut_15_0;
                                break L5;
                              } else {
                                stackOut_14_0 = 1;
                                stackIn_16_0 = stackOut_14_0;
                                break L5;
                              }
                            }
                            L6: {
                              L7: {
                                var9 = stackIn_16_0;
                                if (null == var8_ref) {
                                  break L7;
                                } else {
                                  if (var9 != 0) {
                                    var8_ref.a(var5, param0 + 7, var7);
                                    if (var11 == 0) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              var8_ref = new ema(var5, var7, var3_long);
                              iga.field_c.a((eo) (Object) var8_ref, param0 + 98, var3_long);
                              break L6;
                            }
                            L8: {
                              var8_ref.field_Cb = f.b((byte) 73) - (long)((lu) (Object) var1).f(-59);
                              var8_ref.field_Jb = ((lu) (Object) var1).e((byte) 68);
                              var10 = ((lu) (Object) var1).d(-1);
                              stackOut_22_0 = (ema) var8_ref;
                              stackIn_24_0 = stackOut_22_0;
                              stackIn_23_0 = stackOut_22_0;
                              if (-1 == (var10 & 1 ^ -1)) {
                                stackOut_24_0 = (ema) (Object) stackIn_24_0;
                                stackOut_24_1 = 0;
                                stackIn_25_0 = stackOut_24_0;
                                stackIn_25_1 = stackOut_24_1;
                                break L8;
                              } else {
                                stackOut_23_0 = (ema) (Object) stackIn_23_0;
                                stackOut_23_1 = 1;
                                stackIn_25_0 = stackOut_23_0;
                                stackIn_25_1 = stackOut_23_1;
                                break L8;
                              }
                            }
                            ((ema) (Object) stackIn_25_0).field_zb = stackIn_25_1 != 0;
                            var8_ref.field_Gb = var10 >> -1784389311;
                            var8_ref.field_Kb = ((lu) (Object) var1).b(param0 ^ -16711930);
                            var8_ref.field_xb = ((lu) (Object) var1).b(16711935);
                            gj.a((byte) 101, var8_ref);
                            if (var11 == 0) {
                              break L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L9: {
                          if ((var2 ^ -1) != -7) {
                            break L9;
                          } else {
                            L10: {
                              var3_long = ((lu) (Object) var1).c(param0 ^ 106);
                              var5_int = ((lu) (Object) var1).b(param0 ^ -16711930);
                              var6 = (String) (Object) gf.a(var3_long, false);
                              if (null != var6) {
                                L11: {
                                  if (!((ema) (Object) var6).field_Ob) {
                                    break L11;
                                  } else {
                                    ((ema) (Object) var6).field_Ob = false;
                                    hc.field_J = hc.field_J - 1;
                                    break L11;
                                  }
                                }
                                L12: {
                                  L13: {
                                    if ((var5_int ^ -1) == -1) {
                                      break L13;
                                    } else {
                                      ((ema) (Object) var6).field_Mb = kla.field_x;
                                      ((ema) (Object) var6).field_yb = var5_int;
                                      if (var11 == 0) {
                                        break L12;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  ((ema) (Object) var6).a(false);
                                  break L12;
                                }
                                ((ema) (Object) var6).b(param0 ^ -7);
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            if (var11 == 0) {
                              break L2;
                            } else {
                              break L9;
                            }
                          }
                        }
                        L14: {
                          if ((var2 ^ -1) == -8) {
                            break L14;
                          } else {
                            L15: {
                              if (var2 != 8) {
                                break L15;
                              } else {
                                L16: {
                                  var3 = ((lu) (Object) var1).e((byte) 97);
                                  var4 = (uha) (Object) ola.field_g.a((long)var3, (byte) -87);
                                  if (null == var4) {
                                    var4_ref = new uha(ld.field_q);
                                    ola.field_g.a((eo) (Object) var4_ref, 91, (long)var3);
                                    break L16;
                                  } else {
                                    break L16;
                                  }
                                }
                                cja.a(var4_ref, (lu) (Object) var1, 80, true);
                                h.a(var4_ref, 0);
                                if (var11 == 0) {
                                  break L2;
                                } else {
                                  break L15;
                                }
                              }
                            }
                            L17: {
                              if (-10 != (var2 ^ -1)) {
                                break L17;
                              } else {
                                L18: {
                                  var3 = ((lu) (Object) var1).e((byte) 54);
                                  var4_int = ((lu) (Object) var1).b(16711935);
                                  var5_ref = (uha) (Object) ola.field_g.a((long)var3, (byte) -87);
                                  if (null == var5_ref) {
                                    break L18;
                                  } else {
                                    L19: {
                                      L20: {
                                        if ((var4_int ^ -1) != -1) {
                                          break L20;
                                        } else {
                                          var5_ref.a(false);
                                          if (var11 == 0) {
                                            break L19;
                                          } else {
                                            break L20;
                                          }
                                        }
                                      }
                                      var5_ref.field_Mb = kla.field_x;
                                      var5_ref.field_ec = var4_int;
                                      break L19;
                                    }
                                    var5_ref.b(0);
                                    break L18;
                                  }
                                }
                                if (var11 == 0) {
                                  break L2;
                                } else {
                                  break L17;
                                }
                              }
                            }
                            L21: {
                              if (-11 != (var2 ^ -1)) {
                                break L21;
                              } else {
                                var3_ref_uha = (uha) (Object) uma.field_M.b((byte) 90);
                                L22: while (true) {
                                  L23: {
                                    if (null == var3_ref_uha) {
                                      break L23;
                                    } else {
                                      var3_ref_uha.a(false);
                                      var3_ref_uha.b(0);
                                      var3_ref_uha = (uha) (Object) uma.field_M.c(0);
                                      if (var11 != 0) {
                                        break L2;
                                      } else {
                                        if (var11 == 0) {
                                          continue L22;
                                        } else {
                                          break L23;
                                        }
                                      }
                                    }
                                  }
                                  if (var11 == 0) {
                                    break L2;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                            }
                            L24: {
                              if (var2 == 11) {
                                break L24;
                              } else {
                                if ((var2 ^ -1) == -13) {
                                  break L24;
                                } else {
                                  L25: {
                                    if (var2 == 13) {
                                      break L25;
                                    } else {
                                      L26: {
                                        L27: {
                                          if ((var2 ^ -1) == -15) {
                                            break L27;
                                          } else {
                                            if (-17 != (var2 ^ -1)) {
                                              break L26;
                                            } else {
                                              break L27;
                                            }
                                          }
                                        }
                                        L28: {
                                          var3_long = ((lu) (Object) var1).c(param0 + -95);
                                          var5 = (String) (Object) gf.a(var3_long, false);
                                          if (null == var5) {
                                            break L28;
                                          } else {
                                            L29: {
                                              L30: {
                                                if ((var2 ^ -1) != -15) {
                                                  break L30;
                                                } else {
                                                  ((ema) (Object) var5).field_wb = true;
                                                  if (var11 == 0) {
                                                    break L29;
                                                  } else {
                                                    break L30;
                                                  }
                                                }
                                              }
                                              if (!((ema) (Object) var5).field_Ob) {
                                                ((ema) (Object) var5).field_Ob = true;
                                                hc.field_J = hc.field_J + 1;
                                                break L29;
                                              } else {
                                                break L29;
                                              }
                                            }
                                            gj.a((byte) 56, (ema) (Object) var5);
                                            break L28;
                                          }
                                        }
                                        if (var11 == 0) {
                                          break L2;
                                        } else {
                                          break L26;
                                        }
                                      }
                                      L31: {
                                        L32: {
                                          if (var2 == 15) {
                                            break L32;
                                          } else {
                                            if (-18 != (var2 ^ -1)) {
                                              break L31;
                                            } else {
                                              break L32;
                                            }
                                          }
                                        }
                                        L33: {
                                          var3_long = ((lu) (Object) var1).c(param0 + -103);
                                          var5_int = ((lu) (Object) var1).b(16711935);
                                          var6 = (String) (Object) gf.a(var3_long, false);
                                          if (var6 == null) {
                                            break L33;
                                          } else {
                                            L34: {
                                              L35: {
                                                if (15 == var2) {
                                                  break L35;
                                                } else {
                                                  if (((ema) (Object) var6).field_Ob) {
                                                    hc.field_J = hc.field_J - 1;
                                                    ((ema) (Object) var6).field_Ob = false;
                                                    if (var11 == 0) {
                                                      break L34;
                                                    } else {
                                                      break L35;
                                                    }
                                                  } else {
                                                    break L34;
                                                  }
                                                }
                                              }
                                              ((ema) (Object) var6).field_wb = false;
                                              break L34;
                                            }
                                            L36: {
                                              if (0 != var5_int) {
                                                ((ema) (Object) var6).field_Mb = kla.field_x;
                                                ((ema) (Object) var6).field_yb = var5_int;
                                                break L36;
                                              } else {
                                                break L36;
                                              }
                                            }
                                            gj.a((byte) 63, (ema) (Object) var6);
                                            break L33;
                                          }
                                        }
                                        if (var11 == 0) {
                                          break L2;
                                        } else {
                                          break L31;
                                        }
                                      }
                                      L37: {
                                        if ((var2 ^ -1) == -19) {
                                          break L37;
                                        } else {
                                          L38: {
                                            if (19 == var2) {
                                              break L38;
                                            } else {
                                              L39: {
                                                if ((var2 ^ -1) != -21) {
                                                  break L39;
                                                } else {
                                                  cja.a(pw.field_w, (lu) (Object) var1, 125, false);
                                                  if (var11 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L39;
                                                  }
                                                }
                                              }
                                              L40: {
                                                if ((var2 ^ -1) != -22) {
                                                  break L40;
                                                } else {
                                                  L41: {
                                                    L42: {
                                                      var3 = ((lu) (Object) var1).e((byte) 51);
                                                      if (-1 != (var3 ^ -1)) {
                                                        break L42;
                                                      } else {
                                                        wda.field_a = 0L;
                                                        if (var11 == 0) {
                                                          break L41;
                                                        } else {
                                                          break L42;
                                                        }
                                                      }
                                                    }
                                                    wda.field_a = (long)var3 + f.b((byte) 73);
                                                    break L41;
                                                  }
                                                  if (var11 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L40;
                                                  }
                                                }
                                              }
                                              L43: {
                                                if ((var2 ^ -1) != -23) {
                                                  break L43;
                                                } else {
                                                  wk.field_a = ((lu) (Object) var1).e((byte) 48);
                                                  ui.field_q = ((lu) (Object) var1).d(-1);
                                                  if (var11 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L43;
                                                  }
                                                }
                                              }
                                              L44: {
                                                if ((var2 ^ -1) != -24) {
                                                  break L44;
                                                } else {
                                                  ge.field_F = ((lu) (Object) var1).c(param0 ^ 108);
                                                  if (var11 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L44;
                                                  }
                                                }
                                              }
                                              cv.a(1, "L1: " + nia.d((byte) -106), (Throwable) null);
                                              vc.a((byte) -78);
                                              if (var11 == 0) {
                                                break L2;
                                              } else {
                                                break L38;
                                              }
                                            }
                                          }
                                          L45: {
                                            var3_long = ((lu) (Object) var1).c(-111);
                                            var5_int = ((lu) (Object) var1).b(16711935);
                                            var6 = (String) (Object) uka.a(var3_long, param0 ^ -28786);
                                            if (null == var6) {
                                              break L45;
                                            } else {
                                              L46: {
                                                L47: {
                                                  if (-1 != (var5_int ^ -1)) {
                                                    break L47;
                                                  } else {
                                                    ((ema) (Object) var6).a(false);
                                                    if (var11 == 0) {
                                                      break L46;
                                                    } else {
                                                      break L47;
                                                    }
                                                  }
                                                }
                                                ((ema) (Object) var6).field_yb = var5_int;
                                                ((ema) (Object) var6).field_Mb = kla.field_x;
                                                break L46;
                                              }
                                              ((ema) (Object) var6).b(0);
                                              pw.field_w.field_Rb = pw.field_w.field_Rb - 1;
                                              break L45;
                                            }
                                          }
                                          if (var11 == 0) {
                                            break L2;
                                          } else {
                                            break L37;
                                          }
                                        }
                                      }
                                      L48: {
                                        var3_long = ((lu) (Object) var1).c(param0 + -112);
                                        var5 = ((lu) (Object) var1).g(param0 ^ -55);
                                        var6 = ((lu) (Object) var1).g(param0 + -26);
                                        var7 = (String) (Object) uka.a(var3_long, 28791);
                                        if (null == var7) {
                                          var7 = (String) (Object) new ema(var5, var6, var3_long);
                                          wi.field_i.a((eo) (Object) var7, param0 + 98, var3_long);
                                          pw.field_w.field_Rb = pw.field_w.field_Rb + 1;
                                          break L48;
                                        } else {
                                          break L48;
                                        }
                                      }
                                      L49: {
                                        ((ema) (Object) var7).field_Jb = ((lu) (Object) var1).e((byte) 106);
                                        var8 = ((lu) (Object) var1).d(param0 + 6);
                                        ((ema) (Object) var7).field_Gb = var8 >> 452760097;
                                        stackOut_138_0 = (String) var7;
                                        stackIn_140_0 = stackOut_138_0;
                                        stackIn_139_0 = stackOut_138_0;
                                        if (0 == (var8 & 1)) {
                                          stackOut_140_0 = (String) (Object) stackIn_140_0;
                                          stackOut_140_1 = 0;
                                          stackIn_141_0 = stackOut_140_0;
                                          stackIn_141_1 = stackOut_140_1;
                                          break L49;
                                        } else {
                                          stackOut_139_0 = (String) (Object) stackIn_139_0;
                                          stackOut_139_1 = 1;
                                          stackIn_141_0 = stackOut_139_0;
                                          stackIn_141_1 = stackOut_139_1;
                                          break L49;
                                        }
                                      }
                                      ((ema) (Object) stackIn_141_0).field_zb = stackIn_141_1 != 0;
                                      ((ema) (Object) var7).field_Kb = ((lu) (Object) var1).b(16711935);
                                      ((ema) (Object) var7).field_xb = ((lu) (Object) var1).b(param0 + 16711942);
                                      bia.field_g.a((bw) (Object) var7, true);
                                      if (var11 == 0) {
                                        break L2;
                                      } else {
                                        break L25;
                                      }
                                    }
                                  }
                                  L50: {
                                    var3 = ((lu) (Object) var1).e((byte) 100);
                                    var4_int = ((lu) (Object) var1).b(16711935);
                                    var5_ref = (uha) (Object) ola.field_g.a((long)var3, (byte) -87);
                                    if (var5_ref != null) {
                                      L51: {
                                        var5_ref.field_gc = false;
                                        var6 = (String) (Object) var5_ref;
                                        ((uha) (Object) var6).field_Wb = false;
                                        if (var4_int != 0) {
                                          var5_ref.field_Mb = kla.field_x;
                                          var5_ref.field_ec = var4_int;
                                          break L51;
                                        } else {
                                          break L51;
                                        }
                                      }
                                      h.a(var5_ref, 0);
                                      break L50;
                                    } else {
                                      break L50;
                                    }
                                  }
                                  if (var11 == 0) {
                                    break L2;
                                  } else {
                                    break L24;
                                  }
                                }
                              }
                            }
                            L52: {
                              var3 = ((lu) (Object) var1).e((byte) 72);
                              var4 = (uha) (Object) ola.field_g.a((long)var3, (byte) -87);
                              if (var4 != null) {
                                L53: {
                                  L54: {
                                    if (11 != var2) {
                                      break L54;
                                    } else {
                                      var4.field_Wb = true;
                                      if (var11 == 0) {
                                        break L53;
                                      } else {
                                        break L54;
                                      }
                                    }
                                  }
                                  var4.field_gc = true;
                                  break L53;
                                }
                                h.a(var4, 0);
                                break L52;
                              } else {
                                break L52;
                              }
                            }
                            if (var11 == 0) {
                              break L2;
                            } else {
                              break L14;
                            }
                          }
                        }
                        var3_ref_ema = (ema) (Object) aa.field_l.b((byte) 90);
                        L55: while (true) {
                          L56: {
                            L57: {
                              if (var3_ref_ema == null) {
                                break L57;
                              } else {
                                var3_ref_ema.a(false);
                                var3_ref_ema.b(0);
                                var3_ref_ema = (ema) (Object) aa.field_l.c(param0 + 7);
                                if (var11 != 0) {
                                  break L56;
                                } else {
                                  if (var11 == 0) {
                                    continue L55;
                                  } else {
                                    break L57;
                                  }
                                }
                              }
                            }
                            hc.field_J = 0;
                            break L56;
                          }
                          if (var11 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            var3_ref_ema = (ema) (Object) bia.field_g.b((byte) 90);
            L58: while (true) {
              L59: {
                L60: {
                  if (var3_ref_ema == null) {
                    break L60;
                  } else {
                    var3_ref_ema.a(false);
                    var3_ref_ema.b(0);
                    var3_ref_ema = (ema) (Object) bia.field_g.c(0);
                    if (var11 != 0) {
                      break L59;
                    } else {
                      if (var11 == 0) {
                        continue L58;
                      } else {
                        break L60;
                      }
                    }
                  }
                }
                var3_ref_ema = (ema) (Object) iga.field_c.b((byte) -73);
                break L59;
              }
              L61: while (true) {
                L62: {
                  L63: {
                    if (var3_ref_ema == null) {
                      break L63;
                    } else {
                      stackOut_171_0 = var3_ref_ema.field_wb;
                      stackIn_183_0 = stackOut_171_0 ? 1 : 0;
                      stackIn_172_0 = stackOut_171_0;
                      if (var11 != 0) {
                        break L62;
                      } else {
                        stackOut_172_0 = stackIn_172_0;
                        stackIn_173_0 = stackOut_172_0;
                        L64: {
                          L65: {
                            if (stackIn_173_0) {
                              break L65;
                            } else {
                              if (!var3_ref_ema.field_Ob) {
                                break L64;
                              } else {
                                break L65;
                              }
                            }
                          }
                          L66: {
                            if (!var3_ref_ema.field_Ob) {
                              break L66;
                            } else {
                              var3_ref_ema.field_Ob = false;
                              hc.field_J = hc.field_J - 1;
                              break L66;
                            }
                          }
                          var3_ref_ema.field_wb = false;
                          gj.a((byte) 38, var3_ref_ema);
                          break L64;
                        }
                        var3_ref_ema = (ema) (Object) iga.field_c.a(param0 + -25170);
                        if (var11 == 0) {
                          continue L61;
                        } else {
                          break L63;
                        }
                      }
                    }
                  }
                  stackOut_182_0 = var2 ^ -1;
                  stackIn_183_0 = stackOut_182_0;
                  break L62;
                }
                L67: {
                  if (stackIn_183_0 != -2) {
                    break L67;
                  } else {
                    if (null == pw.field_w) {
                      break L67;
                    } else {
                      ur.field_b = pw.field_w.field_Jb;
                      break L67;
                    }
                  }
                }
                L68: {
                  L69: {
                    if ((var2 ^ -1) == -5) {
                      break L69;
                    } else {
                      pw.field_w = null;
                      if (var11 == 0) {
                        break L68;
                      } else {
                        break L69;
                      }
                    }
                  }
                  var3 = ((lu) (Object) var1).e((byte) 45);
                  pw.field_w = new uha(ld.field_q);
                  pw.field_w.a(true, (long)var3);
                  cja.a(pw.field_w, (lu) (Object) var1, 54, false);
                  wda.field_a = 0L;
                  break L68;
                }
                L70: {
                  L71: {
                    L72: {
                      if (-3 == (var2 ^ -1)) {
                        break L72;
                      } else {
                        if ((var2 ^ -1) != -4) {
                          break L71;
                        } else {
                          break L72;
                        }
                      }
                    }
                    if (null != rv.field_n) {
                      break L70;
                    } else {
                      rv.field_n = new uha(ld.field_q);
                      if (var11 == 0) {
                        break L70;
                      } else {
                        break L71;
                      }
                    }
                  }
                  rv.field_n = null;
                  break L70;
                }
                L73: {
                  if (-4 == (var2 ^ -1)) {
                    break L73;
                  } else {
                    ce.field_y = false;
                    if (var11 == 0) {
                      break L2;
                    } else {
                      break L73;
                    }
                  }
                }
                ce.field_y = true;
                var3 = 0;
                L74: while (true) {
                  L75: {
                    L76: {
                      if ((fia.field_r.length ^ -1) >= (var3 ^ -1)) {
                        break L76;
                      } else {
                        fia.field_r[var3] = ((lu) (Object) var1).b(true);
                        var3++;
                        if (var11 != 0) {
                          break L75;
                        } else {
                          if (var11 == 0) {
                            continue L74;
                          } else {
                            break L76;
                          }
                        }
                      }
                    }
                    tq.field_h = ((lu) (Object) var1).b(16711935);
                    ena.field_n = ((lu) (Object) var1).b(16711935);
                    break L75;
                  }
                  var3 = 0;
                  L77: while (true) {
                    if ((var3 ^ -1) <= (sca.field_c.length ^ -1)) {
                      break L2;
                    } else {
                      sca.field_c[var3] = ((lu) (Object) var1).b(true);
                      var3++;
                      if (var11 != 0) {
                        break L1;
                      } else {
                        if (var11 == 0) {
                          continue L77;
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
          break L1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "This entry doesn't match";
    }
}
