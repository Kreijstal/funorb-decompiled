/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gg implements Runnable {
    private DataInputStream field_j;
    private bk field_k;
    private bk field_h;
    private ka field_l;
    static o field_i;
    private rb field_b;
    static hl[] field_f;
    static java.math.BigInteger field_e;
    static int[] field_d;
    private java.net.URL field_g;
    private int field_c;
    private bk field_a;

    protected final void finalize() {
        if (null != ((gg) this).field_h) {
            if (((gg) this).field_h.field_f != null) {
                try {
                    ((DataInputStream) ((gg) this).field_h.field_f).close();
                } catch (Exception exception) {
                }
            }
            ((gg) this).field_h = null;
        }
        if (null != ((gg) this).field_k) {
            if (!(((gg) this).field_k.field_f == null)) {
                try {
                    ((java.net.Socket) ((gg) this).field_k.field_f).close();
                } catch (Exception exception) {
                }
            }
            ((gg) this).field_k = null;
        }
        if (null != ((gg) this).field_j) {
            try {
                ((gg) this).field_j.close();
            } catch (Exception exception) {
            }
            ((gg) this).field_j = null;
        }
        ((gg) this).field_a = null;
    }

    final rb a(byte param0) {
        if ((((gg) this).field_c ^ -1) == -4) {
          return ((gg) this).field_b;
        } else {
          if (param0 > 30) {
            return null;
          } else {
            boolean discarded$2 = ((gg) this).c((byte) 115);
            return null;
          }
        }
    }

    final synchronized boolean c(byte param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (-3 < ((gg) this).field_c) {
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
                    if (-1 == ((gg) this).field_c) {
                        statePc = 4;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (null != ((gg) this).field_h) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    ((gg) this).field_h = ((gg) this).field_l.a((byte) -10, ((gg) this).field_g);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (((gg) this).field_h.field_b == 0) {
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
                    if (((gg) this).field_h.field_b == 1) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    ((gg) this).field_c = ((gg) this).field_c + 1;
                    ((gg) this).field_h = null;
                    return false;
                }
                case 11: {
                    if (param0 <= -86) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    ((gg) this).field_l = null;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if ((((gg) this).field_c ^ -1) == -2) {
                        statePc = 15;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (null == ((gg) this).field_k) {
                        statePc = 17;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 17: {
                    ((gg) this).field_k = ((gg) this).field_l.a(443, -102, ((gg) this).field_g.getHost());
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (0 != ((gg) this).field_k.field_b) {
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
                    if (1 == ((gg) this).field_k.field_b) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    ((gg) this).field_k = null;
                    ((gg) this).field_c = ((gg) this).field_c + 1;
                    return false;
                }
                case 22: {
                    if (null != ((gg) this).field_j) {
                        statePc = 41;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    try {
                        if (0 == ((gg) this).field_c) {
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
                        ((gg) this).field_j = (DataInputStream) ((gg) this).field_h.field_f;
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
                        if (((gg) this).field_c == 1) {
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
                        var4 = (java.net.Socket) ((gg) this).field_k.field_f;
                        var4.setSoTimeout(10000);
                        var3 = var4.getOutputStream();
                        var3.write(17);
                        var5 = (CharSequence) (Object) ("JAGGRAB " + ((gg) this).field_g.getFile() + "\n\n");
                        var3.write(ld.a((byte) -101, var5));
                        ((gg) this).field_j = new DataInputStream(var4.getInputStream());
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
                        ((gg) this).field_b.field_g = 0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 30: {
                    if (null == ((gg) this).field_a) {
                        statePc = 32;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 32: {
                    ((gg) this).field_a = ((gg) this).field_l.a(5, 104, (Runnable) this);
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    if (-1 == ((gg) this).field_a.field_b) {
                        statePc = 35;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 35: {
                    return false;
                }
                case 36: {
                    if (-2 == ((gg) this).field_a.field_b) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    ((gg) this).finalize();
                    ((gg) this).field_c = ((gg) this).field_c + 1;
                    return false;
                }
                case 38: {
                    return false;
                }
                case 40: {
                    var2 = (IOException) (Object) caughtException;
                    ((gg) this).finalize();
                    ((gg) this).field_c = ((gg) this).field_c + 1;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    if (null == ((gg) this).field_a) {
                        statePc = 43;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 43: {
                    ((gg) this).field_a = ((gg) this).field_l.a(5, 104, (Runnable) this);
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    if (-1 == ((gg) this).field_a.field_b) {
                        statePc = 46;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 46: {
                    return false;
                }
                case 47: {
                    if (-2 != ((gg) this).field_a.field_b) {
                        statePc = 49;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 49: {
                    ((gg) this).finalize();
                    ((gg) this).field_c = ((gg) this).field_c + 1;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(byte param0) {
        field_e = null;
        if (param0 != 121) {
            return;
        }
        field_d = null;
        field_f = null;
        field_i = null;
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
                        var4 = StarCannon.field_A;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((gg) this).field_b.field_f.length <= ((gg) this).field_b.field_g) {
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
                            var1_int = ((gg) this).field_j.read(((gg) this).field_b.field_f, ((gg) this).field_b.field_g, -((gg) this).field_b.field_g + ((gg) this).field_b.field_f.length);
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
                            ((gg) this).field_b.field_g = ((gg) this).field_b.field_g + var1_int;
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
                            if (((gg) this).field_b.field_f.length == ((gg) this).field_b.field_g) {
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
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((gg) this).field_b.field_f.length + " " + ((gg) this).field_g);
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
                            ((gg) this).finalize();
                            ((gg) this).field_c = 3;
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
                            ((gg) this).finalize();
                            ((gg) this).field_c = ((gg) this).field_c + 1;
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

    gg(ka param0, java.net.URL param1, int param2) {
        ((gg) this).field_l = param0;
        ((gg) this).field_g = param1;
        ((gg) this).field_b = new rb(param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new o(14, 0, 4, 1);
        field_e = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
