/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fk implements Runnable {
    private wj field_g;
    static String field_f;
    private DataInputStream field_r;
    static gh field_q;
    private gi field_b;
    private wj field_s;
    static String field_p;
    static nb field_i;
    private int field_j;
    static fh field_d;
    static String field_n;
    private java.net.URL field_k;
    private pn field_m;
    private wj field_o;
    static boolean field_h;
    static boolean field_c;
    static String field_l;
    static String field_a;
    static int field_e;

    public final void run() {
        try {
            int var1_int = 0;
            Object var1 = null;
            Exception var1_ref = null;
            Throwable var2 = null;
            Object var2_ref = null;
            Throwable var3 = null;
            int var4 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var4 = SteelSentinels.field_G;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((fk) this).field_b.field_t.length <= ((fk) this).field_b.field_p) {
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
                            var1_int = ((fk) this).field_r.read(((fk) this).field_b.field_t, ((fk) this).field_b.field_p, -((fk) this).field_b.field_p + ((fk) this).field_b.field_t.length);
                            if (0 > var1_int) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            ((fk) this).field_b.field_p = ((fk) this).field_b.field_p + var1_int;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (((fk) this).field_b.field_p == ((fk) this).field_b.field_t.length) {
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
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((fk) this).field_b.field_t.length + " " + ((fk) this).field_k);
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var1 = this;
                            // monitorenter this
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            ((fk) this).finalize();
                            ((fk) this).field_j = 3;
                            // monitorexit var1
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            return;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var2 = caughtException;
                            // monitorexit var1
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            throw (RuntimeException) (Object) var2;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        var1_ref = (Exception) (Object) caughtException;
                        var2_ref = this;
                        // monitorenter this
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        try {
                            ((fk) this).finalize();
                            ((fk) this).field_j = ((fk) this).field_j + 1;
                            // monitorexit var2_ref
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        return;
                    }
                    case 16: {
                        try {
                            var3 = caughtException;
                            // monitorexit var2_ref
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        throw (RuntimeException) (Object) var3;
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

    final gi b(int param0) {
        if (!(((fk) this).field_j != param0)) {
            return ((fk) this).field_b;
        }
        return null;
    }

    final static boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 0) {
          L0: {
            boolean discarded$9 = fk.a(-111);
            if (null == kc.field_y) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (null == kc.field_y) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void a(byte param0) {
        field_p = null;
        field_a = null;
        if (param0 != -64) {
          return;
        } else {
          field_q = null;
          field_d = null;
          field_i = null;
          field_f = null;
          field_l = null;
          field_n = null;
          return;
        }
    }

    fk(pn param0, java.net.URL param1, int param2) {
        ((fk) this).field_m = param0;
        ((fk) this).field_k = param1;
        ((fk) this).field_b = new gi(param2);
    }

    final static gh b(byte param0) {
        if (param0 < 13) {
            return null;
        }
        return mj.field_Sb.field_Ub;
    }

    final synchronized boolean c(int param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((fk) this).field_j >= 2) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return true;
                }
                case 3: {
                    if (0 == ((fk) this).field_j) {
                        statePc = 5;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (null == ((fk) this).field_o) {
                        statePc = 7;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 7: {
                    ((fk) this).field_o = ((fk) this).field_m.a(((fk) this).field_k, 112);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (0 != ((fk) this).field_o.field_a) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    return false;
                }
                case 10: {
                    if (1 != ((fk) this).field_o.field_a) {
                        statePc = 12;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 12: {
                    ((fk) this).field_o = null;
                    ((fk) this).field_j = ((fk) this).field_j + 1;
                    return false;
                }
                case 13: {
                    if (1 != ((fk) this).field_j) {
                        statePc = 20;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (null != ((fk) this).field_g) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    ((fk) this).field_g = ((fk) this).field_m.a(((fk) this).field_k.getHost(), 443, param0 + 376255346);
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (((fk) this).field_g.field_a != 0) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    return false;
                }
                case 18: {
                    if (-2 == (((fk) this).field_g.field_a ^ -1)) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    ((fk) this).field_g = null;
                    ((fk) this).field_j = ((fk) this).field_j + 1;
                    return false;
                }
                case 20: {
                    if (((fk) this).field_r == null) {
                        statePc = 31;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (null == ((fk) this).field_s) {
                        statePc = 23;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 23: {
                    ((fk) this).field_s = ((fk) this).field_m.a(param0 ^ -4, 5, (Runnable) this);
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (0 == ((fk) this).field_s.field_a) {
                        statePc = 26;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 26: {
                    return false;
                }
                case 27: {
                    if (param0 != (((fk) this).field_s.field_a ^ -1)) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    return false;
                }
                case 29: {
                    ((fk) this).finalize();
                    ((fk) this).field_j = ((fk) this).field_j + 1;
                    return false;
                }
                case 31: {
                    try {
                        if (0 != ((fk) this).field_j) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        ((fk) this).field_r = (DataInputStream) ((fk) this).field_o.field_c;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (-2 != (((fk) this).field_j ^ -1)) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var4 = (java.net.Socket) ((fk) this).field_g.field_c;
                        var4.setSoTimeout(10000);
                        var3 = var4.getOutputStream();
                        var3.write(17);
                        var5 = (CharSequence) (Object) ("JAGGRAB " + ((fk) this).field_k.getFile() + "\n\n");
                        var3.write(km.a(param0 + -88, var5));
                        ((fk) this).field_r = new DataInputStream(var4.getInputStream());
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        ((fk) this).field_b.field_p = 0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 36: {
                    if (null == ((fk) this).field_s) {
                        statePc = 38;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 38: {
                    ((fk) this).field_s = ((fk) this).field_m.a(param0 ^ -4, 5, (Runnable) this);
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (0 == ((fk) this).field_s.field_a) {
                        statePc = 41;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 41: {
                    return false;
                }
                case 42: {
                    if (param0 == (((fk) this).field_s.field_a ^ -1)) {
                        statePc = 44;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    ((fk) this).finalize();
                    ((fk) this).field_j = ((fk) this).field_j + 1;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    return false;
                }
                case 45: {
                    var2 = (IOException) (Object) caughtException;
                    ((fk) this).finalize();
                    ((fk) this).field_j = ((fk) this).field_j + 1;
                    if (null == ((fk) this).field_s) {
                        statePc = 47;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 47: {
                    ((fk) this).field_s = ((fk) this).field_m.a(param0 ^ -4, 5, (Runnable) this);
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    if (0 == ((fk) this).field_s.field_a) {
                        statePc = 50;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 50: {
                    return false;
                }
                case 51: {
                    if (param0 != (((fk) this).field_s.field_a ^ -1)) {
                        statePc = 53;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    return false;
                }
                case 53: {
                    ((fk) this).finalize();
                    ((fk) this).field_j = ((fk) this).field_j + 1;
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    protected final void finalize() {
        if (null != ((fk) this).field_o) {
            if (null != ((fk) this).field_o.field_c) {
                try {
                    ((DataInputStream) ((fk) this).field_o.field_c).close();
                } catch (Exception exception) {
                }
            }
            ((fk) this).field_o = null;
        }
        if (null != ((fk) this).field_g) {
            if (((fk) this).field_g.field_c != null) {
                try {
                    ((java.net.Socket) ((fk) this).field_g.field_c).close();
                } catch (Exception exception) {
                }
            }
            ((fk) this).field_g = null;
        }
        if (!(((fk) this).field_r == null)) {
            try {
                ((fk) this).field_r.close();
            } catch (Exception exception) {
            }
            ((fk) this).field_r = null;
        }
        ((fk) this).field_s = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Campaigns";
        field_n = "Remove <%0> from ignore list";
        field_p = "<%0> has left the lobby.";
        field_c = false;
        field_l = "MELEE";
        field_e = 0;
        field_a = "This is <%0>'s RuneScape clan if they have one.";
    }
}
