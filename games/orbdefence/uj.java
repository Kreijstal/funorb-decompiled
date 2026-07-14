/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uj implements Runnable {
    private be field_i;
    private eb field_h;
    private eb field_a;
    static qd field_b;
    private int field_d;
    private mg field_e;
    private eb field_f;
    private DataInputStream field_g;
    private java.net.URL field_c;

    final static void a(byte param0, mg param1) {
        fd.field_f = param1.j(98203176) << 71847173;
        int var2 = param1.b((byte) 90);
        fd.field_f = fd.field_f + (var2 >> -387603965);
        cc.field_l = (var2 & 7) << -325254638;
        cc.field_l = cc.field_l + (param1.j(98203176) << 1766675042);
        var2 = param1.b((byte) 90);
        oh.field_b = (var2 & 63) << 1895327631;
        cc.field_l = cc.field_l + (var2 >> -1518330426);
        oh.field_b = oh.field_b + (param1.b((byte) 90) << -1196840697);
        var2 = param1.b((byte) 90);
        oh.field_b = oh.field_b + (var2 >> 2014290945);
        h.field_E = (var2 & 1) << -1865083952;
        h.field_E = h.field_E + param1.j(param0 + 98203261);
        if (param0 != -85) {
            field_b = null;
        }
    }

    final static void c(byte param0) {
        lb.a(true);
        if (!(null == tf.field_f)) {
            hl.a(tf.field_f, 106);
        }
        fd.b(-82);
        km.b(-100);
        af.a(109);
        if (uj.a((byte) -36)) {
            uk.field_b.i(1, -53);
            bh.a(0, -1);
        }
        th.a(106);
        if (param0 != 63) {
            uj.c(33);
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
                        var4 = OrbDefence.field_D ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((uj) this).field_e.field_j.length <= ((uj) this).field_e.field_i) {
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
                            var1_int = ((uj) this).field_g.read(((uj) this).field_e.field_j, ((uj) this).field_e.field_i, ((uj) this).field_e.field_j.length + -((uj) this).field_e.field_i);
                            if (var1_int < 0) {
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
                            ((uj) this).field_e.field_i = ((uj) this).field_e.field_i + var1_int;
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
                            if (((uj) this).field_e.field_j.length == ((uj) this).field_e.field_i) {
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
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((uj) this).field_e.field_j.length + " " + ((uj) this).field_c);
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
                            ((uj) this).finalize();
                            ((uj) this).field_d = 3;
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
                            statePc = 18;
                            continue stateLoop;
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
                            ((uj) this).finalize();
                            ((uj) this).field_d = ((uj) this).field_d + 1;
                            // monitorexit var2_ref
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 16;
                            continue stateLoop;
                        }
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
                    case 18: {
                        return;
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

    final static java.applet.Applet b(byte param0) {
        if (param0 != -120) {
            java.applet.Applet discarded$0 = uj.b((byte) 89);
        }
        if (!(mj.field_j == null)) {
            return mj.field_j;
        }
        return (java.applet.Applet) (Object) aj.field_b;
    }

    final static boolean a(int[] param0, int param1) {
        int var2 = 0;
        long var3 = 0L;
        hc var5_ref_hc = null;
        int var5 = 0;
        int var6_int = 0;
        hc var6 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = OrbDefence.field_D ? 1 : 0;
        if (da.field_r != dh.field_bb) {
          return false;
        } else {
          L0: {
            var2 = 28 / ((param1 - 65) / 36);
            var3 = ji.b(125);
            if (0 == hf.field_i) {
              break L0;
            } else {
              if ((vb.field_i ^ -1) <= -1) {
                break L0;
              } else {
                var5_ref_hc = (hc) (Object) t.field_q.b((byte) 121);
                if (var5_ref_hc == null) {
                  break L0;
                } else {
                  if ((var5_ref_hc.field_h ^ -1L) <= (var3 ^ -1L)) {
                    break L0;
                  } else {
                    var5_ref_hc.b(57);
                    tf.field_c = var5_ref_hc.field_m.length;
                    cd.field_t.field_i = 0;
                    var6_int = 0;
                    L1: while (true) {
                      if (var6_int >= tf.field_c) {
                        lh.field_c = fe.field_b;
                        fe.field_b = ce.field_d;
                        ce.field_d = ab.field_l;
                        ab.field_l = var5_ref_hc.field_g;
                        return true;
                      } else {
                        cd.field_t.field_j[var6_int] = var5_ref_hc.field_m[var6_int];
                        var6_int++;
                        continue L1;
                      }
                    }
                  }
                }
              }
            }
          }
          L2: while (true) {
            L3: {
              if (-1 < (vb.field_i ^ -1)) {
                cd.field_t.field_i = 0;
                if (va.a(true, 1)) {
                  vb.field_i = cd.field_t.o(-75);
                  cd.field_t.field_i = 0;
                  tf.field_c = param0[vb.field_i];
                  break L3;
                } else {
                  return false;
                }
              } else {
                break L3;
              }
            }
            if (ce.a(-106)) {
              if (hf.field_i == 0) {
                lh.field_c = fe.field_b;
                fe.field_b = ce.field_d;
                ce.field_d = ab.field_l;
                ab.field_l = vb.field_i;
                vb.field_i = -1;
                return true;
              } else {
                L4: {
                  var5 = hf.field_i;
                  if (tk.field_q != 0.0) {
                    var5 = (int)((double)var5 + tl.field_f.nextGaussian() * tk.field_q);
                    if (-1 < (var5 ^ -1)) {
                      var5 = 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                var6 = new hc(var3 + (long)var5, vb.field_i, new byte[tf.field_c]);
                var7 = 0;
                L5: while (true) {
                  if (var7 >= tf.field_c) {
                    t.field_q.a(-97, (ca) (Object) var6);
                    vb.field_i = -1;
                    continue L2;
                  } else {
                    var6.field_m[var7] = cd.field_t.field_j[var7];
                    var7++;
                    continue L5;
                  }
                }
              }
            } else {
              return false;
            }
          }
        }
    }

    final mg a(int param0) {
        if (!(-4 != (((uj) this).field_d ^ -1))) {
            return ((uj) this).field_e;
        }
        if (param0 == 5) {
            return null;
        }
        return null;
    }

    public static void c(int param0) {
        field_b = null;
        if (param0 != 0) {
            uj.c(113);
        }
    }

    private final static boolean a(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -36) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (p.field_d == null) {
              break L2;
            } else {
              if (!dh.field_bb.a((byte) 74)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    protected final void finalize() {
        if (!(null == ((uj) this).field_a)) {
            if (!(((uj) this).field_a.field_g == null)) {
                try {
                    ((DataInputStream) ((uj) this).field_a.field_g).close();
                } catch (Exception exception) {
                }
            }
            ((uj) this).field_a = null;
        }
        if (!(null == ((uj) this).field_f)) {
            if (!(((uj) this).field_f.field_g == null)) {
                try {
                    ((java.net.Socket) ((uj) this).field_f.field_g).close();
                } catch (Exception exception) {
                }
            }
            ((uj) this).field_f = null;
        }
        if (null != ((uj) this).field_g) {
            try {
                ((uj) this).field_g.close();
            } catch (Exception exception) {
            }
            ((uj) this).field_g = null;
        }
        ((uj) this).field_h = null;
    }

    final synchronized boolean b(int param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        Throwable decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (-3 >= (((uj) this).field_d ^ -1)) {
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
                    if (param0 < -2) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    ((uj) this).field_a = null;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (0 != ((uj) this).field_d) {
                        statePc = 14;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (((uj) this).field_a == null) {
                        statePc = 8;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ((uj) this).field_a = ((uj) this).field_i.a(((uj) this).field_c, (byte) -49);
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (((uj) this).field_a.field_a != 0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    return false;
                }
                case 11: {
                    if (((uj) this).field_a.field_a != -2) {
                        statePc = 13;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 13: {
                    ((uj) this).field_a = null;
                    ((uj) this).field_d = ((uj) this).field_d + 1;
                    return false;
                }
                case 14: {
                    if (-2 != ((uj) this).field_d) {
                        statePc = 23;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (null != ((uj) this).field_f) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    ((uj) this).field_f = ((uj) this).field_i.a(443, 0, ((uj) this).field_c.getHost());
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (-1 == (((uj) this).field_f.field_a ^ -1)) {
                        statePc = 19;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 19: {
                    return false;
                }
                case 20: {
                    if (((uj) this).field_f.field_a != 1) {
                        statePc = 22;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 22: {
                    ((uj) this).field_f = null;
                    ((uj) this).field_d = ((uj) this).field_d + 1;
                    return false;
                }
                case 23: {
                    if (null != ((uj) this).field_g) {
                        statePc = 33;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    try {
                        if (((uj) this).field_d == 0) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        ((uj) this).field_g = (DataInputStream) ((uj) this).field_a.field_g;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (((uj) this).field_d == 1) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var4 = (java.net.Socket) ((uj) this).field_f.field_g;
                        var4.setSoTimeout(10000);
                        var3 = var4.getOutputStream();
                        var3.write(17);
                        var5 = (CharSequence) (Object) ("JAGGRAB " + ((uj) this).field_c.getFile() + "\n\n");
                        var3.write(oc.a(true, var5));
                        ((uj) this).field_g = new DataInputStream(var4.getInputStream());
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        ((uj) this).field_e.field_i = 0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 32: {
                    var2 = (IOException) (Object) caughtException;
                    ((uj) this).finalize();
                    ((uj) this).field_d = ((uj) this).field_d + 1;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    if (null == ((uj) this).field_h) {
                        statePc = 35;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 35: {
                    ((uj) this).field_h = ((uj) this).field_i.a(314572800, 5, (Runnable) this);
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    if (((uj) this).field_h.field_a != 0) {
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
                    if (1 == ((uj) this).field_h.field_a) {
                        statePc = 40;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    ((uj) this).finalize();
                    ((uj) this).field_d = ((uj) this).field_d + 1;
                    return false;
                }
                case 40: {
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    uj(be param0, java.net.URL param1, int param2) {
        ((uj) this).field_i = param0;
        ((uj) this).field_c = param1;
        ((uj) this).field_e = new mg(param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new qd();
    }
}
