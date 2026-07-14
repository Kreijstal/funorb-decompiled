/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wg implements Runnable {
    static int[] field_j;
    private DataInputStream field_g;
    private wf field_i;
    private ei field_f;
    private int field_d;
    private ei field_h;
    private ab field_a;
    static int field_e;
    private java.net.URL field_c;
    private ei field_b;

    protected final void finalize() {
        if (!(null == ((wg) this).field_f)) {
            if (((wg) this).field_f.field_g != null) {
                try {
                    ((DataInputStream) ((wg) this).field_f.field_g).close();
                } catch (Exception exception) {
                }
            }
            ((wg) this).field_f = null;
        }
        if (!(null == ((wg) this).field_h)) {
            if (!(null == ((wg) this).field_h.field_g)) {
                try {
                    ((java.net.Socket) ((wg) this).field_h.field_g).close();
                } catch (Exception exception) {
                }
            }
            ((wg) this).field_h = null;
        }
        if (((wg) this).field_g != null) {
            try {
                ((wg) this).field_g.close();
            } catch (Exception exception) {
            }
            ((wg) this).field_g = null;
        }
        ((wg) this).field_b = null;
    }

    final static int b(int param0) {
        if (param0 != 13174) {
            int discarded$0 = wg.b(57);
            return 1;
        }
        return 1;
    }

    public static void c(int param0) {
        if (param0 <= 115) {
            field_e = -22;
            field_j = null;
            return;
        }
        field_j = null;
    }

    final wf a(byte param0) {
        if (param0 != -65) {
            return null;
        }
        if (!(-4 != (((wg) this).field_d ^ -1))) {
            return ((wg) this).field_i;
        }
        return null;
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
                    if (((wg) this).field_d < 2) {
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
                    if (0 == ((wg) this).field_d) {
                        statePc = 4;
                    } else {
                        statePc = 11;
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
                    ((wg) this).field_f = ((wg) this).field_a.a(-23816, ((wg) this).field_c);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (0 == ((wg) this).field_f.field_b) {
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
                    if (1 == ((wg) this).field_f.field_b) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    ((wg) this).field_d = ((wg) this).field_d + 1;
                    ((wg) this).field_f = null;
                    return false;
                }
                case 11: {
                    if (param0 >= 38) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    ((wg) this).field_c = null;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if (-2 != (((wg) this).field_d ^ -1)) {
                        statePc = 20;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (null != ((wg) this).field_h) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    ((wg) this).field_h = ((wg) this).field_a.a(443, (byte) 125, ((wg) this).field_c.getHost());
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (0 != ((wg) this).field_h.field_b) {
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
                    if (-2 == (((wg) this).field_h.field_b ^ -1)) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    ((wg) this).field_d = ((wg) this).field_d + 1;
                    ((wg) this).field_h = null;
                    return false;
                }
                case 20: {
                    if (null == ((wg) this).field_g) {
                        statePc = 31;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (((wg) this).field_b == null) {
                        statePc = 23;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 23: {
                    ((wg) this).field_b = ((wg) this).field_a.a((Runnable) this, false, 5);
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (-1 == ((wg) this).field_b.field_b) {
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
                    if (-2 != ((wg) this).field_b.field_b) {
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
                    ((wg) this).finalize();
                    ((wg) this).field_d = ((wg) this).field_d + 1;
                    return false;
                }
                case 31: {
                    try {
                        if (((wg) this).field_d != 0) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        ((wg) this).field_g = (DataInputStream) ((wg) this).field_f.field_g;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (((wg) this).field_d == 1) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var4 = (java.net.Socket) ((wg) this).field_h.field_g;
                        var4.setSoTimeout(10000);
                        var3 = var4.getOutputStream();
                        var3.write(17);
                        var5 = (CharSequence) (Object) ("JAGGRAB " + ((wg) this).field_c.getFile() + "\n\n");
                        var3.write(cl.a((byte) -98, var5));
                        ((wg) this).field_g = new DataInputStream(var4.getInputStream());
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        ((wg) this).field_i.field_h = 0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 37: {
                    if (((wg) this).field_b == null) {
                        statePc = 39;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 39: {
                    ((wg) this).field_b = ((wg) this).field_a.a((Runnable) this, false, 5);
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (-1 == ((wg) this).field_b.field_b) {
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
                    if (-2 == ((wg) this).field_b.field_b) {
                        statePc = 45;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    ((wg) this).finalize();
                    ((wg) this).field_d = ((wg) this).field_d + 1;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    return false;
                }
                case 46: {
                    var2 = (IOException) (Object) caughtException;
                    ((wg) this).finalize();
                    ((wg) this).field_d = ((wg) this).field_d + 1;
                    if (((wg) this).field_b == null) {
                        statePc = 48;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 48: {
                    ((wg) this).field_b = ((wg) this).field_a.a((Runnable) this, false, 5);
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (-1 == ((wg) this).field_b.field_b) {
                        statePc = 51;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 51: {
                    return false;
                }
                case 52: {
                    if (-2 != ((wg) this).field_b.field_b) {
                        statePc = 54;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    return false;
                }
                case 54: {
                    ((wg) this).finalize();
                    ((wg) this).field_d = ((wg) this).field_d + 1;
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
                        var4 = Lexicominos.field_L ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((wg) this).field_i.field_h >= ((wg) this).field_i.field_j.length) {
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
                            var1_int = ((wg) this).field_g.read(((wg) this).field_i.field_j, ((wg) this).field_i.field_h, -((wg) this).field_i.field_h + ((wg) this).field_i.field_j.length);
                            if ((var1_int ^ -1) <= -1) {
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
                            ((wg) this).field_i.field_h = ((wg) this).field_i.field_h + var1_int;
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
                            if (((wg) this).field_i.field_h == ((wg) this).field_i.field_j.length) {
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
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((wg) this).field_i.field_j.length + " " + ((wg) this).field_c);
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
                            ((wg) this).field_d = 3;
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
                            ((wg) this).field_d = ((wg) this).field_d + 1;
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

    wg(ab param0, java.net.URL param1, int param2) {
        ((wg) this).field_a = param0;
        ((wg) this).field_c = param1;
        ((wg) this).field_i = new wf(param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new int[8192];
    }
}
