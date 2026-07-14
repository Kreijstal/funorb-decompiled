/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wi implements Runnable {
    private static int field_j;
    java.awt.EventQueue field_g;
    private static volatile long field_c;
    static String field_o;
    sr field_l;
    static String field_u;
    private ep field_w;
    private static String field_s;
    private static String field_p;
    static String field_q;
    private static String field_h;
    private boolean field_m;
    private Object field_r;
    static java.lang.reflect.Method field_e;
    sr[] field_i;
    boolean field_f;
    boolean field_t;
    private jr field_k;
    sr field_n;
    private jr field_x;
    private Thread field_a;
    private Object field_v;
    sr field_d;
    private bm field_b;

    private final static sr a(String param0, boolean param1, String param2, int param3) {
        try {
            RuntimeException var4 = null;
            String var4_ref = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            sr var8_ref = null;
            sr stackIn_17_0 = null;
            Object stackIn_21_0 = null;
            sr stackOut_16_0 = null;
            Object stackOut_20_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            if (param1) {
                                statePc = 4;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = (stateCaught_0 instanceof RuntimeException ? 22 : 3);
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            sr discarded$1 = wi.a((String) null, true, (String) null, 127);
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof RuntimeException ? 22 : 3);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (-34 != (param3 ^ -1)) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var4_ref = "jagex_" + param0 + "_preferences" + param2 + "_rc.dat";
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (34 == param3) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var4_ref = "jagex_" + param0 + "_preferences" + param2 + ".dat";
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var4_ref = "jagex_" + param0 + "_preferences" + param2 + "_wip.dat";
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var5_array = new String[]{"c:/rscache/", "/rscache/", field_s, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
                            var6 = 0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if ((var6 ^ -1) <= (var5_array.length ^ -1)) {
                                statePc = 20;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var7 = var5_array[var6];
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (0 >= var7.length()) {
                                statePc = 16;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof Exception ? 15 : 22);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (!new File(var7).exists()) {
                                statePc = 19;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof Exception ? 15 : 22);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var8_ref = new sr(new File(var7, var4_ref), "rw", 10000L);
                            stackOut_16_0 = (sr) var8_ref;
                            stackIn_17_0 = stackOut_16_0;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof Exception ? 18 : 22);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        return stackIn_17_0;
                    }
                    case 18: {
                        try {
                            var8 = (Exception) (Object) caughtException;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var6++;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            stackOut_20_0 = null;
                            stackIn_21_0 = stackOut_20_0;
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        return (sr) (Object) stackIn_21_0;
                    }
                    case 22: {
                        var4 = (RuntimeException) (Object) caughtException;
                        throw var4;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final jr a(Object param0, int param1, int param2, boolean param3, int param4) {
        jr var6 = null;
        RuntimeException var6_ref = null;
        Object var7 = null;
        Throwable var8 = null;
        jr stackIn_12_0 = null;
        jr stackOut_11_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var6 = new jr();
                        var6.field_e = param1;
                        var6.field_b = param4;
                        var6.field_a = param0;
                        var6.field_g = param2;
                        var7 = this;
                        // monitorenter this
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (!param3) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((wi) this).field_d = null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (((wi) this).field_x == null) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = (stateCaught_3 instanceof RuntimeException ? 5 : 9);
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((wi) this).field_x.field_f = var6;
                        ((wi) this).field_x = var6;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = (stateCaught_4 instanceof RuntimeException ? 5 : 9);
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
                        ((wi) this).field_k = var6;
                        ((wi) this).field_x = var6;
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
                        this.notify();
                        // monitorexit var7
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var8 = caughtException;
                        // monitorexit var7
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) var8;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = (jr) var6;
                        stackIn_12_0 = stackOut_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return stackIn_12_0;
                }
                case 13: {
                    var6_ref = (RuntimeException) (Object) caughtException;
                    throw var6_ref;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final jr a(int param0, String param1, boolean param2, boolean param3) {
        RuntimeException var5 = null;
        Object stackIn_5_0 = null;
        String stackIn_5_1 = null;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        Object stackIn_7_0 = null;
        String stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        Object stackIn_8_0 = null;
        String stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        int stackIn_8_5 = 0;
        jr stackIn_9_0 = null;
        Object stackOut_4_0 = null;
        String stackOut_4_1 = null;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        Object stackOut_5_0 = null;
        String stackOut_5_1 = null;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        int stackOut_5_5 = 0;
        Object stackOut_7_0 = null;
        String stackOut_7_1 = null;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        int stackOut_7_5 = 0;
        jr stackOut_8_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param2) {
                            statePc = 4;
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
                        ((wi) this).field_b = null;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = this;
                        stackOut_4_1 = (String) param1;
                        stackOut_4_2 = 0;
                        stackOut_4_3 = param0;
                        stackOut_4_4 = 0;
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        stackIn_7_2 = stackOut_4_2;
                        stackIn_7_3 = stackOut_4_3;
                        stackIn_7_4 = stackOut_4_4;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        stackIn_5_2 = stackOut_4_2;
                        stackIn_5_3 = stackOut_4_3;
                        stackIn_5_4 = stackOut_4_4;
                        if (!param3) {
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
                        stackOut_5_0 = this;
                        stackOut_5_1 = (String) (Object) stackIn_5_1;
                        stackOut_5_2 = stackIn_5_2;
                        stackOut_5_3 = stackIn_5_3;
                        stackOut_5_4 = stackIn_5_4;
                        stackOut_5_5 = 22;
                        stackIn_8_0 = stackOut_5_0;
                        stackIn_8_1 = stackOut_5_1;
                        stackIn_8_2 = stackOut_5_2;
                        stackIn_8_3 = stackOut_5_3;
                        stackIn_8_4 = stackOut_5_4;
                        stackIn_8_5 = stackOut_5_5;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = this;
                        stackOut_7_1 = (String) (Object) stackIn_7_1;
                        stackOut_7_2 = stackIn_7_2;
                        stackOut_7_3 = stackIn_7_3;
                        stackOut_7_4 = stackIn_7_4;
                        stackOut_7_5 = 1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        stackIn_8_2 = stackOut_7_2;
                        stackIn_8_3 = stackOut_7_3;
                        stackIn_8_4 = stackOut_7_4;
                        stackIn_8_5 = stackOut_7_5;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = this.a((Object) (Object) stackIn_8_1, stackIn_8_2, stackIn_8_3, stackIn_8_4 != 0, stackIn_8_5);
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return stackIn_9_0;
                }
                case 10: {
                    var5 = (RuntimeException) (Object) caughtException;
                    throw var5;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(boolean param0) {
        try {
            Object var2 = null;
            InterruptedException var2_ref = null;
            IOException var2_ref2 = null;
            RuntimeException var2_ref3 = null;
            int var2_int = 0;
            Throwable var3 = null;
            IOException var3_ref = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var2 = this;
                            // monitorenter this
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            ((wi) this).field_m = true;
                            this.notifyAll();
                            // monitorexit var2
                            statePc = 2;
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
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var3 = caughtException;
                            // monitorexit var2
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            throw (RuntimeException) (Object) var3;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (!param0) {
                                statePc = 9;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof InterruptedException ? 8 : 40);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            jr discarded$1 = ((wi) this).a(true, (Runnable) null, 68);
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof InterruptedException ? 8 : 40);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            ((wi) this).field_a.join();
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof InterruptedException ? 11 : 40);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var2_ref = (InterruptedException) (Object) caughtException;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (((wi) this).field_l == null) {
                                statePc = 17;
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
                            ((wi) this).field_l.b(0);
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof IOException ? 16 : 15);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var2_ref2 = (IOException) (Object) caughtException;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (null == ((wi) this).field_d) {
                                statePc = 22;
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
                            ((wi) this).field_d.b(0);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 21 : 20);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var2_ref2 = (IOException) (Object) caughtException;
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (((wi) this).field_i == null) {
                                statePc = 34;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var2_int = 0;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (((wi) this).field_i.length <= var2_int) {
                                statePc = 34;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof InterruptedException ? 27 : 40);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (null != ((wi) this).field_i[var2_int]) {
                                statePc = 30;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof InterruptedException ? 29 : 40);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof InterruptedException ? 29 : 40);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof InterruptedException ? 29 : 40);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof InterruptedException ? 29 : 40);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            ((wi) this).field_i[var2_int].b(0);
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 32 : 40);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var2_int++;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (((wi) this).field_n == null) {
                                statePc = 41;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            ((wi) this).field_n.b(0);
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof IOException ? 38 : 37);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 37;
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
                            var2_ref2 = (IOException) (Object) caughtException;
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        var2_ref3 = (RuntimeException) (Object) caughtException;
                        throw var2_ref3;
                    }
                    case 41: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void run() {
        try {
            jr var1 = null;
            RuntimeException var1_ref = null;
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            hh var3_ref = null;
            Exception var3_ref2 = null;
            Thread var3_ref3 = null;
            Object[] var3_array = null;
            java.awt.datatransfer.Transferable var3_ref4 = null;
            int var3_int = 0;
            String var3_ref5 = null;
            Throwable var4 = null;
            java.awt.datatransfer.Clipboard var4_ref = null;
            int var4_int = 0;
            java.awt.Component var4_ref2 = null;
            int var5 = 0;
            Throwable var6 = null;
            int stackIn_103_0 = 0;
            int stackIn_110_0 = 0;
            int stackIn_119_0 = 0;
            String stackIn_140_0 = null;
            int stackOut_102_0 = 0;
            int stackOut_109_0 = 0;
            int stackOut_116_0 = 0;
            int stackOut_118_0 = 0;
            String stackOut_139_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var2 = this;
                            // monitorenter this
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 190;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            if (((wi) this).field_m) {
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
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            // monitorexit var2
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        return;
                    }
                    case 6: {
                        try {
                            if (null == ((wi) this).field_k) {
                                statePc = 11;
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
                            var1 = ((wi) this).field_k;
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
                            ((wi) this).field_k = ((wi) this).field_k.field_f;
                            if (((wi) this).field_k != null) {
                                statePc = 14;
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
                            ((wi) this).field_x = null;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            this.wait();
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof InterruptedException ? 13 : 16);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var3 = (InterruptedException) (Object) caughtException;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            // monitorexit var2
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
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 190;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var4 = caughtException;
                            // monitorexit var2
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            throw (RuntimeException) (Object) var4;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 190;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var2_int = var1.field_b;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (-2 == (var2_int ^ -1)) {
                                statePc = 175;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (22 != var2_int) {
                                statePc = 32;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (field_c > wq.a(-96)) {
                                statePc = 28;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var1.field_d = (Object) (Object) rf.a((String) var1.field_a, var1.field_g, true).b((byte) 61);
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof hh ? 31 : (stateCaught_29 instanceof ThreadDeath ? 182 : 183));
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            statePc = 180;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var3_ref = (hh) (Object) caughtException;
                            var1.field_d = (Object) (Object) var3_ref.getMessage();
                            throw var3_ref;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if ((var2_int ^ -1) != -3) {
                                statePc = 34;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var3_ref3 = new Thread((Runnable) var1.field_a);
                            var3_ref3.setDaemon(true);
                            var3_ref3.start();
                            var3_ref3.setPriority(var1.field_g);
                            var1.field_d = (Object) (Object) var3_ref3;
                            statePc = 180;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (-5 == (var2_int ^ -1)) {
                                statePc = 171;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (-9 != (var2_int ^ -1)) {
                                statePc = 47;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            var3_array = (Object[]) var1.field_a;
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (((wi) this).field_f) {
                                statePc = 42;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (null == ((Class) var3_array[0]).getClassLoader()) {
                                statePc = 45;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            var1.field_d = (Object) (Object) ((Class) var3_array[0]).getDeclaredMethod((String) var3_array[1], (Class[]) var3_array[2]);
                            statePc = 180;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if ((var2_int ^ -1) != -10) {
                                statePc = 56;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            var3_array = (Object[]) var1.field_a;
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            if (((wi) this).field_f) {
                                statePc = 52;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if (null != ((Class) var3_array[0]).getClassLoader()) {
                                statePc = 55;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            var1.field_d = (Object) (Object) ((Class) var3_array[0]).getDeclaredField((String) var3_array[1]);
                            statePc = 180;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            if (18 != var2_int) {
                                statePc = 58;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            var3_ref3 = (Thread) (Object) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var1.field_d = (Object) (Object) ((java.awt.datatransfer.Clipboard) (Object) var3_ref3).getContents((Object) null);
                            statePc = 180;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if (var2_int == 19) {
                                statePc = 170;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            if (((wi) this).field_f) {
                                statePc = 64;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            if (var2_int != 3) {
                                statePc = 71;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            if (field_c <= wq.a(-106)) {
                                statePc = 70;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            var3_ref3 = (Thread) (Object) ((var1.field_g >> -884897608 & 255) + "." + (var1.field_g >> 76807024 & 255) + "." + ((var1.field_g & 65425) >> -460963224) + "." + (var1.field_g & 255));
                            var1.field_d = (Object) (Object) java.net.InetAddress.getByName((String) (Object) var3_ref3).getHostName();
                            statePc = 180;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = (stateCaught_70 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            if (-22 != (var2_int ^ -1)) {
                                statePc = 79;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = (stateCaught_71 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            if ((wq.a(-18) ^ -1L) > (field_c ^ -1L)) {
                                statePc = 77;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = (stateCaught_72 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            statePc = 75;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = (stateCaught_75 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = (stateCaught_77 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            var1.field_d = (Object) (Object) java.net.InetAddress.getByName((String) var1.field_a).getAddress();
                            statePc = 180;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            if (-6 != (var2_int ^ -1)) {
                                statePc = 86;
                            } else {
                                statePc = 80;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            if (((wi) this).field_t) {
                                statePc = 85;
                            } else {
                                statePc = 81;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = (stateCaught_80 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            statePc = 83;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = (stateCaught_81 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            var1.field_d = Class.forName("cu").getMethod("listmodes", new Class[0]).invoke(((wi) this).field_r, new Object[0]);
                            statePc = 180;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = (stateCaught_83 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            var1.field_d = (Object) (Object) ((wi) this).field_w.a((byte) -128);
                            statePc = 180;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = (stateCaught_85 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            if (-7 == (var2_int ^ -1)) {
                                statePc = 164;
                            } else {
                                statePc = 87;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = (stateCaught_86 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            if (-8 != (var2_int ^ -1)) {
                                statePc = 96;
                            } else {
                                statePc = 88;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = (stateCaught_87 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            statePc = 90;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = (stateCaught_88 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            if (!((wi) this).field_t) {
                                statePc = 95;
                            } else {
                                statePc = 91;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = (stateCaught_90 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = (stateCaught_91 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            ((wi) this).field_w.a((java.awt.Frame) var1.field_a, 8);
                            statePc = 180;
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = (stateCaught_93 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            Object discarded$6 = Class.forName("cu").getMethod("exit", new Class[0]).invoke(((wi) this).field_r, new Object[0]);
                            statePc = 180;
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = (stateCaught_95 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            if (12 != var2_int) {
                                statePc = 98;
                            } else {
                                statePc = 97;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = (stateCaught_96 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            var3_ref3 = (Thread) (Object) wi.a(field_p, true, (String) var1.field_a, field_j);
                            var1.field_d = (Object) (Object) var3_ref3;
                            statePc = 180;
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = (stateCaught_97 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            if (-14 == (var2_int ^ -1)) {
                                statePc = 163;
                            } else {
                                statePc = 99;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = (stateCaught_98 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            if (!((wi) this).field_f) {
                                statePc = 106;
                            } else {
                                statePc = 100;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = (stateCaught_99 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            statePc = 102;
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = (stateCaught_100 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            stackOut_102_0 = 14;
                            stackIn_103_0 = stackOut_102_0;
                            statePc = 103;
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = (stateCaught_102 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            if (stackIn_103_0 == var2_int) {
                                statePc = 157;
                            } else {
                                statePc = 104;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = (stateCaught_103 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = (stateCaught_104 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            if (!((wi) this).field_f) {
                                statePc = 125;
                            } else {
                                statePc = 107;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = (stateCaught_106 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = (stateCaught_107 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            stackOut_109_0 = var2_int;
                            stackIn_110_0 = stackOut_109_0;
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = (stateCaught_109 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        try {
                            if (stackIn_110_0 != 15) {
                                statePc = 125;
                            } else {
                                statePc = 111;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_110) {
                            caughtException = stateCaught_110;
                            statePc = (stateCaught_110 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        try {
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_111) {
                            caughtException = stateCaught_111;
                            statePc = (stateCaught_111 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 113: {
                        try {
                            if (-1 == (var1.field_g ^ -1)) {
                                statePc = 118;
                            } else {
                                statePc = 114;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_113) {
                            caughtException = stateCaught_113;
                            statePc = (stateCaught_113 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 114: {
                        try {
                            statePc = 116;
                            continue stateLoop;
                        } catch (Throwable stateCaught_114) {
                            caughtException = stateCaught_114;
                            statePc = (stateCaught_114 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 116: {
                        try {
                            stackOut_116_0 = 1;
                            stackIn_119_0 = stackOut_116_0;
                            statePc = 119;
                            continue stateLoop;
                        } catch (Throwable stateCaught_116) {
                            caughtException = stateCaught_116;
                            statePc = (stateCaught_116 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 118: {
                        try {
                            stackOut_118_0 = 0;
                            stackIn_119_0 = stackOut_118_0;
                            statePc = 119;
                            continue stateLoop;
                        } catch (Throwable stateCaught_118) {
                            caughtException = stateCaught_118;
                            statePc = (stateCaught_118 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 119: {
                        try {
                            var3_int = stackIn_119_0;
                            var4_ref2 = (java.awt.Component) var1.field_a;
                            statePc = 120;
                            continue stateLoop;
                        } catch (Throwable stateCaught_119) {
                            caughtException = stateCaught_119;
                            statePc = (stateCaught_119 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 120: {
                        try {
                            if (((wi) this).field_t) {
                                statePc = 123;
                            } else {
                                statePc = 121;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_120) {
                            caughtException = stateCaught_120;
                            statePc = (stateCaught_120 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 121: {
                        try {
                            Object discarded$7 = Class.forName("cg").getDeclaredMethod("showcursor", new Class[2]).invoke(((wi) this).field_v, new Object[2]);
                            statePc = 124;
                            continue stateLoop;
                        } catch (Throwable stateCaught_121) {
                            caughtException = stateCaught_121;
                            statePc = (stateCaught_121 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 123: {
                        try {
                            ((wi) this).field_b.a(false, var3_int != 0, var4_ref2);
                            statePc = 124;
                            continue stateLoop;
                        } catch (Throwable stateCaught_123) {
                            caughtException = stateCaught_123;
                            statePc = (stateCaught_123 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 124: {
                        try {
                            statePc = 180;
                            continue stateLoop;
                        } catch (Throwable stateCaught_124) {
                            caughtException = stateCaught_124;
                            statePc = (stateCaught_124 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 125: {
                        try {
                            if (((wi) this).field_t) {
                                statePc = 130;
                            } else {
                                statePc = 126;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_125) {
                            caughtException = stateCaught_125;
                            statePc = (stateCaught_125 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 126: {
                        try {
                            if (-18 != (var2_int ^ -1)) {
                                statePc = 130;
                            } else {
                                statePc = 127;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_126) {
                            caughtException = stateCaught_126;
                            statePc = (stateCaught_126 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 127: {
                        try {
                            statePc = 129;
                            continue stateLoop;
                        } catch (Throwable stateCaught_127) {
                            caughtException = stateCaught_127;
                            statePc = (stateCaught_127 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 129: {
                        try {
                            var3_array = (Object[]) var1.field_a;
                            Object discarded$8 = Class.forName("cg").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((wi) this).field_v, new Object[5]);
                            statePc = 180;
                            continue stateLoop;
                        } catch (Throwable stateCaught_129) {
                            caughtException = stateCaught_129;
                            statePc = (stateCaught_129 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 130: {
                        try {
                            if (16 == var2_int) {
                                statePc = 133;
                            } else {
                                statePc = 131;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_130) {
                            caughtException = stateCaught_130;
                            statePc = (stateCaught_130 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 131: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_131) {
                            caughtException = stateCaught_131;
                            statePc = (stateCaught_131 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 133: {
                        try {
                            if (!field_o.startsWith("win")) {
                                statePc = 136;
                            } else {
                                statePc = 134;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_133) {
                            caughtException = stateCaught_133;
                            statePc = (stateCaught_133 instanceof Exception ? 156 : (stateCaught_133 instanceof ThreadDeath ? 182 : 183));
                            continue stateLoop;
                        }
                    }
                    case 134: {
                        try {
                            statePc = 137;
                            continue stateLoop;
                        } catch (Throwable stateCaught_134) {
                            caughtException = stateCaught_134;
                            statePc = (stateCaught_134 instanceof Exception ? 156 : (stateCaught_134 instanceof ThreadDeath ? 182 : 183));
                            continue stateLoop;
                        }
                    }
                    case 136: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_136) {
                            caughtException = stateCaught_136;
                            statePc = (stateCaught_136 instanceof Exception ? 156 : (stateCaught_136 instanceof ThreadDeath ? 182 : 183));
                            continue stateLoop;
                        }
                    }
                    case 137: {
                        try {
                            var3_ref5 = (String) var1.field_a;
                            statePc = 138;
                            continue stateLoop;
                        } catch (Throwable stateCaught_137) {
                            caughtException = stateCaught_137;
                            statePc = (stateCaught_137 instanceof Exception ? 156 : (stateCaught_137 instanceof ThreadDeath ? 182 : 183));
                            continue stateLoop;
                        }
                    }
                    case 138: {
                        try {
                            if (var3_ref5.startsWith("http://")) {
                                statePc = 146;
                            } else {
                                statePc = 139;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_138) {
                            caughtException = stateCaught_138;
                            statePc = (stateCaught_138 instanceof Exception ? 156 : (stateCaught_138 instanceof ThreadDeath ? 182 : 183));
                            continue stateLoop;
                        }
                    }
                    case 139: {
                        try {
                            stackOut_139_0 = (String) var3_ref5;
                            stackIn_140_0 = stackOut_139_0;
                            statePc = 140;
                            continue stateLoop;
                        } catch (Throwable stateCaught_139) {
                            caughtException = stateCaught_139;
                            statePc = (stateCaught_139 instanceof Exception ? 156 : (stateCaught_139 instanceof ThreadDeath ? 182 : 183));
                            continue stateLoop;
                        }
                    }
                    case 140: {
                        try {
                            if (!((String) (Object) stackIn_140_0).startsWith("https://")) {
                                statePc = 145;
                            } else {
                                statePc = 141;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_140) {
                            caughtException = stateCaught_140;
                            statePc = (stateCaught_140 instanceof Exception ? 156 : (stateCaught_140 instanceof ThreadDeath ? 182 : 183));
                            continue stateLoop;
                        }
                    }
                    case 141: {
                        try {
                            statePc = 143;
                            continue stateLoop;
                        } catch (Throwable stateCaught_141) {
                            caughtException = stateCaught_141;
                            statePc = (stateCaught_141 instanceof Exception ? 156 : (stateCaught_141 instanceof ThreadDeath ? 182 : 183));
                            continue stateLoop;
                        }
                    }
                    case 143: {
                        try {
                            statePc = 146;
                            continue stateLoop;
                        } catch (Throwable stateCaught_143) {
                            caughtException = stateCaught_143;
                            statePc = (stateCaught_143 instanceof Exception ? 156 : (stateCaught_143 instanceof ThreadDeath ? 182 : 183));
                            continue stateLoop;
                        }
                    }
                    case 145: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_145) {
                            caughtException = stateCaught_145;
                            statePc = (stateCaught_145 instanceof Exception ? 156 : (stateCaught_145 instanceof ThreadDeath ? 182 : 183));
                            continue stateLoop;
                        }
                    }
                    case 146: {
                        try {
                            var4_ref = (java.awt.datatransfer.Clipboard) (Object) "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            var5 = 0;
                            statePc = 147;
                            continue stateLoop;
                        } catch (Throwable stateCaught_146) {
                            caughtException = stateCaught_146;
                            statePc = (stateCaught_146 instanceof Exception ? 156 : (stateCaught_146 instanceof ThreadDeath ? 182 : 183));
                            continue stateLoop;
                        }
                    }
                    case 147: {
                        try {
                            if ((var3_ref5.length() ^ -1) >= (var5 ^ -1)) {
                                statePc = 154;
                            } else {
                                statePc = 148;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_147) {
                            caughtException = stateCaught_147;
                            statePc = (stateCaught_147 instanceof Exception ? 156 : (stateCaught_147 instanceof ThreadDeath ? 182 : 183));
                            continue stateLoop;
                        }
                    }
                    case 148: {
                        try {
                            if (((String) (Object) var4_ref).indexOf((int) var3_ref5.charAt(var5)) != -1) {
                                statePc = 153;
                            } else {
                                statePc = 149;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_148) {
                            caughtException = stateCaught_148;
                            statePc = (stateCaught_148 instanceof Exception ? 156 : (stateCaught_148 instanceof ThreadDeath ? 182 : 183));
                            continue stateLoop;
                        }
                    }
                    case 149: {
                        try {
                            statePc = 151;
                            continue stateLoop;
                        } catch (Throwable stateCaught_149) {
                            caughtException = stateCaught_149;
                            statePc = (stateCaught_149 instanceof Exception ? 156 : (stateCaught_149 instanceof ThreadDeath ? 182 : 183));
                            continue stateLoop;
                        }
                    }
                    case 151: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_151) {
                            caughtException = stateCaught_151;
                            statePc = (stateCaught_151 instanceof Exception ? 156 : (stateCaught_151 instanceof ThreadDeath ? 182 : 183));
                            continue stateLoop;
                        }
                    }
                    case 153: {
                        try {
                            var5++;
                            statePc = 147;
                            continue stateLoop;
                        } catch (Throwable stateCaught_153) {
                            caughtException = stateCaught_153;
                            statePc = (stateCaught_153 instanceof Exception ? 156 : (stateCaught_153 instanceof ThreadDeath ? 182 : 183));
                            continue stateLoop;
                        }
                    }
                    case 154: {
                        try {
                            Process discarded$9 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var3_ref5 + "\"");
                            var1.field_d = null;
                            statePc = 155;
                            continue stateLoop;
                        } catch (Throwable stateCaught_154) {
                            caughtException = stateCaught_154;
                            statePc = (stateCaught_154 instanceof Exception ? 156 : (stateCaught_154 instanceof ThreadDeath ? 182 : 183));
                            continue stateLoop;
                        }
                    }
                    case 155: {
                        try {
                            statePc = 180;
                            continue stateLoop;
                        } catch (Throwable stateCaught_155) {
                            caughtException = stateCaught_155;
                            statePc = (stateCaught_155 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 156: {
                        try {
                            var3_ref2 = (Exception) (Object) caughtException;
                            var1.field_d = (Object) (Object) var3_ref2;
                            throw (RuntimeException) (Object) var3_ref2;
                        } catch (Throwable stateCaught_156) {
                            caughtException = stateCaught_156;
                            statePc = (stateCaught_156 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 157: {
                        try {
                            var3_int = var1.field_g;
                            var4_int = var1.field_e;
                            statePc = 158;
                            continue stateLoop;
                        } catch (Throwable stateCaught_157) {
                            caughtException = stateCaught_157;
                            statePc = (stateCaught_157 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 158: {
                        try {
                            if (!((wi) this).field_t) {
                                statePc = 161;
                            } else {
                                statePc = 159;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_158) {
                            caughtException = stateCaught_158;
                            statePc = (stateCaught_158 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 159: {
                        try {
                            ((wi) this).field_b.a(var4_int, var3_int, (byte) 84);
                            statePc = 162;
                            continue stateLoop;
                        } catch (Throwable stateCaught_159) {
                            caughtException = stateCaught_159;
                            statePc = (stateCaught_159 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 161: {
                        try {
                            Object discarded$10 = Class.forName("cg").getDeclaredMethod("movemouse", new Class[2]).invoke(((wi) this).field_v, new Object[2]);
                            statePc = 162;
                            continue stateLoop;
                        } catch (Throwable stateCaught_161) {
                            caughtException = stateCaught_161;
                            statePc = (stateCaught_161 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 162: {
                        try {
                            statePc = 180;
                            continue stateLoop;
                        } catch (Throwable stateCaught_162) {
                            caughtException = stateCaught_162;
                            statePc = (stateCaught_162 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 163: {
                        try {
                            var3_ref3 = (Thread) (Object) wi.a("", true, (String) var1.field_a, field_j);
                            var1.field_d = (Object) (Object) var3_ref3;
                            statePc = 180;
                            continue stateLoop;
                        } catch (Throwable stateCaught_163) {
                            caughtException = stateCaught_163;
                            statePc = (stateCaught_163 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 164: {
                        try {
                            var3_ref3 = (Thread) (Object) new java.awt.Frame("Jagex Full Screen");
                            statePc = 165;
                            continue stateLoop;
                        } catch (Throwable stateCaught_164) {
                            caughtException = stateCaught_164;
                            statePc = (stateCaught_164 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 165: {
                        try {
                            var1.field_d = (Object) (Object) var3_ref3;
                            ((java.awt.Frame) (Object) var3_ref3).setResizable(false);
                            if (((wi) this).field_t) {
                                statePc = 168;
                            } else {
                                statePc = 166;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_165) {
                            caughtException = stateCaught_165;
                            statePc = (stateCaught_165 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 166: {
                        try {
                            Object discarded$11 = Class.forName("cu").getMethod("enter", new Class[5]).invoke(((wi) this).field_r, new Object[5]);
                            statePc = 169;
                            continue stateLoop;
                        } catch (Throwable stateCaught_166) {
                            caughtException = stateCaught_166;
                            statePc = (stateCaught_166 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 168: {
                        try {
                            ((wi) this).field_w.a(var1.field_g & 65535, (byte) -123, var1.field_g >>> 254430288, var1.field_e & 65535, var1.field_e >> -2084239760, (java.awt.Frame) (Object) var3_ref3);
                            statePc = 169;
                            continue stateLoop;
                        } catch (Throwable stateCaught_168) {
                            caughtException = stateCaught_168;
                            statePc = (stateCaught_168 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 169: {
                        try {
                            statePc = 180;
                            continue stateLoop;
                        } catch (Throwable stateCaught_169) {
                            caughtException = stateCaught_169;
                            statePc = (stateCaught_169 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 170: {
                        try {
                            var3_ref4 = (java.awt.datatransfer.Transferable) var1.field_a;
                            var4_ref = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var4_ref.setContents(var3_ref4, (java.awt.datatransfer.ClipboardOwner) null);
                            statePc = 180;
                            continue stateLoop;
                        } catch (Throwable stateCaught_170) {
                            caughtException = stateCaught_170;
                            statePc = (stateCaught_170 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 171: {
                        try {
                            if (field_c <= wq.a(-94)) {
                                statePc = 174;
                            } else {
                                statePc = 172;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_171) {
                            caughtException = stateCaught_171;
                            statePc = (stateCaught_171 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 172: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_172) {
                            caughtException = stateCaught_172;
                            statePc = (stateCaught_172 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 174: {
                        try {
                            var1.field_d = (Object) (Object) new DataInputStream(((java.net.URL) var1.field_a).openStream());
                            statePc = 180;
                            continue stateLoop;
                        } catch (Throwable stateCaught_174) {
                            caughtException = stateCaught_174;
                            statePc = (stateCaught_174 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 175: {
                        try {
                            if (wq.a(-24) < field_c) {
                                statePc = 178;
                            } else {
                                statePc = 176;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_175) {
                            caughtException = stateCaught_175;
                            statePc = (stateCaught_175 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 176: {
                        try {
                            statePc = 179;
                            continue stateLoop;
                        } catch (Throwable stateCaught_176) {
                            caughtException = stateCaught_176;
                            statePc = (stateCaught_176 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 178: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_178) {
                            caughtException = stateCaught_178;
                            statePc = (stateCaught_178 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 179: {
                        try {
                            var1.field_d = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var1.field_a), var1.field_g);
                            statePc = 180;
                            continue stateLoop;
                        } catch (Throwable stateCaught_179) {
                            caughtException = stateCaught_179;
                            statePc = (stateCaught_179 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 180: {
                        try {
                            var1.field_c = 1;
                            statePc = 181;
                            continue stateLoop;
                        } catch (Throwable stateCaught_180) {
                            caughtException = stateCaught_180;
                            statePc = (stateCaught_180 instanceof ThreadDeath ? 182 : 183);
                            continue stateLoop;
                        }
                    }
                    case 181: {
                        try {
                            statePc = 184;
                            continue stateLoop;
                        } catch (Throwable stateCaught_181) {
                            caughtException = stateCaught_181;
                            statePc = 190;
                            continue stateLoop;
                        }
                    }
                    case 182: {
                        try {
                            var2_ref = (ThreadDeath) (Object) caughtException;
                            throw var2_ref;
                        } catch (Throwable stateCaught_182) {
                            caughtException = stateCaught_182;
                            statePc = 190;
                            continue stateLoop;
                        }
                    }
                    case 183: {
                        try {
                            var2_ref2 = caughtException;
                            var1.field_c = 2;
                            statePc = 184;
                            continue stateLoop;
                        } catch (Throwable stateCaught_183) {
                            caughtException = stateCaught_183;
                            statePc = 190;
                            continue stateLoop;
                        }
                    }
                    case 184: {
                        try {
                            var2 = (Object) (Object) var1;
                            // monitorenter var1
                            statePc = 185;
                            continue stateLoop;
                        } catch (Throwable stateCaught_184) {
                            caughtException = stateCaught_184;
                            statePc = 190;
                            continue stateLoop;
                        }
                    }
                    case 185: {
                        try {
                            ((Object) (Object) var1).notify();
                            // monitorexit var2
                            statePc = 186;
                            continue stateLoop;
                        } catch (Throwable stateCaught_185) {
                            caughtException = stateCaught_185;
                            statePc = 187;
                            continue stateLoop;
                        }
                    }
                    case 186: {
                        try {
                            statePc = 189;
                            continue stateLoop;
                        } catch (Throwable stateCaught_186) {
                            caughtException = stateCaught_186;
                            statePc = 190;
                            continue stateLoop;
                        }
                    }
                    case 187: {
                        try {
                            var6 = caughtException;
                            // monitorexit var2
                            statePc = 188;
                            continue stateLoop;
                        } catch (Throwable stateCaught_187) {
                            caughtException = stateCaught_187;
                            statePc = 187;
                            continue stateLoop;
                        }
                    }
                    case 188: {
                        try {
                            throw (RuntimeException) (Object) var6;
                        } catch (Throwable stateCaught_188) {
                            caughtException = stateCaught_188;
                            statePc = 190;
                            continue stateLoop;
                        }
                    }
                    case 189: {
                        try {
                            statePc = 0;
                            continue stateLoop;
                        } catch (Throwable stateCaught_189) {
                            caughtException = stateCaught_189;
                            statePc = 190;
                            continue stateLoop;
                        }
                    }
                    case 190: {
                        var1_ref = (RuntimeException) (Object) caughtException;
                        throw var1_ref;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (!((wi) this).field_f) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = 0;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0 != 0;
                }
                case 5: {
                    try {
                        var2_int = -31 % ((param0 - 16) / 51);
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
                        if (((wi) this).field_t) {
                            statePc = 14;
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
                        if (((wi) this).field_r == null) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = 1;
                        stackIn_13_0 = stackOut_10_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 11;
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
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return stackIn_13_0 != 0;
                }
                case 14: {
                    try {
                        if (null == ((wi) this).field_w) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = 1;
                        stackIn_18_0 = stackOut_15_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackOut_17_0 = 0;
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
                    return stackIn_18_0 != 0;
                }
                case 19: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final jr a(int param0, Class param1, String param2, Class[] param3) {
        RuntimeException var5 = null;
        jr stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        jr stackOut_4_0 = null;
        try {
          try {
            L0: {
              if (param0 == 0) {
                break L0;
              } else {
                ((wi) this).field_i = null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = this.a((Object) (Object) new Object[3], 0, 0, false, 8);
          stackIn_5_0 = stackOut_4_0;
        }
        return null;
    }

    final jr a(boolean param0, Runnable param1, int param2) {
        RuntimeException var4 = null;
        Object stackIn_5_0 = null;
        Runnable stackIn_5_1 = null;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        Object stackIn_7_0 = null;
        Runnable stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        Object stackIn_8_0 = null;
        Runnable stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        jr stackIn_9_0 = null;
        Object stackOut_4_0 = null;
        Runnable stackOut_4_1 = null;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        Object stackOut_5_0 = null;
        Runnable stackOut_5_1 = null;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        Object stackOut_7_0 = null;
        Runnable stackOut_7_1 = null;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        jr stackOut_8_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0) {
                            statePc = 4;
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
                        boolean discarded$2 = ((wi) this).a((byte[]) null, -30, (File) null);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = this;
                        stackOut_4_1 = (Runnable) param1;
                        stackOut_4_2 = 0;
                        stackOut_4_3 = param2;
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        stackIn_7_2 = stackOut_4_2;
                        stackIn_7_3 = stackOut_4_3;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        stackIn_5_2 = stackOut_4_2;
                        stackIn_5_3 = stackOut_4_3;
                        if (param0) {
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
                        stackOut_5_0 = this;
                        stackOut_5_1 = (Runnable) (Object) stackIn_5_1;
                        stackOut_5_2 = stackIn_5_2;
                        stackOut_5_3 = stackIn_5_3;
                        stackOut_5_4 = 1;
                        stackIn_8_0 = stackOut_5_0;
                        stackIn_8_1 = stackOut_5_1;
                        stackIn_8_2 = stackOut_5_2;
                        stackIn_8_3 = stackOut_5_3;
                        stackIn_8_4 = stackOut_5_4;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = this;
                        stackOut_7_1 = (Runnable) (Object) stackIn_7_1;
                        stackOut_7_2 = stackIn_7_2;
                        stackOut_7_3 = stackIn_7_3;
                        stackOut_7_4 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        stackIn_8_2 = stackOut_7_2;
                        stackIn_8_3 = stackOut_7_3;
                        stackIn_8_4 = stackOut_7_4;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = this.a((Object) (Object) stackIn_8_1, stackIn_8_2, stackIn_8_3, stackIn_8_4 != 0, 2);
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return stackIn_9_0;
                }
                case 10: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final jr a(byte param0, String param1, int param2) {
        RuntimeException var4 = null;
        jr stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        jr stackOut_4_0 = null;
        try {
          try {
            L0: {
              if (param0 >= 8) {
                break L0;
              } else {
                field_j = 62;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = this.a(param2, param1, true, false);
          stackIn_5_0 = stackOut_4_0;
        }
        return null;
    }

    final boolean a(byte[] param0, int param1, File param2) {
        FileOutputStream var4 = null;
        IOException var4_ref = null;
        RuntimeException var4_ref2 = null;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var4 = new FileOutputStream(param2);
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = (stateCaught_0 instanceof IOException ? 7 : 8);
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (param1 == -31357) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = (stateCaught_1 instanceof IOException ? 4 : 8);
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        jr discarded$2 = ((wi) this).a(-111, (Class) null, (String) null, (Class[]) null);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = (stateCaught_2 instanceof IOException ? 4 : 8);
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = (stateCaught_3 instanceof IOException ? 7 : 8);
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = (stateCaught_4 instanceof IOException ? 7 : 8);
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var4.write(param0, 0, param0.length);
                        var4.close();
                        stackOut_5_0 = 1;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = (stateCaught_5 instanceof IOException ? 7 : 8);
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0 != 0;
                }
                case 7: {
                    try {
                        var4_ref = (IOException) (Object) caughtException;
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    var4_ref2 = (RuntimeException) (Object) caughtException;
                    throw var4_ref2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final jr a(byte param0, java.net.URL param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        jr stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        jr stackOut_3_0 = null;
        try {
          if (param0 > 71) {
            return (jr) (Object) stackIn_2_0;
          } else {
            stackOut_1_0 = null;
            stackIn_2_0 = stackOut_1_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_3_0 = this.a((Object) (Object) param1, 0, 0, false, 4);
          stackIn_4_0 = stackOut_3_0;
        }
        return null;
    }

    final jr a(java.awt.Frame param0, int param1) {
        RuntimeException var3 = null;
        jr stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        jr stackOut_4_0 = null;
        try {
          try {
            L0: {
              if (param1 == 19) {
                break L0;
              } else {
                boolean discarded$2 = ((wi) this).a((byte) -116);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = this.a((Object) (Object) param0, 0, 0, false, 7);
          stackIn_5_0 = stackOut_4_0;
        }
        return null;
    }

    final jr b(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        jr stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        jr stackOut_0_0 = null;
        try {
          var2_int = -105 % ((73 - param0) / 41);
          stackOut_0_0 = this.a((Object) null, 0, 0, false, 5);
          stackIn_1_0 = stackOut_0_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_1_0;
        }
        return null;
    }

    final jr a(int param0, String param1, Class param2) {
        RuntimeException var4 = null;
        jr stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        jr stackOut_4_0 = null;
        try {
          try {
            L0: {
              if (param0 == 0) {
                break L0;
              } else {
                jr discarded$2 = ((wi) this).a(-2, (String) null, (Class) null);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = this.a((Object) (Object) new Object[2], 0, 0, false, 9);
          stackIn_5_0 = stackOut_4_0;
        }
        return null;
    }

    final jr a(boolean param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        Object stackIn_2_0 = null;
        jr stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        jr stackOut_3_0 = null;
        try {
          if (!param0) {
            return (jr) (Object) stackIn_2_0;
          } else {
            stackOut_1_0 = null;
            stackIn_2_0 = stackOut_1_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_3_0 = this.a((Object) null, param1 + (param2 << 1698487824), param4 + (param3 << -551835248), false, 6);
          stackIn_4_0 = stackOut_3_0;
        }
        return null;
    }

    wi(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        RuntimeException var5_ref2 = null;
        int var5_int = 0;
        ThreadGroup var5_ref3 = null;
        ThreadGroup var6 = null;
        Thread[] var7 = null;
        int var8 = 0;
        Thread[] stackIn_75_0 = null;
        Thread[] stackOut_74_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    ((wi) this).field_l = null;
                    ((wi) this).field_m = false;
                    ((wi) this).field_f = false;
                    ((wi) this).field_t = false;
                    ((wi) this).field_k = null;
                    ((wi) this).field_x = null;
                    ((wi) this).field_n = null;
                    ((wi) this).field_d = null;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        field_u = "Unknown";
                        ((wi) this).field_f = param3;
                        field_p = param1;
                        field_j = param0;
                        field_q = "1.1";
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_u = System.getProperty("java.vendor");
                        field_q = System.getProperty("java.version");
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = (stateCaught_2 instanceof Exception ? 4 : 84);
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((field_u.toLowerCase().indexOf("microsoft") ^ -1) != 0) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = (stateCaught_5 instanceof Exception ? 7 : 84);
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = (stateCaught_6 instanceof Exception ? 7 : 84);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ((wi) this).field_t = true;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        field_h = System.getProperty("os.name");
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = (stateCaught_9 instanceof Exception ? 11 : 84);
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5 = (Exception) (Object) caughtException;
                        field_h = "Unknown";
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        field_o = field_h.toLowerCase();
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        String discarded$5 = System.getProperty("os.arch").toLowerCase();
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = (stateCaught_13 instanceof Exception ? 15 : 84);
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        String discarded$6 = System.getProperty("os.version").toLowerCase();
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = (stateCaught_16 instanceof Exception ? 18 : 84);
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        field_s = System.getProperty("user.home");
                        if (field_s == null) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = (stateCaught_19 instanceof Exception ? 22 : 84);
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        field_s = field_s + "/";
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = (stateCaught_20 instanceof Exception ? 22 : 84);
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (null == field_s) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = (stateCaught_23 instanceof Exception ? 25 : 84);
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = (stateCaught_24 instanceof Exception ? 25 : 84);
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        field_s = "~/";
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        ((wi) this).field_g = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var5_ref = caughtException;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (!((wi) this).field_t) {
                            statePc = 33;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = (stateCaught_30 instanceof Exception ? 32 : 84);
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = (stateCaught_31 instanceof Exception ? 32 : 84);
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        java.lang.reflect.Method discarded$7 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[1]);
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = (stateCaught_33 instanceof Exception ? 35 : 84);
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        field_e = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = (stateCaught_36 instanceof Exception ? 38 : 84);
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        el.a(0, field_j, field_p);
                        if (!((wi) this).field_f) {
                            statePc = 62;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        ((wi) this).field_n = new sr(el.a((String) null, field_j, 95, "random.dat"), "rw", 25L);
                        ((wi) this).field_l = new sr(el.a("main_file_cache.dat2", (byte) -8), "rw", 314572800L);
                        ((wi) this).field_d = new sr(el.a("main_file_cache.idx255", (byte) -8), "rw", 1048576L);
                        ((wi) this).field_i = new sr[param2];
                        var5_int = 0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if ((param2 ^ -1) >= (var5_int ^ -1)) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = (stateCaught_41 instanceof Exception ? 43 : 84);
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        ((wi) this).field_i[var5_int] = new sr(el.a("main_file_cache.idx" + var5_int, (byte) -8), "rw", 1048576L);
                        var5_int++;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = (stateCaught_42 instanceof Exception ? 43 : 84);
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (((wi) this).field_t) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = (stateCaught_44 instanceof Exception ? 46 : 84);
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = (stateCaught_45 instanceof Exception ? 46 : 84);
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        Object discarded$8 = Class.forName("uf").newInstance();
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var5_ref = caughtException;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (!((wi) this).field_t) {
                            statePc = 53;
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
                        ((wi) this).field_w = new ep();
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        ((wi) this).field_r = Class.forName("cu").newInstance();
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var5_ref = caughtException;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (((wi) this).field_t) {
                            statePc = 59;
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
                        ((wi) this).field_v = Class.forName("cg").newInstance();
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        ((wi) this).field_b = new bm();
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
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var5_ref = caughtException;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (!((wi) this).field_f) {
                            statePc = 82;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = (stateCaught_62 instanceof Exception ? 65 : 84);
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (((wi) this).field_t) {
                            statePc = 82;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = (stateCaught_63 instanceof Exception ? 65 : 84);
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var5_ref3 = Thread.currentThread().getThreadGroup();
                        var6 = var5_ref3.getParent();
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (var6 == null) {
                            statePc = 69;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var5_ref3 = var6;
                        var6 = var5_ref3.getParent();
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var7 = new Thread[1000];
                        int discarded$9 = var5_ref3.enumerate(var7);
                        var8 = 0;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if ((var8 ^ -1) <= (var7.length ^ -1)) {
                            statePc = 82;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = (stateCaught_70 instanceof Exception ? 73 : 84);
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (var7[var8] == null) {
                            statePc = 81;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = (stateCaught_71 instanceof Exception ? 77 : 84);
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = (stateCaught_72 instanceof Exception ? 77 : 84);
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = (stateCaught_73 instanceof Exception ? 77 : 84);
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        stackOut_74_0 = (Thread[]) var7;
                        stackIn_75_0 = stackOut_74_0;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = (stateCaught_74 instanceof Exception ? 77 : 84);
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (((Thread) (Object) stackIn_75_0[var8]).getName().startsWith("AWT")) {
                            statePc = 80;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = (stateCaught_75 instanceof Exception ? 79 : 84);
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = (stateCaught_76 instanceof Exception ? 79 : 84);
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = (stateCaught_77 instanceof Exception ? 79 : 84);
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = (stateCaught_78 instanceof Exception ? 79 : 84);
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        var7[var8].setPriority(1);
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var8++;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        ((wi) this).field_m = false;
                        ((wi) this).field_a = new Thread((Runnable) this);
                        ((wi) this).field_a.setPriority(10);
                        ((wi) this).field_a.setDaemon(true);
                        ((wi) this).field_a.start();
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 84: {
                    var5_ref2 = (RuntimeException) (Object) caughtException;
                    throw var5_ref2;
                }
                case 85: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0L;
    }
}
