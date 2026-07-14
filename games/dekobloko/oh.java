/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class oh implements Runnable {
    static int field_n;
    static w field_d;
    private java.net.URL field_j;
    private mh field_h;
    private DataInputStream field_g;
    private int field_k;
    private wl field_a;
    static char[] field_f;
    private fd field_m;
    static boolean field_b;
    private mh field_l;
    static ck field_e;
    static w field_i;
    static int[] field_c;
    private mh field_o;

    final wl a(boolean param0) {
        if (!(3 != ((oh) this).field_k)) {
            return ((oh) this).field_a;
        }
        if (!param0) {
            return null;
        }
        ((oh) this).field_k = -68;
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
                    if (2 > ((oh) this).field_k) {
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
                    if (((oh) this).field_k == 0) {
                        statePc = 4;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (null != ((oh) this).field_o) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    ((oh) this).field_o = ((oh) this).field_m.a(((oh) this).field_j, (byte) 66);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (((oh) this).field_o.field_c != 0) {
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
                    if ((((oh) this).field_o.field_c ^ -1) == -2) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    ((oh) this).field_o = null;
                    ((oh) this).field_k = ((oh) this).field_k + 1;
                    return false;
                }
                case 10: {
                    if ((((oh) this).field_k ^ -1) != -2) {
                        statePc = 19;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (((oh) this).field_h == null) {
                        statePc = 13;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 13: {
                    ((oh) this).field_h = ((oh) this).field_m.a(100, ((oh) this).field_j.getHost(), 443);
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (((oh) this).field_h.field_c == 0) {
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
                    if (1 == ((oh) this).field_h.field_c) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    ((oh) this).field_k = ((oh) this).field_k + 1;
                    ((oh) this).field_h = null;
                    return false;
                }
                case 19: {
                    if (null != ((oh) this).field_g) {
                        statePc = 39;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    try {
                        if (0 != ((oh) this).field_k) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        ((oh) this).field_g = (DataInputStream) ((oh) this).field_o.field_b;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if ((((oh) this).field_k ^ -1) == -2) {
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
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var4 = (java.net.Socket) ((oh) this).field_h.field_b;
                        var4.setSoTimeout(10000);
                        var3 = var4.getOutputStream();
                        var3.write(17);
                        var5 = (CharSequence) (Object) ("JAGGRAB " + ((oh) this).field_j.getFile() + "\n\n");
                        var3.write(km.a(6216, var5));
                        ((oh) this).field_g = new DataInputStream(var4.getInputStream());
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        ((oh) this).field_a.field_n = 0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 26: {
                    if (param0 < -89) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    wl discarded$2 = ((oh) this).a(true);
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if (null == ((oh) this).field_l) {
                        statePc = 30;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 30: {
                    ((oh) this).field_l = ((oh) this).field_m.a((byte) 121, 5, (Runnable) this);
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (0 == ((oh) this).field_l.field_c) {
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
                    if (-2 != (((oh) this).field_l.field_c ^ -1)) {
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
                    ((oh) this).finalize();
                    ((oh) this).field_k = ((oh) this).field_k + 1;
                    return false;
                }
                case 38: {
                    var2 = (IOException) (Object) caughtException;
                    ((oh) this).finalize();
                    ((oh) this).field_k = ((oh) this).field_k + 1;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (param0 < -89) {
                        statePc = 50;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    wl discarded$3 = ((oh) this).a(true);
                    if (null == ((oh) this).field_l) {
                        statePc = 42;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 42: {
                    ((oh) this).field_l = ((oh) this).field_m.a((byte) 121, 5, (Runnable) this);
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if (0 == ((oh) this).field_l.field_c) {
                        statePc = 45;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 45: {
                    return false;
                }
                case 46: {
                    if (-2 == (((oh) this).field_l.field_c ^ -1)) {
                        statePc = 48;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    ((oh) this).finalize();
                    ((oh) this).field_k = ((oh) this).field_k + 1;
                    return false;
                }
                case 48: {
                    return false;
                }
                case 50: {
                    if (null == ((oh) this).field_l) {
                        statePc = 52;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 52: {
                    ((oh) this).field_l = ((oh) this).field_m.a((byte) 121, 5, (Runnable) this);
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    if (0 == ((oh) this).field_l.field_c) {
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
                    if (-2 != (((oh) this).field_l.field_c ^ -1)) {
                        statePc = 58;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    return false;
                }
                case 58: {
                    ((oh) this).finalize();
                    ((oh) this).field_k = ((oh) this).field_k + 1;
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static byte[] a(String param0, int param1) {
        Object var3 = null;
        if (param1 != -15192) {
          var3 = null;
          ui discarded$2 = oh.a((ji) null, -55, (String) null, (pl) null, (String) null);
          return lc.field_h.a(0, param0, "");
        } else {
          return lc.field_h.a(0, param0, "");
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
                        var4 = client.field_A ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((oh) this).field_a.field_n >= ((oh) this).field_a.field_r.length) {
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
                            var1_int = ((oh) this).field_g.read(((oh) this).field_a.field_r, ((oh) this).field_a.field_n, -((oh) this).field_a.field_n + ((oh) this).field_a.field_r.length);
                            if (var1_int < 0) {
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
                            ((oh) this).field_a.field_n = ((oh) this).field_a.field_n + var1_int;
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
                            if (((oh) this).field_a.field_r.length == ((oh) this).field_a.field_n) {
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
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((oh) this).field_a.field_r.length + " " + ((oh) this).field_j);
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
                            ((oh) this).finalize();
                            ((oh) this).field_k = 3;
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
                            ((oh) this).finalize();
                            ((oh) this).field_k = ((oh) this).field_k + 1;
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

    public static void b(boolean param0) {
        field_e = null;
        field_c = null;
        field_d = null;
        if (param0) {
            return;
        }
        field_f = null;
        field_i = null;
    }

    final static void a(byte param0) {
        if (param0 != 13) {
            Object var2 = null;
            byte[] discarded$0 = oh.a((String) null, -97);
        }
    }

    protected final void finalize() {
        if (null != ((oh) this).field_o) {
            if (!(((oh) this).field_o.field_b == null)) {
                try {
                    ((DataInputStream) ((oh) this).field_o.field_b).close();
                } catch (Exception exception) {
                }
            }
            ((oh) this).field_o = null;
        }
        if (((oh) this).field_h != null) {
            if (!(((oh) this).field_h.field_b == null)) {
                try {
                    ((java.net.Socket) ((oh) this).field_h.field_b).close();
                } catch (Exception exception) {
                }
            }
            ((oh) this).field_h = null;
        }
        if (!(((oh) this).field_g == null)) {
            try {
                ((oh) this).field_g.close();
            } catch (Exception exception) {
            }
            ((oh) this).field_g = null;
        }
        ((oh) this).field_l = null;
    }

    final static ui a(ji param0, int param1, String param2, pl param3, String param4) {
        int var5 = 0;
        int var6 = 0;
        if (param1 != 91) {
          return null;
        } else {
          var5 = param0.b(param1 + -92, param2);
          var6 = param0.a(var5, param1 + 12939, param4);
          return jg.a(true, param3, var6, var5, param0);
        }
    }

    oh(fd param0, java.net.URL param1, int param2) {
        ((oh) this).field_j = param1;
        ((oh) this).field_m = param0;
        ((oh) this).field_a = new wl(param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 64;
        field_b = false;
        field_f = new char[]{(char)91, (char)93, (char)35};
    }
}
