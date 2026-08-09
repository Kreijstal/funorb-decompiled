/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h {
    private boolean field_c;
    private boolean field_d;
    static int field_b;
    static int field_a;
    static String field_f;
    private String field_e;

    final boolean b(int param0) {
        int var2 = 12 / ((-44 - param0) / 59);
        return this.field_c;
    }

    final static void a(int param0, boolean param1) {
        if (qb.field_b) {
          if (!fd.field_o[param0]) {
            if ((ck.field_b ^ -1) <= -1) {
              return;
            } else {
              fd.field_o[param0] = param1;
              uj.field_h = 1;
              ck.field_b = param0;
              jk.field_u = 0;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void b(int param0, boolean param1) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        L0: {
          stackIn_2_0 = this;

          if (!param1) {
            stackIn_3_0 = this;
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = this;
            stackIn_3_1 = 1;
            break L0;
          }
        }
        ((h) (this)).field_c = stackIn_3_1 != 0;
        if (param0 != 16564) {
          this.field_d = true;
          this.field_d = true;
          return;
        } else {
          this.field_d = true;
          return;
        }
    }

    final boolean a(int param0) {
        le var3;
        if (param0 != 0) {
          var3 = (le) null;
          h.a(-89, 11, 65, false, -65, -84, -84, (le) null);
          return this.field_d;
        } else {
          return this.field_d;
        }
    }

    final static kc a(int param0, boolean param1, String param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        int var6 = 0;
        Object var7 = null;
        CharSequence var8 = null;
        kc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_long = 0L;
              var6 = 103 / ((param0 - -4) / 54);
              var7 = null;
              if (param3.indexOf('@') == -1) {
                var8 = (CharSequence) ((Object) param3);
                var4_long = sd.a(37, var8);
                break L1;
              } else {
                var7 = param3;
                break L1;
              }
            }
            stackIn_4_0 = sk.a(param2, var4_long, param1, true, (String) (var7));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("h.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        return stackIn_4_0;
    }

    public static void a(byte param0) {
        int var1 = -106 / ((36 - param0) / 34);
        field_f = null;
    }

    final static int a(int param0, byte param1) {
        param0 = ((-1431655765 & param0) >>> 1881365889) + (1431655765 & param0);
        param0 = (param0 & 858993459) + ((param0 & -858993459) >>> -1793960350);
        param0 = 252645135 & param0 - -(param0 >>> 1269921124);
        param0 = param0 + (param0 >>> -1079646840);
        if (param1 < 98) {
          field_a = 83;
          param0 = param0 + (param0 >>> 151476976);
          return param0 & 255;
        } else {
          param0 = param0 + (param0 >>> 151476976);
          return param0 & 255;
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, le param7) {
        int stackIn_24_0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
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
        le var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var29 = null;
        int[] var30 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 < ge.field_a) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        param6 = param6 - (-param2 + ge.field_a);
                        param2 = ge.field_a;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param2 - -param6 > ge.field_j) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        param6 = ge.field_j + -param2;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (ge.field_f > param5) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        param4 = param4 - (-param5 + ge.field_f);
                        param5 = ge.field_f;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (ge.field_k >= param4 + param5) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        param4 = ge.field_k - param5;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((param6 ^ -1) >= -1) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (-1 <= (param4 ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return;
                }
                case 16: {
                    try {
                        if (!param3) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        h.a(31, (byte) 107);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var21 = param7.d();
                        var30 = ge.field_i;
                        var10 = ge.field_h;
                        var11 = ge.field_g;
                        var29 = new int[4];
                        ge.b(var29);
                        param7.e();
                        ge.c(var29[0], var29[1], var29[2], var29[3]);
                        var13 = param5 * param7.field_k + param2;
                        var14 = -param6 + param7.field_k;
                        var25 = var21.field_s;
                        var22 = var25;
                        var15 = var22;
                        var16 = param5;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var16 >= param5 + param4) {
                            statePc = 41;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var19 != 0) {
                            statePc = 47;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var17 = param2;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (param2 + param6 <= var17) {
                            statePc = 39;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var18 = var25[var13];
                        stackIn_40_0 = var18;
                        stackIn_24_0 = stackIn_40_0;
                        if (var19 != 0) {
                            statePc = 40;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (stackIn_24_0 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if ((var17 ^ -1) >= -1) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var15[-1 + var13] == 0) {
                            statePc = 37;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((var16 ^ -1) >= -1) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (0 == var15[-param7.field_k + var13]) {
                            statePc = 37;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (param7.field_k - 1 <= var17) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (-1 == (var15[var13 + 1] ^ -1)) {
                            statePc = 37;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (param7.field_j + -1 <= var16) {
                            statePc = 38;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var15[var13 + param7.field_k] == 0) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        ge.f(var17, var16, param0, param1);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var13++;
                        var17++;
                        if (var19 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackIn_40_0 = var13 + var14;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var13 = stackIn_40_0;
                        var16++;
                        if (var19 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var21.c(-param7.field_r, -param7.field_q);
                        ge.a(var30, var10, var11);
                        ge.a(var29);
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 43: {
                    var8 = (RuntimeException) ((Object) caughtException);
                    stackIn_45_0 = (RuntimeException) (var8);
                    stackIn_44_0 = stackIn_45_0;
                    stackIn_45_1 = new StringBuilder().append("h.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
                    stackIn_44_1 = stackIn_45_1;
                    if (param7 == null) {
                        statePc = 45;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    stackIn_46_0 = (RuntimeException) ((Object) stackIn_44_0);
                    stackIn_46_1 = (StringBuilder) ((Object) stackIn_44_1);
                    stackIn_46_2 = "{...}";
                    statePc = 46;
                    continue stateLoop;
                }
                case 45: {
                    stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
                    stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
                    stackIn_46_2 = "null";
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    throw la.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ')');
                }
                case 47: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final String a(boolean param0) {
        if (!param0) {
            return (String) null;
        }
        return this.field_e;
    }

    h(String param0) {
        this.field_c = false;
        this.field_d = false;
        try {
            this.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "h.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = "Waiting for extra data";
    }
}
