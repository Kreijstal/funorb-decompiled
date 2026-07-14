/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cc implements Runnable {
    private jr field_c;
    private DataInputStream field_h;
    private java.net.URL field_a;
    private fs field_d;
    private int field_g;
    private jr field_f;
    private jr field_e;
    static int field_j;
    private wi field_b;
    static ck field_i;

    protected final void finalize() {
        if (((cc) this).field_e != null) {
            if (!(null == ((cc) this).field_e.field_d)) {
                try {
                    ((DataInputStream) ((cc) this).field_e.field_d).close();
                } catch (Exception exception) {
                }
            }
            ((cc) this).field_e = null;
        }
        if (((cc) this).field_f != null) {
            if (null != ((cc) this).field_f.field_d) {
                try {
                    ((java.net.Socket) ((cc) this).field_f.field_d).close();
                } catch (Exception exception) {
                }
            }
            ((cc) this).field_f = null;
        }
        if (!(null == ((cc) this).field_h)) {
            try {
                ((cc) this).field_h.close();
            } catch (Exception exception) {
            }
            ((cc) this).field_h = null;
        }
        ((cc) this).field_c = null;
    }

    final synchronized boolean a(byte param0) {
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
                    if (((cc) this).field_g < 2) {
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
                    var2 = 4 / ((param0 - -41) / 43);
                    if (((cc) this).field_g == 0) {
                        statePc = 4;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (((cc) this).field_e == null) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ((cc) this).field_e = ((cc) this).field_b.a((byte) 107, ((cc) this).field_a);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (0 != ((cc) this).field_e.field_c) {
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
                    if (1 == ((cc) this).field_e.field_c) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    ((cc) this).field_e = null;
                    ((cc) this).field_g = ((cc) this).field_g + 1;
                    return false;
                }
                case 11: {
                    if (-2 != (((cc) this).field_g ^ -1)) {
                        statePc = 20;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (((cc) this).field_f == null) {
                        statePc = 14;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 14: {
                    ((cc) this).field_f = ((cc) this).field_b.a((byte) 51, ((cc) this).field_a.getHost(), 443);
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (-1 != ((cc) this).field_f.field_c) {
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
                    if (-2 != ((cc) this).field_f.field_c) {
                        statePc = 19;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 19: {
                    ((cc) this).field_f = null;
                    ((cc) this).field_g = ((cc) this).field_g + 1;
                    return false;
                }
                case 20: {
                    if (((cc) this).field_h == null) {
                        statePc = 30;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (null == ((cc) this).field_c) {
                        statePc = 23;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 23: {
                    ((cc) this).field_c = ((cc) this).field_b.a(true, (Runnable) this, 5);
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (0 != ((cc) this).field_c.field_c) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    return false;
                }
                case 26: {
                    if (((cc) this).field_c.field_c != 1) {
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
                    ((cc) this).finalize();
                    ((cc) this).field_g = ((cc) this).field_g + 1;
                    return false;
                }
                case 30: {
                    try {
                        if (0 == ((cc) this).field_g) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        ((cc) this).field_h = (DataInputStream) ((cc) this).field_e.field_d;
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
                        if (((cc) this).field_g == 1) {
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
                        var5 = (java.net.Socket) ((cc) this).field_f.field_d;
                        var5.setSoTimeout(10000);
                        var4 = var5.getOutputStream();
                        var4.write(17);
                        var6 = (CharSequence) (Object) ("JAGGRAB " + ((cc) this).field_a.getFile() + "\n\n");
                        var4.write(mb.a(var6, (byte) 32));
                        ((cc) this).field_h = new DataInputStream(var5.getInputStream());
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
                        ((cc) this).field_d.field_p = 0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 37: {
                    if (null == ((cc) this).field_c) {
                        statePc = 39;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 39: {
                    ((cc) this).field_c = ((cc) this).field_b.a(true, (Runnable) this, 5);
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (0 == ((cc) this).field_c.field_c) {
                        statePc = 44;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (((cc) this).field_c.field_c == 1) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    ((cc) this).finalize();
                    ((cc) this).field_g = ((cc) this).field_g + 1;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    return false;
                }
                case 44: {
                    return false;
                }
                case 46: {
                    var3 = (IOException) (Object) caughtException;
                    ((cc) this).finalize();
                    ((cc) this).field_g = ((cc) this).field_g + 1;
                    if (null == ((cc) this).field_c) {
                        statePc = 48;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 48: {
                    ((cc) this).field_c = ((cc) this).field_b.a(true, (Runnable) this, 5);
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (0 != ((cc) this).field_c.field_c) {
                        statePc = 51;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    return false;
                }
                case 51: {
                    if (((cc) this).field_c.field_c != 1) {
                        statePc = 53;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    return false;
                }
                case 53: {
                    ((cc) this).finalize();
                    ((cc) this).field_g = ((cc) this).field_g + 1;
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
                        var4 = Sumoblitz.field_L ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((cc) this).field_d.field_p >= ((cc) this).field_d.field_n.length) {
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
                            var1_int = ((cc) this).field_h.read(((cc) this).field_d.field_n, ((cc) this).field_d.field_p, -((cc) this).field_d.field_p + ((cc) this).field_d.field_n.length);
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
                            ((cc) this).field_d.field_p = ((cc) this).field_d.field_p + var1_int;
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
                            if (((cc) this).field_d.field_n.length == ((cc) this).field_d.field_p) {
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
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((cc) this).field_d.field_n.length + " " + ((cc) this).field_a);
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
                            ((cc) this).finalize();
                            ((cc) this).field_g = 3;
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
                            ((cc) this).finalize();
                            ((cc) this).field_g = ((cc) this).field_g + 1;
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

    final fs b(byte param0) {
        if (3 == ((cc) this).field_g) {
          return ((cc) this).field_d;
        } else {
          if (param0 == 126) {
            return null;
          } else {
            ((cc) this).field_a = null;
            return null;
          }
        }
    }

    cc(wi param0, java.net.URL param1, int param2) {
        ((cc) this).field_b = param0;
        ((cc) this).field_a = param1;
        ((cc) this).field_d = new fs(param2);
    }

    public static void a(int param0) {
        if (param0 < 121) {
            cc.a(82);
            field_i = null;
            return;
        }
        field_i = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new ck();
    }
}
