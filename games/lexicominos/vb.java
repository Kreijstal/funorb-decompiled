/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb extends kd {
    int field_h;
    int field_o;
    int field_q;
    static ja field_r;
    int field_n;
    static ng field_m;
    int field_p;
    static aj field_l;
    int field_j;
    static int field_i;
    static String field_k;

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, int[] param6, int param7, int param8, int param9) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param5 == -95) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_m = (ng) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        param2--;
                        if (0 > param2) {
                            statePc = 13;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var17 = param6;
                        var10 = var17;
                        var11 = param8;
                        var12 = param4;
                        var13 = param1;
                        var14 = param9;
                        var15 = (16711422 & var17[var11]) >> 2087352065;
                        var10[var11] = vg.a(var13 >> -1801119671, 65280) + vg.a(var12 >> -1304186335, 16711680) + (vg.a(var14, 33440375) >> 422246321) + var15;
                        param9 = param9 + param3;
                        param4 = param4 + param0;
                        param1 = param1 + param7;
                        param8++;
                        if (var16 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        return;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var16 == 0) {
                            statePc = 3;
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
                        return;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    var10_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_11_0 = (RuntimeException) (var10_ref);
                    stackIn_10_0 = stackIn_11_0;
                    stackIn_11_1 = new StringBuilder().append("vb.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
                    stackIn_10_1 = stackIn_11_1;
                    if (param6 == null) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_12_0 = (RuntimeException) ((Object) stackIn_10_0);
                    stackIn_12_1 = (StringBuilder) ((Object) stackIn_10_1);
                    stackIn_12_2 = "{...}";
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                    stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                    stackIn_12_2 = "null";
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    throw ld.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        field_k = null;
        field_l = null;
        if (param0 < 66) {
            return;
        }
        field_m = null;
        field_r = null;
    }

    final static boolean a(byte param0, char param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        char[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (!Character.isISOControl(param1)) {
              if (jd.a((byte) -16, param1)) {
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var9 = hb.field_a;
                var8 = var9;
                var7 = var8;
                var2 = var7;
                var3 = 97 % ((28 - param0) / 61);
                var4 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      L4: {
                        L5: {
                          if (var4 >= var9.length) {
                            break L5;
                          } else {
                            var5 = var9[var4];
                            var11 = var5 ^ -1;
                            var10 = param1 ^ -1;
                            if (var6 != 0) {
                              if (var10 >= var11) {
                                break L3;
                              } else {
                                L6: while (true) {
                                  var4 = var2[var3];
                                  stackIn_25_0 = var4 ^ -1;

                                  if (var6 != 0) {
                                    break L2;
                                  } else {
                                    if (stackIn_25_0 != (param1 ^ -1)) {
                                      var3++;
                                      if (var6 == 0) {
                                        if (var3 >= var2.length) {
                                          break L3;
                                        } else {
                                          continue L6;
                                        }
                                      } else {
                                        break L3;
                                      }
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              }
                            } else {
                              if (var10 != var11) {
                                var4++;
                                if (var6 == 0) {
                                  continue L1;
                                } else {
                                  break L5;
                                }
                              } else {
                                return true;
                              }
                            }
                          }
                        }
                        var2 = n.field_l;
                        var3 = 0;
                        L7: while (true) {
                          if (var3 >= var2.length) {
                            break L3;
                          } else {
                            var4 = var2[var3];
                            stackIn_25_0 = var4 ^ -1;

                            if (var6 != 0) {
                              break L2;
                            } else {
                              if (stackIn_25_0 != (param1 ^ -1)) {
                                var3++;
                                if (var6 == 0) {
                                  continue L7;
                                } else {
                                  break L3;
                                }
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                      stackIn_22_0 = 1;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                    stackIn_25_0 = 0;
                    break L2;
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2_ref), "vb.C(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_25_0 != 0;
            } else {
              return stackIn_22_0 != 0;
            }
          }
        }
    }

    vb(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_p = param1;
        this.field_h = param4;
        this.field_n = param0;
        this.field_j = param2;
        this.field_q = param3;
        this.field_o = param5;
    }

    static {
        field_m = new ng();
        field_l = new aj(4, 1, 1, 1);
        field_k = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
    }
}
