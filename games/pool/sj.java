/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sj implements Runnable {
    private Object field_j;
    private Object field_p;
    private static int field_r;
    static String field_t;
    static String field_o;
    private Thread field_s;
    static java.lang.reflect.Method field_q;
    v field_b;
    private static String field_g;
    private static String field_v;
    private dc field_m;
    private static String field_d;
    private static volatile long field_h;
    private le field_c;
    java.awt.EventQueue field_a;
    private boolean field_u;
    v field_x;
    private le field_l;
    static String field_w;
    v field_e;
    private boolean field_i;
    boolean field_k;
    private ce field_f;
    v[] field_n;

    final le a(boolean param0, byte param1, java.awt.Component param2) {
        if (param1 != 106) {
            return null;
        }
        return this.a(15, !param0 ? 0 : 1, false, (Object) (Object) param2, 0);
    }

    private final static v a(String param0, int param1, boolean param2, String param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            v var8_ref = null;
            Object var9 = null;
            v stackIn_12_0 = null;
            Throwable decompiledCaughtException = null;
            v stackOut_11_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if ((param1 ^ -1) == -34) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (34 != param1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var4 = "jagex_" + param3 + "_preferences" + param0 + "_wip.dat";
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 3: {
                        var4 = "jagex_" + param3 + "_preferences" + param0 + ".dat";
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 4: {
                        var4 = "jagex_" + param3 + "_preferences" + param0 + "_rc.dat";
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
                            var8_ref = new v(new File(var7, var4), "rw", 10000L);
                            stackOut_11_0 = (v) var8_ref;
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
                        if (param2) {
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
                        v discarded$1 = sj.a((String) null, -124, false, (String) null);
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

    final le a(int param0, int param1, Runnable param2) {
        if (param0 < 27) {
            field_h = -9L;
        }
        return this.a(2, param1, false, (Object) (Object) param2, 0);
    }

    public final void run() {
        try {
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            Exception var3_ref = null;
            lo var3_ref2 = null;
            v var3_ref3 = null;
            int var3_int = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            String var8 = null;
            le var9 = null;
            String var10 = null;
            Object[] var11 = null;
            java.awt.Component var12 = null;
            java.awt.Frame var13 = null;
            java.awt.datatransfer.Clipboard var14 = null;
            java.awt.datatransfer.Clipboard var15 = null;
            Object[] var16 = null;
            Object[] var17 = null;
            Thread var18 = null;
            int stackIn_78_0 = 0;
            int stackOut_76_0 = 0;
            int stackOut_77_0 = 0;
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
                            if (!((sj) this).field_u) {
                                statePc = 4;
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
                            // monitorexit var2
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        return;
                    }
                    case 4: {
                        try {
                            if (null != ((sj) this).field_c) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var9 = ((sj) this).field_c;
                            ((sj) this).field_c = ((sj) this).field_c.field_c;
                            if (null == ((sj) this).field_c) {
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
                            ((sj) this).field_l = null;
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
                            var4_ref_Throwable = caughtException;
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
                        throw (RuntimeException) (Object) var4_ref_Throwable;
                    }
                    case 16: {
                        try {
                            var2_int = var9.field_d;
                            if (var2_int != 1) {
                                statePc = 21;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (rl.a((byte) -124) < field_h) {
                                statePc = 19;
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
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var9.field_e = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var9.field_g), var9.field_a);
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
                            if (-23 == var2_int) {
                                statePc = 109;
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
                            if (var2_int == 2) {
                                statePc = 108;
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
                            if (var2_int == 4) {
                                statePc = 105;
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
                            if (-9 == var2_int) {
                                statePc = 99;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (-10 == var2_int) {
                                statePc = 94;
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
                            if (-19 == var2_int) {
                                statePc = 93;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (-20 == (var2_int ^ -1)) {
                                statePc = 92;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (((sj) this).field_k) {
                                statePc = 30;
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
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (var2_int != 3) {
                                statePc = 34;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (rl.a((byte) -97) >= field_h) {
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
                            throw new IOException();
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var10 = (255 & var9.field_a >> -1536750632) + "." + (var9.field_a >> 297912688 & 255) + "." + ((var9.field_a & 65341) >> -1436418072) + "." + (255 & var9.field_a);
                            var9.field_e = (Object) (Object) java.net.InetAddress.getByName(var10).getHostName();
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (21 == var2_int) {
                                statePc = 88;
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
                            if (-6 != (var2_int ^ -1)) {
                                statePc = 39;
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
                            if (!((sj) this).field_i) {
                                statePc = 38;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            var9.field_e = (Object) (Object) ((sj) this).field_f.a(true);
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            var9.field_e = Class.forName("ak").getMethod("listmodes", new Class[0]).invoke(((sj) this).field_j, new Object[0]);
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
                            if (6 == var2_int) {
                                statePc = 85;
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
                            if (7 != var2_int) {
                                statePc = 44;
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
                            if (((sj) this).field_i) {
                                statePc = 43;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            Object discarded$6 = Class.forName("ak").getMethod("exit", new Class[0]).invoke(((sj) this).field_j, new Object[0]);
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            ((sj) this).field_f.a(0, (java.awt.Frame) var9.field_g);
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
                            if (12 != var2_int) {
                                statePc = 46;
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
                            var3_ref3 = sj.a((String) var9.field_g, field_r, false, field_d);
                            var9.field_e = (Object) (Object) var3_ref3;
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if ((var2_int ^ -1) == -14) {
                                statePc = 84;
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
                            if (!((sj) this).field_k) {
                                statePc = 50;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if ((var2_int ^ -1) == -15) {
                                statePc = 81;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (!((sj) this).field_k) {
                                statePc = 53;
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
                            if (var2_int == -16) {
                                statePc = 75;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (((sj) this).field_i) {
                                statePc = 56;
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
                            if (-18 == var2_int) {
                                statePc = 74;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            if (-17 != (var2_int ^ -1)) {
                                statePc = 73;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if (!field_w.startsWith("win")) {
                                statePc = 60;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof Exception ? 72 : (stateCaught_58 instanceof ThreadDeath ? 117 : 118));
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof Exception ? 72 : (stateCaught_59 instanceof ThreadDeath ? 117 : 118));
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof Exception ? 72 : (stateCaught_60 instanceof ThreadDeath ? 117 : 118));
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            var8 = (String) var9.field_g;
                            if (var8.startsWith("http://")) {
                                statePc = 65;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof Exception ? 72 : (stateCaught_61 instanceof ThreadDeath ? 117 : 118));
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            if (!var8.startsWith("https://")) {
                                statePc = 64;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof Exception ? 72 : (stateCaught_62 instanceof ThreadDeath ? 117 : 118));
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof Exception ? 72 : (stateCaught_63 instanceof ThreadDeath ? 117 : 118));
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof Exception ? 72 : (stateCaught_64 instanceof ThreadDeath ? 117 : 118));
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            var5 = 0;
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof Exception ? 72 : (stateCaught_65 instanceof ThreadDeath ? 117 : 118));
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            if (var5 >= var8.length()) {
                                statePc = 70;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof Exception ? 72 : (stateCaught_66 instanceof ThreadDeath ? 117 : 118));
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if ((var4_ref.indexOf((int) var8.charAt(var5)) ^ -1) != 0) {
                                statePc = 69;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = (stateCaught_67 instanceof Exception ? 72 : (stateCaught_67 instanceof ThreadDeath ? 117 : 118));
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof Exception ? 72 : (stateCaught_68 instanceof ThreadDeath ? 117 : 118));
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            var5++;
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = (stateCaught_69 instanceof Exception ? 72 : (stateCaught_69 instanceof ThreadDeath ? 117 : 118));
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            Process discarded$7 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var8 + "\"");
                            var9.field_e = null;
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = (stateCaught_70 instanceof Exception ? 72 : (stateCaught_70 instanceof ThreadDeath ? 117 : 118));
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = (stateCaught_71 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            var3_ref = (Exception) (Object) caughtException;
                            var9.field_e = (Object) (Object) var3_ref;
                            throw (RuntimeException) (Object) var3_ref;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = (stateCaught_72 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            var11 = (Object[]) var9.field_g;
                            Object discarded$8 = Class.forName("vg").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((sj) this).field_p, new Object[5]);
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = (stateCaught_74 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            if (0 == var9.field_a) {
                                statePc = 77;
                            } else {
                                statePc = 76;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = (stateCaught_75 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            stackOut_76_0 = 1;
                            stackIn_78_0 = stackOut_76_0;
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = (stateCaught_76 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            stackOut_77_0 = 0;
                            stackIn_78_0 = stackOut_77_0;
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = (stateCaught_77 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            var3_int = stackIn_78_0;
                            var12 = (java.awt.Component) var9.field_g;
                            if (((sj) this).field_i) {
                                statePc = 80;
                            } else {
                                statePc = 79;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            Object discarded$9 = Class.forName("vg").getDeclaredMethod("showcursor", new Class[2]).invoke(((sj) this).field_p, new Object[2]);
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            ((sj) this).field_m.a(-11888, var3_int != 0, var12);
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = (stateCaught_80 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            var3_int = var9.field_a;
                            var4 = var9.field_b;
                            if (((sj) this).field_i) {
                                statePc = 83;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = (stateCaught_81 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            Object discarded$10 = Class.forName("vg").getDeclaredMethod("movemouse", new Class[2]).invoke(((sj) this).field_p, new Object[2]);
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
                            ((sj) this).field_m.a(-12384, var4, var3_int);
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = (stateCaught_83 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            var3_ref3 = sj.a((String) var9.field_g, field_r, false, "");
                            var9.field_e = (Object) (Object) var3_ref3;
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            var13 = new java.awt.Frame("Jagex Full Screen");
                            var9.field_e = (Object) (Object) var13;
                            var13.setResizable(false);
                            if (!((sj) this).field_i) {
                                statePc = 87;
                            } else {
                                statePc = 86;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = (stateCaught_85 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            ((sj) this).field_f.a(var13, var9.field_a & 65535, 83, var9.field_a >>> -962755728, var9.field_b >> -1047858096, 65535 & var9.field_b);
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = (stateCaught_86 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            Object discarded$11 = Class.forName("ak").getMethod("enter", new Class[5]).invoke(((sj) this).field_j, new Object[5]);
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = (stateCaught_87 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            if ((rl.a((byte) -113) ^ -1L) > (field_h ^ -1L)) {
                                statePc = 90;
                            } else {
                                statePc = 89;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = (stateCaught_88 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            statePc = 91;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = (stateCaught_89 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = (stateCaught_90 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            var9.field_e = (Object) (Object) java.net.InetAddress.getByName((String) var9.field_g).getAddress();
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
                            var7 = (java.awt.datatransfer.Transferable) var9.field_g;
                            var14 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var14.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = (stateCaught_92 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var9.field_e = (Object) (Object) var15.getContents((Object) null);
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
                            var16 = (Object[]) var9.field_g;
                            if (!((sj) this).field_k) {
                                statePc = 98;
                            } else {
                                statePc = 95;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = (stateCaught_94 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            if (null == ((Class) var16[0]).getClassLoader()) {
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
                            statePc = 98;
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = (stateCaught_96 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = (stateCaught_97 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            var9.field_e = (Object) (Object) ((Class) var16[0]).getDeclaredField((String) var16[1]);
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = (stateCaught_98 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            var17 = (Object[]) var9.field_g;
                            if (((sj) this).field_k) {
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
                            statePc = 104;
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = (stateCaught_100 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            if (null == ((Class) var17[0]).getClassLoader()) {
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
                            statePc = 104;
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = (stateCaught_102 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = (stateCaught_103 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            var9.field_e = (Object) (Object) ((Class) var17[0]).getDeclaredMethod((String) var17[1], (Class[]) var17[2]);
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = (stateCaught_104 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            if ((rl.a((byte) -97) ^ -1L) <= (field_h ^ -1L)) {
                                statePc = 107;
                            } else {
                                statePc = 106;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = (stateCaught_105 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = (stateCaught_106 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            var9.field_e = (Object) (Object) new DataInputStream(((java.net.URL) var9.field_g).openStream());
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = (stateCaught_107 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            var18 = new Thread((Runnable) var9.field_g);
                            var18.setDaemon(true);
                            var18.start();
                            var18.setPriority(var9.field_a);
                            var9.field_e = (Object) (Object) var18;
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = (stateCaught_108 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            if (rl.a((byte) -113) < field_h) {
                                statePc = 111;
                            } else {
                                statePc = 110;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = (stateCaught_109 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        try {
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_110) {
                            caughtException = stateCaught_110;
                            statePc = (stateCaught_110 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_111) {
                            caughtException = stateCaught_111;
                            statePc = (stateCaught_111 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 112: {
                        try {
                            var9.field_e = (Object) (Object) ii.a(114, (String) var9.field_g, var9.field_a).a((byte) -108);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_112) {
                            caughtException = stateCaught_112;
                            statePc = (stateCaught_112 instanceof lo ? 114 : (stateCaught_112 instanceof ThreadDeath ? 117 : 118));
                            continue stateLoop;
                        }
                    }
                    case 113: {
                        try {
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_113) {
                            caughtException = stateCaught_113;
                            statePc = (stateCaught_113 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 114: {
                        try {
                            var3_ref2 = (lo) (Object) caughtException;
                            var9.field_e = (Object) (Object) var3_ref2.getMessage();
                            throw var3_ref2;
                        } catch (Throwable stateCaught_114) {
                            caughtException = stateCaught_114;
                            statePc = (stateCaught_114 instanceof ThreadDeath ? 117 : 118);
                            continue stateLoop;
                        }
                    }
                    case 115: {
                        try {
                            var9.field_f = 1;
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
                        var9.field_f = 2;
                        statePc = 119;
                        continue stateLoop;
                    }
                    case 119: {
                        var2 = (Object) (Object) var9;
                        // monitorenter var9
                        statePc = 120;
                        continue stateLoop;
                    }
                    case 120: {
                        try {
                            ((Object) (Object) var9).notify();
                            // monitorexit var2
                            statePc = 0;
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
                            // monitorexit var2
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

    final le a(Class param0, String param1, byte param2) {
        if (param2 != -88) {
            return null;
        }
        return this.a(9, 0, false, (Object) (Object) new Object[2], 0);
    }

    private final le a(int param0, int param1, boolean param2, Object param3, int param4) {
        le var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = new le();
                    var6.field_d = param0;
                    var6.field_g = param3;
                    var6.field_b = param4;
                    var6.field_a = param1;
                    var7 = this;
                    // monitorenter this
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((sj) this).field_l == null) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((sj) this).field_l.field_c = var6;
                        ((sj) this).field_l = var6;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((sj) this).field_c = var6;
                        ((sj) this).field_l = var6;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        this.notify();
                        if (!param2) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        le discarded$2 = ((sj) this).a(-56, -20, -46, 113, (byte) -46);
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

    final le a(java.awt.Frame param0, boolean param1) {
        if (param1) {
            ((sj) this).field_l = null;
        }
        return this.a(7, 0, false, (Object) (Object) param0, 0);
    }

    final le a(int param0) {
        if (param0 < 83) {
            return null;
        }
        return this.a(5, 0, false, (Object) null, 0);
    }

    final le a(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 != 85) {
            ((sj) this).a(false);
        }
        return this.a(6, (param1 << -1721400176) - -param0, false, (Object) null, (param3 << -5297488) - -param2);
    }

    final boolean a(byte param0) {
        if (param0 < 104) {
            return false;
        }
        if (!((sj) this).field_k) {
            return false;
        }
        if (!((sj) this).field_i) {
            return null != ((sj) this).field_j ? true : false;
        }
        return ((sj) this).field_f != null ? true : false;
    }

    final le a(byte param0, Class param1, Class[] param2, String param3) {
        if (param0 < 12) {
            ((sj) this).field_b = null;
        }
        return this.a(8, 0, false, (Object) (Object) new Object[3], 0);
    }

    final le a(String param0, int param1, int param2) {
        if (param2 != 0) {
            Object var5 = null;
            le discarded$0 = ((sj) this).a(true, (byte) -21, (java.awt.Component) null);
        }
        return this.a(param1, param0, false, (byte) -123);
    }

    private final le a(int param0, String param1, boolean param2, byte param3) {
        if (param3 > -104) {
            ((sj) this).field_k = false;
        }
        return this.a(param2 ? 22 : 1, param0, false, (Object) (Object) param1, 0);
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
                            ((sj) this).field_u = stackIn_4_1 != 0;
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
                            ((sj) this).field_s.join();
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
                        if (null != ((sj) this).field_x) {
                            statePc = 13;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        try {
                            ((sj) this).field_x.c((byte) 94);
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
                        if (((sj) this).field_e == null) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        try {
                            ((sj) this).field_e.c((byte) 110);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        var2_ref2 = (IOException) (Object) caughtException;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        if (null != ((sj) this).field_n) {
                            statePc = 22;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        var2_int = 0;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        if (((sj) this).field_n.length <= var2_int) {
                            statePc = 30;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        if (((sj) this).field_n[var2_int] != null) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        var2_int++;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 27: {
                        try {
                            ((sj) this).field_n[var2_int].c((byte) 115);
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
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 29: {
                        var3_ref = (IOException) (Object) caughtException;
                        var2_int++;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 30: {
                        if (((sj) this).field_b != null) {
                            statePc = 32;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    }
                    case 32: {
                        try {
                            ((sj) this).field_b.c((byte) 107);
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

    final le a(java.net.URL param0, int param1) {
        if (param1 != 1) {
            field_h = -125L;
        }
        return this.a(4, 0, false, (Object) (Object) param0, 0);
    }

    sj(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        ce var7 = null;
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
                    ((sj) this).field_c = null;
                    ((sj) this).field_u = false;
                    ((sj) this).field_b = null;
                    ((sj) this).field_x = null;
                    ((sj) this).field_e = null;
                    ((sj) this).field_l = null;
                    ((sj) this).field_i = false;
                    ((sj) this).field_k = false;
                    field_o = "Unknown";
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
                    ((sj) this).field_k = stackIn_3_1 != 0;
                    field_r = param0;
                    field_d = param1;
                    field_t = "1.1";
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
                    if (0 == (field_o.toLowerCase().indexOf("microsoft") ^ -1)) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ((sj) this).field_i = true;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    try {
                        field_g = System.getProperty("os.name");
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
                    field_g = "Unknown";
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    field_w = field_g.toLowerCase();
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
                        if (field_v == null) {
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
                        ((sj) this).field_a = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
                    if (((sj) this).field_i) {
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
                        field_q = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
                    nh.a(field_r, field_d, 25617);
                    if (!((sj) this).field_k) {
                        statePc = 54;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    ((sj) this).field_b = new v(nh.a("random.dat", (String) null, field_r, (byte) 109), "rw", 25L);
                    ((sj) this).field_x = new v(nh.a("main_file_cache.dat2", -126), "rw", 314572800L);
                    ((sj) this).field_e = new v(nh.a("main_file_cache.idx255", -128), "rw", 1048576L);
                    ((sj) this).field_n = new v[param2];
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
                    ((sj) this).field_n[var5_int] = new v(nh.a("main_file_cache.idx" + var5_int, -126), "rw", 1048576L);
                    var5_int++;
                    statePc = 38;
                    continue stateLoop;
                }
                case 40: {
                    if (!((sj) this).field_i) {
                        statePc = 44;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    try {
                        Object discarded$7 = Class.forName("fi").newInstance();
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 43: {
                    var5_ref = caughtException;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    try {
                        if (((sj) this).field_i) {
                            statePc = 46;
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
                        ((sj) this).field_j = Class.forName("ak").newInstance();
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var7 = new ce();
                        ((sj) this).field_f = var7;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 48: {
                    var5_ref = caughtException;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    try {
                        if (((sj) this).field_i) {
                            statePc = 51;
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
                        ((sj) this).field_p = Class.forName("vg").newInstance();
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        ((sj) this).field_m = new dc();
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 53: {
                    var5_ref = caughtException;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    ((sj) this).field_u = false;
                    ((sj) this).field_s = new Thread((Runnable) this);
                    ((sj) this).field_s.setPriority(10);
                    ((sj) this).field_s.setDaemon(true);
                    ((sj) this).field_s.start();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final le a(java.awt.Component param0, int param1, int param2, int param3) {
        if (param2 >= -54) {
            return null;
        }
        java.awt.Point var5 = param0.getLocationOnScreen();
        return this.a(14, param1 + var5.x, false, (Object) null, param3 - -var5.y);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 0L;
    }
}
