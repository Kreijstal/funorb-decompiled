/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tca implements Runnable {
    static int field_f;
    static String field_b;
    private ht field_d;
    private lu field_h;
    private java.net.URL field_i;
    static sna field_c;
    private eh field_g;
    private DataInputStream field_l;
    static vr field_m;
    static String field_a;
    private eh field_j;
    private int field_e;
    private eh field_k;

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
                        var4 = BachelorFridge.field_y;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((tca) this).field_h.field_h.length <= ((tca) this).field_h.field_g) {
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
                            var1_int = ((tca) this).field_l.read(((tca) this).field_h.field_h, ((tca) this).field_h.field_g, -((tca) this).field_h.field_g + ((tca) this).field_h.field_h.length);
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
                            ((tca) this).field_h.field_g = ((tca) this).field_h.field_g + var1_int;
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
                            if (((tca) this).field_h.field_g != ((tca) this).field_h.field_h.length) {
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
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((tca) this).field_h.field_h.length + " " + ((tca) this).field_i);
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
                            ((tca) this).finalize();
                            ((tca) this).field_e = 3;
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
                            return;
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
                            ((tca) this).finalize();
                            ((tca) this).field_e = ((tca) this).field_e + 1;
                            // monitorexit var2_ref
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        return;
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
        if (!(((tca) this).field_j == null)) {
            if (((tca) this).field_j.field_e != null) {
                try {
                    ((DataInputStream) ((tca) this).field_j.field_e).close();
                } catch (Exception exception) {
                }
            }
            ((tca) this).field_j = null;
        }
        if (!(null == ((tca) this).field_g)) {
            if (!(((tca) this).field_g.field_e == null)) {
                try {
                    ((java.net.Socket) ((tca) this).field_g.field_e).close();
                } catch (Exception exception) {
                }
            }
            ((tca) this).field_g = null;
        }
        if (!(null == ((tca) this).field_l)) {
            try {
                ((tca) this).field_l.close();
            } catch (Exception exception) {
            }
            ((tca) this).field_l = null;
        }
        ((tca) this).field_k = null;
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
                    if (((tca) this).field_e < 2) {
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
                    if (((tca) this).field_e == 0) {
                        statePc = 4;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (((tca) this).field_j == null) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ((tca) this).field_j = ((tca) this).field_d.a(((tca) this).field_i, 97);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (((tca) this).field_j.field_f != 0) {
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
                    if (-2 == (((tca) this).field_j.field_f ^ -1)) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    ((tca) this).field_e = ((tca) this).field_e + 1;
                    ((tca) this).field_j = null;
                    return false;
                }
                case 11: {
                    if ((((tca) this).field_e ^ -1) != -2) {
                        statePc = 19;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (((tca) this).field_g != null) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    ((tca) this).field_g = ((tca) this).field_d.a((byte) 122, ((tca) this).field_i.getHost(), 443);
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (((tca) this).field_g.field_f != 0) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    return false;
                }
                case 16: {
                    if ((((tca) this).field_g.field_f ^ -1) != -2) {
                        statePc = 18;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 18: {
                    ((tca) this).field_e = ((tca) this).field_e + 1;
                    ((tca) this).field_g = null;
                    return false;
                }
                case 19: {
                    if (null != ((tca) this).field_l) {
                        statePc = 40;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    try {
                        if (-1 == ((tca) this).field_e) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        ((tca) this).field_l = (DataInputStream) ((tca) this).field_j.field_e;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (-2 == ((tca) this).field_e) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var4 = (java.net.Socket) ((tca) this).field_g.field_e;
                        var4.setSoTimeout(10000);
                        var3 = var4.getOutputStream();
                        var3.write(17);
                        var5 = (CharSequence) (Object) ("JAGGRAB " + ((tca) this).field_i.getFile() + "\n\n");
                        var3.write(bv.a(18019, var5));
                        ((tca) this).field_l = new DataInputStream(var4.getInputStream());
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        ((tca) this).field_h.field_g = 0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 27: {
                    if (((tca) this).field_k == null) {
                        statePc = 29;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 29: {
                    ((tca) this).field_k = ((tca) this).field_d.a((Runnable) this, 2, 5);
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if (param0 > 119) {
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
                    if (0 == ((tca) this).field_k.field_f) {
                        statePc = 34;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 34: {
                    return false;
                }
                case 35: {
                    if (-2 == (((tca) this).field_k.field_f ^ -1)) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    ((tca) this).finalize();
                    ((tca) this).field_e = ((tca) this).field_e + 1;
                    return false;
                }
                case 37: {
                    return false;
                }
                case 39: {
                    var2 = (IOException) (Object) caughtException;
                    ((tca) this).finalize();
                    ((tca) this).field_e = ((tca) this).field_e + 1;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (((tca) this).field_k == null) {
                        statePc = 42;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 42: {
                    ((tca) this).field_k = ((tca) this).field_d.a((Runnable) this, 2, 5);
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if (param0 > 119) {
                        statePc = 45;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    return true;
                }
                case 45: {
                    if (0 == ((tca) this).field_k.field_f) {
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
                    if (-2 != (((tca) this).field_k.field_f ^ -1)) {
                        statePc = 50;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 50: {
                    ((tca) this).finalize();
                    ((tca) this).field_e = ((tca) this).field_e + 1;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final lu a(int param0) {
        if (param0 == -11514) {
          if (((tca) this).field_e != 3) {
            return null;
          } else {
            return ((tca) this).field_h;
          }
        } else {
          tca.a((byte) 18);
          if (((tca) this).field_e != 3) {
            return null;
          } else {
            return ((tca) this).field_h;
          }
        }
    }

    public static void a(byte param0) {
        if (param0 != -84) {
            return;
        }
        field_b = null;
        field_a = null;
        field_c = null;
        field_m = null;
    }

    tca(ht param0, java.net.URL param1, int param2) {
        ((tca) this).field_i = param1;
        ((tca) this).field_d = param0;
        ((tca) this).field_h = new lu(param2);
    }

    final static void a(gea param0, int param1, int param2) {
        int var4 = 0;
        pf var5 = null;
        var5 = sja.field_fb;
        var5.c(param2, (byte) 102);
        var5.field_g = var5.field_g + 1;
        var4 = var5.field_g;
        var5.d(1, 0);
        var5.d(param0.field_i, 0);
        var5.c((byte) 110, param0.field_m);
        var5.e(param0.field_o, -1615464796);
        var5.e(param0.field_j, param1 + -1615464801);
        var5.e(param0.field_k, -1615464796);
        if (param1 != 5) {
          return;
        } else {
          var5.e(param0.field_h, -1615464796);
          int discarded$2 = var5.a(var4, 19);
          var5.b((byte) 124, -var4 + var5.field_g);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Day";
    }
}
