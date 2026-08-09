/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck implements td {
    private int field_a;
    private int field_i;
    static String[] field_h;
    static qg[] field_n;
    private int field_l;
    static kc field_g;
    static String field_k;
    static int field_f;
    static long field_e;
    private int field_b;
    private int field_o;
    static rf field_j;
    private int field_d;
    static hj[] field_c;
    private kc field_m;

    public final void a(int param0, int param1, pj param2, int param3, boolean param4) {
        pj stackIn_4_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ue var12 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!(param2 instanceof ue)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_4_0 = (pj) (param2);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
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
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var12 = (ue) ((Object) stackIn_4_0);
                        if (var12 != null) {
                            statePc = 5;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ul.h(param2.field_s + param1, param2.field_n + param0, param2.field_m, param2.field_r, this.field_o);
                        var7 = -(var12.field_I * 2) + param2.field_m;
                        var8 = param2.field_s + param1 + var12.field_I;
                        if (param3 == -4394) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        field_j = (rf) null;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var9 = param2.field_n + (param0 - -var12.field_L);
                        ul.b(var8, var9, var7 + var8, var9, this.field_d);
                        var10 = -1 + var12.a((byte) -90);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
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
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ul.f(var8 - -(var7 * var12.a(-1, var10) / var12.j(1)), var9, this.field_b, this.field_a);
                        var10--;
                        if (var11 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
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
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (null == this.field_m) {
                            statePc = 19;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        this.field_m.c(var12.field_l, var7 / 2 + var8, var12.field_L + this.field_m.field_z + var9, this.field_l, this.field_i);
                        return;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_17_0 = (RuntimeException) (var6);
                    stackIn_16_0 = stackIn_17_0;
                    stackIn_17_1 = new StringBuilder().append("ck.A(").append(param0).append(',').append(param1).append(',');
                    stackIn_16_1 = stackIn_17_1;
                    if (param2 == null) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_18_2 = "{...}";
                    statePc = 18;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_18_2 = "null";
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    throw dd.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param3 + ',' + param4 + ')');
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_j = null;
        field_n = null;
        if (param0 != 22499) {
          field_j = (rf) null;
          field_k = null;
          field_h = null;
          field_c = null;
          return;
        } else {
          field_k = null;
          field_h = null;
          field_c = null;
          return;
        }
    }

    ck(kc param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            this.field_i = param2;
            this.field_o = param4;
            this.field_l = param1;
            this.field_d = param3;
            this.field_a = param6;
            this.field_m = param0;
            this.field_b = param5;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "ck.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_f = 256;
        field_k = ",";
    }
}
