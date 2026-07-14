/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qb implements Runnable {
    private ib field_d;
    static long field_k;
    private oa field_h;
    private DataInputStream field_g;
    private ib field_e;
    private ib field_j;
    private int field_c;
    static String[] field_f;
    static String field_a;
    private fe field_i;
    private java.net.URL field_b;

    protected final void finalize() {
        if (!(((qb) this).field_j == null)) {
            if (!(null == ((qb) this).field_j.field_g)) {
                try {
                    ((DataInputStream) ((qb) this).field_j.field_g).close();
                } catch (Exception exception) {
                }
            }
            ((qb) this).field_j = null;
        }
        if (!(((qb) this).field_d == null)) {
            if (((qb) this).field_d.field_g != null) {
                try {
                    ((java.net.Socket) ((qb) this).field_d.field_g).close();
                } catch (Exception exception) {
                }
            }
            ((qb) this).field_d = null;
        }
        if (((qb) this).field_g != null) {
            try {
                ((qb) this).field_g.close();
            } catch (Exception exception) {
            }
            ((qb) this).field_g = null;
        }
        ((qb) this).field_e = null;
    }

    public static void a(byte param0) {
        field_f = null;
        field_a = null;
        if (param0 != -62) {
            field_k = -124L;
        }
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
                    if ((((qb) this).field_c ^ -1) <= -3) {
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
                    if (((qb) this).field_c == param0) {
                        statePc = 5;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (null != ((qb) this).field_j) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ((qb) this).field_j = ((qb) this).field_i.a(-21377, ((qb) this).field_b);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (((qb) this).field_j.field_c != 0) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    return false;
                }
                case 9: {
                    if (-2 == ((qb) this).field_j.field_c) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    ((qb) this).field_j = null;
                    ((qb) this).field_c = ((qb) this).field_c + 1;
                    return false;
                }
                case 11: {
                    if (-2 != ((qb) this).field_c) {
                        statePc = 20;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (null != ((qb) this).field_d) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    ((qb) this).field_d = ((qb) this).field_i.a(88, ((qb) this).field_b.getHost(), 443);
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (((qb) this).field_d.field_c == 0) {
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
                    if (((qb) this).field_d.field_c != 1) {
                        statePc = 19;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 19: {
                    ((qb) this).field_d = null;
                    ((qb) this).field_c = ((qb) this).field_c + 1;
                    return false;
                }
                case 20: {
                    if (((qb) this).field_g == null) {
                        statePc = 30;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (null != ((qb) this).field_e) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    ((qb) this).field_e = ((qb) this).field_i.a((Runnable) this, 5, 65535);
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if (0 == ((qb) this).field_e.field_c) {
                        statePc = 25;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 25: {
                    return false;
                }
                case 26: {
                    if (((qb) this).field_e.field_c != -2) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    return false;
                }
                case 28: {
                    ((qb) this).finalize();
                    ((qb) this).field_c = ((qb) this).field_c + 1;
                    return false;
                }
                case 30: {
                    try {
                        if (-1 == ((qb) this).field_c) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        ((qb) this).field_g = (DataInputStream) ((qb) this).field_j.field_g;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (((qb) this).field_c != 1) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var4 = (java.net.Socket) ((qb) this).field_d.field_g;
                        var4.setSoTimeout(10000);
                        var3 = var4.getOutputStream();
                        var3.write(17);
                        var5 = (CharSequence) (Object) ("JAGGRAB " + ((qb) this).field_b.getFile() + "\n\n");
                        var3.write(uk.a(14122, var5));
                        ((qb) this).field_g = new DataInputStream(var4.getInputStream());
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        ((qb) this).field_h.field_h = 0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 36: {
                    if (null != ((qb) this).field_e) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    ((qb) this).field_e = ((qb) this).field_i.a((Runnable) this, 5, 65535);
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (0 == ((qb) this).field_e.field_c) {
                        statePc = 40;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 40: {
                    return false;
                }
                case 41: {
                    if ((((qb) this).field_e.field_c ^ -1) == -2) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    ((qb) this).finalize();
                    ((qb) this).field_c = ((qb) this).field_c + 1;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    return false;
                }
                case 44: {
                    var2 = (IOException) (Object) caughtException;
                    ((qb) this).finalize();
                    ((qb) this).field_c = ((qb) this).field_c + 1;
                    if (null != ((qb) this).field_e) {
                        statePc = 52;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    ((qb) this).field_e = ((qb) this).field_i.a((Runnable) this, 5, 65535);
                    if (0 == ((qb) this).field_e.field_c) {
                        statePc = 47;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 47: {
                    return false;
                }
                case 48: {
                    if ((((qb) this).field_e.field_c ^ -1) == -2) {
                        statePc = 50;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    ((qb) this).finalize();
                    ((qb) this).field_c = ((qb) this).field_c + 1;
                    return false;
                }
                case 50: {
                    return false;
                }
                case 52: {
                    if (0 == ((qb) this).field_e.field_c) {
                        statePc = 54;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 54: {
                    return false;
                }
                case 55: {
                    if ((((qb) this).field_e.field_c ^ -1) != -2) {
                        statePc = 57;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    return false;
                }
                case 57: {
                    ((qb) this).finalize();
                    ((qb) this).field_c = ((qb) this).field_c + 1;
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final oa b(int param0) {
        int var2 = 68 / ((param0 - 56) / 56);
        if (!(-4 != (((qb) this).field_c ^ -1))) {
            return ((qb) this).field_h;
        }
        return null;
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
                        var4 = Transmogrify.field_A ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((qb) this).field_h.field_h >= ((qb) this).field_h.field_g.length) {
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
                            var1_int = ((qb) this).field_g.read(((qb) this).field_h.field_g, ((qb) this).field_h.field_h, ((qb) this).field_h.field_g.length - ((qb) this).field_h.field_h);
                            if (var1_int >= 0) {
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
                            ((qb) this).field_h.field_h = ((qb) this).field_h.field_h + var1_int;
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
                            if (((qb) this).field_h.field_g.length == ((qb) this).field_h.field_h) {
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
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((qb) this).field_h.field_g.length + " " + ((qb) this).field_b);
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
                            ((qb) this).finalize();
                            ((qb) this).field_c = 3;
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
                            ((qb) this).finalize();
                            ((qb) this).field_c = ((qb) this).field_c + 1;
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

    qb(fe param0, java.net.URL param1, int param2) {
        ((qb) this).field_b = param1;
        ((qb) this).field_i = param0;
        ((qb) this).field_h = new oa(param2);
    }

    final static void a(int param0, int param1, oa param2, int param3, int param4) {
        param2.f(6389, 12);
        param2.c(17, -159688920);
        param2.c(param4, -159688920);
        param2.c(param1, -159688920);
        param2.f(6389, param3);
        if (param0 < 112) {
            field_k = -61L;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Reload game";
    }
}
