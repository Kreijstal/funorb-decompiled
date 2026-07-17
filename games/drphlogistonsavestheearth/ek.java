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
          if (r.field_d < 0) {
            if (0 == r.field_d) {
              sc.a(-1, true, ad.field_q);
              if (r.field_d != 11) {
                return;
              } else {
                qk.field_c = false;
                return;
              }
            } else {
              if (r.field_d == -2) {
                sc.a(-1, true, ad.field_q);
                if (r.field_d != 11) {
                  return;
                } else {
                  qk.field_c = false;
                  return;
                }
              } else {
                if (r.field_d == 11) {
                  qk.field_c = false;
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            th.field_a[r.field_d].a(param1, (byte) 89);
            if (0 == r.field_d) {
              sc.a(-1, true, ad.field_q);
              if (r.field_d == 11) {
                qk.field_c = false;
                return;
              } else {
                return;
              }
            } else {
              if (r.field_d == -2) {
                sc.a(-1, true, ad.field_q);
                if (r.field_d == 11) {
                  qk.field_c = false;
                  return;
                } else {
                  return;
                }
              } else {
                if (r.field_d == 11) {
                  qk.field_c = false;
                  return;
                } else {
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
            Throwable decompiledCaughtException = null;
            int stackOut_9_0 = 0;
            int stackOut_8_0 = 0;
            L0: {
              if (null == de.field_q) {
                de.field_q = pi.field_I.a(ml.field_n, ei.field_o, 105);
                break L0;
              } else {
                break L0;
              }
            }
            if (de.field_q.field_b == 0) {
              return false;
            } else {
              long dupTemp$2 = la.a(false);
              ck.field_e = dupTemp$2;
              el.field_rb = dupTemp$2;
              if (de.field_q.field_b != 1) {
                tl.field_O = sg.field_b;
                de.field_q = null;
                return true;
              } else {
                try {
                  L1: {
                    L2: {
                      uj.field_j = new qe((java.net.Socket) de.field_q.field_g, pi.field_I);
                      var4 = dh.field_N;
                      var5 = var4;
                      nj.field_p.field_j = 0;
                      if (!param1) {
                        stackOut_9_0 = -1;
                        stackIn_10_0 = stackOut_9_0;
                        break L2;
                      } else {
                        stackOut_8_0 = -2;
                        stackIn_10_0 = stackOut_8_0;
                        break L2;
                      }
                    }
                    l.field_q = stackIn_10_0;
                    gg.field_l = stackIn_10_0;
                    field_h = stackIn_10_0;
                    var5.field_j = 0;
                    tl.field_O = hh.field_b;
                    q.a(ci.field_W, lb.field_v, 26800, dc.field_e, (od) (Object) nj.field_p);
                    qj.a(-1, 14656);
                    break L1;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  tl.field_O = sg.field_b;
                  de.field_q = null;
                  return true;
                }
                de.field_q = null;
                return true;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int[] param1, int param2, int param3, byte param4, int param5, int param6, int param7) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((ek) this).field_k = param7;
              ((ek) this).field_j = param6;
              ((ek) this).field_s = param0;
              ((ek) this).field_i = param1;
              ((ek) this).field_o = param2;
              ((ek) this).field_r = param3;
              ((ek) this).field_u = param5;
              if (param4 >= 24) {
                break L1;
              } else {
                ek.a(41, false, 105);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ek.C(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    final static void d() {
        if (null != el.field_sb) {
            el.field_sb.h();
            if (!(k.field_J == null)) {
                k.field_J.h();
            }
            return;
        }
        if (!(k.field_J == null)) {
            k.field_J.h();
        }
    }

    public static void e() {
        field_l = null;
        field_t = null;
        field_q = null;
        field_m = null;
        int var1 = 0;
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
