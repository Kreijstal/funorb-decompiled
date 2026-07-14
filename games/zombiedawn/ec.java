/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ec implements Runnable {
    qn[] field_q;
    java.awt.EventQueue field_x;
    private op field_a;
    private Object field_l;
    private boolean field_w;
    private Thread field_f;
    qn field_b;
    private go field_m;
    qn field_i;
    private static String field_r;
    private static volatile long field_j;
    private Object field_o;
    private th field_v;
    static String field_n;
    static java.lang.reflect.Method field_d;
    static String field_h;
    private boolean field_u;
    boolean field_t;
    private static String field_p;
    private op field_k;
    private static String field_s;
    static String field_g;
    qn field_e;
    private static int field_c;

    final boolean c(int param0) {
        if (!(((ec) this).field_t)) {
            return false;
        }
        if (param0 != 10) {
            return false;
        }
        if (((ec) this).field_u) {
            return null != ((ec) this).field_m ? true : false;
        }
        return ((ec) this).field_o != null ? true : false;
    }

    final op a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != 1525233840) {
            Object var7 = null;
            op discarded$0 = this.a((String) null, -122, true, 56);
        }
        return this.a((byte) 61, (param4 << 1525233840) - -param2, 6, (param0 << 984950288) - -param3, (Object) null);
    }

    final op a(java.awt.Frame param0, byte param1) {
        if (param1 <= 4) {
            return null;
        }
        return this.a((byte) 61, 0, 7, 0, (Object) (Object) param0);
    }

    final op a(int param0, java.net.URL param1) {
        if (param0 != 7645) {
            return null;
        }
        return this.a((byte) 61, 0, 4, 0, (Object) (Object) param1);
    }

    final op a(int param0) {
        if (param0 != -1) {
            return null;
        }
        return this.a((byte) 61, 0, 5, 0, (Object) null);
    }

    private final op a(byte param0, int param1, int param2, int param3, Object param4) {
        op var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = new op();
                    if (param0 == 61) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    ((ec) this).field_x = null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var6.field_g = param1;
                    var6.field_e = param4;
                    var6.field_a = param2;
                    var6.field_c = param3;
                    var7 = this;
                    // monitorenter this
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        if (((ec) this).field_a == null) {
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
                        ((ec) this).field_a.field_b = var6;
                        ((ec) this).field_a = var6;
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
                        ((ec) this).field_k = var6;
                        ((ec) this).field_a = var6;
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

    public final void run() {
        try {
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            dg var3_ref = null;
            Exception var3_ref2 = null;
            qn var3_ref3 = null;
            int var3_int = 0;
            Throwable var4 = null;
            int var4_int = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            op var8 = null;
            String var9 = null;
            java.awt.Frame var10 = null;
            java.awt.Component var11 = null;
            String var12 = null;
            Object[] var13 = null;
            java.awt.datatransfer.Clipboard var14 = null;
            java.awt.datatransfer.Clipboard var15 = null;
            Object[] var16 = null;
            Object[] var17 = null;
            Thread var18 = null;
            int stackIn_71_0 = 0;
            int stackOut_69_0 = 0;
            int stackOut_70_0 = 0;
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
                            if (((ec) this).field_w) {
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
                            if (null == ((ec) this).field_k) {
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
                            var8 = ((ec) this).field_k;
                            ((ec) this).field_k = ((ec) this).field_k.field_b;
                            if (((ec) this).field_k == null) {
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
                            ((ec) this).field_a = null;
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
                            var2_int = var8.field_a;
                            if ((var2_int ^ -1) != -2) {
                                statePc = 21;
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
                            if ((field_j ^ -1L) < (pd.a(-22826) ^ -1L)) {
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
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var8.field_d = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8.field_e), var8.field_g);
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
                            if (-23 != (var2_int ^ -1)) {
                                statePc = 28;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if ((field_j ^ -1L) < (pd.a(-22826) ^ -1L)) {
                                statePc = 24;
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
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var8.field_d = (Object) (Object) ud.a((String) var8.field_e, (byte) 68, var8.field_g).a(false);
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof dg ? 27 : (stateCaught_25 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var3_ref = (dg) (Object) caughtException;
                            var8.field_d = (Object) (Object) var3_ref.getMessage();
                            throw var3_ref;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (var2_int == -3) {
                                statePc = 112;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (-5 != var2_int) {
                                statePc = 33;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (pd.a(-22826) >= field_j) {
                                statePc = 32;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var8.field_d = (Object) (Object) new DataInputStream(((java.net.URL) var8.field_e).openStream());
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (-9 == var2_int) {
                                statePc = 107;
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
                            if (var2_int == 9) {
                                statePc = 101;
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
                            if (-19 == var2_int) {
                                statePc = 100;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if ((var2_int ^ -1) == -20) {
                                statePc = 99;
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
                            if (((ec) this).field_t) {
                                statePc = 39;
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
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if ((var2_int ^ -1) != -4) {
                                statePc = 44;
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
                            if (pd.a(-22826) < field_j) {
                                statePc = 42;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            var9 = (255 & var8.field_g >> 467451928) + "." + (255 & var8.field_g >> -1402564112) + "." + ((65496 & var8.field_g) >> 1648328424) + "." + (255 & var8.field_g);
                            var8.field_d = (Object) (Object) java.net.InetAddress.getByName(var9).getHostName();
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (var2_int != 21) {
                                statePc = 49;
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
                            if (pd.a(-22826) < field_j) {
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
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            var8.field_d = (Object) (Object) java.net.InetAddress.getByName((String) var8.field_e).getAddress();
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            if ((var2_int ^ -1) != -6) {
                                statePc = 53;
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
                            if (!((ec) this).field_u) {
                                statePc = 52;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var8.field_d = (Object) (Object) ((ec) this).field_m.a(8);
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
                            var8.field_d = Class.forName("bk").getMethod("listmodes", new Class[0]).invoke(((ec) this).field_o, new Object[0]);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (6 != var2_int) {
                                statePc = 57;
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
                            var10 = new java.awt.Frame("Jagex Full Screen");
                            var8.field_d = (Object) (Object) var10;
                            var10.setResizable(false);
                            if (!((ec) this).field_u) {
                                statePc = 56;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            ((ec) this).field_m.a(var8.field_c >> -2062190256, var8.field_g >>> -164416560, 65535 & var8.field_c, 65535 & var8.field_g, (byte) 81, var10);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            Object discarded$6 = Class.forName("bk").getMethod("enter", new Class[5]).invoke(((ec) this).field_o, new Object[5]);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            if (var2_int == 7) {
                                statePc = 96;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if (12 != var2_int) {
                                statePc = 60;
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
                            var3_ref3 = ec.a((String) var8.field_e, (byte) -44, field_c, field_s);
                            var8.field_d = (Object) (Object) var3_ref3;
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            if (var2_int == 13) {
                                statePc = 95;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (!((ec) this).field_t) {
                                statePc = 66;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            if (var2_int != 14) {
                                statePc = 66;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            var3_int = var8.field_g;
                            var4_int = var8.field_c;
                            if (((ec) this).field_u) {
                                statePc = 65;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            Object discarded$7 = Class.forName("jn").getDeclaredMethod("movemouse", new Class[2]).invoke(((ec) this).field_l, new Object[2]);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            ((ec) this).field_v.a(var4_int, var3_int, (byte) -70);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            if (!((ec) this).field_t) {
                                statePc = 74;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if (var2_int != 15) {
                                statePc = 74;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = (stateCaught_67 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if (0 == var8.field_g) {
                                statePc = 70;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            stackOut_69_0 = 1;
                            stackIn_71_0 = stackOut_69_0;
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = (stateCaught_69 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            stackOut_70_0 = 0;
                            stackIn_71_0 = stackOut_70_0;
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = (stateCaught_70 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            var3_int = stackIn_71_0;
                            var11 = (java.awt.Component) var8.field_e;
                            if (((ec) this).field_u) {
                                statePc = 73;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = (stateCaught_71 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            Object discarded$8 = Class.forName("jn").getDeclaredMethod("showcursor", new Class[2]).invoke(((ec) this).field_l, new Object[2]);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = (stateCaught_72 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            ((ec) this).field_v.a(var11, true, var3_int != 0);
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
                            if (((ec) this).field_u) {
                                statePc = 77;
                            } else {
                                statePc = 75;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = (stateCaught_74 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            if (17 == var2_int) {
                                statePc = 94;
                            } else {
                                statePc = 76;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = (stateCaught_75 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            statePc = 77;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = (stateCaught_76 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            if ((var2_int ^ -1) != -17) {
                                statePc = 93;
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
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            if (field_n.startsWith("win")) {
                                statePc = 81;
                            } else {
                                statePc = 80;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof Exception ? 92 : (stateCaught_79 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = (stateCaught_80 instanceof Exception ? 92 : (stateCaught_80 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            var12 = (String) var8.field_e;
                            if (var12.startsWith("http://")) {
                                statePc = 85;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = (stateCaught_81 instanceof Exception ? 92 : (stateCaught_81 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            if (!var12.startsWith("https://")) {
                                statePc = 84;
                            } else {
                                statePc = 83;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = (stateCaught_82 instanceof Exception ? 92 : (stateCaught_82 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = (stateCaught_83 instanceof Exception ? 92 : (stateCaught_83 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof Exception ? 92 : (stateCaught_84 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            var5 = 0;
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = (stateCaught_85 instanceof Exception ? 92 : (stateCaught_85 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            if (var12.length() <= var5) {
                                statePc = 90;
                            } else {
                                statePc = 87;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = (stateCaught_86 instanceof Exception ? 92 : (stateCaught_86 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            if (-1 != var4_ref.indexOf((int) var12.charAt(var5))) {
                                statePc = 89;
                            } else {
                                statePc = 88;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = (stateCaught_87 instanceof Exception ? 92 : (stateCaught_87 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = (stateCaught_88 instanceof Exception ? 92 : (stateCaught_88 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            var5++;
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = (stateCaught_89 instanceof Exception ? 92 : (stateCaught_89 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            Process discarded$9 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var12 + "\"");
                            var8.field_d = null;
                            statePc = 91;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = (stateCaught_90 instanceof Exception ? 92 : (stateCaught_90 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = (stateCaught_91 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            var3_ref2 = (Exception) (Object) caughtException;
                            var8.field_d = (Object) (Object) var3_ref2;
                            throw (RuntimeException) (Object) var3_ref2;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = (stateCaught_92 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = (stateCaught_93 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            var13 = (Object[]) var8.field_e;
                            Object discarded$10 = Class.forName("jn").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((ec) this).field_l, new Object[5]);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = (stateCaught_94 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            var3_ref3 = ec.a((String) var8.field_e, (byte) -44, field_c, "");
                            var8.field_d = (Object) (Object) var3_ref3;
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = (stateCaught_95 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            if (!((ec) this).field_u) {
                                statePc = 98;
                            } else {
                                statePc = 97;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = (stateCaught_96 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            ((ec) this).field_m.a((java.awt.Frame) var8.field_e, 6411);
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
                            Object discarded$11 = Class.forName("bk").getMethod("exit", new Class[0]).invoke(((ec) this).field_o, new Object[0]);
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
                            var7 = (java.awt.datatransfer.Transferable) var8.field_e;
                            var14 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var14.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
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
                            var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var8.field_d = (Object) (Object) var15.getContents((Object) null);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = (stateCaught_100 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            var16 = (Object[]) var8.field_e;
                            if (((ec) this).field_t) {
                                statePc = 103;
                            } else {
                                statePc = 102;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = (stateCaught_101 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = (stateCaught_102 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            if (null == ((Class) var16[0]).getClassLoader()) {
                                statePc = 105;
                            } else {
                                statePc = 104;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = (stateCaught_103 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = (stateCaught_104 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = (stateCaught_105 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            var8.field_d = (Object) (Object) ((Class) var16[0]).getDeclaredField((String) var16[1]);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = (stateCaught_106 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            var17 = (Object[]) var8.field_e;
                            if (((ec) this).field_t) {
                                statePc = 109;
                            } else {
                                statePc = 108;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = (stateCaught_107 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = (stateCaught_108 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            if (((Class) var17[0]).getClassLoader() != null) {
                                statePc = 111;
                            } else {
                                statePc = 110;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = (stateCaught_109 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_110) {
                            caughtException = stateCaught_110;
                            statePc = (stateCaught_110 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        try {
                            var8.field_d = (Object) (Object) ((Class) var17[0]).getDeclaredMethod((String) var17[1], (Class[]) var17[2]);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_111) {
                            caughtException = stateCaught_111;
                            statePc = (stateCaught_111 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 112: {
                        try {
                            var18 = new Thread((Runnable) var8.field_e);
                            var18.setDaemon(true);
                            var18.start();
                            var18.setPriority(var8.field_g);
                            var8.field_d = (Object) (Object) var18;
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
                            var8.field_f = 1;
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
                        var8.field_f = 2;
                        statePc = 117;
                        continue stateLoop;
                    }
                    case 117: {
                        var2 = (Object) (Object) var8;
                        // monitorenter var8
                        statePc = 118;
                        continue stateLoop;
                    }
                    case 118: {
                        try {
                            ((Object) (Object) var8).notify();
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

    final op a(int param0, String param1, int param2) {
        if (param0 != 2) {
            Object var5 = null;
            op discarded$0 = this.a((String) null, 28, true, -32);
        }
        return this.a(param1, param2, false, -124);
    }

    final op a(byte param0, String param1, Class param2) {
        if (param0 != -113) {
            Object var5 = null;
            op discarded$0 = ((ec) this).a(50, (Runnable) null, false);
        }
        return this.a((byte) 61, 0, 9, 0, (Object) (Object) new Object[2]);
    }

    private final op a(String param0, int param1, boolean param2, int param3) {
        int var5 = 28 / ((param3 - -56) / 58);
        return this.a((byte) 61, param1, !param2 ? 1 : 22, 0, (Object) (Object) param0);
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
                            ((ec) this).field_w = true;
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
                        try {
                            field_d = null;
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
                            ((ec) this).field_f.join();
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
                        if (((ec) this).field_e != null) {
                            statePc = 12;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        try {
                            ((ec) this).field_e.c(-97);
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
                        if (null != ((ec) this).field_i) {
                            statePc = 17;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        try {
                            ((ec) this).field_i.c(param0 + -107);
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
                        if (((ec) this).field_q != null) {
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
                        if (((ec) this).field_q.length <= var2_int) {
                            statePc = 30;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        if (((ec) this).field_q[var2_int] != null) {
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
                            ((ec) this).field_q[var2_int].c(param0 + -73);
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
                        if (null == ((ec) this).field_b) {
                            statePc = 34;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        try {
                            ((ec) this).field_b.c(param0 + -79);
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

    private final static qn a(String param0, byte param1, int param2, String param3) {
        try {
            String var7_ref = null;
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            Object var7 = null;
            Exception var8 = null;
            qn var8_ref = null;
            Object var9 = null;
            qn stackIn_14_0 = null;
            Throwable decompiledCaughtException = null;
            qn stackOut_13_0 = null;
            var7_ref = null;
            L0: {
              if (param1 == -44) {
                break L0;
              } else {
                var9 = null;
                qn discarded$1 = ec.a((String) null, (byte) -111, 37, (String) null);
                break L0;
              }
            }
            L1: {
              if (33 == param2) {
                var4 = "jagex_" + param3 + "_preferences" + param0 + "_rc.dat";
                break L1;
              } else {
                if (param2 != 34) {
                  var4 = "jagex_" + param3 + "_preferences" + param0 + ".dat";
                  break L1;
                } else {
                  var4 = "jagex_" + param3 + "_preferences" + param0 + "_wip.dat";
                  break L1;
                }
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_r, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = 0;
            L2: while (true) {
              if (var5_array.length > var6) {
                L3: {
                  var7_ref = var5_array[var6];
                  if ((var7_ref.length() ^ -1) >= -1) {
                    break L3;
                  } else {
                    if (new File(var7_ref).exists()) {
                      break L3;
                    } else {
                      var6++;
                      continue L2;
                    }
                  }
                }
                try {
                  var8_ref = new qn(new File(var7_ref, var4), "rw", 10000L);
                  stackOut_13_0 = (qn) var8_ref;
                  stackIn_14_0 = stackOut_13_0;
                } catch (java.lang.Exception decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  return stackIn_14_0;
                }
                continue L2;
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

    final op a(Class[] param0, Class param1, int param2, String param3) {
        if (param2 != 255) {
            ((ec) this).field_q = null;
        }
        return this.a((byte) 61, 0, 8, 0, (Object) (Object) new Object[3]);
    }

    ec(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        go var6 = null;
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
                    ((ec) this).field_a = null;
                    ((ec) this).field_i = null;
                    ((ec) this).field_t = false;
                    ((ec) this).field_b = null;
                    ((ec) this).field_u = false;
                    ((ec) this).field_w = false;
                    ((ec) this).field_k = null;
                    ((ec) this).field_e = null;
                    field_s = param1;
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
                    ((ec) this).field_t = stackIn_3_1 != 0;
                    field_c = param0;
                    field_g = "1.1";
                    field_h = "Unknown";
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        field_h = System.getProperty("java.vendor");
                        field_g = System.getProperty("java.version");
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
                    if (field_h.toLowerCase().indexOf("microsoft") == -1) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ((ec) this).field_u = true;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    try {
                        field_p = System.getProperty("os.name");
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
                    field_p = "Unknown";
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    field_n = field_p.toLowerCase();
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
                        field_r = System.getProperty("user.home");
                        if (null == field_r) {
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
                        field_r = field_r + "/";
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
                    if (null == field_r) {
                        statePc = 25;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 25: {
                    field_r = "~/";
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    try {
                        ((ec) this).field_x = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
                    if (((ec) this).field_u) {
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
                        field_d = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
                    gh.a(field_c, (byte) 127, field_s);
                    if (!((ec) this).field_t) {
                        statePc = 55;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    ((ec) this).field_b = new qn(gh.a((String) null, field_c, (byte) 21, "random.dat"), "rw", 25L);
                    ((ec) this).field_e = new qn(gh.a(-71, "main_file_cache.dat2"), "rw", 314572800L);
                    ((ec) this).field_i = new qn(gh.a(-115, "main_file_cache.idx255"), "rw", 1048576L);
                    ((ec) this).field_q = new qn[param2];
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
                    ((ec) this).field_q[var5_int] = new qn(gh.a(-97, "main_file_cache.idx" + var5_int), "rw", 1048576L);
                    var5_int++;
                    statePc = 38;
                    continue stateLoop;
                }
                case 40: {
                    if (((ec) this).field_u) {
                        statePc = 42;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 42: {
                    try {
                        Object discarded$7 = Class.forName("db").newInstance();
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
                        if (!((ec) this).field_u) {
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
                        var6 = new go();
                        ((ec) this).field_m = var6;
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
                        ((ec) this).field_o = Class.forName("bk").newInstance();
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
                        if (!((ec) this).field_u) {
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
                        ((ec) this).field_v = new th();
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
                        ((ec) this).field_l = Class.forName("jn").newInstance();
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
                    ((ec) this).field_w = false;
                    ((ec) this).field_f = new Thread((Runnable) this);
                    ((ec) this).field_f.setPriority(10);
                    ((ec) this).field_f.setDaemon(true);
                    ((ec) this).field_f.start();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final op a(int param0, Runnable param1, boolean param2) {
        if (!param2) {
            Object var5 = null;
            op discarded$0 = ((ec) this).a(-51, (String) null, -36);
        }
        return this.a((byte) 61, param0, 2, 0, (Object) (Object) param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0L;
    }
}
