/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jo {
    private kv field_l;
    int field_d;
    pn field_k;
    private kv field_c;
    private kv field_E;
    private kv field_g;
    bq[][] field_j;
    private kv field_x;
    private kv field_n;
    private kv field_C;
    int field_s;
    private int[][] field_G;
    int field_B;
    private kv field_u;
    private kv field_H;
    gj field_i;
    private kv field_o;
    int field_r;
    wia[][] field_I;
    int field_a;
    int field_z;
    int field_h;
    private kv field_f;
    kv field_p;
    int field_q;
    static int field_t;
    int field_F;
    private kv field_A;
    kv field_y;
    int field_b;
    private ad[] field_e;
    private kv field_m;
    private int[] field_v;
    private kv[] field_w;

    private final void b(aj param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        param0.a(-1, 64 * (param3 - param1) + ((jo) this).field_b, ((jo) this).field_B - -((param1 + param3) * 32));
                        if (param2 == -3613) {
                            statePc = 9;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        this.b(11, 13);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        stackOut_4_0 = (RuntimeException) runtimeException;
                        stackOut_4_1 = new StringBuilder().append("jo.P(");
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        if (param0 == null) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                        stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                        stackOut_5_2 = "{...}";
                        stackIn_8_0 = stackOut_5_0;
                        stackIn_8_1 = stackOut_5_1;
                        stackIn_8_2 = stackOut_5_2;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 7: {
                    stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                    stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                    stackOut_7_2 = "null";
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    throw pe.a((Throwable) (Object) stackIn_8_0, (String) (Object) (stackIn_8_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41));
                }
                case 9: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, aj param1, ad param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param2 == null) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        this.a(param1, (param2.field_s.field_J << 451480816) + param2.field_r, param2.field_o + (param2.field_s.field_x << 802962640), -58);
                        if (param0 <= -109) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return;
                }
                case 5: {
                    try {
                        param1.field_a = param1.field_a - param2.field_k;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    try {
                        stackOut_8_0 = (RuntimeException) runtimeException;
                        stackOut_8_1 = new StringBuilder().append("jo.G(").append(param0).append(44);
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (param1 == null) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                        stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                        stackOut_9_2 = "{...}";
                        stackIn_12_0 = stackOut_9_0;
                        stackIn_12_1 = stackOut_9_1;
                        stackIn_12_2 = stackOut_9_2;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 11: {
                    stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                    stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                    stackOut_11_2 = "null";
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    try {
                        stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                        stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
                        stackIn_15_0 = stackOut_12_0;
                        stackIn_15_1 = stackOut_12_1;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        if (param2 == null) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                        stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                        stackOut_13_2 = "{...}";
                        stackIn_16_0 = stackOut_13_0;
                        stackIn_16_1 = stackOut_13_1;
                        stackIn_16_2 = stackOut_13_2;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 15: {
                    stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                    stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                    stackOut_15_2 = "null";
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    stackIn_16_2 = stackOut_15_2;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    throw pe.a((Throwable) (Object) stackIn_16_0, (String) (Object) (stackIn_16_2 + 41));
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(int param0, aj param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] stackIn_2_0 = null;
        int[] stackIn_4_0 = null;
        int[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int[] stackOut_1_0 = null;
        int[] stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int[] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        ((jo) this).field_u.a(param1.field_c + 1, 1 + param1.field_a, 64);
                        var3_int = ((jo) this).field_i.field_L >> -2041137534;
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = ((jo) this).field_v;
                        stackIn_4_0 = stackOut_1_0;
                        stackIn_2_0 = stackOut_1_0;
                        if ((((jo) this).field_i.field_L % 128 ^ -1) <= -65) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = (int[]) (Object) stackIn_2_0;
                        stackOut_2_1 = ((jo) this).field_i.field_L % 128;
                        stackIn_5_0 = stackOut_2_0;
                        stackIn_5_1 = stackOut_2_1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = (int[]) (Object) stackIn_4_0;
                        stackOut_4_1 = 127 - ((jo) this).field_i.field_L % 128;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var4 = stackIn_5_0[stackIn_5_1];
                        var5 = 255;
                        var3_int = lw.a(5, param1.field_c + 64, var4, -1 + param1.field_a, 128 + param1.field_c, 12175, var3_int, param1.field_a + 32, var5);
                        var3_int = lw.a(5, 128 + param1.field_c, var4, 32 + param1.field_a, param1.field_c - -64, 12175, var3_int, param1.field_a - -64, var5);
                        var3_int = lw.a(5, 64 + param1.field_c, var4, param1.field_a - -64, param1.field_c, 12175, var3_int, param1.field_a - -32, var5);
                        var3_int = lw.a(5, param1.field_c, var4, param1.field_a + 32, param1.field_c + 64, 12175, var3_int, param1.field_a, var5);
                        var3_int = lw.a(5, 64 + param1.field_c, var4, 1 + (-1 + param1.field_a), -1 + param1.field_c + 128, param0 + -13268, var3_int, param1.field_a - -32, var5);
                        var3_int += 2;
                        var3_int = lw.a(5, -1 + (param1.field_c + 128), var4, param1.field_a + 32, param1.field_c + 64, 12175, var3_int, -1 + param1.field_a + 64, var5);
                        var3_int = lw.a(5, 64 + param1.field_c, var4, 64 + (param1.field_a - 1), 1 + param1.field_c, param0 ^ 19692, var3_int, param1.field_a + 32, var5);
                        var3_int += 2;
                        var3_int = lw.a(5, param1.field_c + 1, var4, param1.field_a + 32, 64 + param1.field_c, 12175, var3_int, 1 + param1.field_a, var5);
                        var3_int = lw.a(5, 64 + param1.field_c, var4, -1 + param1.field_a + 2, -2 + (128 + param1.field_c), param0 ^ 19692, var3_int, 32 + param1.field_a, var5);
                        var3_int += 4;
                        var3_int = lw.a(5, 128 + param1.field_c - 2, var4, param1.field_a + 32, 64 + param1.field_c, 12175, var3_int, param1.field_a - -62, var5);
                        if (param0 == 25443) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return;
                }
                case 7: {
                    try {
                        var3_int = lw.a(5, param1.field_c + 64, var4, -2 + (64 + param1.field_a), param1.field_c + 2, 12175, var3_int, 32 + param1.field_a, var5);
                        var3_int += 4;
                        var3_int = lw.a(5, param1.field_c + 2, var4, 32 + param1.field_a, 64 + param1.field_c, 12175, var3_int, 2 + param1.field_a, var5);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    try {
                        stackOut_10_0 = (RuntimeException) var3;
                        stackOut_10_1 = new StringBuilder().append("jo.K(").append(param0).append(44);
                        stackIn_13_0 = stackOut_10_0;
                        stackIn_13_1 = stackOut_10_1;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        if (param1 == null) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                        stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                        stackOut_11_2 = "{...}";
                        stackIn_14_0 = stackOut_11_0;
                        stackIn_14_1 = stackOut_11_1;
                        stackIn_14_2 = stackOut_11_2;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 13: {
                    stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                    stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                    stackOut_13_2 = "null";
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    stackIn_14_2 = stackOut_13_2;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    throw pe.a((Throwable) (Object) stackIn_14_0, (String) (Object) (stackIn_14_2 + 41));
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final aj a(byte param0, ad param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        aj stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        Object stackOut_1_0 = null;
        aj stackOut_3_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 > 77) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = null;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return (aj) (Object) stackIn_2_0;
                }
                case 3: {
                    try {
                        this.a(-114, dp.field_l, param1);
                        stackOut_3_0 = dp.field_l;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return (aj) (Object) stackIn_4_0;
                }
                case 5: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    try {
                        stackOut_6_0 = (RuntimeException) var3;
                        stackOut_6_1 = new StringBuilder().append("jo.L(").append(param0).append(44);
                        stackIn_9_0 = stackOut_6_0;
                        stackIn_9_1 = stackOut_6_1;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        if (param1 == null) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                        stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                        stackOut_7_2 = "{...}";
                        stackIn_10_0 = stackOut_7_0;
                        stackIn_10_1 = stackOut_7_1;
                        stackIn_10_2 = stackOut_7_2;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 9: {
                    stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                    stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                    stackOut_9_2 = "null";
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    stackIn_10_2 = stackOut_9_2;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    throw pe.a((Throwable) (Object) stackIn_10_0, (String) (Object) (stackIn_10_2 + 41));
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int[][] var7 = null;
        int var8 = 0;
        int[] var9 = null;
        int var10 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((jo) this).field_I[param2][param4].field_n == 20) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var6_int = -1;
                        var7 = ((jo) this).field_i.field_h.field_i;
                        var8 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var8 >= var7.length) {
                            statePc = 16;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var9 = var7[var8];
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = var9[0] ^ -1;
                        stackOut_7_1 = param2 ^ -1;
                        stackIn_17_0 = stackOut_7_0;
                        stackIn_17_1 = stackOut_7_1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        if (var10 != 0) {
                            statePc = 17;
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
                        if (stackIn_8_0 != stackIn_8_1) {
                            statePc = 15;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var9[1] != param4) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var6_int = var9[2];
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var8++;
                        if (var10 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = -1;
                        stackOut_16_1 = var6_int;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (stackIn_17_0 == stackIn_17_1) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ((jo) this).field_p.e(param1, param3, ((jo) this).field_i.c(var6_int, 2271));
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (param0 == -1) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        ((jo) this).field_p = null;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        int discarded$2 = ((jo) this).field_i.a(-18254, param4, param2);
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 27: {
                    var6 = (RuntimeException) (Object) caughtException;
                    throw pe.a((Throwable) (Object) var6, "jo.C(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
                }
                case 28: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        aj var8_ref = null;
        int[][] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[][] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_50_0 = 0;
        Object stackIn_54_0 = null;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_49_0 = 0;
        Object stackOut_53_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        param3--;
                        var9 = haa.b(1, param2, param0);
                        var10 = 17;
                        var11 = 17;
                        var12 = var10 - 1 >> 1815948193;
                        var13 = -1 + var11 >> -546677471;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param1) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((jo) this).field_r = 120;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var14 = new int[var10][var11];
                        var15 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = var10 ^ -1;
                        stackOut_7_1 = var15 ^ -1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0 >= stackIn_8_1) {
                            statePc = 18;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = 0;
                        stackIn_19_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var19 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var16 = stackIn_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var11 <= var16) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = var9[var15][var16] ^ -1;
                        stackOut_12_1 = -2;
                        stackIn_8_0 = stackOut_12_0;
                        stackIn_8_1 = stackOut_12_1;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        if (var19 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0 == stackIn_13_1) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var14[var15][var16] = 1;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var16++;
                        if (var19 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var15++;
                        if (var19 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var15 = stackIn_19_0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = var15;
                        stackOut_20_1 = var10;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (stackIn_21_0 >= stackIn_21_1) {
                            statePc = 65;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var19 != 0) {
                            statePc = 65;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var16 = 0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var11 <= var16) {
                            statePc = 62;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = var14[var15][var16] ^ -1;
                        stackOut_25_1 = -1;
                        stackIn_21_0 = stackOut_25_0;
                        stackIn_21_1 = stackOut_25_1;
                        stackIn_26_0 = stackOut_25_0;
                        stackIn_26_1 = stackOut_25_1;
                        if (var19 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (stackIn_26_0 != stackIn_26_1) {
                            statePc = 30;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var19 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var17 = param4 + var15 + -var12;
                        var18 = var16 + -var13 + param5;
                        if ((param0 ^ -1) != -2) {
                            statePc = 33;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var18 = var18 - param3;
                        stackOut_31_0 = var19;
                        stackIn_32_0 = stackOut_31_0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (stackIn_32_0 == 0) {
                            statePc = 48;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (param0 != 3) {
                            statePc = 38;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var18 = var18 + param3;
                        stackOut_36_0 = var19;
                        stackIn_37_0 = stackOut_36_0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (stackIn_37_0 == 0) {
                            statePc = 48;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (-5 == (param0 ^ -1)) {
                            statePc = 47;
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
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (param0 == 2) {
                            statePc = 46;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var17 = var17 - param3;
                        if (var19 == 0) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var17 = var17 + param3;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (-1 < (var17 ^ -1)) {
                            statePc = 61;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackOut_49_0 = -1;
                        stackIn_50_0 = stackOut_49_0;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (stackIn_50_0 < (var18 ^ -1)) {
                            statePc = 61;
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
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackOut_53_0 = this;
                        stackIn_54_0 = stackOut_53_0;
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
                        if (((jo) this).field_a <= var17) {
                            statePc = 61;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var18 >= ((jo) this).field_z) {
                            statePc = 61;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var8_ref = ((jo) this).a(var18, (byte) -108, var17);
                        ((jo) this).field_g.a(1 + var8_ref.field_c, 1 + var8_ref.field_a, 128 + -(param6 * 20));
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var16++;
                        if (var19 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var15++;
                        if (var19 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 64: {
                    var8 = (RuntimeException) (Object) caughtException;
                    throw pe.a((Throwable) (Object) var8, "jo.I(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
                }
                case 65: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, int param1, boolean param2, sfa param3) {
        RuntimeException var5 = null;
        aj var5_ref = null;
        hia var6 = null;
        aga var7 = null;
        int var8 = 0;
        int var9_int = 0;
        int[][] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14_int = 0;
        int[][] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_71_0 = 0;
        Object stackIn_75_0 = null;
        int stackIn_79_0 = 0;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        String stackIn_94_2 = null;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_70_0 = 0;
        Object stackOut_74_0 = null;
        int stackOut_78_0 = 0;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        RuntimeException stackOut_91_0 = null;
        StringBuilder stackOut_91_1 = null;
        String stackOut_91_2 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        String stackOut_93_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == -64) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.a((byte) 70);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (!(param3 instanceof hia)) {
                            statePc = 95;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var6 = (hia) (Object) param3;
                        var7 = ((jo) this).field_i.field_G[var6.field_h.field_f].field_s;
                        oha discarded$1 = al.a(param0 + -60, var6.field_g);
                        var5_ref = new aj(((jo) this).a(var7.field_J, (byte) -96, var7.field_x));
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param2) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var8 = (5 + -param1) * 4;
                        var9_int = -44;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (-45 >= (var9_int ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var10 = (int)Math.sqrt((double)(1936 - var9_int * var9_int));
                        var11 = var10 / 2;
                        var12 = var10 * var8 / 44;
                        var13 = var9_int + 64 + var5_ref.field_c;
                        var14_int = 32 + var5_ref.field_a;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        dg.d(var13, 0, var14_int + -var11, 65793 * var12);
                        stackOut_13_0 = 0;
                        stackOut_13_1 = var11;
                        stackIn_27_0 = stackOut_13_0;
                        stackIn_27_1 = stackOut_13_1;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        if (var19 != 0) {
                            statePc = 27;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (stackIn_14_0 != stackIn_14_1) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var15 = -var11;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var15 > var11) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        dg.h(var13, var14_int - -var15, var12 * 131329, (var11 + -var15 << 1954612584) / (2 * var11));
                        var15++;
                        if (var19 != 0) {
                            statePc = 25;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var19 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var9_int++;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var19 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackOut_26_0 = param0 ^ -63;
                        stackOut_26_1 = var7.d(125, var6.field_g);
                        stackIn_27_0 = stackOut_26_0;
                        stackIn_27_1 = stackOut_26_1;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var9 = haa.b(stackIn_27_0, stackIn_27_1, var6.field_j);
                        var10 = 17;
                        var11 = 17;
                        var12 = -1 + var10 >> -770519647;
                        var13 = -1 + var11 >> -1000453759;
                        var14 = new int[var10][var11];
                        var15 = 0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackOut_28_0 = var15 ^ -1;
                        stackOut_28_1 = var10 ^ -1;
                        stackIn_29_0 = stackOut_28_0;
                        stackIn_29_1 = stackOut_28_1;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (stackIn_29_0 <= stackIn_29_1) {
                            statePc = 40;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = 0;
                        stackIn_41_0 = stackOut_30_0;
                        stackIn_31_0 = stackOut_30_0;
                        if (var19 != 0) {
                            statePc = 41;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var16 = stackIn_31_0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var16 >= var11) {
                            statePc = 39;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackOut_33_0 = 1;
                        stackOut_33_1 = var9[var15][var16];
                        stackIn_29_0 = stackOut_33_0;
                        stackIn_29_1 = stackOut_33_1;
                        stackIn_34_0 = stackOut_33_0;
                        stackIn_34_1 = stackOut_33_1;
                        if (var19 != 0) {
                            statePc = 29;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (stackIn_34_0 != stackIn_34_1) {
                            statePc = 38;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var14[var15][var16] = 1;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var16++;
                        if (var19 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var15++;
                        if (var19 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackOut_40_0 = 0;
                        stackIn_41_0 = stackOut_40_0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var15 = stackIn_41_0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackOut_42_0 = var15;
                        stackIn_43_0 = stackOut_42_0;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (stackIn_43_0 >= var10) {
                            statePc = 95;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var19 != 0) {
                            statePc = 95;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var16 = 0;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var11 <= var16) {
                            statePc = 87;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackOut_47_0 = var14[var15][var16];
                        stackIn_43_0 = stackOut_47_0;
                        stackIn_48_0 = stackOut_47_0;
                        if (var19 != 0) {
                            statePc = 43;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (stackIn_48_0 != 0) {
                            statePc = 52;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var19 == 0) {
                            statePc = 86;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var17 = var7.field_x + -var12 + var15;
                        var18 = var7.field_J - var13 - -var16;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (-2 == (var6.field_j ^ -1)) {
                            statePc = 68;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (-4 == (var6.field_j ^ -1)) {
                            statePc = 67;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (4 == var6.field_j) {
                            statePc = 66;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (-3 == (var6.field_j ^ -1)) {
                            statePc = 65;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var17 = var17 - var6.field_k;
                        if (var19 == 0) {
                            statePc = 69;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var17 = var17 + var6.field_k;
                        if (var19 == 0) {
                            statePc = 69;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var18 = var18 + var6.field_k;
                        if (var19 == 0) {
                            statePc = 69;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var18 = var18 - var6.field_k;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (0 > var17) {
                            statePc = 86;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        stackOut_70_0 = -1;
                        stackIn_71_0 = stackOut_70_0;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (stackIn_71_0 < (var18 ^ -1)) {
                            statePc = 86;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        stackOut_74_0 = this;
                        stackIn_75_0 = stackOut_74_0;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if ((((jo) this).field_a ^ -1) >= (var17 ^ -1)) {
                            statePc = 86;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        stackOut_78_0 = var18;
                        stackIn_79_0 = stackOut_78_0;
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (stackIn_79_0 < ((jo) this).field_z) {
                            statePc = 85;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (var19 == 0) {
                            statePc = 86;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var5_ref = ((jo) this).a(var18, (byte) 106, var17);
                        ((jo) this).field_g.a(var5_ref.field_c, var5_ref.field_a, -(param1 * 10) + 64);
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        var16++;
                        if (var19 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        var15++;
                        if (var19 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 89: {
                    var5 = (RuntimeException) (Object) caughtException;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    try {
                        stackOut_90_0 = (RuntimeException) var5;
                        stackOut_90_1 = new StringBuilder().append("jo.NA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
                        stackIn_93_0 = stackOut_90_0;
                        stackIn_93_1 = stackOut_90_1;
                        stackIn_91_0 = stackOut_90_0;
                        stackIn_91_1 = stackOut_90_1;
                        if (param3 == null) {
                            statePc = 93;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        stackOut_91_0 = (RuntimeException) (Object) stackIn_91_0;
                        stackOut_91_1 = (StringBuilder) (Object) stackIn_91_1;
                        stackOut_91_2 = "{...}";
                        stackIn_94_0 = stackOut_91_0;
                        stackIn_94_1 = stackOut_91_1;
                        stackIn_94_2 = stackOut_91_2;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 92: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 93: {
                    stackOut_93_0 = (RuntimeException) (Object) stackIn_93_0;
                    stackOut_93_1 = (StringBuilder) (Object) stackIn_93_1;
                    stackOut_93_2 = "null";
                    stackIn_94_0 = stackOut_93_0;
                    stackIn_94_1 = stackOut_93_1;
                    stackIn_94_2 = stackOut_93_2;
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    throw pe.a((Throwable) (Object) stackIn_94_0, (String) (Object) (stackIn_94_2 + 41));
                }
                case 95: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(aj param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = -1;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param1 == 1) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        this.c((byte) 26);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (1 <= var3_int) {
                            statePc = 23;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var5 != 0) {
                            statePc = 23;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var4 = -1;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var4 >= 2) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        to.field_b.c(sg.a(to.field_b.field_q, param1 ^ 1816304478, ((jo) this).field_b) - -(var3_int * to.field_b.field_q), sg.a(to.field_b.field_p, 1816304479, ((jo) this).field_B) + var4 * to.field_b.field_p);
                        var4++;
                        if (var5 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var5 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var3_int++;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var5 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    try {
                        stackOut_18_0 = (RuntimeException) runtimeException;
                        stackOut_18_1 = new StringBuilder().append("jo.N(");
                        stackIn_21_0 = stackOut_18_0;
                        stackIn_21_1 = stackOut_18_1;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        if (param0 == null) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                        stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                        stackOut_19_2 = "{...}";
                        stackIn_22_0 = stackOut_19_0;
                        stackIn_22_1 = stackOut_19_1;
                        stackIn_22_2 = stackOut_19_2;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 21: {
                    stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                    stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                    stackOut_21_2 = "null";
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    stackIn_22_2 = stackOut_21_2;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    throw pe.a((Throwable) (Object) stackIn_22_0, (String) (Object) (stackIn_22_2 + 44 + param1 + 41));
                }
                case 23: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        Object stackIn_22_0 = null;
        Object stackIn_26_0 = null;
        int stackIn_34_0 = 0;
        Object stackIn_38_0 = null;
        int stackIn_46_0 = 0;
        Object stackIn_50_0 = null;
        int stackIn_58_0 = 0;
        Object stackIn_62_0 = null;
        int stackIn_78_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        Object stackOut_21_0 = null;
        Object stackOut_25_0 = null;
        int stackOut_33_0 = 0;
        Object stackOut_37_0 = null;
        int stackOut_45_0 = 0;
        Object stackOut_49_0 = null;
        int stackOut_57_0 = 0;
        Object stackOut_61_0 = null;
        boolean stackOut_77_0 = false;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (2 + ((jo) this).field_a <= var2_int) {
                            statePc = 12;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = 0;
                        stackIn_13_0 = stackOut_3_0;
                        stackIn_4_0 = stackOut_3_0;
                        if (var5 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var3 = stackIn_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var3 >= ((jo) this).field_z - -2) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ((jo) this).field_j[var2_int][var3].field_n = 0;
                        var3++;
                        if (var5 != 0) {
                            statePc = 11;
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
                        if (var5 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var2_int++;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var5 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var2_int = stackIn_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = ((jo) this).field_a + 1 ^ -1;
                        stackOut_14_1 = var2_int ^ -1;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (stackIn_15_0 >= stackIn_15_1) {
                            statePc = 77;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = 0;
                        stackIn_78_0 = stackOut_16_0;
                        stackIn_17_0 = stackOut_16_0;
                        if (var5 != 0) {
                            statePc = 78;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var3 = stackIn_17_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if ((((jo) this).field_z + 1 ^ -1) >= (var3 ^ -1)) {
                            statePc = 76;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var4 = 0;
                        stackOut_19_0 = var2_int;
                        stackOut_19_1 = ((jo) this).field_a;
                        stackIn_15_0 = stackOut_19_0;
                        stackIn_15_1 = stackOut_19_1;
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        if (var5 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (stackIn_20_0 >= stackIn_20_1) {
                            statePc = 32;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = this;
                        stackIn_22_0 = stackOut_21_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if ((((jo) this).field_z ^ -1) >= (var3 ^ -1)) {
                            statePc = 32;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = this;
                        stackIn_26_0 = stackOut_25_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (!((jo) this).field_I[var2_int][var3].field_i) {
                            statePc = 32;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var4 += 4;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if ((((jo) this).field_z ^ -1) >= (var3 ^ -1)) {
                            statePc = 44;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackOut_33_0 = var2_int;
                        stackIn_34_0 = stackOut_33_0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (stackIn_34_0 <= 0) {
                            statePc = 44;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackOut_37_0 = this;
                        stackIn_38_0 = stackOut_37_0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (!((jo) this).field_I[-1 + var2_int][var3].field_i) {
                            statePc = 44;
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
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var4 += 8;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if ((var2_int ^ -1) >= -1) {
                            statePc = 56;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackOut_45_0 = var3;
                        stackIn_46_0 = stackOut_45_0;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (stackIn_46_0 <= 0) {
                            statePc = 56;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackOut_49_0 = this;
                        stackIn_50_0 = stackOut_49_0;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (((jo) this).field_I[-1 + var2_int][-1 + var3].field_i) {
                            statePc = 55;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var4++;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (((jo) this).field_a <= var2_int) {
                            statePc = 68;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        stackOut_57_0 = var3;
                        stackIn_58_0 = stackOut_57_0;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if ((stackIn_58_0 ^ -1) >= -1) {
                            statePc = 68;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        stackOut_61_0 = this;
                        stackIn_62_0 = stackOut_61_0;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (!((jo) this).field_I[var2_int][-1 + var3].field_i) {
                            statePc = 68;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var4 += 2;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (-1 > (var4 ^ -1)) {
                            statePc = 71;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        ((jo) this).field_j[var2_int][var3].field_n = 1;
                        ((jo) this).field_j[var2_int][var3].field_k = var4;
                        if ((var3 + var2_int) % 2 == 1) {
                            statePc = 74;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        ((jo) this).field_j[var2_int][var3].field_o = true;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var3++;
                        if (var5 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var2_int++;
                        if (var5 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        stackOut_77_0 = param0;
                        stackIn_78_0 = stackOut_77_0 ? 1 : 0;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (stackIn_78_0 == 1) {
                            statePc = 84;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        this.a(false, (aj) null, 63);
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 83: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw pe.a((Throwable) (Object) var2, "jo.F(" + param0 + 41);
                }
                case 84: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, byte param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        aj var7_ref = null;
        int var8 = 0;
        aj var9 = null;
        int var10 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        param0 = param0 * (160 - -(via.a(vr.field_b << -385802425, (byte) 58) >> -1239578613));
                        param0 = param0 >> 8;
                        var7_int = param3;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var7_int >= param2) {
                            statePc = 12;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var8 = param1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var8 >= param4) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var9 = ((jo) this).a(var8, (byte) -119, var7_int);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ((jo) this).field_A.d(var9.field_c, var9.field_a, param0);
                        var8++;
                        if (var10 != 0) {
                            statePc = 11;
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
                        if (var10 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var7_int++;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var10 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var7_ref = ((jo) this).a(param4, (byte) -102, param2);
                        ((jo) this).field_E.d(2 + var7_ref.field_c, var7_ref.field_a, param0);
                        ((jo) this).field_E.c();
                        var7_ref = ((jo) this).a(param1 - 1, (byte) -117, -1 + param3);
                        ((jo) this).field_E.d(2 + var7_ref.field_c, var7_ref.field_a, param0);
                        ((jo) this).field_E.c();
                        var7_ref = ((jo) this).a(param4, (byte) -128, -1 + param3);
                        ((jo) this).field_l.d(var7_ref.field_c - -2, var7_ref.field_a, param0);
                        ((jo) this).field_l.e();
                        var7_ref = ((jo) this).a(param1 - 1, (byte) -111, param2);
                        ((jo) this).field_l.d(var7_ref.field_c, var7_ref.field_a, param0);
                        ((jo) this).field_l.e();
                        var8 = param1;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if ((param4 ^ -1) >= (var8 ^ -1)) {
                            statePc = 19;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var7_ref = ((jo) this).a(var8, (byte) -122, param2);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ((jo) this).field_H.d(var7_ref.field_c, -1 + var7_ref.field_a, param0);
                        var8++;
                        if (var10 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var10 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ((jo) this).field_H.e();
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var8 = param3;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if ((var8 ^ -1) <= (param2 ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var7_ref = ((jo) this).a(param4, (byte) 106, var8);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        ((jo) this).field_H.d(var7_ref.field_c, var7_ref.field_a, param0);
                        var8++;
                        if (var10 != 0) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var10 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        ((jo) this).field_H.c();
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (param5 == -106) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 29: {
                    return;
                }
                case 30: {
                    try {
                        var8 = param1;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (param4 <= var8) {
                            statePc = 37;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var7_ref = ((jo) this).a(var8, (byte) -101, -1 + param3);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        ((jo) this).field_H.d(var7_ref.field_c, var7_ref.field_a, param0);
                        var8++;
                        if (var10 != 0) {
                            statePc = 38;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var10 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        ((jo) this).field_H.e();
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var8 = param3;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if ((var8 ^ -1) <= (param2 ^ -1)) {
                            statePc = 45;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var7_ref = ((jo) this).a(-1 + param1, (byte) 62, var8);
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        ((jo) this).field_H.d(var7_ref.field_c, 1 + var7_ref.field_a, param0);
                        var8++;
                        if (var10 != 0) {
                            statePc = 48;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var10 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        ((jo) this).field_H.c();
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 47: {
                    var7 = (RuntimeException) (Object) caughtException;
                    throw pe.a((Throwable) (Object) var7, "jo.D(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
                }
                case 48: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(int param0, byte param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        aj var5 = null;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        int[][] var10 = null;
        int var11 = 0;
        int[] var12 = null;
        int var13 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        byte stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = -1;
                        var5 = ((jo) this).a(param2, (byte) 115, param0);
                        var6 = 1.5707963267948966 + 0.5 * ((double)((param2 * param0 << -269799614) + ((jo) this).field_i.field_L) / 80.0);
                        var8 = (int)(Math.sin(0.5 * ((double)(((jo) this).field_i.field_L + (param0 * param2 << 1218051234)) / 80.0)) * 32.0);
                        var9 = (int)(Math.cos(0.5 * ((double)(((jo) this).field_i.field_L + (param0 * param2 << 330530)) / 80.0)) * 15.0);
                        var10 = ((jo) this).field_i.field_h.field_i;
                        var11 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var11 ^ -1) <= (var10.length ^ -1)) {
                            statePc = 13;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var12 = var10[var11];
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = param0;
                        stackOut_4_1 = var12[0];
                        stackIn_14_0 = stackOut_4_0;
                        stackIn_14_1 = stackOut_4_1;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        if (var13 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (stackIn_5_0 != stackIn_5_1) {
                            statePc = 12;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((var12[1] ^ -1) != (param2 ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var4_int = var12[2];
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var11++;
                        if (var13 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = param1;
                        stackOut_13_1 = 80;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (stackIn_14_0 == stackIn_14_1) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        this.a(-31, (aj) null, (ad) null);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (-1 != var4_int) {
                            statePc = 52;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (-1 < (var9 ^ -1)) {
                            statePc = 37;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var6 % 3.141592653589793 <= 2.0943951023931953) {
                            statePc = 28;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        ik.field_h[(((jo) this).field_i.field_L >> 35288003) % 5 - -5].a(64 + (var5.field_c + -18 - -var8), var9 + (var5.field_a - -32 + -18));
                        if (var13 == 0) {
                            statePc = 87;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (1.0471975511965976 >= var6 % 3.141592653589793) {
                            statePc = 34;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        ik.field_h[(((jo) this).field_i.field_L >> 2105833059) % 5].a(var8 + -18 + (64 + var5.field_c), var9 + var5.field_a + 32 + -18);
                        if (var13 == 0) {
                            statePc = 87;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        ik.field_h[(((jo) this).field_i.field_L >> 1347896675) % 5 - -10].a(var8 + 64 + var5.field_c - 18, var9 + (var5.field_a + 14));
                        if (var13 == 0) {
                            statePc = 87;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var6 % 3.141592653589793 > 2.0943951023931953) {
                            statePc = 49;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var6 % 3.141592653589793 <= 1.0471975511965976) {
                            statePc = 46;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        hha.field_y[(((jo) this).field_i.field_L >> -1861804509) % 5].a(var8 + (var5.field_c + 64) + -18, var5.field_a + 14 - -var9);
                        if (var13 == 0) {
                            statePc = 87;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        hha.field_y[5 + (((jo) this).field_i.field_L >> 1150232387) % 5].a(-18 + var5.field_c + 64 + var8, var5.field_a + 14 - -var9);
                        if (var13 == 0) {
                            statePc = 87;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        hha.field_y[10 + (((jo) this).field_i.field_L >> -426412413) % 5].a(-18 + (var5.field_c + 64 - -var8), var9 + -18 + (32 + var5.field_a));
                        if (var13 == 0) {
                            statePc = 87;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        ((jo) this).field_o.e(var5.field_c, var5.field_a, ((jo) this).field_i.c(var4_int, 2271));
                        if (var9 < 0) {
                            statePc = 70;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (2.0943951023931953 >= var6 % 3.141592653589793) {
                            statePc = 61;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        ik.field_h[(((jo) this).field_i.field_L >> 540756323) % 5 - -5].b(var8 + 64 + var5.field_c + -18, var9 + (-18 + (32 + var5.field_a)), ((jo) this).field_i.c(var4_int, 2271));
                        if (var13 == 0) {
                            statePc = 87;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (1.0471975511965976 < var6 % 3.141592653589793) {
                            statePc = 67;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        ik.field_h[(((jo) this).field_i.field_L >> 275930179) % 5 - -10].b(var5.field_c - -64 + (-18 - -var8), 32 + var5.field_a + (-18 + var9), ((jo) this).field_i.c(var4_int, 2271));
                        if (var13 == 0) {
                            statePc = 87;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        ik.field_h[(((jo) this).field_i.field_L >> -458035805) % 5].b(-18 + (var5.field_c + (64 - -var8)), var9 + (var5.field_a + 14), ((jo) this).field_i.c(var4_int, 2271));
                        if (var13 == 0) {
                            statePc = 87;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (var6 % 3.141592653589793 > 2.0943951023931953) {
                            statePc = 82;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (1.0471975511965976 >= var6 % 3.141592653589793) {
                            statePc = 79;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        hha.field_y[(((jo) this).field_i.field_L >> 812543075) % 5].b(var8 + -18 + (var5.field_c + 64), var9 + (-18 + (32 + var5.field_a)), ((jo) this).field_i.c(var4_int, param1 ^ 2191));
                        if (var13 == 0) {
                            statePc = 87;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        hha.field_y[5 + (((jo) this).field_i.field_L >> 872535587) % 5].b(var8 + 46 + var5.field_c, var9 + var5.field_a - -14, ((jo) this).field_i.c(var4_int, 2271));
                        if (var13 == 0) {
                            statePc = 87;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        hha.field_y[(((jo) this).field_i.field_L >> 889813443) % 5 - -10].b(var5.field_c + 64 - (18 + -var8), -18 + var5.field_a - -32 + var9, ((jo) this).field_i.c(var4_int, 2271));
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 86: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw pe.a((Throwable) (Object) var4, "jo.LA(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                case 87: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(byte param0, aj param1) {
        RuntimeException var3 = null;
        ad[] var3_array = null;
        int var4 = 0;
        ad var5 = null;
        aga var6 = null;
        int var7_int = 0;
        vca var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        double var12 = 0.0;
        double var14_double = 0.0;
        int var14 = 0;
        int var16 = 0;
        ad stackIn_12_0 = null;
        ad stackIn_75_0 = null;
        int stackIn_83_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        rs[] stackIn_94_0 = null;
        int stackIn_140_0 = 0;
        RuntimeException stackIn_149_0 = null;
        StringBuilder stackIn_149_1 = null;
        RuntimeException stackIn_151_0 = null;
        StringBuilder stackIn_151_1 = null;
        RuntimeException stackIn_152_0 = null;
        StringBuilder stackIn_152_1 = null;
        String stackIn_152_2 = null;
        ad stackOut_11_0 = null;
        ad stackOut_74_0 = null;
        int stackOut_82_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_83_1 = 0;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        rs[] stackOut_93_0 = null;
        int stackOut_139_0 = 0;
        RuntimeException stackOut_148_0 = null;
        StringBuilder stackOut_148_1 = null;
        RuntimeException stackOut_149_0 = null;
        StringBuilder stackOut_149_1 = null;
        String stackOut_149_2 = null;
        RuntimeException stackOut_151_0 = null;
        StringBuilder stackOut_151_1 = null;
        String stackOut_151_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 < -93) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if (((jo) this).field_i.field_P != null) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        param1 = ((jo) this).a(((jo) this).field_i.field_P.field_s.field_J, (byte) 49, ((jo) this).field_i.field_P.field_s.field_x);
                        this.b(25443, param1);
                        ((jo) this).field_n.e(param1.field_c - -2, param1.field_a - 40 - 12, 32 + ((jo) this).field_n.field_q, 32 + ((jo) this).field_n.field_p, 192);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var3_array = ((jo) this).field_e;
                        var4 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((var4 ^ -1) <= (var3_array.length ^ -1)) {
                            statePc = 153;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var5 = var3_array[var4];
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var16 != 0) {
                            statePc = 153;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = (ad) var5;
                        stackIn_12_0 = stackOut_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0 != null) {
                            statePc = 18;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var16 == 0) {
                            statePc = 144;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (!((jo) this).field_i.field_h.field_a[var5.field_s.field_x][var5.field_s.field_J].field_d) {
                            statePc = 24;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (((jo) this).field_i.field_n != var5.field_s.field_D) {
                            statePc = 144;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var6 = var5.field_s;
                        param1 = this.a((byte) 106, var5);
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var5.field_s.i(126)) {
                            statePc = 62;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (39 == var6.field_y) {
                            statePc = 59;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (-3 == (var6.field_y ^ -1)) {
                            statePc = 56;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (29 != var6.field_y) {
                            statePc = 38;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        ala.field_a[(((jo) this).field_i.field_L >> 1184545442) % 4 + 0].e(param1.field_c + 42, -42 + param1.field_a);
                        if (var16 == 0) {
                            statePc = 62;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if ((var6.field_y ^ -1) == -2) {
                            statePc = 53;
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
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (-13 != (var6.field_y ^ -1)) {
                            statePc = 47;
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
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        ala.field_a[12 + (((jo) this).field_i.field_L >> -344335166) % 4].e(param1.field_c + 42, -42 + param1.field_a);
                        if (var16 == 0) {
                            statePc = 62;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (-38 != (var6.field_y ^ -1)) {
                            statePc = 62;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        ala.field_a[(((jo) this).field_i.field_L >> -509436958) % 4 + 16].e(42 + param1.field_c, -42 + param1.field_a);
                        if (var16 == 0) {
                            statePc = 62;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        ala.field_a[(((jo) this).field_i.field_L >> -1526110782) % 4 + 4].e(42 + param1.field_c, -42 + param1.field_a);
                        if (var16 == 0) {
                            statePc = 62;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        ala.field_a[(((jo) this).field_i.field_L >> 1226580258) % 4 + 8].e(42 + param1.field_c, param1.field_a + -42);
                        if (var16 == 0) {
                            statePc = 62;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        od.field_C.a(param1.field_c, param1.field_a - 64);
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        this.a(16429, var5, param1);
                        if ((var5.field_j ^ -1) < -1) {
                            statePc = 65;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var7_int = 50;
                        var8 = param1.field_c + (128 - var7_int >> -1674772895);
                        var9 = param1.field_a + -14;
                        var10 = (int)((double)var5.field_j / (double)var6.field_t * 100.0);
                        dg.b(-14 + var8, var9, 13, 65793);
                        cfa.a(var10, 13574, 14.199999809265137f, var8 - 14, ((jo) this).field_i.c(var6.field_D, 2271), var9);
                        var11 = var6.field_t / 10;
                        var12 = 6.283185307179586 / (double)var11;
                        var14_double = 0.0;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (var11 < 0) {
                            statePc = 72;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        dg.d(var8 - 14, var9, (int)((long)(-14 + var8) + Math.round(13.0 * Math.sin(var14_double))), (int)(-Math.round(Math.cos(var14_double) * 13.0) + (long)var9), 65793);
                        var14_double = var14_double + var12;
                        var11--;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (var16 != 0) {
                            statePc = 73;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (var16 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        sia.field_g.e(-28 + var8, var9 - 14);
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (((jo) this).field_i.b(var5, true) == null) {
                            statePc = 78;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        stackOut_74_0 = (ad) var5;
                        stackIn_75_0 = stackOut_74_0;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if ((((ad) (Object) stackIn_75_0).field_s.field_D ^ -1) == (((jo) this).field_i.field_n ^ -1)) {
                            statePc = 81;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        ad.field_h.a("" + var6.field_v, var8 + 2 + -16, var9 - -30 - 26, var6.field_D + 2, -1);
                        if (var16 == 0) {
                            statePc = 87;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        ad.field_h.a("" + var6.field_v, -16 + var8 - -2, -26 + (30 + var9), 2 + var6.field_D, -1);
                        var14 = ((jo) this).field_i.b(var5, true).field_g;
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        stackOut_82_0 = var9 - 15;
                        stackIn_85_0 = stackOut_82_0;
                        stackIn_83_0 = stackOut_82_0;
                        if ((((jo) this).field_i.field_L % 128 ^ -1) <= -65) {
                            statePc = 85;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        stackOut_83_0 = stackIn_83_0;
                        stackOut_83_1 = ((jo) this).field_i.field_L % 128;
                        stackIn_86_0 = stackOut_83_0;
                        stackIn_86_1 = stackOut_83_1;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        stackOut_85_0 = stackIn_85_0;
                        stackOut_85_1 = -(((jo) this).field_i.field_L % 128) + 127;
                        stackIn_86_0 = stackOut_85_0;
                        stackIn_86_1 = stackOut_85_1;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        cba.a(stackIn_86_0, stackIn_86_1 * 4, -29 + var8, var14, -60);
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if ((((jo) this).field_i.field_h.field_o ^ -1) != -4) {
                            statePc = 92;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (!var6.g((byte) 85)) {
                            statePc = 92;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        var14 = (int)(15.0 * Math.cos(0.5 * ((double)(((jo) this).field_i.field_L + (var6.field_x * var6.field_J << 1888122498)) / 40.0)));
                        pm.field_v[(((jo) this).field_i.field_L >> 1757160258) % 2].a(72 + param1.field_c, var14 + (param1.field_a + -32));
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if ((var5.field_s.field_y ^ -1) == -1) {
                            statePc = 100;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        stackOut_93_0 = pna.field_zb;
                        stackIn_94_0 = stackOut_93_0;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (((rs) (Object) stackIn_94_0[var5.field_s.field_y]).field_i == -1) {
                            statePc = 100;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        lga.field_k.e(15 + param1.field_c, param1.field_a + 2);
                        am.field_M[pna.field_zb[var5.field_s.field_y].field_i].e(param1.field_c - -17, param1.field_a + 4);
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (!var5.field_s.i(-89)) {
                            statePc = 103;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        if ((var5.field_s.field_y ^ -1) == -40) {
                            statePc = 134;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if (var5.field_s.field_y == 2) {
                            statePc = 131;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        if ((var5.field_s.field_y ^ -1) != -30) {
                            statePc = 113;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        dg.a(42 + param1.field_c, -28 + param1.field_a, 88 + param1.field_c, param1.field_a);
                        ala.field_a[0 - -((((jo) this).field_i.field_L >> 1553622082) % 4)].e(param1.field_c - -42, -42 + param1.field_a);
                        dg.c();
                        if (var16 == 0) {
                            statePc = 137;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        if (1 != var5.field_s.field_y) {
                            statePc = 119;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        dg.a(param1.field_c - -42, -28 + param1.field_a, param1.field_c - -88, param1.field_a);
                        ala.field_a[(((jo) this).field_i.field_L >> -965563134) % 4 + 4].e(param1.field_c + 42, -42 + param1.field_a);
                        dg.c();
                        if (var16 == 0) {
                            statePc = 137;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        if (-13 != (var5.field_s.field_y ^ -1)) {
                            statePc = 125;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        dg.a(param1.field_c - -42, -28 + param1.field_a, 88 + param1.field_c, param1.field_a);
                        ala.field_a[(((jo) this).field_i.field_L >> -29519966) % 4 + 12].e(42 + param1.field_c, -42 + param1.field_a);
                        dg.c();
                        if (var16 == 0) {
                            statePc = 137;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        if (-38 != (var5.field_s.field_y ^ -1)) {
                            statePc = 137;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        dg.a(param1.field_c - -42, param1.field_a + -28, param1.field_c + 88, param1.field_a);
                        ala.field_a[(((jo) this).field_i.field_L >> -1614601470) % 4 + 16].e(42 + param1.field_c, -42 + param1.field_a);
                        dg.c();
                        if (var16 == 0) {
                            statePc = 137;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        dg.a(param1.field_c - -42, param1.field_a - 28, param1.field_c - -88, param1.field_a);
                        ala.field_a[(((jo) this).field_i.field_L >> 1037639746) % 4 + 8].e(42 + param1.field_c, param1.field_a - 42);
                        dg.c();
                        if (var16 == 0) {
                            statePc = 137;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        hr.field_c.a(param1.field_c, param1.field_a + -64, 192);
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        var7 = (vca) (Object) var5.field_t.b((byte) 90);
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        if (var7 == null) {
                            statePc = 144;
                        } else {
                            statePc = 139;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        var7.a(-40 + param1.field_a - -32, param1.field_c + 64, false);
                        var7 = (vca) (Object) var5.field_t.c(0);
                        stackOut_139_0 = var16;
                        stackIn_140_0 = stackOut_139_0;
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        if (stackIn_140_0 != 0) {
                            statePc = 145;
                        } else {
                            statePc = 141;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        if (var16 == 0) {
                            statePc = 138;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        var4++;
                        statePc = 145;
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        if (var16 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 153;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 147: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 148;
                    continue stateLoop;
                }
                case 148: {
                    try {
                        stackOut_148_0 = (RuntimeException) var3;
                        stackOut_148_1 = new StringBuilder().append("jo.EA(").append(param0).append(44);
                        stackIn_151_0 = stackOut_148_0;
                        stackIn_151_1 = stackOut_148_1;
                        stackIn_149_0 = stackOut_148_0;
                        stackIn_149_1 = stackOut_148_1;
                        if (param1 == null) {
                            statePc = 151;
                        } else {
                            statePc = 149;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        stackOut_149_0 = (RuntimeException) (Object) stackIn_149_0;
                        stackOut_149_1 = (StringBuilder) (Object) stackIn_149_1;
                        stackOut_149_2 = "{...}";
                        stackIn_152_0 = stackOut_149_0;
                        stackIn_152_1 = stackOut_149_1;
                        stackIn_152_2 = stackOut_149_2;
                        statePc = 152;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 150: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 151: {
                    stackOut_151_0 = (RuntimeException) (Object) stackIn_151_0;
                    stackOut_151_1 = (StringBuilder) (Object) stackIn_151_1;
                    stackOut_151_2 = "null";
                    stackIn_152_0 = stackOut_151_0;
                    stackIn_152_1 = stackOut_151_1;
                    stackIn_152_2 = stackOut_151_2;
                    statePc = 152;
                    continue stateLoop;
                }
                case 152: {
                    throw pe.a((Throwable) (Object) stackIn_152_0, (String) (Object) (stackIn_152_2 + 41));
                }
                case 153: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(boolean param0, sfa param1) {
        RuntimeException var3 = null;
        gm var3_ref = null;
        ad var4 = null;
        aga var5 = null;
        int var6 = 0;
        int var7 = 0;
        aj var8 = null;
        aj var9 = null;
        int var10 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 instanceof gm) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var3_ref = (gm) (Object) param1;
                        var4 = ((jo) this).field_i.field_G[var3_ref.field_h.field_f];
                        var5 = var4.field_s;
                        var6 = var3_ref.field_l;
                        var7 = var3_ref.field_i;
                        var8 = new aj(((jo) this).a(var5.field_J, (byte) 36, var5.field_x));
                        if (3 != var7) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var9 = ((jo) this).a(var6 + var5.field_J, (byte) 120, var5.field_x);
                        stackOut_5_0 = var10;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0 == 0) {
                            statePc = 22;
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
                        if (var7 != 1) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var9 = ((jo) this).a(-var6 + var5.field_J, (byte) -105, var5.field_x);
                        stackOut_10_0 = var10;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (stackIn_11_0 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((var7 ^ -1) != -3) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var9 = ((jo) this).a(var5.field_J, (byte) -90, -var6 + var5.field_x);
                        stackOut_15_0 = var10;
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (stackIn_16_0 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (-5 != (var7 ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var9 = ((jo) this).a(var5.field_J, (byte) -89, var5.field_x - -var6);
                        if (var10 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var9 = new aj(((jo) this).a(var5.field_J, (byte) 86, var5.field_x));
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        this.a(var5, var8, -32, var9, var7);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (param0) {
                            statePc = 34;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        this.b(-107, -63);
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 28: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    try {
                        stackOut_29_0 = (RuntimeException) var3;
                        stackOut_29_1 = new StringBuilder().append("jo.U(").append(param0).append(44);
                        stackIn_32_0 = stackOut_29_0;
                        stackIn_32_1 = stackOut_29_1;
                        stackIn_30_0 = stackOut_29_0;
                        stackIn_30_1 = stackOut_29_1;
                        if (param1 == null) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
                        stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
                        stackOut_30_2 = "{...}";
                        stackIn_33_0 = stackOut_30_0;
                        stackIn_33_1 = stackOut_30_1;
                        stackIn_33_2 = stackOut_30_2;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 31: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 32: {
                    stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
                    stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
                    stackOut_32_2 = "null";
                    stackIn_33_0 = stackOut_32_0;
                    stackIn_33_1 = stackOut_32_1;
                    stackIn_33_2 = stackOut_32_2;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    throw pe.a((Throwable) (Object) stackIn_33_0, (String) (Object) (stackIn_33_2 + 41));
                }
                case 34: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              if (param2 == 2962) {
                break L0;
              } else {
                ((jo) this).field_E = null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          ((jo) this).field_B = ((jo) this).field_B + param1;
          ((jo) this).field_b = ((jo) this).field_b + param0;
          this.a((byte) -97);
        }
    }

    final void a(int param0) {
        RuntimeException var2 = null;
        int[] var2_array = null;
        int var3 = 0;
        ad[][] var4 = null;
        int var5 = 0;
        ad[] var6 = null;
        ad[] var7 = null;
        int var8 = 0;
        ad var9 = null;
        int var10 = 0;
        ad[] stackIn_10_0 = null;
        Object stackIn_18_0 = null;
        ad[] stackIn_35_0 = null;
        ad[] stackOut_9_0 = null;
        Object stackOut_17_0 = null;
        ad[] stackOut_34_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((jo) this).field_e = new ad[7 * ((jo) this).field_i.field_h.field_d];
                        var2_array = new int[7 * ((jo) this).field_i.field_h.field_d];
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param0 == -22048) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((jo) this).field_m = null;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        bl.a(var2_array, 0, var2_array.length, 2147483646);
                        var3 = 0;
                        var4 = ((jo) this).field_i.field_o;
                        var5 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((var4.length ^ -1) >= (var5 ^ -1)) {
                            statePc = 34;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var6 = var4[var5];
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = (ad[]) var6;
                        stackIn_35_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var10 != 0) {
                            statePc = 35;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 == null) {
                            statePc = 32;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var7 = var6;
                        var8 = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((var7.length ^ -1) >= (var8 ^ -1)) {
                            statePc = 32;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var9 = var7[var8];
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var10 != 0) {
                            statePc = 33;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackOut_17_0 = null;
                        stackIn_18_0 = stackOut_17_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if ((Object) (Object) stackIn_18_0 != (Object) (Object) var9) {
                            statePc = 24;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var10 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        ((jo) this).field_e[var3] = var9;
                        var2_array[var3] = var9.field_s.field_x + var9.field_s.field_J;
                        if (!var9.field_s.i(-122)) {
                            statePc = 30;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var2_array[var3] = var2_array[var3] - 1;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var3++;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var8++;
                        if (var10 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var5++;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var10 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackOut_34_0 = ((jo) this).field_e;
                        stackIn_35_0 = stackOut_34_0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        dk.a((Object[]) (Object) stackIn_35_0, (byte) 101, var2_array);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 37: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw pe.a((Throwable) (Object) var2, "jo.HA(" + param0 + 41);
                }
                case 38: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(boolean param0, aj param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if ((((jo) this).field_q ^ -1) == 0) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (-1 != ((jo) this).field_r) {
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
                    return;
                }
                case 3: {
                    try {
                        param1 = ((jo) this).a(((jo) this).field_r, (byte) -97, ((jo) this).field_q);
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
                        if (param0) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        rla.field_k.e(param1.field_c + 22, param1.field_a - -10, 16711680);
                        if (BachelorFridge.field_y == 0) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        rla.field_k.e(22 + param1.field_c, 10 + param1.field_a, 65376);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (param2 == 18503) {
                            statePc = 22;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ((jo) this).a((byte) -63, -5, -59);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    try {
                        stackOut_17_0 = (RuntimeException) runtimeException;
                        stackOut_17_1 = new StringBuilder().append("jo.JA(").append(param0).append(44);
                        stackIn_20_0 = stackOut_17_0;
                        stackIn_20_1 = stackOut_17_1;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        if (param1 == null) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                        stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                        stackOut_18_2 = "{...}";
                        stackIn_21_0 = stackOut_18_0;
                        stackIn_21_1 = stackOut_18_1;
                        stackIn_21_2 = stackOut_18_2;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 20: {
                    stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                    stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
                    stackOut_20_2 = "null";
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    stackIn_21_2 = stackOut_20_2;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    throw pe.a((Throwable) (Object) stackIn_21_0, (String) (Object) (stackIn_21_2 + 44 + param2 + 41));
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final aj a(boolean param0, int param1, int param2) {
        RuntimeException var4 = null;
        aj stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        aj stackOut_4_0 = null;
        try {
          try {
            L0: {
              if (!param0) {
                break L0;
              } else {
                ((jo) this).field_H = null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          this.a(dp.field_l, param1, param2, -80);
          stackOut_4_0 = dp.field_l;
          stackIn_5_0 = stackOut_4_0;
        }
        return null;
    }

    private final void a(aj param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        param0.a(-1, ((-param1 + param2) * 128 >> 111344849) + ((jo) this).field_b, (64 * (param2 - -param1) >> -983714639) + ((jo) this).field_B);
                        if (param3 <= -47) {
                            statePc = 9;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        ((jo) this).field_n = null;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        stackOut_4_0 = (RuntimeException) runtimeException;
                        stackOut_4_1 = new StringBuilder().append("jo.V(");
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        if (param0 == null) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                        stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                        stackOut_5_2 = "{...}";
                        stackIn_8_0 = stackOut_5_0;
                        stackIn_8_1 = stackOut_5_1;
                        stackIn_8_2 = stackOut_5_2;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 7: {
                    stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                    stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                    stackOut_7_2 = "null";
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    throw pe.a((Throwable) (Object) stackIn_8_0, (String) (Object) (stackIn_8_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41));
                }
                case 9: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, boolean param2, byte param3) {
        ((jo) this).field_b = param0;
        if (param3 != -71) {
            return;
        }
        try {
            ((jo) this).field_B = param1;
            if (param2) {
                this.a((byte) 38);
            }
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "jo.KA(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    private final void a(int param0, ad param1, aj param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        aga var8 = null;
        lna var9 = null;
        float var10 = 0.0f;
        int var11_int = 0;
        gca var11 = null;
        int var12 = 0;
        int var13 = 0;
        kv var14 = null;
        kv var15 = null;
        int var16 = 0;
        int stackIn_3_0 = 0;
        ad stackIn_10_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_33_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_78_0 = 0;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_88_2 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        String stackIn_92_2 = null;
        int stackOut_2_0 = 0;
        ad stackOut_9_0 = null;
        Object stackOut_17_0 = null;
        int stackOut_30_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_77_0 = 0;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        String stackOut_85_2 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        String stackOut_87_2 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        String stackOut_89_2 = null;
        RuntimeException stackOut_91_0 = null;
        StringBuilder stackOut_91_1 = null;
        String stackOut_91_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1.field_s.field_A) {
                            statePc = 6;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (stackIn_3_0 >= param1.field_j) {
                            statePc = 15;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((((jo) this).field_i.field_h.field_a[param1.field_s.field_x][param1.field_s.field_J].field_n ^ -1) != -22) {
                            statePc = 16;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = (ad) param1;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (((ad) (Object) stackIn_10_0).field_s.i(124)) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return;
                }
                case 16: {
                    try {
                        if (!((jo) this).field_i.field_h.field_a[param1.field_s.field_x][param1.field_s.field_J].field_d) {
                            statePc = 24;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackOut_17_0 = this;
                        stackIn_18_0 = stackOut_17_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if ((((jo) this).field_i.field_n ^ -1) != (param1.field_s.field_D ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return;
                }
                case 24: {
                    try {
                        var4_int = param2.field_c + -12;
                        var5 = -90 + param2.field_a;
                        var6 = 48;
                        var7 = 32;
                        var8 = param1.field_s;
                        var9 = param1.field_f;
                        var10 = param1.e((byte) -121);
                        if (0.0f == var10) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var11_int = (int)((float)(via.a(50 * vr.field_b, (byte) 104) + 65536) * var10);
                        var5 = var5 - (int)(var10 * 30.0f);
                        var6 = var6 - (var11_int * 6 >> -1740030736);
                        var7 = var7 - (var11_int * 4 >> 1501202832);
                        var5 = var5 - (var11_int * 4 >> 283024976);
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (param1.field_k > 0) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (15 <= param1.field_k) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = param1.field_k;
                        stackIn_33_0 = stackOut_30_0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackOut_32_0 = 15;
                        stackIn_33_0 = stackOut_32_0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var11_int = stackIn_33_0;
                        var6 = var6 - (3 * var11_int >> -1139043199);
                        var7 = var7 - (2 * var11_int >> 2064681057);
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (param0 == 16429) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 35: {
                    return;
                }
                case 36: {
                    try {
                        var11 = (gca) (Object) param1.field_n.b((byte) 90);
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (null == var11) {
                            statePc = 43;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var11.a(120 + var5, 76 + var4_int, (byte) -34);
                        var11 = (gca) (Object) param1.field_n.c(0);
                        stackOut_38_0 = var16;
                        stackIn_39_0 = stackOut_38_0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (stackIn_39_0 != 0) {
                            statePc = 51;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var16 == 0) {
                            statePc = 37;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (0 >= var6) {
                            statePc = 51;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackOut_44_0 = var7;
                        stackIn_45_0 = stackOut_44_0;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if ((stackIn_45_0 ^ -1) < -1) {
                            statePc = 50;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        nk.a(((jo) this).field_y, param2.field_c + 64 + -(var6 >> 1690607201), -(var7 >> -545295679) + param2.field_a - (-param1.field_k - 24), var6, var7);
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var8.field_s == 1) {
                            statePc = 56;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackOut_52_0 = -5;
                        stackIn_53_0 = stackOut_52_0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (stackIn_53_0 != (var8.field_s ^ -1)) {
                            statePc = 58;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackOut_56_0 = 1;
                        stackIn_59_0 = stackOut_56_0;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        stackOut_58_0 = 0;
                        stackIn_59_0 = stackOut_58_0;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var12 = stackIn_59_0;
                        if ((param1.field_p ^ -1) == -1) {
                            statePc = 72;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var13 = param1.field_p;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var13 < 0) {
                            statePc = 64;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var13 = -var13;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var13 = bd.field_i.field_p * (var13 + -128) >> 507219336;
                        var14 = var9.e(param0 ^ 16465);
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (var12 == 0) {
                            statePc = 70;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var14.e();
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var14 = lq.a(((jo) this).field_k.field_b[93], 8533, var14, -60 + var13, 0);
                        var15 = bd.field_i;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        bd.field_i = var14;
                        var9.a(0, 2048, 2048, (byte) 123, false, 255, var5, var4_int);
                        bd.field_i = var15;
                        if (var16 == 0) {
                            statePc = 75;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var9.a(var12 != 0, false, 2048, 2048, 0, -49, 255, var4_int, var5);
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var11 = (gca) (Object) param1.field_n.b((byte) 90);
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (null == var11) {
                            statePc = 93;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var11.a(120 + var5, (byte) 72, 76 + var4_int);
                        var11 = (gca) (Object) param1.field_n.c(0);
                        stackOut_77_0 = var16;
                        stackIn_78_0 = stackOut_77_0;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (stackIn_78_0 != 0) {
                            statePc = 93;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (var16 == 0) {
                            statePc = 76;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 83: {
                    var4 = (RuntimeException) (Object) caughtException;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    try {
                        stackOut_84_0 = (RuntimeException) var4;
                        stackOut_84_1 = new StringBuilder().append("jo.J(").append(param0).append(44);
                        stackIn_87_0 = stackOut_84_0;
                        stackIn_87_1 = stackOut_84_1;
                        stackIn_85_0 = stackOut_84_0;
                        stackIn_85_1 = stackOut_84_1;
                        if (param1 == null) {
                            statePc = 87;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        stackOut_85_0 = (RuntimeException) (Object) stackIn_85_0;
                        stackOut_85_1 = (StringBuilder) (Object) stackIn_85_1;
                        stackOut_85_2 = "{...}";
                        stackIn_88_0 = stackOut_85_0;
                        stackIn_88_1 = stackOut_85_1;
                        stackIn_88_2 = stackOut_85_2;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 86: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 87: {
                    stackOut_87_0 = (RuntimeException) (Object) stackIn_87_0;
                    stackOut_87_1 = (StringBuilder) (Object) stackIn_87_1;
                    stackOut_87_2 = "null";
                    stackIn_88_0 = stackOut_87_0;
                    stackIn_88_1 = stackOut_87_1;
                    stackIn_88_2 = stackOut_87_2;
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    try {
                        stackOut_88_0 = (RuntimeException) (Object) stackIn_88_0;
                        stackOut_88_1 = ((StringBuilder) (Object) stackIn_88_1).append(stackIn_88_2).append(44);
                        stackIn_91_0 = stackOut_88_0;
                        stackIn_91_1 = stackOut_88_1;
                        stackIn_89_0 = stackOut_88_0;
                        stackIn_89_1 = stackOut_88_1;
                        if (param2 == null) {
                            statePc = 91;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        stackOut_89_0 = (RuntimeException) (Object) stackIn_89_0;
                        stackOut_89_1 = (StringBuilder) (Object) stackIn_89_1;
                        stackOut_89_2 = "{...}";
                        stackIn_92_0 = stackOut_89_0;
                        stackIn_92_1 = stackOut_89_1;
                        stackIn_92_2 = stackOut_89_2;
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 90: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 91: {
                    stackOut_91_0 = (RuntimeException) (Object) stackIn_91_0;
                    stackOut_91_1 = (StringBuilder) (Object) stackIn_91_1;
                    stackOut_91_2 = "null";
                    stackIn_92_0 = stackOut_91_0;
                    stackIn_92_1 = stackOut_91_1;
                    stackIn_92_2 = stackOut_91_2;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    throw pe.a((Throwable) (Object) stackIn_92_0, (String) (Object) (stackIn_92_2 + 41));
                }
                case 93: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        aj var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        Object stackIn_7_0 = null;
        int stackOut_2_0 = 0;
        Object stackOut_6_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var3_int = ((jo) this).field_i.field_h.field_c[param0][0];
                        var5 = -101 % ((18 - param1) / 36);
                        var4 = ((jo) this).field_i.field_h.field_c[param0][1];
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (-1 == var3_int) {
                            statePc = 13;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = -1;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (stackIn_3_0 == var4) {
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
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = this;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((((jo) this).field_i.field_h.field_z ^ -1) >= (var3_int ^ -1)) {
                            statePc = 13;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (((jo) this).field_i.field_h.field_B > var4) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return;
                }
                case 14: {
                    try {
                        if (((jo) this).field_i.field_h.field_a[var3_int][var4].field_l == null) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return;
                }
                case 16: {
                    try {
                        var6 = ((jo) this).a(var4, (byte) -95, var3_int);
                        var7 = (int)(Math.sin(0.5 * ((double)(((jo) this).field_i.field_L + (var4 * var3_int << -1190559070)) / 40.0)) * 30.0);
                        var8 = (int)(Math.cos(0.5 * ((double)(((jo) this).field_i.field_L - -(var3_int * var4 << 1830250338)) / 40.0)) * 15.0);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var8 >= 0) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        pm.field_v[(((jo) this).field_i.field_L >> 719595874) % 2].b(64 + var6.field_c - (8 - var7), var6.field_a + (-16 + var8), ((jo) this).field_i.c(param0, 2271));
                        if (BachelorFridge.field_y == 0) {
                            statePc = 26;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        hb.field_k[(((jo) this).field_i.field_L >> -1554524286) % 2].b(var6.field_c + 56 - -var7, var8 + (var6.field_a - 16), ((jo) this).field_i.c(param0, 2271));
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw pe.a((Throwable) (Object) var3, "jo.H(" + param0 + 44 + param1 + 41);
                }
                case 26: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        wia var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == 24731) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((jo) this).field_q = -41;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2_int = ((jo) this).field_i.field_h.field_z;
                        var3 = ((jo) this).field_i.field_h.field_B;
                        var4 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = var4;
                        stackOut_6_1 = var2_int;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (stackIn_7_0 >= stackIn_7_1) {
                            statePc = 30;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var13 != 0) {
                            statePc = 30;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var5 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var3 <= var5) {
                            statePc = 27;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var6 = ((jo) this).field_i.field_h.field_a[var4][var5];
                        stackOut_11_0 = 33;
                        stackOut_11_1 = var6.field_n;
                        stackIn_7_0 = stackOut_11_0;
                        stackIn_7_1 = stackOut_11_1;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        if (var13 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0 == stackIn_12_1) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var7 = 4 - var6.field_j;
                        var8 = (2 + var6.field_j) * 32;
                        var9 = var4 - var7;
                        var10 = 1 + (var7 + var4);
                        var11 = -var7 + var5;
                        if (-1 >= (var11 ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var11 = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((var2_int ^ -1) <= (var10 ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var10 = var2_int;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var9 >= 0) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var9 = 0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var12 = var7 + (var5 + 1);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var3 < var12) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var12 = var3;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        this.a(var8, var11, var10, var9, var12, (byte) -106);
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var5++;
                        if (var13 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var4++;
                        if (var13 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw pe.a((Throwable) (Object) var2, "jo.PA(" + param0 + 41);
                }
                case 30: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, byte param1, int param2, int param3, kv param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param1 < -91) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((jo) this).field_e = null;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var7 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = var7 ^ -1;
                        stackOut_7_1 = param4.field_p ^ -1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0 <= stackIn_8_1) {
                            statePc = 29;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var13 != 0) {
                            statePc = 29;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var8 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var8 >= param4.field_q) {
                            statePc = 21;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var9 = param4.field_v[var6_int];
                        stackOut_12_0 = 0;
                        stackOut_12_1 = var9;
                        stackIn_8_0 = stackOut_12_0;
                        stackIn_8_1 = stackOut_12_1;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        if (var13 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0 == stackIn_13_1) {
                            statePc = 20;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var10 = param3 * var7 + (param0 + param2 * var8) >> 1688796865;
                        var10 = this.c(var10, -16079);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (-1 <= (var10 ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        param4.field_v[var6_int] = 0;
                        if (var13 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var11 = 16711935 & var9;
                        var11 = var11 * var10;
                        var12 = var9 & 65280;
                        var12 = var12 * var10;
                        param4.field_v[var6_int] = mp.a(dda.a(var12, 16711680), dda.a(-16711936, var11)) >>> -1256270328;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var8++;
                        var6_int++;
                        if (var13 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var7++;
                        if (var13 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    var6 = (RuntimeException) (Object) caughtException;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    try {
                        stackOut_24_0 = (RuntimeException) var6;
                        stackOut_24_1 = new StringBuilder().append("jo.W(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
                        stackIn_27_0 = stackOut_24_0;
                        stackIn_27_1 = stackOut_24_1;
                        stackIn_25_0 = stackOut_24_0;
                        stackIn_25_1 = stackOut_24_1;
                        if (param4 == null) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
                        stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
                        stackOut_25_2 = "{...}";
                        stackIn_28_0 = stackOut_25_0;
                        stackIn_28_1 = stackOut_25_1;
                        stackIn_28_2 = stackOut_25_2;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 27: {
                    stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
                    stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
                    stackOut_27_2 = "null";
                    stackIn_28_0 = stackOut_27_0;
                    stackIn_28_1 = stackOut_27_1;
                    stackIn_28_2 = stackOut_27_2;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    throw pe.a((Throwable) (Object) stackIn_28_0, (String) (Object) (stackIn_28_2 + 41));
                }
                case 29: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(aga param0, aj param1, int param2, aj param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
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
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_51_0 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_50_0 = 0;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var24 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6_int = param1.field_c - -64;
                        var7 = param1.field_a - param2;
                        var8 = param3.field_c + 64;
                        var9 = param3.field_a - -32;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var7 ^ -1) > (var9 ^ -1)) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = var9;
                        stackIn_6_0 = stackOut_3_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = var7;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var10 = stackIn_6_0 - 8;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var7 <= var9) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = var7;
                        stackIn_11_0 = stackOut_8_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = var9;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var11 = stackIn_11_0 + 8;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((var8 ^ -1) < (var6_int ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = var8;
                        stackIn_16_0 = stackOut_13_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = var6_int;
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var12 = stackIn_16_0 + -16;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if ((var6_int ^ -1) >= (var8 ^ -1)) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = var6_int;
                        stackIn_21_0 = stackOut_18_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = var8;
                        stackIn_21_0 = stackOut_20_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var13 = stackIn_21_0 - -16;
                        var14 = 1;
                        var15 = 2;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (2 == param4) {
                            statePc = 31;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (1 == param4) {
                            statePc = 30;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (param4 != 3) {
                            statePc = 32;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var14 = -1;
                        if (var24 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var15 = -2;
                        if (var24 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var14 = -1;
                        var15 = -2;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var16 = var10;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackOut_33_0 = var11;
                        stackOut_33_1 = var16;
                        stackIn_34_0 = stackOut_33_0;
                        stackIn_34_1 = stackOut_33_1;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (stackIn_34_0 <= stackIn_34_1) {
                            statePc = 75;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var24 != 0) {
                            statePc = 75;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var17 = var12;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if ((var17 ^ -1) <= (var13 ^ -1)) {
                            statePc = 59;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var18 = (-var7 + var16) * var15 + var14 * (var17 + -var6_int);
                        var19 = var14 * (var17 + -var6_int) + -(var15 * (-var7 + var16));
                        var20 = (var8 + -var6_int) * var14 - -(var15 * (var9 - var7));
                        stackOut_38_0 = 32;
                        stackOut_38_1 = var18;
                        stackIn_34_0 = stackOut_38_0;
                        stackIn_34_1 = stackOut_38_1;
                        stackIn_39_0 = stackOut_38_0;
                        stackIn_39_1 = stackOut_38_1;
                        if (var24 != 0) {
                            statePc = 34;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (stackIn_39_0 > stackIn_39_1) {
                            statePc = 58;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if ((var18 ^ -1) < (var20 ^ -1)) {
                            statePc = 58;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var21 = 16;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var20 - 80 < var18) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var21 = (var20 + -var18) / 2;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var22 = 33023;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var19 < -var21) {
                            statePc = 58;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackOut_50_0 = var21;
                        stackIn_51_0 = stackOut_50_0;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if ((stackIn_51_0 ^ -1) <= (var19 ^ -1)) {
                            statePc = 57;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var24 == 0) {
                            statePc = 58;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var23 = (var18 << 1655934471) / var20;
                        var23 += 32;
                        dg.h(var17, var16, var22, var23);
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var17++;
                        if (var24 == 0) {
                            statePc = 37;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var16++;
                        if (var24 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 61: {
                    var6 = (RuntimeException) (Object) caughtException;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    try {
                        stackOut_62_0 = (RuntimeException) var6;
                        stackOut_62_1 = new StringBuilder().append("jo.CA(");
                        stackIn_65_0 = stackOut_62_0;
                        stackIn_65_1 = stackOut_62_1;
                        stackIn_63_0 = stackOut_62_0;
                        stackIn_63_1 = stackOut_62_1;
                        if (param0 == null) {
                            statePc = 65;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
                        stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
                        stackOut_63_2 = "{...}";
                        stackIn_66_0 = stackOut_63_0;
                        stackIn_66_1 = stackOut_63_1;
                        stackIn_66_2 = stackOut_63_2;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 64: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 65: {
                    stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
                    stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
                    stackOut_65_2 = "null";
                    stackIn_66_0 = stackOut_65_0;
                    stackIn_66_1 = stackOut_65_1;
                    stackIn_66_2 = stackOut_65_2;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    try {
                        stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
                        stackOut_66_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_66_2).append(44);
                        stackIn_69_0 = stackOut_66_0;
                        stackIn_69_1 = stackOut_66_1;
                        stackIn_67_0 = stackOut_66_0;
                        stackIn_67_1 = stackOut_66_1;
                        if (param1 == null) {
                            statePc = 69;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
                        stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
                        stackOut_67_2 = "{...}";
                        stackIn_70_0 = stackOut_67_0;
                        stackIn_70_1 = stackOut_67_1;
                        stackIn_70_2 = stackOut_67_2;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 68: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 69: {
                    stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
                    stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
                    stackOut_69_2 = "null";
                    stackIn_70_0 = stackOut_69_0;
                    stackIn_70_1 = stackOut_69_1;
                    stackIn_70_2 = stackOut_69_2;
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    try {
                        stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
                        stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(44).append(param2).append(44);
                        stackIn_73_0 = stackOut_70_0;
                        stackIn_73_1 = stackOut_70_1;
                        stackIn_71_0 = stackOut_70_0;
                        stackIn_71_1 = stackOut_70_1;
                        if (param3 == null) {
                            statePc = 73;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
                        stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
                        stackOut_71_2 = "{...}";
                        stackIn_74_0 = stackOut_71_0;
                        stackIn_74_1 = stackOut_71_1;
                        stackIn_74_2 = stackOut_71_2;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 72: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 73: {
                    stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
                    stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
                    stackOut_73_2 = "null";
                    stackIn_74_0 = stackOut_73_0;
                    stackIn_74_1 = stackOut_73_1;
                    stackIn_74_2 = stackOut_73_2;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    throw pe.a((Throwable) (Object) stackIn_74_0, (String) (Object) (stackIn_74_2 + 44 + param4 + 41));
                }
                case 75: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              ((jo) this).field_b = param2;
              if (param0 > 0) {
                break L0;
              } else {
                ((jo) this).field_G = null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          ((jo) this).field_B = param1;
          this.a((byte) -96);
        }
    }

    private final void c(byte param0) {
        RuntimeException var2 = null;
        int[] var2_array = null;
        int var3 = 0;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((jo) this).field_p = tf.a((byte) 119, 3, 3, 127, 64);
                        ((jo) this).field_o = new kv(128, 64);
                        ((jo) this).field_o.b();
                        ((jo) this).field_u = new kv(128, 64);
                        ((jo) this).field_u.b();
                        ((jo) this).field_p.e(0, 0, 33023);
                        ((jo) this).field_C = new kv(128, 64);
                        ((jo) this).field_C.b();
                        ((jo) this).field_p.e(0, 0, 16776960);
                        ((jo) this).field_m = new kv(128, 64);
                        ((jo) this).field_m.b();
                        ((jo) this).field_p.e(0, 0, 16777215);
                        ((jo) this).field_g = new kv(128, 64);
                        ((jo) this).field_g.b();
                        ((jo) this).field_p.e(0, 0, 16711680);
                        ((jo) this).field_f = new kv(128, 64);
                        ((jo) this).field_f.b();
                        ((jo) this).field_p.e(0, 0, 8454016);
                        ((jo) this).field_y = new kv(49, 49);
                        var2_array = new int[256];
                        var3 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var3 ^ -1) <= -257) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var2_array[var3] = 65793 * var3;
                        var3++;
                        if (var4 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((jo) this).field_y.b();
                        dg.a(400, 400, 384, 128, var2_array);
                        ((jo) this).field_x = new kv(128, 64);
                        ((jo) this).field_x.b();
                        ((jo) this).field_p.e(0, 0, 2302755);
                        ((jo) this).field_c = new kv(128, 64);
                        ((jo) this).field_c.b();
                        ((jo) this).field_p.e(0, 0, 16711680);
                        ((jo) this).field_w = new kv[4];
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param0 == -124) {
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
                        ((jo) this).field_v = null;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var3 = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (-5 >= (var3 ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ((jo) this).field_w[var3] = new kv(128, 64);
                        ((jo) this).field_w[var3].b();
                        ((jo) this).field_p.e(0, 0, ((jo) this).field_i.c(var3, 2271));
                        var3++;
                        if (var4 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var4 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ((jo) this).field_n = new kv(84, 84);
                        ((jo) this).field_n.b();
                        dg.a(672, 672, 672, 128, var2_array);
                        ((jo) this).field_A = new kv(128, 64);
                        ((jo) this).field_A.b();
                        ((jo) this).field_p.c(0, 0, 65280);
                        ((jo) this).field_H = ((jo) this).field_A.a();
                        this.a(-64, (byte) -115, 1, 2, ((jo) this).field_H);
                        ((jo) this).field_E = ((jo) this).field_A.a();
                        this.a(64, -1, ((jo) this).field_E, -64, 1, (byte) -127, 2, 2);
                        ((jo) this).field_l = ((jo) this).field_A.a();
                        this.a(192, -1, ((jo) this).field_l, 64, -1, (byte) -100, 2, -2);
                        hga.field_U.a((byte) 126);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw pe.a((Throwable) (Object) var2, "jo.E(" + param0 + 41);
                }
                case 21: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int c(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        try {
          try {
            L0: {
              if (param1 == -16079) {
                break L0;
              } else {
                ((jo) this).field_r = -114;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = (int)(Math.pow(2.0, (double)((float)(-param0) / 10.239999771118164f)) * 256.0);
          stackIn_5_0 = stackOut_4_0;
        }
        return 0;
    }

    private final void a(int param0, int param1, kv param2, int param3, int param4, byte param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var18 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var9_int = 0;
                        if (param5 <= -79) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var10 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = param2.field_p;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (stackIn_5_0 <= var10) {
                            statePc = 26;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var18 != 0) {
                            statePc = 26;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var11 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param2.field_q <= var11) {
                            statePc = 18;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var12 = param2.field_v[var9_int];
                        stackOut_9_0 = var12;
                        stackIn_5_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var18 != 0) {
                            statePc = 5;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var13 = var10 * param7 + (param1 * var11 + param0);
                        var14 = param4 * var11 + param3 + var10 * param6;
                        var15 = (int)Math.sqrt((double)(var13 * var13 + var14 * var14)) >> 1333027681;
                        var15 = this.c(var15, -16079);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((var15 ^ -1) >= -1) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        param2.field_v[var9_int] = 0;
                        if (var18 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var16 = 16711935 & var12;
                        var16 = var16 * var15;
                        var17 = 65280 & var12;
                        var17 = var17 * var15;
                        param2.field_v[var9_int] = mp.a(dda.a(var17, 16711680), dda.a(-16711936, var16)) >>> -1543631288;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var11++;
                        var9_int++;
                        if (var18 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var10++;
                        if (var18 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    var9 = (RuntimeException) (Object) caughtException;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    try {
                        stackOut_21_0 = (RuntimeException) var9;
                        stackOut_21_1 = new StringBuilder().append("jo.GA(").append(param0).append(44).append(param1).append(44);
                        stackIn_24_0 = stackOut_21_0;
                        stackIn_24_1 = stackOut_21_1;
                        stackIn_22_0 = stackOut_21_0;
                        stackIn_22_1 = stackOut_21_1;
                        if (param2 == null) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
                        stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
                        stackOut_22_2 = "{...}";
                        stackIn_25_0 = stackOut_22_0;
                        stackIn_25_1 = stackOut_22_1;
                        stackIn_25_2 = stackOut_22_2;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 24: {
                    stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
                    stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
                    stackOut_24_2 = "null";
                    stackIn_25_0 = stackOut_24_0;
                    stackIn_25_1 = stackOut_24_1;
                    stackIn_25_2 = stackOut_24_2;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    throw pe.a((Throwable) (Object) stackIn_25_0, (String) (Object) (stackIn_25_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41));
                }
                case 26: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var3 = -16384 + 64 * ((jo) this).field_b + (128 * ((jo) this).field_B - 30720);
                        var2_int = var3;
                        var4 = -4096 + ((jo) this).field_B * 128 + (((jo) this).field_b * -64 + 20480) - 30720;
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (0 < var2_int) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((jo) this).field_b = ((jo) this).field_b - (var2_int / 64 >> -1371231615);
                        ((jo) this).field_B = ((jo) this).field_B - (var2_int / 128 >> -1182766495);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2_int = var3 + 8192 * ((jo) this).field_a;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((var2_int ^ -1) > -1) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ((jo) this).field_B = ((jo) this).field_B - (var2_int / 128 >> -443646911);
                        ((jo) this).field_b = ((jo) this).field_b - (var2_int / 64 >> -533787903);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5 = 68 / ((-31 - param0) / 57);
                        var2_int = var4;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((var2_int ^ -1) >= -1) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ((jo) this).field_b = ((jo) this).field_b + (var2_int / 64 >> -1179944799);
                        ((jo) this).field_B = ((jo) this).field_B - (var2_int / 128 >> -394156447);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var2_int = var4 - -(((jo) this).field_z * 8192);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var2_int >= 0) {
                            statePc = 22;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((jo) this).field_b = ((jo) this).field_b + (var2_int / 64 >> -2085839839);
                        ((jo) this).field_B = ((jo) this).field_B - (var2_int / 128 >> -186401151);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw pe.a((Throwable) (Object) var2, "jo.O(" + param0 + 41);
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void d(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        Object stackIn_22_0 = null;
        Object stackIn_26_0 = null;
        int stackIn_34_0 = 0;
        Object stackIn_38_0 = null;
        int stackIn_46_0 = 0;
        Object stackIn_50_0 = null;
        int stackIn_58_0 = 0;
        Object stackIn_62_0 = null;
        int stackIn_75_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_81_1 = 0;
        int stackIn_83_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        Object stackIn_88_0 = null;
        int stackIn_92_0 = 0;
        int stackIn_100_0 = 0;
        Object stackIn_104_0 = null;
        int stackIn_112_0 = 0;
        Object stackIn_116_0 = null;
        int stackIn_124_0 = 0;
        Object stackIn_128_0 = null;
        int stackIn_141_0 = 0;
        int stackIn_143_0 = 0;
        int stackIn_143_1 = 0;
        int stackIn_148_0 = 0;
        int stackIn_148_1 = 0;
        int stackIn_150_0 = 0;
        Object stackIn_154_0 = null;
        int stackIn_162_0 = 0;
        Object stackIn_166_0 = null;
        int stackIn_174_0 = 0;
        int stackIn_178_0 = 0;
        int stackIn_186_0 = 0;
        Object stackIn_190_0 = null;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        Object stackOut_21_0 = null;
        Object stackOut_25_0 = null;
        int stackOut_33_0 = 0;
        Object stackOut_37_0 = null;
        int stackOut_45_0 = 0;
        Object stackOut_49_0 = null;
        int stackOut_57_0 = 0;
        Object stackOut_61_0 = null;
        int stackOut_74_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_80_1 = 0;
        int stackOut_82_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        Object stackOut_87_0 = null;
        int stackOut_91_0 = 0;
        int stackOut_99_0 = 0;
        Object stackOut_103_0 = null;
        int stackOut_111_0 = 0;
        Object stackOut_115_0 = null;
        int stackOut_123_0 = 0;
        Object stackOut_127_0 = null;
        int stackOut_140_0 = 0;
        int stackOut_142_0 = 0;
        int stackOut_142_1 = 0;
        int stackOut_147_0 = 0;
        int stackOut_147_1 = 0;
        int stackOut_149_0 = 0;
        Object stackOut_153_0 = null;
        int stackOut_161_0 = 0;
        Object stackOut_165_0 = null;
        int stackOut_173_0 = 0;
        int stackOut_177_0 = 0;
        int stackOut_185_0 = 0;
        Object stackOut_189_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (2 + ((jo) this).field_a <= var2_int) {
                            statePc = 12;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = 0;
                        stackIn_13_0 = stackOut_3_0;
                        stackIn_4_0 = stackOut_3_0;
                        if (var5 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var3 = stackIn_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var3 ^ -1) <= (2 + ((jo) this).field_z ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ((jo) this).field_j[var2_int][var3].field_n = 0;
                        var3++;
                        if (var5 != 0) {
                            statePc = 11;
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
                        if (var5 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var2_int++;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var5 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var2_int = stackIn_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = 1 + ((jo) this).field_a;
                        stackOut_14_1 = var2_int;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (stackIn_15_0 <= stackIn_15_1) {
                            statePc = 74;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = 0;
                        stackIn_75_0 = stackOut_16_0;
                        stackIn_17_0 = stackOut_16_0;
                        if (var5 != 0) {
                            statePc = 75;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var3 = stackIn_17_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var3 >= 1 + ((jo) this).field_z) {
                            statePc = 73;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var4 = 0;
                        stackOut_19_0 = var2_int ^ -1;
                        stackOut_19_1 = ((jo) this).field_a ^ -1;
                        stackIn_15_0 = stackOut_19_0;
                        stackIn_15_1 = stackOut_19_1;
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        if (var5 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (stackIn_20_0 <= stackIn_20_1) {
                            statePc = 32;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = this;
                        stackIn_22_0 = stackOut_21_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (((jo) this).field_z <= var3) {
                            statePc = 32;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = this;
                        stackIn_26_0 = stackOut_25_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (!((jo) this).field_I[var2_int][var3].field_i) {
                            statePc = 32;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var4 += 4;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var3 >= ((jo) this).field_z) {
                            statePc = 44;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackOut_33_0 = -1;
                        stackIn_34_0 = stackOut_33_0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (stackIn_34_0 <= (var2_int ^ -1)) {
                            statePc = 44;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackOut_37_0 = this;
                        stackIn_38_0 = stackOut_37_0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (((jo) this).field_I[var2_int - 1][var3].field_i) {
                            statePc = 43;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var4 += 8;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (0 >= var2_int) {
                            statePc = 56;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackOut_45_0 = 0;
                        stackIn_46_0 = stackOut_45_0;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (stackIn_46_0 >= var3) {
                            statePc = 56;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackOut_49_0 = this;
                        stackIn_50_0 = stackOut_49_0;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (((jo) this).field_I[-1 + var2_int][var3 - 1].field_i) {
                            statePc = 55;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var4++;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if ((((jo) this).field_a ^ -1) >= (var2_int ^ -1)) {
                            statePc = 68;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        stackOut_57_0 = 0;
                        stackIn_58_0 = stackOut_57_0;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (stackIn_58_0 >= var3) {
                            statePc = 68;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        stackOut_61_0 = this;
                        stackIn_62_0 = stackOut_61_0;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (!((jo) this).field_I[var2_int][-1 + var3].field_i) {
                            statePc = 68;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var4 += 2;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if ((var4 ^ -1) >= -1) {
                            statePc = 72;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        ((jo) this).field_j[var2_int][var3].field_n = 1;
                        ((jo) this).field_j[var2_int][var3].field_k = var4;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var3++;
                        if (var5 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var2_int++;
                        if (var5 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        stackOut_74_0 = param0;
                        stackIn_75_0 = stackOut_74_0;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (stackIn_75_0 >= 53) {
                            statePc = 79;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        this.c((byte) -3);
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var2_int = 0;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        stackOut_80_0 = var2_int;
                        stackOut_80_1 = ((jo) this).field_a + 1;
                        stackIn_81_0 = stackOut_80_0;
                        stackIn_81_1 = stackOut_80_1;
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (stackIn_81_0 >= stackIn_81_1) {
                            statePc = 140;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        stackOut_82_0 = 0;
                        stackIn_141_0 = stackOut_82_0;
                        stackIn_83_0 = stackOut_82_0;
                        if (var5 != 0) {
                            statePc = 141;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var3 = stackIn_83_0;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (((jo) this).field_z - -1 <= var3) {
                            statePc = 139;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var4 = 0;
                        stackOut_85_0 = ((jo) this).field_a;
                        stackOut_85_1 = var2_int;
                        stackIn_81_0 = stackOut_85_0;
                        stackIn_81_1 = stackOut_85_1;
                        stackIn_86_0 = stackOut_85_0;
                        stackIn_86_1 = stackOut_85_1;
                        if (var5 != 0) {
                            statePc = 81;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (stackIn_86_0 <= stackIn_86_1) {
                            statePc = 98;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        stackOut_87_0 = this;
                        stackIn_88_0 = stackOut_87_0;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if ((((jo) this).field_z ^ -1) >= (var3 ^ -1)) {
                            statePc = 98;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        stackOut_91_0 = 29;
                        stackIn_92_0 = stackOut_91_0;
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (stackIn_92_0 != ((jo) this).field_I[var2_int][var3].field_n) {
                            statePc = 98;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        var4 += 4;
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (((jo) this).field_z <= var3) {
                            statePc = 110;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        stackOut_99_0 = -1;
                        stackIn_100_0 = stackOut_99_0;
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (stackIn_100_0 <= (var2_int ^ -1)) {
                            statePc = 110;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        stackOut_103_0 = this;
                        stackIn_104_0 = stackOut_103_0;
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if ((((jo) this).field_I[var2_int + -1][var3].field_n ^ -1) != -30) {
                            statePc = 110;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        var4 += 8;
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        if (-1 <= (var2_int ^ -1)) {
                            statePc = 122;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        stackOut_111_0 = var3;
                        stackIn_112_0 = stackOut_111_0;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        if ((stackIn_112_0 ^ -1) >= -1) {
                            statePc = 122;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        stackOut_115_0 = this;
                        stackIn_116_0 = stackOut_115_0;
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        if (((jo) this).field_I[var2_int - 1][-1 + var3].field_n == 29) {
                            statePc = 121;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        var4++;
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        if (((jo) this).field_a <= var2_int) {
                            statePc = 134;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        stackOut_123_0 = var3;
                        stackIn_124_0 = stackOut_123_0;
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        if (stackIn_124_0 <= 0) {
                            statePc = 134;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        stackOut_127_0 = this;
                        stackIn_128_0 = stackOut_127_0;
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        if (((jo) this).field_I[var2_int][-1 + var3].field_n != 29) {
                            statePc = 134;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        var4 += 2;
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        if (var4 > 0) {
                            statePc = 137;
                        } else {
                            statePc = 135;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        ((jo) this).field_j[var2_int][var3].field_n = 29;
                        ((jo) this).field_j[var2_int][var3].field_k = var4;
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        var3++;
                        if (var5 == 0) {
                            statePc = 84;
                        } else {
                            statePc = 139;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        var2_int++;
                        if (var5 == 0) {
                            statePc = 80;
                        } else {
                            statePc = 140;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        stackOut_140_0 = 0;
                        stackIn_141_0 = stackOut_140_0;
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        var2_int = stackIn_141_0;
                        statePc = 142;
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        stackOut_142_0 = var2_int ^ -1;
                        stackOut_142_1 = ((jo) this).field_a + 1 ^ -1;
                        stackIn_143_0 = stackOut_142_0;
                        stackIn_143_1 = stackOut_142_1;
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        if (stackIn_143_0 <= stackIn_143_1) {
                            statePc = 204;
                        } else {
                            statePc = 144;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        if (var5 != 0) {
                            statePc = 204;
                        } else {
                            statePc = 145;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        var3 = 0;
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        if (var3 >= 1 + ((jo) this).field_z) {
                            statePc = 201;
                        } else {
                            statePc = 147;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        var4 = 0;
                        stackOut_147_0 = var2_int;
                        stackOut_147_1 = ((jo) this).field_a;
                        stackIn_143_0 = stackOut_147_0;
                        stackIn_143_1 = stackOut_147_1;
                        stackIn_148_0 = stackOut_147_0;
                        stackIn_148_1 = stackOut_147_1;
                        if (var5 != 0) {
                            statePc = 143;
                        } else {
                            statePc = 148;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        if (stackIn_148_0 >= stackIn_148_1) {
                            statePc = 160;
                        } else {
                            statePc = 149;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        stackOut_149_0 = var3;
                        stackIn_150_0 = stackOut_149_0;
                        statePc = 150;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 152;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        if (stackIn_150_0 >= ((jo) this).field_z) {
                            statePc = 160;
                        } else {
                            statePc = 151;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        statePc = 153;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        stackOut_153_0 = this;
                        stackIn_154_0 = stackOut_153_0;
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        if ((((jo) this).field_I[var2_int][var3].field_n ^ -1) != -31) {
                            statePc = 160;
                        } else {
                            statePc = 155;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        var4 += 4;
                        statePc = 158;
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        statePc = 160;
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        if ((var3 ^ -1) <= (((jo) this).field_z ^ -1)) {
                            statePc = 172;
                        } else {
                            statePc = 161;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 164;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        stackOut_161_0 = var2_int;
                        stackIn_162_0 = stackOut_161_0;
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 164;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        if (stackIn_162_0 <= 0) {
                            statePc = 172;
                        } else {
                            statePc = 163;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        statePc = 165;
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        stackOut_165_0 = this;
                        stackIn_166_0 = stackOut_165_0;
                        statePc = 166;
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        if ((((jo) this).field_I[var2_int - 1][var3].field_n ^ -1) == -31) {
                            statePc = 171;
                        } else {
                            statePc = 167;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        statePc = 169;
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        statePc = 172;
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        var4 += 8;
                        statePc = 172;
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        if (var2_int <= 0) {
                            statePc = 184;
                        } else {
                            statePc = 173;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        stackOut_173_0 = -1;
                        stackIn_174_0 = stackOut_173_0;
                        statePc = 174;
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        if (stackIn_174_0 <= (var3 ^ -1)) {
                            statePc = 184;
                        } else {
                            statePc = 175;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 180;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        statePc = 177;
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 180;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 180;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        stackOut_177_0 = 30;
                        stackIn_178_0 = stackOut_177_0;
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 180;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        if (stackIn_178_0 != ((jo) this).field_I[-1 + var2_int][-1 + var3].field_n) {
                            statePc = 184;
                        } else {
                            statePc = 179;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        statePc = 181;
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        var4++;
                        statePc = 182;
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        statePc = 184;
                        continue stateLoop;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        if ((((jo) this).field_a ^ -1) >= (var2_int ^ -1)) {
                            statePc = 196;
                        } else {
                            statePc = 185;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        stackOut_185_0 = -1;
                        stackIn_186_0 = stackOut_185_0;
                        statePc = 186;
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        if (stackIn_186_0 <= (var3 ^ -1)) {
                            statePc = 196;
                        } else {
                            statePc = 187;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        statePc = 189;
                        continue stateLoop;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 189: {
                    try {
                        stackOut_189_0 = this;
                        stackIn_190_0 = stackOut_189_0;
                        statePc = 190;
                        continue stateLoop;
                    } catch (Throwable stateCaught_189) {
                        caughtException = stateCaught_189;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        if ((((jo) this).field_I[var2_int][-1 + var3].field_n ^ -1) != -31) {
                            statePc = 196;
                        } else {
                            statePc = 191;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 191: {
                    try {
                        statePc = 193;
                        continue stateLoop;
                    } catch (Throwable stateCaught_191) {
                        caughtException = stateCaught_191;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        var4 += 2;
                        statePc = 194;
                        continue stateLoop;
                    } catch (Throwable stateCaught_193) {
                        caughtException = stateCaught_193;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        statePc = 196;
                        continue stateLoop;
                    } catch (Throwable stateCaught_194) {
                        caughtException = stateCaught_194;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 195: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_195) {
                        caughtException = stateCaught_195;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        if (0 < var4) {
                            statePc = 199;
                        } else {
                            statePc = 197;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_196) {
                        caughtException = stateCaught_196;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 197: {
                    try {
                        statePc = 200;
                        continue stateLoop;
                    } catch (Throwable stateCaught_197) {
                        caughtException = stateCaught_197;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 198: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_198) {
                        caughtException = stateCaught_198;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 199: {
                    try {
                        ((jo) this).field_j[var2_int][var3].field_n = 30;
                        ((jo) this).field_j[var2_int][var3].field_k = var4;
                        statePc = 200;
                        continue stateLoop;
                    } catch (Throwable stateCaught_199) {
                        caughtException = stateCaught_199;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 200: {
                    try {
                        var3++;
                        if (var5 == 0) {
                            statePc = 146;
                        } else {
                            statePc = 201;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_200) {
                        caughtException = stateCaught_200;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 201: {
                    try {
                        var2_int++;
                        if (var5 == 0) {
                            statePc = 142;
                        } else {
                            statePc = 204;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_201) {
                        caughtException = stateCaught_201;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 203: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw pe.a((Throwable) (Object) var2, "jo.S(" + param0 + 41);
                }
                case 204: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(ad param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (null != param0) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 1: {
                    return;
                }
                case 2: {
                    try {
                        var3_int = (param0.field_s.field_x << -1924344400) + param0.field_o;
                        var4 = (param0.field_s.field_J << -1176363024) - -param0.field_r;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((jo) this).field_b = -(128 * (var3_int - var4) >> -1315590127) + 256;
                        ((jo) this).field_B = 208 + -((var4 + var3_int) * 64 >> 910214385);
                        ((jo) this).field_B = ((jo) this).field_B + param0.field_k;
                        this.a((byte) -89);
                        if (param1 >= 87) {
                            statePc = 14;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((jo) this).field_b = -9;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    try {
                        stackOut_9_0 = (RuntimeException) runtimeException;
                        stackOut_9_1 = new StringBuilder().append("jo.MA(");
                        stackIn_12_0 = stackOut_9_0;
                        stackIn_12_1 = stackOut_9_1;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        if (param0 == null) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                        stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                        stackOut_10_2 = "{...}";
                        stackIn_13_0 = stackOut_10_0;
                        stackIn_13_1 = stackOut_10_1;
                        stackIn_13_2 = stackOut_10_2;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 12: {
                    stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                    stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                    stackOut_12_2 = "null";
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    throw pe.a((Throwable) (Object) stackIn_13_0, (String) (Object) (stackIn_13_2 + 44 + param1 + 41));
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, aj param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        param1 = ((jo) this).a(((jo) this).field_r, (byte) -95, ((jo) this).field_q);
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (!((jo) this).field_i.field_h.field_a[((jo) this).field_q][((jo) this).field_r].e(-97)) {
                            statePc = 9;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = this;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (((jo) this).field_i.field_h.a((byte) -101, ((jo) this).field_i.field_n, ((jo) this).field_q, ((jo) this).field_r)) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ((jo) this).field_m.a(param1.field_c + 1, param1.field_a + 1, 64);
                        if (BachelorFridge.field_y == 0) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ((jo) this).field_g.a(param1.field_c - -1, 1 + param1.field_a, 64);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var3_int = ((jo) this).field_i.field_L >> 2024848226;
                        var4 = 16777215;
                        var5 = 192;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (param0 == 2024848226) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ((jo) this).field_w = null;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var3_int = lw.a(5, 64 + param1.field_c, var4, -1 + param1.field_a, param1.field_c + 128, 12175, var3_int, param1.field_a - -32, var5);
                        var3_int = lw.a(5, 128 + param1.field_c, var4, param1.field_a + 32, 64 + param1.field_c, param0 + -2024836051, var3_int, param1.field_a - -64, var5);
                        var3_int = lw.a(5, param1.field_c - -64, var4, param1.field_a - -64, param1.field_c, param0 + -2024836051, var3_int, 32 + param1.field_a, var5);
                        var3_int = lw.a(5, param1.field_c, var4, param1.field_a - -32, param1.field_c - -64, 12175, var3_int, param1.field_a, var5);
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    try {
                        stackOut_20_0 = (RuntimeException) var3;
                        stackOut_20_1 = new StringBuilder().append("jo.IA(").append(param0).append(44);
                        stackIn_23_0 = stackOut_20_0;
                        stackIn_23_1 = stackOut_20_1;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        if (param1 == null) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                        stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                        stackOut_21_2 = "{...}";
                        stackIn_24_0 = stackOut_21_0;
                        stackIn_24_1 = stackOut_21_1;
                        stackIn_24_2 = stackOut_21_2;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 23: {
                    stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
                    stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
                    stackOut_23_2 = "null";
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    stackIn_24_2 = stackOut_23_2;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    throw pe.a((Throwable) (Object) stackIn_24_0, (String) (Object) (stackIn_24_2 + 41));
                }
                case 25: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(int param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        aj var6 = null;
        int var7_int = 0;
        int[][] var7 = null;
        ad var7_ref = null;
        int[] var8 = null;
        int var8_int = 0;
        aga var8_ref = null;
        hd var8_ref2 = null;
        tia var8_ref3 = null;
        int[] var9 = null;
        int var9_int = 0;
        sfa var9_ref = null;
        at var9_ref2 = null;
        int var10 = 0;
        int var11_int = 0;
        t var11 = null;
        int var12 = 0;
        int var13 = 0;
        tv var14_ref_tv = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        boolean stackIn_21_0 = false;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_62_0 = 0;
        boolean stackIn_65_0 = false;
        kv[][] stackIn_71_0 = null;
        kv[][] stackIn_72_0 = null;
        kv[][] stackIn_73_0 = null;
        kv[][] stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        int stackIn_78_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_176_0 = 0;
        int stackIn_219_0 = 0;
        int stackIn_295_0 = 0;
        sfa stackIn_298_0 = null;
        Object stackIn_303_0 = null;
        int stackIn_303_1 = 0;
        int stackIn_303_2 = 0;
        Object stackIn_304_0 = null;
        int stackIn_304_1 = 0;
        int stackIn_304_2 = 0;
        Object stackIn_305_0 = null;
        int stackIn_305_1 = 0;
        int stackIn_305_2 = 0;
        Object stackIn_306_0 = null;
        int stackIn_306_1 = 0;
        int stackIn_306_2 = 0;
        int stackIn_306_3 = 0;
        int stackIn_335_0 = 0;
        int stackIn_337_0 = 0;
        boolean stackIn_340_0 = false;
        int stackIn_346_0 = 0;
        gj stackIn_351_0 = null;
        gj stackIn_358_0 = null;
        Object stackIn_359_0 = null;
        tia stackIn_362_0 = null;
        Object stackIn_364_0 = null;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        boolean stackOut_20_0 = false;
        int stackOut_27_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_61_0 = 0;
        boolean stackOut_64_0 = false;
        kv[][] stackOut_70_0 = null;
        kv[][] stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        kv[][] stackOut_71_0 = null;
        kv[][] stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        int stackOut_77_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_175_0 = 0;
        int stackOut_218_0 = 0;
        int stackOut_294_0 = 0;
        sfa stackOut_297_0 = null;
        Object stackOut_302_0 = null;
        int stackOut_302_1 = 0;
        int stackOut_302_2 = 0;
        Object stackOut_305_0 = null;
        int stackOut_305_1 = 0;
        int stackOut_305_2 = 0;
        int stackOut_305_3 = 0;
        Object stackOut_303_0 = null;
        int stackOut_303_1 = 0;
        int stackOut_303_2 = 0;
        Object stackOut_304_0 = null;
        int stackOut_304_1 = 0;
        int stackOut_304_2 = 0;
        int stackOut_304_3 = 0;
        int stackOut_334_0 = 0;
        int stackOut_336_0 = 0;
        boolean stackOut_339_0 = false;
        int stackOut_345_0 = 0;
        gj stackOut_350_0 = null;
        gj stackOut_357_0 = null;
        bw stackOut_358_0 = null;
        tia stackOut_361_0 = null;
        bw stackOut_363_0 = null;
        L0: {
          var23 = BachelorFridge.field_y;
          var2_int = 0;
          dg.c(0, 0, 640, 480, 2434341);
          var3 = (int)(Math.sin(0.5 * ((double)((jo) this).field_i.field_L / 10.0)) * 5.0);
          var4 = 0;
          var5 = 0;
          if (param0 == -32095) {
            break L0;
          } else {
            this.a(-94, false, 99, 6, 27, -34, -41);
            break L0;
          }
        }
        L1: {
          if ((((jo) this).field_i.field_U ^ -1) >= -1) {
            break L1;
          } else {
            var5 = ((jo) this).field_i.field_L % 128;
            var4 = ((jo) this).field_i.field_L / 128 % (((jo) this).field_i.field_U + 1);
            var5 = (int)(Math.cos((double)var5 / 5.0 * 0.5) * 5.0);
            break L1;
          }
        }
        var6 = ((jo) this).a(((jo) this).field_r, (byte) 116, ((jo) this).field_q);
        this.a(var6, param0 + 32096);
        this.a(false, var6);
        var7_int = 0;
        L2: while (true) {
          L3: {
            L4: {
              if ((((jo) this).field_G.length ^ -1) >= (var7_int ^ -1)) {
                break L4;
              } else {
                var8 = ((jo) this).field_G[var7_int];
                var6 = ((jo) this).a(var8[2], (byte) 120, var8[1]);
                vc.field_d[var8[0]].e(var6.field_c, var6.field_a);
                var7_int++;
                if (var23 != 0) {
                  break L3;
                } else {
                  if (var23 == 0) {
                    continue L2;
                  } else {
                    break L4;
                  }
                }
              }
            }
            L5: {
              if (-1 <= (((jo) this).field_d ^ -1)) {
                break L5;
              } else {
                L6: {
                  var6 = ((jo) this).a(-3, (byte) -97, (((jo) this).field_i.field_h.field_z >> 271459713) - 1);
                  du.field_b.a(-42 + var6.field_c, -((jo) this).field_d + 106 + var6.field_a);
                  var7_int = var3;
                  if (mk.field_p == -1) {
                    break L6;
                  } else {
                    var7_int = -6 + (6 * mk.field_p / 640 + 6 * gd.field_m / 480);
                    break L6;
                  }
                }
                lu.field_f.a(-16 + (var6.field_c - -var7_int), var6.field_a - (-106 + ((jo) this).field_d) - -(var7_int >> -536230239));
                break L5;
              }
            }
            ((jo) this).field_k.b((jo) this, param0 ^ 18776);
            ((jo) this).field_k.a((jo) this, (byte) 117);
            break L3;
          }
          var7_int = 0;
          L7: while (true) {
            stackOut_15_0 = ((jo) this).field_a;
            stackIn_16_0 = stackOut_15_0;
            L8: while (true) {
              L9: {
                L10: {
                  if (stackIn_16_0 <= var7_int) {
                    break L10;
                  } else {
                    stackOut_17_0 = 0;
                    stackIn_28_0 = stackOut_17_0;
                    stackIn_18_0 = stackOut_17_0;
                    if (var23 != 0) {
                      break L9;
                    } else {
                      var8_int = stackIn_18_0;
                      L11: while (true) {
                        L12: {
                          if (((jo) this).field_z <= var8_int) {
                            break L12;
                          } else {
                            stackOut_20_0 = ((jo) this).field_i.field_h.a(var7_int, 120, ((jo) this).field_i.field_n, var8_int);
                            stackIn_16_0 = stackOut_20_0 ? 1 : 0;
                            stackIn_21_0 = stackOut_20_0;
                            if (var23 != 0) {
                              continue L8;
                            } else {
                              L13: {
                                if (!stackIn_21_0) {
                                  break L13;
                                } else {
                                  if (!((jo) this).field_i.field_h.field_a[var7_int][var8_int].e(-111)) {
                                    break L13;
                                  } else {
                                    var6 = ((jo) this).a(var8_int, (byte) -98, var7_int);
                                    ((jo) this).field_w[((jo) this).field_i.field_n].a(var6.field_c, var6.field_a, 64 + -(var3 * 10));
                                    break L13;
                                  }
                                }
                              }
                              var8_int++;
                              if (var23 == 0) {
                                continue L11;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                        var7_int++;
                        if (var23 == 0) {
                          continue L7;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                }
                stackOut_27_0 = 0;
                stackIn_28_0 = stackOut_27_0;
                break L9;
              }
              var7_int = stackIn_28_0;
              L14: while (true) {
                stackOut_29_0 = ((jo) this).field_a ^ -1;
                stackOut_29_1 = var7_int ^ -1;
                stackIn_30_0 = stackOut_29_0;
                stackIn_30_1 = stackOut_29_1;
                L15: while (true) {
                  L16: {
                    L17: {
                      if (stackIn_30_0 >= stackIn_30_1) {
                        break L17;
                      } else {
                        stackOut_31_0 = 0;
                        stackIn_53_0 = stackOut_31_0;
                        stackIn_32_0 = stackOut_31_0;
                        if (var23 != 0) {
                          break L16;
                        } else {
                          var8_int = stackIn_32_0;
                          L18: while (true) {
                            L19: {
                              if ((var8_int ^ -1) <= (((jo) this).field_z ^ -1)) {
                                break L19;
                              } else {
                                stackOut_34_0 = -23;
                                stackOut_34_1 = ((jo) this).field_I[var7_int][var8_int].field_n ^ -1;
                                stackIn_30_0 = stackOut_34_0;
                                stackIn_30_1 = stackOut_34_1;
                                stackIn_35_0 = stackOut_34_0;
                                stackIn_35_1 = stackOut_34_1;
                                if (var23 != 0) {
                                  continue L15;
                                } else {
                                  L20: {
                                    L21: {
                                      if (stackIn_35_0 == stackIn_35_1) {
                                        break L21;
                                      } else {
                                        if (39 == ((jo) this).field_I[var7_int][var8_int].field_n) {
                                          var6 = ((jo) this).a(var8_int, (byte) -90, var7_int);
                                          ip.field_f[1].e(var6.field_c - -32, var6.field_a - 32);
                                          if (var23 == 0) {
                                            break L20;
                                          } else {
                                            break L21;
                                          }
                                        } else {
                                          break L20;
                                        }
                                      }
                                    }
                                    L22: {
                                      var6 = ((jo) this).a(var8_int, (byte) 65, var7_int);
                                      if ((((jo) this).field_i.field_h.field_E ^ -1) != -2) {
                                        break L22;
                                      } else {
                                        ((jo) this).field_k.field_b[95].a(var6.field_c, var6.field_a + -64);
                                        if (var23 == 0) {
                                          break L20;
                                        } else {
                                          break L22;
                                        }
                                      }
                                    }
                                    L23: {
                                      if (-3 == (((jo) this).field_i.field_h.field_E ^ -1)) {
                                        break L23;
                                      } else {
                                        if (((jo) this).field_i.field_h.field_E != 0) {
                                          break L20;
                                        } else {
                                          ((jo) this).field_k.field_b[95].a(var6.field_c, var6.field_a + -64);
                                          if (var23 == 0) {
                                            break L20;
                                          } else {
                                            break L23;
                                          }
                                        }
                                      }
                                    }
                                    ((jo) this).field_k.field_b[95].a(var6.field_c, var6.field_a + -64);
                                    break L20;
                                  }
                                  var8_int++;
                                  if (var23 == 0) {
                                    continue L18;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                            }
                            var7_int++;
                            if (var23 == 0) {
                              continue L14;
                            } else {
                              break L17;
                            }
                          }
                        }
                      }
                    }
                    stackOut_52_0 = ((jo) this).field_i.field_h.field_o ^ -1;
                    stackIn_53_0 = stackOut_52_0;
                    break L16;
                  }
                  L24: {
                    if (stackIn_53_0 == -3) {
                      var7 = ((jo) this).field_i.field_h.field_i;
                      var8_int = 0;
                      L25: while (true) {
                        if (var8_int >= var7.length) {
                          break L24;
                        } else {
                          var9 = var7[var8_int];
                          this.b(var9[0], (byte) 80, var9[1]);
                          var8_int++;
                          if (var23 == 0) {
                            continue L25;
                          } else {
                            break L24;
                          }
                        }
                      }
                    } else {
                      break L24;
                    }
                  }
                  var7_int = 0;
                  L26: while (true) {
                    stackOut_59_0 = ((jo) this).field_a ^ -1;
                    stackIn_60_0 = stackOut_59_0;
                    L27: while (true) {
                      L28: {
                        L29: {
                          if (stackIn_60_0 >= (var7_int ^ -1)) {
                            break L29;
                          } else {
                            stackOut_61_0 = 0;
                            stackIn_78_0 = stackOut_61_0;
                            stackIn_62_0 = stackOut_61_0;
                            if (var23 != 0) {
                              break L28;
                            } else {
                              var8_int = stackIn_62_0;
                              L30: while (true) {
                                L31: {
                                  if (var8_int >= ((jo) this).field_z) {
                                    break L31;
                                  } else {
                                    stackOut_64_0 = ((jo) this).field_i.field_h.field_a[var7_int][var8_int].field_m;
                                    stackIn_60_0 = stackOut_64_0 ? 1 : 0;
                                    stackIn_65_0 = stackOut_64_0;
                                    if (var23 != 0) {
                                      continue L27;
                                    } else {
                                      L32: {
                                        if (!stackIn_65_0) {
                                          break L32;
                                        } else {
                                          if (!((jo) this).field_i.field_h.field_a[var7_int][var8_int].field_d) {
                                            var9_int = od.field_w[((jo) this).field_i.field_h.field_a[var7_int][var8_int].field_n].field_f;
                                            var6 = ((jo) this).a(var8_int, (byte) -100, var7_int);
                                            if ((var9_int ^ -1) == 0) {
                                              break L32;
                                            } else {
                                              L33: {
                                                nk.a(((jo) this).field_y, 40 + var6.field_c, var6.field_a + 16, 38, 24);
                                                stackOut_70_0 = ve.field_m;
                                                stackIn_73_0 = stackOut_70_0;
                                                stackIn_71_0 = stackOut_70_0;
                                                if (-5 < (var9_int ^ -1)) {
                                                  stackOut_73_0 = (kv[][]) (Object) stackIn_73_0;
                                                  stackOut_73_1 = var9_int;
                                                  stackIn_74_0 = stackOut_73_0;
                                                  stackIn_74_1 = stackOut_73_1;
                                                  break L33;
                                                } else {
                                                  stackOut_71_0 = (kv[][]) (Object) stackIn_71_0;
                                                  stackIn_72_0 = stackOut_71_0;
                                                  stackOut_72_0 = (kv[][]) (Object) stackIn_72_0;
                                                  stackOut_72_1 = var9_int + -4;
                                                  stackIn_74_0 = stackOut_72_0;
                                                  stackIn_74_1 = stackOut_72_1;
                                                  break L33;
                                                }
                                              }
                                              ((kv) (Object) stackIn_74_0[stackIn_74_1][(((jo) this).field_i.field_L >> 389131842) % 25]).e(44 + var6.field_c, -var3 + var6.field_a - 4);
                                              break L32;
                                            }
                                          } else {
                                            break L32;
                                          }
                                        }
                                      }
                                      var8_int++;
                                      if (var23 == 0) {
                                        continue L30;
                                      } else {
                                        break L31;
                                      }
                                    }
                                  }
                                }
                                var7_int++;
                                if (var23 == 0) {
                                  continue L26;
                                } else {
                                  break L29;
                                }
                              }
                            }
                          }
                        }
                        stackOut_77_0 = 0;
                        stackIn_78_0 = stackOut_77_0;
                        break L28;
                      }
                      var7_int = stackIn_78_0;
                      L34: while (true) {
                        L35: {
                          L36: {
                            if (var7_int >= ((jo) this).field_z) {
                              break L36;
                            } else {
                              if (var23 != 0) {
                                break L35;
                              } else {
                                var8_int = 0;
                                L37: while (true) {
                                  L38: {
                                    L39: {
                                      if (((jo) this).field_a <= var8_int) {
                                        break L39;
                                      } else {
                                        var6 = ((jo) this).a(var7_int, (byte) -100, var8_int);
                                        if (var23 != 0) {
                                          break L38;
                                        } else {
                                          L40: {
                                            if (null != ((jo) this).field_i.field_D[var8_int][var7_int]) {
                                              ((jo) this).field_i.field_D[var8_int][var7_int].a(var6.field_a, 0, var6.field_c);
                                              break L40;
                                            } else {
                                              break L40;
                                            }
                                          }
                                          var8_int++;
                                          if (var23 == 0) {
                                            continue L37;
                                          } else {
                                            break L39;
                                          }
                                        }
                                      }
                                    }
                                    var7_int++;
                                    break L38;
                                  }
                                  if (var23 == 0) {
                                    continue L34;
                                  } else {
                                    break L36;
                                  }
                                }
                              }
                            }
                          }
                          this.b(24731);
                          break L35;
                        }
                        L41: {
                          L42: {
                            var7_ref = ((jo) this).field_i.field_P;
                            if (var7_ref == null) {
                              break L42;
                            } else {
                              if (!((jo) this).field_i.field_l) {
                                break L42;
                              } else {
                                L43: {
                                  var8_int = 1;
                                  var9_int = 0;
                                  var10 = 0;
                                  var12 = 0;
                                  var11_int = 0;
                                  var13 = var7_ref.field_s.f((byte) 122);
                                  var14_ref_tv = (tv) (Object) ur.field_e[((jo) this).field_i.field_Z.field_g];
                                  if (!hl.a((byte) 109, ((jo) this).field_i.field_Z.field_g)) {
                                    break L43;
                                  } else {
                                    var13 = var13 << 1;
                                    var13 = var13 + var14_ref_tv.field_l;
                                    break L43;
                                  }
                                }
                                L44: {
                                  if ((var7_ref.field_s.field_y ^ -1) != -33) {
                                    stackOut_99_0 = 0;
                                    stackIn_100_0 = stackOut_99_0;
                                    break L44;
                                  } else {
                                    stackOut_98_0 = 1;
                                    stackIn_100_0 = stackOut_98_0;
                                    break L44;
                                  }
                                }
                                L45: {
                                  var15 = stackIn_100_0;
                                  var16 = var7_ref.field_s.field_x;
                                  var17 = var7_ref.field_s.field_J;
                                  if (var15 != 0) {
                                    break L45;
                                  } else {
                                    if (((jo) this).field_i.field_h.field_E != 0) {
                                      break L45;
                                    } else {
                                      if (((jo) this).field_i.field_h.field_a[var16][var17].field_i) {
                                        break L45;
                                      } else {
                                        var13 = var13 >> 1;
                                        break L45;
                                      }
                                    }
                                  }
                                }
                                L46: while (true) {
                                  if (var8_int >= var13 - -1) {
                                    break L42;
                                  } else {
                                    stackOut_107_0 = var11_int;
                                    stackIn_295_0 = stackOut_107_0;
                                    stackIn_108_0 = stackOut_107_0;
                                    if (var23 != 0) {
                                      break L41;
                                    } else {
                                      L47: {
                                        L48: {
                                          if (stackIn_108_0 != 0) {
                                            break L48;
                                          } else {
                                            if (var16 + -var8_int < 0) {
                                              break L48;
                                            } else {
                                              L49: {
                                                L50: {
                                                  if (var15 != 0) {
                                                    break L50;
                                                  } else {
                                                    if (!((jo) this).field_I[var16 + -var8_int][var17].e(-53)) {
                                                      break L49;
                                                    } else {
                                                      if (((jo) this).field_i.field_h.a((byte) -98, ((jo) this).field_i.field_n, -var8_int + var16, var17)) {
                                                        break L49;
                                                      } else {
                                                        break L50;
                                                      }
                                                    }
                                                  }
                                                }
                                                var6 = ((jo) this).a(var17, (byte) -100, var16 - var8_int);
                                                ((jo) this).field_u.a(var6.field_c, var6.field_a, -(10 * var3) + 128);
                                                if ((-var8_int + var16 ^ -1) != (((jo) this).field_q ^ -1)) {
                                                  break L47;
                                                } else {
                                                  if (var17 != ((jo) this).field_r) {
                                                    break L47;
                                                  } else {
                                                    var2_int = 1;
                                                    this.a(true, var6, 18503);
                                                    if (var23 == 0) {
                                                      break L47;
                                                    } else {
                                                      break L49;
                                                    }
                                                  }
                                                }
                                              }
                                              var11_int = 1;
                                              if (var23 == 0) {
                                                break L47;
                                              } else {
                                                break L48;
                                              }
                                            }
                                          }
                                        }
                                        var11_int = 1;
                                        break L47;
                                      }
                                      L51: {
                                        L52: {
                                          if (var9_int != 0) {
                                            break L52;
                                          } else {
                                            if (-1 < (-var8_int + var17 ^ -1)) {
                                              break L52;
                                            } else {
                                              L53: {
                                                L54: {
                                                  if (var15 != 0) {
                                                    break L54;
                                                  } else {
                                                    if (!((jo) this).field_I[var16][-var8_int + var17].e(-30)) {
                                                      break L53;
                                                    } else {
                                                      if (((jo) this).field_i.field_h.a((byte) -127, ((jo) this).field_i.field_n, var16, -var8_int + var17)) {
                                                        break L53;
                                                      } else {
                                                        break L54;
                                                      }
                                                    }
                                                  }
                                                }
                                                var6 = ((jo) this).a(var17 - var8_int, (byte) -100, var16);
                                                ((jo) this).field_u.a(var6.field_c, var6.field_a, 128 + -(10 * var3));
                                                if ((((jo) this).field_q ^ -1) != (var16 ^ -1)) {
                                                  break L51;
                                                } else {
                                                  if (((jo) this).field_r != var17 + -var8_int) {
                                                    break L51;
                                                  } else {
                                                    this.a(true, var6, 18503);
                                                    var2_int = 1;
                                                    if (var23 == 0) {
                                                      break L51;
                                                    } else {
                                                      break L53;
                                                    }
                                                  }
                                                }
                                              }
                                              var9_int = 1;
                                              if (var23 == 0) {
                                                break L51;
                                              } else {
                                                break L52;
                                              }
                                            }
                                          }
                                        }
                                        var9_int = 1;
                                        break L51;
                                      }
                                      L55: {
                                        L56: {
                                          if (var12 != 0) {
                                            break L56;
                                          } else {
                                            if (-1 + ((jo) this).field_a < var8_int + var16) {
                                              break L56;
                                            } else {
                                              L57: {
                                                if (var15 != 0) {
                                                  break L57;
                                                } else {
                                                  L58: {
                                                    if (!((jo) this).field_I[var16 - -var8_int][var17].e(param0 + 32003)) {
                                                      break L58;
                                                    } else {
                                                      if (!((jo) this).field_i.field_h.a((byte) -100, ((jo) this).field_i.field_n, var8_int + var16, var17)) {
                                                        break L57;
                                                      } else {
                                                        break L58;
                                                      }
                                                    }
                                                  }
                                                  var12 = 1;
                                                  if (var23 == 0) {
                                                    break L55;
                                                  } else {
                                                    break L57;
                                                  }
                                                }
                                              }
                                              var6 = ((jo) this).a(var17, (byte) -118, var16 + var8_int);
                                              ((jo) this).field_u.a(var6.field_c, var6.field_a, -(10 * var3) + 128);
                                              if (var16 + var8_int != ((jo) this).field_q) {
                                                break L55;
                                              } else {
                                                if ((var17 ^ -1) != (((jo) this).field_r ^ -1)) {
                                                  break L55;
                                                } else {
                                                  this.a(true, var6, param0 + 50598);
                                                  var2_int = 1;
                                                  if (var23 == 0) {
                                                    break L55;
                                                  } else {
                                                    break L56;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var12 = 1;
                                        break L55;
                                      }
                                      L59: {
                                        L60: {
                                          if (var10 != 0) {
                                            break L60;
                                          } else {
                                            if ((((jo) this).field_z - 1 ^ -1) > (var8_int + var17 ^ -1)) {
                                              break L60;
                                            } else {
                                              L61: {
                                                L62: {
                                                  if (var15 != 0) {
                                                    break L62;
                                                  } else {
                                                    if (!((jo) this).field_I[var16][var17 - -var8_int].e(-78)) {
                                                      break L61;
                                                    } else {
                                                      if (((jo) this).field_i.field_h.a((byte) -121, ((jo) this).field_i.field_n, var16, var17 + var8_int)) {
                                                        break L61;
                                                      } else {
                                                        break L62;
                                                      }
                                                    }
                                                  }
                                                }
                                                var6 = ((jo) this).a(var17 + var8_int, (byte) 83, var16);
                                                ((jo) this).field_u.a(var6.field_c, var6.field_a, -(10 * var3) + 128);
                                                if (((jo) this).field_q != var16) {
                                                  break L59;
                                                } else {
                                                  if (var17 + var8_int != ((jo) this).field_r) {
                                                    break L59;
                                                  } else {
                                                    var2_int = 1;
                                                    this.a(true, var6, 18503);
                                                    if (var23 == 0) {
                                                      break L59;
                                                    } else {
                                                      break L61;
                                                    }
                                                  }
                                                }
                                              }
                                              var10 = 1;
                                              if (var23 == 0) {
                                                break L59;
                                              } else {
                                                break L60;
                                              }
                                            }
                                          }
                                        }
                                        var10 = 1;
                                        break L59;
                                      }
                                      var8_int++;
                                      if (var23 == 0) {
                                        continue L46;
                                      } else {
                                        break L42;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L63: {
                            if (null == var7_ref) {
                              break L63;
                            } else {
                              if (!((jo) this).field_i.field_ab) {
                                break L63;
                              } else {
                                var8_ref = var7_ref.field_s;
                                var6 = ((jo) this).a(var8_ref.field_J, (byte) -117, var8_ref.field_x);
                                var9_int = var8_ref.field_m[((jo) this).field_i.field_db];
                                var10 = var8_ref.field_o.field_g.field_b[var9_int];
                                var11 = (t) (Object) al.a(-83, var10);
                                var12 = var8_ref.c(87, var10);
                                var13 = var11.field_w;
                                var14 = 0;
                                var15 = -1;
                                var16 = 0;
                                var18 = 0;
                                var17 = 0;
                                var20 = 0;
                                var19 = 0;
                                var21 = var7_ref.field_s.field_x;
                                var22 = var7_ref.field_s.field_J;
                                L64: while (true) {
                                  L65: {
                                    L66: {
                                      if ((1 + var12 ^ -1) >= (var13 ^ -1)) {
                                        break L66;
                                      } else {
                                        stackOut_175_0 = var19;
                                        stackIn_219_0 = stackOut_175_0;
                                        stackIn_176_0 = stackOut_175_0;
                                        if (var23 != 0) {
                                          break L65;
                                        } else {
                                          L67: {
                                            L68: {
                                              L69: {
                                                if (stackIn_176_0 != 0) {
                                                  break L69;
                                                } else {
                                                  if (-1 >= (var21 + -var13 ^ -1)) {
                                                    break L68;
                                                  } else {
                                                    break L69;
                                                  }
                                                }
                                              }
                                              var19 = 1;
                                              if (var23 == 0) {
                                                break L67;
                                              } else {
                                                break L68;
                                              }
                                            }
                                            L70: {
                                              var6 = ((jo) this).a(var22, (byte) 97, -var13 + var21);
                                              if ((var21 - var13 ^ -1) != (((jo) this).field_q ^ -1)) {
                                                break L70;
                                              } else {
                                                if ((var22 ^ -1) == (((jo) this).field_r ^ -1)) {
                                                  var14 = 1;
                                                  var16 = var13;
                                                  var2_int = 1;
                                                  var15 = 2;
                                                  break L70;
                                                } else {
                                                  break L70;
                                                }
                                              }
                                            }
                                            ((jo) this).field_C.a(var6.field_c, var6.field_a, 64 + -(var3 * 10));
                                            break L67;
                                          }
                                          L71: {
                                            L72: {
                                              if (var17 != 0) {
                                                break L72;
                                              } else {
                                                if (0 > -var13 + var22) {
                                                  break L72;
                                                } else {
                                                  L73: {
                                                    var6 = ((jo) this).a(var22 + -var13, (byte) 32, var21);
                                                    if (var21 != ((jo) this).field_q) {
                                                      break L73;
                                                    } else {
                                                      if (((jo) this).field_r == -var13 + var22) {
                                                        var14 = 1;
                                                        var16 = var13;
                                                        var15 = 1;
                                                        var2_int = 1;
                                                        break L73;
                                                      } else {
                                                        break L73;
                                                      }
                                                    }
                                                  }
                                                  ((jo) this).field_C.a(var6.field_c, var6.field_a, -(10 * var3) + 64);
                                                  if (var23 == 0) {
                                                    break L71;
                                                  } else {
                                                    break L72;
                                                  }
                                                }
                                              }
                                            }
                                            var17 = 1;
                                            break L71;
                                          }
                                          L74: {
                                            L75: {
                                              if (var20 != 0) {
                                                break L75;
                                              } else {
                                                if (((jo) this).field_a + -1 < var13 + var21) {
                                                  break L75;
                                                } else {
                                                  L76: {
                                                    var6 = ((jo) this).a(var22, (byte) 50, var21 + var13);
                                                    if ((((jo) this).field_q ^ -1) != (var13 + var21 ^ -1)) {
                                                      break L76;
                                                    } else {
                                                      if (var22 == ((jo) this).field_r) {
                                                        var16 = var13;
                                                        var15 = 4;
                                                        var14 = 1;
                                                        var2_int = 1;
                                                        break L76;
                                                      } else {
                                                        break L76;
                                                      }
                                                    }
                                                  }
                                                  ((jo) this).field_C.a(var6.field_c, var6.field_a, -(var3 * 10) + 64);
                                                  if (var23 == 0) {
                                                    break L74;
                                                  } else {
                                                    break L75;
                                                  }
                                                }
                                              }
                                            }
                                            var20 = 1;
                                            break L74;
                                          }
                                          L77: {
                                            L78: {
                                              L79: {
                                                if (var18 != 0) {
                                                  break L79;
                                                } else {
                                                  if ((-1 + ((jo) this).field_z ^ -1) <= (var22 + var13 ^ -1)) {
                                                    break L78;
                                                  } else {
                                                    break L79;
                                                  }
                                                }
                                              }
                                              var18 = 1;
                                              if (var23 == 0) {
                                                break L77;
                                              } else {
                                                break L78;
                                              }
                                            }
                                            L80: {
                                              var6 = ((jo) this).a(var13 + var22, (byte) 104, var21);
                                              if (((jo) this).field_q != var21) {
                                                break L80;
                                              } else {
                                                if ((var22 - -var13 ^ -1) == (((jo) this).field_r ^ -1)) {
                                                  var15 = 3;
                                                  var2_int = 1;
                                                  var16 = var13;
                                                  var14 = 1;
                                                  break L80;
                                                } else {
                                                  break L80;
                                                }
                                              }
                                            }
                                            ((jo) this).field_C.a(var6.field_c, var6.field_a, -(10 * var3) + 64);
                                            break L77;
                                          }
                                          var13++;
                                          if (var23 == 0) {
                                            continue L64;
                                          } else {
                                            break L66;
                                          }
                                        }
                                      }
                                    }
                                    stackOut_218_0 = var14;
                                    stackIn_219_0 = stackOut_218_0;
                                    break L65;
                                  }
                                  if (stackIn_219_0 != 0) {
                                    L81: {
                                      if (2 == var11.field_p) {
                                        var16++;
                                        break L81;
                                      } else {
                                        break L81;
                                      }
                                    }
                                    L82: {
                                      if ((var11.field_p ^ -1) == -4) {
                                        var16++;
                                        break L82;
                                      } else {
                                        break L82;
                                      }
                                    }
                                    this.a(var15, true, var11.field_r, var16, var7_ref.field_s.field_x, var7_ref.field_s.field_J, var5);
                                    this.a(true, var6, 18503);
                                    break L63;
                                  } else {
                                    break L63;
                                  }
                                }
                              }
                            }
                          }
                          L83: {
                            if (var7_ref == null) {
                              break L83;
                            } else {
                              if (!((jo) this).field_i.field_w) {
                                break L83;
                              } else {
                                L84: {
                                  var8_ref2 = (hd) (Object) ur.field_e[((jo) this).field_i.field_Z.field_g];
                                  if (0 != var8_ref2.c(0)) {
                                    break L84;
                                  } else {
                                    L85: {
                                      if ((((jo) this).field_q ^ -1) == 0) {
                                        break L85;
                                      } else {
                                        if (((jo) this).field_r == -1) {
                                          break L85;
                                        } else {
                                          if (130 != var8_ref2.field_j) {
                                            break L85;
                                          } else {
                                            if (((jo) this).field_i.field_h.field_a[((jo) this).field_q][((jo) this).field_r].field_l != null) {
                                              break L85;
                                            } else {
                                              if (!((jo) this).field_i.field_h.field_a[((jo) this).field_q][((jo) this).field_r].e(-52)) {
                                                break L85;
                                              } else {
                                                var2_int = 1;
                                                this.a(true, var6, 18503);
                                                if (var23 == 0) {
                                                  break L83;
                                                } else {
                                                  break L85;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    if ((((jo) this).field_q ^ -1) == 0) {
                                      break L83;
                                    } else {
                                      if (0 == (((jo) this).field_r ^ -1)) {
                                        break L83;
                                      } else {
                                        if (var8_ref2.field_j != 130) {
                                          this.a(true, var6, 18503);
                                          var2_int = 1;
                                          if (var23 == 0) {
                                            break L83;
                                          } else {
                                            break L84;
                                          }
                                        } else {
                                          break L83;
                                        }
                                      }
                                    }
                                  }
                                }
                                L86: {
                                  if (2 != var8_ref2.c(param0 ^ -32095)) {
                                    break L86;
                                  } else {
                                    L87: {
                                      if ((((jo) this).field_q ^ -1) != (1 + var7_ref.field_s.field_x ^ -1)) {
                                        break L87;
                                      } else {
                                        if ((var7_ref.field_s.field_J ^ -1) != (((jo) this).field_r ^ -1)) {
                                          break L87;
                                        } else {
                                          var2_int = 1;
                                          this.a(true, var6, 18503);
                                          if (var23 == 0) {
                                            break L83;
                                          } else {
                                            break L87;
                                          }
                                        }
                                      }
                                    }
                                    L88: {
                                      if ((((jo) this).field_q ^ -1) != (var7_ref.field_s.field_x - 1 ^ -1)) {
                                        break L88;
                                      } else {
                                        if (((jo) this).field_r != var7_ref.field_s.field_J) {
                                          break L88;
                                        } else {
                                          var2_int = 1;
                                          this.a(true, var6, 18503);
                                          if (var23 == 0) {
                                            break L83;
                                          } else {
                                            break L88;
                                          }
                                        }
                                      }
                                    }
                                    L89: {
                                      L90: {
                                        if (var7_ref.field_s.field_x != ((jo) this).field_q) {
                                          break L90;
                                        } else {
                                          if (1 + var7_ref.field_s.field_J == ((jo) this).field_r) {
                                            break L89;
                                          } else {
                                            break L90;
                                          }
                                        }
                                      }
                                      if ((var7_ref.field_s.field_x ^ -1) != (((jo) this).field_q ^ -1)) {
                                        break L83;
                                      } else {
                                        if (-1 + var7_ref.field_s.field_J != ((jo) this).field_r) {
                                          break L83;
                                        } else {
                                          this.a(true, var6, 18503);
                                          var2_int = 1;
                                          if (var23 == 0) {
                                            break L83;
                                          } else {
                                            break L89;
                                          }
                                        }
                                      }
                                    }
                                    var2_int = 1;
                                    this.a(true, var6, 18503);
                                    if (var23 == 0) {
                                      break L83;
                                    } else {
                                      break L86;
                                    }
                                  }
                                }
                                if (3 != var8_ref2.c(0)) {
                                  break L83;
                                } else {
                                  L91: {
                                    if (((jo) this).field_q == -1) {
                                      break L91;
                                    } else {
                                      if (-1 == ((jo) this).field_r) {
                                        break L91;
                                      } else {
                                        if (null != ((jo) this).field_i.field_h.field_a[((jo) this).field_q][((jo) this).field_r].field_l) {
                                          this.a(true, var6, param0 + 50598);
                                          var2_int = 1;
                                          break L91;
                                        } else {
                                          break L91;
                                        }
                                      }
                                    }
                                  }
                                  if (((jo) this).field_q == -1) {
                                    break L83;
                                  } else {
                                    if (0 == (((jo) this).field_r ^ -1)) {
                                      break L83;
                                    } else {
                                      if (93 != var8_ref2.field_j) {
                                        break L83;
                                      } else {
                                        if (null == ((jo) this).field_i.field_h.c(((jo) this).field_q, ((jo) this).field_r, 121)) {
                                          break L83;
                                        } else {
                                          if (((jo) this).field_i.field_h.c(((jo) this).field_q, ((jo) this).field_r, 116).field_A) {
                                            var2_int = 1;
                                            this.a(true, var6, 18503);
                                            break L83;
                                          } else {
                                            break L83;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackOut_294_0 = 0;
                          stackIn_295_0 = stackOut_294_0;
                          break L41;
                        }
                        var8_int = stackIn_295_0;
                        L92: while (true) {
                          L93: {
                            L94: {
                              if (((jo) this).field_i.field_Y.length <= var8_int) {
                                break L94;
                              } else {
                                var9_ref = ((jo) this).field_i.field_Y[var8_int];
                                stackOut_297_0 = (sfa) var9_ref;
                                stackIn_359_0 = (Object) (Object) stackOut_297_0;
                                stackIn_298_0 = stackOut_297_0;
                                if (var23 != 0) {
                                  break L93;
                                } else {
                                  L95: {
                                    L96: {
                                      if (stackIn_298_0 != null) {
                                        break L96;
                                      } else {
                                        if (var23 == 0) {
                                          break L95;
                                        } else {
                                          break L96;
                                        }
                                      }
                                    }
                                    L97: {
                                      stackOut_302_0 = this;
                                      stackOut_302_1 = -64;
                                      stackOut_302_2 = var5;
                                      stackIn_305_0 = stackOut_302_0;
                                      stackIn_305_1 = stackOut_302_1;
                                      stackIn_305_2 = stackOut_302_2;
                                      stackIn_303_0 = stackOut_302_0;
                                      stackIn_303_1 = stackOut_302_1;
                                      stackIn_303_2 = stackOut_302_2;
                                      if (var8_int != var4) {
                                        stackOut_305_0 = this;
                                        stackOut_305_1 = stackIn_305_1;
                                        stackOut_305_2 = stackIn_305_2;
                                        stackOut_305_3 = 0;
                                        stackIn_306_0 = stackOut_305_0;
                                        stackIn_306_1 = stackOut_305_1;
                                        stackIn_306_2 = stackOut_305_2;
                                        stackIn_306_3 = stackOut_305_3;
                                        break L97;
                                      } else {
                                        stackOut_303_0 = this;
                                        stackOut_303_1 = stackIn_303_1;
                                        stackOut_303_2 = stackIn_303_2;
                                        stackIn_304_0 = stackOut_303_0;
                                        stackIn_304_1 = stackOut_303_1;
                                        stackIn_304_2 = stackOut_303_2;
                                        stackOut_304_0 = this;
                                        stackOut_304_1 = stackIn_304_1;
                                        stackOut_304_2 = stackIn_304_2;
                                        stackOut_304_3 = 1;
                                        stackIn_306_0 = stackOut_304_0;
                                        stackIn_306_1 = stackOut_304_1;
                                        stackIn_306_2 = stackOut_304_2;
                                        stackIn_306_3 = stackOut_304_3;
                                        break L97;
                                      }
                                    }
                                    this.a(stackIn_306_1, stackIn_306_2, stackIn_306_3 != 0, var9_ref);
                                    this.a(true, var9_ref);
                                    break L95;
                                  }
                                  var8_int++;
                                  if (var23 == 0) {
                                    continue L92;
                                  } else {
                                    break L94;
                                  }
                                }
                              }
                            }
                            L98: {
                              if (null == ((jo) this).field_i.field_Z) {
                                break L98;
                              } else {
                                this.a(true, ((jo) this).field_i.field_Z);
                                break L98;
                              }
                            }
                            L99: {
                              if ((((jo) this).field_q ^ -1) == 0) {
                                break L99;
                              } else {
                                if (-1 != ((jo) this).field_r) {
                                  L100: {
                                    if (((jo) this).field_i.field_J) {
                                      break L100;
                                    } else {
                                      if (null != ((jo) this).field_i.field_Z) {
                                        break L100;
                                      } else {
                                        if (0 == ((jo) this).field_i.field_M) {
                                          break L100;
                                        } else {
                                          this.a(2024848226, var6);
                                          if (var23 == 0) {
                                            break L99;
                                          } else {
                                            break L100;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (((jo) this).field_i.field_Z == null) {
                                    break L99;
                                  } else {
                                    if (var2_int == 0) {
                                      this.a(false, var6, param0 + 50598);
                                      break L99;
                                    } else {
                                      break L99;
                                    }
                                  }
                                } else {
                                  break L99;
                                }
                              }
                            }
                            L101: {
                              L102: {
                                this.a((byte) -116, var6);
                                if (3 != ((jo) this).field_i.field_h.field_o) {
                                  break L102;
                                } else {
                                  var8_int = 0;
                                  L103: while (true) {
                                    if ((((jo) this).field_i.field_h.field_c.length ^ -1) >= (var8_int ^ -1)) {
                                      break L102;
                                    } else {
                                      this.b(var8_int, -101);
                                      var8_int++;
                                      if (var23 != 0) {
                                        break L101;
                                      } else {
                                        if (var23 == 0) {
                                          continue L103;
                                        } else {
                                          break L102;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              var8_int = 0;
                              break L101;
                            }
                            L104: while (true) {
                              stackOut_334_0 = var8_int;
                              stackIn_335_0 = stackOut_334_0;
                              L105: while (true) {
                                L106: {
                                  L107: {
                                    if (stackIn_335_0 >= ((jo) this).field_i.field_h.field_z) {
                                      break L107;
                                    } else {
                                      stackOut_336_0 = 0;
                                      stackIn_346_0 = stackOut_336_0;
                                      stackIn_337_0 = stackOut_336_0;
                                      if (var23 != 0) {
                                        break L106;
                                      } else {
                                        var9_int = stackIn_337_0;
                                        L108: while (true) {
                                          L109: {
                                            if (var9_int >= ((jo) this).field_i.field_h.field_B) {
                                              break L109;
                                            } else {
                                              var6 = ((jo) this).a(var9_int, (byte) 124, var8_int);
                                              stackOut_339_0 = ((jo) this).field_i.field_h.field_a[var8_int][var9_int].field_d;
                                              stackIn_335_0 = stackOut_339_0 ? 1 : 0;
                                              stackIn_340_0 = stackOut_339_0;
                                              if (var23 != 0) {
                                                continue L105;
                                              } else {
                                                L110: {
                                                  if (stackIn_340_0) {
                                                    co.field_b[4].a(var6.field_c, -64 + (var6.field_a + (var3 >> -541531359)), 192);
                                                    break L110;
                                                  } else {
                                                    break L110;
                                                  }
                                                }
                                                var9_int++;
                                                if (var23 == 0) {
                                                  continue L108;
                                                } else {
                                                  break L109;
                                                }
                                              }
                                            }
                                          }
                                          var8_int++;
                                          if (var23 == 0) {
                                            continue L104;
                                          } else {
                                            break L107;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_345_0 = 0;
                                  stackIn_346_0 = stackOut_345_0;
                                  break L106;
                                }
                                var8_int = stackIn_346_0;
                                L111: while (true) {
                                  L112: {
                                    L113: {
                                      if (((jo) this).field_z <= var8_int) {
                                        break L113;
                                      } else {
                                        var9_int = 0;
                                        L114: while (true) {
                                          L115: {
                                            if ((var9_int ^ -1) <= (((jo) this).field_a ^ -1)) {
                                              break L115;
                                            } else {
                                              var6 = ((jo) this).a(var8_int, (byte) 115, var9_int);
                                              stackOut_350_0 = ((jo) this).field_i;
                                              stackIn_358_0 = stackOut_350_0;
                                              stackIn_351_0 = stackOut_350_0;
                                              if (var23 != 0) {
                                                break L112;
                                              } else {
                                                L116: {
                                                  if (((gj) (Object) stackIn_351_0).field_D[var9_int][var8_int] != null) {
                                                    ((jo) this).field_i.field_D[var9_int][var8_int].a(var6.field_a, true, var6.field_c);
                                                    break L116;
                                                  } else {
                                                    break L116;
                                                  }
                                                }
                                                var9_int++;
                                                if (var23 == 0) {
                                                  continue L114;
                                                } else {
                                                  break L115;
                                                }
                                              }
                                            }
                                          }
                                          var8_int++;
                                          if (var23 == 0) {
                                            continue L111;
                                          } else {
                                            break L113;
                                          }
                                        }
                                      }
                                    }
                                    stackOut_357_0 = ((jo) this).field_i;
                                    stackIn_358_0 = stackOut_357_0;
                                    break L112;
                                  }
                                  stackOut_358_0 = ((gj) (Object) stackIn_358_0).field_fb.b((byte) 90);
                                  stackIn_359_0 = (Object) (Object) stackOut_358_0;
                                  break L93;
                                }
                              }
                            }
                          }
                          var8_ref3 = (tia) (Object) stackIn_359_0;
                          L117: while (true) {
                            L118: {
                              L119: {
                                if (var8_ref3 == null) {
                                  break L119;
                                } else {
                                  var6 = this.a((byte) 126, var8_ref3.field_h);
                                  var8_ref3.a(var6.field_a + 32, 25415, 64 + var6.field_c);
                                  stackOut_361_0 = (tia) (Object) ((jo) this).field_i.field_fb.c(0);
                                  stackIn_364_0 = (Object) (Object) stackOut_361_0;
                                  stackIn_362_0 = stackOut_361_0;
                                  if (var23 != 0) {
                                    break L118;
                                  } else {
                                    var8_ref = (aga) (Object) stackIn_362_0;
                                    if (var23 == 0) {
                                      continue L117;
                                    } else {
                                      break L119;
                                    }
                                  }
                                }
                              }
                              stackOut_363_0 = ((jo) this).field_i.field_j.b((byte) 90);
                              stackIn_364_0 = (Object) (Object) stackOut_363_0;
                              break L118;
                            }
                            var9_ref2 = (at) (Object) stackIn_364_0;
                            L120: while (true) {
                              L121: {
                                L122: {
                                  if (null == var9_ref2) {
                                    break L122;
                                  } else {
                                    var9_ref2.c(-59);
                                    var9_ref2 = (at) (Object) ((jo) this).field_i.field_j.c(0);
                                    if (var23 != 0) {
                                      break L121;
                                    } else {
                                      if (var23 == 0) {
                                        continue L120;
                                      } else {
                                        break L122;
                                      }
                                    }
                                  }
                                }
                                break L121;
                              }
                              return;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final aj b(int param0, int param1, int param2) {
        aj var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_11_0 = false;
        aj stackIn_14_0 = null;
        Object stackIn_18_0 = null;
        int stackOut_6_0 = 0;
        boolean stackOut_10_0 = false;
        aj stackOut_13_0 = null;
        Object stackOut_17_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == 9) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.a(true, (sfa) null);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var5 = -1 + ((jo) this).field_z;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = -1;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (stackIn_7_0 < (var5 ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var6 = -1 + ((jo) this).field_a;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((var6 ^ -1) > -1) {
                            statePc = 16;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var4 = ((jo) this).a(var5, (byte) 100, var6);
                        stackOut_10_0 = ((jo) this).field_p.a(var4.field_c, var4.field_a, param0, param2);
                        stackIn_7_0 = stackOut_10_0 ? 1 : 0;
                        stackIn_11_0 = stackOut_10_0;
                        if (var7 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (stackIn_11_0) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = new aj(var6, var5);
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return (aj) (Object) stackIn_14_0;
                }
                case 15: {
                    try {
                        var6--;
                        if (var7 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var5--;
                        if (var7 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackOut_17_0 = null;
                        stackIn_18_0 = stackOut_17_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return (aj) (Object) stackIn_18_0;
                }
                case 19: {
                    var4_ref = (RuntimeException) (Object) caughtException;
                    throw pe.a((Throwable) (Object) var4_ref, "jo.AA(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(byte param0) {
        RuntimeException var2 = null;
        aj var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        Object stackIn_14_0 = null;
        int stackIn_27_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_52_0 = 0;
        Object stackIn_60_0 = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_26_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_51_0 = 0;
        Object stackOut_59_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 > 65) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.a(true, (aj) null);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ((jo) this).field_h = -1;
                        ((jo) this).field_s = -1;
                        ((jo) this).field_q = -1;
                        ((jo) this).field_r = -1;
                        var3 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = var3;
                        stackOut_6_1 = ((jo) this).field_a;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (stackIn_7_0 >= stackIn_7_1) {
                            statePc = 26;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = 0;
                        stackIn_27_0 = stackOut_8_0;
                        stackIn_9_0 = stackOut_8_0;
                        if (var5 != 0) {
                            statePc = 27;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4 = stackIn_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var4 >= ((jo) this).field_z) {
                            statePc = 25;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var2_ref = ((jo) this).a(var4, (byte) 52, var3);
                        stackOut_11_0 = lf.field_c ^ -1;
                        stackOut_11_1 = -1;
                        stackIn_7_0 = stackOut_11_0;
                        stackIn_7_1 = stackOut_11_1;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        if (var5 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0 == stackIn_12_1) {
                            statePc = 20;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = this;
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (((jo) this).field_p.a(var2_ref.field_c, var2_ref.field_a, nfa.field_a, jc.field_r)) {
                            statePc = 19;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ((jo) this).field_s = var3;
                        ((jo) this).field_h = var4;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (!((jo) this).field_p.a(var2_ref.field_c, var2_ref.field_a, mk.field_p, gd.field_m)) {
                            statePc = 24;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        ((jo) this).field_q = var3;
                        ((jo) this).field_r = var4;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var4++;
                        if (var5 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var3++;
                        if (var5 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackOut_26_0 = ((jo) this).field_q;
                        stackIn_27_0 = stackOut_26_0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (stackIn_27_0 == -1) {
                            statePc = 58;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackOut_28_0 = -1;
                        stackIn_29_0 = stackOut_28_0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (stackIn_29_0 == ((jo) this).field_r) {
                            statePc = 58;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (-22 == (((jo) this).field_i.field_h.field_a[((jo) this).field_q][((jo) this).field_r].field_n ^ -1)) {
                            statePc = 37;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        uca.a(27, (byte) 103);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (22 == ((jo) this).field_i.field_h.field_a[((jo) this).field_q][((jo) this).field_r].field_n) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        uca.a(28, (byte) 124);
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (((jo) this).field_i.field_h.field_a[((jo) this).field_q][((jo) this).field_r].field_n == 6) {
                            statePc = 57;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackOut_43_0 = -9;
                        stackIn_44_0 = stackOut_43_0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (stackIn_44_0 == (((jo) this).field_i.field_h.field_a[((jo) this).field_q][((jo) this).field_r].field_n ^ -1)) {
                            statePc = 57;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackOut_47_0 = 10;
                        stackIn_48_0 = stackOut_47_0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (stackIn_48_0 == ((jo) this).field_i.field_h.field_a[((jo) this).field_q][((jo) this).field_r].field_n) {
                            statePc = 57;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackOut_51_0 = 12;
                        stackIn_52_0 = stackOut_51_0;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (stackIn_52_0 == ((jo) this).field_i.field_h.field_a[((jo) this).field_q][((jo) this).field_r].field_n) {
                            statePc = 57;
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
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        uca.a(26, (byte) 98);
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (-1 == ((jo) this).field_F) {
                            statePc = 68;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        stackOut_59_0 = this;
                        stackIn_60_0 = stackOut_59_0;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        ((jo) this).field_F = ((jo) this).field_F + 1;
                        if ((((jo) this).field_F + 1 ^ -1) > -121) {
                            statePc = 68;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        ((jo) this).field_F = -1;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 67: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw pe.a((Throwable) (Object) var2, "jo.OA(" + param0 + 41);
                }
                case 68: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(boolean param0, aj param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int stackIn_20_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_75_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_91_1 = 0;
        int stackIn_103_0 = 0;
        int stackIn_103_1 = 0;
        int stackIn_107_0 = 0;
        RuntimeException stackIn_122_0 = null;
        StringBuilder stackIn_122_1 = null;
        RuntimeException stackIn_124_0 = null;
        StringBuilder stackIn_124_1 = null;
        RuntimeException stackIn_125_0 = null;
        StringBuilder stackIn_125_1 = null;
        String stackIn_125_2 = null;
        Throwable caughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        int stackOut_74_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_90_1 = 0;
        int stackOut_102_0 = 0;
        int stackOut_102_1 = 0;
        int stackOut_106_0 = 0;
        RuntimeException stackOut_121_0 = null;
        StringBuilder stackOut_121_1 = null;
        RuntimeException stackOut_122_0 = null;
        StringBuilder stackOut_122_1 = null;
        String stackOut_122_2 = null;
        RuntimeException stackOut_124_0 = null;
        StringBuilder stackOut_124_1 = null;
        String stackOut_124_2 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (!param0) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.b((aj) null, -117, -116, -84);
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    var3_int = ((jo) this).field_i.field_h.field_E;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (1 == var3_int) {
                        statePc = 16;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if ((var3_int ^ -1) == -1) {
                        statePc = 48;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (var3_int != 2) {
                        statePc = 126;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (var4 == 0) {
                        statePc = 87;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var3_int = 0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if ((1 + ((jo) this).field_a ^ -1) >= (var3_int ^ -1)) {
                        statePc = 30;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    param1 = ((jo) this).a(((jo) this).field_z - -1, (byte) 27, var3_int);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    stackOut_19_0 = var3_int;
                    stackIn_31_0 = stackOut_19_0;
                    stackIn_20_0 = stackOut_19_0;
                    if (var4 != 0) {
                        statePc = 31;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (stackIn_20_0 != 0) {
                        statePc = 26;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    as.field_a[1 + 5 * ((jo) this).field_i.field_h.field_E].a(param1.field_c - -14, 48 + param1.field_a, 128);
                    if (var4 == 0) {
                        statePc = 29;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    as.field_a[5 * ((jo) this).field_i.field_h.field_E - -2].a(param1.field_c + 14, param1.field_a - -48, 128);
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    var3_int++;
                    if (var4 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    stackOut_30_0 = 0;
                    stackIn_31_0 = stackOut_30_0;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    var3_int = stackIn_31_0;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if (((jo) this).field_z - -1 <= var3_int) {
                        statePc = 46;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    param1 = ((jo) this).a(var3_int, (byte) -116, ((jo) this).field_a + 1);
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if (var4 != 0) {
                        statePc = 47;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    stackOut_35_0 = var3_int;
                    stackIn_36_0 = stackOut_35_0;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    if ((stackIn_36_0 ^ -1) == -1) {
                        statePc = 42;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    ls.field_a[2 + ((jo) this).field_i.field_h.field_E * 5].a(param1.field_c - -14, param1.field_a + 48, 128);
                    if (var4 == 0) {
                        statePc = 45;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    ls.field_a[5 * ((jo) this).field_i.field_h.field_E + 1].a(param1.field_c + 14, 48 + param1.field_a, 128);
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    var3_int++;
                    if (var4 == 0) {
                        statePc = 32;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    param1 = ((jo) this).a(((jo) this).field_z + 1, (byte) -114, 1 + ((jo) this).field_a);
                    ls.field_a[5 * ((jo) this).field_i.field_h.field_E + 3].a(14 + param1.field_c, 48 + param1.field_a, 128);
                    param1 = ((jo) this).a(-1, (byte) -114, ((jo) this).field_a + 1);
                    ls.field_a[5 * ((jo) this).field_i.field_h.field_E].a(14 + param1.field_c, param1.field_a + 48, 128);
                    param1 = ((jo) this).a(-1, (byte) 32, ((jo) this).field_a);
                    ls.field_a[4 + ((jo) this).field_i.field_h.field_E * 5].a(14 + param1.field_c, param1.field_a - -48, 128);
                    param1 = ((jo) this).a(-1, (byte) -123, -1 + ((jo) this).field_a);
                    ls.field_a[5 * ((jo) this).field_i.field_h.field_E + 4].a(14 + param1.field_c, 48 + param1.field_a, 128);
                    param1 = ((jo) this).a(0, (byte) -99, ((jo) this).field_a);
                    ls.field_a[2 + 5 * ((jo) this).field_i.field_h.field_E].a(4 + param1.field_c - -14, param1.field_a - -50, 128);
                    param1 = ((jo) this).a(1 + ((jo) this).field_z, (byte) -111, -1);
                    as.field_a[((jo) this).field_i.field_h.field_E * 5].a(14 + param1.field_c, param1.field_a - -48, 128);
                    param1 = ((jo) this).a(((jo) this).field_z, (byte) -113, -1);
                    as.field_a[4 + 5 * ((jo) this).field_i.field_h.field_E].a(param1.field_c - -14, 48 + param1.field_a, 128);
                    param1 = ((jo) this).a(((jo) this).field_z - 1, (byte) -123, -1);
                    as.field_a[((jo) this).field_i.field_h.field_E * 5 - -4].a(14 + param1.field_c, 48 + param1.field_a, 128);
                    param1 = ((jo) this).a(((jo) this).field_z, (byte) 105, 0);
                    as.field_a[5 * ((jo) this).field_i.field_h.field_E + 2].a(14 + param1.field_c - 4, param1.field_a - -50, 128);
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    if (var4 == 0) {
                        statePc = 126;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var3_int = -1;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (((jo) this).field_a - -1 <= var3_int) {
                        statePc = 62;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    param1 = ((jo) this).a(((jo) this).field_z + 1, (byte) -110, var3_int);
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    stackOut_51_0 = -1;
                    stackOut_51_1 = var3_int;
                    stackIn_64_0 = stackOut_51_0;
                    stackIn_64_1 = stackOut_51_1;
                    stackIn_52_0 = stackOut_51_0;
                    stackIn_52_1 = stackOut_51_1;
                    if (var4 != 0) {
                        statePc = 64;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (stackIn_52_0 == stackIn_52_1) {
                        statePc = 58;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    as.field_a[2 + ((jo) this).field_i.field_h.field_E * 5].a(param1.field_c - -14, 48 + param1.field_a, 128);
                    if (var4 == 0) {
                        statePc = 61;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    as.field_a[1 + ((jo) this).field_i.field_h.field_E * 5].a(14 + param1.field_c, param1.field_a + 48, 128);
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    var3_int++;
                    if (var4 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    var3_int = -5;
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    stackOut_63_0 = var3_int;
                    stackOut_63_1 = -1;
                    stackIn_64_0 = stackOut_63_0;
                    stackIn_64_1 = stackOut_63_1;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    if ((stackIn_64_0 ^ stackIn_64_1) <= 0) {
                        statePc = 70;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    param1 = ((jo) this).a(((jo) this).field_z + 1, (byte) 74, var3_int);
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    as.field_a[2 + 5 * ((jo) this).field_i.field_h.field_E].a(30 + param1.field_c, 40 + param1.field_a, 128);
                    var3_int++;
                    if (var4 != 0) {
                        statePc = 71;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    if (var4 == 0) {
                        statePc = 63;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    var3_int = 0;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    if ((((jo) this).field_z + 1 ^ -1) >= (var3_int ^ -1)) {
                        statePc = 85;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    param1 = ((jo) this).a(var3_int, (byte) 72, ((jo) this).field_a + 1);
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    if (var4 != 0) {
                        statePc = 86;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    stackOut_74_0 = var3_int;
                    stackIn_75_0 = stackOut_74_0;
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    if ((stackIn_75_0 ^ -1) == -1) {
                        statePc = 81;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    ls.field_a[2 + ((jo) this).field_i.field_h.field_E * 5].a(14 + param1.field_c, 48 + param1.field_a, 128);
                    if (var4 == 0) {
                        statePc = 84;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    ls.field_a[1 + 5 * ((jo) this).field_i.field_h.field_E].a(14 + param1.field_c, 48 + param1.field_a, 128);
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    var3_int++;
                    if (var4 == 0) {
                        statePc = 71;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    param1 = ((jo) this).a(((jo) this).field_z - -1, (byte) 70, ((jo) this).field_a + 1);
                    ls.field_a[5 * ((jo) this).field_i.field_h.field_E - -3].a(param1.field_c - -14, param1.field_a + 48, 128);
                    param1 = ((jo) this).a(-1, (byte) 124, 1 + ((jo) this).field_a);
                    ls.field_a[((jo) this).field_i.field_h.field_E * 5].a(param1.field_c + 14, param1.field_a + 48, 128);
                    param1 = ((jo) this).a(-1, (byte) 58, ((jo) this).field_a);
                    ls.field_a[4 + 5 * ((jo) this).field_i.field_h.field_E].a(param1.field_c - -14, 48 + param1.field_a, 128);
                    param1 = ((jo) this).a(-1, (byte) -95, -1 + ((jo) this).field_a);
                    ls.field_a[((jo) this).field_i.field_h.field_E * 5 - -4].a(param1.field_c + 14, 48 + param1.field_a, 128);
                    param1 = ((jo) this).a(0, (byte) 95, ((jo) this).field_a);
                    ls.field_a[((jo) this).field_i.field_h.field_E * 5 - -2].a(14 + param1.field_c - -4, 50 + param1.field_a, 128);
                    param1 = ((jo) this).a(1 + ((jo) this).field_z, (byte) -104, -2);
                    param1 = ((jo) this).a(((jo) this).field_z, (byte) 70, -1);
                    param1 = ((jo) this).a(((jo) this).field_z - 1, (byte) -122, -1);
                    param1 = ((jo) this).a(((jo) this).field_z, (byte) 51, 0);
                    statePc = 86;
                    continue stateLoop;
                }
                case 86: {
                    if (var4 == 0) {
                        statePc = 126;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    var3_int = 0;
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    if ((var3_int ^ -1) <= (1 + ((jo) this).field_a ^ -1)) {
                        statePc = 101;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    param1 = ((jo) this).a(((jo) this).field_z - -1, (byte) -110, var3_int);
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    stackOut_90_0 = -1;
                    stackOut_90_1 = var3_int ^ -1;
                    stackIn_103_0 = stackOut_90_0;
                    stackIn_103_1 = stackOut_90_1;
                    stackIn_91_0 = stackOut_90_0;
                    stackIn_91_1 = stackOut_90_1;
                    if (var4 != 0) {
                        statePc = 103;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    if (stackIn_91_0 == stackIn_91_1) {
                        statePc = 97;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    as.field_a[2 + ((jo) this).field_i.field_h.field_E * 5].a(16 + param1.field_c, param1.field_a + -32, 128);
                    if (var4 == 0) {
                        statePc = 100;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    as.field_a[((jo) this).field_i.field_h.field_E * 5 + 1].a(16 + param1.field_c, param1.field_a - 32, 128);
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    var3_int++;
                    if (var4 == 0) {
                        statePc = 88;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    var3_int = 0;
                    statePc = 102;
                    continue stateLoop;
                }
                case 102: {
                    stackOut_102_0 = ((jo) this).field_z + 1;
                    stackOut_102_1 = var3_int;
                    stackIn_103_0 = stackOut_102_0;
                    stackIn_103_1 = stackOut_102_1;
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    if (stackIn_103_0 <= stackIn_103_1) {
                        statePc = 117;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    param1 = ((jo) this).a(var3_int, (byte) -112, ((jo) this).field_a - -1);
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    if (var4 != 0) {
                        statePc = 118;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    stackOut_106_0 = 0;
                    stackIn_107_0 = stackOut_106_0;
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    if (stackIn_107_0 == var3_int) {
                        statePc = 113;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    ls.field_a[2 + ((jo) this).field_i.field_h.field_E * 5].a(16 + param1.field_c, param1.field_a - 32, 128);
                    if (var4 == 0) {
                        statePc = 116;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    ls.field_a[5 * ((jo) this).field_i.field_h.field_E + 1].a(param1.field_c + 16, -32 + param1.field_a, 128);
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    var3_int++;
                    if (var4 == 0) {
                        statePc = 102;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    param1 = ((jo) this).a(1 + ((jo) this).field_z, (byte) -108, 1 + ((jo) this).field_a);
                    ls.field_a[3 + 5 * ((jo) this).field_i.field_h.field_E].a(param1.field_c - -16, -32 + param1.field_a, 128);
                    param1 = ((jo) this).a(-1, (byte) -114, ((jo) this).field_a + 1);
                    ls.field_a[5 * ((jo) this).field_i.field_h.field_E].a(param1.field_c + 16, param1.field_a - 32, 128);
                    param1 = ((jo) this).a(-1, (byte) 42, ((jo) this).field_a);
                    ls.field_a[((jo) this).field_i.field_h.field_E * 5 + 4].a(param1.field_c + 16, -32 + param1.field_a, 128);
                    param1 = ((jo) this).a(-1, (byte) 101, ((jo) this).field_a - 1);
                    ls.field_a[5 * ((jo) this).field_i.field_h.field_E - -4].a(16 + param1.field_c, -32 + param1.field_a, 128);
                    param1 = ((jo) this).a(0, (byte) -111, ((jo) this).field_a);
                    ls.field_a[5 * ((jo) this).field_i.field_h.field_E - -2].a(param1.field_c - -16, -32 + param1.field_a, 128);
                    param1 = ((jo) this).a(((jo) this).field_z - -1, (byte) 88, -1);
                    as.field_a[((jo) this).field_i.field_h.field_E * 5].a(param1.field_c + 16, -32 + param1.field_a, 128);
                    param1 = ((jo) this).a(((jo) this).field_z, (byte) 71, -1);
                    as.field_a[4 + 5 * ((jo) this).field_i.field_h.field_E].a(16 + param1.field_c, -32 + param1.field_a, 128);
                    param1 = ((jo) this).a(-1 + ((jo) this).field_z, (byte) -95, -1);
                    as.field_a[((jo) this).field_i.field_h.field_E * 5 + 4].a(16 + param1.field_c, -32 + param1.field_a, 128);
                    param1 = ((jo) this).a(((jo) this).field_z, (byte) -96, 0);
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    as.field_a[2 + 5 * ((jo) this).field_i.field_h.field_E].a(16 + param1.field_c, param1.field_a + -32, 128);
                    statePc = 126;
                    continue stateLoop;
                }
                case 126: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final aj a(int param0, byte param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        aj stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        aj stackOut_0_0 = null;
        try {
          var4_int = 9 % ((-31 - param1) / 58);
          this.b(dp.field_l, param0, -3613, param2);
          stackOut_0_0 = dp.field_l;
          stackIn_1_0 = stackOut_0_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return (aj) (Object) stackIn_1_0;
        }
        return null;
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 != -57) {
            return;
        }
        try {
            ((jo) this).field_b = 256 + -(128 * (param2 - param1) >> 560402497);
            ((jo) this).field_B = 208 - ((param1 + param2) * 64 >> -1785116447);
            this.a((byte) -127);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "jo.T(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final void a(int param0, int param1) {
        if (param0 != -1907) {
            return;
        }
        try {
            ((jo) this).field_b = ((jo) this).field_b + (-(param1 >> 1641063265) + kla.a(param1, m.field_a, -2147483648));
            ((jo) this).field_B = ((jo) this).field_B + (-(param1 >> 1815409281) + kla.a(param1, m.field_a, -2147483648));
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "jo.BA(" + param0 + 44 + param1 + 41);
        }
    }

    jo(gj param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int[][] var4_ref_int____ = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_34_0 = 0;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = BachelorFridge.field_y;
                    ((jo) this).field_d = 0;
                    ((jo) this).field_F = -1;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((jo) this).field_i = param0;
                        ((jo) this).field_I = ((jo) this).field_i.field_h.field_a;
                        ((jo) this).field_k = ida.a(0, (vr) null, ((jo) this).field_i.field_h.field_E);
                        hga.field_U.a((byte) 127);
                        ((jo) this).field_z = ((jo) this).field_i.field_h.field_B;
                        ((jo) this).field_a = ((jo) this).field_i.field_h.field_z;
                        ((jo) this).field_j = new bq[((jo) this).field_a - -2][2 + ((jo) this).field_z];
                        var2_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (((jo) this).field_a + 2 <= var2_int) {
                            statePc = 12;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = 0;
                        stackIn_13_0 = stackOut_3_0;
                        stackIn_4_0 = stackOut_3_0;
                        if (var6 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var3 = stackIn_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var3 ^ -1) <= (2 + ((jo) this).field_z ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ((jo) this).field_j[var2_int][var3] = new bq(0);
                        var3++;
                        if (var6 != 0) {
                            statePc = 11;
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
                        if (var6 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var2_int++;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var6 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        this.a(true);
                        this.c((byte) -124);
                        stackOut_12_0 = ((jo) this).field_i.field_n ^ -1;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0 > -1) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var2_int = 0;
                        var3 = 0;
                        var4_ref_int____ = ((jo) this).field_i.field_h.field_L.b(((jo) this).field_i.field_n, -60);
                        var3 = var4_ref_int____[0][1];
                        var2_int = var4_ref_int____[0][0];
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ((jo) this).a((byte) -57, var3, var2_int);
                        if (var6 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ((jo) this).a((byte) -57, ((jo) this).field_z >> 1233427681, ((jo) this).field_a >> 1056893153);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ((jo) this).a(-22048);
                        ((jo) this).field_G = new int[4][3];
                        var2_int = 0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if ((var2_int ^ -1) <= -5) {
                            statePc = 42;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var3 = kla.a(9, ((jo) this).field_i.field_h.field_w, -2147483648);
                        var4 = 0;
                        var5 = 0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var6 != 0) {
                            statePc = 50;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (-1 != (var2_int ^ -1)) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var5 = kla.a(((jo) this).field_z, ((jo) this).field_i.field_h.field_w, -2147483648);
                        var4 = -3;
                        stackOut_26_0 = var6;
                        stackIn_27_0 = stackOut_26_0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (stackIn_27_0 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var2_int == 1) {
                            statePc = 40;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (2 != var2_int) {
                            statePc = 36;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var4 = kla.a(((jo) this).field_a, ((jo) this).field_i.field_h.field_w, -2147483648);
                        var5 = -3;
                        stackOut_34_0 = var6;
                        stackIn_35_0 = stackOut_34_0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (stackIn_35_0 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if ((var2_int ^ -1) != -4) {
                            statePc = 41;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var4 = kla.a(((jo) this).field_a, ((jo) this).field_i.field_h.field_w, -2147483648);
                        var5 = ((jo) this).field_z - -3;
                        if (var6 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var4 = ((jo) this).field_a + 3;
                        var5 = kla.a(((jo) this).field_z, ((jo) this).field_i.field_h.field_w, -2147483648);
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        ((jo) this).field_G[var2_int] = new int[3];
                        var2_int++;
                        if (var6 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        ((jo) this).field_v = a.a(12889, 64, 16763049, 46335);
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 44: {
                    var2 = (RuntimeException) (Object) caughtException;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    try {
                        stackOut_45_0 = (RuntimeException) var2;
                        stackOut_45_1 = new StringBuilder().append("jo.<init>(");
                        stackIn_48_0 = stackOut_45_0;
                        stackIn_48_1 = stackOut_45_1;
                        stackIn_46_0 = stackOut_45_0;
                        stackIn_46_1 = stackOut_45_1;
                        if (param0 == null) {
                            statePc = 48;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
                        stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
                        stackOut_46_2 = "{...}";
                        stackIn_49_0 = stackOut_46_0;
                        stackIn_49_1 = stackOut_46_1;
                        stackIn_49_2 = stackOut_46_2;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 47: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 48: {
                    stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
                    stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
                    stackOut_48_2 = "null";
                    stackIn_49_0 = stackOut_48_0;
                    stackIn_49_1 = stackOut_48_1;
                    stackIn_49_2 = stackOut_48_2;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    throw pe.a((Throwable) (Object) stackIn_49_0, (String) (Object) (stackIn_49_2 + 41));
                }
                case 50: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
    }
}
