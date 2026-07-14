/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class caa implements Runnable {
    private naa field_d;
    private naa field_c;
    private DataInputStream field_a;
    private uia field_h;
    private int field_f;
    static int field_i;
    private naa field_e;
    private java.net.URL field_b;
    private fia field_g;

    final static void a(ff param0, la param1, int param2) {
        if (param2 <= 90) {
            caa.a(-49, -51, -30, 34, 111, -46);
            if (vpa.a(54)) {
                return;
            }
            if (param0.k(-25319)) {
                return;
            }
            if (!(0 <= param1.q((byte) -82))) {
                return;
            }
            ql.field_k.k(97, -2988);
            ql.field_k.f(-1477662136, param1.q((byte) -82));
            ql.field_k.f(-1477662136, param1.a((byte) 107));
            return;
        }
        if (vpa.a(54)) {
            return;
        }
        if (param0.k(-25319)) {
            return;
        }
        if (!(0 <= param1.q((byte) -82))) {
            return;
        }
        ql.field_k.k(97, -2988);
        ql.field_k.f(-1477662136, param1.q((byte) -82));
        ql.field_k.f(-1477662136, param1.a((byte) 107));
    }

    final synchronized boolean a(boolean param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (-3 < (((caa) this).field_f ^ -1)) {
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
                    if (((caa) this).field_f != 0) {
                        statePc = 10;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (((caa) this).field_c != null) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    ((caa) this).field_c = ((caa) this).field_g.a(((caa) this).field_b, 74);
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (((caa) this).field_c.field_b == 0) {
                        statePc = 7;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return false;
                }
                case 8: {
                    if (((caa) this).field_c.field_b == -2) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    ((caa) this).field_c = null;
                    ((caa) this).field_f = ((caa) this).field_f + 1;
                    return false;
                }
                case 10: {
                    if (-2 == ((caa) this).field_f) {
                        statePc = 12;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (null == ((caa) this).field_e) {
                        statePc = 14;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 14: {
                    ((caa) this).field_e = ((caa) this).field_g.a(-24818, ((caa) this).field_b.getHost(), 443);
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (((caa) this).field_e.field_b == 0) {
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
                    if (((caa) this).field_e.field_b != 1) {
                        statePc = 20;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 20: {
                    ((caa) this).field_f = ((caa) this).field_f + 1;
                    ((caa) this).field_e = null;
                    return false;
                }
                case 21: {
                    if (((caa) this).field_a == null) {
                        statePc = 34;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (null == ((caa) this).field_d) {
                        statePc = 24;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 24: {
                    ((caa) this).field_d = ((caa) this).field_g.a((Runnable) this, 425, 5);
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (!param0) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    ((caa) this).field_a = null;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (((caa) this).field_d.field_b == 0) {
                        statePc = 29;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 29: {
                    return false;
                }
                case 30: {
                    if (-2 == (((caa) this).field_d.field_b ^ -1)) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    ((caa) this).finalize();
                    ((caa) this).field_f = ((caa) this).field_f + 1;
                    return false;
                }
                case 32: {
                    return false;
                }
                case 34: {
                    try {
                        if (0 == ((caa) this).field_f) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        ((caa) this).field_a = (DataInputStream) ((caa) this).field_c.field_f;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (1 != ((caa) this).field_f) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var4 = (java.net.Socket) ((caa) this).field_e.field_f;
                        var4.setSoTimeout(10000);
                        var3 = var4.getOutputStream();
                        var3.write(17);
                        var5 = (CharSequence) (Object) ("JAGGRAB " + ((caa) this).field_b.getFile() + "\n\n");
                        var3.write(us.a(var5, param0));
                        ((caa) this).field_a = new DataInputStream(var4.getInputStream());
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        ((caa) this).field_h.field_h = 0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 40: {
                    if (null == ((caa) this).field_d) {
                        statePc = 42;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 42: {
                    ((caa) this).field_d = ((caa) this).field_g.a((Runnable) this, 425, 5);
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if (!param0) {
                        statePc = 45;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    ((caa) this).field_a = null;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (((caa) this).field_d.field_b == 0) {
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
                    if (-2 != (((caa) this).field_d.field_b ^ -1)) {
                        statePc = 50;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 50: {
                    ((caa) this).finalize();
                    ((caa) this).field_f = ((caa) this).field_f + 1;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    return false;
                }
                case 52: {
                    var2 = (IOException) (Object) caughtException;
                    ((caa) this).finalize();
                    ((caa) this).field_f = ((caa) this).field_f + 1;
                    if (null == ((caa) this).field_d) {
                        statePc = 54;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 54: {
                    ((caa) this).field_d = ((caa) this).field_g.a((Runnable) this, 425, 5);
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    if (!param0) {
                        statePc = 63;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    ((caa) this).field_a = null;
                    if (((caa) this).field_d.field_b == 0) {
                        statePc = 58;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 58: {
                    return false;
                }
                case 59: {
                    if (-2 != (((caa) this).field_d.field_b ^ -1)) {
                        statePc = 61;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 61: {
                    ((caa) this).finalize();
                    ((caa) this).field_f = ((caa) this).field_f + 1;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    return false;
                }
                case 63: {
                    if (((caa) this).field_d.field_b == 0) {
                        statePc = 65;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 65: {
                    return false;
                }
                case 66: {
                    if (-2 != (((caa) this).field_d.field_b ^ -1)) {
                        statePc = 68;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 68: {
                    ((caa) this).finalize();
                    ((caa) this).field_f = ((caa) this).field_f + 1;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0) {
        bh.field_p = true;
        bja.a(pl.a((byte) 64), (byte) 126, 3);
        int var1 = 72 / ((param0 - 55) / 46);
        rba.field_a.e((byte) 106);
    }

    protected final void finalize() {
        if (null != ((caa) this).field_c) {
            if (!(((caa) this).field_c.field_f == null)) {
                try {
                    ((DataInputStream) ((caa) this).field_c.field_f).close();
                } catch (Exception exception) {
                }
            }
            ((caa) this).field_c = null;
        }
        if (((caa) this).field_e != null) {
            if (!(null == ((caa) this).field_e.field_f)) {
                try {
                    ((java.net.Socket) ((caa) this).field_e.field_f).close();
                } catch (Exception exception) {
                }
            }
            ((caa) this).field_e = null;
        }
        if (!(((caa) this).field_a == null)) {
            try {
                ((caa) this).field_a.close();
            } catch (Exception exception) {
            }
            ((caa) this).field_a = null;
        }
        ((caa) this).field_d = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        if (param5 != 0) {
          field_i = 59;
          var6 = param3;
          L0: while (true) {
            if (param4 < var6) {
              return;
            } else {
              nra.a((byte) -55, param0, param1, vaa.field_a[var6], param2);
              var6++;
              continue L0;
            }
          }
        } else {
          var6 = param3;
          L1: while (true) {
            if (param4 < var6) {
              return;
            } else {
              nra.a((byte) -55, param0, param1, vaa.field_a[var6], param2);
              var6++;
              continue L1;
            }
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
                        var4 = TombRacer.field_G ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((caa) this).field_h.field_g.length <= ((caa) this).field_h.field_h) {
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
                            var1_int = ((caa) this).field_a.read(((caa) this).field_h.field_g, ((caa) this).field_h.field_h, -((caa) this).field_h.field_h + ((caa) this).field_h.field_g.length);
                            if ((var1_int ^ -1) <= -1) {
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
                            ((caa) this).field_h.field_h = ((caa) this).field_h.field_h + var1_int;
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
                            if (((caa) this).field_h.field_g.length == ((caa) this).field_h.field_h) {
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
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((caa) this).field_h.field_g.length + " " + ((caa) this).field_b);
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
                            ((caa) this).finalize();
                            ((caa) this).field_f = 3;
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
                            ((caa) this).finalize();
                            ((caa) this).field_f = ((caa) this).field_f + 1;
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

    final uia b(byte param0) {
        if (param0 >= -115) {
            uia discarded$9 = ((caa) this).b((byte) 71);
            if (!(((caa) this).field_f != 3)) {
                return ((caa) this).field_h;
            }
            return null;
        }
        if (!(((caa) this).field_f != 3)) {
            return ((caa) this).field_h;
        }
        return null;
    }

    caa(fia param0, java.net.URL param1, int param2) {
        ((caa) this).field_b = param1;
        ((caa) this).field_g = param0;
        ((caa) this).field_h = new uia(param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 2;
    }
}
