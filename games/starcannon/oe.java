/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.lang.Class;
import java.net.Socket;

abstract class oe {
    static int[] field_b;
    static int field_a;
    int field_d;
    String field_c;

    abstract java.net.Socket a(byte param0) throws IOException;

    final static void a(int param0, int param1, rb param2, int param3, int param4) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        param2.a(12, param1 ^ -79);
                        param2.c(17, -306);
                        param2.c(param3, -306);
                        param2.c(param0, -306);
                        if (param1 == 32) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        oe.a(-101, 110, (rb) null, -119, 60);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        param2.a(param4, -61);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    var5 = (RuntimeException) (Object) caughtException;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    try {
                        stackOut_7_0 = (RuntimeException) var5;
                        stackOut_7_1 = new StringBuilder().append("oe.K(").append(param0).append(44).append(param1).append(44);
                        stackIn_10_0 = stackOut_7_0;
                        stackIn_10_1 = stackOut_7_1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        if (param2 == null) {
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
                        stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                        stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                        stackOut_8_2 = "{...}";
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_11_2 = stackOut_8_2;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 10: {
                    stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                    stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                    stackOut_10_2 = "null";
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    stackIn_11_2 = stackOut_10_2;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    throw sd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param3 + 44 + param4 + 41);
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(int param0) {
        RuntimeException var1 = null;
        String var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        String stackIn_26_0 = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        String stackOut_25_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = StarCannon.field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1_ref = "(" + wc.field_i + " " + hh.field_a + " " + bh.field_d + ") " + vh.field_t;
                        if ((il.field_g ^ -1) >= -1) {
                            statePc = 24;
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
                        var1_ref = var1_ref + ":";
                        var2 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (il.field_g <= var2) {
                            statePc = 24;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var1_ref = var1_ref + 32;
                        var3 = 255 & se.field_p.field_f[var2];
                        var4 = var3 >> 890069092;
                        var3 = var3 & 15;
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
                        stackOut_5_0 = var4 ^ -1;
                        stackOut_5_1 = -11;
                        stackIn_25_0 = stackOut_5_0;
                        stackIn_25_1 = stackOut_5_1;
                        stackIn_6_0 = stackOut_5_0;
                        stackIn_6_1 = stackOut_5_1;
                        if (var5 != 0) {
                            statePc = 25;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0 <= stackIn_6_1) {
                            statePc = 12;
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
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4 += 48;
                        if (var5 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var4 += 55;
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
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var1_ref = var1_ref + (char)var4;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((var3 ^ -1) > -11) {
                            statePc = 20;
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
                        var3 += 55;
                        if (var5 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var3 += 48;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var1_ref = var1_ref + (char)var3;
                        var2++;
                        if (var5 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = 37;
                        stackOut_24_1 = (param0 - 3) / 43;
                        stackIn_25_0 = stackOut_24_0;
                        stackIn_25_1 = stackOut_24_1;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var2 = stackIn_25_0 % stackIn_25_1;
                        stackOut_25_0 = (String) var1_ref;
                        stackIn_26_0 = stackOut_25_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return stackIn_26_0;
                }
                case 27: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw sd.a((Throwable) (Object) var1, "oe.G(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static Class a(String param0, boolean param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_8_0 = null;
        Class stackIn_11_0 = null;
        Class stackIn_15_0 = null;
        Class stackIn_19_0 = null;
        Class stackIn_25_0 = null;
        Class stackIn_28_0 = null;
        Class stackIn_34_0 = null;
        Class stackIn_37_0 = null;
        Class stackIn_40_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        Class stackOut_7_0 = null;
        Class stackOut_10_0 = null;
        Class stackOut_14_0 = null;
        Class stackOut_18_0 = null;
        Class stackOut_24_0 = null;
        Class stackOut_27_0 = null;
        Class stackOut_33_0 = null;
        Class stackOut_36_0 = null;
        Class stackOut_39_0 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        int statePc = 0;
        Object caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (!param1) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        oe.b(71);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param0.equals((Object) (Object) "B")) {
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
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (ClassNotFoundException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = Byte.TYPE;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0;
                }
                case 9: {
                    try {
                        if (!param0.equals((Object) (Object) "I")) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = (stateCaught_9 instanceof RuntimeException ? 41 : 12);
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = Integer.TYPE;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = (stateCaught_10 instanceof RuntimeException ? 41 : 12);
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        return stackIn_11_0;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                    if (caughtException instanceof Error) throw (Error) caughtException;
                    throw (ClassNotFoundException) (Object) caughtException;
                }
                case 13: {
                    try {
                        if (!param0.equals((Object) (Object) "S")) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = (stateCaught_13 instanceof RuntimeException ? 41 : 16);
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = Short.TYPE;
                        stackIn_15_0 = stackOut_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = (stateCaught_14 instanceof RuntimeException ? 41 : 16);
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        return stackIn_15_0;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                    if (caughtException instanceof Error) throw (Error) caughtException;
                    throw (ClassNotFoundException) (Object) caughtException;
                }
                case 17: {
                    try {
                        if (!param0.equals((Object) (Object) "J")) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = (stateCaught_17 instanceof RuntimeException ? 41 : 20);
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = Long.TYPE;
                        stackIn_19_0 = stackOut_18_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = (stateCaught_18 instanceof RuntimeException ? 41 : 20);
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        return stackIn_19_0;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                    if (caughtException instanceof Error) throw (Error) caughtException;
                    throw (ClassNotFoundException) (Object) caughtException;
                }
                case 21: {
                    try {
                        if (param0.equals((Object) (Object) "Z")) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = Boolean.TYPE;
                        stackIn_25_0 = stackOut_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 25: {
                    return stackIn_25_0;
                }
                case 26: {
                    try {
                        if (!param0.equals((Object) (Object) "F")) {
                            statePc = 30;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = (stateCaught_26 instanceof RuntimeException ? 41 : 29);
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = Float.TYPE;
                        stackIn_28_0 = stackOut_27_0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = (stateCaught_27 instanceof RuntimeException ? 41 : 29);
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        return stackIn_28_0;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                    if (caughtException instanceof Error) throw (Error) caughtException;
                    throw (ClassNotFoundException) (Object) caughtException;
                }
                case 30: {
                    try {
                        if (param0.equals((Object) (Object) "D")) {
                            statePc = 33;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackOut_33_0 = Double.TYPE;
                        stackIn_34_0 = stackOut_33_0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 34: {
                    return stackIn_34_0;
                }
                case 35: {
                    try {
                        if (!param0.equals((Object) (Object) "C")) {
                            statePc = 39;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = (stateCaught_35 instanceof RuntimeException ? 41 : 38);
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackOut_36_0 = Character.TYPE;
                        stackIn_37_0 = stackOut_36_0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = (stateCaught_36 instanceof RuntimeException ? 41 : 38);
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        return stackIn_37_0;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 38: {
                    if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                    if (caughtException instanceof Error) throw (Error) caughtException;
                    throw (ClassNotFoundException) (Object) caughtException;
                }
                case 39: {
                    try {
                        stackOut_39_0 = Class.forName(param0);
                        stackIn_40_0 = stackOut_39_0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 40: {
                    return stackIn_40_0;
                }
                case 41: {
                    var2 = (RuntimeException) (Object) caughtException;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    try {
                        stackOut_42_0 = (RuntimeException) var2;
                        stackOut_42_1 = new StringBuilder().append("oe.L(");
                        stackIn_45_0 = stackOut_42_0;
                        stackIn_45_1 = stackOut_42_1;
                        stackIn_43_0 = stackOut_42_0;
                        stackIn_43_1 = stackOut_42_1;
                        if (param0 == null) {
                            statePc = 45;
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
                        stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
                        stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
                        stackOut_43_2 = "{...}";
                        stackIn_46_0 = stackOut_43_0;
                        stackIn_46_1 = stackOut_43_1;
                        stackIn_46_2 = stackOut_43_2;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 44: {
                    if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                    if (caughtException instanceof Error) throw (Error) caughtException;
                    throw (ClassNotFoundException) (Object) caughtException;
                }
                case 45: {
                    stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
                    stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
                    stackOut_45_2 = "null";
                    stackIn_46_0 = stackOut_45_0;
                    stackIn_46_1 = stackOut_45_1;
                    stackIn_46_2 = stackOut_45_2;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    throw sd.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final java.net.Socket b(byte param0) throws IOException {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        java.net.Socket stackIn_5_0 = null;
        Object decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        java.net.Socket stackOut_4_0 = null;
        try {
          try {
            if (param0 <= -56) {
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
            return (java.net.Socket) (Object) stackIn_2_0;
          }
          if (decompiledCaughtException instanceof RuntimeException) throw (RuntimeException) decompiledCaughtException;
          if (decompiledCaughtException instanceof Error) throw (Error) decompiledCaughtException;
          throw (IOException) (Object) decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = new java.net.Socket(((oe) this).field_c, ((oe) this).field_d);
          stackIn_5_0 = stackOut_4_0;
        }
        return null;
    }

    final static i a(int param0, byte[] param1) {
        i var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        i stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        Object stackOut_1_0 = null;
        Object stackOut_4_0 = null;
        i stackOut_6_0 = null;
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
                        if (null != param1) {
                            statePc = 3;
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
                    try {
                        stackOut_1_0 = null;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return (i) (Object) stackIn_2_0;
                }
                case 3: {
                    try {
                        var2 = new i(param1, fc.field_d, qd.field_H, gg.field_d, gh.field_C, of.field_g, og.field_c);
                        if (param0 == 5) {
                            statePc = 6;
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
                        stackOut_4_0 = null;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return (i) (Object) stackIn_5_0;
                }
                case 6: {
                    try {
                        rc.b((byte) 105);
                        stackOut_6_0 = (i) var2;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0;
                }
                case 8: {
                    var2_ref = (RuntimeException) (Object) caughtException;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    try {
                        stackOut_9_0 = (RuntimeException) var2_ref;
                        stackOut_9_1 = new StringBuilder().append("oe.J(").append(param0).append(44);
                        stackIn_12_0 = stackOut_9_0;
                        stackIn_12_1 = stackOut_9_1;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        if (param1 == null) {
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
                    throw sd.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static sg c(int param0) {
        RuntimeException var1 = null;
        Object stackIn_6_0 = null;
        sg stackIn_8_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        sg stackOut_7_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (s.field_i != null) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        s.field_i = new sg();
                        s.field_i.a((byte) 123, nb.field_c);
                        s.field_i.field_u = 0;
                        s.field_i.field_m = 4;
                        s.field_i.field_h = 7697781;
                        s.field_i.field_l = nb.field_b;
                        s.field_i.field_g = 5;
                        s.field_i.field_s = 2763306;
                        s.field_i.field_r = 6;
                        s.field_i.field_b = 14;
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
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param0 == -5671) {
                            statePc = 7;
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
                        stackOut_5_0 = null;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return (sg) (Object) stackIn_6_0;
                }
                case 7: {
                    try {
                        stackOut_7_0 = s.field_i;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0;
                }
                case 9: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw sd.a((Throwable) (Object) var1, "oe.M(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(int param0) {
        try {
            field_b = null;
            if (param0 != 12) {
                String discarded$0 = oe.a(75);
            }
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "oe.H(" + param0 + 41);
        }
    }

    static {
    }
}
