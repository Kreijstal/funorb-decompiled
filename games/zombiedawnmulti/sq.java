/*
 * Decompiled by CFR-JS 0.4.0.
 */
class sq extends gn {
    static int field_R;
    private String[] field_M;
    private th field_T;
    static boolean field_N;
    static int field_S;
    private wi field_V;
    static int field_Q;
    static int field_O;
    static int[] field_U;
    static String field_P;

    final static void a(int param0, int param1, int param2, int param3, ja param4, int param5, int param6, int param7) {
        int stackIn_24_0 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
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
        ja var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var29 = null;
        int[] var30 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param6 >= oo.field_f) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        param1 = param1 - (oo.field_f - param6);
                        param6 = oo.field_f;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (param7 < oo.field_e) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        param3 = param3 - (oo.field_e - param7);
                        param7 = oo.field_e;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (oo.field_g < param6 - -param1) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        param1 = oo.field_g - param6;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (oo.field_d < param7 + param3) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        param3 = -param7 + oo.field_d;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (-1 <= (param1 ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (param3 > 0) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return;
                }
                case 16: {
                    try {
                        var21 = param4.c();
                        var30 = oo.field_i;
                        if (param0 == 5) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        sq.g(-57);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var10 = oo.field_b;
                        var11 = oo.field_l;
                        var29 = new int[4];
                        oo.a(var29);
                        param4.a();
                        oo.e(var29[0], var29[1], var29[2], var29[3]);
                        var13 = param6 + param7 * param4.field_x;
                        var14 = param4.field_x + -param1;
                        var25 = var21.field_B;
                        var22 = var25;
                        var15 = var22;
                        var16 = param7;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (param3 + param7 <= var16) {
                            statePc = 44;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var19 != 0) {
                            statePc = 50;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var17 = param6;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var17 >= param6 - -param1) {
                            statePc = 42;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var18 = var25[var13];
                        stackIn_43_0 = var18;
                        stackIn_24_0 = stackIn_43_0;
                        if (var19 != 0) {
                            statePc = 43;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (stackIn_24_0 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (0 >= var17) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (-1 == (var15[-1 + var13] ^ -1)) {
                            statePc = 37;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (-1 <= (var16 ^ -1)) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (0 == var15[var13 - param4.field_x]) {
                            statePc = 38;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (param4.field_x + -1 <= var17) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var15[var13 - -1] == 0) {
                            statePc = 39;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (-1 + param4.field_w <= var16) {
                            statePc = 41;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var15[var13 - -param4.field_x] != 0) {
                            statePc = 41;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        oo.d(var17, var16, param2, param5);
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        oo.d(var17, var16, param2, param5);
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        oo.d(var17, var16, param2, param5);
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        oo.d(var17, var16, param2, param5);
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var13++;
                        var17++;
                        if (var19 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackIn_43_0 = var13 + var14;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var13 = stackIn_43_0;
                        var16++;
                        if (var19 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var21.g(-param4.field_r, -param4.field_y);
                        oo.a(var30, var10, var11);
                        oo.b(var29);
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 46: {
                    var8 = (RuntimeException) ((Object) caughtException);
                    stackIn_48_0 = (RuntimeException) (var8);
                    stackIn_47_0 = stackIn_48_0;
                    stackIn_48_1 = new StringBuilder().append("sq.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
                    stackIn_47_1 = stackIn_48_1;
                    if (param4 == null) {
                        statePc = 48;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    stackIn_49_0 = (RuntimeException) ((Object) stackIn_47_0);
                    stackIn_49_1 = (StringBuilder) ((Object) stackIn_47_1);
                    stackIn_49_2 = "{...}";
                    statePc = 49;
                    continue stateLoop;
                }
                case 48: {
                    stackIn_49_0 = (RuntimeException) ((Object) stackIn_48_0);
                    stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
                    stackIn_49_2 = "null";
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    throw fa.a((Throwable) ((Object) stackIn_49_0), stackIn_49_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
                }
                case 50: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        wi var7;
        super.a(param0, param1, param2, param3);
        var5 = -this.field_y + param2;
        var6 = -this.field_i + param3;
        var7 = this.a((byte) 23, var5, var6);
        if (var7 != null) {
          if (null != this.field_A) {
            ((co) ((Object) this.field_A)).a(param1, (sq) (this), -38, var7.field_l);
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private final wi a(byte param0, int param1, int param2) {
        wi stackIn_7_0 = null;
        wi stackIn_14_0 = null;
        int statePc = 0;
        wi var4 = null;
        wi var5 = null;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = ZombieDawnMulti.field_E ? 1 : 0;
                    var4 = (wi) ((Object) this.field_T.c(105));
                    if (param0 == 23) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return (wi) null;
                }
                case 2: {
                    if (var4 != null) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return null;
                }
                case 4: {
                    var5 = var4;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (var5 == null) {
                        statePc = 13;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    stackIn_14_0 = (wi) (var5);
                    stackIn_7_0 = stackIn_14_0;
                    if (var6 != 0) {
                        statePc = 14;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (stackIn_7_0.field_k > param1) {
                        statePc = 12;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (param2 < var5.field_f) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (param1 >= var5.field_j + var5.field_k) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (param2 > var5.field_n + var5.field_f) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    return var4;
                }
                case 12: {
                    var5 = var5.field_i;
                    if (var6 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_14_0 = (wi) ((Object) this.field_T.b(6));
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    var4 = stackIn_14_0;
                    if (var6 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    return null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    void a(int param0, cf param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        cf var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              super.a(param0 ^ 0, param1, param2, param3);
              if (param0 == -5407) {
                break L1;
              } else {
                var7 = (cf) null;
                this.a(93, (cf) null, 109, -90);
                break L1;
              }
            }
            L2: {
              this.field_V = null;
              if (this.field_l) {
                var5_int = bd.field_g - (param2 + this.field_y);
                var6 = bo.field_d + (-param3 - this.field_i);
                this.field_V = this.a((byte) 23, var5_int, var6);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("sq.T(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (param2 != -4) {
          field_S = 74;
          this.b(param3, param1, param2 ^ -28976, param0, ((rk) ((Object) this.field_h)).a((byte) 39, (cf) (this)));
          return;
        } else {
          this.b(param3, param1, param2 ^ -28976, param0, ((rk) ((Object) this.field_h)).a((byte) 39, (cf) (this)));
          return;
        }
    }

    final void a(byte param0) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_40_0 = 0;
        int statePc = 0;
        int var2 = 0;
        rk var3 = null;
        mp var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        Object var17 = null;
        rk var17_ref = null;
        String var21 = null;
        mp var22 = null;
        td var23 = null;
        wi var24 = null;
        Object var25 = null;
        String var26 = null;
        mp var27 = null;
        td var28 = null;
        wi var29 = null;
        rk var30 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var17 = null;
                    var25 = null;
                    var16 = ZombieDawnMulti.field_E ? 1 : 0;
                    this.field_T = new th();
                    var2 = 0;
                    if (param0 == 94) {
                        statePc = 24;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.a((byte) -110);
                    var17_ref = (rk) ((Object) this.field_h);
                    var3 = var17_ref;
                    var22 = var17_ref.a((cf) (this), -102);
                    var4 = var22;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var5 = this.field_j.indexOf("<hotspot=", var2);
                    stackIn_3_0 = var5;
                    stackIn_3_1 = -1;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if ((stackIn_3_0 ^ stackIn_3_1) != 0) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var16 != 0) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return;
                }
                case 7: {
                    var7 = this.field_j.indexOf(">", var5);
                    var21 = this.field_j.substring(var5 + 9, var7);
                    var7 = Integer.parseInt(var21);
                    var2 = this.field_j.indexOf("</hotspot>", var5);
                    var8 = var22.a((byte) -126, var5);
                    var9 = var22.a((byte) -126, var2);
                    var10 = null;
                    var11 = var8;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (var9 < var11) {
                        statePc = 22;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var23 = var22.field_e[var11];
                    stackIn_3_0 = var8;
                    stackIn_10_0 = stackIn_3_0;
                    stackIn_3_1 = var11;
                    stackIn_10_1 = stackIn_3_1;
                    if (var16 != 0) {
                        statePc = 3;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (stackIn_10_0 == stackIn_10_1) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackIn_13_0 = var23.field_e[0];
                    statePc = 13;
                    continue stateLoop;
                }
                case 12: {
                    stackIn_13_0 = var22.a(52224, var5);
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    var13 = stackIn_13_0;
                    if (var9 == var11) {
                        statePc = 17;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (var23 == null) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackIn_18_0 = var23.field_e[-1 + var23.field_e.length];
                    statePc = 18;
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = 0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = var22.a(52224, var2);
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    var14 = stackIn_18_0;
                    var24 = new wi(var7, var13, var23.field_d, -var13 + var14, Math.max(var17_ref.a(0), var23.field_h - var23.field_d));
                    if (var10 != null) {
                        statePc = 20;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 20: {
                    ((wi) (var10)).field_i = var24;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    var10 = var24;
                    this.field_T.a(var24, false);
                    var11++;
                    if (var16 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (var16 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    return;
                }
                case 24: {
                    var30 = (rk) ((Object) this.field_h);
                    var27 = var30.a((cf) (this), -102);
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    var5 = this.field_j.indexOf("<hotspot=", var2);
                    stackIn_26_0 = var5;
                    stackIn_26_1 = -1;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if ((stackIn_26_0 ^ stackIn_26_1) != 0) {
                        statePc = 29;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (var16 != 0) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    return;
                }
                case 29: {
                    var7 = this.field_j.indexOf(">", var5);
                    var26 = this.field_j.substring(var5 + 9, var7);
                    var7 = Integer.parseInt(var26);
                    var2 = this.field_j.indexOf("</hotspot>", var5);
                    var8 = var27.a((byte) -126, var5);
                    var9 = var27.a((byte) -126, var2);
                    var10 = null;
                    var11 = var8;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if (var9 < var11) {
                        statePc = 44;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var28 = var27.field_e[var11];
                    stackIn_26_0 = var8;
                    stackIn_32_0 = stackIn_26_0;
                    stackIn_26_1 = var11;
                    stackIn_32_1 = stackIn_26_1;
                    if (var16 != 0) {
                        statePc = 26;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (stackIn_32_0 == stackIn_32_1) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    stackIn_35_0 = var28.field_e[0];
                    statePc = 35;
                    continue stateLoop;
                }
                case 34: {
                    stackIn_35_0 = var27.a(52224, var5);
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    var13 = stackIn_35_0;
                    if (var9 == var11) {
                        statePc = 39;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (var28 == null) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    stackIn_40_0 = var28.field_e[-1 + var28.field_e.length];
                    statePc = 40;
                    continue stateLoop;
                }
                case 38: {
                    stackIn_40_0 = 0;
                    statePc = 40;
                    continue stateLoop;
                }
                case 39: {
                    stackIn_40_0 = var27.a(52224, var2);
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    var14 = stackIn_40_0;
                    var29 = new wi(var7, var13, var28.field_d, -var13 + var14, Math.max(var30.a(0), var28.field_h - var28.field_d));
                    if (var10 != null) {
                        statePc = 42;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 42: {
                    ((wi) (var10)).field_i = var29;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    var10 = var29;
                    this.field_T.a(var29, false);
                    var11++;
                    if (var16 == 0) {
                        statePc = 30;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (var16 == 0) {
                        statePc = 25;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void f(int param0) {
        field_P = null;
        if (param0 != 2) {
            field_R = -124;
            field_U = null;
            return;
        }
        field_U = null;
    }

    String d(byte param0) {
        int var2;
        if (null != this.field_V) {
          if (this.field_M != null) {
            if (this.field_M.length <= this.field_V.field_l) {
              return null;
            } else {
              var2 = 95 / ((53 - param0) / 57);
              return this.field_M[this.field_V.field_l];
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    boolean a(cf param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                this.a((byte) 97);
                break L1;
              }
            }
            stackIn_3_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("sq.S(");

            if (param0 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    sq(String param0, nl param1) {
        super(param0, (bj) null);
        this.field_V = null;
        try {
            this.field_h = param1;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "sq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        rk var5;
        wi var6;
        int var7;
        int var8;
        super.a(param0, param1, param2, param3);
        if (0 == param2) {
          var5 = (rk) ((Object) this.field_h);
          var6 = this.field_V;
          if (var6 == null) {
            return;
          } else {
            var7 = var5.a(false, param3, (cf) (this));
            var8 = var5.a((cf) (this), 0, param1);
            L0: while (true) {
              hl.a(-2 + var6.field_f + var8, var7 - (-var6.field_k + 2), (byte) 126, var6.field_j + 2, 2 + var6.field_n);
              var6 = var6.field_i;
              if (var6 != null) {
                continue L0;
              } else {
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, byte param1, String param2) {
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (null == this.field_M) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param0 < this.field_M.length) {
                            statePc = 12;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var7 = new String[1 + param0];
                        var8 = var7;
                        var4 = var8;
                        if (this.field_M != null) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var5 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var5 >= this.field_M.length) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var7[var5] = this.field_M[var5];
                        var5++;
                        if (var6 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var6 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        this.field_M = var8;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (param1 <= -101) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return;
                }
                case 14: {
                    try {
                        this.field_M[param0] = param2;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_18_0 = (RuntimeException) (runtimeException);
                    stackIn_17_0 = stackIn_18_0;
                    stackIn_18_1 = new StringBuilder().append("sq.OA(").append(param0).append(',').append(param1).append(',');
                    stackIn_17_1 = stackIn_18_1;
                    if (param2 == null) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_19_2 = "{...}";
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_19_2 = "null";
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    throw fa.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        this.a((byte) 94);
    }

    final static void g(int param0) {
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_19_0 = 0;
        String stackIn_24_0 = null;
        int stackIn_28_0 = 0;
        String stackIn_34_0 = null;
        int stackIn_39_0 = 0;
        String stackIn_39_1 = null;
        int stackIn_40_0 = 0;
        String stackIn_40_1 = null;
        int stackIn_41_0 = 0;
        String stackIn_41_1 = null;
        int stackIn_41_2 = 0;
        pd stackIn_45_0 = null;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        pd var9 = null;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1_int = ce.field_k;
                        var2 = 0;
                        if (ho.field_q == 2) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var3_long = bl.a((byte) 49) + -so.field_s;
                        var2 = (int)((-var3_long + 10999L) / 1000L);
                        if ((var2 ^ -1) > -1) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var3 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (hq.field_m.length <= var3) {
                            statePc = 53;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var4 = wd.field_Q[var3];
                        stackIn_54_0 = -1;
                        stackIn_9_0 = stackIn_54_0;
                        stackIn_54_1 = var4 ^ -1;
                        stackIn_9_1 = stackIn_54_1;
                        if (var10 != 0) {
                            statePc = 54;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (stackIn_9_0 >= stackIn_9_1) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5 = qh.field_e;
                        if (var10 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var4 != aq.field_B.field_d) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var5 = fq.field_n;
                        if (var10 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var5 = hp.field_k;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var6 = hq.field_m[var3];
                        if (-3 != (ho.field_q ^ -1)) {
                            statePc = 35;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var2 != 1) {
                            statePc = 35;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (aa.field_n.length < q.field_a.length) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_19_0 = aa.field_n.length;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_19_0 = q.field_a.length;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var7 = stackIn_19_0;
                        if ((var3 ^ -1) > -7) {
                            statePc = 25;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var3 >= 6 - -var7) {
                            statePc = 25;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (0 > -6 + var3 - (-aa.field_n.length + var7)) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_24_0 = aa.field_n[var3 - (6 + (-aa.field_n.length + var7))];
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_24_0 = "";
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var6 = stackIn_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (ud.field_N.length <= ik.field_a.length) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_28_0 = ud.field_N.length;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_28_0 = ik.field_a.length;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var8 = stackIn_28_0;
                        if (7 + var7 > var3) {
                            statePc = 35;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var7 + 7 - -var8 > var3) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (ik.field_a.length > -var7 + -7 + var3) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_34_0 = "";
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_34_0 = ik.field_a[-7 + var3 + -var7];
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var6 = stackIn_34_0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (1 == (var4 ^ -1)) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var6 = Integer.toString(var2);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_40_0 = 0;
                        stackIn_39_0 = stackIn_40_0;
                        stackIn_40_1 = (String) (var6);
                        stackIn_39_1 = stackIn_40_1;
                        if (var4 < 0) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackIn_41_0 = stackIn_39_0;
                        stackIn_41_1 = (String) ((Object) stackIn_39_1);
                        stackIn_41_2 = 1;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackIn_41_0 = stackIn_40_0;
                        stackIn_41_1 = (String) ((Object) stackIn_40_1);
                        stackIn_41_2 = 0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var7 = hn.a(stackIn_41_0, stackIn_41_1, stackIn_41_2 != 0);
                        var8 = am.field_c + -(var7 >> -909100255);
                        if ((var4 ^ -1) > -1) {
                            statePc = 49;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var1_int = var1_int + al.field_bb;
                        if (var4 != aq.field_B.field_d) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_45_0 = en.field_d;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackIn_45_0 = mc.field_a;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var9 = stackIn_45_0;
                        if (var9 != null) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var9.a(var1_int, -no.field_Gb + var8, var7 - -(no.field_Gb << 472381537), me.field_h + (wk.field_G << -36687903), 12018);
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var1_int = var1_int + wk.field_G;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (-1 >= (var4 ^ -1)) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        uq.field_f.c(var6, var8, var1_int + bf.field_g, var5, -1);
                        var1_int = var1_int + se.field_C;
                        if (var10 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        m.field_C.c(var6, var8, var1_int + nc.field_h, var5, -1);
                        var1_int = var1_int + (al.field_bb + (wk.field_G - -me.field_h));
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var3++;
                        if (var10 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackIn_54_0 = -59;
                        stackIn_54_1 = (param0 - 38) / 57;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var3 = stackIn_54_0 % stackIn_54_1;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 56: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var1), "sq.WA(" + param0 + ')');
                }
                case 57: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, ja[] param1, boolean param2) {
        int var4 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              fa.field_Qb[param0] = param1;
              if (!param2) {
                break L1;
              } else {
                sq.f(-7);
                break L1;
              }
            }
            L2: {
              L3: {
                if (0 == param0) {
                  break L3;
                } else {
                  L4: {
                    if ((param0 ^ -1) == -5) {
                      break L4;
                    } else {
                      L5: {
                        if (1 == param0) {
                          break L5;
                        } else {
                          L6: {
                            if ((param0 ^ -1) != -3) {
                              break L6;
                            } else {
                              qc.a(0, (byte) -126, param1, 63, 3);
                              qc.a(0, (byte) -126, param1, 62, 4);
                              qc.a(0, (byte) -126, param1, 61, 1);
                              qc.a(0, (byte) -126, param1, 60, 2);
                              qc.a(0, (byte) -126, param1, 59, 5);
                              qc.a(0, (byte) -126, param1, 58, 6);
                              qc.a(0, (byte) -126, param1, 57, 7);
                              qc.a(0, (byte) -126, param1, 56, 8);
                              qc.a(3, (byte) -126, param1, 55, 3);
                              qc.a(3, (byte) -126, param1, 54, 4);
                              qc.a(3, (byte) -126, param1, 53, 1);
                              qc.a(3, (byte) -126, param1, 52, 2);
                              qc.a(3, (byte) -126, param1, 51, 5);
                              qc.a(3, (byte) -126, param1, 50, 6);
                              qc.a(3, (byte) -126, param1, 49, 7);
                              qc.a(3, (byte) -126, param1, 48, 8);
                              qc.a(0, (byte) -126, param1, 47, 0);
                              qc.a(3, (byte) -126, param1, 46, 0);
                              qc.a(15, (byte) -126, param1, 45, 2);
                              qc.a(15, (byte) -126, param1, 44, 1);
                              if (var4 == 0) {
                                break L2;
                              } else {
                                break L6;
                              }
                            }
                          }
                          if (param0 == 3) {
                            qc.a(4, (byte) -126, param1, 63, 3);
                            qc.a(4, (byte) -126, param1, 62, 4);
                            qc.a(4, (byte) -126, param1, 61, 1);
                            qc.a(4, (byte) -126, param1, 60, 2);
                            qc.a(4, (byte) -126, param1, 59, 5);
                            qc.a(4, (byte) -126, param1, 58, 6);
                            qc.a(4, (byte) -126, param1, 57, 7);
                            qc.a(4, (byte) -126, param1, 56, 8);
                            qc.a(4, (byte) -126, param1, 55, 0);
                            qc.a(5, (byte) -126, param1, 52, 0);
                            qc.a(12, (byte) -126, param1, 51, 2);
                            qc.a(12, (byte) -126, param1, 50, 1);
                            qc.a(26, (byte) -126, param1, 49, 2);
                            qc.a(26, (byte) -126, param1, 48, 1);
                            qc.a(26, (byte) -126, param1, 47, 8);
                            qc.a(26, (byte) -126, param1, 46, 5);
                            qc.a(26, (byte) -126, param1, 45, 6);
                            qc.a(26, (byte) -126, param1, 44, 7);
                            qc.a(6, (byte) -126, param1, 43, 2);
                            qc.a(6, (byte) -126, param1, 42, 1);
                            qc.a(12, (byte) -126, param1, 41, 5);
                            qc.a(12, (byte) -126, param1, 40, 8);
                            qc.a(12, (byte) -126, param1, 39, 4);
                            qc.a(12, (byte) -126, param1, 38, 3);
                            qc.a(29, (byte) -126, param1, 37, 2);
                            qc.a(29, (byte) -126, param1, 36, 0);
                            qc.a(26, (byte) -126, param1, 23, 4);
                            qc.a(12, (byte) -126, param1, 22, 6);
                            qc.a(12, (byte) -126, param1, 21, 7);
                            if (var4 == 0) {
                              break L2;
                            } else {
                              break L5;
                            }
                          } else {
                            break L2;
                          }
                        }
                      }
                      qc.a(2, (byte) -126, param1, 63, 2);
                      qc.a(2, (byte) -126, param1, 62, 1);
                      qc.a(2, (byte) -126, param1, 61, 5);
                      qc.a(2, (byte) -126, param1, 60, 6);
                      qc.a(2, (byte) -126, param1, 59, 8);
                      qc.a(2, (byte) -126, param1, 58, 7);
                      qc.a(2, (byte) -126, param1, 57, 4);
                      qc.a(3, (byte) -126, param1, 56, 2);
                      qc.a(3, (byte) -126, param1, 55, 1);
                      qc.a(3, (byte) -126, param1, 54, 5);
                      qc.a(3, (byte) -126, param1, 53, 6);
                      qc.a(3, (byte) -126, param1, 52, 8);
                      qc.a(3, (byte) -126, param1, 51, 7);
                      qc.a(3, (byte) -126, param1, 50, 0);
                      qc.a(2, (byte) -126, param1, 49, 3);
                      qc.a(0, (byte) -126, param1, 48, 1);
                      qc.a(0, (byte) -126, param1, 47, 2);
                      qc.a(9, (byte) -126, param1, 46, 3);
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  qc.a(0, (byte) -126, param1, 79, 3);
                  qc.a(0, (byte) -126, param1, 78, 4);
                  qc.a(0, (byte) -126, param1, 77, 1);
                  qc.a(0, (byte) -126, param1, 76, 2);
                  qc.a(0, (byte) -126, param1, 75, 5);
                  qc.a(0, (byte) -126, param1, 74, 6);
                  qc.a(0, (byte) -126, param1, 73, 7);
                  qc.a(0, (byte) -126, param1, 72, 8);
                  qc.a(0, (byte) -126, param1, 71, 0);
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              param1[6].a();
              oo.e(0, 0, 24, 24, 0);
              qc.a(2, (byte) -126, param1, 79, 3);
              qc.a(2, (byte) -126, param1, 78, 4);
              qc.a(2, (byte) -126, param1, 77, 1);
              qc.a(2, (byte) -126, param1, 76, 2);
              qc.a(2, (byte) -126, param1, 75, 5);
              qc.a(2, (byte) -126, param1, 74, 6);
              qc.a(2, (byte) -126, param1, 73, 7);
              qc.a(2, (byte) -126, param1, 72, 8);
              qc.a(0, (byte) -126, param1, 71, 3);
              qc.a(0, (byte) -126, param1, 70, 4);
              qc.a(0, (byte) -126, param1, 69, 1);
              qc.a(0, (byte) -126, param1, 68, 2);
              qc.a(0, (byte) -126, param1, 67, 5);
              qc.a(0, (byte) -126, param1, 66, 6);
              qc.a(0, (byte) -126, param1, 65, 7);
              qc.a(0, (byte) -126, param1, 64, 8);
              qc.a(7, (byte) -126, param1, 61, 2);
              qc.a(7, (byte) -126, param1, 60, 1);
              qc.a(7, (byte) -126, param1, 59, 5);
              qc.a(7, (byte) -126, param1, 58, 6);
              qc.a(7, (byte) -126, param1, 57, 7);
              qc.a(7, (byte) -126, param1, 56, 8);
              qc.a(24, (byte) -126, param1, 55, 2);
              qc.a(24, (byte) -126, param1, 54, 1);
              qc.a(24, (byte) -126, param1, 53, 5);
              qc.a(2, (byte) -126, param1, 63, 0);
              qc.a(0, (byte) -126, param1, 62, 0);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3);

            stackIn_20_1 = new StringBuilder().append("sq.PA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L7;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L7;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ')');
        }
    }

    static {
        field_N = true;
        field_S = 0;
        field_P = "Quick Chat lobby";
        field_U = new int[256];
    }
}
