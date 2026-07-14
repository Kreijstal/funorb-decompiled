/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bi implements Runnable {
    private mob field_f;
    private mob field_c;
    private ds field_h;
    static String field_g;
    private mob field_b;
    private java.net.URL field_i;
    private DataInputStream field_d;
    private eab field_e;
    private int field_a;

    public static void b(int param0) {
        if (param0 != -19766) {
            field_g = null;
            field_g = null;
            return;
        }
        field_g = null;
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
                    if (-3 < (((bi) this).field_a ^ -1)) {
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
                    if (0 != ((bi) this).field_a) {
                        statePc = 11;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (null == ((bi) this).field_c) {
                        statePc = 5;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 5: {
                    ((bi) this).field_c = ((bi) this).field_e.a(((bi) this).field_i, 97);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (((bi) this).field_c.field_f != -1) {
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
                    if (-2 != ((bi) this).field_c.field_f) {
                        statePc = 10;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 10: {
                    ((bi) this).field_a = ((bi) this).field_a + 1;
                    ((bi) this).field_c = null;
                    return false;
                }
                case 11: {
                    if ((((bi) this).field_a ^ -1) != -2) {
                        statePc = 21;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (((bi) this).field_b == null) {
                        statePc = 14;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 14: {
                    ((bi) this).field_b = ((bi) this).field_e.a(443, ((bi) this).field_i.getHost(), 91);
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (-1 == (((bi) this).field_b.field_f ^ -1)) {
                        statePc = 17;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 17: {
                    return false;
                }
                case 18: {
                    if (1 != ((bi) this).field_b.field_f) {
                        statePc = 20;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 20: {
                    ((bi) this).field_b = null;
                    ((bi) this).field_a = ((bi) this).field_a + 1;
                    return false;
                }
                case 21: {
                    if (null != ((bi) this).field_d) {
                        statePc = 39;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    try {
                        if (((bi) this).field_a != 0) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        ((bi) this).field_d = (DataInputStream) ((bi) this).field_c.field_d;
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
                        if (-2 != (((bi) this).field_a ^ -1)) {
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
                        var4 = (java.net.Socket) ((bi) this).field_b.field_d;
                        var4.setSoTimeout(10000);
                        var3 = var4.getOutputStream();
                        var3.write(17);
                        var5 = (CharSequence) (Object) ("JAGGRAB " + ((bi) this).field_i.getFile() + "\n\n");
                        var3.write(hi.a(var5, 126));
                        ((bi) this).field_d = new DataInputStream(var4.getInputStream());
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
                        ((bi) this).field_h.field_e = 0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 27: {
                    if (null != ((bi) this).field_f) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    ((bi) this).field_f = ((bi) this).field_e.a(0, 5, (Runnable) this);
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if (0 == ((bi) this).field_f.field_f) {
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
                    if (param0 > 38) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    ((bi) this).run();
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if (-2 == (((bi) this).field_f.field_f ^ -1)) {
                        statePc = 36;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    ((bi) this).finalize();
                    ((bi) this).field_a = ((bi) this).field_a + 1;
                    return false;
                }
                case 36: {
                    return false;
                }
                case 38: {
                    var2 = (IOException) (Object) caughtException;
                    ((bi) this).finalize();
                    ((bi) this).field_a = ((bi) this).field_a + 1;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (null != ((bi) this).field_f) {
                        statePc = 53;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    ((bi) this).field_f = ((bi) this).field_e.a(0, 5, (Runnable) this);
                    if (0 == ((bi) this).field_f.field_f) {
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
                    if (param0 > 38) {
                        statePc = 48;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    ((bi) this).run();
                    if (-2 != ((bi) this).field_f.field_f) {
                        statePc = 46;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 46: {
                    ((bi) this).finalize();
                    ((bi) this).field_a = ((bi) this).field_a + 1;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    return false;
                }
                case 48: {
                    if (-2 != ((bi) this).field_f.field_f) {
                        statePc = 50;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 50: {
                    ((bi) this).finalize();
                    ((bi) this).field_a = ((bi) this).field_a + 1;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    return false;
                }
                case 53: {
                    if (0 == ((bi) this).field_f.field_f) {
                        statePc = 55;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 55: {
                    return false;
                }
                case 56: {
                    if (param0 <= 38) {
                        statePc = 61;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    if (-2 != ((bi) this).field_f.field_f) {
                        statePc = 59;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 59: {
                    ((bi) this).finalize();
                    ((bi) this).field_a = ((bi) this).field_a + 1;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    return false;
                }
                case 61: {
                    ((bi) this).run();
                    if (-2 != ((bi) this).field_f.field_f) {
                        statePc = 63;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 63: {
                    ((bi) this).finalize();
                    ((bi) this).field_a = ((bi) this).field_a + 1;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    protected final void finalize() {
        if (null != ((bi) this).field_c) {
            if (!(null == ((bi) this).field_c.field_d)) {
                try {
                    ((DataInputStream) ((bi) this).field_c.field_d).close();
                } catch (Exception exception) {
                }
            }
            ((bi) this).field_c = null;
        }
        if (!(null == ((bi) this).field_b)) {
            if (!(((bi) this).field_b.field_d == null)) {
                try {
                    ((java.net.Socket) ((bi) this).field_b.field_d).close();
                } catch (Exception exception) {
                }
            }
            ((bi) this).field_b = null;
        }
        if (!(((bi) this).field_d == null)) {
            try {
                ((bi) this).field_d.close();
            } catch (Exception exception) {
            }
            ((bi) this).field_d = null;
        }
        ((bi) this).field_f = null;
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
                        var4 = VoidHunters.field_G;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((bi) this).field_h.field_h.length <= ((bi) this).field_h.field_e) {
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
                            var1_int = ((bi) this).field_d.read(((bi) this).field_h.field_h, ((bi) this).field_h.field_e, ((bi) this).field_h.field_h.length + -((bi) this).field_h.field_e);
                            if ((var1_int ^ -1) > -1) {
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
                            ((bi) this).field_h.field_e = ((bi) this).field_h.field_e + var1_int;
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
                            if (((bi) this).field_h.field_e == ((bi) this).field_h.field_h.length) {
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
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((bi) this).field_h.field_h.length + " " + ((bi) this).field_i);
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
                            ((bi) this).finalize();
                            ((bi) this).field_a = 3;
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
                            ((bi) this).finalize();
                            ((bi) this).field_a = ((bi) this).field_a + 1;
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

    final ds a(int param0) {
        int var2 = 0;
        var2 = 118 % ((param0 - -32) / 54);
        if ((((bi) this).field_a ^ -1) != -4) {
          return null;
        } else {
          return ((bi) this).field_h;
        }
    }

    bi(eab param0, java.net.URL param1, int param2) {
        ((bi) this).field_e = param0;
        ((bi) this).field_i = param1;
        ((bi) this).field_h = new ds(param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Scale down map width";
    }
}
