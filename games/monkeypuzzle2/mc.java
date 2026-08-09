/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc implements ml {
    private int field_h;
    private int field_d;
    private int field_c;
    static int field_a;
    private int field_j;
    static int[] field_b;
    static int[][] field_e;
    private int field_k;
    static String field_i;
    private ta field_f;
    private int field_g;

    public final void a(boolean param0, we param1, int param2, int param3, int param4) {
        we stackIn_4_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        we var12 = null;
        qj var13 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!(param1 instanceof qj)) {
                            statePc = 3;
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
                        stackIn_4_0 = (we) (param1);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_4_0 = null;
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
                        var13 = (qj) ((Object) stackIn_4_0);
                        if (param4 >= 19) {
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
                        var12 = (we) null;
                        this.a(false, (we) null, 106, 30, 56);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ge.d(param3 - -param1.field_r, param1.field_e + param2, param1.field_l, param1.field_p, this.field_g);
                        if (var13 == null) {
                            statePc = 7;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var7 = -(2 * var13.field_B) + param1.field_l;
                        var8 = var13.field_B + param1.field_r + param3;
                        var9 = var13.field_F + (param1.field_e + param2);
                        ge.e(var8, var9, var8 - -var7, var9, this.field_k);
                        var10 = -1 + var13.a(true);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((var10 ^ -1) > -1) {
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
                        ge.f(var13.a(false, var10) * var7 / var13.k(-64) + var8, var9, this.field_h, this.field_d);
                        var10--;
                        if (var11 != 0) {
                            statePc = 14;
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
                        if (var11 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
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
                        if (null != this.field_f) {
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
                    try {
                        return;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        this.field_f.a(var13.field_s, var7 / 2 + var8, this.field_f.field_t + (var9 - -var13.field_F), this.field_j, this.field_c);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return;
                }
                case 16: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_18_0 = (RuntimeException) (var6);
                    stackIn_17_0 = stackIn_18_0;
                    stackIn_18_1 = new StringBuilder().append("mc.C(").append(param0).append(',');
                    stackIn_17_1 = stackIn_18_1;
                    if (param1 == null) {
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
                    throw la.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        le var2;
        field_e = (int[][]) null;
        field_b = null;
        if (param0 >= -49) {
          var2 = (le) null;
          mc.a(0, (le) null);
          field_i = null;
          return;
        } else {
          field_i = null;
          return;
        }
    }

    final static void a(int param0, le param1) {
        try {
            if (param0 != -8497) {
                mc.a(100);
            }
            vf.a((byte) 109);
            ge.a(param1.field_s, param1.field_m, param1.field_n);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "mc.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    mc(ta param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            this.field_f = param0;
            this.field_c = param2;
            this.field_d = param6;
            this.field_k = param3;
            this.field_h = param5;
            this.field_g = param4;
            this.field_j = param1;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "mc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_b = new int[11];
        field_i = "You have 1 unread message!";
    }
}
