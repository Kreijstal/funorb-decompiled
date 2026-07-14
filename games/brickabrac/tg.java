/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tg implements Runnable {
    static String field_b;
    private static String field_h;
    private boolean field_r;
    java.awt.EventQueue field_p;
    private io field_u;
    private Thread field_j;
    rn field_k;
    private static String field_e;
    boolean field_i;
    private static volatile long field_f;
    private static int field_c;
    private ql field_d;
    private Object field_a;
    private ql field_v;
    private boolean field_l;
    rn[] field_s;
    static String field_g;
    rn field_m;
    rn field_q;
    private static String field_t;
    private Object field_n;
    static java.lang.reflect.Method field_x;
    static String field_o;
    private in field_w;

    private final ql a(String param0, int param1, boolean param2, int param3) {
        if (param3 != -31592) {
            ((tg) this).field_r = false;
        }
        return this.a(true, 0, (Object) (Object) param0, param2 ? 22 : 1, param1);
    }

    final ql a(int param0, Runnable param1, byte param2) {
        if (param2 >= -68) {
            Object var5 = null;
            ql discarded$0 = ((tg) this).a(-7, (Class) null, (Class[]) null, (String) null);
        }
        return this.a(true, 0, (Object) (Object) param1, 2, param0);
    }

    final boolean b(int param0) {
        int var2 = -94 / ((param0 - 4) / 42);
        if (!((tg) this).field_i) {
            return false;
        }
        if (!((tg) this).field_r) {
            return ((tg) this).field_a != null ? true : false;
        }
        return null != ((tg) this).field_u ? true : false;
    }

    final ql a(byte param0, java.net.URL param1) {
        int var3 = 36 / ((param0 - 3) / 40);
        return this.a(true, 0, (Object) (Object) param1, 4, 0);
    }

    final ql a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != -35) {
            ql discarded$0 = ((tg) this).a(125, -72, 117, -42, -13);
        }
        return this.a(true, param0 + (param3 << -2079092080), (Object) null, 6, (param4 << -729368880) + param2);
    }

    final ql a(String param0, byte param1, int param2) {
        if (param1 != 120) {
            Object var5 = null;
            ql discarded$0 = this.a(false, -76, (Object) null, 124, 36);
        }
        return this.a(param0, param2, false, -31592);
    }

    public final void run() {
        try {
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            ef var3_ref = null;
            Exception var3_ref2 = null;
            rn var3_ref3 = null;
            int var3_int = 0;
            Throwable var4 = null;
            int var4_int = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            ql var8 = null;
            String var9 = null;
            java.awt.Frame var10 = null;
            java.awt.Component var11 = null;
            Object[] var12 = null;
            String var13 = null;
            java.awt.datatransfer.Clipboard var14 = null;
            java.awt.datatransfer.Clipboard var15 = null;
            Object[] var16 = null;
            Object[] var17 = null;
            Thread var18 = null;
            int stackIn_67_0 = 0;
            int stackOut_65_0;
            int stackOut_66_0;
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
                            if (((tg) this).field_l) {
                                statePc = 3;
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
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 13;
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
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        return;
                    }
                    case 5: {
                        try {
                            if (((tg) this).field_v == null) {
                                statePc = 8;
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
                            var8 = ((tg) this).field_v;
                            ((tg) this).field_v = ((tg) this).field_v.field_a;
                            if (null != ((tg) this).field_v) {
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
                            ((tg) this).field_d = null;
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
                            var2_int = var8.field_d;
                            if ((var2_int ^ -1) != -2) {
                                statePc = 19;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if ((ue.a(false) ^ -1L) <= (field_f ^ -1L)) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var8.field_e = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8.field_b), var8.field_g);
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if ((var2_int ^ -1) != -23) {
                                statePc = 25;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (field_f <= ue.a(false)) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var8.field_e = (Object) (Object) nd.a(60, var8.field_g, (String) var8.field_b).a(0);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof ef ? 24 : (stateCaught_22 instanceof ThreadDeath ? 108 : 109));
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var3_ref = (ef) (Object) caughtException;
                            var8.field_e = (Object) (Object) var3_ref.getMessage();
                            throw var3_ref;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (-3 == (var2_int ^ -1)) {
                                statePc = 105;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if ((var2_int ^ -1) == -5) {
                                statePc = 101;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if ((var2_int ^ -1) == -9) {
                                statePc = 96;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (var2_int == 9) {
                                statePc = 92;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (var2_int == 18) {
                                statePc = 91;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if ((var2_int ^ -1) == -20) {
                                statePc = 90;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (((tg) this).field_i) {
                                statePc = 33;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (var2_int != 3) {
                                statePc = 37;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (ue.a(false) >= field_f) {
                                statePc = 36;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var9 = (255 & var8.field_g >> 868830360) + "." + (var8.field_g >> -1719038832 & 255) + "." + ((65391 & var8.field_g) >> -1513596184) + "." + (255 & var8.field_g);
                            var8.field_e = (Object) (Object) java.net.InetAddress.getByName(var9).getHostName();
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if ((var2_int ^ -1) != -22) {
                                statePc = 41;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (ue.a(false) >= field_f) {
                                statePc = 40;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            var8.field_e = (Object) (Object) java.net.InetAddress.getByName((String) var8.field_b).getAddress();
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if (-6 != (var2_int ^ -1)) {
                                statePc = 45;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (!((tg) this).field_r) {
                                statePc = 44;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            var8.field_e = (Object) (Object) ((tg) this).field_u.a((byte) -48);
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            var8.field_e = Class.forName("db").getMethod("listmodes", new Class[0]).invoke(((tg) this).field_a, new Object[0]);
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (6 != var2_int) {
                                statePc = 49;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            var10 = new java.awt.Frame("Jagex Full Screen");
                            var8.field_e = (Object) (Object) var10;
                            var10.setResizable(false);
                            if (((tg) this).field_r) {
                                statePc = 48;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            Object discarded$6 = Class.forName("db").getMethod("enter", new Class[5]).invoke(((tg) this).field_a, new Object[5]);
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            ((tg) this).field_u.a(var10, 65535 & var8.field_g, var8.field_g >>> 37161616, 0, var8.field_c & 65535, var8.field_c >> -2121238704);
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            if (-8 != (var2_int ^ -1)) {
                                statePc = 53;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (((tg) this).field_r) {
                                statePc = 52;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            Object discarded$7 = Class.forName("db").getMethod("exit", new Class[0]).invoke(((tg) this).field_a, new Object[0]);
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            ((tg) this).field_u.a(-3887, (java.awt.Frame) var8.field_b);
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (12 != var2_int) {
                                statePc = 55;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            var3_ref3 = tg.a((String) var8.field_b, field_c, field_t, (byte) -70);
                            var8.field_e = (Object) (Object) var3_ref3;
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof ThreadDeath ? 108 : 109);
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
                            statePc = (stateCaught_55 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            var3_ref3 = tg.a((String) var8.field_b, field_c, "", (byte) -89);
                            var8.field_e = (Object) (Object) var3_ref3;
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            if (!((tg) this).field_i) {
                                statePc = 62;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if ((var2_int ^ -1) != -15) {
                                statePc = 62;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            var3_int = var8.field_g;
                            var4_int = var8.field_c;
                            if (((tg) this).field_r) {
                                statePc = 61;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            Object discarded$8 = Class.forName("dd").getDeclaredMethod("movemouse", new Class[2]).invoke(((tg) this).field_n, new Object[2]);
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            ((tg) this).field_w.a(var4_int, -4, var3_int);
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            if (!((tg) this).field_i) {
                                statePc = 70;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            if (15 != var2_int) {
                                statePc = 70;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            if (-1 == (var8.field_g ^ -1)) {
                                statePc = 66;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            stackOut_65_0 = 1;
                            stackIn_67_0 = stackOut_65_0;
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            stackOut_66_0 = 0;
                            stackIn_67_0 = stackOut_66_0;
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            var3_int = stackIn_67_0;
                            var11 = (java.awt.Component) var8.field_b;
                            if (!((tg) this).field_r) {
                                statePc = 69;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = (stateCaught_67 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            ((tg) this).field_w.a(var11, 0, var3_int != 0);
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            Object discarded$9 = Class.forName("dd").getDeclaredMethod("showcursor", new Class[2]).invoke(((tg) this).field_n, new Object[2]);
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = (stateCaught_69 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            if (((tg) this).field_r) {
                                statePc = 73;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = (stateCaught_70 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            if (17 != var2_int) {
                                statePc = 73;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = (stateCaught_71 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            var12 = (Object[]) var8.field_b;
                            Object discarded$10 = Class.forName("dd").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((tg) this).field_n, new Object[5]);
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = (stateCaught_72 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            if ((var2_int ^ -1) != -17) {
                                statePc = 89;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            if (field_b.startsWith("win")) {
                                statePc = 76;
                            } else {
                                statePc = 75;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = (stateCaught_74 instanceof Exception ? 88 : (stateCaught_74 instanceof ThreadDeath ? 108 : 109));
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = (stateCaught_75 instanceof Exception ? 88 : (stateCaught_75 instanceof ThreadDeath ? 108 : 109));
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            var13 = (String) var8.field_b;
                            if (var13.startsWith("http://")) {
                                statePc = 80;
                            } else {
                                statePc = 77;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = (stateCaught_76 instanceof Exception ? 88 : (stateCaught_76 instanceof ThreadDeath ? 108 : 109));
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            if (!var13.startsWith("https://")) {
                                statePc = 79;
                            } else {
                                statePc = 78;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = (stateCaught_77 instanceof Exception ? 88 : (stateCaught_77 instanceof ThreadDeath ? 108 : 109));
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof Exception ? 88 : (stateCaught_78 instanceof ThreadDeath ? 108 : 109));
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof Exception ? 88 : (stateCaught_79 instanceof ThreadDeath ? 108 : 109));
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            var5 = 0;
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = (stateCaught_80 instanceof Exception ? 88 : (stateCaught_80 instanceof ThreadDeath ? 108 : 109));
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            if (var5 >= var13.length()) {
                                statePc = 86;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = (stateCaught_81 instanceof Exception ? 88 : (stateCaught_81 instanceof ThreadDeath ? 108 : 109));
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            if (-1 == var4_ref.indexOf((int) var13.charAt(var5))) {
                                statePc = 84;
                            } else {
                                statePc = 83;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = (stateCaught_82 instanceof Exception ? 88 : (stateCaught_82 instanceof ThreadDeath ? 108 : 109));
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = (stateCaught_83 instanceof Exception ? 88 : (stateCaught_83 instanceof ThreadDeath ? 108 : 109));
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof Exception ? 88 : (stateCaught_84 instanceof ThreadDeath ? 108 : 109));
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            var5++;
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = (stateCaught_85 instanceof Exception ? 88 : (stateCaught_85 instanceof ThreadDeath ? 108 : 109));
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            Process discarded$11 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                            var8.field_e = null;
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = (stateCaught_86 instanceof Exception ? 88 : (stateCaught_86 instanceof ThreadDeath ? 108 : 109));
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = (stateCaught_87 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            var3_ref2 = (Exception) (Object) caughtException;
                            var8.field_e = (Object) (Object) var3_ref2;
                            throw (RuntimeException) (Object) var3_ref2;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = (stateCaught_88 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = (stateCaught_89 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            var7 = (java.awt.datatransfer.Transferable) var8.field_b;
                            var14 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var14.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = (stateCaught_90 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var8.field_e = (Object) (Object) var15.getContents((Object) null);
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = (stateCaught_91 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            var16 = (Object[]) var8.field_b;
                            if (!((tg) this).field_i) {
                                statePc = 95;
                            } else {
                                statePc = 93;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = (stateCaught_92 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            if (null != ((Class) var16[0]).getClassLoader()) {
                                statePc = 95;
                            } else {
                                statePc = 94;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = (stateCaught_93 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = (stateCaught_94 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            var8.field_e = (Object) (Object) ((Class) var16[0]).getDeclaredField((String) var16[1]);
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = (stateCaught_95 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            var17 = (Object[]) var8.field_b;
                            if (!((tg) this).field_i) {
                                statePc = 100;
                            } else {
                                statePc = 97;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = (stateCaught_96 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            if (((Class) var17[0]).getClassLoader() == null) {
                                statePc = 99;
                            } else {
                                statePc = 98;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = (stateCaught_97 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            statePc = 100;
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = (stateCaught_98 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = (stateCaught_99 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            var8.field_e = (Object) (Object) ((Class) var17[0]).getDeclaredMethod((String) var17[1], (Class[]) var17[2]);
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = (stateCaught_100 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            if ((ue.a(false) ^ -1L) > (field_f ^ -1L)) {
                                statePc = 103;
                            } else {
                                statePc = 102;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = (stateCaught_101 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            statePc = 104;
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = (stateCaught_102 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = (stateCaught_103 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            var8.field_e = (Object) (Object) new DataInputStream(((java.net.URL) var8.field_b).openStream());
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = (stateCaught_104 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            var18 = new Thread((Runnable) var8.field_b);
                            var18.setDaemon(true);
                            var18.start();
                            var18.setPriority(var8.field_g);
                            var8.field_e = (Object) (Object) var18;
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = (stateCaught_105 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            var8.field_f = 1;
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = (stateCaught_106 instanceof ThreadDeath ? 108 : 109);
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        var2_ref = (ThreadDeath) (Object) caughtException;
                        throw var2_ref;
                    }
                    case 109: {
                        var2_ref2 = caughtException;
                        var8.field_f = 2;
                        statePc = 110;
                        continue stateLoop;
                    }
                    case 110: {
                        var2 = (Object) (Object) var8;
                        // monitorenter var8
                        statePc = 111;
                        continue stateLoop;
                    }
                    case 111: {
                        try {
                            ((Object) (Object) var8).notify();
                            // monitorexit var2
                            statePc = 0;
                            continue stateLoop;
                        } catch (Throwable stateCaught_111) {
                            caughtException = stateCaught_111;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 113: {
                        try {
                            var6 = caughtException;
                            // monitorexit var2
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_113) {
                            caughtException = stateCaught_113;
                            statePc = 113;
                            continue stateLoop;
                        }
                    }
                    case 114: {
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

    final ql a(int param0) {
        if (param0 != 0) {
            ql discarded$0 = ((tg) this).a(79);
        }
        return this.a(true, 0, (Object) null, 5, 0);
    }

    final ql a(int param0, Class param1, String param2) {
        int var4 = 121 / ((param0 - 7) / 36);
        return this.a(true, 0, (Object) (Object) new Object[2], 9, 0);
    }

    private final static rn a(String param0, int param1, String param2, byte param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            rn var8_ref = null;
            Object var9 = null;
            rn stackIn_12_0 = null;
            Throwable decompiledCaughtException = null;
            rn stackOut_11_0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (-34 == param1) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (-35 == param1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var4 = "jagex_" + param2 + "_preferences" + param0 + ".dat";
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 3: {
                        var4 = "jagex_" + param2 + "_preferences" + param0 + "_wip.dat";
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 4: {
                        var4 = "jagex_" + param2 + "_preferences" + param0 + "_rc.dat";
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        var5_array = new String[]{"c:/rscache/", "/rscache/", field_e, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
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
                            var8_ref = new rn(new File(var7, var4), "rw", 10000L);
                            stackOut_11_0 = (rn) var8_ref;
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
                        return (rn) (Object) stackIn_12_0;
                    }
                    case 13: {
                        var8 = (Exception) (Object) caughtException;
                        var6++;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 14: {
                        if (param3 >= -61) {
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
                        rn discarded$1 = tg.a((String) null, 48, (String) null, (byte) -119);
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
            Object stackOut_1_0;
            Object stackOut_2_0;
            int stackOut_2_1;
            Object stackOut_3_0;
            int stackOut_3_1;
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
                            ((tg) this).field_l = stackIn_4_1 != 0;
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
                            ((tg) this).field_j.join();
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
                        if (((tg) this).field_q != null) {
                            statePc = 13;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        try {
                            ((tg) this).field_q.c(83);
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
                        if (((tg) this).field_m != null) {
                            statePc = 18;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        try {
                            ((tg) this).field_m.c(-119);
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
                        if (((tg) this).field_s != null) {
                            statePc = 23;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        var2_int = 0;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 24: {
                        if (((tg) this).field_s.length <= var2_int) {
                            statePc = 31;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        if (null != ((tg) this).field_s[var2_int]) {
                            statePc = 28;
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
                    case 28: {
                        try {
                            ((tg) this).field_s[var2_int].c(56);
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        var2_int++;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 30: {
                        var3_ref = (IOException) (Object) caughtException;
                        var2_int++;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 31: {
                        if (null != ((tg) this).field_k) {
                            statePc = 33;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    }
                    case 33: {
                        try {
                            ((tg) this).field_k.c(108);
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        var2_ref2 = (IOException) (Object) caughtException;
                        statePc = 36;
                        continue stateLoop;
                    }
                    case 36: {
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

    final ql a(int param0, Class param1, Class[] param2, String param3) {
        if (param0 != 23311) {
            return null;
        }
        return this.a(true, 0, (Object) (Object) new Object[3], 8, 0);
    }

    final ql a(int param0, java.awt.Frame param1) {
        int var3 = -2 / ((param0 - 54) / 37);
        return this.a(true, 0, (Object) (Object) param1, 7, 0);
    }

    private final ql a(boolean param0, int param1, Object param2, int param3, int param4) {
        ql var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Object var9 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = new ql();
                    var6.field_g = param4;
                    var6.field_b = param2;
                    if (param0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var9 = null;
                    ql discarded$3 = ((tg) this).a((String) null, (byte) -43, 124);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var6.field_c = param1;
                    var6.field_d = param3;
                    var7 = this;
                    // monitorenter this
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        if (null != ((tg) this).field_d) {
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
                        ((tg) this).field_v = var6;
                        ((tg) this).field_d = var6;
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
                        ((tg) this).field_d.field_a = var6;
                        ((tg) this).field_d = var6;
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

    tg(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        io var7 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0;
        Object stackOut_1_0;
        int stackOut_1_1;
        Object stackOut_2_0;
        int stackOut_2_1;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    ((tg) this).field_k = null;
                    ((tg) this).field_v = null;
                    ((tg) this).field_d = null;
                    ((tg) this).field_r = false;
                    ((tg) this).field_m = null;
                    ((tg) this).field_i = false;
                    ((tg) this).field_q = null;
                    ((tg) this).field_l = false;
                    field_o = "1.1";
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
                    ((tg) this).field_i = stackIn_3_1 != 0;
                    field_t = param1;
                    field_g = "Unknown";
                    field_c = param0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        field_g = System.getProperty("java.vendor");
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
                    if (-1 == field_g.toLowerCase().indexOf("microsoft")) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ((tg) this).field_r = true;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    try {
                        field_h = System.getProperty("os.name");
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
                    field_h = "Unknown";
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    field_b = field_h.toLowerCase();
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
                        field_e = System.getProperty("user.home");
                        if (null == field_e) {
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
                        field_e = field_e + "/";
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
                    if (null != field_e) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    field_e = "~/";
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    try {
                        ((tg) this).field_p = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
                    if (!((tg) this).field_r) {
                        statePc = 30;
                    } else {
                        statePc = 36;
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
                        field_x = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
                    gl.a(98, field_c, field_t);
                    if (!((tg) this).field_i) {
                        statePc = 55;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    ((tg) this).field_k = new rn(gl.a(-1, "random.dat", (String) null, field_c), "rw", 25L);
                    ((tg) this).field_q = new rn(gl.a("main_file_cache.dat2", -1), "rw", 314572800L);
                    ((tg) this).field_m = new rn(gl.a("main_file_cache.idx255", -1), "rw", 1048576L);
                    ((tg) this).field_s = new rn[param2];
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
                    ((tg) this).field_s[var5_int] = new rn(gl.a("main_file_cache.idx" + var5_int, -1), "rw", 1048576L);
                    var5_int++;
                    statePc = 38;
                    continue stateLoop;
                }
                case 40: {
                    if (((tg) this).field_r) {
                        statePc = 42;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 42: {
                    try {
                        Object discarded$7 = Class.forName("iq").newInstance();
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
                        if (((tg) this).field_r) {
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
                        ((tg) this).field_a = Class.forName("db").newInstance();
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
                        var7 = new io();
                        ((tg) this).field_u = var7;
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
                        if (!((tg) this).field_r) {
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
                        ((tg) this).field_w = new in();
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
                        ((tg) this).field_n = Class.forName("dd").newInstance();
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
                    ((tg) this).field_l = false;
                    ((tg) this).field_j = new Thread((Runnable) this);
                    ((tg) this).field_j.setPriority(10);
                    ((tg) this).field_j.setDaemon(true);
                    ((tg) this).field_j.start();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0L;
    }
}
