/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qk implements Runnable {
    private java.net.URL field_i;
    private nl field_d;
    static int field_e;
    private nl field_f;
    static mk field_b;
    private nl field_l;
    private p field_j;
    private DataInputStream field_c;
    private int field_a;
    static int field_h;
    private jk field_g;
    static km field_k;

    public static void a(boolean param0) {
        field_b = null;
        if (!param0) {
            qk.a(true);
            field_k = null;
            return;
        }
        field_k = null;
    }

    protected final void finalize() {
        if (null != ((qk) this).field_f) {
            if (((qk) this).field_f.field_b != null) {
                try {
                    ((DataInputStream) ((qk) this).field_f.field_b).close();
                } catch (Exception exception) {
                }
            }
            ((qk) this).field_f = null;
        }
        if (null != ((qk) this).field_l) {
            if (null != ((qk) this).field_l.field_b) {
                try {
                    ((java.net.Socket) ((qk) this).field_l.field_b).close();
                } catch (Exception exception) {
                }
            }
            ((qk) this).field_l = null;
        }
        if (null != ((qk) this).field_c) {
            try {
                ((qk) this).field_c.close();
            } catch (Exception exception) {
            }
            ((qk) this).field_c = null;
        }
        ((qk) this).field_d = null;
    }

    final synchronized boolean a(int param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (-3 < (((qk) this).field_a ^ -1)) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return true;
                }
                case 2: {
                    if (((qk) this).field_a == 0) {
                        statePc = 4;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (((qk) this).field_f != null) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    ((qk) this).field_f = ((qk) this).field_g.a((byte) -49, ((qk) this).field_i);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (((qk) this).field_f.field_f != 0) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return false;
                }
                case 8: {
                    if (1 != ((qk) this).field_f.field_f) {
                        statePc = 10;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 10: {
                    ((qk) this).field_a = ((qk) this).field_a + 1;
                    ((qk) this).field_f = null;
                    return false;
                }
                case 11: {
                    if (1 != ((qk) this).field_a) {
                        statePc = 20;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (((qk) this).field_l != null) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    ((qk) this).field_l = ((qk) this).field_g.a(((qk) this).field_i.getHost(), false, 443);
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (((qk) this).field_l.field_f == 0) {
                        statePc = 16;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 16: {
                    return false;
                }
                case 17: {
                    if (((qk) this).field_l.field_f != 1) {
                        statePc = 19;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 19: {
                    ((qk) this).field_a = ((qk) this).field_a + 1;
                    ((qk) this).field_l = null;
                    return false;
                }
                case 20: {
                    if (null != ((qk) this).field_c) {
                        statePc = 41;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    try {
                        if (((qk) this).field_a == 0) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        ((qk) this).field_c = (DataInputStream) ((qk) this).field_f.field_b;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (1 == ((qk) this).field_a) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var4 = (java.net.Socket) ((qk) this).field_l.field_b;
                        var4.setSoTimeout(10000);
                        var3 = var4.getOutputStream();
                        var3.write(17);
                        var5 = (CharSequence) (Object) ("JAGGRAB " + ((qk) this).field_i.getFile() + "\n\n");
                        var3.write(dj.a(var5, param0 ^ 17));
                        ((qk) this).field_c = new DataInputStream(var4.getInputStream());
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
                        ((qk) this).field_j.field_l = 0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 28: {
                    if (null == ((qk) this).field_d) {
                        statePc = 30;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 30: {
                    ((qk) this).field_d = ((qk) this).field_g.a(5, true, (Runnable) this);
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (0 == ((qk) this).field_d.field_f) {
                        statePc = 33;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 33: {
                    return false;
                }
                case 34: {
                    if (param0 == 17) {
                        statePc = 36;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    field_k = null;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    if (-2 == (((qk) this).field_d.field_f ^ -1)) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    ((qk) this).finalize();
                    ((qk) this).field_a = ((qk) this).field_a + 1;
                    return false;
                }
                case 38: {
                    return false;
                }
                case 40: {
                    var2 = (IOException) (Object) caughtException;
                    ((qk) this).finalize();
                    ((qk) this).field_a = ((qk) this).field_a + 1;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    if (null == ((qk) this).field_d) {
                        statePc = 43;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 43: {
                    ((qk) this).field_d = ((qk) this).field_g.a(5, true, (Runnable) this);
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    if (0 == ((qk) this).field_d.field_f) {
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
                    if (param0 != 17) {
                        statePc = 52;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (-2 != ((qk) this).field_d.field_f) {
                        statePc = 50;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 50: {
                    ((qk) this).finalize();
                    ((qk) this).field_a = ((qk) this).field_a + 1;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    return false;
                }
                case 52: {
                    field_k = null;
                    if (-2 != ((qk) this).field_d.field_f) {
                        statePc = 54;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 54: {
                    ((qk) this).finalize();
                    ((qk) this).field_a = ((qk) this).field_a + 1;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
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
                        var4 = Chess.field_G;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((qk) this).field_j.field_l >= ((qk) this).field_j.field_o.length) {
                                statePc = 5;
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
                            var1_int = ((qk) this).field_c.read(((qk) this).field_j.field_o, ((qk) this).field_j.field_l, ((qk) this).field_j.field_o.length + -((qk) this).field_j.field_l);
                            if ((var1_int ^ -1) <= -1) {
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
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            ((qk) this).field_j.field_l = ((qk) this).field_j.field_l + var1_int;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (((qk) this).field_j.field_o.length != ((qk) this).field_j.field_l) {
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
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((qk) this).field_j.field_o.length + " " + ((qk) this).field_i);
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
                            ((qk) this).finalize();
                            ((qk) this).field_a = 3;
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
                            ((qk) this).finalize();
                            ((qk) this).field_a = ((qk) this).field_a + 1;
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

    qk(jk param0, java.net.URL param1, int param2) {
        ((qk) this).field_g = param0;
        ((qk) this).field_i = param1;
        ((qk) this).field_j = new p(param2);
    }

    final p b(int param0) {
        int var2 = -89 % ((-84 - param0) / 36);
        if (!(-4 != (((qk) this).field_a ^ -1))) {
            return ((qk) this).field_j;
        }
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new mk();
        field_k = new km(0, 0);
    }
}
