/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rf implements Runnable {
    private vi field_k;
    private int field_i;
    private pb field_c;
    private vi field_j;
    private le field_f;
    static String field_e;
    static ph field_d;
    static String field_g;
    private vi field_b;
    private java.net.URL field_a;
    private DataInputStream field_h;

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
                        var4 = Main.field_T;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((rf) this).field_c.field_i >= ((rf) this).field_c.field_g.length) {
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
                            var1_int = ((rf) this).field_h.read(((rf) this).field_c.field_g, ((rf) this).field_c.field_i, ((rf) this).field_c.field_g.length - ((rf) this).field_c.field_i);
                            if (-1 < (var1_int ^ -1)) {
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
                            ((rf) this).field_c.field_i = ((rf) this).field_c.field_i + var1_int;
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
                            if (((rf) this).field_c.field_i != ((rf) this).field_c.field_g.length) {
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
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((rf) this).field_c.field_g.length + " " + ((rf) this).field_a);
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
                            ((rf) this).finalize();
                            ((rf) this).field_i = 3;
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
                            statePc = 17;
                            continue stateLoop;
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
                            ((rf) this).finalize();
                            ((rf) this).field_i = ((rf) this).field_i + 1;
                            // monitorexit var2_ref
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 15;
                            continue stateLoop;
                        }
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
                    case 17: {
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

    final static void c(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = (Object) (Object) wc.field_B;
                    // monitorenter wc.field_B
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        qd.field_a = qd.field_a + 1;
                        k.field_c = ge.field_a;
                        eg.field_b = r.field_s;
                        ij.field_e = vd.field_s;
                        d.field_s = oa.field_d;
                        if (param0 <= -48) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        rf.b(-41);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        oa.field_d = false;
                        dl.field_h = kk.field_b;
                        ag.field_a = nl.field_d;
                        jc.field_N = gk.field_b;
                        kk.field_b = 0;
                        // monitorexit var1
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) var2;
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final synchronized boolean a(boolean param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        Throwable decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((rf) this).field_i >= 2) {
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
                    if (((rf) this).field_i == 0) {
                        statePc = 5;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (null != ((rf) this).field_k) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ((rf) this).field_k = ((rf) this).field_f.a(((rf) this).field_a, param0);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (0 == ((rf) this).field_k.field_a) {
                        statePc = 9;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 9: {
                    return false;
                }
                case 10: {
                    if (((rf) this).field_k.field_a == 1) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    ((rf) this).field_i = ((rf) this).field_i + 1;
                    ((rf) this).field_k = null;
                    return false;
                }
                case 12: {
                    if (1 != ((rf) this).field_i) {
                        statePc = 21;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (((rf) this).field_j == null) {
                        statePc = 15;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 15: {
                    ((rf) this).field_j = ((rf) this).field_f.a(((rf) this).field_a.getHost(), (byte) -78, 443);
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (0 == ((rf) this).field_j.field_a) {
                        statePc = 18;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 18: {
                    return false;
                }
                case 19: {
                    if ((((rf) this).field_j.field_a ^ -1) == -2) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    ((rf) this).field_i = ((rf) this).field_i + 1;
                    ((rf) this).field_j = null;
                    return false;
                }
                case 21: {
                    if (((rf) this).field_h == null) {
                        statePc = 23;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 23: {
                    try {
                        if (0 == ((rf) this).field_i) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        ((rf) this).field_h = (DataInputStream) ((rf) this).field_k.field_e;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (1 == ((rf) this).field_i) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var4 = (java.net.Socket) ((rf) this).field_j.field_e;
                        var4.setSoTimeout(10000);
                        var3 = var4.getOutputStream();
                        var3.write(17);
                        var5 = (CharSequence) ("JAGGRAB " + ((rf) this).field_a.getFile() + "\n\n");
                        var3.write(dd.a(var5, (byte) -127));
                        ((rf) this).field_h = new DataInputStream(var4.getInputStream());
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        ((rf) this).field_c.field_i = 0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 31: {
                    var2 = (IOException) (Object) caughtException;
                    ((rf) this).finalize();
                    ((rf) this).field_i = ((rf) this).field_i + 1;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if (((rf) this).field_b == null) {
                        statePc = 34;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 34: {
                    ((rf) this).field_b = ((rf) this).field_f.a(0, 5, (Runnable) this);
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (param0) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    return false;
                }
                case 37: {
                    if (0 != ((rf) this).field_b.field_a) {
                        statePc = 39;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    return false;
                }
                case 39: {
                    if ((((rf) this).field_b.field_a ^ -1) != -2) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    return false;
                }
                case 41: {
                    ((rf) this).finalize();
                    ((rf) this).field_i = ((rf) this).field_i + 1;
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(char param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = Main.field_T;
        if (Character.isISOControl(param0)) {
            return false;
        }
        if (!(!ph.a(param0, false))) {
            return true;
        }
        char[] var6 = kh.field_f;
        char[] var2 = var6;
        for (var3 = param1; var6.length > var3; var3++) {
            var4 = var6[var3];
            if (param0 == var4) {
                return true;
            }
        }
        var2 = ok.field_a;
        for (var3 = 0; var3 < var2.length; var3++) {
            var4 = var2[var3];
            if (!(var4 != param0)) {
                return true;
            }
        }
        return false;
    }

    protected final void finalize() {
        if (!(null == ((rf) this).field_k)) {
            if (null != ((rf) this).field_k.field_e) {
                try {
                    ((DataInputStream) ((rf) this).field_k.field_e).close();
                } catch (Exception exception) {
                }
            }
            ((rf) this).field_k = null;
        }
        if (((rf) this).field_j != null) {
            if (null != ((rf) this).field_j.field_e) {
                try {
                    ((java.net.Socket) ((rf) this).field_j.field_e).close();
                } catch (Exception exception) {
                }
            }
            ((rf) this).field_j = null;
        }
        if (null != ((rf) this).field_h) {
            try {
                ((rf) this).field_h.close();
            } catch (Exception exception) {
            }
            ((rf) this).field_h = null;
        }
        ((rf) this).field_b = null;
    }

    public static void b(int param0) {
        if (param0 != -19749) {
            return;
        }
        field_e = null;
        field_g = null;
        field_d = null;
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = Main.field_T;
        ai.a(bd.field_F, param1, ei.field_f, 0, true, fk.field_h, 8192);
        if (param0 != -23243) {
            rf.c(-100);
        }
        for (var2 = 0; ei.field_f > var2; var2++) {
            re.field_c[param1 + var2] = var2;
        }
        ai.a(ah.field_d, param1 + param1, ei.field_f + param1, param1, false, mf.field_g, 8192);
        if (!(param1 >= ei.field_f)) {
            ei.field_f = param1;
        }
    }

    final pb a(int param0) {
        if (param0 >= -31) {
            return (pb) null;
        }
        if (((rf) this).field_i != 3) {
            return null;
        }
        return ((rf) this).field_c;
    }

    rf(le param0, java.net.URL param1, int param2) {
        ((rf) this).field_a = param1;
        ((rf) this).field_f = param0;
        ((rf) this).field_c = new pb(param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Difficulty: Easy";
        field_g = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}
