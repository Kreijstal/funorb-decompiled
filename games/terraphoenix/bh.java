/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bh implements Runnable {
    private int field_c;
    private dh field_i;
    private DataInputStream field_m;
    private java.net.URL field_l;
    static boolean field_f;
    private mf field_n;
    private mf field_g;
    static String field_j;
    static boolean[] field_e;
    private mf field_k;
    private he field_o;
    static int field_a;
    static String field_h;
    static String field_b;
    static String field_d;

    final dh a(int param0) {
        int var2 = 31 % ((param0 - 15) / 56);
        if (!((((bh) this).field_c ^ -1) != -4)) {
            return ((bh) this).field_i;
        }
        return null;
    }

    final static void b(int param0) {
        fh.field_g = false;
        if (param0 >= -22) {
            return;
        }
        int discarded$0 = mk.field_j.a(-16384);
    }

    protected final void finalize() {
        if (null != ((bh) this).field_n) {
            if (null != ((bh) this).field_n.field_e) {
                try {
                    ((DataInputStream) ((bh) this).field_n.field_e).close();
                } catch (Exception exception) {
                }
            }
            ((bh) this).field_n = null;
        }
        if (null != ((bh) this).field_g) {
            if (!(null == ((bh) this).field_g.field_e)) {
                try {
                    ((java.net.Socket) ((bh) this).field_g.field_e).close();
                } catch (Exception exception) {
                }
            }
            ((bh) this).field_g = null;
        }
        if (!(null == ((bh) this).field_m)) {
            try {
                ((bh) this).field_m.close();
            } catch (Exception exception) {
            }
            ((bh) this).field_m = null;
        }
        ((bh) this).field_k = null;
    }

    bh(he param0, java.net.URL param1, int param2) {
        ((bh) this).field_o = param0;
        ((bh) this).field_l = param1;
        ((bh) this).field_i = new dh(param2);
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
                    if (param0 > 22) {
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
                    if (((bh) this).field_c < 2) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return true;
                }
                case 4: {
                    if (-1 == (((bh) this).field_c ^ -1)) {
                        statePc = 6;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (null != ((bh) this).field_n) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    ((bh) this).field_n = ((bh) this).field_o.a(((bh) this).field_l, 111);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (((bh) this).field_n.field_d == 0) {
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
                    if (((bh) this).field_n.field_d == -2) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    ((bh) this).field_c = ((bh) this).field_c + 1;
                    ((bh) this).field_n = null;
                    return false;
                }
                case 13: {
                    if (-2 != ((bh) this).field_c) {
                        statePc = 21;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (null != ((bh) this).field_g) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    ((bh) this).field_g = ((bh) this).field_o.a(443, ((bh) this).field_l.getHost(), (byte) 60);
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (0 == ((bh) this).field_g.field_d) {
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
                    if ((((bh) this).field_g.field_d ^ -1) == -2) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    ((bh) this).field_g = null;
                    ((bh) this).field_c = ((bh) this).field_c + 1;
                    return false;
                }
                case 21: {
                    if (null != ((bh) this).field_m) {
                        statePc = 37;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    try {
                        if (((bh) this).field_c != 0) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        ((bh) this).field_m = (DataInputStream) ((bh) this).field_n.field_e;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (((bh) this).field_c != 1) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var4 = (java.net.Socket) ((bh) this).field_g.field_e;
                        var4.setSoTimeout(10000);
                        var3 = var4.getOutputStream();
                        var3.write(17);
                        var5 = (CharSequence) (Object) ("JAGGRAB " + ((bh) this).field_l.getFile() + "\n\n");
                        var3.write(ma.a(-32396, var5));
                        ((bh) this).field_m = new DataInputStream(var4.getInputStream());
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        ((bh) this).field_i.field_k = 0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 27: {
                    if (((bh) this).field_k == null) {
                        statePc = 29;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 29: {
                    ((bh) this).field_k = ((bh) this).field_o.a((Runnable) this, (byte) -21, 5);
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if (-1 != (((bh) this).field_k.field_d ^ -1)) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    return false;
                }
                case 32: {
                    if ((((bh) this).field_k.field_d ^ -1) == -2) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    ((bh) this).finalize();
                    ((bh) this).field_c = ((bh) this).field_c + 1;
                    return false;
                }
                case 34: {
                    return false;
                }
                case 36: {
                    var2 = (IOException) (Object) caughtException;
                    ((bh) this).finalize();
                    ((bh) this).field_c = ((bh) this).field_c + 1;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (((bh) this).field_k == null) {
                        statePc = 39;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 39: {
                    ((bh) this).field_k = ((bh) this).field_o.a((Runnable) this, (byte) -21, 5);
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (-1 == (((bh) this).field_k.field_d ^ -1)) {
                        statePc = 45;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if ((((bh) this).field_k.field_d ^ -1) != -2) {
                        statePc = 43;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 43: {
                    ((bh) this).finalize();
                    ((bh) this).field_c = ((bh) this).field_c + 1;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    return false;
                }
                case 45: {
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
                        var4 = Terraphoenix.field_V;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((bh) this).field_i.field_i.length <= ((bh) this).field_i.field_k) {
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
                            var1_int = ((bh) this).field_m.read(((bh) this).field_i.field_i, ((bh) this).field_i.field_k, ((bh) this).field_i.field_i.length + -((bh) this).field_i.field_k);
                            if (var1_int >= 0) {
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
                            ((bh) this).field_i.field_k = ((bh) this).field_i.field_k + var1_int;
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
                            if (((bh) this).field_i.field_i.length != ((bh) this).field_i.field_k) {
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
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((bh) this).field_i.field_i.length + " " + ((bh) this).field_l);
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
                            ((bh) this).finalize();
                            ((bh) this).field_c = 3;
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
                            ((bh) this).finalize();
                            ((bh) this).field_c = ((bh) this).field_c + 1;
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

    public static void b(byte param0) {
        if (param0 < 29) {
          bh.b(115);
          field_d = null;
          field_e = null;
          field_b = null;
          field_j = null;
          field_h = null;
          return;
        } else {
          field_d = null;
          field_e = null;
          field_b = null;
          field_j = null;
          field_h = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 3;
        field_e = new boolean[112];
        field_j = "Out of stock";
        field_b = "ACT II: ";
        field_f = false;
        field_h = "Confirm Email:";
    }
}
