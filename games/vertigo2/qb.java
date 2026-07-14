/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qb implements Runnable {
    private java.net.URL field_g;
    private DataInputStream field_k;
    static sd field_d;
    private wk field_c;
    private jj field_i;
    private wk field_h;
    private int field_e;
    private ed field_j;
    static int[] field_b;
    private wk field_a;
    static lg[] field_f;

    final static boolean a(CharSequence param0, int param1) {
        int var2 = -68 % ((param1 - 30) / 50);
        return tn.a(10, true, param0, -128);
    }

    final static int a(int param0, int param1, boolean param2, int param3) {
        if (param3 != 10000) {
            Object var5 = null;
            boolean discarded$0 = qb.a((CharSequence) null, -15);
            return pk.a(1);
        }
        return pk.a(1);
    }

    protected final void finalize() {
        if (null != ((qb) this).field_a) {
            if (((qb) this).field_a.field_d != null) {
                try {
                    ((DataInputStream) ((qb) this).field_a.field_d).close();
                } catch (Exception exception) {
                }
            }
            ((qb) this).field_a = null;
        }
        if (null != ((qb) this).field_h) {
            if (!(((qb) this).field_h.field_d == null)) {
                try {
                    ((java.net.Socket) ((qb) this).field_h.field_d).close();
                } catch (Exception exception) {
                }
            }
            ((qb) this).field_h = null;
        }
        if (null != ((qb) this).field_k) {
            try {
                ((qb) this).field_k.close();
            } catch (Exception exception) {
            }
            ((qb) this).field_k = null;
        }
        ((qb) this).field_c = null;
    }

    final ed a(int param0) {
        if ((((qb) this).field_e ^ -1) != param0) {
            return null;
        }
        return ((qb) this).field_j;
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
                    if (((qb) this).field_e < 2) {
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
                    if ((((qb) this).field_e ^ -1) == param0) {
                        statePc = 4;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (((qb) this).field_a == null) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ((qb) this).field_a = ((qb) this).field_i.a(-90, ((qb) this).field_g);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (((qb) this).field_a.field_b != 0) {
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
                    if ((((qb) this).field_a.field_b ^ -1) == -2) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    ((qb) this).field_a = null;
                    ((qb) this).field_e = ((qb) this).field_e + 1;
                    return false;
                }
                case 11: {
                    if ((((qb) this).field_e ^ -1) != -2) {
                        statePc = 19;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (null != ((qb) this).field_h) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    ((qb) this).field_h = ((qb) this).field_i.a(-82, 443, ((qb) this).field_g.getHost());
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (-1 != (((qb) this).field_h.field_b ^ -1)) {
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
                    if ((((qb) this).field_h.field_b ^ -1) != -2) {
                        statePc = 18;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 18: {
                    ((qb) this).field_e = ((qb) this).field_e + 1;
                    ((qb) this).field_h = null;
                    return false;
                }
                case 19: {
                    if (null != ((qb) this).field_k) {
                        statePc = 37;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    try {
                        if (((qb) this).field_e == 0) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        ((qb) this).field_k = (DataInputStream) ((qb) this).field_a.field_d;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (1 == ((qb) this).field_e) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var4 = (java.net.Socket) ((qb) this).field_h.field_d;
                        var4.setSoTimeout(10000);
                        var3 = var4.getOutputStream();
                        var3.write(17);
                        var5 = (CharSequence) (Object) ("JAGGRAB " + ((qb) this).field_g.getFile() + "\n\n");
                        var3.write(bo.a(var5, -711));
                        ((qb) this).field_k = new DataInputStream(var4.getInputStream());
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
                        ((qb) this).field_j.field_u = 0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 27: {
                    if (null == ((qb) this).field_c) {
                        statePc = 29;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 29: {
                    ((qb) this).field_c = ((qb) this).field_i.a(5, (Runnable) this, param0 ^ -1);
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if (0 != ((qb) this).field_c.field_b) {
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
                    if ((((qb) this).field_c.field_b ^ -1) == -2) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    ((qb) this).finalize();
                    ((qb) this).field_e = ((qb) this).field_e + 1;
                    return false;
                }
                case 34: {
                    return false;
                }
                case 36: {
                    var2 = (IOException) (Object) caughtException;
                    ((qb) this).finalize();
                    ((qb) this).field_e = ((qb) this).field_e + 1;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (null == ((qb) this).field_c) {
                        statePc = 39;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 39: {
                    ((qb) this).field_c = ((qb) this).field_i.a(5, (Runnable) this, param0 ^ -1);
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (0 == ((qb) this).field_c.field_b) {
                        statePc = 45;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if ((((qb) this).field_c.field_b ^ -1) != -2) {
                        statePc = 43;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 43: {
                    ((qb) this).finalize();
                    ((qb) this).field_e = ((qb) this).field_e + 1;
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

    public static void a(byte param0) {
        field_b = null;
        if (param0 != -3) {
          int discarded$2 = qb.a(73, 2, true, 112);
          field_d = null;
          field_f = null;
          return;
        } else {
          field_d = null;
          field_f = null;
          return;
        }
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Vertigo2.field_L ? 1 : 0;
        fj.a(cq.field_i, 811497217, param0, q.field_x, ug.field_b, 0, true);
        if (param1 != 2) {
          field_f = null;
          var2 = 0;
          L0: while (true) {
            if (cq.field_i <= var2) {
              L1: {
                fj.a(cq.field_i + param0, 811497217, param0 - -param0, f.field_y, id.field_d, param0, false);
                if (cq.field_i > param0) {
                  cq.field_i = param0;
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            } else {
              ac.field_I[var2 - -param0] = var2;
              var2++;
              continue L0;
            }
          }
        } else {
          var2 = 0;
          L2: while (true) {
            if (cq.field_i <= var2) {
              L3: {
                fj.a(cq.field_i + param0, 811497217, param0 - -param0, f.field_y, id.field_d, param0, false);
                if (cq.field_i > param0) {
                  cq.field_i = param0;
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            } else {
              ac.field_I[var2 - -param0] = var2;
              var2++;
              continue L2;
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
                        var4 = Vertigo2.field_L ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((qb) this).field_j.field_p.length <= ((qb) this).field_j.field_u) {
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
                            var1_int = ((qb) this).field_k.read(((qb) this).field_j.field_p, ((qb) this).field_j.field_u, ((qb) this).field_j.field_p.length - ((qb) this).field_j.field_u);
                            if (0 <= var1_int) {
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
                            ((qb) this).field_j.field_u = ((qb) this).field_j.field_u + var1_int;
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
                            if (((qb) this).field_j.field_u == ((qb) this).field_j.field_p.length) {
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
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((qb) this).field_j.field_p.length + " " + ((qb) this).field_g);
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
                            ((qb) this).finalize();
                            ((qb) this).field_e = 3;
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
                            ((qb) this).finalize();
                            ((qb) this).field_e = ((qb) this).field_e + 1;
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

    qb(jj param0, java.net.URL param1, int param2) {
        ((qb) this).field_i = param0;
        ((qb) this).field_g = param1;
        ((qb) this).field_j = new ed(param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new lg[2];
    }
}
