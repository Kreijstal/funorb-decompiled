/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi {
    static String field_c;
    int field_d;
    static String field_b;
    static ri field_f;
    static String field_h;
    static String field_e;
    static int field_i;
    static String field_g;
    static ip field_a;

    pi(int param0) {
        this.field_d = param0;
    }

    public static void a(int param0) {
        field_a = null;
        field_h = null;
        field_c = null;
        if (param0 != -19162) {
          field_b = (String) null;
          field_f = null;
          field_g = null;
          field_b = null;
          field_e = null;
          return;
        } else {
          field_f = null;
          field_g = null;
          field_b = null;
          field_e = null;
          return;
        }
    }

    final static void a(int param0, boolean param1, int param2, boolean param3, int[] param4, int param5, int param6, int param7) {
        if (!param3) {
            return;
        }
        try {
            int[] var9 = (int[]) null;
            vk.a((int[]) null, param1, param6, param2, (byte) -117, param4, param5, param7, param0);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "pi.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void a(byte param0, boolean param1, boolean param2, ic param3, int param4) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          L0: {
            L1: {
              mj.field_Fb[0] = c.field_c.nextInt();
              mj.field_Fb[1] = c.field_c.nextInt();
              mj.field_Fb[2] = (int)(nm.field_c >> 1948345184);
              mj.field_Fb[3] = (int)nm.field_c;
              pm.field_R.field_j = 0;
              pm.field_R.b(33, mj.field_Fb[0]);
              pm.field_R.b(param0 ^ 84, mj.field_Fb[1]);
              pm.field_R.b(-111, mj.field_Fb[2]);
              pm.field_R.b(param0 ^ 88, mj.field_Fb[3]);
              jq.a(pm.field_R, 13746);
              pm.field_R.a(param4, (byte) -54);
              if (param0 == -59) {
                break L1;
              } else {
                field_c = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                param3.a(pm.field_R, -1);
                ma.field_a.field_j = 0;
                if (!param2) {
                  break L3;
                } else {
                  ma.field_a.a(-102, 18);
                  if (!ZombieDawnMulti.field_E) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ma.field_a.a(param0 ^ -68, 16);
              break L2;
            }
            L4: {
              ma.field_a.field_j = ma.field_a.field_j + 2;
              var5_int = ma.field_a.field_j;
              ma.field_a.b(95, v.field_f);
              ma.field_a.a(qa.field_i, true);
              var6 = 0;
              if (cm.field_e) {
                var6 = var6 | 1;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (!gj.field_e) {
                break L5;
              } else {
                var6 = var6 | 4;
                break L5;
              }
            }
            L6: {
              if (!param1) {
                break L6;
              } else {
                var6 = var6 | 8;
                break L6;
              }
            }
            L7: {
              if (null != oe.field_f) {
                var6 = var6 | 16;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              ma.field_a.a(-81, var6);
              var7 = wg.a(0, jl.b(0));
              if (var7 == null) {
                var7 = "";
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              ma.field_a.a(var7, (byte) 105);
              if (null != oe.field_f) {
                ma.field_a.b(-16171, oe.field_f);
                break L9;
              } else {
                break L9;
              }
            }
            hd.a(gn.field_L, (byte) -122, tp.field_v, pm.field_R, ma.field_a);
            ma.field_a.b(false, -var5_int + ma.field_a.field_j);
            cb.a(-1, false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var5);

            stackIn_26_1 = new StringBuilder().append("pi.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L10;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L10;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param4 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5) {
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 >= oo.field_f) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        param3 = param3 - (oo.field_f - param1);
                        param1 = oo.field_f;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (oo.field_e > param5) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        param4 = param4 - (-param5 + oo.field_e);
                        param5 = oo.field_e;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (oo.field_g >= param1 + param3) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        param3 = oo.field_g - param1;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param0 <= -88) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return;
                }
                case 10: {
                    try {
                        if (oo.field_d < param4 + param5) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        param4 = oo.field_d + -param5;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if ((param3 ^ -1) >= -1) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (-1 > (param4 ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return;
                }
                case 17: {
                    try {
                        var6_int = oo.field_b * param5 + param1;
                        var7 = oo.field_b + -param3;
                        param5 = -param4;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (param5 >= 0) {
                            statePc = 35;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var12 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        return;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        param1 = -param3;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (param1 >= 0) {
                            statePc = 31;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var8 = oo.field_i[var6_int];
                        stackIn_32_0 = 255 & var8 >> -191798296;
                        stackIn_24_0 = stackIn_32_0;
                        stackIn_32_1 = param2;
                        stackIn_24_1 = stackIn_32_1;
                        if (var12 != 0) {
                            statePc = 32;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (stackIn_24_0 <= stackIn_24_1) {
                            statePc = 30;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if ((255 & var8 >> -1579167280) > (var8 & 65280) >> -194018744) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var9 = ((16711680 & var8) >> 1703656975) - 60;
                        if (var9 > 255) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var9 = 255;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var10 = 65280 & var8;
                        var10 = -(var10 >> 1524593221) + (var10 >> -1951905311) & 65280;
                        var11 = 31 & var8 >> -656512189;
                        oo.field_i[var6_int] = cr.b(cr.b(var9 << -46440176, var10), var11);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var6_int++;
                        param1++;
                        if (var12 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_32_0 = var6_int;
                        stackIn_32_1 = var7;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var6_int = stackIn_32_0 + stackIn_32_1;
                        param5++;
                        if (var12 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 34: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var6), "pi.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
                }
                case 35: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_c = "Offline";
        field_h = "Traits affect your zombies for the entire match. Drag GREEN (square) research here to apply it.";
        field_b = "Return to lobby";
        field_g = "Suggested names: ";
        field_e = "Message game";
        field_a = new ip();
    }
}
