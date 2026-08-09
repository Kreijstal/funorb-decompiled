/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng {
    static String field_g;
    private bh[] field_h;
    private int field_d;
    static String field_e;
    private int field_f;
    static String field_j;
    static long field_a;
    static w field_i;
    static ck field_b;
    static String field_l;
    private bh field_k;
    private bh field_c;

    final static void a(ck[] param0, int param1, int param2, int param3, int param4) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == null) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((param1 ^ -1) < -1) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        var5_int = param0[0].field_K;
                        var6 = param0[2].field_K;
                        if (param3 == -1) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        field_g = (String) null;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var7 = param0[1].field_K;
                        param0[0].c(param4, param2);
                        param0[2].c(param4 - -param1 - var6, param2);
                        hk.b(kh.field_e);
                        hk.f(var5_int + param4, param2, param4 + (param1 - var6), param2 + param0[1].field_C);
                        var8 = var5_int + param4;
                        var9 = -var6 + param4 + param1;
                        param4 = var8;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param4 >= var9) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        param0[1].c(param4, param2);
                        param4 = param4 + var7;
                        if (var10 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var10 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        hk.a(kh.field_e);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_15_0 = (RuntimeException) (var5);
                    stackIn_14_0 = stackIn_15_0;
                    stackIn_15_1 = new StringBuilder().append("ng.A(");
                    stackIn_14_1 = stackIn_15_1;
                    if (param0 == null) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_16_2 = "{...}";
                    statePc = 16;
                    continue stateLoop;
                }
                case 15: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                    stackIn_16_2 = "null";
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    throw dh.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        field_i = null;
        field_g = null;
        if (param0 > -26) {
            return;
        }
        field_j = null;
        field_b = null;
        field_l = null;
        field_e = null;
    }

    final void a(long param0, int param1, bh param2) {
        bh var5 = null;
        try {
            if (!(null == param2.field_a)) {
                param2.b((byte) 116);
            }
            var5 = this.field_h[(int)((long)(this.field_f + param1) & param0)];
            param2.field_a = var5.field_a;
            param2.field_b = var5;
            param2.field_a.field_b = param2;
            param2.field_b.field_a = param2;
            param2.field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ng.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final bh a(long param0, int param1) {
        bh var4;
        bh var5;
        int var6;
        int stackIn_7_0 = 0;
        var6 = client.field_A ? 1 : 0;
        var4 = this.field_h[(int)((long)(this.field_f - 1) & param0)];
        this.field_k = var4.field_b;
        L0: while (true) {
          L1: {
            L2: {
              if (this.field_k == var4) {
                break L2;
              } else {
                stackIn_7_0 = ((this.field_k.field_i ^ -1L) < (param0 ^ -1L) ? -1 : ((this.field_k.field_i ^ -1L) == (param0 ^ -1L) ? 0 : 1));

                if (var6 != 0) {
                  break L1;
                } else {
                  if (stackIn_7_0 != 0) {
                    this.field_k = this.field_k.field_b;
                    if (var6 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  } else {
                    var5 = this.field_k;
                    this.field_k = this.field_k.field_b;
                    return var5;
                  }
                }
              }
            }
            this.field_k = null;
            stackIn_7_0 = param1;
            break L1;
          }
          if (stackIn_7_0 >= 48) {
            return null;
          } else {
            return (bh) null;
          }
        }
    }

    final static jc a(int param0, String param1) {
        jc stackIn_3_0 = null;
        jc stackIn_6_0 = null;
        jc stackIn_13_0 = null;
        int stackIn_22_0 = 0;
        jc stackIn_26_0 = null;
        Object stackIn_30_0 = null;
        jc stackIn_41_0 = null;
        jc stackIn_45_0 = null;
        Object stackIn_49_0 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ck[] var7 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = param1.length();
                        if (var2_int != 0) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = hm.field_a;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        if ((var2_int ^ -1) >= -65) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_6_0 = ga.field_e;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0;
                }
                case 7: {
                    try {
                        if (param0 == -1) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var7 = (ck[]) null;
                        ng.a((ck[]) null, 38, -12, 7, -118);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (param1.charAt(0) == 34) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (param1.charAt(var2_int + -1) == 34) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_13_0 = be.field_x;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return stackIn_13_0;
                }
                case 14: {
                    try {
                        var3 = 0;
                        var4 = 1;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var2_int + -1 > var4) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        return null;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var5 = param1.charAt(var4);
                        if (var5 == 92) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var3 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_22_0 = 1;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_22_0 = 0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var3 = stackIn_22_0;
                        if (var6 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var5 != 34) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var3 != 0) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_26_0 = be.field_x;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return stackIn_26_0;
                }
                case 27: {
                    try {
                        var3 = 0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var4++;
                        if (var6 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_30_0 = null;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 30: {
                    return (jc) ((Object) stackIn_30_0);
                }
                case 31: {
                    try {
                        var3 = 0;
                        var4 = 0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var2_int > var4) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        return null;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var5 = param1.charAt(var4);
                        if (46 == var5) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (0 == var4) {
                            statePc = 40;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var4 == -1 + var2_int) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var3 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackIn_41_0 = be.field_x;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 41: {
                    return stackIn_41_0;
                }
                case 42: {
                    try {
                        var3 = 1;
                        if (var6 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (-1 != nm.field_Pb.indexOf(var5)) {
                            statePc = 46;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackIn_45_0 = be.field_x;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 45: {
                    return stackIn_45_0;
                }
                case 46: {
                    try {
                        var3 = 0;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var4++;
                        if (var6 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackIn_49_0 = null;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 49: {
                    return (jc) ((Object) stackIn_49_0);
                }
                case 50: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_52_0 = (RuntimeException) (var2);
                    stackIn_51_0 = stackIn_52_0;
                    stackIn_52_1 = new StringBuilder().append("ng.B(").append(param0).append(',');
                    stackIn_51_1 = stackIn_52_1;
                    if (param1 == null) {
                        statePc = 52;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    stackIn_53_0 = (RuntimeException) ((Object) stackIn_51_0);
                    stackIn_53_1 = (StringBuilder) ((Object) stackIn_51_1);
                    stackIn_53_2 = "{...}";
                    statePc = 53;
                    continue stateLoop;
                }
                case 52: {
                    stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
                    stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
                    stackIn_53_2 = "null";
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    throw dh.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final bh a(byte param0) {
        this.field_d = 0;
        if (param0 != 126) {
            this.b((byte) 112);
            return this.b((byte) 49);
        }
        return this.b((byte) 49);
    }

    final bh b(byte param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3;
        bh var4;
        bh var5;
        bh var8;
        bh var9;
        var3 = client.field_A ? 1 : 0;
        if ((this.field_d ^ -1) >= -1) {
          if (param0 >= 37) {
            L0: while (true) {
              if (this.field_f > this.field_d) {
                fieldTemp$2 = this.field_d;
                this.field_d = this.field_d + 1;
                var4 = this.field_h[fieldTemp$2].field_b;
                var9 = var4;
                if (var4 != this.field_h[-1 + this.field_d]) {
                  this.field_c = var9.field_b;
                  return var9;
                } else {
                  if (var3 == 0) {
                    continue L0;
                  } else {
                    return null;
                  }
                }
              } else {
                return null;
              }
            }
          } else {
            return (bh) null;
          }
        } else {
          if (this.field_h[-1 + this.field_d] == this.field_c) {
            if (param0 >= 37) {
              L1: while (true) {
                if (this.field_f > this.field_d) {
                  fieldTemp$3 = this.field_d;
                  this.field_d = this.field_d + 1;
                  var4 = this.field_h[fieldTemp$3].field_b;
                  var5 = var4;
                  if (var4 != this.field_h[-1 + this.field_d]) {
                    this.field_c = var5.field_b;
                    return var5;
                  } else {
                    if (var3 == 0) {
                      continue L1;
                    } else {
                      return null;
                    }
                  }
                } else {
                  return null;
                }
              }
            } else {
              return (bh) null;
            }
          } else {
            var8 = this.field_c;
            this.field_c = var8.field_b;
            return var8;
          }
        }
    }

    ng(int param0) {
        bh dupTemp$0 = null;
        bh var3 = null;
        int var4 = client.field_A ? 1 : 0;
        this.field_d = 0;
        this.field_f = param0;
        this.field_h = new bh[param0];
        int var2 = 0;
        do {
            if (param0 <= var2) {
                return;
            }
            dupTemp$0 = new bh();
            var3 = dupTemp$0;
            this.field_h[var2] = dupTemp$0;
            var3.field_b = var3;
            var3.field_a = var3;
            var2++;
            if (var4 != 0) {
                return;
            }
        } while (var4 == 0);
    }

    static {
        field_e = "Please check if address is correct";
        field_g = "Stage";
        field_j = "This password is part of your Player Name, and would be easy to guess";
        field_l = "Waiting for graphics";
    }
}
