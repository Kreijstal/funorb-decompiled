/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hd implements Runnable {
    private boolean field_h;
    ei field_r;
    static String field_t;
    private hj field_l;
    private wo field_w;
    boolean field_e;
    ei field_m;
    private Object field_b;
    ei[] field_c;
    private static int field_k;
    private static String field_f;
    private fv field_q;
    private static String field_a;
    static String field_n;
    ei field_d;
    private Thread field_v;
    private static String field_i;
    private static volatile long field_p;
    static String field_u;
    private wo field_s;
    static java.lang.reflect.Method field_x;
    private boolean field_g;
    private Object field_o;
    java.awt.EventQueue field_j;

    final wo a(int param0, byte param1, String param2) {
        if (param1 < 37) {
            field_p = -11L;
        }
        return this.a((byte) 125, param0, false, param2);
    }

    final wo a(boolean param0, int param1, int param2, int param3, int param4) {
        if (!param0) {
            ((hd) this).field_c = null;
        }
        return this.a((param4 << 323962576) - -param3, (param2 << 35259696) - -param1, (Object) null, (byte) 81, 6);
    }

    private final wo a(byte param0, int param1, boolean param2, String param3) {
        if (param0 < 121) {
            return null;
        }
        return this.a(0, param1, (Object) (Object) param3, (byte) -20, !param2 ? 1 : 22);
    }

    final wo a(java.awt.datatransfer.Transferable param0, int param1) {
        if (param1 != -26522) {
            return null;
        }
        return this.a(0, 0, (Object) (Object) param0, (byte) 102, 19);
    }

    private final static ei a(boolean param0, String param1, int param2, String param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            ei var8_ref = null;
            ei stackIn_12_0 = null;
            Throwable decompiledCaughtException = null;
            ei stackOut_11_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (33 != param2) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        var4 = "jagex_" + param3 + "_preferences" + param1 + "_rc.dat";
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 2: {
                        if (34 != param2) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        var4 = "jagex_" + param3 + "_preferences" + param1 + "_wip.dat";
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 4: {
                        var4 = "jagex_" + param3 + "_preferences" + param1 + ".dat";
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        var5_array = new String[]{"c:/rscache/", "/rscache/", field_f, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
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
                        if (var7.length() <= 0) {
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
                            var8_ref = new ei(new File(var7, var4), "rw", 10000L);
                            stackOut_11_0 = (ei) var8_ref;
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
                        return (ei) (Object) stackIn_12_0;
                    }
                    case 13: {
                        var8 = (Exception) (Object) caughtException;
                        var6++;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 14: {
                        if (!param0) {
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
                        field_x = null;
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

    final wo a(int param0, int param1, Runnable param2) {
        if (param1 != 0) {
            ((hd) this).field_j = null;
        }
        return this.a(0, param0, (Object) (Object) param2, (byte) -26, 2);
    }

    final wo a(Class param0, int param1, Class[] param2, String param3) {
        if (param1 != 0) {
            boolean discarded$0 = ((hd) this).b(false);
        }
        return this.a(0, 0, (Object) (Object) new Object[3], (byte) 124, 8);
    }

    final wo a(int param0) {
        if (param0 != 0) {
            return null;
        }
        return this.a(0, 0, (Object) null, (byte) -99, 18);
    }

    final void a(boolean param0) {
        try {
            Object var2 = null;
            InterruptedException var2_ref = null;
            IOException var2_ref2 = null;
            int var2_int = 0;
            Throwable var3 = null;
            IOException var3_ref = null;
            Object stackIn_2_0 = null;
            Object stackIn_3_0 = null;
            Object stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            Object stackOut_1_0 = null;
            Object stackOut_2_0 = null;
            int stackOut_2_1 = 0;
            Object stackOut_3_0 = null;
            int stackOut_3_1 = 0;
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
                            stackOut_1_0 = this;
                            stackIn_3_0 = stackOut_1_0;
                            stackIn_2_0 = stackOut_1_0;
                            if (!param0) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            stackOut_2_0 = this;
                            stackOut_2_1 = 1;
                            stackIn_4_0 = stackOut_2_0;
                            stackIn_4_1 = stackOut_2_1;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            stackOut_3_0 = this;
                            stackOut_3_1 = 0;
                            stackIn_4_0 = stackOut_3_0;
                            stackIn_4_1 = stackOut_3_1;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            ((hd) this).field_g = stackIn_4_1 != 0;
                            this.notifyAll();
                            // monitorexit var2
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var3 = caughtException;
                            // monitorexit var2
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        throw (RuntimeException) (Object) var3;
                    }
                    case 8: {
                        try {
                            ((hd) this).field_v.join();
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        var2_ref = (InterruptedException) (Object) caughtException;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (null != ((hd) this).field_r) {
                            statePc = 13;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        try {
                            ((hd) this).field_r.b(783);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        var2_ref2 = (IOException) (Object) caughtException;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
                        if (((hd) this).field_d != null) {
                            statePc = 18;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        try {
                            ((hd) this).field_d.b(783);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        var2_ref2 = (IOException) (Object) caughtException;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        if (((hd) this).field_c != null) {
                            statePc = 23;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        var2_int = 0;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 24: {
                        if (((hd) this).field_c.length <= var2_int) {
                            statePc = 30;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        if (((hd) this).field_c[var2_int] != null) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        var2_int++;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 27: {
                        try {
                            ((hd) this).field_c[var2_int].b(783);
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        var2_int++;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 29: {
                        var3_ref = (IOException) (Object) caughtException;
                        var2_int++;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 30: {
                        if (((hd) this).field_m != null) {
                            statePc = 32;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    }
                    case 32: {
                        try {
                            ((hd) this).field_m.b(783);
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        var2_ref2 = (IOException) (Object) caughtException;
                        statePc = 35;
                        continue stateLoop;
                    }
                    case 35: {
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

    private final wo a(int param0, int param1, Object param2, byte param3, int param4) {
        wo var6 = null;
        Object var7_ref_Object = null;
        int var7 = 0;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = new wo();
                    var6.field_d = param0;
                    var6.field_b = param2;
                    var6.field_e = param4;
                    var6.field_c = param1;
                    var7_ref_Object = this;
                    // monitorenter this
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((hd) this).field_s == null) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((hd) this).field_s.field_a = var6;
                        ((hd) this).field_s = var6;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((hd) this).field_w = var6;
                        ((hd) this).field_s = var6;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        this.notify();
                        // monitorexit var7_ref_Object
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var8 = caughtException;
                        // monitorexit var7_ref_Object
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) var8;
                }
                case 8: {
                    var7 = -48 % ((18 - param3) / 35);
                    return var6;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final wo a(byte param0, java.awt.Frame param1) {
        int var3 = -12 % ((param0 - -4) / 59);
        return this.a(0, 0, (Object) (Object) param1, (byte) 108, 7);
    }

    final wo a(java.net.URL param0, boolean param1) {
        if (param1) {
            boolean discarded$0 = ((hd) this).b(true);
        }
        return this.a(0, 0, (Object) (Object) param0, (byte) -126, 4);
    }

    public final void run() {
        try {
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            ug var3_ref = null;
            Exception var3_ref2 = null;
            ei var3_ref3 = null;
            int var3_int = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            wo var8 = null;
            Thread var9 = null;
            Object[] var10 = null;
            String var11 = null;
            Object[] var12 = null;
            java.awt.Component var13 = null;
            java.awt.Frame var14 = null;
            String var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            java.awt.datatransfer.Clipboard var17 = null;
            Object[] var18 = null;
            int stackIn_83_0 = 0;
            int stackOut_81_0 = 0;
            int stackOut_82_0 = 0;
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
                            if (!((hd) this).field_g) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            // monitorexit var2
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        return;
                    }
                    case 4: {
                        try {
                            if (((hd) this).field_w != null) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var8 = ((hd) this).field_w;
                            ((hd) this).field_w = ((hd) this).field_w.field_a;
                            if (null != ((hd) this).field_w) {
                                statePc = 11;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            ((hd) this).field_s = null;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            this.wait();
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof InterruptedException ? 10 : 13);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var3 = (InterruptedException) (Object) caughtException;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            // monitorexit var2
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var4_ref_Throwable = caughtException;
                            // monitorexit var2
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        throw (RuntimeException) (Object) var4_ref_Throwable;
                    }
                    case 15: {
                        try {
                            var2_int = var8.field_e;
                            if (-2 != (var2_int ^ -1)) {
                                statePc = 19;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (vi.b(-108) >= field_p) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var8.field_f = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8.field_b), var8.field_c);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (-23 != (var2_int ^ -1)) {
                                statePc = 26;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if ((vi.b(-118) ^ -1L) > (field_p ^ -1L)) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var8.field_f = (Object) (Object) ti.a((String) var8.field_b, (byte) 102, var8.field_c).a(111);
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof ug ? 25 : (stateCaught_23 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var3_ref = (ug) (Object) caughtException;
                            var8.field_f = (Object) (Object) var3_ref.getMessage();
                            throw var3_ref;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (-3 != (var2_int ^ -1)) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var9 = new Thread((Runnable) var8.field_b);
                            var9.setDaemon(true);
                            var9.start();
                            var9.setPriority(var8.field_c);
                            var8.field_f = (Object) (Object) var9;
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if ((var2_int ^ -1) != -5) {
                                statePc = 32;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (vi.b(89) >= field_p) {
                                statePc = 31;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var8.field_f = (Object) (Object) new DataInputStream(((java.net.URL) var8.field_b).openStream());
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (8 != var2_int) {
                                statePc = 37;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var10 = (Object[]) var8.field_b;
                            if (!((hd) this).field_e) {
                                statePc = 36;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (((Class) var10[0]).getClassLoader() != null) {
                                statePc = 36;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var8.field_f = (Object) (Object) ((Class) var10[0]).getDeclaredMethod((String) var10[1], (Class[]) var10[2]);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (9 == var2_int) {
                                statePc = 106;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (18 == var2_int) {
                                statePc = 105;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if ((var2_int ^ -1) == -20) {
                                statePc = 104;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (!((hd) this).field_e) {
                                statePc = 103;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if ((var2_int ^ -1) == -4) {
                                statePc = 100;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (var2_int != 21) {
                                statePc = 47;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if ((field_p ^ -1L) < (vi.b(46) ^ -1L)) {
                                statePc = 45;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            var8.field_f = (Object) (Object) java.net.InetAddress.getByName((String) var8.field_b).getAddress();
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (var2_int == 5) {
                                statePc = 97;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (var2_int == 6) {
                                statePc = 94;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            if (var2_int == 7) {
                                statePc = 91;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (var2_int == 12) {
                                statePc = 90;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if (-14 == var2_int) {
                                statePc = 89;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if (!((hd) this).field_e) {
                                statePc = 55;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (14 == var2_int) {
                                statePc = 86;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if (!((hd) this).field_e) {
                                statePc = 58;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            if (-16 == var2_int) {
                                statePc = 80;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if (((hd) this).field_h) {
                                statePc = 61;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            if ((var2_int ^ -1) == -18) {
                                statePc = 79;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if ((var2_int ^ -1) != -17) {
                                statePc = 78;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            if (!field_n.startsWith("win")) {
                                statePc = 65;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof Exception ? 77 : (stateCaught_63 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof Exception ? 77 : (stateCaught_64 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof Exception ? 77 : (stateCaught_65 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            var11 = (String) var8.field_b;
                            if (var11.startsWith("http://")) {
                                statePc = 70;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof Exception ? 77 : (stateCaught_66 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if (!var11.startsWith("https://")) {
                                statePc = 69;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = (stateCaught_67 instanceof Exception ? 77 : (stateCaught_67 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof Exception ? 77 : (stateCaught_68 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = (stateCaught_69 instanceof Exception ? 77 : (stateCaught_69 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            var5 = 0;
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = (stateCaught_70 instanceof Exception ? 77 : (stateCaught_70 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            if (var5 >= var11.length()) {
                                statePc = 75;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = (stateCaught_71 instanceof Exception ? 77 : (stateCaught_71 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            if (var4_ref.indexOf((int) var11.charAt(var5)) != -1) {
                                statePc = 74;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = (stateCaught_72 instanceof Exception ? 77 : (stateCaught_72 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof Exception ? 77 : (stateCaught_73 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            var5++;
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = (stateCaught_74 instanceof Exception ? 77 : (stateCaught_74 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            Process discarded$6 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var11 + "\"");
                            var8.field_f = null;
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = (stateCaught_75 instanceof Exception ? 77 : (stateCaught_75 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = (stateCaught_76 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            var3_ref2 = (Exception) (Object) caughtException;
                            var8.field_f = (Object) (Object) var3_ref2;
                            throw (RuntimeException) (Object) var3_ref2;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = (stateCaught_77 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            var12 = (Object[]) var8.field_b;
                            Object discarded$7 = Class.forName("gf").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((hd) this).field_b, new Object[5]);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            if (var8.field_c == 0) {
                                statePc = 82;
                            } else {
                                statePc = 81;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = (stateCaught_80 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            stackOut_81_0 = 1;
                            stackIn_83_0 = stackOut_81_0;
                            statePc = 83;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = (stateCaught_81 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            stackOut_82_0 = 0;
                            stackIn_83_0 = stackOut_82_0;
                            statePc = 83;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = (stateCaught_82 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            var3_int = stackIn_83_0;
                            var13 = (java.awt.Component) var8.field_b;
                            if (((hd) this).field_h) {
                                statePc = 85;
                            } else {
                                statePc = 84;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = (stateCaught_83 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            Object discarded$8 = Class.forName("gf").getDeclaredMethod("showcursor", new Class[2]).invoke(((hd) this).field_b, new Object[2]);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            ((hd) this).field_l.a(48, var3_int != 0, var13);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = (stateCaught_85 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            var3_int = var8.field_c;
                            var4 = var8.field_d;
                            if (((hd) this).field_h) {
                                statePc = 88;
                            } else {
                                statePc = 87;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = (stateCaught_86 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            Object discarded$9 = Class.forName("gf").getDeclaredMethod("movemouse", new Class[2]).invoke(((hd) this).field_b, new Object[2]);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = (stateCaught_87 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            ((hd) this).field_l.a(var4, 74, var3_int);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = (stateCaught_88 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            var3_ref3 = hd.a(true, (String) var8.field_b, field_k, "");
                            var8.field_f = (Object) (Object) var3_ref3;
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = (stateCaught_89 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            var3_ref3 = hd.a(true, (String) var8.field_b, field_k, field_i);
                            var8.field_f = (Object) (Object) var3_ref3;
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = (stateCaught_90 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            if (!((hd) this).field_h) {
                                statePc = 93;
                            } else {
                                statePc = 92;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = (stateCaught_91 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            ((hd) this).field_q.a(122, (java.awt.Frame) var8.field_b);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = (stateCaught_92 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            Object discarded$10 = Class.forName("wu").getMethod("exit", new Class[0]).invoke(((hd) this).field_o, new Object[0]);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = (stateCaught_93 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            var14 = new java.awt.Frame("Jagex Full Screen");
                            var8.field_f = (Object) (Object) var14;
                            var14.setResizable(false);
                            if (!((hd) this).field_h) {
                                statePc = 96;
                            } else {
                                statePc = 95;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = (stateCaught_94 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            ((hd) this).field_q.a(65535 & var8.field_c, var8.field_d & 65535, var14, var8.field_d >> -169331312, var8.field_c >>> 2112988688, false);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = (stateCaught_95 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            Object discarded$11 = Class.forName("wu").getMethod("enter", new Class[5]).invoke(((hd) this).field_o, new Object[5]);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = (stateCaught_96 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            if (((hd) this).field_h) {
                                statePc = 99;
                            } else {
                                statePc = 98;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = (stateCaught_97 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            var8.field_f = Class.forName("wu").getMethod("listmodes", new Class[0]).invoke(((hd) this).field_o, new Object[0]);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = (stateCaught_98 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            var8.field_f = (Object) (Object) ((hd) this).field_q.a(0);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = (stateCaught_99 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            if ((vi.b(-127) ^ -1L) <= (field_p ^ -1L)) {
                                statePc = 102;
                            } else {
                                statePc = 101;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = (stateCaught_100 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = (stateCaught_101 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            var15 = (var8.field_c >> -652182760 & 255) + "." + (255 & var8.field_c >> -1581852496) + "." + (255 & var8.field_c >> 1091153384) + "." + (var8.field_c & 255);
                            var8.field_f = (Object) (Object) java.net.InetAddress.getByName(var15).getHostName();
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = (stateCaught_102 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = (stateCaught_103 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            var7 = (java.awt.datatransfer.Transferable) var8.field_b;
                            var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var16.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = (stateCaught_104 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var8.field_f = (Object) (Object) var17.getContents((Object) null);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = (stateCaught_105 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            var18 = (Object[]) var8.field_b;
                            if (!((hd) this).field_e) {
                                statePc = 110;
                            } else {
                                statePc = 107;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = (stateCaught_106 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            if (((Class) var18[0]).getClassLoader() == null) {
                                statePc = 109;
                            } else {
                                statePc = 108;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = (stateCaught_107 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = (stateCaught_108 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = (stateCaught_109 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        try {
                            var8.field_f = (Object) (Object) ((Class) var18[0]).getDeclaredField((String) var18[1]);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_110) {
                            caughtException = stateCaught_110;
                            statePc = (stateCaught_110 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        try {
                            var8.field_g = 1;
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_111) {
                            caughtException = stateCaught_111;
                            statePc = (stateCaught_111 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 113: {
                        var2_ref = (ThreadDeath) (Object) caughtException;
                        throw var2_ref;
                    }
                    case 114: {
                        var2_ref2 = caughtException;
                        var8.field_g = 2;
                        statePc = 115;
                        continue stateLoop;
                    }
                    case 115: {
                        var2 = (Object) (Object) var8;
                        // monitorenter var8
                        statePc = 116;
                        continue stateLoop;
                    }
                    case 116: {
                        try {
                            ((Object) (Object) var8).notify();
                            // monitorexit var2
                            statePc = 0;
                            continue stateLoop;
                        } catch (Throwable stateCaught_116) {
                            caughtException = stateCaught_116;
                            statePc = 118;
                            continue stateLoop;
                        }
                    }
                    case 118: {
                        try {
                            var6 = caughtException;
                            // monitorexit var2
                            statePc = 119;
                            continue stateLoop;
                        } catch (Throwable stateCaught_118) {
                            caughtException = stateCaught_118;
                            statePc = 118;
                            continue stateLoop;
                        }
                    }
                    case 119: {
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

    final wo b(int param0) {
        if (param0 != -20681) {
            return null;
        }
        return this.a(0, 0, (Object) null, (byte) 109, 5);
    }

    final wo a(int param0, Class param1, String param2) {
        if (param0 != -30598) {
            ((hd) this).a(false);
        }
        return this.a(0, 0, (Object) (Object) new Object[2], (byte) -60, 9);
    }

    final boolean b(boolean param0) {
        if (param0) {
            Object var3 = null;
            wo discarded$0 = ((hd) this).a((java.awt.datatransfer.Transferable) null, 84);
        }
        if (!(((hd) this).field_e)) {
            return false;
        }
        if (((hd) this).field_h) {
            return null != ((hd) this).field_q ? true : false;
        }
        return ((hd) this).field_o != null ? true : false;
    }

    hd(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        fv var7 = null;
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
                    ((hd) this).field_e = false;
                    ((hd) this).field_d = null;
                    ((hd) this).field_h = false;
                    ((hd) this).field_r = null;
                    ((hd) this).field_m = null;
                    ((hd) this).field_w = null;
                    ((hd) this).field_g = false;
                    ((hd) this).field_s = null;
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
                    ((hd) this).field_e = stackIn_3_1 != 0;
                    field_t = "Unknown";
                    field_u = "1.1";
                    field_k = param0;
                    field_i = param1;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        field_t = System.getProperty("java.vendor");
                        field_u = System.getProperty("java.version");
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
                    if (0 != (field_t.toLowerCase().indexOf("microsoft") ^ -1)) {
                        statePc = 9;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 9: {
                    ((hd) this).field_h = true;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    try {
                        field_a = System.getProperty("os.name");
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    var5 = (Exception) (Object) caughtException;
                    field_a = "Unknown";
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    field_n = field_a.toLowerCase();
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    try {
                        String discarded$4 = System.getProperty("os.arch").toLowerCase();
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    try {
                        String discarded$5 = System.getProperty("os.version").toLowerCase();
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    try {
                        field_f = System.getProperty("user.home");
                        if (null == field_f) {
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
                        field_f = field_f + "/";
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (null == field_f) {
                        statePc = 26;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 26: {
                    field_f = "~/";
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    try {
                        ((hd) this).field_j = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    var5_ref = caughtException;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if (!((hd) this).field_h) {
                        statePc = 32;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 32: {
                    try {
                        java.lang.reflect.Method discarded$6 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[1]);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 34: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    try {
                        field_x = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 37: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    qi.a(field_k, field_i, 1);
                    if (!((hd) this).field_e) {
                        statePc = 56;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    ((hd) this).field_m = new ei(qi.a("random.dat", field_k, 39, (String) null), "rw", 25L);
                    ((hd) this).field_r = new ei(qi.a(true, "main_file_cache.dat2"), "rw", 314572800L);
                    ((hd) this).field_d = new ei(qi.a(true, "main_file_cache.idx255"), "rw", 1048576L);
                    ((hd) this).field_c = new ei[param2];
                    var5_int = 0;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (param2 <= var5_int) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    ((hd) this).field_c[var5_int] = new ei(qi.a(true, "main_file_cache.idx" + var5_int), "rw", 1048576L);
                    var5_int++;
                    statePc = 40;
                    continue stateLoop;
                }
                case 42: {
                    if (!((hd) this).field_h) {
                        statePc = 46;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    try {
                        Object discarded$7 = Class.forName("qr").newInstance();
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
                        if (!((hd) this).field_h) {
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
                        var7 = new fv();
                        ((hd) this).field_q = var7;
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
                        ((hd) this).field_o = Class.forName("wu").newInstance();
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
                        if (((hd) this).field_h) {
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
                        ((hd) this).field_b = Class.forName("gf").newInstance();
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
                        ((hd) this).field_l = new hj();
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
                    ((hd) this).field_g = false;
                    ((hd) this).field_v = new Thread((Runnable) this);
                    ((hd) this).field_v.setPriority(10);
                    ((hd) this).field_v.setDaemon(true);
                    ((hd) this).field_v.start();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 0L;
    }
}
