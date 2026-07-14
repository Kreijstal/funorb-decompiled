/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wg implements Runnable {
    private java.net.URL field_h;
    static int field_e;
    private d field_b;
    private int field_l;
    static int field_j;
    private qc field_n;
    static ji field_i;
    static int field_m;
    static ck field_d;
    private DataInputStream field_c;
    private cb field_k;
    private cb field_f;
    private cb field_g;
    static int field_a;

    final qc b(byte param0) {
        int var2 = 62 / ((param0 - 9) / 53);
        if (!((((wg) this).field_l ^ -1) != -4)) {
            return ((wg) this).field_n;
        }
        return null;
    }

    protected final void finalize() {
        if (null != ((wg) this).field_f) {
            if (!(((wg) this).field_f.field_b == null)) {
                try {
                    ((DataInputStream) ((wg) this).field_f.field_b).close();
                } catch (Exception exception) {
                }
            }
            ((wg) this).field_f = null;
        }
        if (((wg) this).field_k != null) {
            if (null != ((wg) this).field_k.field_b) {
                try {
                    ((java.net.Socket) ((wg) this).field_k.field_b).close();
                } catch (Exception exception) {
                }
            }
            ((wg) this).field_k = null;
        }
        if (!(null == ((wg) this).field_c)) {
            try {
                ((wg) this).field_c.close();
            } catch (Exception exception) {
            }
            ((wg) this).field_c = null;
        }
        ((wg) this).field_g = null;
    }

    public static void c(byte param0) {
        int var1 = 26 / ((param0 - 45) / 32);
        field_i = null;
        field_d = null;
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
                    if (2 <= ((wg) this).field_l) {
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
                    if (((wg) this).field_l != 0) {
                        statePc = 12;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (null != ((wg) this).field_f) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    ((wg) this).field_f = ((wg) this).field_b.a(-14, ((wg) this).field_h);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (0 == ((wg) this).field_f.field_a) {
                        statePc = 8;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 8: {
                    return false;
                }
                case 9: {
                    if (1 != ((wg) this).field_f.field_a) {
                        statePc = 11;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 11: {
                    ((wg) this).field_l = ((wg) this).field_l + 1;
                    ((wg) this).field_f = null;
                    return false;
                }
                case 12: {
                    if (-2 != (((wg) this).field_l ^ -1)) {
                        statePc = 20;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (((wg) this).field_k == null) {
                        statePc = 15;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 15: {
                    ((wg) this).field_k = ((wg) this).field_b.a(443, ((wg) this).field_h.getHost(), false);
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (((wg) this).field_k.field_a != 0) {
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
                    if (1 == ((wg) this).field_k.field_a) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    ((wg) this).field_k = null;
                    ((wg) this).field_l = ((wg) this).field_l + 1;
                    return false;
                }
                case 20: {
                    if (null != ((wg) this).field_c) {
                        statePc = 39;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    try {
                        if (-1 == (((wg) this).field_l ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        ((wg) this).field_c = (DataInputStream) ((wg) this).field_f.field_b;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if ((((wg) this).field_l ^ -1) != -2) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var4 = (java.net.Socket) ((wg) this).field_k.field_b;
                        var4.setSoTimeout(10000);
                        var3 = var4.getOutputStream();
                        var3.write(17);
                        var5 = (CharSequence) (Object) ("JAGGRAB " + ((wg) this).field_h.getFile() + "\n\n");
                        var3.write(jf.a(var5, (byte) 127));
                        ((wg) this).field_c = new DataInputStream(var4.getInputStream());
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        ((wg) this).field_n.field_f = 0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 27: {
                    if (null != ((wg) this).field_g) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    ((wg) this).field_g = ((wg) this).field_b.a((Runnable) this, 0, 5);
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if (0 == ((wg) this).field_g.field_a) {
                        statePc = 31;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 31: {
                    return false;
                }
                case 32: {
                    if (param0 == 45) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    return false;
                }
                case 34: {
                    if (((wg) this).field_g.field_a == 1) {
                        statePc = 36;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    ((wg) this).finalize();
                    ((wg) this).field_l = ((wg) this).field_l + 1;
                    return false;
                }
                case 36: {
                    return false;
                }
                case 38: {
                    var2 = (IOException) (Object) caughtException;
                    ((wg) this).finalize();
                    ((wg) this).field_l = ((wg) this).field_l + 1;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (null != ((wg) this).field_g) {
                        statePc = 50;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    ((wg) this).field_g = ((wg) this).field_b.a((Runnable) this, 0, 5);
                    if (0 == ((wg) this).field_g.field_a) {
                        statePc = 42;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 42: {
                    return false;
                }
                case 43: {
                    if (param0 != 45) {
                        statePc = 48;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (((wg) this).field_g.field_a != 1) {
                        statePc = 46;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 46: {
                    ((wg) this).finalize();
                    ((wg) this).field_l = ((wg) this).field_l + 1;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    return false;
                }
                case 48: {
                    return false;
                }
                case 50: {
                    if (0 == ((wg) this).field_g.field_a) {
                        statePc = 52;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 52: {
                    return false;
                }
                case 53: {
                    if (param0 != 45) {
                        statePc = 58;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (((wg) this).field_g.field_a != 1) {
                        statePc = 56;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 56: {
                    ((wg) this).finalize();
                    ((wg) this).field_l = ((wg) this).field_l + 1;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    return false;
                }
                case 58: {
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

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
                        var4 = Geoblox.field_C;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((wg) this).field_n.field_f >= ((wg) this).field_n.field_j.length) {
                                statePc = 5;
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
                            var1_int = ((wg) this).field_c.read(((wg) this).field_n.field_j, ((wg) this).field_n.field_f, -((wg) this).field_n.field_f + ((wg) this).field_n.field_j.length);
                            if (0 <= var1_int) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            ((wg) this).field_n.field_f = ((wg) this).field_n.field_f + var1_int;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (((wg) this).field_n.field_j.length == ((wg) this).field_n.field_f) {
                                statePc = 7;
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
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((wg) this).field_n.field_j.length + " " + ((wg) this).field_h);
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var1 = this;
                            // monitorenter this
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            ((wg) this).finalize();
                            ((wg) this).field_l = 3;
                            // monitorexit var1
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            return;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var2 = caughtException;
                            // monitorexit var1
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            throw (RuntimeException) (Object) var2;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        var1_ref = (Exception) (Object) caughtException;
                        var2_ref = this;
                        // monitorenter this
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        try {
                            ((wg) this).finalize();
                            ((wg) this).field_l = ((wg) this).field_l + 1;
                            // monitorexit var2_ref
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        return;
                    }
                    case 17: {
                        try {
                            var3 = caughtException;
                            // monitorexit var2_ref
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 18: {
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

    final static void a(int param0, int param1) {
        oc.field_c = param1;
        uh.field_y.b((int)((float)(64 * param1 / 80) * 1.399999976158142f), (byte) 22);
        if (param0 != -15346) {
            wg.a(-15, 68);
        }
    }

    wg(d param0, java.net.URL param1, int param2) {
        ((wg) this).field_b = param0;
        ((wg) this).field_h = param1;
        ((wg) this).field_n = new qc(param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 5;
        field_j = 0;
        field_e = 50;
        field_d = new ck(4, 1, 1, 1);
    }
}
