/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jh {
    static boolean field_d;
    static String field_f;
    static hh field_h;
    static hl field_a;
    static int[][] field_c;
    private uh field_i;
    static eh field_b;
    private uh field_g;
    static String field_e;

    public static void b(int param0) {
        field_e = null;
        field_b = null;
        field_f = null;
        if (param0 < 9) {
          jh.a(107, false);
          field_a = null;
          field_c = null;
          field_h = null;
          return;
        } else {
          field_a = null;
          field_c = null;
          field_h = null;
          return;
        }
    }

    final static void a(int param0, boolean param1) {
        pf.field_c = le.field_b[param0];
        lb.field_L = fa.field_A[param0];
        if (!param1) {
            return;
        }
        b.field_e = qa.field_d[param0];
    }

    final void a(int param0, uh param1) {
        if (param0 != 22197) {
          L0: {
            int discarded$1 = ((jh) this).b((byte) 89);
            if (null != param1.field_f) {
              param1.a(-6242);
              break L0;
            } else {
              break L0;
            }
          }
          param1.field_m = ((jh) this).field_i;
          param1.field_f = ((jh) this).field_i.field_f;
          param1.field_f.field_m = param1;
          param1.field_m.field_f = param1;
          return;
        } else {
          L1: {
            if (null != param1.field_f) {
              param1.a(-6242);
              break L1;
            } else {
              break L1;
            }
          }
          param1.field_m = ((jh) this).field_i;
          param1.field_f = ((jh) this).field_i.field_f;
          param1.field_f.field_m = param1;
          param1.field_m.field_f = param1;
          return;
        }
    }

    final static boolean a(byte param0, boolean param1) {
        try {
            IOException var2 = null;
            ia var4 = null;
            ia var5 = null;
            int stackIn_11_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_10_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null != ah.field_e) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        ah.field_e = og.field_a.a(sj.field_I, -115, kl.field_a);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (0 == ah.field_e.field_b) {
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
                        if (param0 == -68) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        field_e = null;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        ca.field_Y = dd.b(71);
                        ik.field_p = dd.b(71);
                        if (ah.field_e.field_b != 1) {
                            statePc = 14;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        try {
                            m.field_b = new sb((java.net.Socket) ah.field_e.field_f, og.field_a);
                            d.field_b.field_g = 0;
                            var4 = se.field_p;
                            var5 = var4;
                            if (!param1) {
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
                            wc.field_i = stackIn_11_0;
                            hh.field_a = stackIn_11_0;
                            bh.field_d = stackIn_11_0;
                            var5.field_g = 0;
                            r.field_c = ua.field_b;
                            oe.a(r.field_d, 32, (rb) (Object) d.field_b, bf.field_s, jg.field_A);
                            nf.a(-1, (byte) 95);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        ah.field_e = null;
                        return true;
                    }
                    case 13: {
                        var2 = (IOException) (Object) caughtException;
                        r.field_c = rb.field_h;
                        ah.field_e = null;
                        return true;
                    }
                    case 14: {
                        r.field_c = rb.field_h;
                        ah.field_e = null;
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

    final int b(byte param0) {
        int var2 = 0;
        uh var3 = null;
        var2 = 0;
        var3 = ((jh) this).field_i.field_m;
        L0: while (true) {
          if (((jh) this).field_i == var3) {
            if (param0 < 109) {
              return -57;
            } else {
              return var2;
            }
          } else {
            var3 = var3.field_m;
            var2++;
            continue L0;
          }
        }
    }

    final uh a(byte param0) {
        uh var2 = null;
        if (param0 >= 119) {
          var2 = ((jh) this).field_i.field_m;
          if (((jh) this).field_i == var2) {
            ((jh) this).field_g = null;
            return null;
          } else {
            ((jh) this).field_g = var2.field_m;
            return var2;
          }
        } else {
          field_c = null;
          var2 = ((jh) this).field_i.field_m;
          if (((jh) this).field_i == var2) {
            ((jh) this).field_g = null;
            return null;
          } else {
            ((jh) this).field_g = var2.field_m;
            return var2;
          }
        }
    }

    final uh a(int param0) {
        uh var2 = null;
        if (param0 < -10) {
          var2 = ((jh) this).field_g;
          if (((jh) this).field_i == var2) {
            ((jh) this).field_g = null;
            return null;
          } else {
            ((jh) this).field_g = var2.field_m;
            return var2;
          }
        } else {
          int discarded$2 = ((jh) this).b((byte) -41);
          var2 = ((jh) this).field_g;
          if (((jh) this).field_i == var2) {
            ((jh) this).field_g = null;
            return null;
          } else {
            ((jh) this).field_g = var2.field_m;
            return var2;
          }
        }
    }

    final uh c(int param0) {
        uh var2 = null;
        var2 = ((jh) this).field_i.field_m;
        if (param0 == 8) {
          if (var2 == ((jh) this).field_i) {
            return null;
          } else {
            var2.a(-6242);
            return var2;
          }
        } else {
          uh discarded$7 = ((jh) this).c(-118);
          if (var2 == ((jh) this).field_i) {
            return null;
          } else {
            var2.a(-6242);
            return var2;
          }
        }
    }

    public jh() {
        ((jh) this).field_i = new uh();
        ((jh) this).field_i.field_f = ((jh) this).field_i;
        ((jh) this).field_i.field_m = ((jh) this).field_i;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "(Including <%0>)";
        field_c = new int[8][];
        field_h = null;
        field_e = "You are not currently logged in to the<nbsp>game.";
    }
}
