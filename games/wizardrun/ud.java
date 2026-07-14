/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ud implements Runnable {
    private jh field_h;
    private int field_g;
    private java.net.URL field_d;
    static sd field_c;
    private DataInputStream field_f;
    private vh field_k;
    private jh field_j;
    private jh field_e;
    static String field_a;
    static va field_b;
    private va field_i;

    final va b(int param0) {
        if ((((ud) this).field_g ^ -1) != param0) {
            return null;
        }
        return ((ud) this).field_i;
    }

    final static void a(byte param0, boolean param1, java.awt.Canvas param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = wizardrun.field_H;
        if (param0 > 35) {
          if (ri.field_a >= 10) {
            if (w.a((byte) -117)) {
              if (-1 != (ml.field_t ^ -1)) {
                uc.a(false, param2);
                return;
              } else {
                uk.a((byte) -123, param1, false);
                fc.a((byte) 80, 0, param2, 0);
                return;
              }
            } else {
              ed.d();
              dg.a(320, 240, (byte) -97);
              fc.a((byte) 80, 0, param2, 0);
              return;
            }
          } else {
            L0: {
              var3 = 0;
              if (!pk.field_o) {
                break L0;
              } else {
                pk.field_o = false;
                var3 = 1;
                break L0;
              }
            }
            ug.a(10487, var3 != 0, dl.a(true), wj.g(17325), sa.field_e);
            return;
          }
        } else {
          ud.a(-40, -128);
          if (ri.field_a >= 10) {
            if (w.a((byte) -117)) {
              if (-1 != (ml.field_t ^ -1)) {
                uc.a(false, param2);
                return;
              } else {
                uk.a((byte) -123, param1, false);
                fc.a((byte) 80, 0, param2, 0);
                return;
              }
            } else {
              ed.d();
              dg.a(320, 240, (byte) -97);
              fc.a((byte) 80, 0, param2, 0);
              return;
            }
          } else {
            L1: {
              var3 = 0;
              if (!pk.field_o) {
                break L1;
              } else {
                pk.field_o = false;
                var3 = 1;
                break L1;
              }
            }
            ug.a(10487, var3 != 0, dl.a(true), wj.g(17325), sa.field_e);
            return;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 != 240) {
            Object var2 = null;
            ud.a((byte) -25, true, (java.awt.Canvas) null);
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
                        var4 = wizardrun.field_H;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((ud) this).field_i.field_m >= ((ud) this).field_i.field_k.length) {
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
                            var1_int = ((ud) this).field_f.read(((ud) this).field_i.field_k, ((ud) this).field_i.field_m, ((ud) this).field_i.field_k.length - ((ud) this).field_i.field_m);
                            if (0 > var1_int) {
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
                            ((ud) this).field_i.field_m = ((ud) this).field_i.field_m + var1_int;
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
                            if (((ud) this).field_i.field_m != ((ud) this).field_i.field_k.length) {
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
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((ud) this).field_i.field_k.length + " " + ((ud) this).field_d);
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
                            ((ud) this).finalize();
                            ((ud) this).field_g = 3;
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
                            ((ud) this).finalize();
                            ((ud) this).field_g = ((ud) this).field_g + 1;
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

    final static void a(int param0, int param1) {
        int var4 = wizardrun.field_H;
        dc var5 = (dc) (Object) v.field_d.b((byte) 111);
        while (var5 != null) {
            de.a(-14149, param0, var5);
            var5 = (dc) (Object) v.field_d.d(8192);
        }
        int var3 = 105 % ((param1 - -34) / 40);
        sc var6 = (sc) (Object) tg.field_c.b((byte) 118);
        while (var6 != null) {
            ld.a(param0, var6, 0);
            var6 = (sc) (Object) tg.field_c.d(8192);
        }
    }

    protected final void finalize() {
        if (!(((ud) this).field_h == null)) {
            if (!(((ud) this).field_h.field_e == null)) {
                try {
                    ((DataInputStream) ((ud) this).field_h.field_e).close();
                } catch (Exception exception) {
                }
            }
            ((ud) this).field_h = null;
        }
        if (null != ((ud) this).field_j) {
            if (null != ((ud) this).field_j.field_e) {
                try {
                    ((java.net.Socket) ((ud) this).field_j.field_e).close();
                } catch (Exception exception) {
                }
            }
            ((ud) this).field_j = null;
        }
        if (null != ((ud) this).field_f) {
            try {
                ((ud) this).field_f.close();
            } catch (Exception exception) {
            }
            ((ud) this).field_f = null;
        }
        ((ud) this).field_e = null;
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
                    if (((ud) this).field_g >= 2) {
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
                    if (-1 != ((ud) this).field_g) {
                        statePc = 11;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (((ud) this).field_h != null) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    ((ud) this).field_h = ((ud) this).field_k.a(((ud) this).field_d, 127);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (-1 == ((ud) this).field_h.field_a) {
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
                    if (((ud) this).field_h.field_a == 1) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    ((ud) this).field_h = null;
                    ((ud) this).field_g = ((ud) this).field_g + 1;
                    return false;
                }
                case 11: {
                    if (1 == ((ud) this).field_g) {
                        statePc = 13;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (null != ((ud) this).field_j) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    ((ud) this).field_j = ((ud) this).field_k.a(((ud) this).field_d.getHost(), 443, (byte) -20);
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (((ud) this).field_j.field_a == -1) {
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
                    if (-2 == ((ud) this).field_j.field_a) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    ((ud) this).field_g = ((ud) this).field_g + 1;
                    ((ud) this).field_j = null;
                    return false;
                }
                case 20: {
                    if (((ud) this).field_f == null) {
                        statePc = 32;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (((ud) this).field_e == null) {
                        statePc = 23;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 23: {
                    ((ud) this).field_e = ((ud) this).field_k.a((byte) -82, (Runnable) this, 5);
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (0 != ((ud) this).field_e.field_a) {
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
                    if (param0 > 71) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    ud.a(-20);
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if (((ud) this).field_e.field_a == 1) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    ((ud) this).finalize();
                    ((ud) this).field_g = ((ud) this).field_g + 1;
                    return false;
                }
                case 30: {
                    return false;
                }
                case 32: {
                    try {
                        if (((ud) this).field_g == 0) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        ((ud) this).field_f = (DataInputStream) ((ud) this).field_h.field_e;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (((ud) this).field_g != 1) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var4 = (java.net.Socket) ((ud) this).field_j.field_e;
                        var4.setSoTimeout(10000);
                        var3 = var4.getOutputStream();
                        var3.write(17);
                        var5 = (CharSequence) (Object) ("JAGGRAB " + ((ud) this).field_d.getFile() + "\n\n");
                        var3.write(wh.a((byte) -111, var5));
                        ((ud) this).field_f = new DataInputStream(var4.getInputStream());
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        ((ud) this).field_i.field_m = 0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 38: {
                    if (((ud) this).field_e == null) {
                        statePc = 40;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 40: {
                    ((ud) this).field_e = ((ud) this).field_k.a((byte) -82, (Runnable) this, 5);
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    if (0 == ((ud) this).field_e.field_a) {
                        statePc = 48;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (param0 > 71) {
                        statePc = 44;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    ud.a(-20);
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    if (((ud) this).field_e.field_a != 1) {
                        statePc = 46;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 46: {
                    ((ud) this).finalize();
                    ((ud) this).field_g = ((ud) this).field_g + 1;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    return false;
                }
                case 48: {
                    return false;
                }
                case 50: {
                    var2 = (IOException) (Object) caughtException;
                    ((ud) this).finalize();
                    ((ud) this).field_g = ((ud) this).field_g + 1;
                    if (((ud) this).field_e == null) {
                        statePc = 52;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 52: {
                    ((ud) this).field_e = ((ud) this).field_k.a((byte) -82, (Runnable) this, 5);
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    if (0 != ((ud) this).field_e.field_a) {
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
                    if (param0 <= 71) {
                        statePc = 60;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    if (((ud) this).field_e.field_a != 1) {
                        statePc = 58;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 58: {
                    ((ud) this).finalize();
                    ((ud) this).field_g = ((ud) this).field_g + 1;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    return false;
                }
                case 60: {
                    ud.a(-20);
                    if (((ud) this).field_e.field_a != 1) {
                        statePc = 62;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 62: {
                    ((ud) this).finalize();
                    ((ud) this).field_g = ((ud) this).field_g + 1;
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(o param0, boolean param1) {
        if (param1) {
            return;
        }
        ph.d(-31782);
        ed.a(param0.field_B, param0.field_x, param0.field_s);
    }

    ud(vh param0, java.net.URL param1, int param2) {
        ((ud) this).field_d = param1;
        ((ud) this).field_k = param0;
        ((ud) this).field_i = new va(param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new sd(2);
        field_a = "Return to game";
    }
}
