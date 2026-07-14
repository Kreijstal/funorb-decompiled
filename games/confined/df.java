/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class df implements Runnable {
    private Object field_q;
    private static String field_g;
    static String field_b;
    static String field_s;
    private boolean field_l;
    private bc field_x;
    private bc field_i;
    boolean field_p;
    static String field_f;
    private static volatile long field_h;
    private Thread field_a;
    fm[] field_d;
    fm field_n;
    private static String field_u;
    private le field_w;
    private boolean field_j;
    private mj field_c;
    private static int field_o;
    private Object field_m;
    fm field_t;
    java.awt.EventQueue field_k;
    private static String field_e;
    fm field_v;
    static java.lang.reflect.Method field_r;

    final bc a(int param0, java.net.URL param1) {
        if (param0 != 0) {
            return null;
        }
        return this.a(4, (byte) -93, (Object) (Object) param1, 0, 0);
    }

    final bc a(java.awt.Frame param0, int param1) {
        int var3 = 28 % ((param1 - -7) / 57);
        return this.a(7, (byte) -119, (Object) (Object) param0, 0, 0);
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
                            ((df) this).field_j = true;
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
                        if (param0 == 20269) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        ((df) this).field_p = true;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        try {
                            ((df) this).field_a.join();
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
                        if (((df) this).field_t == null) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        try {
                            ((df) this).field_t.b(0);
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        var2_ref2 = (IOException) (Object) caughtException;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (null == ((df) this).field_v) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        try {
                            ((df) this).field_v.b(0);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        var2_ref2 = (IOException) (Object) caughtException;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        if (((df) this).field_d != null) {
                            statePc = 20;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        var2_int = 0;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        if (var2_int >= ((df) this).field_d.length) {
                            statePc = 28;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        if (null != ((df) this).field_d[var2_int]) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        var2_int++;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 25: {
                        try {
                            ((df) this).field_d[var2_int].b(0);
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        var2_int++;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 27: {
                        var3_ref = (IOException) (Object) caughtException;
                        var2_int++;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 28: {
                        if (null == ((df) this).field_n) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 29: {
                        try {
                            ((df) this).field_n.b(0);
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        var2_ref2 = (IOException) (Object) caughtException;
                        statePc = 32;
                        continue stateLoop;
                    }
                    case 32: {
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

    final bc a(int param0, int param1, String param2) {
        int var4 = 114 % ((param1 - 34) / 51);
        return this.a((byte) -93, false, param0, param2);
    }

    final bc a(byte param0, Runnable param1, int param2) {
        if (param0 < 31) {
            return null;
        }
        return this.a(2, (byte) -59, (Object) (Object) param1, 0, param2);
    }

    public final void run() {
        try {
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            kk var3_ref = null;
            Exception var3_ref2 = null;
            fm var3_ref3 = null;
            int var3_int = 0;
            Throwable var4 = null;
            int var4_int = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            String var8 = null;
            bc var9 = null;
            Object[] var10 = null;
            Object[] var11 = null;
            java.awt.Component var12 = null;
            java.awt.Frame var13 = null;
            String var14 = null;
            java.awt.datatransfer.Clipboard var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            Object[] var17 = null;
            Thread var18 = null;
            int stackIn_80_0 = 0;
            int stackOut_78_0 = 0;
            int stackOut_79_0 = 0;
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
                            if (!((df) this).field_j) {
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
                            if (null == ((df) this).field_i) {
                                statePc = 8;
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
                            var9 = ((df) this).field_i;
                            ((df) this).field_i = ((df) this).field_i.field_a;
                            if (null == ((df) this).field_i) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            ((df) this).field_x = null;
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
                            var4 = caughtException;
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
                        throw (RuntimeException) (Object) var4;
                    }
                    case 15: {
                        try {
                            var2_int = var9.field_b;
                            if (var2_int == 1) {
                                statePc = 110;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if ((var2_int ^ -1) != -23) {
                                statePc = 22;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (field_h <= ri.a(-3)) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var9.field_f = (Object) (Object) fb.a(12, var9.field_e, (String) var9.field_c).b(-22176);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof kk ? 21 : (stateCaught_19 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var3_ref = (kk) (Object) caughtException;
                            var9.field_f = (Object) (Object) var3_ref.getMessage();
                            throw var3_ref;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (var2_int == 2) {
                                statePc = 109;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if ((var2_int ^ -1) == -5) {
                                statePc = 106;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if ((var2_int ^ -1) != -9) {
                                statePc = 31;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var10 = (Object[]) var9.field_c;
                            if (((df) this).field_p) {
                                statePc = 27;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (null == ((Class) var10[0]).getClassLoader()) {
                                statePc = 29;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var9.field_f = (Object) (Object) ((Class) var10[0]).getDeclaredMethod((String) var10[1], (Class[]) var10[2]);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (-10 == (var2_int ^ -1)) {
                                statePc = 100;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (var2_int == 18) {
                                statePc = 99;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if ((var2_int ^ -1) == -20) {
                                statePc = 98;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (((df) this).field_p) {
                                statePc = 36;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (var2_int == -4) {
                                statePc = 94;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (-22 == var2_int) {
                                statePc = 90;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (var2_int != 5) {
                                statePc = 42;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (((df) this).field_l) {
                                statePc = 41;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            var9.field_f = Class.forName("ff").getMethod("listmodes", new Class[0]).invoke(((df) this).field_m, new Object[0]);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            var9.field_f = (Object) (Object) ((df) this).field_c.a(0);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (-7 == var2_int) {
                                statePc = 87;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if (7 == var2_int) {
                                statePc = 84;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (var2_int == 12) {
                                statePc = 83;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (-14 != var2_int) {
                                statePc = 47;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            var3_ref3 = df.a((String) var9.field_c, "", 0, field_o);
                            var9.field_f = (Object) (Object) var3_ref3;
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (!((df) this).field_p) {
                                statePc = 52;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if ((var2_int ^ -1) != -15) {
                                statePc = 52;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var3_int = var9.field_e;
                            var4_int = var9.field_d;
                            if (((df) this).field_l) {
                                statePc = 51;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            Object discarded$6 = Class.forName("jm").getDeclaredMethod("movemouse", new Class[2]).invoke(((df) this).field_q, new Object[2]);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            ((df) this).field_w.a((byte) -127, var3_int, var4_int);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if (!((df) this).field_p) {
                                statePc = 55;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (-16 == var2_int) {
                                statePc = 77;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if (((df) this).field_l) {
                                statePc = 58;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            if (-18 == var2_int) {
                                statePc = 76;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if (var2_int != 16) {
                                statePc = 75;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            if (field_f.startsWith("win")) {
                                statePc = 62;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof Exception ? 74 : (stateCaught_60 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof Exception ? 74 : (stateCaught_61 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            var8 = (String) var9.field_c;
                            if (var8.startsWith("http://")) {
                                statePc = 66;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof Exception ? 74 : (stateCaught_62 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            if (!var8.startsWith("https://")) {
                                statePc = 65;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof Exception ? 74 : (stateCaught_63 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof Exception ? 74 : (stateCaught_64 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof Exception ? 74 : (stateCaught_65 instanceof ThreadDeath ? 115 : 116));
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
                            statePc = (stateCaught_66 instanceof Exception ? 74 : (stateCaught_66 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if (var5 >= var8.length()) {
                                statePc = 72;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = (stateCaught_67 instanceof Exception ? 74 : (stateCaught_67 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if (0 == (var4_ref.indexOf((int) var8.charAt(var5)) ^ -1)) {
                                statePc = 70;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof Exception ? 74 : (stateCaught_68 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = (stateCaught_69 instanceof Exception ? 74 : (stateCaught_69 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = (stateCaught_70 instanceof Exception ? 74 : (stateCaught_70 instanceof ThreadDeath ? 115 : 116));
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
                            statePc = (stateCaught_71 instanceof Exception ? 74 : (stateCaught_71 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            Process discarded$7 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var8 + "\"");
                            var9.field_f = null;
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = (stateCaught_72 instanceof Exception ? 74 : (stateCaught_72 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            var3_ref2 = (Exception) (Object) caughtException;
                            var9.field_f = (Object) (Object) var3_ref2;
                            throw (RuntimeException) (Object) var3_ref2;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = (stateCaught_74 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = (stateCaught_75 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            var11 = (Object[]) var9.field_c;
                            Object discarded$8 = Class.forName("jm").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((df) this).field_q, new Object[5]);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = (stateCaught_76 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            if (var9.field_e == 0) {
                                statePc = 79;
                            } else {
                                statePc = 78;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = (stateCaught_77 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            stackOut_78_0 = 1;
                            stackIn_80_0 = stackOut_78_0;
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            stackOut_79_0 = 0;
                            stackIn_80_0 = stackOut_79_0;
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            var3_int = stackIn_80_0;
                            var12 = (java.awt.Component) var9.field_c;
                            if (((df) this).field_l) {
                                statePc = 82;
                            } else {
                                statePc = 81;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = (stateCaught_80 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            Object discarded$9 = Class.forName("jm").getDeclaredMethod("showcursor", new Class[2]).invoke(((df) this).field_q, new Object[2]);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = (stateCaught_81 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            ((df) this).field_w.a((byte) -83, var12, var3_int != 0);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = (stateCaught_82 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            var3_ref3 = df.a((String) var9.field_c, field_g, 0, field_o);
                            var9.field_f = (Object) (Object) var3_ref3;
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = (stateCaught_83 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            if (((df) this).field_l) {
                                statePc = 86;
                            } else {
                                statePc = 85;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            Object discarded$10 = Class.forName("ff").getMethod("exit", new Class[0]).invoke(((df) this).field_m, new Object[0]);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = (stateCaught_85 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            ((df) this).field_c.a((byte) 73, (java.awt.Frame) var9.field_c);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = (stateCaught_86 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            var13 = new java.awt.Frame("Jagex Full Screen");
                            var9.field_f = (Object) (Object) var13;
                            var13.setResizable(false);
                            if (!((df) this).field_l) {
                                statePc = 89;
                            } else {
                                statePc = 88;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = (stateCaught_87 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            ((df) this).field_c.a(var9.field_e >>> 56086064, var13, var9.field_d & 65535, var9.field_d >> -448723632, var9.field_e & 65535, -2147483648);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = (stateCaught_88 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            Object discarded$11 = Class.forName("ff").getMethod("enter", new Class[5]).invoke(((df) this).field_m, new Object[5]);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = (stateCaught_89 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            if ((ri.a(-3) ^ -1L) > (field_h ^ -1L)) {
                                statePc = 92;
                            } else {
                                statePc = 91;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = (stateCaught_90 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = (stateCaught_91 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = (stateCaught_92 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            var9.field_f = (Object) (Object) java.net.InetAddress.getByName((String) var9.field_c).getAddress();
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = (stateCaught_93 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            if (field_h > ri.a(-3)) {
                                statePc = 96;
                            } else {
                                statePc = 95;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = (stateCaught_94 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            statePc = 97;
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = (stateCaught_95 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = (stateCaught_96 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            var14 = (var9.field_e >> -1814629000 & 255) + "." + (255 & var9.field_e >> 1556087984) + "." + ((65510 & var9.field_e) >> -2070388472) + "." + (255 & var9.field_e);
                            var9.field_f = (Object) (Object) java.net.InetAddress.getByName(var14).getHostName();
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = (stateCaught_97 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            var7 = (java.awt.datatransfer.Transferable) var9.field_c;
                            var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var15.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = (stateCaught_98 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var9.field_f = (Object) (Object) var16.getContents((Object) null);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = (stateCaught_99 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            var17 = (Object[]) var9.field_c;
                            if (((df) this).field_p) {
                                statePc = 102;
                            } else {
                                statePc = 101;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = (stateCaught_100 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            statePc = 105;
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = (stateCaught_101 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            if (null == ((Class) var17[0]).getClassLoader()) {
                                statePc = 104;
                            } else {
                                statePc = 103;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = (stateCaught_102 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            statePc = 105;
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = (stateCaught_103 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = (stateCaught_104 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            var9.field_f = (Object) (Object) ((Class) var17[0]).getDeclaredField((String) var17[1]);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = (stateCaught_105 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            if ((field_h ^ -1L) >= (ri.a(-3) ^ -1L)) {
                                statePc = 108;
                            } else {
                                statePc = 107;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = (stateCaught_106 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = (stateCaught_107 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            var9.field_f = (Object) (Object) new DataInputStream(((java.net.URL) var9.field_c).openStream());
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = (stateCaught_108 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            var18 = new Thread((Runnable) var9.field_c);
                            var18.setDaemon(true);
                            var18.start();
                            var18.setPriority(var9.field_e);
                            var9.field_f = (Object) (Object) var18;
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = (stateCaught_109 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        try {
                            if ((field_h ^ -1L) >= (ri.a(-3) ^ -1L)) {
                                statePc = 112;
                            } else {
                                statePc = 111;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_110) {
                            caughtException = stateCaught_110;
                            statePc = (stateCaught_110 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_111) {
                            caughtException = stateCaught_111;
                            statePc = (stateCaught_111 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 112: {
                        try {
                            var9.field_f = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var9.field_c), var9.field_e);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_112) {
                            caughtException = stateCaught_112;
                            statePc = (stateCaught_112 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 113: {
                        try {
                            var9.field_g = 1;
                            statePc = 117;
                            continue stateLoop;
                        } catch (Throwable stateCaught_113) {
                            caughtException = stateCaught_113;
                            statePc = (stateCaught_113 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 115: {
                        var2_ref = (ThreadDeath) (Object) caughtException;
                        throw var2_ref;
                    }
                    case 116: {
                        var2_ref2 = caughtException;
                        var9.field_g = 2;
                        statePc = 117;
                        continue stateLoop;
                    }
                    case 117: {
                        var2 = (Object) (Object) var9;
                        // monitorenter var9
                        statePc = 118;
                        continue stateLoop;
                    }
                    case 118: {
                        try {
                            ((Object) (Object) var9).notify();
                            // monitorexit var2
                            statePc = 0;
                            continue stateLoop;
                        } catch (Throwable stateCaught_118) {
                            caughtException = stateCaught_118;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 120: {
                        try {
                            var6 = caughtException;
                            // monitorexit var2
                            statePc = 121;
                            continue stateLoop;
                        } catch (Throwable stateCaught_120) {
                            caughtException = stateCaught_120;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 121: {
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

    final bc a(int param0, Class param1, String param2) {
        if (param0 != 0) {
            Object var5 = null;
            bc discarded$0 = ((df) this).a(-42, 93, (String) null);
        }
        return this.a(9, (byte) -55, (Object) (Object) new Object[2], 0, 0);
    }

    private final bc a(byte param0, boolean param1, int param2, String param3) {
        int var5 = -5 % ((-38 - param0) / 54);
        return this.a(param1 ? 22 : 1, (byte) -102, (Object) (Object) param3, 0, param2);
    }

    private final bc a(int param0, byte param1, Object param2, int param3, int param4) {
        bc var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = new bc();
                    var6.field_b = param0;
                    var6.field_c = param2;
                    if (param1 <= -36) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_o = -104;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var6.field_e = param4;
                    var6.field_d = param3;
                    var7 = this;
                    // monitorenter this
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        if (((df) this).field_x == null) {
                            statePc = 5;
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
                        ((df) this).field_x.field_a = var6;
                        ((df) this).field_x = var6;
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
                        ((df) this).field_i = var6;
                        ((df) this).field_x = var6;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        this.notify();
                        // monitorexit var7
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var8 = caughtException;
                        // monitorexit var7
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 9: {
                    throw (RuntimeException) (Object) var8;
                }
                case 10: {
                    return var6;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final bc a(byte param0, int param1, int param2, int param3, int param4) {
        if (param0 > -57) {
            ((df) this).b(38);
        }
        return this.a(6, (byte) -70, (Object) null, param2 + (param3 << 1872193360), (param1 << -697776752) + param4);
    }

    final boolean c(int param0) {
        if (!(((df) this).field_p)) {
            return false;
        }
        if (param0 > -120) {
            ((df) this).field_i = null;
        }
        if (!((df) this).field_l) {
            return ((df) this).field_m != null ? true : false;
        }
        return ((df) this).field_c != null ? true : false;
    }

    private final static fm a(String param0, String param1, int param2, int param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            fm var8_ref = null;
            fm stackIn_12_0 = null;
            Throwable decompiledCaughtException = null;
            fm stackOut_11_0 = null;
            L0: {
              if (param3 != 33) {
                if (-35 == (param3 ^ -1)) {
                  var4 = "jagex_" + param1 + "_preferences" + param0 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param1 + "_preferences" + param0 + ".dat";
                  break L0;
                }
              } else {
                var4 = "jagex_" + param1 + "_preferences" + param0 + "_rc.dat";
                break L0;
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_u, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = param2;
            L1: while (true) {
              if (var5_array.length > var6) {
                L2: {
                  var7 = var5_array[var6];
                  if (var7.length() <= 0) {
                    break L2;
                  } else {
                    if (new File(var7).exists()) {
                      break L2;
                    } else {
                      var6++;
                      continue L1;
                    }
                  }
                }
                try {
                  var8_ref = new fm(new File(var7, var4), "rw", 10000L);
                  stackOut_11_0 = (fm) var8_ref;
                  stackIn_12_0 = stackOut_11_0;
                } catch (java.lang.Exception decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  return stackIn_12_0;
                }
                continue L1;
              } else {
                return null;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final bc a(int param0) {
        if (param0 != 5) {
            field_e = null;
        }
        return this.a(5, (byte) -86, (Object) null, 0, 0);
    }

    final bc a(byte param0, Class param1, Class[] param2, String param3) {
        int var5 = 59 % ((-21 - param0) / 46);
        return this.a(8, (byte) -38, (Object) (Object) new Object[3], 0, 0);
    }

    df(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        mj var6 = null;
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
                    ((df) this).field_l = false;
                    ((df) this).field_n = null;
                    ((df) this).field_x = null;
                    ((df) this).field_p = false;
                    ((df) this).field_i = null;
                    ((df) this).field_t = null;
                    ((df) this).field_j = false;
                    ((df) this).field_v = null;
                    field_o = param0;
                    field_g = param1;
                    field_b = "Unknown";
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
                    ((df) this).field_p = stackIn_3_1 != 0;
                    field_s = "1.1";
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        field_b = System.getProperty("java.vendor");
                        field_s = System.getProperty("java.version");
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
                    if (field_b.toLowerCase().indexOf("microsoft") == -1) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ((df) this).field_l = true;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    try {
                        field_e = System.getProperty("os.name");
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
                    field_e = "Unknown";
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    field_f = field_e.toLowerCase();
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
                        field_u = System.getProperty("user.home");
                        if (null == field_u) {
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
                        field_u = field_u + "/";
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
                    if (field_u != null) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    field_u = "~/";
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    try {
                        ((df) this).field_k = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 27: {
                    var5_ref = caughtException;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if (((df) this).field_l) {
                        statePc = 35;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    try {
                        java.lang.reflect.Method discarded$6 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[1]);
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 31: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    try {
                        field_r = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
                    ub.a(field_g, field_o, -26761);
                    if (!((df) this).field_p) {
                        statePc = 53;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    ((df) this).field_n = new fm(ub.a((String) null, -3, field_o, "random.dat"), "rw", 25L);
                    ((df) this).field_t = new fm(ub.a("main_file_cache.dat2", (byte) 96), "rw", 314572800L);
                    ((df) this).field_v = new fm(ub.a("main_file_cache.idx255", (byte) 127), "rw", 1048576L);
                    ((df) this).field_d = new fm[param2];
                    var5_int = 0;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (param2 <= var5_int) {
                        statePc = 39;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    ((df) this).field_d[var5_int] = new fm(ub.a("main_file_cache.idx" + var5_int, (byte) -87), "rw", 1048576L);
                    var5_int++;
                    statePc = 37;
                    continue stateLoop;
                }
                case 39: {
                    if (!((df) this).field_l) {
                        statePc = 43;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    try {
                        Object discarded$7 = Class.forName("re").newInstance();
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 42: {
                    var5_ref = caughtException;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    try {
                        if (((df) this).field_l) {
                            statePc = 45;
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
                        ((df) this).field_m = Class.forName("ff").newInstance();
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var6 = new mj();
                        ((df) this).field_c = var6;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 47: {
                    var5_ref = caughtException;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    try {
                        if (!((df) this).field_l) {
                            statePc = 50;
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
                        ((df) this).field_w = new le();
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        ((df) this).field_q = Class.forName("jm").newInstance();
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 52: {
                    var5_ref = caughtException;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    ((df) this).field_j = false;
                    ((df) this).field_a = new Thread((Runnable) this);
                    ((df) this).field_a.setPriority(10);
                    ((df) this).field_a.setDaemon(true);
                    ((df) this).field_a.start();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 0L;
    }
}
