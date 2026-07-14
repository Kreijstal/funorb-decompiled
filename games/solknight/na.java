/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class na implements Runnable {
    private gb field_g;
    private nj field_a;
    private dl field_h;
    private nj field_f;
    private int field_c;
    static boolean field_b;
    private java.net.URL field_e;
    private nj field_i;
    private DataInputStream field_d;
    static String[] field_j;

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
                        var4 = SolKnight.field_L ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((na) this).field_g.field_m >= ((na) this).field_g.field_l.length) {
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
                            var1_int = ((na) this).field_d.read(((na) this).field_g.field_l, ((na) this).field_g.field_m, ((na) this).field_g.field_l.length - ((na) this).field_g.field_m);
                            if (var1_int < 0) {
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
                            ((na) this).field_g.field_m = ((na) this).field_g.field_m + var1_int;
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
                            if (((na) this).field_g.field_l.length != ((na) this).field_g.field_m) {
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
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((na) this).field_g.field_l.length + " " + ((na) this).field_e);
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
                            ((na) this).finalize();
                            ((na) this).field_c = 3;
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
                            ((na) this).finalize();
                            ((na) this).field_c = ((na) this).field_c + 1;
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

    final gb a(boolean param0) {
        if (!(((na) this).field_c != 3)) {
            return ((na) this).field_g;
        }
        if (param0) {
            return null;
        }
        na.a(110);
        return null;
    }

    final static byte[] a(int param0, byte[] param1) {
        int var2 = param1.length;
        byte[] var3 = new byte[var2];
        fk.a(param1, 0, var3, 0, var2);
        int var4 = -87 / ((66 - param0) / 49);
        return var3;
    }

    public static void a(int param0) {
        field_j = null;
        if (param0 != -13357) {
            Object var2 = null;
            String discarded$0 = na.a((String) null, (java.applet.Applet) null, -92);
        }
    }

    protected final void finalize() {
        if (!(null == ((na) this).field_i)) {
            if (!(null == ((na) this).field_i.field_e)) {
                try {
                    ((DataInputStream) ((na) this).field_i.field_e).close();
                } catch (Exception exception) {
                }
            }
            ((na) this).field_i = null;
        }
        if (null != ((na) this).field_a) {
            if (!(((na) this).field_a.field_e == null)) {
                try {
                    ((java.net.Socket) ((na) this).field_a.field_e).close();
                } catch (Exception exception) {
                }
            }
            ((na) this).field_a = null;
        }
        if (!(null == ((na) this).field_d)) {
            try {
                ((na) this).field_d.close();
            } catch (Exception exception) {
            }
            ((na) this).field_d = null;
        }
        ((na) this).field_f = null;
    }

    final static String a(String param0, java.applet.Applet param1, int param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String stackIn_8_0 = null;
            String stackOut_7_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = SolKnight.field_L ? 1 : 0;
                        if (param2 == -32574) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        field_j = null;
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        try {
                            var3 = (String) fd.a(param1, "getcookies", (byte) 100);
                            var4 = b.a(var3, ';', true);
                            var5 = 0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (var4.length <= var5) {
                                statePc = 12;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (0 > var6) {
                                statePc = 9;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (var4[var5].substring(0, var6).trim().equals((Object) (Object) param0)) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            stackOut_7_0 = var4[var5].substring(var6 + 1).trim();
                            stackIn_8_0 = stackOut_7_0;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        return stackIn_8_0;
                    }
                    case 9: {
                        try {
                            var5++;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        var3_ref = caughtException;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
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

    na(dl param0, java.net.URL param1, int param2) {
        ((na) this).field_h = param0;
        ((na) this).field_e = param1;
        ((na) this).field_g = new gb(param2);
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
                    if (2 <= ((na) this).field_c) {
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
                    if (-1 == (((na) this).field_c ^ -1)) {
                        statePc = 5;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (null == ((na) this).field_i) {
                        statePc = 7;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 7: {
                    ((na) this).field_i = ((na) this).field_h.a(((na) this).field_e, (byte) 68);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (((na) this).field_i.field_c == 0) {
                        statePc = 10;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 10: {
                    return false;
                }
                case 11: {
                    if (((na) this).field_i.field_c != 1) {
                        statePc = 13;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 13: {
                    ((na) this).field_i = null;
                    ((na) this).field_c = ((na) this).field_c + 1;
                    return false;
                }
                case 14: {
                    if ((((na) this).field_c ^ -1) == -2) {
                        statePc = 16;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (null != ((na) this).field_a) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    ((na) this).field_a = ((na) this).field_h.a(((na) this).field_e.getHost(), 443, -28148);
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (((na) this).field_a.field_c != 0) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    return false;
                }
                case 20: {
                    if (1 != ((na) this).field_a.field_c) {
                        statePc = 22;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 22: {
                    ((na) this).field_c = ((na) this).field_c + 1;
                    ((na) this).field_a = null;
                    return false;
                }
                case 23: {
                    if (null != ((na) this).field_d) {
                        statePc = 45;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    try {
                        if (-1 == (((na) this).field_c ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        ((na) this).field_d = (DataInputStream) ((na) this).field_i.field_e;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if ((((na) this).field_c ^ -1) == -2) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var4 = (java.net.Socket) ((na) this).field_a.field_e;
                        var4.setSoTimeout(10000);
                        var3 = var4.getOutputStream();
                        var3.write(17);
                        var5 = (CharSequence) (Object) ("JAGGRAB " + ((na) this).field_e.getFile() + "\n\n");
                        var3.write(wb.a(65, var5));
                        ((na) this).field_d = new DataInputStream(var4.getInputStream());
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        ((na) this).field_g.field_m = 0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 31: {
                    if (null == ((na) this).field_f) {
                        statePc = 33;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 33: {
                    ((na) this).field_f = ((na) this).field_h.a(5, -90, (Runnable) this);
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if (-1 == (((na) this).field_f.field_c ^ -1)) {
                        statePc = 36;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 36: {
                    return false;
                }
                case 37: {
                    if (((na) this).field_f.field_c != 1) {
                        statePc = 39;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 39: {
                    ((na) this).finalize();
                    ((na) this).field_c = ((na) this).field_c + 1;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (param0 > -57) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    return false;
                }
                case 42: {
                    ((na) this).field_d = null;
                    return false;
                }
                case 44: {
                    var2 = (IOException) (Object) caughtException;
                    ((na) this).finalize();
                    ((na) this).field_c = ((na) this).field_c + 1;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (null == ((na) this).field_f) {
                        statePc = 47;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 47: {
                    ((na) this).field_f = ((na) this).field_h.a(5, -90, (Runnable) this);
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    if (-1 == (((na) this).field_f.field_c ^ -1)) {
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
                    if (((na) this).field_f.field_c != 1) {
                        statePc = 53;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 53: {
                    ((na) this).finalize();
                    ((na) this).field_c = ((na) this).field_c + 1;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    if (param0 > -57) {
                        statePc = 56;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    return false;
                }
                case 56: {
                    ((na) this).field_d = null;
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
