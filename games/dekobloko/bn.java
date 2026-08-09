/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bn {
    static String field_a;
    static boolean[] field_f;
    static mm field_g;
    static String field_c;
    static String field_b;
    static String field_d;
    static ck field_e;

    public static void a(byte param0) {
        if (param0 != 92) {
          field_c = (String) null;
          field_g = null;
          field_b = null;
          field_e = null;
          field_a = null;
          field_d = null;
          field_f = null;
          field_c = null;
          return;
        } else {
          field_g = null;
          field_b = null;
          field_e = null;
          field_a = null;
          field_d = null;
          field_f = null;
          field_c = null;
          return;
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, ck param4, int param5) {
        int incrementValue$0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
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
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var20 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6_int = (param1 + -param2 << 1042191592) / param4.field_K;
                        param5 = param5 + param4.field_F;
                        var7 = (param2 << -286083416) - -(var6_int * param4.field_F);
                        if (param0 <= -96) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_d = (String) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        param3 = param3 + param4.field_z;
                        var8 = hk.field_j * param3 + param5;
                        var9 = 0;
                        var10 = param4.field_H;
                        var11 = param4.field_I;
                        var12 = hk.field_j + -var11;
                        var13 = 0;
                        if (param3 < hk.field_h) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var14 = hk.field_h + -param3;
                        var8 = var8 + var14 * hk.field_j;
                        var9 = var9 + var11 * var14;
                        var10 = var10 - var14;
                        param3 = hk.field_h;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (hk.field_b < var10 + param3) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var10 = var10 - (-hk.field_b + param3 + var10);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (hk.field_c <= param5) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var14 = hk.field_c + -param5;
                        var12 = var12 + var14;
                        var11 = var11 - var14;
                        var9 = var9 + var14;
                        var13 = var13 + var14;
                        var7 = var7 + var14 * var6_int;
                        param5 = hk.field_c;
                        var8 = var8 + var14;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var11 + param5 > hk.field_g) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var14 = var11 + (param5 - hk.field_g);
                        var13 = var13 + var14;
                        var12 = var12 + var14;
                        var11 = var11 - var14;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((var11 ^ -1) >= -1) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (0 < var10) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return;
                }
                case 18: {
                    try {
                        param3 = -var10;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (0 <= param3) {
                            statePc = 42;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var14 = var7;
                        if (var20 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        return;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        param5 = -var11;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (0 <= param5) {
                            statePc = 35;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var15 = var14 >> 1563408872;
                        var14 = var14 + var6_int;
                        var16 = -var15 + 256;
                        stackIn_36_0 = var15;
                        stackIn_25_0 = stackIn_36_0;
                        if (var20 != 0) {
                            statePc = 36;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (stackIn_25_0 < 0) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var9++;
                        var8++;
                        if (var20 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        incrementValue$0 = var9;
                        var9++;
                        var17 = param4.field_D[incrementValue$0];
                        if (var17 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if ((var15 ^ -1) >= -256) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        hk.field_l[var8] = var17;
                        if (var20 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var18 = hk.field_l[var8];
                        var19 = var16 * (16711935 & var18) + var15 * (var17 & 16711935) >> 484059016 & 16711935;
                        hk.field_l[var8] = lb.a(65280, lb.a(65280, var17) * var15 + var16 * lb.a(65280, var18) >> -1554550744) + var19;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var8++;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        param5++;
                        if (var20 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var9 = var9 + var13;
                        stackIn_36_0 = var8 + var12;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var8 = stackIn_36_0;
                        param3++;
                        if (var20 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 38: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_40_0 = (RuntimeException) (var6);
                    stackIn_39_0 = stackIn_40_0;
                    stackIn_40_1 = new StringBuilder().append("bn.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
                    stackIn_39_1 = stackIn_40_1;
                    if (param4 == null) {
                        statePc = 40;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    stackIn_41_0 = (RuntimeException) ((Object) stackIn_39_0);
                    stackIn_41_1 = (StringBuilder) ((Object) stackIn_39_1);
                    stackIn_41_2 = "{...}";
                    statePc = 41;
                    continue stateLoop;
                }
                case 40: {
                    stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
                    stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
                    stackIn_41_2 = "null";
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    throw dh.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ',' + param5 + ')');
                }
                case 42: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static cd a(boolean param0, boolean param1) {
        cd var2;
        ck var3;
        cd stackIn_3_0 = null;
        cd stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        cd stackIn_7_0 = null;
        cd stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        if (param0) {
          L0: {
            var3 = (ck) null;
            bn.a((byte) 42, -57, 101, -103, (ck) null, 71);
            var2 = new cd(true);
            stackIn_7_0 = (cd) (var2);

            if (!param1) {
              stackIn_8_0 = (cd) ((Object) stackIn_7_0);
              stackIn_8_1 = 0;
              break L0;
            } else {
              stackIn_8_0 = (cd) ((Object) stackIn_7_0);
              stackIn_8_1 = 1;
              break L0;
            }
          }
          stackIn_8_0.field_e = stackIn_8_1 != 0;
          return var2;
        } else {
          L1: {
            var2 = new cd(true);
            stackIn_3_0 = (cd) (var2);

            if (!param1) {
              stackIn_4_0 = (cd) ((Object) stackIn_3_0);
              stackIn_4_1 = 0;
              break L1;
            } else {
              stackIn_4_0 = (cd) ((Object) stackIn_3_0);
              stackIn_4_1 = 1;
              break L1;
            }
          }
          stackIn_4_0.field_e = stackIn_4_1 != 0;
          return var2;
        }
    }

    final static void a(long param0, int param1, byte param2) {
        uf var4;
        int var5;
        if (param2 != -84) {
          field_f = (boolean[]) null;
          var4 = we.field_b;
          var4.f(param1, -4);
          var4.field_n = var4.field_n + 1;
          var5 = var4.field_n;
          var4.a(true, 6);
          var4.a(param0, (byte) 0);
          var4.b(var4.field_n + -var5, true);
          return;
        } else {
          var4 = we.field_b;
          var4.f(param1, -4);
          var4.field_n = var4.field_n + 1;
          var5 = var4.field_n;
          var4.a(true, 6);
          var4.a(param0, (byte) 0);
          var4.b(var4.field_n + -var5, true);
          return;
        }
    }

    static {
        field_c = "PANIC!";
        field_a = "Kick";
        field_d = "Loading graphics";
        field_b = "Enter name of player to delete from list";
    }
}
