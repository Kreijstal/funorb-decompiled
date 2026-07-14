/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ad implements Runnable {
    static String field_c;
    static String field_h;
    private la field_g;
    private DataInputStream field_b;
    private la field_e;
    private n field_i;
    private java.net.URL field_j;
    private lk field_f;
    static int field_d;
    private la field_a;
    private int field_k;

    final static void a(int param0, int param1) {
        int var3 = 0;
        rl var4 = null;
        var3 = EscapeVector.field_A;
        if (param1 < 44) {
          return;
        } else {
          var4 = (rl) (Object) cd.field_s.a(false);
          L0: while (true) {
            if (var4 == null) {
              return;
            } else {
              qh.a(var4, true, param0);
              var4 = (rl) (Object) cd.field_s.b((byte) 70);
              continue L0;
            }
          }
        }
    }

    public static void b(int param0) {
        field_c = null;
        field_h = null;
        if (param0 != -1) {
            field_d = -109;
        }
    }

    final n c(int param0) {
        if (!(((ad) this).field_k != 3)) {
            return ((ad) this).field_i;
        }
        if (param0 < -12) {
            return null;
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
                        var4 = EscapeVector.field_A;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((ad) this).field_i.field_g.length <= ((ad) this).field_i.field_m) {
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
                            var1_int = ((ad) this).field_b.read(((ad) this).field_i.field_g, ((ad) this).field_i.field_m, -((ad) this).field_i.field_m + ((ad) this).field_i.field_g.length);
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
                            ((ad) this).field_i.field_m = ((ad) this).field_i.field_m + var1_int;
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
                            if (((ad) this).field_i.field_g.length == ((ad) this).field_i.field_m) {
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
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((ad) this).field_i.field_g.length + " " + ((ad) this).field_j);
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
                            ((ad) this).finalize();
                            ((ad) this).field_k = 3;
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
                            ((ad) this).finalize();
                            ((ad) this).field_k = ((ad) this).field_k + 1;
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

    protected final void finalize() {
        if (null != ((ad) this).field_e) {
            if (null != ((ad) this).field_e.field_b) {
                try {
                    ((DataInputStream) ((ad) this).field_e.field_b).close();
                } catch (Exception exception) {
                }
            }
            ((ad) this).field_e = null;
        }
        if (((ad) this).field_a != null) {
            if (!(((ad) this).field_a.field_b == null)) {
                try {
                    ((java.net.Socket) ((ad) this).field_a.field_b).close();
                } catch (Exception exception) {
                }
            }
            ((ad) this).field_a = null;
        }
        if (null != ((ad) this).field_b) {
            try {
                ((ad) this).field_b.close();
            } catch (Exception exception) {
            }
            ((ad) this).field_b = null;
        }
        ((ad) this).field_g = null;
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
                    if (-3 >= (((ad) this).field_k ^ -1)) {
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
                    if (0 == ((ad) this).field_k) {
                        statePc = 5;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (null != ((ad) this).field_e) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ((ad) this).field_e = ((ad) this).field_f.a((byte) -12, ((ad) this).field_j);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (((ad) this).field_e.field_f == 0) {
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
                    if ((((ad) this).field_e.field_f ^ -1) != -2) {
                        statePc = 12;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 12: {
                    ((ad) this).field_e = null;
                    ((ad) this).field_k = ((ad) this).field_k + 1;
                    return false;
                }
                case 13: {
                    if (1 != ((ad) this).field_k) {
                        statePc = 22;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (((ad) this).field_a == null) {
                        statePc = 16;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 16: {
                    ((ad) this).field_a = ((ad) this).field_f.a(443, 4, ((ad) this).field_j.getHost());
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (-1 != (((ad) this).field_a.field_f ^ -1)) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    return false;
                }
                case 19: {
                    if (1 != ((ad) this).field_a.field_f) {
                        statePc = 21;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 21: {
                    ((ad) this).field_a = null;
                    ((ad) this).field_k = ((ad) this).field_k + 1;
                    return false;
                }
                case 22: {
                    if (null == ((ad) this).field_b) {
                        statePc = 33;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (((ad) this).field_g != null) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    ((ad) this).field_g = ((ad) this).field_f.a(true, 5, (Runnable) this);
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (-1 == (((ad) this).field_g.field_f ^ -1)) {
                        statePc = 31;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (1 == ((ad) this).field_g.field_f) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    ((ad) this).finalize();
                    ((ad) this).field_k = ((ad) this).field_k + 1;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if (param0 == 17) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    ad.a(49, -88);
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    return false;
                }
                case 31: {
                    return false;
                }
                case 33: {
                    try {
                        if (((ad) this).field_k != 0) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        ((ad) this).field_b = (DataInputStream) ((ad) this).field_e.field_b;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (1 == ((ad) this).field_k) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var4 = (java.net.Socket) ((ad) this).field_a.field_b;
                        var4.setSoTimeout(10000);
                        var3 = var4.getOutputStream();
                        var3.write(17);
                        var5 = (CharSequence) (Object) ("JAGGRAB " + ((ad) this).field_j.getFile() + "\n\n");
                        var3.write(dk.a((byte) -14, var5));
                        ((ad) this).field_b = new DataInputStream(var4.getInputStream());
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        ((ad) this).field_i.field_m = 0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 39: {
                    if (((ad) this).field_g != null) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    ((ad) this).field_g = ((ad) this).field_f.a(true, 5, (Runnable) this);
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    if (-1 == (((ad) this).field_g.field_f ^ -1)) {
                        statePc = 47;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (1 == ((ad) this).field_g.field_f) {
                        statePc = 44;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    ((ad) this).finalize();
                    ((ad) this).field_k = ((ad) this).field_k + 1;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    if (param0 == 17) {
                        statePc = 46;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    ad.a(49, -88);
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    return false;
                }
                case 47: {
                    return false;
                }
                case 49: {
                    var2 = (IOException) (Object) caughtException;
                    ((ad) this).finalize();
                    ((ad) this).field_k = ((ad) this).field_k + 1;
                    if (((ad) this).field_g != null) {
                        statePc = 61;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    ((ad) this).field_g = ((ad) this).field_f.a(true, 5, (Runnable) this);
                    if (-1 != (((ad) this).field_g.field_f ^ -1)) {
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
                    if (1 != ((ad) this).field_g.field_f) {
                        statePc = 57;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (param0 != 17) {
                        statePc = 55;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    return false;
                }
                case 55: {
                    ad.a(49, -88);
                    return false;
                }
                case 57: {
                    ((ad) this).finalize();
                    ((ad) this).field_k = ((ad) this).field_k + 1;
                    if (param0 == 17) {
                        statePc = 59;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    ad.a(49, -88);
                    return false;
                }
                case 59: {
                    return false;
                }
                case 61: {
                    if (-1 != (((ad) this).field_g.field_f ^ -1)) {
                        statePc = 63;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    return false;
                }
                case 63: {
                    if (1 == ((ad) this).field_g.field_f) {
                        statePc = 68;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    ((ad) this).finalize();
                    ((ad) this).field_k = ((ad) this).field_k + 1;
                    if (param0 != 17) {
                        statePc = 66;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    return false;
                }
                case 66: {
                    ad.a(49, -88);
                    return false;
                }
                case 68: {
                    if (param0 != 17) {
                        statePc = 70;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    return false;
                }
                case 70: {
                    ad.a(49, -88);
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ad(lk param0, java.net.URL param1, int param2) {
        ((ad) this).field_f = param0;
        ((ad) this).field_j = param1;
        ((ad) this).field_i = new n(param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Updates will sent to the email address you've given";
        field_c = "Total score: ";
    }
}
