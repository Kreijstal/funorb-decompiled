/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ad implements Runnable {
    private ql field_h;
    private DataInputStream field_k;
    private java.net.URL field_a;
    private wq field_f;
    private int field_c;
    private tg field_g;
    static jp field_b;
    static um field_e;
    private ql field_d;
    static int field_j;
    private ql field_i;
    static mh field_l;

    protected final void finalize() {
        if (((ad) this).field_d != null) {
            if (!(null == ((ad) this).field_d.field_e)) {
                try {
                    ((DataInputStream) ((ad) this).field_d.field_e).close();
                } catch (Exception exception) {
                }
            }
            ((ad) this).field_d = null;
        }
        if (!(((ad) this).field_i == null)) {
            if (((ad) this).field_i.field_e != null) {
                try {
                    ((java.net.Socket) ((ad) this).field_i.field_e).close();
                } catch (Exception exception) {
                }
            }
            ((ad) this).field_i = null;
        }
        if (!(null == ((ad) this).field_k)) {
            try {
                ((ad) this).field_k.close();
            } catch (Exception exception) {
            }
            ((ad) this).field_k = null;
        }
        ((ad) this).field_h = null;
    }

    final static boolean a(boolean param0, int param1) {
        try {
            IOException var2 = null;
            pi var4 = null;
            pi var5 = null;
            int stackIn_11_0 = 0;
            int stackOut_9_0;
            int stackOut_10_0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (param1 == 10000) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        ad.b(46);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (null != qm.field_d) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        qm.field_d = lh.field_s.a(tq.field_h, (byte) 120, dl.field_b);
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        if (-1 != qm.field_d.field_f) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        return false;
                    }
                    case 6: {
                        cl.field_q = ue.a(false);
                        oj.field_t = ue.a(false);
                        if (-2 == qm.field_d.field_f) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        rf.field_b = mc.field_e;
                        qm.field_d = null;
                        return true;
                    }
                    case 8: {
                        try {
                            eq.field_g = new wh((java.net.Socket) qm.field_d.field_e, lh.field_s);
                            k.field_h.field_l = 0;
                            var4 = jl.field_e;
                            var5 = var4;
                            if (!param0) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            stackOut_9_0 = -2;
                            stackIn_11_0 = stackOut_9_0;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            stackOut_10_0 = -1;
                            stackIn_11_0 = stackOut_10_0;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            r.field_z = stackIn_11_0;
                            we.field_a = stackIn_11_0;
                            mh.field_gb = stackIn_11_0;
                            rf.field_b = pi.field_u;
                            var5.field_l = 0;
                            c.a(ko.field_e, 12, pe.field_r, fe.field_ob, (wq) (Object) k.field_h);
                            cr.a(-1, 10000);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        qm.field_d = null;
                        return true;
                    }
                    case 13: {
                        var2 = (IOException) (Object) caughtException;
                        rf.field_b = mc.field_e;
                        qm.field_d = null;
                        return true;
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
                        var4 = BrickABrac.field_J ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((ad) this).field_f.field_k.length <= ((ad) this).field_f.field_l) {
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
                            var1_int = ((ad) this).field_k.read(((ad) this).field_f.field_k, ((ad) this).field_f.field_l, -((ad) this).field_f.field_l + ((ad) this).field_f.field_k.length);
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
                            ((ad) this).field_f.field_l = ((ad) this).field_f.field_l + var1_int;
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
                            if (((ad) this).field_f.field_l != ((ad) this).field_f.field_k.length) {
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
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((ad) this).field_f.field_k.length + " " + ((ad) this).field_a);
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
                            ((ad) this).finalize();
                            ((ad) this).field_c = 3;
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
                            ((ad) this).finalize();
                            ((ad) this).field_c = ((ad) this).field_c + 1;
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
                    if (((ad) this).field_c >= 2) {
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
                    if (((ad) this).field_c != 0) {
                        statePc = 11;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (null != ((ad) this).field_d) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    ((ad) this).field_d = ((ad) this).field_g.a((byte) 73, ((ad) this).field_a);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (((ad) this).field_d.field_f != 0) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return false;
                }
                case 8: {
                    if (((ad) this).field_d.field_f != -2) {
                        statePc = 10;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 10: {
                    ((ad) this).field_d = null;
                    ((ad) this).field_c = ((ad) this).field_c + 1;
                    return false;
                }
                case 11: {
                    if (-2 != ((ad) this).field_c) {
                        statePc = 20;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (null == ((ad) this).field_i) {
                        statePc = 14;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 14: {
                    ((ad) this).field_i = ((ad) this).field_g.a(((ad) this).field_a.getHost(), (byte) 120, 443);
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (0 != ((ad) this).field_i.field_f) {
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
                    if (((ad) this).field_i.field_f != 1) {
                        statePc = 19;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 19: {
                    ((ad) this).field_c = ((ad) this).field_c + 1;
                    ((ad) this).field_i = null;
                    return false;
                }
                case 20: {
                    if (null != ((ad) this).field_k) {
                        statePc = 37;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    try {
                        if (((ad) this).field_c != 0) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        ((ad) this).field_k = (DataInputStream) ((ad) this).field_d.field_e;
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
                        if (((ad) this).field_c == 1) {
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
                        var4 = (java.net.Socket) ((ad) this).field_i.field_e;
                        var4.setSoTimeout(10000);
                        var3 = var4.getOutputStream();
                        var3.write(17);
                        var5 = (CharSequence) (Object) ("JAGGRAB " + ((ad) this).field_a.getFile() + "\n\n");
                        var3.write(uj.a(var5, false));
                        ((ad) this).field_k = new DataInputStream(var4.getInputStream());
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
                        ((ad) this).field_f.field_l = 0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 27: {
                    if (null == ((ad) this).field_h) {
                        statePc = 29;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 29: {
                    ((ad) this).field_h = ((ad) this).field_g.a(5, (Runnable) this, (byte) -72);
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if (((ad) this).field_h.field_f != 0) {
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
                    if (((ad) this).field_h.field_f == param0) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    ((ad) this).finalize();
                    ((ad) this).field_c = ((ad) this).field_c + 1;
                    return false;
                }
                case 34: {
                    return false;
                }
                case 36: {
                    var2 = (IOException) (Object) caughtException;
                    ((ad) this).finalize();
                    ((ad) this).field_c = ((ad) this).field_c + 1;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (null == ((ad) this).field_h) {
                        statePc = 39;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 39: {
                    ((ad) this).field_h = ((ad) this).field_g.a(5, (Runnable) this, (byte) -72);
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (((ad) this).field_h.field_f == 0) {
                        statePc = 45;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (((ad) this).field_h.field_f != param0) {
                        statePc = 43;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 43: {
                    ((ad) this).finalize();
                    ((ad) this).field_c = ((ad) this).field_c + 1;
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

    public static void b(int param0) {
        field_e = null;
        field_l = null;
        field_b = null;
        if (param0 != -16637) {
            boolean discarded$0 = ad.a(true, 13);
        }
    }

    final wq a(byte param0) {
        if (param0 >= 95) {
          if ((((ad) this).field_c ^ -1) != -4) {
            return null;
          } else {
            return ((ad) this).field_f;
          }
        } else {
          boolean discarded$6 = ((ad) this).a(-111);
          if ((((ad) this).field_c ^ -1) != -4) {
            return null;
          } else {
            return ((ad) this).field_f;
          }
        }
    }

    ad(tg param0, java.net.URL param1, int param2) {
        ((ad) this).field_g = param0;
        ((ad) this).field_a = param1;
        ((ad) this).field_f = new wq(param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = -1;
    }
}
