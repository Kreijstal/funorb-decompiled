/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fa implements Runnable {
    static String field_d;
    private java.net.URL field_b;
    private wo field_l;
    private wo field_a;
    private vh field_o;
    private int field_n;
    static int[] field_k;
    static String field_c;
    static int field_j;
    static String field_g;
    private hd field_h;
    static String field_f;
    static String field_e;
    private wo field_i;
    private DataInputStream field_m;

    protected final void finalize() {
        if (!(((fa) this).field_a == null)) {
            if (((fa) this).field_a.field_f != null) {
                try {
                    ((DataInputStream) ((fa) this).field_a.field_f).close();
                } catch (Exception exception) {
                }
            }
            ((fa) this).field_a = null;
        }
        if (null != ((fa) this).field_i) {
            if (!(null == ((fa) this).field_i.field_f)) {
                try {
                    ((java.net.Socket) ((fa) this).field_i.field_f).close();
                } catch (Exception exception) {
                }
            }
            ((fa) this).field_i = null;
        }
        if (!(null == ((fa) this).field_m)) {
            try {
                ((fa) this).field_m.close();
            } catch (Exception exception) {
            }
            ((fa) this).field_m = null;
        }
        ((fa) this).field_l = null;
    }

    final synchronized boolean b(int param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((fa) this).field_n < 2) {
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
                    if (-1 != (((fa) this).field_n ^ -1)) {
                        statePc = 10;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (((fa) this).field_a == null) {
                        statePc = 5;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 5: {
                    ((fa) this).field_a = ((fa) this).field_h.a(((fa) this).field_b, false);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (0 != ((fa) this).field_a.field_g) {
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
                    if ((((fa) this).field_a.field_g ^ -1) == -2) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    ((fa) this).field_n = ((fa) this).field_n + 1;
                    ((fa) this).field_a = null;
                    return false;
                }
                case 10: {
                    if ((((fa) this).field_n ^ -1) != -2) {
                        statePc = 19;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (null == ((fa) this).field_i) {
                        statePc = 13;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 13: {
                    ((fa) this).field_i = ((fa) this).field_h.a(443, (byte) 124, ((fa) this).field_b.getHost());
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (((fa) this).field_i.field_g == 0) {
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
                    if (1 == ((fa) this).field_i.field_g) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    ((fa) this).field_i = null;
                    ((fa) this).field_n = ((fa) this).field_n + 1;
                    return false;
                }
                case 19: {
                    if (null == ((fa) this).field_m) {
                        statePc = 29;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (((fa) this).field_l != null) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    ((fa) this).field_l = ((fa) this).field_h.a(5, 0, (Runnable) this);
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (param0 == ((fa) this).field_l.field_g) {
                        statePc = 24;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 24: {
                    return false;
                }
                case 25: {
                    if (-2 != (((fa) this).field_l.field_g ^ -1)) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    return false;
                }
                case 27: {
                    ((fa) this).finalize();
                    ((fa) this).field_n = ((fa) this).field_n + 1;
                    return false;
                }
                case 29: {
                    try {
                        if (((fa) this).field_n == 0) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        ((fa) this).field_m = (DataInputStream) ((fa) this).field_a.field_f;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (1 == ((fa) this).field_n) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var4 = (java.net.Socket) ((fa) this).field_i.field_f;
                        var4.setSoTimeout(10000);
                        var3 = var4.getOutputStream();
                        var3.write(17);
                        var5 = (CharSequence) (Object) ("JAGGRAB " + ((fa) this).field_b.getFile() + "\n\n");
                        var3.write(nr.a(var5, false));
                        ((fa) this).field_m = new DataInputStream(var4.getInputStream());
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
                        ((fa) this).field_o.field_q = 0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 36: {
                    if (((fa) this).field_l != null) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    ((fa) this).field_l = ((fa) this).field_h.a(5, 0, (Runnable) this);
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (param0 == ((fa) this).field_l.field_g) {
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
                    if (-2 == (((fa) this).field_l.field_g ^ -1)) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    ((fa) this).finalize();
                    ((fa) this).field_n = ((fa) this).field_n + 1;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    return false;
                }
                case 44: {
                    var2 = (IOException) (Object) caughtException;
                    ((fa) this).finalize();
                    ((fa) this).field_n = ((fa) this).field_n + 1;
                    if (((fa) this).field_l != null) {
                        statePc = 52;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    ((fa) this).field_l = ((fa) this).field_h.a(5, 0, (Runnable) this);
                    if (param0 == ((fa) this).field_l.field_g) {
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
                    if (-2 == (((fa) this).field_l.field_g ^ -1)) {
                        statePc = 50;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    ((fa) this).finalize();
                    ((fa) this).field_n = ((fa) this).field_n + 1;
                    return false;
                }
                case 50: {
                    return false;
                }
                case 52: {
                    if (param0 == ((fa) this).field_l.field_g) {
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
                    if (-2 != (((fa) this).field_l.field_g ^ -1)) {
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
                    ((fa) this).finalize();
                    ((fa) this).field_n = ((fa) this).field_n + 1;
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
                        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((fa) this).field_o.field_o.length <= ((fa) this).field_o.field_q) {
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
                            var1_int = ((fa) this).field_m.read(((fa) this).field_o.field_o, ((fa) this).field_o.field_q, -((fa) this).field_o.field_q + ((fa) this).field_o.field_o.length);
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
                            ((fa) this).field_o.field_q = ((fa) this).field_o.field_q + var1_int;
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
                            if (((fa) this).field_o.field_q == ((fa) this).field_o.field_o.length) {
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
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((fa) this).field_o.field_o.length + " " + ((fa) this).field_b);
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
                            ((fa) this).finalize();
                            ((fa) this).field_n = 3;
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
                            ((fa) this).finalize();
                            ((fa) this).field_n = ((fa) this).field_n + 1;
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

    final vh a(int param0) {
        if (param0 != ((fa) this).field_n) {
            return null;
        }
        return ((fa) this).field_o;
    }

    public static void a(byte param0) {
        field_f = null;
        field_k = null;
        if (param0 < 48) {
            return;
        }
        field_e = null;
        field_d = null;
        field_c = null;
        field_g = null;
    }

    fa(hd param0, java.net.URL param1, int param2) {
        ((fa) this).field_h = param0;
        ((fa) this).field_b = param1;
        ((fa) this).field_o = new vh(param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Name is available";
        field_k = new int[8192];
        field_j = -1;
        field_g = "Escort all allied leaders to the map exit.";
        field_c = "Hide game chat";
        field_e = "Offer unrated rematch";
        field_f = "(Guard)";
    }
}
