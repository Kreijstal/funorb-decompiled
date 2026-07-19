/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ha extends br {
    static oi[] field_j;
    static String field_h;
    int field_f;
    static ul field_g;
    ek field_m;
    static String field_n;
    static String field_k;
    static ao field_i;
    static ja field_l;

    public static void a(int param0) {
        field_l = null;
        field_g = null;
        field_i = null;
        field_n = null;
        field_h = null;
        field_k = null;
        field_j = null;
        if (param0 != 21342) {
            ha.a(-3);
        }
    }

    final static ob b(boolean param0) {
        int var1_int = 0;
        IllegalArgumentException var1 = null;
        ob var2 = null;
        ob stackIn_2_0 = null;
        ig stackIn_5_0 = null;
        ob stackIn_8_0 = null;
        ob stackOut_1_0 = null;
        ig stackOut_3_0 = null;
        ig stackOut_4_0 = null;
        ob stackOut_7_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var1_int = 0;
                        if (!param0) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = (ob) null;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return stackIn_2_0;
                }
                case 3: {
                    stackOut_3_0 = ok.field_p;
                    stackIn_5_0 = stackOut_3_0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        stackOut_4_0 = ok.field_p;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2 = ((ig) (Object) stackIn_5_0).a(var1_int, 32767);
                        if (var2.field_y) {
                            statePc = 7;
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
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = (ob) (var2);
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0;
                }
                case 9: {
                    try {
                        var1_int++;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var1 = (IllegalArgumentException) ((Object) caughtException);
                    return null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ha(ek param0, int param1) {
        try {
            this.field_m = param0;
            this.field_f = param1;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ha.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        int var0 = 0;
        field_h = "Beguile them... The carrot may work better than the stick.";
        field_j = new oi[255];
        field_n = "Detonate a zombie to stun anything close to it.";
        field_k = "Only show lobby chat from my friends";
        for (var0 = 0; var0 < field_j.length; var0++) {
            field_j[var0] = new oi();
        }
        field_i = new ao(11, 0, 1, 2);
        Random discarded$0 = new Random();
    }
}
