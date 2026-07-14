/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class li implements Runnable {
    private op field_j;
    private op field_b;
    private ec field_g;
    static v field_i;
    private DataInputStream field_e;
    static String field_f;
    private de field_a;
    private java.net.URL field_d;
    private op field_k;
    static v[] field_h;
    private int field_c;

    public static void b(int param0) {
        int var1 = 121 / ((30 - param0) / 34);
        field_i = null;
        field_f = null;
        field_h = null;
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
                    if (((li) this).field_c < 2) {
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
                    if (0 == ((li) this).field_c) {
                        statePc = 4;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (null == ((li) this).field_b) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ((li) this).field_b = ((li) this).field_g.a(7645, ((li) this).field_d);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (0 != ((li) this).field_b.field_f) {
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
                    if (((li) this).field_b.field_f != 1) {
                        statePc = 11;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 11: {
                    ((li) this).field_b = null;
                    ((li) this).field_c = ((li) this).field_c + 1;
                    return false;
                }
                case 12: {
                    if (-2 != (((li) this).field_c ^ -1)) {
                        statePc = 21;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (null == ((li) this).field_k) {
                        statePc = 15;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 15: {
                    ((li) this).field_k = ((li) this).field_g.a(2, ((li) this).field_d.getHost(), 443);
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (((li) this).field_k.field_f == -1) {
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
                    if (-2 == ((li) this).field_k.field_f) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    ((li) this).field_k = null;
                    ((li) this).field_c = ((li) this).field_c + 1;
                    return false;
                }
                case 21: {
                    if (null != ((li) this).field_e) {
                        statePc = 41;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    try {
                        if (((li) this).field_c == 0) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        ((li) this).field_e = (DataInputStream) ((li) this).field_b.field_d;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if ((((li) this).field_c ^ -1) == -2) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var4 = (java.net.Socket) ((li) this).field_k.field_d;
                        var4.setSoTimeout(10000);
                        var3 = var4.getOutputStream();
                        var3.write(17);
                        var5 = (CharSequence) (Object) ("JAGGRAB " + ((li) this).field_d.getFile() + "\n\n");
                        var3.write(pd.a((byte) 67, var5));
                        ((li) this).field_e = new DataInputStream(var4.getInputStream());
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        ((li) this).field_a.field_j = 0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 29: {
                    if (param0 > 53) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    ((li) this).field_g = null;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (null != ((li) this).field_j) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    ((li) this).field_j = ((li) this).field_g.a(5, (Runnable) this, true);
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    if (((li) this).field_j.field_f == 0) {
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
                    if (((li) this).field_j.field_f != 1) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    return false;
                }
                case 38: {
                    ((li) this).finalize();
                    ((li) this).field_c = ((li) this).field_c + 1;
                    return false;
                }
                case 40: {
                    var2 = (IOException) (Object) caughtException;
                    ((li) this).finalize();
                    ((li) this).field_c = ((li) this).field_c + 1;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    if (param0 > 53) {
                        statePc = 57;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    ((li) this).field_g = null;
                    if (null == ((li) this).field_j) {
                        statePc = 50;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (((li) this).field_j.field_f == 0) {
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
                    if (((li) this).field_j.field_f != 1) {
                        statePc = 48;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    return false;
                }
                case 48: {
                    ((li) this).finalize();
                    ((li) this).field_c = ((li) this).field_c + 1;
                    return false;
                }
                case 50: {
                    ((li) this).field_j = ((li) this).field_g.a(5, (Runnable) this, true);
                    if (((li) this).field_j.field_f == 0) {
                        statePc = 52;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 52: {
                    return false;
                }
                case 53: {
                    if (((li) this).field_j.field_f == 1) {
                        statePc = 55;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    ((li) this).finalize();
                    ((li) this).field_c = ((li) this).field_c + 1;
                    return false;
                }
                case 55: {
                    return false;
                }
                case 57: {
                    if (null != ((li) this).field_j) {
                        statePc = 65;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    ((li) this).field_j = ((li) this).field_g.a(5, (Runnable) this, true);
                    if (((li) this).field_j.field_f == 0) {
                        statePc = 60;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 60: {
                    return false;
                }
                case 61: {
                    if (((li) this).field_j.field_f != 1) {
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
                    ((li) this).finalize();
                    ((li) this).field_c = ((li) this).field_c + 1;
                    return false;
                }
                case 65: {
                    if (((li) this).field_j.field_f == 0) {
                        statePc = 67;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 67: {
                    return false;
                }
                case 68: {
                    if (((li) this).field_j.field_f != 1) {
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
                    ((li) this).finalize();
                    ((li) this).field_c = ((li) this).field_c + 1;
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, wk param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_16_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        var10 = ZombieDawn.field_J;
        if (-2 == (sh.field_e ^ -1)) {
          if (og.field_A) {
            L0: {
              var2 = param1.a(ne.field_c.a(true), (byte) -92);
              var3 = param1.a(ne.field_c.f(param0 ^ -237220996), 0);
              var4 = fb.a(1311979239, (int)(3L * tp.field_p << -962049851)) >> 41074287;
              stackOut_10_0 = -8;
              stackIn_12_0 = stackOut_10_0;
              stackIn_11_0 = stackOut_10_0;
              if ((var4 ^ -1) > -1) {
                stackOut_12_0 = stackIn_12_0;
                stackOut_12_1 = var2;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                break L0;
              } else {
                stackOut_11_0 = stackIn_11_0;
                stackOut_11_1 = var2 - var4;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                break L0;
              }
            }
            L1: {
              var5 = stackIn_13_0 + stackIn_13_1;
              if (var4 >= 0) {
                stackOut_15_0 = var2;
                stackIn_16_0 = stackOut_15_0;
                break L1;
              } else {
                stackOut_14_0 = -var4 + var2;
                stackIn_16_0 = stackOut_14_0;
                break L1;
              }
            }
            var6 = stackIn_16_0 + 8;
            bi.a(var5, -1 + var3, -var5 + var6, 3, 0, 128);
            var7 = 0;
            L2: while (true) {
              if (-101 >= (var7 ^ -1)) {
                if (param0 != -18996) {
                  field_h = null;
                  return;
                } else {
                  return;
                }
              } else {
                if (0 < pl.field_t[var7].field_H) {
                  var8 = param1.a(pl.field_t[var7].a(true), (byte) -108) - -4;
                  var9 = 4 + param1.a(pl.field_t[var7].f(237239984), 0);
                  bi.a(var8, var9, 0);
                  var7++;
                  continue L2;
                } else {
                  var7++;
                  var7++;
                  continue L2;
                }
              }
            }
          } else {
            if (param0 == -18996) {
              return;
            } else {
              field_h = null;
              return;
            }
          }
        } else {
          if (param0 == -18996) {
            return;
          } else {
            field_h = null;
            return;
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
                        var4 = ZombieDawn.field_J;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((li) this).field_a.field_j >= ((li) this).field_a.field_h.length) {
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
                            var1_int = ((li) this).field_e.read(((li) this).field_a.field_h, ((li) this).field_a.field_j, -((li) this).field_a.field_j + ((li) this).field_a.field_h.length);
                            if (var1_int >= 0) {
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
                            ((li) this).field_a.field_j = ((li) this).field_a.field_j + var1_int;
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
                            if (((li) this).field_a.field_j == ((li) this).field_a.field_h.length) {
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
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((li) this).field_a.field_h.length + " " + ((li) this).field_d);
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
                            ((li) this).finalize();
                            ((li) this).field_c = 3;
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
                            ((li) this).finalize();
                            ((li) this).field_c = ((li) this).field_c + 1;
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

    final static void a(boolean param0) {
        bi.a(vh.field_b, id.field_M - -84, 640, 335, 0, 128);
        hk.field_H.b(vh.field_b, id.field_M + 84);
        if (param0) {
            field_h = null;
        }
    }

    li(ec param0, java.net.URL param1, int param2) {
        ((li) this).field_d = param1;
        ((li) this).field_g = param0;
        ((li) this).field_a = new de(param2);
    }

    final de a(byte param0) {
        if (param0 != -118) {
            return null;
        }
        if (!((((li) this).field_c ^ -1) != -4)) {
            return ((li) this).field_a;
        }
        return null;
    }

    protected final void finalize() {
        if (!(((li) this).field_b == null)) {
            if (!(null == ((li) this).field_b.field_d)) {
                try {
                    ((DataInputStream) ((li) this).field_b.field_d).close();
                } catch (Exception exception) {
                }
            }
            ((li) this).field_b = null;
        }
        if (!(null == ((li) this).field_k)) {
            if (((li) this).field_k.field_d != null) {
                try {
                    ((java.net.Socket) ((li) this).field_k.field_d).close();
                } catch (Exception exception) {
                }
            }
            ((li) this).field_k = null;
        }
        if (null != ((li) this).field_e) {
            try {
                ((li) this).field_e.close();
            } catch (Exception exception) {
            }
            ((li) this).field_e = null;
        }
        ((li) this).field_j = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "<%0>/<%1>";
    }
}
