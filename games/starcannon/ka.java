/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ka implements Runnable {
    private Object field_m;
    static String field_o;
    private static String field_j;
    cb field_c;
    private qh field_b;
    static String field_l;
    cb field_t;
    java.awt.EventQueue field_w;
    private boolean field_g;
    cb[] field_q;
    private boolean field_f;
    private bk field_h;
    private static String field_v;
    private static String field_u;
    private bk field_x;
    private Thread field_d;
    boolean field_n;
    private static volatile long field_k;
    static String field_r;
    private uk field_i;
    private Object field_s;
    cb field_e;
    static java.lang.reflect.Method field_p;
    private static int field_a;

    private final bk a(int param0, int param1, int param2, int param3, Object param4) {
        bk var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Object stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = new bk();
                    var6.field_g = param4;
                    var6.field_e = param2;
                    var6.field_a = param0;
                    var6.field_d = param1;
                    var7 = this;
                    // monitorenter this
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3 == 16266) {
                            statePc = 4;
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
                        // monitorexit var7
                        stackOut_2_0 = null;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return (bk) (Object) stackIn_3_0;
                }
                case 4: {
                    try {
                        if (((ka) this).field_x == null) {
                            statePc = 6;
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
                        ((ka) this).field_x.field_c = var6;
                        ((ka) this).field_x = var6;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ((ka) this).field_h = var6;
                        ((ka) this).field_x = var6;
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
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
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
                    throw (RuntimeException) (Object) var8;
                }
                case 11: {
                    return var6;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final bk a(byte param0, java.net.URL param1) {
        if (param0 != -10) {
            return null;
        }
        return this.a(4, 0, 0, 16266, (Object) (Object) param1);
    }

    private final static cb a(byte param0, String param1, String param2, int param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            cb var8_ref = null;
            Object var9 = null;
            cb stackIn_12_0 = null;
            Throwable decompiledCaughtException = null;
            cb stackOut_11_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (-34 != (param3 ^ -1)) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        var4 = "jagex_" + param1 + "_preferences" + param2 + "_rc.dat";
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 2: {
                        if (-35 == (param3 ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        var4 = "jagex_" + param1 + "_preferences" + param2 + ".dat";
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 4: {
                        var4 = "jagex_" + param1 + "_preferences" + param2 + "_wip.dat";
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        var5_array = new String[]{"c:/rscache/", "/rscache/", field_v, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
                        var6 = 0;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        if (var6 >= var5_array.length) {
                            statePc = 14;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        var7 = var5_array[var6];
                        if (-1 <= (var7.length() ^ -1)) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        if (new File(var7).exists()) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        var6++;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 11: {
                        try {
                            var8_ref = new cb(new File(var7, var4), "rw", 10000L);
                            stackOut_11_0 = (cb) var8_ref;
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
                        var8 = (Exception) (Object) caughtException;
                        var6++;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 14: {
                        if (param0 > -64) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        return null;
                    }
                    case 16: {
                        var9 = null;
                        cb discarded$1 = ka.a((byte) 123, (String) null, (String) null, -123);
                        return null;
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

    final bk a(int param0, int param1, Runnable param2) {
        if (param1 < 20) {
            bk discarded$0 = ((ka) this).a(72);
        }
        return this.a(2, 0, param0, 16266, (Object) (Object) param2);
    }

    private final bk a(int param0, String param1, boolean param2, int param3) {
        if (param3 != 22) {
            ((ka) this).field_c = null;
        }
        return this.a(!param2 ? 1 : 22, 0, param0, 16266, (Object) (Object) param1);
    }

    final bk a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != 2024561328) {
            return null;
        }
        return this.a(6, param0 + (param2 << -601627536), (param3 << 2024561328) + param1, param4 + -2024545062, (Object) null);
    }

    final bk a(int param0, int param1, String param2) {
        int var4 = 66 % ((-55 - param1) / 35);
        return this.a(param0, param2, false, 22);
    }

    final bk a(Class param0, int param1, String param2) {
        int var4 = -95 / ((param1 - -49) / 41);
        return this.a(9, 0, 0, 16266, (Object) (Object) new Object[2]);
    }

    final bk a(java.awt.Frame param0, int param1) {
        if (param1 != 12250) {
            Object var4 = null;
            cb discarded$0 = ka.a((byte) 6, (String) null, (String) null, 38);
        }
        return this.a(7, 0, 0, param1 + 4016, (Object) (Object) param0);
    }

    public final void run() {
        try {
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            Object var2_ref3 = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            Exception var3_ref = null;
            le var3_ref2 = null;
            cb var3_ref3 = null;
            int var3_int = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            bk var8 = null;
            Thread var9 = null;
            Object[] var10 = null;
            java.awt.datatransfer.Clipboard var11 = null;
            java.awt.datatransfer.Clipboard var12 = null;
            String var13 = null;
            java.awt.Frame var14 = null;
            String var15 = null;
            Object[] var16 = null;
            Object var17 = null;
            java.awt.Component var17_ref = null;
            Object[] var18 = null;
            int stackIn_89_0 = 0;
            int stackOut_87_0 = 0;
            int stackOut_88_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var17 = null;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        var2_ref3 = this;
                        // monitorenter this
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        try {
                            if (!((ka) this).field_f) {
                                statePc = 5;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            // monitorexit var2_ref3
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        return;
                    }
                    case 5: {
                        try {
                            if (((ka) this).field_h != null) {
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
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var8 = ((ka) this).field_h;
                            ((ka) this).field_h = ((ka) this).field_h.field_c;
                            if (null == ((ka) this).field_h) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            ((ka) this).field_x = null;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            this.wait();
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof InterruptedException ? 12 : 15);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var3 = (InterruptedException) (Object) caughtException;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            // monitorexit var2_ref3
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            var4_ref_Throwable = caughtException;
                            // monitorexit var2_ref3
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        throw (RuntimeException) (Object) var4_ref_Throwable;
                    }
                    case 17: {
                        try {
                            var2_int = var8.field_a;
                            if (-2 == (var2_int ^ -1)) {
                                statePc = 112;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (var2_int == 22) {
                                statePc = 107;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (var2_int != 2) {
                                statePc = 21;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var9 = new Thread((Runnable) var8.field_g);
                            var9.setDaemon(true);
                            var9.start();
                            var9.setPriority(var8.field_e);
                            var8.field_f = (Object) (Object) var9;
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (var2_int == 4) {
                                statePc = 104;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (8 != var2_int) {
                                statePc = 28;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var10 = (Object[]) var8.field_g;
                            if (((ka) this).field_n) {
                                statePc = 25;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (((Class) var10[0]).getClassLoader() != null) {
                                statePc = 27;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var8.field_f = (Object) (Object) ((Class) var10[0]).getDeclaredMethod((String) var10[1], (Class[]) var10[2]);
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (9 == var2_int) {
                                statePc = 99;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (var2_int != 18) {
                                statePc = 31;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var8.field_f = (Object) (Object) var11.getContents((Object) null);
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (19 != var2_int) {
                                statePc = 33;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var7 = (java.awt.datatransfer.Transferable) var8.field_g;
                            var12 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var12.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (!((ka) this).field_n) {
                                statePc = 98;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (var2_int != 3) {
                                statePc = 39;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (field_k > dd.b(104)) {
                                statePc = 37;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            var13 = (255 & var8.field_e >> -588319688) + "." + (var8.field_e >> -699538672 & 255) + "." + (255 & var8.field_e >> 1766734920) + "." + (255 & var8.field_e);
                            var8.field_f = (Object) (Object) java.net.InetAddress.getByName(var13).getHostName();
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (21 != var2_int) {
                                statePc = 44;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (dd.b(118) < field_k) {
                                statePc = 42;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            var8.field_f = (Object) (Object) java.net.InetAddress.getByName((String) var8.field_g).getAddress();
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if ((var2_int ^ -1) == -6) {
                                statePc = 95;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if ((var2_int ^ -1) != -7) {
                                statePc = 49;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            var14 = new java.awt.Frame("Jagex Full Screen");
                            var8.field_f = (Object) (Object) var14;
                            var14.setResizable(false);
                            if (!((ka) this).field_g) {
                                statePc = 48;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            ((ka) this).field_b.a(var8.field_d >> -290843824, 65535 & var8.field_e, 65535 & var8.field_d, var14, var8.field_e >>> -1759131472, (byte) -70);
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            Object discarded$6 = Class.forName("dj").getMethod("enter", new Class[5]).invoke(((ka) this).field_s, new Object[5]);
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            if (var2_int != 7) {
                                statePc = 53;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (!((ka) this).field_g) {
                                statePc = 52;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            ((ka) this).field_b.a((java.awt.Frame) var8.field_g, 8);
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            Object discarded$7 = Class.forName("dj").getMethod("exit", new Class[0]).invoke(((ka) this).field_s, new Object[0]);
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (var2_int != 12) {
                                statePc = 55;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            var3_ref3 = ka.a((byte) -73, field_j, (String) var8.field_g, field_a);
                            var8.field_f = (Object) (Object) var3_ref3;
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if (-14 != (var2_int ^ -1)) {
                                statePc = 57;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            var3_ref3 = ka.a((byte) -70, "", (String) var8.field_g, field_a);
                            var8.field_f = (Object) (Object) var3_ref3;
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            if (!((ka) this).field_n) {
                                statePc = 60;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if (-15 == (var2_int ^ -1)) {
                                statePc = 92;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            if (!((ka) this).field_n) {
                                statePc = 63;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (var2_int == -16) {
                                statePc = 86;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            if (((ka) this).field_g) {
                                statePc = 66;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            if (-18 == var2_int) {
                                statePc = 85;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            if (var2_int != 16) {
                                statePc = 84;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = (stateCaught_67 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if (!field_r.startsWith("win")) {
                                statePc = 70;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof Exception ? 83 : (stateCaught_68 instanceof ThreadDeath ? 117 : 118));
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = (stateCaught_69 instanceof Exception ? 83 : (stateCaught_69 instanceof ThreadDeath ? 117 : 118));
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = (stateCaught_70 instanceof Exception ? 83 : (stateCaught_70 instanceof ThreadDeath ? 117 : 118));
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            var15 = (String) var8.field_g;
                            if (var15.startsWith("http://")) {
                                statePc = 75;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = (stateCaught_71 instanceof Exception ? 83 : (stateCaught_71 instanceof ThreadDeath ? 117 : 118));
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            if (!var15.startsWith("https://")) {
                                statePc = 74;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = (stateCaught_72 instanceof Exception ? 83 : (stateCaught_72 instanceof ThreadDeath ? 117 : 118));
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            statePc = 75;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof Exception ? 83 : (stateCaught_73 instanceof ThreadDeath ? 117 : 118));
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = (stateCaught_74 instanceof Exception ? 83 : (stateCaught_74 instanceof ThreadDeath ? 117 : 118));
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            var5 = 0;
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = (stateCaught_75 instanceof Exception ? 83 : (stateCaught_75 instanceof ThreadDeath ? 117 : 118));
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            if (var15.length() <= var5) {
                                statePc = 81;
                            } else {
                                statePc = 77;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = (stateCaught_76 instanceof Exception ? 83 : (stateCaught_76 instanceof ThreadDeath ? 117 : 118));
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            if ((var4_ref.indexOf((int) var15.charAt(var5)) ^ -1) == 0) {
                                statePc = 79;
                            } else {
                                statePc = 78;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = (stateCaught_77 instanceof Exception ? 83 : (stateCaught_77 instanceof ThreadDeath ? 117 : 118));
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof Exception ? 83 : (stateCaught_78 instanceof ThreadDeath ? 117 : 118));
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof Exception ? 83 : (stateCaught_79 instanceof ThreadDeath ? 117 : 118));
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            var5++;
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = (stateCaught_80 instanceof Exception ? 83 : (stateCaught_80 instanceof ThreadDeath ? 117 : 118));
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            Process discarded$8 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var15 + "\"");
                            var8.field_f = null;
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = (stateCaught_81 instanceof Exception ? 83 : (stateCaught_81 instanceof ThreadDeath ? 117 : 118));
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = (stateCaught_82 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            var3_ref = (Exception) (Object) caughtException;
                            var8.field_f = (Object) (Object) var3_ref;
                            throw (RuntimeException) (Object) var3_ref;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = (stateCaught_83 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            var16 = (Object[]) var8.field_g;
                            Object discarded$9 = Class.forName("sf").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((ka) this).field_m, new Object[5]);
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = (stateCaught_85 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            if (var8.field_e == 0) {
                                statePc = 88;
                            } else {
                                statePc = 87;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = (stateCaught_86 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            stackOut_87_0 = 1;
                            stackIn_89_0 = stackOut_87_0;
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = (stateCaught_87 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            stackOut_88_0 = 0;
                            stackIn_89_0 = stackOut_88_0;
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = (stateCaught_88 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            var3_int = stackIn_89_0;
                            var17_ref = (java.awt.Component) var8.field_g;
                            if (((ka) this).field_g) {
                                statePc = 91;
                            } else {
                                statePc = 90;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = (stateCaught_89 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            Object discarded$10 = Class.forName("sf").getDeclaredMethod("showcursor", new Class[2]).invoke(((ka) this).field_m, new Object[2]);
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = (stateCaught_90 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            ((ka) this).field_i.a(var17_ref, 0, var3_int != 0);
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = (stateCaught_91 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            var3_int = var8.field_e;
                            var4 = var8.field_d;
                            if (!((ka) this).field_g) {
                                statePc = 94;
                            } else {
                                statePc = 93;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = (stateCaught_92 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            ((ka) this).field_i.a(var4, -4, var3_int);
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = (stateCaught_93 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            Object discarded$11 = Class.forName("sf").getDeclaredMethod("movemouse", new Class[2]).invoke(((ka) this).field_m, new Object[2]);
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = (stateCaught_94 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            if (!((ka) this).field_g) {
                                statePc = 97;
                            } else {
                                statePc = 96;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = (stateCaught_95 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            var8.field_f = (Object) (Object) ((ka) this).field_b.a(0);
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = (stateCaught_96 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            var8.field_f = Class.forName("dj").getMethod("listmodes", new Class[0]).invoke(((ka) this).field_s, new Object[0]);
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = (stateCaught_97 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = (stateCaught_98 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            var18 = (Object[]) var8.field_g;
                            if (((ka) this).field_n) {
                                statePc = 101;
                            } else {
                                statePc = 100;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = (stateCaught_99 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            statePc = 103;
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = (stateCaught_100 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            if (null != ((Class) var18[0]).getClassLoader()) {
                                statePc = 103;
                            } else {
                                statePc = 102;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = (stateCaught_101 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = (stateCaught_102 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            var8.field_f = (Object) (Object) ((Class) var18[0]).getDeclaredField((String) var18[1]);
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = (stateCaught_103 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            if ((dd.b(126) ^ -1L) <= (field_k ^ -1L)) {
                                statePc = 106;
                            } else {
                                statePc = 105;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = (stateCaught_104 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = (stateCaught_105 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            var8.field_f = (Object) (Object) new DataInputStream(((java.net.URL) var8.field_g).openStream());
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = (stateCaught_106 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            if (field_k <= dd.b(56)) {
                                statePc = 109;
                            } else {
                                statePc = 108;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = (stateCaught_107 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = (stateCaught_108 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            var8.field_f = (Object) (Object) hh.a(91, var8.field_e, (String) var8.field_g).a((byte) -42);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = (stateCaught_109 instanceof le ? 111 : (stateCaught_109 instanceof ThreadDeath ? 117 : 118));
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        try {
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_110) {
                            caughtException = stateCaught_110;
                            statePc = (stateCaught_110 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        try {
                            var3_ref2 = (le) (Object) caughtException;
                            var8.field_f = (Object) (Object) var3_ref2.getMessage();
                            throw var3_ref2;
                        } catch (Throwable stateCaught_111) {
                            caughtException = stateCaught_111;
                            statePc = (stateCaught_111 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 112: {
                        try {
                            if ((field_k ^ -1L) >= (dd.b(106) ^ -1L)) {
                                statePc = 114;
                            } else {
                                statePc = 113;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_112) {
                            caughtException = stateCaught_112;
                            statePc = (stateCaught_112 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 113: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_113) {
                            caughtException = stateCaught_113;
                            statePc = (stateCaught_113 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 114: {
                        try {
                            var8.field_f = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8.field_g), var8.field_e);
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_114) {
                            caughtException = stateCaught_114;
                            statePc = (stateCaught_114 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 115: {
                        try {
                            var8.field_b = 1;
                            statePc = 119;
                            continue stateLoop;
                        } catch (Throwable stateCaught_115) {
                            caughtException = stateCaught_115;
                            statePc = (stateCaught_115 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 117: {
                        var2_ref = (ThreadDeath) (Object) caughtException;
                        throw var2_ref;
                    }
                    case 118: {
                        var2_ref2 = caughtException;
                        var8.field_b = 2;
                        statePc = 119;
                        continue stateLoop;
                    }
                    case 119: {
                        var2_ref3 = (Object) (Object) var8;
                        // monitorenter var8
                        statePc = 120;
                        continue stateLoop;
                    }
                    case 120: {
                        try {
                            ((Object) (Object) var8).notify();
                            // monitorexit var2_ref3
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_120) {
                            caughtException = stateCaught_120;
                            statePc = 122;
                            continue stateLoop;
                        }
                    }
                    case 122: {
                        try {
                            var6 = caughtException;
                            // monitorexit var2_ref3
                            statePc = 123;
                            continue stateLoop;
                        } catch (Throwable stateCaught_122) {
                            caughtException = stateCaught_122;
                            statePc = 122;
                            continue stateLoop;
                        }
                    }
                    case 123: {
                        throw (RuntimeException) (Object) var6;
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

    final bk a(int param0) {
        if (param0 > -123) {
            field_p = null;
        }
        return this.a(5, 0, 0, 16266, (Object) null);
    }

    final void b(int param0) {
        try {
            Object var2 = null;
            InterruptedException var2_ref = null;
            IOException var2_ref2 = null;
            int var2_int = 0;
            Throwable var3 = null;
            IOException var3_ref = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var2 = this;
                        // monitorenter this
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            ((ka) this).field_f = true;
                            this.notifyAll();
                            // monitorexit var2
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 3;
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
                        throw (RuntimeException) (Object) var3;
                    }
                    case 5: {
                        try {
                            if (param0 == 0) {
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
                            ((ka) this).field_d.join();
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        var2_ref = (InterruptedException) (Object) caughtException;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (((ka) this).field_e != null) {
                            statePc = 12;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        try {
                            ((ka) this).field_e.a(param0 ^ 1);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        var2_ref2 = (IOException) (Object) caughtException;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        if (null == ((ka) this).field_t) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        try {
                            ((ka) this).field_t.a(1);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        var2_ref2 = (IOException) (Object) caughtException;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        if (((ka) this).field_q != null) {
                            statePc = 21;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        var2_int = 0;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        if (var2_int >= ((ka) this).field_q.length) {
                            statePc = 29;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        if (null != ((ka) this).field_q[var2_int]) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        var2_int++;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 26: {
                        try {
                            ((ka) this).field_q[var2_int].a(1);
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 28;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        var2_int++;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 28: {
                        var3_ref = (IOException) (Object) caughtException;
                        var2_int++;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 29: {
                        if (((ka) this).field_c != null) {
                            statePc = 31;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        try {
                            ((ka) this).field_c.a(1);
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        var2_ref2 = (IOException) (Object) caughtException;
                        statePc = 34;
                        continue stateLoop;
                    }
                    case 34: {
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

    final bk a(Class param0, String param1, Class[] param2, int param3) {
        if (param3 != 29389) {
            return null;
        }
        return this.a(8, 0, 0, param3 + -13123, (Object) (Object) new Object[3]);
    }

    final boolean a(byte param0) {
        if (!(((ka) this).field_n)) {
            return false;
        }
        if (param0 != -68) {
            boolean discarded$0 = ((ka) this).a((byte) 20);
        }
        if (!((ka) this).field_g) {
            return ((ka) this).field_s != null ? true : false;
        }
        return ((ka) this).field_b != null ? true : false;
    }

    ka(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        qh var7 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    ((ka) this).field_t = null;
                    ((ka) this).field_f = false;
                    ((ka) this).field_h = null;
                    ((ka) this).field_g = false;
                    ((ka) this).field_x = null;
                    ((ka) this).field_n = false;
                    ((ka) this).field_c = null;
                    ((ka) this).field_e = null;
                    field_a = param0;
                    field_o = "1.1";
                    field_j = param1;
                    field_l = "Unknown";
                    stackOut_0_0 = this;
                    stackIn_2_0 = stackOut_0_0;
                    stackIn_1_0 = stackOut_0_0;
                    if (!param3) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    stackOut_1_0 = this;
                    stackOut_1_1 = 1;
                    stackIn_3_0 = stackOut_1_0;
                    stackIn_3_1 = stackOut_1_1;
                    statePc = 3;
                    continue stateLoop;
                }
                case 2: {
                    stackOut_2_0 = this;
                    stackOut_2_1 = 0;
                    stackIn_3_0 = stackOut_2_0;
                    stackIn_3_1 = stackOut_2_1;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    ((ka) this).field_n = stackIn_3_1 != 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        field_l = System.getProperty("java.vendor");
                        field_o = System.getProperty("java.version");
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (-1 == field_l.toLowerCase().indexOf("microsoft")) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ((ka) this).field_g = true;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    try {
                        field_u = System.getProperty("os.name");
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    var5 = (Exception) (Object) caughtException;
                    field_u = "Unknown";
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    field_r = field_u.toLowerCase();
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    try {
                        String discarded$4 = System.getProperty("os.arch").toLowerCase();
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    try {
                        String discarded$5 = System.getProperty("os.version").toLowerCase();
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    try {
                        field_v = System.getProperty("user.home");
                        if (null == field_v) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        field_v = field_v + "/";
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if (field_v == null) {
                        statePc = 25;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 25: {
                    field_v = "~/";
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    try {
                        ((ka) this).field_w = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 28: {
                    var5_ref = caughtException;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if (!((ka) this).field_g) {
                        statePc = 31;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 31: {
                    try {
                        java.lang.reflect.Method discarded$6 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[1]);
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 33: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    try {
                        field_p = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 36: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    e.a(field_a, field_j, -19960);
                    if (!((ka) this).field_n) {
                        statePc = 56;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    ((ka) this).field_c = new cb(e.a("random.dat", (String) null, -8204, field_a), "rw", 25L);
                    ((ka) this).field_e = new cb(e.a(0, "main_file_cache.dat2"), "rw", 314572800L);
                    ((ka) this).field_t = new cb(e.a(0, "main_file_cache.idx255"), "rw", 1048576L);
                    ((ka) this).field_q = new cb[param2];
                    var5_int = 0;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (var5_int >= param2) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    ((ka) this).field_q[var5_int] = new cb(e.a(0, "main_file_cache.idx" + var5_int), "rw", 1048576L);
                    var5_int++;
                    statePc = 39;
                    continue stateLoop;
                }
                case 41: {
                    if (((ka) this).field_g) {
                        statePc = 43;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 43: {
                    try {
                        Object discarded$7 = Class.forName("f").newInstance();
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 45: {
                    var5_ref = caughtException;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    try {
                        if (((ka) this).field_g) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        ((ka) this).field_s = Class.forName("dj").newInstance();
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var7 = new qh();
                        ((ka) this).field_b = var7;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 50: {
                    var5_ref = caughtException;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    try {
                        if (!((ka) this).field_g) {
                            statePc = 53;
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
                        ((ka) this).field_i = new uk();
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        ((ka) this).field_m = Class.forName("sf").newInstance();
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 55: {
                    var5_ref = caughtException;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    ((ka) this).field_f = false;
                    ((ka) this).field_d = new Thread((Runnable) this);
                    ((ka) this).field_d.setPriority(10);
                    ((ka) this).field_d.setDaemon(true);
                    ((ka) this).field_d.start();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = 0L;
    }
}
