/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class d implements Runnable {
    private static String field_x;
    static java.lang.reflect.Method field_v;
    pa field_s;
    private cb field_d;
    java.awt.EventQueue field_q;
    static String field_t;
    private cb field_g;
    pa field_n;
    private static volatile long field_m;
    private Object field_u;
    private ie field_w;
    private static int field_f;
    pa field_j;
    pa[] field_r;
    private Thread field_i;
    static String field_b;
    private boolean field_h;
    static String field_o;
    private Object field_e;
    private tg field_a;
    private boolean field_l;
    private boolean field_c;
    private static String field_p;
    private static String field_k;

    final cb a(int param0) {
        if (param0 != 34) {
            Object var3 = null;
            pa discarded$0 = d.a((byte) 23, 7, (String) null, (String) null);
        }
        return this.a(1, (Object) null, 0, 5, 0);
    }

    final cb a(java.awt.Frame param0, int param1) {
        if (param1 != 0) {
            return null;
        }
        return this.a(1, (Object) (Object) param0, 0, 7, 0);
    }

    final boolean b(int param0) {
        if (param0 != -26098) {
            return false;
        }
        if (!((d) this).field_h) {
            return false;
        }
        if (!((d) this).field_l) {
            return null != ((d) this).field_e ? true : false;
        }
        return ((d) this).field_w != null ? true : false;
    }

    public final void run() {
        try {
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            bd var3_ref = null;
            Exception var3_ref2 = null;
            pa var3_ref3 = null;
            int var3_int = 0;
            Throwable var4 = null;
            int var4_int = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            String var8 = null;
            cb var9 = null;
            Thread var10 = null;
            Object[] var11 = null;
            java.awt.Component var12 = null;
            java.awt.Frame var13 = null;
            String var14 = null;
            java.awt.datatransfer.Clipboard var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            Object[] var17 = null;
            Object[] var18 = null;
            int stackIn_76_0 = 0;
            int stackOut_74_0 = 0;
            int stackOut_75_0 = 0;
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
                            if (((d) this).field_c) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            // monitorexit var2
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        return;
                    }
                    case 5: {
                        try {
                            if (((d) this).field_d == null) {
                                statePc = 9;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var9 = ((d) this).field_d;
                            ((d) this).field_d = ((d) this).field_d.field_e;
                            if (null == ((d) this).field_d) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            ((d) this).field_g = null;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            this.wait();
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof InterruptedException ? 11 : 14);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var3 = (InterruptedException) (Object) caughtException;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            // monitorexit var2
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var4 = caughtException;
                            // monitorexit var2
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        throw (RuntimeException) (Object) var4;
                    }
                    case 16: {
                        try {
                            var2_int = var9.field_d;
                            if (1 != var2_int) {
                                statePc = 21;
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
                            if ((oa.a(-12520) ^ -1L) > (field_m ^ -1L)) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var9.field_b = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var9.field_f), var9.field_c);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (-23 != (var2_int ^ -1)) {
                                statePc = 27;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (oa.a(-12520) >= field_m) {
                                statePc = 24;
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
                            throw new IOException();
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var9.field_b = (Object) (Object) mk.a(-43, (String) var9.field_f, var9.field_c).b(0);
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof bd ? 26 : (stateCaught_24 instanceof ThreadDeath ? 112 : 113));
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var3_ref = (bd) (Object) caughtException;
                            var9.field_b = (Object) (Object) var3_ref.getMessage();
                            throw var3_ref;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if ((var2_int ^ -1) != -3) {
                                statePc = 29;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var10 = new Thread((Runnable) var9.field_f);
                            var10.setDaemon(true);
                            var10.start();
                            var10.setPriority(var9.field_c);
                            var9.field_b = (Object) (Object) var10;
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (4 == var2_int) {
                                statePc = 106;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if ((var2_int ^ -1) == -9) {
                                statePc = 101;
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
                            if (var2_int == -10) {
                                statePc = 97;
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
                            if (18 == var2_int) {
                                statePc = 96;
                            } else {
                                statePc = 33;
                            }
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
                                statePc = 95;
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
                            if (!((d) this).field_h) {
                                statePc = 94;
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
                            if (-4 == var2_int) {
                                statePc = 90;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (-22 == (var2_int ^ -1)) {
                                statePc = 87;
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
                            if (var2_int != 5) {
                                statePc = 41;
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
                            if (!((d) this).field_l) {
                                statePc = 40;
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
                            var9.field_b = (Object) (Object) ((d) this).field_w.a(8);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            var9.field_b = Class.forName("pd").getMethod("listmodes", new Class[0]).invoke(((d) this).field_e, new Object[0]);
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
                            if (6 == var2_int) {
                                statePc = 84;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if ((var2_int ^ -1) == -8) {
                                statePc = 81;
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
                            if (12 == var2_int) {
                                statePc = 80;
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
                            if ((var2_int ^ -1) == -14) {
                                statePc = 79;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (!((d) this).field_h) {
                                statePc = 50;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (var2_int != 14) {
                                statePc = 50;
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
                            var3_int = var9.field_c;
                            var4_int = var9.field_g;
                            if (!((d) this).field_l) {
                                statePc = 49;
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
                            ((d) this).field_a.a(-71, var4_int, var3_int);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            Object discarded$6 = Class.forName("tk").getDeclaredMethod("movemouse", new Class[2]).invoke(((d) this).field_u, new Object[2]);
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
                            if (!((d) this).field_h) {
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
                            if (var2_int == 15) {
                                statePc = 73;
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
                            if (((d) this).field_l) {
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
                            if (-18 == (var2_int ^ -1)) {
                                statePc = 72;
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
                            if ((var2_int ^ -1) != -17) {
                                statePc = 71;
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
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if (field_b.startsWith("win")) {
                                statePc = 60;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof Exception ? 70 : (stateCaught_58 instanceof ThreadDeath ? 112 : 113));
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof Exception ? 70 : (stateCaught_59 instanceof ThreadDeath ? 112 : 113));
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            var8 = (String) var9.field_f;
                            if (var8.startsWith("http://")) {
                                statePc = 63;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof Exception ? 70 : (stateCaught_60 instanceof ThreadDeath ? 112 : 113));
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (var8.startsWith("https://")) {
                                statePc = 63;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof Exception ? 70 : (stateCaught_61 instanceof ThreadDeath ? 112 : 113));
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof Exception ? 70 : (stateCaught_62 instanceof ThreadDeath ? 112 : 113));
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            var5 = 0;
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof Exception ? 70 : (stateCaught_63 instanceof ThreadDeath ? 112 : 113));
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            if (var5 >= var8.length()) {
                                statePc = 68;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof Exception ? 70 : (stateCaught_64 instanceof ThreadDeath ? 112 : 113));
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            if (-1 != var4_ref.indexOf((int) var8.charAt(var5))) {
                                statePc = 67;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof Exception ? 70 : (stateCaught_65 instanceof ThreadDeath ? 112 : 113));
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof Exception ? 70 : (stateCaught_66 instanceof ThreadDeath ? 112 : 113));
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            var5++;
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = (stateCaught_67 instanceof Exception ? 70 : (stateCaught_67 instanceof ThreadDeath ? 112 : 113));
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            Process discarded$7 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var8 + "\"");
                            var9.field_b = null;
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof Exception ? 70 : (stateCaught_68 instanceof ThreadDeath ? 112 : 113));
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = (stateCaught_69 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            var3_ref2 = (Exception) (Object) caughtException;
                            var9.field_b = (Object) (Object) var3_ref2;
                            throw (RuntimeException) (Object) var3_ref2;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = (stateCaught_70 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = (stateCaught_71 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            var11 = (Object[]) var9.field_f;
                            Object discarded$8 = Class.forName("tk").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((d) this).field_u, new Object[5]);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = (stateCaught_72 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            if (-1 == (var9.field_c ^ -1)) {
                                statePc = 75;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            stackOut_74_0 = 1;
                            stackIn_76_0 = stackOut_74_0;
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = (stateCaught_74 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            stackOut_75_0 = 0;
                            stackIn_76_0 = stackOut_75_0;
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = (stateCaught_75 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            var3_int = stackIn_76_0;
                            var12 = (java.awt.Component) var9.field_f;
                            if (((d) this).field_l) {
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
                            Object discarded$9 = Class.forName("tk").getDeclaredMethod("showcursor", new Class[2]).invoke(((d) this).field_u, new Object[2]);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = (stateCaught_77 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            ((d) this).field_a.a(12758, var3_int != 0, var12);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            var3_ref3 = d.a((byte) 19, field_f, "", (String) var9.field_f);
                            var9.field_b = (Object) (Object) var3_ref3;
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            var3_ref3 = d.a((byte) -103, field_f, field_p, (String) var9.field_f);
                            var9.field_b = (Object) (Object) var3_ref3;
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
                            if (((d) this).field_l) {
                                statePc = 83;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = (stateCaught_81 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            Object discarded$10 = Class.forName("pd").getMethod("exit", new Class[0]).invoke(((d) this).field_e, new Object[0]);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = (stateCaught_82 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            ((d) this).field_w.a(111, (java.awt.Frame) var9.field_f);
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
                            var13 = new java.awt.Frame("Jagex Full Screen");
                            var9.field_b = (Object) (Object) var13;
                            var13.setResizable(false);
                            if (((d) this).field_l) {
                                statePc = 86;
                            } else {
                                statePc = 85;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            Object discarded$11 = Class.forName("pd").getMethod("enter", new Class[5]).invoke(((d) this).field_e, new Object[5]);
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
                            ((d) this).field_w.a(8, var9.field_c >>> 1309967216, var13, var9.field_g >> 1043765136, var9.field_c & 65535, var9.field_g & 65535);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = (stateCaught_86 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            if ((oa.a(-12520) ^ -1L) <= (field_m ^ -1L)) {
                                statePc = 89;
                            } else {
                                statePc = 88;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = (stateCaught_87 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = (stateCaught_88 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            var9.field_b = (Object) (Object) java.net.InetAddress.getByName((String) var9.field_f).getAddress();
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = (stateCaught_89 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            if ((oa.a(-12520) ^ -1L) > (field_m ^ -1L)) {
                                statePc = 92;
                            } else {
                                statePc = 91;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = (stateCaught_90 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = (stateCaught_91 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = (stateCaught_92 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            var14 = (255 & var9.field_c >> -411661352) + "." + ((var9.field_c & 16718053) >> -1690845136) + "." + (var9.field_c >> -2059917432 & 255) + "." + (255 & var9.field_c);
                            var9.field_b = (Object) (Object) java.net.InetAddress.getByName(var14).getHostName();
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = (stateCaught_93 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = (stateCaught_94 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            var7 = (java.awt.datatransfer.Transferable) var9.field_f;
                            var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var15.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
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
                            var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var9.field_b = (Object) (Object) var16.getContents((Object) null);
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
                            var17 = (Object[]) var9.field_f;
                            if (!((d) this).field_h) {
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
                            if (null != ((Class) var17[0]).getClassLoader()) {
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
                            var9.field_b = (Object) (Object) ((Class) var17[0]).getDeclaredField((String) var17[1]);
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
                            var18 = (Object[]) var9.field_f;
                            if (!((d) this).field_h) {
                                statePc = 105;
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
                            if (((Class) var18[0]).getClassLoader() == null) {
                                statePc = 104;
                            } else {
                                statePc = 103;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = (stateCaught_102 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            statePc = 105;
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = (stateCaught_103 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = (stateCaught_104 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            var9.field_b = (Object) (Object) ((Class) var18[0]).getDeclaredMethod((String) var18[1], (Class[]) var18[2]);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = (stateCaught_105 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            if (oa.a(-12520) < field_m) {
                                statePc = 108;
                            } else {
                                statePc = 107;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = (stateCaught_106 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = (stateCaught_107 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = (stateCaught_108 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            var9.field_b = (Object) (Object) new DataInputStream(((java.net.URL) var9.field_f).openStream());
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = (stateCaught_109 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        try {
                            var9.field_a = 1;
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
                        var9.field_a = 2;
                        statePc = 114;
                        continue stateLoop;
                    }
                    case 114: {
                        var2 = (Object) (Object) var9;
                        // monitorenter var9
                        statePc = 115;
                        continue stateLoop;
                    }
                    case 115: {
                        try {
                            ((Object) (Object) var9).notify();
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

    private final cb a(int param0, int param1, boolean param2, String param3) {
        if (param0 != 0) {
            ((d) this).field_j = null;
        }
        return this.a(1, (Object) (Object) param3, param1, param2 ? 22 : 1, 0);
    }

    final cb a(Runnable param0, int param1, int param2) {
        if (param1 != 0) {
            return null;
        }
        return this.a(param1 + 1, (Object) (Object) param0, param2, 2, 0);
    }

    private final static pa a(byte param0, int param1, String param2, String param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            int var7 = 0;
            String var8 = null;
            Exception var9 = null;
            pa var9_ref = null;
            pa stackIn_13_0 = null;
            Throwable decompiledCaughtException = null;
            pa stackOut_12_0 = null;
            L0: {
              if (33 == param1) {
                var4 = "jagex_" + param2 + "_preferences" + param3 + "_rc.dat";
                break L0;
              } else {
                if (34 != param1) {
                  var4 = "jagex_" + param2 + "_preferences" + param3 + ".dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param2 + "_preferences" + param3 + "_wip.dat";
                  break L0;
                }
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_x, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var7 = -95 % ((-46 - param0) / 35);
            var6 = 0;
            L1: while (true) {
              if (var6 < var5_array.length) {
                L2: {
                  var8 = var5_array[var6];
                  if (0 >= var8.length()) {
                    break L2;
                  } else {
                    if (new File(var8).exists()) {
                      break L2;
                    } else {
                      var6++;
                      continue L1;
                    }
                  }
                }
                try {
                  var9_ref = new pa(new File(var8, var4), "rw", 10000L);
                  stackOut_12_0 = (pa) var9_ref;
                  stackIn_13_0 = stackOut_12_0;
                } catch (java.lang.Exception decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  return stackIn_13_0;
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

    final void a(byte param0) {
        try {
            Object var2 = null;
            InterruptedException var2_ref = null;
            IOException var2_ref2 = null;
            int var2_int = 0;
            Throwable var3 = null;
            IOException var3_ref = null;
            Object var4 = null;
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
                            ((d) this).field_c = true;
                            if (param0 == 13) {
                                statePc = 3;
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
                            var4 = null;
                            cb discarded$1 = this.a(-99, 45, true, (String) null);
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
                            this.notifyAll();
                            // monitorexit var2
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var3 = caughtException;
                            // monitorexit var2
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        throw (RuntimeException) (Object) var3;
                    }
                    case 7: {
                        try {
                            ((d) this).field_i.join();
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
                        if (((d) this).field_j != null) {
                            statePc = 12;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        try {
                            ((d) this).field_j.a((byte) -5);
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
                        if (null == ((d) this).field_s) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        try {
                            ((d) this).field_s.a((byte) -5);
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
                        if (null != ((d) this).field_r) {
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
                        if (var2_int >= ((d) this).field_r.length) {
                            statePc = 29;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        if (((d) this).field_r[var2_int] != null) {
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
                            ((d) this).field_r[var2_int].a((byte) -5);
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
                        if (null != ((d) this).field_n) {
                            statePc = 31;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        try {
                            ((d) this).field_n.a((byte) -5);
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

    final cb a(int param0, String param1, boolean param2) {
        if (param2) {
            cb discarded$0 = ((d) this).a(82);
        }
        return this.a(0, param0, false, param1);
    }

    final cb a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != -1743550128) {
            return null;
        }
        return this.a(param1 ^ -1743550127, (Object) null, param0 + (param4 << -1333938256), 6, (param3 << -1743550128) + param2);
    }

    final cb a(Class param0, int param1, String param2) {
        if (param1 != 0) {
            ((d) this).field_w = null;
        }
        return this.a(1, (Object) (Object) new Object[2], 0, 9, 0);
    }

    private final cb a(int param0, Object param1, int param2, int param3, int param4) {
        cb var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = new cb();
                    var6.field_f = param1;
                    var6.field_c = param2;
                    var6.field_g = param4;
                    if (param0 == 1) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return null;
                }
                case 2: {
                    var6.field_d = param3;
                    var7 = this;
                    // monitorenter this
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        if (((d) this).field_g == null) {
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
                        ((d) this).field_g.field_e = var6;
                        ((d) this).field_g = var6;
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
                        ((d) this).field_d = var6;
                        ((d) this).field_g = var6;
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

    final cb a(String param0, int param1, Class[] param2, Class param3) {
        if (param1 >= -118) {
            ((d) this).field_e = null;
        }
        return this.a(1, (Object) (Object) new Object[3], 0, 8, 0);
    }

    final cb a(int param0, java.net.URL param1) {
        if (param0 != -14) {
            return null;
        }
        return this.a(1, (Object) (Object) param1, 0, 4, 0);
    }

    d(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        ie var6 = null;
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
                    ((d) this).field_d = null;
                    ((d) this).field_n = null;
                    ((d) this).field_j = null;
                    ((d) this).field_g = null;
                    ((d) this).field_s = null;
                    ((d) this).field_l = false;
                    ((d) this).field_h = false;
                    ((d) this).field_c = false;
                    field_p = param1;
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
                    ((d) this).field_h = stackIn_3_1 != 0;
                    field_o = "Unknown";
                    field_t = "1.1";
                    field_f = param0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        field_o = System.getProperty("java.vendor");
                        field_t = System.getProperty("java.version");
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
                    if (field_o.toLowerCase().indexOf("microsoft") != -1) {
                        statePc = 9;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 9: {
                    ((d) this).field_l = true;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    try {
                        field_k = System.getProperty("os.name");
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
                    field_k = "Unknown";
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    field_b = field_k.toLowerCase();
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
                        field_x = System.getProperty("user.home");
                        if (field_x == null) {
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
                        field_x = field_x + "/";
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
                    if (null != field_x) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    field_x = "~/";
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    try {
                        ((d) this).field_q = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
                    if (((d) this).field_l) {
                        statePc = 36;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    try {
                        java.lang.reflect.Method discarded$6 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[1]);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 32: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    try {
                        field_v = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 35: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    aj.a((byte) 66, field_p, field_f);
                    if (!((d) this).field_h) {
                        statePc = 55;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    ((d) this).field_n = new pa(aj.a((String) null, -27533, "random.dat", field_f), "rw", 25L);
                    ((d) this).field_j = new pa(aj.a("main_file_cache.dat2", (byte) -116), "rw", 314572800L);
                    ((d) this).field_s = new pa(aj.a("main_file_cache.idx255", (byte) -77), "rw", 1048576L);
                    ((d) this).field_r = new pa[param2];
                    var5_int = 0;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (var5_int >= param2) {
                        statePc = 40;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    ((d) this).field_r[var5_int] = new pa(aj.a("main_file_cache.idx" + var5_int, (byte) -104), "rw", 1048576L);
                    var5_int++;
                    statePc = 38;
                    continue stateLoop;
                }
                case 40: {
                    if (((d) this).field_l) {
                        statePc = 42;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 42: {
                    try {
                        Object discarded$7 = Class.forName("of").newInstance();
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 44: {
                    var5_ref = caughtException;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    try {
                        if (((d) this).field_l) {
                            statePc = 47;
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
                        ((d) this).field_e = Class.forName("pd").newInstance();
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var6 = new ie();
                        ((d) this).field_w = var6;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 49: {
                    var5_ref = caughtException;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    try {
                        if (!((d) this).field_l) {
                            statePc = 52;
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
                        ((d) this).field_a = new tg();
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        ((d) this).field_u = Class.forName("tk").newInstance();
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 54: {
                    var5_ref = caughtException;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    ((d) this).field_c = false;
                    ((d) this).field_i = new Thread((Runnable) this);
                    ((d) this).field_i.setPriority(10);
                    ((d) this).field_i.setDaemon(true);
                    ((d) this).field_i.start();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 0L;
    }
}
