/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class we implements Runnable {
    private mi field_k;
    static bf[] field_i;
    static ka[] field_m;
    private mi field_g;
    private mi field_n;
    static ge[] field_o;
    static int field_f;
    static ka[][] field_e;
    private uj field_b;
    private java.net.URL field_h;
    static String[][] field_c;
    private uf field_d;
    private DataInputStream field_a;
    static int[] field_l;
    private int field_p;
    static int field_j;

    protected final void finalize() {
        if (((we) this).field_k != null) {
            if (null != ((we) this).field_k.field_g) {
                try {
                    ((DataInputStream) ((we) this).field_k.field_g).close();
                } catch (Exception exception) {
                }
            }
            ((we) this).field_k = null;
        }
        if (null != ((we) this).field_g) {
            if (!(null == ((we) this).field_g.field_g)) {
                try {
                    ((java.net.Socket) ((we) this).field_g.field_g).close();
                } catch (Exception exception) {
                }
            }
            ((we) this).field_g = null;
        }
        if (!(((we) this).field_a == null)) {
            try {
                ((we) this).field_a.close();
            } catch (Exception exception) {
            }
            ((we) this).field_a = null;
        }
        ((we) this).field_n = null;
    }

    final static e a(nc param0, int param1) {
        e var2 = null;
        var2 = new e(param0, (da) (Object) param0);
        tj.field_e.a((da) (Object) var2, param1 + -6300);
        if (param1 != 6222) {
          boolean discarded$2 = we.b(false);
          mj.field_a.a((qd) (Object) param0);
          return var2;
        } else {
          mj.field_a.a((qd) (Object) param0);
          return var2;
        }
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
                    if ((((we) this).field_p ^ -1) > -3) {
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
                    if (0 != ((we) this).field_p) {
                        statePc = 11;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (null == ((we) this).field_k) {
                        statePc = 5;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 5: {
                    ((we) this).field_k = ((we) this).field_b.a(((we) this).field_h, -125);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (-1 == ((we) this).field_k.field_d) {
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
                    if (-2 == ((we) this).field_k.field_d) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    ((we) this).field_k = null;
                    ((we) this).field_p = ((we) this).field_p + 1;
                    return false;
                }
                case 11: {
                    if (((we) this).field_p == 1) {
                        statePc = 13;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (((we) this).field_g != null) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    ((we) this).field_g = ((we) this).field_b.a(443, ((we) this).field_h.getHost(), 431890200);
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (0 == ((we) this).field_g.field_d) {
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
                    if (-2 == (((we) this).field_g.field_d ^ -1)) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    ((we) this).field_p = ((we) this).field_p + 1;
                    ((we) this).field_g = null;
                    return false;
                }
                case 20: {
                    if (null != ((we) this).field_a) {
                        statePc = 40;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    try {
                        if (((we) this).field_p == 0) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        ((we) this).field_a = (DataInputStream) ((we) this).field_k.field_g;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (-2 == (((we) this).field_p ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var4 = (java.net.Socket) ((we) this).field_g.field_g;
                        var4.setSoTimeout(10000);
                        var3 = var4.getOutputStream();
                        var3.write(17);
                        var5 = (CharSequence) (Object) ("JAGGRAB " + ((we) this).field_h.getFile() + "\n\n");
                        var3.write(pi.a(var5, 353));
                        ((we) this).field_a = new DataInputStream(var4.getInputStream());
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        ((we) this).field_d.field_q = 0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 28: {
                    if (null == ((we) this).field_n) {
                        statePc = 30;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 30: {
                    ((we) this).field_n = ((we) this).field_b.a((Runnable) this, true, 5);
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (((we) this).field_n.field_d != 0) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    return false;
                }
                case 33: {
                    if (((we) this).field_n.field_d == 1) {
                        statePc = 35;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    ((we) this).finalize();
                    ((we) this).field_p = ((we) this).field_p + 1;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (!param0) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    return false;
                }
                case 37: {
                    return true;
                }
                case 39: {
                    var2 = (IOException) (Object) caughtException;
                    ((we) this).finalize();
                    ((we) this).field_p = ((we) this).field_p + 1;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (null == ((we) this).field_n) {
                        statePc = 42;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 42: {
                    ((we) this).field_n = ((we) this).field_b.a((Runnable) this, true, 5);
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if (((we) this).field_n.field_d != 0) {
                        statePc = 45;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    return false;
                }
                case 45: {
                    if (((we) this).field_n.field_d == 1) {
                        statePc = 50;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    ((we) this).finalize();
                    ((we) this).field_p = ((we) this).field_p + 1;
                    if (!param0) {
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
                    return true;
                }
                case 50: {
                    if (!param0) {
                        statePc = 52;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    return false;
                }
                case 52: {
                    return true;
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
                        var4 = TorChallenge.field_F ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((we) this).field_d.field_q >= ((we) this).field_d.field_m.length) {
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
                            var1_int = ((we) this).field_a.read(((we) this).field_d.field_m, ((we) this).field_d.field_q, -((we) this).field_d.field_q + ((we) this).field_d.field_m.length);
                            if (var1_int < 0) {
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
                            ((we) this).field_d.field_q = ((we) this).field_d.field_q + var1_int;
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
                            if (((we) this).field_d.field_q != ((we) this).field_d.field_m.length) {
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
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((we) this).field_d.field_m.length + " " + ((we) this).field_h);
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
                            ((we) this).finalize();
                            ((we) this).field_p = 3;
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
                            ((we) this).finalize();
                            ((we) this).field_p = ((we) this).field_p + 1;
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

    final static boolean b(boolean param0) {
        if (!param0) {
          if (TorChallenge.field_H != null) {
            if (TorChallenge.field_H.f((byte) 123) == null) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          boolean discarded$5 = we.b(false);
          if (TorChallenge.field_H != null) {
            if (TorChallenge.field_H.f((byte) 123) == null) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = -60 % ((-25 - param2) / 38);
        int var4 = 0;
        var4 = (-((param0 + 1) * param0) + param1 * (1 + param1)) / (2 * param0);
        return var4;
    }

    we(uj param0, java.net.URL param1, int param2) {
        ((we) this).field_h = param1;
        ((we) this).field_b = param0;
        ((we) this).field_d = new uf(param2);
    }

    final uf b(int param0) {
        if (!(3 != ((we) this).field_p)) {
            return ((we) this).field_d;
        }
        int var2 = -78 % ((param0 - 79) / 33);
        return null;
    }

    public static void a(int param0) {
        field_l = null;
        field_m = null;
        if (param0 != 25910) {
          boolean discarded$2 = we.b(true);
          field_e = null;
          field_i = null;
          field_c = null;
          field_o = null;
          return;
        } else {
          field_e = null;
          field_i = null;
          field_c = null;
          field_o = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new ka[6][2];
        field_l = new int[]{0, 1, 4, 1, 1, 1, 1, 1};
        field_f = 0;
        field_j = -1;
    }
}
