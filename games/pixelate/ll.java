/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ll implements Runnable {
    private java.net.URL field_b;
    private int field_n;
    private ei field_j;
    static tg field_c;
    static String field_g;
    private ei field_e;
    static String field_k;
    static String field_p;
    static tf[] field_m;
    private cb field_h;
    private we field_l;
    static String field_f;
    private DataInputStream field_o;
    static String field_i;
    static int field_a;
    private ei field_d;

    final static void a(byte param0, int param1, int param2, int param3) {
        ce.field_b = param1;
        if (param0 > -112) {
            field_f = null;
            sl.field_l = param2;
            qo.field_s = param3;
            return;
        }
        sl.field_l = param2;
        qo.field_s = param3;
    }

    final static uj a(long param0, int param1) {
        if (param1 != 14428) {
            return null;
        }
        return (uj) (Object) eh.field_f.a(-11434, param0);
    }

    protected final void finalize() {
        if (((ll) this).field_e != null) {
            if (!(((ll) this).field_e.field_e == null)) {
                try {
                    ((DataInputStream) ((ll) this).field_e.field_e).close();
                } catch (Exception exception) {
                }
            }
            ((ll) this).field_e = null;
        }
        if (!(((ll) this).field_d == null)) {
            if (!(((ll) this).field_d.field_e == null)) {
                try {
                    ((java.net.Socket) ((ll) this).field_d.field_e).close();
                } catch (Exception exception) {
                }
            }
            ((ll) this).field_d = null;
        }
        if (!(((ll) this).field_o == null)) {
            try {
                ((ll) this).field_o.close();
            } catch (Exception exception) {
            }
            ((ll) this).field_o = null;
        }
        ((ll) this).field_j = null;
    }

    public static void a(byte param0) {
        field_i = null;
        field_g = null;
        field_k = null;
        field_m = null;
        field_p = null;
        field_c = null;
        if (param0 != -57) {
          field_p = null;
          field_f = null;
          return;
        } else {
          field_f = null;
          return;
        }
    }

    final we a(int param0) {
        if (((ll) this).field_n != param0) {
            return null;
        }
        return ((ll) this).field_l;
    }

    final synchronized boolean b(byte param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (2 <= ((ll) this).field_n) {
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
                    if (((ll) this).field_n != 0) {
                        statePc = 12;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (((ll) this).field_e == null) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ((ll) this).field_e = ((ll) this).field_h.a((byte) -44, ((ll) this).field_b);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (((ll) this).field_e.field_b == 0) {
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
                    if (1 == ((ll) this).field_e.field_b) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    ((ll) this).field_n = ((ll) this).field_n + 1;
                    ((ll) this).field_e = null;
                    return false;
                }
                case 12: {
                    if (((ll) this).field_n == 1) {
                        statePc = 14;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (null != ((ll) this).field_d) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    ((ll) this).field_d = ((ll) this).field_h.a(20278, ((ll) this).field_b.getHost(), 443);
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (((ll) this).field_d.field_b == 0) {
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
                    if (1 != ((ll) this).field_d.field_b) {
                        statePc = 21;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 21: {
                    ((ll) this).field_d = null;
                    ((ll) this).field_n = ((ll) this).field_n + 1;
                    return false;
                }
                case 22: {
                    if (((ll) this).field_o != null) {
                        statePc = 41;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    try {
                        if (0 == ((ll) this).field_n) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        ((ll) this).field_o = (DataInputStream) ((ll) this).field_e.field_e;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (1 == ((ll) this).field_n) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var4 = (java.net.Socket) ((ll) this).field_d.field_e;
                        var4.setSoTimeout(10000);
                        var3 = var4.getOutputStream();
                        var3.write(17);
                        var5 = (CharSequence) (Object) ("JAGGRAB " + ((ll) this).field_b.getFile() + "\n\n");
                        var3.write(gk.b(var5, 353));
                        ((ll) this).field_o = new DataInputStream(var4.getInputStream());
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
                        ((ll) this).field_l.field_m = 0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 30: {
                    if (param0 == -87) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    return true;
                }
                case 32: {
                    if (((ll) this).field_j != null) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    ((ll) this).field_j = ((ll) this).field_h.a(5, (Runnable) this, (byte) -123);
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if (((ll) this).field_j.field_b != 0) {
                        statePc = 36;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    return false;
                }
                case 36: {
                    if (((ll) this).field_j.field_b != 1) {
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
                    ((ll) this).finalize();
                    ((ll) this).field_n = ((ll) this).field_n + 1;
                    return false;
                }
                case 40: {
                    var2 = (IOException) (Object) caughtException;
                    ((ll) this).finalize();
                    ((ll) this).field_n = ((ll) this).field_n + 1;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    if (param0 == -87) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    return true;
                }
                case 43: {
                    if (((ll) this).field_j != null) {
                        statePc = 50;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    ((ll) this).field_j = ((ll) this).field_h.a(5, (Runnable) this, (byte) -123);
                    if (((ll) this).field_j.field_b != 0) {
                        statePc = 46;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    return false;
                }
                case 46: {
                    if (((ll) this).field_j.field_b == 1) {
                        statePc = 48;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    ((ll) this).finalize();
                    ((ll) this).field_n = ((ll) this).field_n + 1;
                    return false;
                }
                case 48: {
                    return false;
                }
                case 50: {
                    if (((ll) this).field_j.field_b != 0) {
                        statePc = 52;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    return false;
                }
                case 52: {
                    if (((ll) this).field_j.field_b != 1) {
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
                    ((ll) this).finalize();
                    ((ll) this).field_n = ((ll) this).field_n + 1;
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
                        var4 = Pixelate.field_H ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((ll) this).field_l.field_k.length <= ((ll) this).field_l.field_m) {
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
                            var1_int = ((ll) this).field_o.read(((ll) this).field_l.field_k, ((ll) this).field_l.field_m, -((ll) this).field_l.field_m + ((ll) this).field_l.field_k.length);
                            if (-1 >= (var1_int ^ -1)) {
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
                            ((ll) this).field_l.field_m = ((ll) this).field_l.field_m + var1_int;
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
                            if (((ll) this).field_l.field_m == ((ll) this).field_l.field_k.length) {
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
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((ll) this).field_l.field_k.length + " " + ((ll) this).field_b);
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
                            ((ll) this).finalize();
                            ((ll) this).field_n = 3;
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
                            ((ll) this).finalize();
                            ((ll) this).field_n = ((ll) this).field_n + 1;
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

    ll(cb param0, java.net.URL param1, int param2) {
        ((ll) this).field_h = param0;
        ((ll) this).field_b = param1;
        ((ll) this).field_l = new we(param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "You must be a member to play with the current options.";
        field_k = "Unable to connect to the data server. Please check any firewall you are using.";
        field_f = "You must play <%1> more rated games before playing with the current options.";
        field_p = "<%0> has lost connection.";
        field_i = "Click or press F10 to open Quick Chat";
    }
}
