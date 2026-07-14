/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vh implements Runnable {
    static java.lang.reflect.Method field_j;
    private rc field_m;
    private static volatile long field_s;
    private Object field_x;
    private boolean field_l;
    private static String field_h;
    ue field_t;
    private an field_a;
    ue field_n;
    static String field_i;
    ue field_c;
    private static int field_f;
    ue[] field_w;
    boolean field_d;
    private boolean field_o;
    private rc field_g;
    private kd field_b;
    private Object field_e;
    private Thread field_k;
    private static String field_r;
    static String field_v;
    java.awt.EventQueue field_p;
    private static String field_q;
    static String field_u;

    final rc a(boolean param0, int param1, int param2, int param3, int param4) {
        if (!param0) {
            Object var7 = null;
            rc discarded$0 = ((vh) this).a((Class) null, false, (String) null);
        }
        return this.a((param1 << 1664881104) + param2, 6, (Object) null, param3 + (param4 << -252885616), (byte) -116);
    }

    final rc a(int param0, java.net.URL param1) {
        if (param0 != 0) {
            field_i = null;
        }
        return this.a(0, 4, (Object) (Object) param1, 0, (byte) -101);
    }

    final boolean a(byte param0) {
        if (param0 != 13) {
            ((vh) this).field_l = false;
        }
        if (!((vh) this).field_d) {
            return false;
        }
        if (((vh) this).field_o) {
            return null != ((vh) this).field_a ? true : false;
        }
        return ((vh) this).field_x != null ? true : false;
    }

    final rc a(Class[] param0, int param1, String param2, Class param3) {
        if (param1 != -30475) {
            Object var6 = null;
            rc discarded$0 = ((vh) this).a((String) null, -80, 20);
        }
        return this.a(0, 8, (Object) (Object) new Object[3], 0, (byte) -119);
    }

    final void b(int param0) {
        try {
            Object var2 = null;
            InterruptedException var2_ref = null;
            IOException var2_ref2 = null;
            int var2_int = 0;
            IOException var3 = null;
            int var3_int = 0;
            Throwable var4 = null;
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
                            ((vh) this).field_l = true;
                            this.notifyAll();
                            var3_int = -46 % ((param0 - -47) / 50);
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
                            var4 = caughtException;
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
                        throw (RuntimeException) (Object) var4;
                    }
                    case 5: {
                        try {
                            ((vh) this).field_k.join();
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        var2_ref = (InterruptedException) (Object) caughtException;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        if (((vh) this).field_t == null) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        try {
                            ((vh) this).field_t.a((byte) 92);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        var2_ref2 = (IOException) (Object) caughtException;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (null != ((vh) this).field_n) {
                            statePc = 14;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        try {
                            ((vh) this).field_n.a((byte) 126);
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        var2_ref2 = (IOException) (Object) caughtException;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        if (((vh) this).field_w != null) {
                            statePc = 19;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        var2_int = 0;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        if (((vh) this).field_w.length <= var2_int) {
                            statePc = 27;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        if (((vh) this).field_w[var2_int] != null) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        var2_int++;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 24: {
                        try {
                            ((vh) this).field_w[var2_int].a((byte) 127);
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 26;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        var2_int++;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 26: {
                        var3 = (IOException) (Object) caughtException;
                        var2_int++;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 27: {
                        if (((vh) this).field_c == null) {
                            statePc = 31;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        try {
                            ((vh) this).field_c.a((byte) 94);
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        var2_ref2 = (IOException) (Object) caughtException;
                        statePc = 31;
                        continue stateLoop;
                    }
                    case 31: {
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

    final rc a(byte param0, int param1, Runnable param2) {
        if (param0 > -51) {
            return null;
        }
        return this.a(param1, 2, (Object) (Object) param2, 0, (byte) -123);
    }

    private final rc a(boolean param0, String param1, int param2, byte param3) {
        if (param3 != -96) {
            return null;
        }
        return this.a(param2, param0 ? 22 : 1, (Object) (Object) param1, 0, (byte) -128);
    }

    public final void run() {
        try {
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            Exception var3_ref = null;
            ko var3_ref2 = null;
            ue var3_ref3 = null;
            int var3_int = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            rc var8 = null;
            Thread var9 = null;
            Object[] var10 = null;
            java.awt.datatransfer.Clipboard var11 = null;
            java.awt.Frame var12 = null;
            Object[] var13 = null;
            String var14 = null;
            java.awt.Component var15 = null;
            String var16 = null;
            java.awt.datatransfer.Clipboard var17 = null;
            Object[] var18 = null;
            int stackIn_79_0 = 0;
            int stackOut_77_0 = 0;
            int stackOut_78_0 = 0;
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
                            if (!((vh) this).field_l) {
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
                            if (((vh) this).field_m != null) {
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
                            var8 = ((vh) this).field_m;
                            ((vh) this).field_m = ((vh) this).field_m.field_f;
                            if (((vh) this).field_m != null) {
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
                            ((vh) this).field_g = null;
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
                            var2_int = var8.field_g;
                            if ((var2_int ^ -1) != -2) {
                                statePc = 19;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (field_s <= km.b(-1)) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var8.field_d = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8.field_e), var8.field_b);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (-23 == (var2_int ^ -1)) {
                                statePc = 105;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (2 != var2_int) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var9 = new Thread((Runnable) var8.field_e);
                            var9.setDaemon(true);
                            var9.start();
                            var9.setPriority(var8.field_b);
                            var8.field_d = (Object) (Object) var9;
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (var2_int == 4) {
                                statePc = 101;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (-9 != (var2_int ^ -1)) {
                                statePc = 30;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var10 = (Object[]) var8.field_e;
                            if (((vh) this).field_d) {
                                statePc = 26;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (((Class) var10[0]).getClassLoader() == null) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var8.field_d = (Object) (Object) ((Class) var10[0]).getDeclaredMethod((String) var10[1], (Class[]) var10[2]);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if ((var2_int ^ -1) == -10) {
                                statePc = 97;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (var2_int != 18) {
                                statePc = 33;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var8.field_d = (Object) (Object) var11.getContents((Object) null);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (var2_int == 19) {
                                statePc = 96;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (((vh) this).field_d) {
                                statePc = 36;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (var2_int == -4) {
                                statePc = 93;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (var2_int == 21) {
                                statePc = 89;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (-6 != var2_int) {
                                statePc = 42;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (!((vh) this).field_o) {
                                statePc = 41;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            var8.field_d = (Object) (Object) ((vh) this).field_a.a(3152);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            var8.field_d = Class.forName("fl").getMethod("listmodes", new Class[0]).invoke(((vh) this).field_x, new Object[0]);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if ((var2_int ^ -1) != -7) {
                                statePc = 46;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            var12 = new java.awt.Frame("Jagex Full Screen");
                            var8.field_d = (Object) (Object) var12;
                            var12.setResizable(false);
                            if (((vh) this).field_o) {
                                statePc = 45;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            Object discarded$6 = Class.forName("fl").getMethod("enter", new Class[5]).invoke(((vh) this).field_x, new Object[5]);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            ((vh) this).field_a.a(var8.field_c & 65535, var8.field_b >>> -808508688, var12, var8.field_b & 65535, -4013, var8.field_c >> -1141046288);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (var2_int == 7) {
                                statePc = 86;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (var2_int == 12) {
                                statePc = 85;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if ((var2_int ^ -1) != -14) {
                                statePc = 50;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var3_ref3 = vh.a("", (String) var8.field_e, field_f, (byte) 101);
                            var8.field_d = (Object) (Object) var3_ref3;
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (!((vh) this).field_d) {
                                statePc = 53;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if (var2_int == -15) {
                                statePc = 82;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (!((vh) this).field_d) {
                                statePc = 56;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            if (-16 == var2_int) {
                                statePc = 76;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            if (((vh) this).field_o) {
                                statePc = 59;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            if ((var2_int ^ -1) != -18) {
                                statePc = 59;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            var13 = (Object[]) var8.field_e;
                            Object discarded$7 = Class.forName("ve").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((vh) this).field_e, new Object[5]);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            if ((var2_int ^ -1) != -17) {
                                statePc = 75;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            if (field_i.startsWith("win")) {
                                statePc = 62;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof Exception ? 74 : (stateCaught_60 instanceof ThreadDeath ? 112 : 113));
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof Exception ? 74 : (stateCaught_61 instanceof ThreadDeath ? 112 : 113));
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            var14 = (String) var8.field_e;
                            if (var14.startsWith("http://")) {
                                statePc = 66;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof Exception ? 74 : (stateCaught_62 instanceof ThreadDeath ? 112 : 113));
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            if (!var14.startsWith("https://")) {
                                statePc = 65;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof Exception ? 74 : (stateCaught_63 instanceof ThreadDeath ? 112 : 113));
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof Exception ? 74 : (stateCaught_64 instanceof ThreadDeath ? 112 : 113));
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof Exception ? 74 : (stateCaught_65 instanceof ThreadDeath ? 112 : 113));
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            var5 = 0;
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof Exception ? 74 : (stateCaught_66 instanceof ThreadDeath ? 112 : 113));
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if (var14.length() <= var5) {
                                statePc = 72;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = (stateCaught_67 instanceof Exception ? 74 : (stateCaught_67 instanceof ThreadDeath ? 112 : 113));
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if (var4_ref.indexOf((int) var14.charAt(var5)) == -1) {
                                statePc = 70;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof Exception ? 74 : (stateCaught_68 instanceof ThreadDeath ? 112 : 113));
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = (stateCaught_69 instanceof Exception ? 74 : (stateCaught_69 instanceof ThreadDeath ? 112 : 113));
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = (stateCaught_70 instanceof Exception ? 74 : (stateCaught_70 instanceof ThreadDeath ? 112 : 113));
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            var5++;
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = (stateCaught_71 instanceof Exception ? 74 : (stateCaught_71 instanceof ThreadDeath ? 112 : 113));
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            Process discarded$8 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var14 + "\"");
                            var8.field_d = null;
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = (stateCaught_72 instanceof Exception ? 74 : (stateCaught_72 instanceof ThreadDeath ? 112 : 113));
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            var3_ref = (Exception) (Object) caughtException;
                            var8.field_d = (Object) (Object) var3_ref;
                            throw (RuntimeException) (Object) var3_ref;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = (stateCaught_74 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = (stateCaught_75 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            if (0 == var8.field_b) {
                                statePc = 78;
                            } else {
                                statePc = 77;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = (stateCaught_76 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            stackOut_77_0 = 1;
                            stackIn_79_0 = stackOut_77_0;
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = (stateCaught_77 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            stackOut_78_0 = 0;
                            stackIn_79_0 = stackOut_78_0;
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            var3_int = stackIn_79_0;
                            var15 = (java.awt.Component) var8.field_e;
                            if (((vh) this).field_o) {
                                statePc = 81;
                            } else {
                                statePc = 80;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            Object discarded$9 = Class.forName("ve").getDeclaredMethod("showcursor", new Class[2]).invoke(((vh) this).field_e, new Object[2]);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = (stateCaught_80 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            ((vh) this).field_b.a(var3_int != 0, (byte) 84, var15);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = (stateCaught_81 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            var3_int = var8.field_b;
                            var4 = var8.field_c;
                            if (!((vh) this).field_o) {
                                statePc = 84;
                            } else {
                                statePc = 83;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = (stateCaught_82 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            ((vh) this).field_b.a(var4, var3_int, -85);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = (stateCaught_83 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            Object discarded$10 = Class.forName("ve").getDeclaredMethod("movemouse", new Class[2]).invoke(((vh) this).field_e, new Object[2]);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            var3_ref3 = vh.a(field_r, (String) var8.field_e, field_f, (byte) 95);
                            var8.field_d = (Object) (Object) var3_ref3;
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = (stateCaught_85 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            if (((vh) this).field_o) {
                                statePc = 88;
                            } else {
                                statePc = 87;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = (stateCaught_86 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            Object discarded$11 = Class.forName("fl").getMethod("exit", new Class[0]).invoke(((vh) this).field_x, new Object[0]);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = (stateCaught_87 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            ((vh) this).field_a.a((byte) -102, (java.awt.Frame) var8.field_e);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = (stateCaught_88 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            if (km.b(-1) < field_s) {
                                statePc = 91;
                            } else {
                                statePc = 90;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = (stateCaught_89 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            statePc = 92;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = (stateCaught_90 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = (stateCaught_91 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            var8.field_d = (Object) (Object) java.net.InetAddress.getByName((String) var8.field_e).getAddress();
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = (stateCaught_92 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            if (km.b(-1) >= field_s) {
                                statePc = 95;
                            } else {
                                statePc = 94;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = (stateCaught_93 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = (stateCaught_94 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            var16 = (255 & var8.field_b >> -1808325064) + "." + (var8.field_b >> -79988912 & 255) + "." + ((65334 & var8.field_b) >> -661318296) + "." + (255 & var8.field_b);
                            var8.field_d = (Object) (Object) java.net.InetAddress.getByName(var16).getHostName();
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = (stateCaught_95 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            var7 = (java.awt.datatransfer.Transferable) var8.field_e;
                            var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var17.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = (stateCaught_96 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            var18 = (Object[]) var8.field_e;
                            if (!((vh) this).field_d) {
                                statePc = 100;
                            } else {
                                statePc = 98;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = (stateCaught_97 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            if (null != ((Class) var18[0]).getClassLoader()) {
                                statePc = 100;
                            } else {
                                statePc = 99;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = (stateCaught_98 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = (stateCaught_99 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            var8.field_d = (Object) (Object) ((Class) var18[0]).getDeclaredField((String) var18[1]);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = (stateCaught_100 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            if (km.b(-1) < field_s) {
                                statePc = 103;
                            } else {
                                statePc = 102;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = (stateCaught_101 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            statePc = 104;
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = (stateCaught_102 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = (stateCaught_103 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            var8.field_d = (Object) (Object) new DataInputStream(((java.net.URL) var8.field_e).openStream());
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = (stateCaught_104 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            if (field_s <= km.b(-1)) {
                                statePc = 107;
                            } else {
                                statePc = 106;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = (stateCaught_105 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = (stateCaught_106 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            var8.field_d = (Object) (Object) gm.a(true, var8.field_b, (String) var8.field_e).a(-2049);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = (stateCaught_107 instanceof ko ? 109 : (stateCaught_107 instanceof ThreadDeath ? 112 : 113));
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = (stateCaught_108 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            var3_ref2 = (ko) (Object) caughtException;
                            var8.field_d = (Object) (Object) var3_ref2.getMessage();
                            throw var3_ref2;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = (stateCaught_109 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        try {
                            var8.field_a = 1;
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_110) {
                            caughtException = stateCaught_110;
                            statePc = (stateCaught_110 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 112: {
                        var2_ref = (ThreadDeath) (Object) caughtException;
                        throw var2_ref;
                    }
                    case 113: {
                        var2_ref2 = caughtException;
                        var8.field_a = 2;
                        statePc = 114;
                        continue stateLoop;
                    }
                    case 114: {
                        var2 = (Object) (Object) var8;
                        // monitorenter var8
                        statePc = 115;
                        continue stateLoop;
                    }
                    case 115: {
                        try {
                            ((Object) (Object) var8).notify();
                            // monitorexit var2
                            statePc = 0;
                            continue stateLoop;
                        } catch (Throwable stateCaught_115) {
                            caughtException = stateCaught_115;
                            statePc = 117;
                            continue stateLoop;
                        }
                    }
                    case 117: {
                        try {
                            var6 = caughtException;
                            // monitorexit var2
                            statePc = 118;
                            continue stateLoop;
                        } catch (Throwable stateCaught_117) {
                            caughtException = stateCaught_117;
                            statePc = 117;
                            continue stateLoop;
                        }
                    }
                    case 118: {
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

    private final rc a(int param0, int param1, Object param2, int param3, byte param4) {
        rc var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Object stackIn_6_0 = null;
        Object stackOut_5_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = new rc();
                    var6.field_c = param3;
                    var6.field_b = param0;
                    var6.field_g = param1;
                    var6.field_e = param2;
                    var7 = this;
                    // monitorenter this
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (null != ((vh) this).field_g) {
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
                        ((vh) this).field_m = var6;
                        ((vh) this).field_g = var6;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((vh) this).field_g.field_f = var6;
                        ((vh) this).field_g = var6;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param4 <= -99) {
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
                        // monitorexit var7
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
                    return (rc) (Object) stackIn_6_0;
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

    private final static ue a(String param0, String param1, int param2, byte param3) {
        try {
            String var7_ref = null;
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            Object var7 = null;
            Exception var8 = null;
            ue var8_ref = null;
            ue stackIn_14_0 = null;
            Throwable decompiledCaughtException = null;
            ue stackOut_13_0 = null;
            var7_ref = null;
            if (param3 >= 77) {
              L0: {
                if ((param2 ^ -1) != -34) {
                  if ((param2 ^ -1) != -35) {
                    var4 = "jagex_" + param0 + "_preferences" + param1 + ".dat";
                    break L0;
                  } else {
                    var4 = "jagex_" + param0 + "_preferences" + param1 + "_wip.dat";
                    break L0;
                  }
                } else {
                  var4 = "jagex_" + param0 + "_preferences" + param1 + "_rc.dat";
                  break L0;
                }
              }
              var5_array = new String[]{"c:/rscache/", "/rscache/", field_q, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
              var6 = 0;
              L1: while (true) {
                if (var6 < var5_array.length) {
                  L2: {
                    var7_ref = var5_array[var6];
                    if (-1 <= (var7_ref.length() ^ -1)) {
                      break L2;
                    } else {
                      if (new File(var7_ref).exists()) {
                        break L2;
                      } else {
                        var6++;
                        continue L1;
                      }
                    }
                  }
                  try {
                    var8_ref = new ue(new File(var7_ref, var4), "rw", 10000L);
                    stackOut_13_0 = (ue) var8_ref;
                    stackIn_14_0 = stackOut_13_0;
                  } catch (java.lang.Exception decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                    return stackIn_14_0;
                  }
                  continue L1;
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final rc a(Class param0, boolean param1, String param2) {
        if (!param1) {
            ((vh) this).run();
        }
        return this.a(0, 9, (Object) (Object) new Object[2], 0, (byte) -108);
    }

    final rc a(String param0, int param1, int param2) {
        if (param2 >= -58) {
            field_q = null;
        }
        return this.a(false, param0, param1, (byte) -96);
    }

    final rc a(boolean param0, java.awt.Frame param1) {
        if (param0) {
            Object var4 = null;
            rc discarded$0 = ((vh) this).a(3, (java.net.URL) null);
        }
        return this.a(0, 7, (Object) (Object) param1, 0, (byte) -110);
    }

    final rc a(int param0) {
        int var2 = 13 / ((param0 - -26) / 60);
        return this.a(0, 5, (Object) null, 0, (byte) -125);
    }

    vh(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        an var7 = null;
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
                    ((vh) this).field_n = null;
                    ((vh) this).field_o = false;
                    ((vh) this).field_g = null;
                    ((vh) this).field_m = null;
                    ((vh) this).field_c = null;
                    ((vh) this).field_t = null;
                    ((vh) this).field_l = false;
                    ((vh) this).field_d = false;
                    field_f = param0;
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
                    ((vh) this).field_d = stackIn_3_1 != 0;
                    field_r = param1;
                    field_v = "1.1";
                    field_u = "Unknown";
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        field_u = System.getProperty("java.vendor");
                        field_v = System.getProperty("java.version");
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
                    if (-1 != field_u.toLowerCase().indexOf("microsoft")) {
                        statePc = 9;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 9: {
                    ((vh) this).field_o = true;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    try {
                        field_h = System.getProperty("os.name");
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
                    field_h = "Unknown";
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    field_i = field_h.toLowerCase();
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
                        field_q = System.getProperty("user.home");
                        if (null == field_q) {
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
                        field_q = field_q + "/";
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
                    if (null == field_q) {
                        statePc = 26;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 26: {
                    field_q = "~/";
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    try {
                        ((vh) this).field_p = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
                    if (!((vh) this).field_o) {
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
                        field_j = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
                    f.a((byte) 32, field_r, field_f);
                    if (!((vh) this).field_d) {
                        statePc = 56;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    ((vh) this).field_c = new ue(f.a(-31192, "random.dat", (String) null, field_f), "rw", 25L);
                    ((vh) this).field_t = new ue(f.a(-3455, "main_file_cache.dat2"), "rw", 314572800L);
                    ((vh) this).field_n = new ue(f.a(-3455, "main_file_cache.idx255"), "rw", 1048576L);
                    ((vh) this).field_w = new ue[param2];
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
                    ((vh) this).field_w[var5_int] = new ue(f.a(-3455, "main_file_cache.idx" + var5_int), "rw", 1048576L);
                    var5_int++;
                    statePc = 40;
                    continue stateLoop;
                }
                case 42: {
                    if (!((vh) this).field_o) {
                        statePc = 46;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    try {
                        Object discarded$7 = Class.forName("ic").newInstance();
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
                        if (((vh) this).field_o) {
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
                        ((vh) this).field_x = Class.forName("fl").newInstance();
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
                        var7 = new an();
                        ((vh) this).field_a = var7;
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
                        if (((vh) this).field_o) {
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
                        ((vh) this).field_e = Class.forName("ve").newInstance();
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
                        ((vh) this).field_b = new kd();
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
                    ((vh) this).field_l = false;
                    ((vh) this).field_k = new Thread((Runnable) this);
                    ((vh) this).field_k.setPriority(10);
                    ((vh) this).field_k.setDaemon(true);
                    ((vh) this).field_k.start();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = 0L;
    }
}
