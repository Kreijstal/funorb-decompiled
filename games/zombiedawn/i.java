/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class i extends pn implements hh {
    static jp field_W;
    static String field_U;
    static vn field_T;
    static float field_V;
    static boolean[] field_X;
    private an field_Z;
    static boolean field_Y;

    private final void b(boolean param0) {
        if (!((i) this).field_H) {
            return;
        }
        if (!param0) {
            field_T = null;
            ((i) this).field_H = false;
            return;
        }
        ((i) this).field_H = false;
    }

    final static void a(bo param0, byte param1, int param2) {
        mp.field_g.a(0, (le) (Object) param0);
        ag.a(param2, true, param0);
        if (param1 != 7) {
            field_V = -1.3851797580718994f;
        }
    }

    private final an a(byte param0, sk param1, String param2) {
        an var4 = null;
        int var5 = 0;
        var4 = new an(param2, param1);
        var4.field_h = (io) (Object) new vm();
        if (param0 != 53) {
          return null;
        } else {
          var5 = -6 + ((i) this).field_n;
          ((i) this).field_n = ((i) this).field_n + 38;
          var4.a(param0 ^ -109, var5, 15, ((i) this).field_i + -14 - 16, 30);
          ((i) this).a((ga) (Object) var4, 10);
          ((i) this).a(true);
          return var4;
        }
    }

    public final void a(int param0, int param1, an param2, int param3, int param4) {
        if (!(((i) this).field_Z != param2)) {
            this.b(true);
        }
        if (param1 != -6) {
            field_X = null;
            return;
        }
    }

    i(dn param0, sm param1) {
        super(param0, 200, 150);
        String var3 = null;
        String var5 = null;
        ga var6 = null;
        String var7 = null;
        ga var8 = null;
        String var9 = null;
        ga var10 = null;
        ga var11 = null;
        var3 = null;
        if (param1 != kb.field_f) {
          if (gf.field_b != param1) {
            L0: {
              if (rc.field_h != param1) {
                break L0;
              } else {
                var3 = hc.field_c;
                ((i) this).field_n = ((i) this).field_n + 30;
                break L0;
              }
            }
            var11 = new ga(var3, (sk) null);
            var11.field_k = 0;
            var11.field_i = ((i) this).field_i;
            var11.field_n = 80;
            var11.field_j = 50;
            var11.field_h = (io) (Object) new vf(ii.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
            ((i) this).a(var11, 10);
            ((i) this).field_Z = this.a((byte) 53, (sk) this, re.field_c);
          } else {
            var7 = d.field_a;
            var3 = var7;
            var3 = var7;
            ((i) this).field_n = ((i) this).field_n + 10;
            if (lm.f((byte) 126)) {
              ((i) this).field_n = ((i) this).field_n + 20;
              var9 = il.field_a;
              var3 = var9;
              var3 = var9;
              var10 = new ga(var9, (sk) null);
              var10.field_k = 0;
              var10.field_i = ((i) this).field_i;
              var10.field_n = 80;
              var10.field_j = 50;
              var10.field_h = (io) (Object) new vf(ii.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((i) this).a(var10, 10);
              ((i) this).field_Z = this.a((byte) 53, (sk) this, re.field_c);
            } else {
              var8 = new ga(var7, (sk) null);
              var8.field_k = 0;
              var8.field_i = ((i) this).field_i;
              var8.field_n = 80;
              var8.field_j = 50;
              var8.field_h = (io) (Object) new vf(ii.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((i) this).a(var8, 10);
              ((i) this).field_Z = this.a((byte) 53, (sk) this, re.field_c);
            }
          }
        } else {
          var5 = lo.field_n;
          var6 = new ga(var5, (sk) null);
          var6.field_k = 0;
          var6.field_i = ((i) this).field_i;
          var6.field_n = 80;
          var6.field_j = 50;
          var6.field_h = (io) (Object) new vf(ii.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
          ((i) this).a(var6, 10);
          ((i) this).field_Z = this.a((byte) 53, (sk) this, re.field_c);
        }
    }

    final static boolean a(boolean param0, boolean param1) {
        try {
            IOException var2 = null;
            am var4 = null;
            am var5 = null;
            int stackIn_12_0 = 0;
            int stackOut_10_0 = 0;
            int stackOut_11_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (ao.field_F != null) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        ao.field_F = jm.field_B.a(2, tm.field_o, ci.field_c);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (ao.field_F.field_f == 0) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return false;
                    }
                    case 5: {
                        hm.field_N = pd.a(-22826);
                        pi.field_i = pd.a(-22826);
                        if (param1) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        field_X = null;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        if (1 == ao.field_F.field_f) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        ic.field_T = jc.field_l;
                        ao.field_F = null;
                        return true;
                    }
                    case 9: {
                        try {
                            sn.field_c = new gm((java.net.Socket) ao.field_F.field_d, jm.field_B);
                            var4 = fj.field_g;
                            var5 = var4;
                            dp.field_e.field_j = 0;
                            if (!param0) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            stackOut_10_0 = -2;
                            stackIn_12_0 = stackOut_10_0;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = -1;
                            stackIn_12_0 = stackOut_11_0;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            em.field_U = stackIn_12_0;
                            wb.field_t = stackIn_12_0;
                            e.field_P = stackIn_12_0;
                            ic.field_T = ui.field_g;
                            var5.field_j = 0;
                            uj.a(le.field_g, ba.field_b, (byte) -114, (de) (Object) dp.field_e, kg.field_k);
                            vl.a((byte) -46, -1);
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        ao.field_F = null;
                        return true;
                    }
                    case 14: {
                        var2 = (IOException) (Object) caughtException;
                        ic.field_T = jc.field_l;
                        ao.field_F = null;
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

    public static void m(int param0) {
        if (param0 != 10) {
          i.m(34);
          field_X = null;
          field_W = null;
          field_U = null;
          field_T = null;
          return;
        } else {
          field_X = null;
          field_W = null;
          field_U = null;
          field_T = null;
          return;
        }
    }

    final static void a(int param0, boolean param1, byte param2, wj param3) {
        Object var4 = null;
        Throwable var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (null != nc.field_p) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    pj.a(param3, (byte) 113, param0, 1048576, param1);
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (param2 <= -110) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    i.m(11);
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (uh.field_o == null) {
                        statePc = 16;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var4 = (Object) (Object) sh.field_d;
                    // monitorenter sh.field_d
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    try {
                        uh.field_o.a(param0, true, -1);
                        if (te.field_kb != param3) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        // monitorexit var4
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return;
                }
                case 10: {
                    try {
                        uh.field_o.c(28013);
                        sh.field_d.d();
                        te.field_kb = param3;
                        if (te.field_kb == null) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        uh.field_o.a((byte) -22, te.field_kb, param1);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        // monitorexit var4
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return;
                }
                case 14: {
                    try {
                        var5 = caughtException;
                        // monitorexit var4
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 15: {
                    throw (RuntimeException) (Object) var5;
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_T = null;
        field_X = new boolean[64];
        field_W = new jp(1);
        field_Y = true;
    }
}
