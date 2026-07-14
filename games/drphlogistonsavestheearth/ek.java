/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ek extends gi {
    int field_j;
    int field_k;
    static int field_h;
    static String field_q;
    static he[] field_l;
    static he[] field_t;
    int field_o;
    static he field_m;
    int field_r;
    static int field_n;
    int field_u;
    int field_s;
    static String field_p;
    int[] field_i;

    final static void a(int param0, boolean param1, int param2) {
        if (param0 <= -40) {
          ue.field_b = 0;
          r.field_d = param2;
          if (-1 < r.field_d) {
            if (0 == r.field_d) {
              sc.a(-1, true, ad.field_q);
              if (r.field_d == 11) {
                qk.field_c = false;
                return;
              } else {
                return;
              }
            } else {
              if (1 == (r.field_d ^ -1)) {
                sc.a(-1, true, ad.field_q);
                if (r.field_d == 11) {
                  qk.field_c = false;
                  return;
                } else {
                  return;
                }
              } else {
                if (r.field_d != 11) {
                  return;
                } else {
                  qk.field_c = false;
                  return;
                }
              }
            }
          } else {
            th.field_a[r.field_d].a(param1, (byte) 89);
            if (0 == r.field_d) {
              sc.a(-1, true, ad.field_q);
              if (r.field_d != 11) {
                return;
              } else {
                qk.field_c = false;
                return;
              }
            } else {
              if (1 == r.field_d) {
                sc.a(-1, true, ad.field_q);
                if (r.field_d != 11) {
                  return;
                } else {
                  qk.field_c = false;
                  return;
                }
              } else {
                if (r.field_d != 11) {
                  return;
                } else {
                  qk.field_c = false;
                  return;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final static boolean a(boolean param0, boolean param1) {
        try {
            IOException var2 = null;
            lh var4 = null;
            lh var5 = null;
            int stackIn_10_0 = 0;
            int stackOut_8_0 = 0;
            int stackOut_9_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null == de.field_q) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        de.field_q = pi.field_I.a(ml.field_n, ei.field_o, 105);
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        if (-1 == (de.field_q.field_b ^ -1)) {
                            statePc = 5;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        return false;
                    }
                    case 6: {
                        ck.field_e = la.a(false);
                        el.field_rb = la.a(false);
                        if ((de.field_q.field_b ^ -1) != -2) {
                            statePc = 19;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        try {
                            uj.field_j = new qe((java.net.Socket) de.field_q.field_g, pi.field_I);
                            var4 = dh.field_N;
                            var5 = var4;
                            nj.field_p.field_j = 0;
                            if (!param1) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            stackOut_8_0 = -2;
                            stackIn_10_0 = stackOut_8_0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            stackOut_9_0 = -1;
                            stackIn_10_0 = stackOut_9_0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            l.field_q = stackIn_10_0;
                            gg.field_l = stackIn_10_0;
                            field_h = stackIn_10_0;
                            var5.field_j = 0;
                            tl.field_O = hh.field_b;
                            q.a(ci.field_W, lb.field_v, 26800, dc.field_e, (od) (Object) nj.field_p);
                            qj.a(-1, 14656);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        if (!param0) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        de.field_q = null;
                        return true;
                    }
                    case 13: {
                        return false;
                    }
                    case 15: {
                        var2 = (IOException) (Object) caughtException;
                        tl.field_O = sg.field_b;
                        if (!param0) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        de.field_q = null;
                        return true;
                    }
                    case 17: {
                        return false;
                    }
                    case 19: {
                        tl.field_O = sg.field_b;
                        if (!param0) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        de.field_q = null;
                        return true;
                    }
                    case 21: {
                        return false;
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

    final void a(int param0, int[] param1, int param2, int param3, byte param4, int param5, int param6, int param7) {
        ((ek) this).field_k = param7;
        ((ek) this).field_j = param6;
        ((ek) this).field_s = param0;
        ((ek) this).field_i = param1;
        ((ek) this).field_o = param2;
        ((ek) this).field_r = param3;
        ((ek) this).field_u = param5;
        if (param4 < 24) {
            ek.a(41, false, 105);
        }
    }

    final static void d(int param0) {
        if (null == el.field_sb) {
          if (param0 != -2) {
            return;
          } else {
            L0: {
              if (k.field_J != null) {
                k.field_J.h();
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        } else {
          el.field_sb.h();
          if (param0 != -2) {
            return;
          } else {
            L1: {
              if (k.field_J != null) {
                k.field_J.h();
                break L1;
              } else {
                break L1;
              }
            }
            return;
          }
        }
    }

    public static void e(int param0) {
        field_l = null;
        field_t = null;
        field_q = null;
        field_m = null;
        int var1 = -81 % ((param0 - -57) / 45);
        field_p = null;
    }

    ek() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = -1;
        field_h = -1;
        field_p = "to over <%0> great games";
        field_q = "World <%0>, Stage <%1>";
    }
}
