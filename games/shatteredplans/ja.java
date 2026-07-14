/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja extends da implements od, g {
    ji field_m;
    static String field_j;
    static String field_l;
    static String field_n;
    static String field_k;
    static int[] field_i;

    public final void a(go param0, int param1) {
        if (param1 != 95) {
            boolean discarded$0 = ((ja) this).a(25);
        }
        ((ja) this).b(param1 + -158);
    }

    public static void d(byte param0) {
        field_i = null;
        if (param0 <= 123) {
            ja.d((byte) 15);
        }
        field_l = null;
        field_n = null;
        field_k = null;
        field_j = null;
    }

    final static void a(int param0, int param1, bi param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        float var12 = 0.0f;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        L0: {
          var16 = ShatteredPlansClient.field_F ? 1 : 0;
          var4 = -1;
          var5 = param2.field_z;
          var6 = param1;
          if (-param1 + var5 <= var6) {
            break L0;
          } else {
            var6 = -param1 + var5;
            break L0;
          }
        }
        var7 = param2.field_w;
        if (param0 == -174137048) {
          L1: {
            var8 = param3;
            if (var8 >= -param3 + var7) {
              break L1;
            } else {
              var8 = var7 - param3;
              break L1;
            }
          }
          var9 = 0;
          L2: while (true) {
            if (var9 >= var7) {
              return;
            } else {
              var10 = 0;
              L3: while (true) {
                if (var5 <= var10) {
                  var9++;
                  continue L2;
                } else {
                  var4++;
                  var11 = param2.field_B[var4];
                  if (var11 != 0) {
                    var12 = (float)((-param1 + var10) * (var10 - param1) + (-param3 + var9) * (-param3 + var9));
                    var12 = var12 / (float)(var8 * var8 + var6 * var6);
                    var13 = (int)(256.0f * (-(float)Math.sqrt((double)var12) + 1.0f));
                    if (var13 <= 0) {
                      param2.field_B[var4] = 1;
                      var10++;
                      continue L3;
                    } else {
                      if ((var13 ^ -1) >= -256) {
                        L4: {
                          var14 = var11 & 16711935;
                          var14 = var14 * var13;
                          var15 = 65280 & var11;
                          var15 = var15 * var13;
                          var11 = (16711680 & var15 | -16711936 & var14) >>> -174137048;
                          stackOut_17_0 = param2.field_B;
                          stackOut_17_1 = var4;
                          stackIn_19_0 = stackOut_17_0;
                          stackIn_19_1 = stackOut_17_1;
                          stackIn_18_0 = stackOut_17_0;
                          stackIn_18_1 = stackOut_17_1;
                          if (var11 == 0) {
                            stackOut_19_0 = (int[]) (Object) stackIn_19_0;
                            stackOut_19_1 = stackIn_19_1;
                            stackOut_19_2 = 1;
                            stackIn_20_0 = stackOut_19_0;
                            stackIn_20_1 = stackOut_19_1;
                            stackIn_20_2 = stackOut_19_2;
                            break L4;
                          } else {
                            stackOut_18_0 = (int[]) (Object) stackIn_18_0;
                            stackOut_18_1 = stackIn_18_1;
                            stackOut_18_2 = var11;
                            stackIn_20_0 = stackOut_18_0;
                            stackIn_20_1 = stackOut_18_1;
                            stackIn_20_2 = stackOut_18_2;
                            break L4;
                          }
                        }
                        stackIn_20_0[stackIn_20_1] = stackIn_20_2;
                        var10++;
                        continue L3;
                      } else {
                        var10++;
                        continue L3;
                      }
                    }
                  } else {
                    var10++;
                    continue L3;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final String c(byte param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        String stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_5_0 = null;
        Object stackOut_8_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var2_int = ((ja) this).field_m.d(false);
                        var3 = ((ja) this).field_m.f((byte) 119);
                        if (param0 >= 61) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        var6 = null;
                        ((ja) this).a((go) null, 80);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var4 = ((ja) this).field_m.l(115);
                        var5 = vn.e(-13299);
                        if (1890 > var4) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var4 <= -3 + var5) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = re.a(um.field_b, 4371, new String[2]);
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0;
                }
                case 7: {
                    try {
                        if (!tg.a(var2_int, var3, (byte) -126, var4)) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = null;
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return (String) (Object) stackIn_9_0;
                }
                case 10: {
                    var2 = (NumberFormatException) (Object) caughtException;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    return ri.field_M;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public ja() {
    }

    final u a(boolean param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        u stackIn_3_0 = null;
        u stackIn_7_0 = null;
        u stackIn_10_0 = null;
        Throwable decompiledCaughtException = null;
        u stackOut_2_0 = null;
        u stackOut_6_0 = null;
        u stackOut_9_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var2_int = ((ja) this).field_m.d(param0);
                        var3 = ((ja) this).field_m.f((byte) 108);
                        var4 = ((ja) this).field_m.l(66);
                        var5 = vn.e(-13299);
                        if (1890 > var4) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = tj.field_b;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        if (-3 + var5 < var4) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = tj.field_b;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0;
                }
                case 8: {
                    try {
                        if (tg.a(var2_int, var3, (byte) -127, var4)) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = tj.field_b;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return stackIn_10_0;
                }
                case 11: {
                    var2 = (NumberFormatException) (Object) caughtException;
                    return tj.field_b;
                }
                case 12: {
                    return p.field_g;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void a(int param0, go param1) {
        if (param0 != 4340) {
            field_l = null;
        }
    }

    public final boolean a(int param0) {
        if (param0 != 16647) {
            return true;
        }
        return ((ja) this).field_m.k(-107);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_n = "Fleets";
        field_l = "<%0> has been removed.";
    }
}
