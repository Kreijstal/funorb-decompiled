/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj extends oa {
    private ug field_p;
    private int field_n;
    static String field_o;

    final static void a(java.awt.Component param0, int param1) {
        try {
            if (param1 != -2) {
                hj.m(75);
            }
            param0.setFocusTraversalKeysEnabled(false);
            param0.addKeyListener(el.field_n);
            param0.addFocusListener(el.field_n);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "hj.AB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3) {
        int fieldTemp$1 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var5_int >= param1) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        fieldTemp$1 = this.field_h;
                        this.field_h = this.field_h + 1;
                        param0[param2 + var5_int] = (byte)(this.field_g[fieldTemp$1] + -this.field_p.a(-88));
                        var5_int++;
                        if (var6 != 0) {
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
                        if (var6 == 0) {
                            statePc = 2;
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
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param3 == 18570) {
                            statePc = 13;
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
                        field_o = (String) null;
                        return;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_11_0 = (RuntimeException) (var5);
                    stackIn_10_0 = stackIn_11_0;
                    stackIn_11_1 = new StringBuilder().append("hj.QA(");
                    stackIn_10_1 = stackIn_11_1;
                    if (param0 == null) {
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
                    throw ch.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    hj(byte[] param0) {
        super(param0);
    }

    hj(int param0) {
        super(param0);
    }

    final int l(int param0) {
        int fieldTemp$1 = 0;
        if (param0 != -12135) {
          return 41;
        } else {
          fieldTemp$1 = this.field_h;
          this.field_h = this.field_h + 1;
          return 255 & this.field_g[fieldTemp$1] + -this.field_p.a(-108);
        }
    }

    final static String a(byte param0, CharSequence param1) {
        StringBuilder discarded$0 = null;
        boolean stackIn_7_0 = false;
        int stackIn_12_0 = 0;
        boolean stackIn_14_0 = false;
        int stackIn_18_0 = 0;
        boolean stackIn_26_0 = false;
        int stackIn_33_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        boolean stackOut_6_0;
        boolean stackOut_13_0;
        boolean stackOut_25_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ci var10 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 != null) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        return null;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2_int = 0;
                        var3 = param1.length();
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var3 <= var2_int) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = uf.a(param1.charAt(var2_int), (byte) -108);
                        stackIn_12_0 = stackOut_6_0 ? 1 : 0;
                        stackIn_7_0 = stackOut_6_0;
                        if (var9 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (!stackIn_7_0) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var2_int++;
                        if (var9 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_12_0 = var2_int ^ -1;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0 <= (var3 ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = uf.a(param1.charAt(var3 - 1), (byte) -56);
                        stackIn_18_0 = stackOut_13_0 ? 1 : 0;
                        stackIn_14_0 = stackOut_13_0;
                        if (var9 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (!stackIn_14_0) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var3--;
                        if (var9 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_18_0 = var3 - var2_int;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var4 = stackIn_18_0;
                        if ((var4 ^ -1) <= -2) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        return null;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if ((var4 ^ -1) >= -13) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        return null;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var5 = new StringBuilder(var4);
                        var6 = var2_int;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var3 <= var6) {
                            statePc = 32;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var7 = param1.charAt(var6);
                        stackOut_25_0 = ci.a((char) var7, 0);
                        stackIn_33_0 = stackOut_25_0 ? 1 : 0;
                        stackIn_26_0 = stackOut_25_0;
                        if (var9 != 0) {
                            statePc = 33;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (stackIn_26_0) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var9 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var8 = jk.a((char) var7, false);
                        if (0 == var8) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        discarded$0 = var5.append((char) var8);
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var6++;
                        if (var9 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_33_0 = param0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (stackIn_33_0 <= -124) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var10 = (ci) null;
                        hj.a((ci) null, (byte) 75, -121, -92);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var5.length() != 0) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        return null;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        return var5.toString();
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 39: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_41_0 = (RuntimeException) (var2);
                    stackIn_40_0 = stackIn_41_0;
                    stackIn_41_1 = new StringBuilder().append("hj.WA(").append(param0).append(',');
                    stackIn_40_1 = stackIn_41_1;
                    if (param1 == null) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    stackIn_42_0 = (RuntimeException) ((Object) stackIn_40_0);
                    stackIn_42_1 = (StringBuilder) ((Object) stackIn_40_1);
                    stackIn_42_2 = "{...}";
                    statePc = 42;
                    continue stateLoop;
                }
                case 41: {
                    stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
                    stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
                    stackIn_42_2 = "null";
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    throw ch.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static ii[] a(ci param0, byte param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        ii[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -62) {
                break L1;
              } else {
                hj.m(-31);
                break L1;
              }
            }
            if (rl.a(param2, 0, param3, param0)) {
              stackIn_6_0 = pd.a((byte) 113);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("hj.SA(");

            if (param0 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ii[]) ((Object) stackIn_4_0);
        } else {
          return stackIn_6_0;
        }
    }

    final void a(byte param0, int[] param1) {
        try {
            int var3_int = 113 % ((-12 - param0) / 36);
            this.field_p = new ug(param1);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "hj.TA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, int param1) {
        int fieldTemp$1 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$1] = (byte)(this.field_p.a(-50) + param1);
        if (!param0) {
          return;
        } else {
          field_o = (String) null;
          return;
        }
    }

    final void n(int param0) {
        if (param0 != 0) {
            return;
        }
        this.field_h = (7 + this.field_n) / 8;
    }

    final int k(int param0, int param1) {
        int incrementValue$0 = 0;
        int statePc = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Transmogrify.field_A ? 1 : 0;
                    var3 = this.field_n >> 1522829539;
                    var4 = -(this.field_n & 7) + 8;
                    this.field_n = this.field_n + param0;
                    var5 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (param0 <= var4) {
                        statePc = 15;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    incrementValue$0 = var3;
                    var3++;
                    var5 = var5 + ((this.field_g[incrementValue$0] & kb.field_m[var4]) << -var4 + param0);
                    param0 = param0 - var4;
                    var4 = 8;
                    if (var6 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var5 = var5 + (kb.field_m[var4] & this.field_g[var3]);
                    if (param1 != 1522829539) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return var5;
                }
                case 5: {
                    this.h((byte) -80);
                    return var5;
                }
                case 7: {
                    if (var6 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (param0 == var4) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var5 = var5 + (this.field_g[var3] >> -param0 + var4 & kb.field_m[param0]);
                    if (var6 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var5 = var5 + (kb.field_m[var4] & this.field_g[var3]);
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (param1 == 1522829539) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    this.h((byte) -80);
                    return var5;
                }
                case 13: {
                    return var5;
                }
                case 15: {
                    if (param0 == var4) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var5 = var5 + (this.field_g[var3] >> -param0 + var4 & kb.field_m[param0]);
                    if (var6 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var5 = var5 + (kb.field_m[var4] & this.field_g[var3]);
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (param1 != 1522829539) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    return var5;
                }
                case 20: {
                    this.h((byte) -80);
                    return var5;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void m(int param0) {
        field_o = null;
        if (param0 == 255) {
            return;
        }
        field_o = (String) null;
    }

    final void h(byte param0) {
        this.field_n = 8 * this.field_h;
        if (param0 >= 53) {
            return;
        }
        this.field_n = 54;
    }

    static {
        field_o = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
