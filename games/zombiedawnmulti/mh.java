/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mh implements Runnable {
    private k field_g;
    private di field_b;
    private DataInputStream field_f;
    private int field_k;
    private di field_e;
    private go field_j;
    static th field_l;
    private di field_d;
    static jh field_c;
    static cj field_i;
    private java.net.URL field_a;
    static int field_h;

    protected final void finalize() {
        if (!(null == ((mh) this).field_e)) {
            if (!(((mh) this).field_e.field_d == null)) {
                try {
                    ((DataInputStream) ((mh) this).field_e.field_d).close();
                } catch (Exception exception) {
                }
            }
            ((mh) this).field_e = null;
        }
        if (!(((mh) this).field_b == null)) {
            if (((mh) this).field_b.field_d != null) {
                try {
                    ((java.net.Socket) ((mh) this).field_b.field_d).close();
                } catch (Exception exception) {
                }
            }
            ((mh) this).field_b = null;
        }
        if (!(null == ((mh) this).field_f)) {
            try {
                ((mh) this).field_f.close();
            } catch (Exception exception) {
            }
            ((mh) this).field_f = null;
        }
        ((mh) this).field_d = null;
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
                    if (((mh) this).field_k <= -3) {
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
                    if (-1 == ((mh) this).field_k) {
                        statePc = 5;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (((mh) this).field_e != null) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ((mh) this).field_e = ((mh) this).field_j.a((byte) -12, ((mh) this).field_a);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (0 != ((mh) this).field_e.field_f) {
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
                    if (((mh) this).field_e.field_f == -2) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    ((mh) this).field_e = null;
                    ((mh) this).field_k = ((mh) this).field_k + 1;
                    return false;
                }
                case 11: {
                    if (-2 == ((mh) this).field_k) {
                        statePc = 13;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (((mh) this).field_b != null) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    ((mh) this).field_b = ((mh) this).field_j.a(((mh) this).field_a.getHost(), 443, (byte) -120);
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (((mh) this).field_b.field_f == -1) {
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
                    if (-2 == ((mh) this).field_b.field_f) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    ((mh) this).field_k = ((mh) this).field_k + 1;
                    ((mh) this).field_b = null;
                    return false;
                }
                case 20: {
                    if (param0 < -87) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    ((mh) this).field_f = null;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (null == ((mh) this).field_f) {
                        statePc = 32;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (null == ((mh) this).field_d) {
                        statePc = 25;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 25: {
                    ((mh) this).field_d = ((mh) this).field_j.a(117, (Runnable) this, 5);
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if (0 != ((mh) this).field_d.field_f) {
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
                    if (1 == ((mh) this).field_d.field_f) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    ((mh) this).finalize();
                    ((mh) this).field_k = ((mh) this).field_k + 1;
                    return false;
                }
                case 30: {
                    return false;
                }
                case 32: {
                    try {
                        if (-1 == ((mh) this).field_k) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        ((mh) this).field_f = (DataInputStream) ((mh) this).field_e.field_d;
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
                        if (-2 == ((mh) this).field_k) {
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
                        var4 = (java.net.Socket) ((mh) this).field_b.field_d;
                        var4.setSoTimeout(10000);
                        var3 = var4.getOutputStream();
                        var3.write(17);
                        var5 = (CharSequence) (Object) ("JAGGRAB " + ((mh) this).field_a.getFile() + "\n\n");
                        var3.write(qo.a(var5, (byte) -116));
                        ((mh) this).field_f = new DataInputStream(var4.getInputStream());
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
                        ((mh) this).field_g.field_j = 0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 39: {
                    if (null == ((mh) this).field_d) {
                        statePc = 41;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 41: {
                    ((mh) this).field_d = ((mh) this).field_j.a(117, (Runnable) this, 5);
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if (0 == ((mh) this).field_d.field_f) {
                        statePc = 47;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (1 != ((mh) this).field_d.field_f) {
                        statePc = 45;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 45: {
                    ((mh) this).finalize();
                    ((mh) this).field_k = ((mh) this).field_k + 1;
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
                    ((mh) this).finalize();
                    ((mh) this).field_k = ((mh) this).field_k + 1;
                    if (null == ((mh) this).field_d) {
                        statePc = 51;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 51: {
                    ((mh) this).field_d = ((mh) this).field_j.a(117, (Runnable) this, 5);
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if (0 == ((mh) this).field_d.field_f) {
                        statePc = 57;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (1 != ((mh) this).field_d.field_f) {
                        statePc = 55;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 55: {
                    ((mh) this).finalize();
                    ((mh) this).field_k = ((mh) this).field_k + 1;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    return false;
                }
                case 57: {
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
                        var4 = ZombieDawnMulti.field_E ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((mh) this).field_g.field_j >= ((mh) this).field_g.field_m.length) {
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
                            var1_int = ((mh) this).field_f.read(((mh) this).field_g.field_m, ((mh) this).field_g.field_j, ((mh) this).field_g.field_m.length + -((mh) this).field_g.field_j);
                            if ((var1_int ^ -1) <= -1) {
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
                            ((mh) this).field_g.field_j = ((mh) this).field_g.field_j + var1_int;
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
                            if (((mh) this).field_g.field_j != ((mh) this).field_g.field_m.length) {
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
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((mh) this).field_g.field_m.length + " " + ((mh) this).field_a);
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
                            ((mh) this).finalize();
                            ((mh) this).field_k = 3;
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
                            ((mh) this).finalize();
                            ((mh) this).field_k = ((mh) this).field_k + 1;
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

    final static void c(int param0) {
        vl var1 = null;
        ga var2 = null;
        if (param0 != 0) {
            field_l = null;
            var1 = (vl) (Object) lf.field_e.c(param0 + 69);
            if (!(var1 != null)) {
                ak.a((byte) -112);
                return;
            }
            var2 = s.field_e;
            int discarded$0 = var2.i(-1478490344);
            int discarded$1 = var2.i(-1478490344);
            int discarded$2 = var2.i(-1478490344);
            int discarded$3 = var2.i(-1478490344);
            var1.a(true);
            return;
        }
        var1 = (vl) (Object) lf.field_e.c(param0 + 69);
        if (!(var1 != null)) {
            ak.a((byte) -112);
            return;
        }
        var2 = s.field_e;
        int discarded$4 = var2.i(-1478490344);
        int discarded$5 = var2.i(-1478490344);
        int discarded$6 = var2.i(-1478490344);
        int discarded$7 = var2.i(-1478490344);
        var1.a(true);
    }

    final k a(byte param0) {
        if (param0 == 21) {
          if (3 != ((mh) this).field_k) {
            return null;
          } else {
            return ((mh) this).field_g;
          }
        } else {
          field_i = null;
          if (3 != ((mh) this).field_k) {
            return null;
          } else {
            return ((mh) this).field_g;
          }
        }
    }

    public static void a(int param0) {
        field_l = null;
        if (param0 != 17) {
            mh.c(29);
            field_c = null;
            field_i = null;
            return;
        }
        field_c = null;
        field_i = null;
    }

    mh(go param0, java.net.URL param1, int param2) {
        ((mh) this).field_a = param1;
        ((mh) this).field_j = param0;
        ((mh) this).field_g = new k(param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new th();
    }
}
