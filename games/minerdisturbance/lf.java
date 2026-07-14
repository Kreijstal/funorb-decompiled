/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class lf implements Runnable {
    private java.net.URL field_h;
    static hb field_b;
    private ia field_d;
    private ia field_j;
    static String[][] field_i;
    private vf field_f;
    private ia field_e;
    private int field_c;
    private DataInputStream field_a;
    private sb field_g;

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
                        var4 = MinerDisturbance.field_ab;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((lf) this).field_g.field_o >= ((lf) this).field_g.field_u.length) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var1_int = ((lf) this).field_a.read(((lf) this).field_g.field_u, ((lf) this).field_g.field_o, ((lf) this).field_g.field_u.length + -((lf) this).field_g.field_o);
                            if ((var1_int ^ -1) > -1) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            ((lf) this).field_g.field_o = ((lf) this).field_g.field_o + var1_int;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (((lf) this).field_g.field_u.length != ((lf) this).field_g.field_o) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((lf) this).field_g.field_u.length + " " + ((lf) this).field_h);
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var1 = this;
                            // monitorenter this
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            ((lf) this).finalize();
                            ((lf) this).field_c = 3;
                            // monitorexit var1
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
                            return;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var2 = caughtException;
                            // monitorexit var1
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
                            throw (RuntimeException) (Object) var2;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        var1_ref = (Exception) (Object) caughtException;
                        var2_ref = this;
                        // monitorenter this
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        try {
                            ((lf) this).finalize();
                            ((lf) this).field_c = ((lf) this).field_c + 1;
                            // monitorexit var2_ref
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        return;
                    }
                    case 15: {
                        try {
                            var3 = caughtException;
                            // monitorexit var2_ref
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 16: {
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

    protected final void finalize() {
        if (!(((lf) this).field_d == null)) {
            if (null != ((lf) this).field_d.field_a) {
                try {
                    ((DataInputStream) ((lf) this).field_d.field_a).close();
                } catch (Exception exception) {
                }
            }
            ((lf) this).field_d = null;
        }
        if (((lf) this).field_e != null) {
            if (null != ((lf) this).field_e.field_a) {
                try {
                    ((java.net.Socket) ((lf) this).field_e.field_a).close();
                } catch (Exception exception) {
                }
            }
            ((lf) this).field_e = null;
        }
        if (!(((lf) this).field_a == null)) {
            try {
                ((lf) this).field_a.close();
            } catch (Exception exception) {
            }
            ((lf) this).field_a = null;
        }
        ((lf) this).field_j = null;
    }

    final synchronized boolean a(byte param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 >= 47) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_i = null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (((lf) this).field_c >= 2) {
                        statePc = 4;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return true;
                }
                case 5: {
                    if (((lf) this).field_c == 0) {
                        statePc = 7;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (null == ((lf) this).field_d) {
                        statePc = 9;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 9: {
                    ((lf) this).field_d = ((lf) this).field_f.a((byte) -83, ((lf) this).field_h);
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (-1 == ((lf) this).field_d.field_c) {
                        statePc = 12;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 12: {
                    return false;
                }
                case 13: {
                    if (-2 != ((lf) this).field_d.field_c) {
                        statePc = 15;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 15: {
                    ((lf) this).field_d = null;
                    ((lf) this).field_c = ((lf) this).field_c + 1;
                    return false;
                }
                case 16: {
                    if (1 == ((lf) this).field_c) {
                        statePc = 18;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (null != ((lf) this).field_e) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    ((lf) this).field_e = ((lf) this).field_f.a(((lf) this).field_h.getHost(), 443, (byte) 15);
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (0 != ((lf) this).field_e.field_c) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    return false;
                }
                case 22: {
                    if (((lf) this).field_e.field_c == 1) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    ((lf) this).field_c = ((lf) this).field_c + 1;
                    ((lf) this).field_e = null;
                    return false;
                }
                case 24: {
                    if (null != ((lf) this).field_a) {
                        statePc = 41;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    try {
                        if (((lf) this).field_c != 0) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        ((lf) this).field_a = (DataInputStream) ((lf) this).field_d.field_a;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (((lf) this).field_c != 1) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var4 = (java.net.Socket) ((lf) this).field_e.field_a;
                        var4.setSoTimeout(10000);
                        var3 = var4.getOutputStream();
                        var3.write(17);
                        var5 = (CharSequence) (Object) ("JAGGRAB " + ((lf) this).field_h.getFile() + "\n\n");
                        var3.write(ic.a(false, var5));
                        ((lf) this).field_a = new DataInputStream(var4.getInputStream());
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        ((lf) this).field_g.field_o = 0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 30: {
                    if (((lf) this).field_j == null) {
                        statePc = 32;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 32: {
                    ((lf) this).field_j = ((lf) this).field_f.a((Runnable) this, (byte) 1, 5);
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    if (((lf) this).field_j.field_c == 0) {
                        statePc = 35;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 35: {
                    return false;
                }
                case 36: {
                    if (1 != ((lf) this).field_j.field_c) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    return false;
                }
                case 38: {
                    ((lf) this).finalize();
                    ((lf) this).field_c = ((lf) this).field_c + 1;
                    return false;
                }
                case 40: {
                    var2 = (IOException) (Object) caughtException;
                    ((lf) this).finalize();
                    ((lf) this).field_c = ((lf) this).field_c + 1;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    if (((lf) this).field_j == null) {
                        statePc = 43;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 43: {
                    ((lf) this).field_j = ((lf) this).field_f.a((Runnable) this, (byte) 1, 5);
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    if (((lf) this).field_j.field_c == 0) {
                        statePc = 46;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 46: {
                    return false;
                }
                case 47: {
                    if (1 != ((lf) this).field_j.field_c) {
                        statePc = 49;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    return false;
                }
                case 49: {
                    ((lf) this).finalize();
                    ((lf) this).field_c = ((lf) this).field_c + 1;
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final sb a(int param0) {
        if (param0 != 0) {
            sb discarded$9 = ((lf) this).a(23);
            if (!(-4 != ((lf) this).field_c)) {
                return ((lf) this).field_g;
            }
            return null;
        }
        if (!(-4 != ((lf) this).field_c)) {
            return ((lf) this).field_g;
        }
        return null;
    }

    public static void a(boolean param0) {
        field_i = null;
        field_b = null;
        if (param0) {
            lf.a(false);
        }
    }

    final static void a(int param0, we param1) {
        if (param0 != -673) {
            field_b = null;
            wi.field_A = param1;
            return;
        }
        wi.field_A = param1;
    }

    lf(vf param0, java.net.URL param1, int param2) {
        ((lf) this).field_h = param1;
        ((lf) this).field_f = param0;
        ((lf) this).field_g = new sb(param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new String[][]{new String[1]};
    }
}
