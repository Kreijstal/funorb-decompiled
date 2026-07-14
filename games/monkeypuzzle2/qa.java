/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qa implements Runnable {
    private gk field_e;
    private java.net.URL field_f;
    static le field_i;
    private DataInputStream field_l;
    private int field_k;
    private ic field_g;
    static pj field_d;
    static String field_b;
    private md field_h;
    private ic field_j;
    static int field_a;
    private ic field_c;

    final static void a(byte param0, gg param1, int param2, int param3) {
        hh.field_u = param1;
        wg.field_h = param2;
        if (param0 != -39) {
            return;
        }
        rb.field_cb = param3;
    }

    public static void a(byte param0) {
        Object var2 = null;
        field_d = null;
        if (param0 <= 20) {
          var2 = null;
          qa.a((byte) -50, (gg) null, 114, 54);
          field_i = null;
          field_b = null;
          return;
        } else {
          field_i = null;
          field_b = null;
          return;
        }
    }

    final gk a(int param0) {
        if (param0 >= 13) {
          if (-4 != ((qa) this).field_k) {
            return null;
          } else {
            return ((qa) this).field_e;
          }
        } else {
          field_d = null;
          if (-4 != ((qa) this).field_k) {
            return null;
          } else {
            return ((qa) this).field_e;
          }
        }
    }

    final synchronized boolean c(int param0) {
        int var2 = 0;
        IOException var3 = null;
        OutputStream var4 = null;
        java.net.Socket var5 = null;
        CharSequence var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((qa) this).field_k < 2) {
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
                    if (-1 == (((qa) this).field_k ^ -1)) {
                        statePc = 4;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (((qa) this).field_j != null) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    ((qa) this).field_j = ((qa) this).field_h.a((byte) 112, ((qa) this).field_f);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (-1 == (((qa) this).field_j.field_g ^ -1)) {
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
                    if ((((qa) this).field_j.field_g ^ -1) != -2) {
                        statePc = 11;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 11: {
                    ((qa) this).field_k = ((qa) this).field_k + 1;
                    ((qa) this).field_j = null;
                    return false;
                }
                case 12: {
                    if (1 != ((qa) this).field_k) {
                        statePc = 20;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (((qa) this).field_g != null) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    ((qa) this).field_g = ((qa) this).field_h.a(((qa) this).field_f.getHost(), 0, 443);
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (-1 != (((qa) this).field_g.field_g ^ -1)) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    return false;
                }
                case 17: {
                    if (1 != ((qa) this).field_g.field_g) {
                        statePc = 19;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 19: {
                    ((qa) this).field_k = ((qa) this).field_k + 1;
                    ((qa) this).field_g = null;
                    return false;
                }
                case 20: {
                    var2 = -62 / ((-17 - param0) / 60);
                    if (null != ((qa) this).field_l) {
                        statePc = 36;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    try {
                        if (0 != ((qa) this).field_k) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        ((qa) this).field_l = (DataInputStream) ((qa) this).field_j.field_b;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (1 == ((qa) this).field_k) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var5 = (java.net.Socket) ((qa) this).field_g.field_b;
                        var5.setSoTimeout(10000);
                        var4 = var5.getOutputStream();
                        var4.write(17);
                        var6 = (CharSequence) (Object) ("JAGGRAB " + ((qa) this).field_f.getFile() + "\n\n");
                        var4.write(pj.a(3231, var6));
                        ((qa) this).field_l = new DataInputStream(var5.getInputStream());
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        ((qa) this).field_e.field_h = 0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 27: {
                    if (((qa) this).field_c != null) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    ((qa) this).field_c = ((qa) this).field_h.a((Runnable) this, 5, 0);
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if (((qa) this).field_c.field_g != 0) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    return false;
                }
                case 31: {
                    if (-2 != (((qa) this).field_c.field_g ^ -1)) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    return false;
                }
                case 33: {
                    ((qa) this).finalize();
                    ((qa) this).field_k = ((qa) this).field_k + 1;
                    return false;
                }
                case 35: {
                    var3 = (IOException) (Object) caughtException;
                    ((qa) this).finalize();
                    ((qa) this).field_k = ((qa) this).field_k + 1;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    if (((qa) this).field_c != null) {
                        statePc = 43;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    ((qa) this).field_c = ((qa) this).field_h.a((Runnable) this, 5, 0);
                    if (((qa) this).field_c.field_g != 0) {
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
                    if (-2 == (((qa) this).field_c.field_g ^ -1)) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    ((qa) this).finalize();
                    ((qa) this).field_k = ((qa) this).field_k + 1;
                    return false;
                }
                case 41: {
                    return false;
                }
                case 43: {
                    if (((qa) this).field_c.field_g != 0) {
                        statePc = 45;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    return false;
                }
                case 45: {
                    if (-2 != (((qa) this).field_c.field_g ^ -1)) {
                        statePc = 47;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    return false;
                }
                case 47: {
                    ((qa) this).finalize();
                    ((qa) this).field_k = ((qa) this).field_k + 1;
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    protected final void finalize() {
        if (!(null == ((qa) this).field_j)) {
            if (null != ((qa) this).field_j.field_b) {
                try {
                    ((DataInputStream) ((qa) this).field_j.field_b).close();
                } catch (Exception exception) {
                }
            }
            ((qa) this).field_j = null;
        }
        if (!(((qa) this).field_g == null)) {
            if (!(null == ((qa) this).field_g.field_b)) {
                try {
                    ((java.net.Socket) ((qa) this).field_g.field_b).close();
                } catch (Exception exception) {
                }
            }
            ((qa) this).field_g = null;
        }
        if (null != ((qa) this).field_l) {
            try {
                ((qa) this).field_l.close();
            } catch (Exception exception) {
            }
            ((qa) this).field_l = null;
        }
        ((qa) this).field_c = null;
    }

    final static int b(int param0) {
        if (param0 < 120) {
            field_a = -111;
            return je.field_c;
        }
        return je.field_c;
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
                        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((qa) this).field_e.field_h >= ((qa) this).field_e.field_g.length) {
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
                            var1_int = ((qa) this).field_l.read(((qa) this).field_e.field_g, ((qa) this).field_e.field_h, -((qa) this).field_e.field_h + ((qa) this).field_e.field_g.length);
                            if (-1 >= (var1_int ^ -1)) {
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
                            ((qa) this).field_e.field_h = ((qa) this).field_e.field_h + var1_int;
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
                            if (((qa) this).field_e.field_h != ((qa) this).field_e.field_g.length) {
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
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((qa) this).field_e.field_g.length + " " + ((qa) this).field_f);
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
                            ((qa) this).finalize();
                            ((qa) this).field_k = 3;
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
                            ((qa) this).finalize();
                            ((qa) this).field_k = ((qa) this).field_k + 1;
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

    qa(md param0, java.net.URL param1, int param2) {
        ((qa) this).field_h = param0;
        ((qa) this).field_f = param1;
        ((qa) this).field_e = new gk(param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Change display name";
        field_d = new pj();
    }
}
