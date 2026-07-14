/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pj {
    static volatile long field_g;
    static int[] field_b;
    static int field_d;
    static km[][] field_e;
    static int[] field_f;
    private java.util.zip.Inflater field_a;
    static pc field_h;
    static dd[] field_c;

    final static void b(int param0, int param1) {
        nk var2 = null;
        var2 = qn.field_U;
        var2.f(param1, param0 + 6324);
        var2.c(2, (byte) 107);
        if (param0 != -6446) {
          pj.b(27, 37);
          var2.c(4, (byte) -71);
          var2.c(jg.m(73), (byte) -88);
          return;
        } else {
          var2.c(4, (byte) -71);
          var2.c(jg.m(73), (byte) -88);
          return;
        }
    }

    final static int a(int param0, int param1) {
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (param0 >= 99) {
          param1 = param1 & 8191;
          if (param1 < 4096) {
            L0: {
              if (param1 > -2049) {
                stackOut_9_0 = hj.field_b[param1];
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_8_0 = hj.field_b[4096 + -param1];
                stackIn_10_0 = stackOut_8_0;
                break L0;
              }
            }
            return stackIn_10_0;
          } else {
            L1: {
              if (-6145 > param1) {
                stackOut_5_0 = -hj.field_b[-4096 + param1];
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = -hj.field_b[8192 + -param1];
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            return stackIn_6_0;
          }
        } else {
          return 32;
        }
    }

    final static void a(boolean param0, int param1, boolean param2, int param3, dm param4) {
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        ol.field_S[0] = ph.field_d.nextInt();
        ol.field_S[1] = ph.field_d.nextInt();
        mn.field_h.field_l = 0;
        ol.field_S[2] = (int)(sj.field_h >> -741378144);
        ol.field_S[3] = (int)sj.field_h;
        mn.field_h.d(ol.field_S[0], (byte) -81);
        mn.field_h.d(ol.field_S[1], (byte) -81);
        mn.field_h.d(ol.field_S[2], (byte) -81);
        mn.field_h.d(ol.field_S[3], (byte) -81);
        sa.a(mn.field_h, 109);
        mn.field_h.b(param3, param1 + 27463);
        param4.a(mn.field_h, (byte) 123);
        qn.field_U.field_l = 0;
        if (param2) {
          qn.field_U.c(18, (byte) -81);
          qn.field_U.field_l = qn.field_U.field_l + 2;
          var5 = qn.field_U.field_l;
          qn.field_U.d(gb.field_s, (byte) -81);
          qn.field_U.a(-97, qc.field_a);
          var6 = 0;
          if (param1 == -27359) {
            L0: {
              if (ln.field_Kb) {
                var6 = var6 | 1;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (!on.field_a) {
                break L1;
              } else {
                var6 = var6 | 4;
                break L1;
              }
            }
            L2: {
              if (!param0) {
                break L2;
              } else {
                var6 = var6 | 8;
                break L2;
              }
            }
            L3: {
              if (lf.field_N == null) {
                break L3;
              } else {
                var6 = var6 | 16;
                break L3;
              }
            }
            L4: {
              qn.field_U.c(var6, (byte) 52);
              var7 = m.a(bh.i(81), (byte) 87);
              if (var7 == null) {
                var7 = "";
                break L4;
              } else {
                break L4;
              }
            }
            qn.field_U.a(param1 ^ 27325, var7);
            if (null == lf.field_N) {
              lk.a(dk.field_k, mn.field_h, (p) (Object) qn.field_U, 91, se.field_M);
              qn.field_U.d(qn.field_U.field_l - var5, 111);
              vh.a(-1, (byte) -42);
              return;
            } else {
              qn.field_U.a(true, lf.field_N);
              lk.a(dk.field_k, mn.field_h, (p) (Object) qn.field_U, 91, se.field_M);
              qn.field_U.d(qn.field_U.field_l - var5, 111);
              vh.a(-1, (byte) -42);
              return;
            }
          } else {
            return;
          }
        } else {
          qn.field_U.c(16, (byte) 110);
          qn.field_U.field_l = qn.field_U.field_l + 2;
          var5 = qn.field_U.field_l;
          qn.field_U.d(gb.field_s, (byte) -81);
          qn.field_U.a(-97, qc.field_a);
          var6 = 0;
          if (param1 == -27359) {
            L5: {
              if (ln.field_Kb) {
                var6 = var6 | 1;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (!on.field_a) {
                break L6;
              } else {
                var6 = var6 | 4;
                break L6;
              }
            }
            L7: {
              if (!param0) {
                break L7;
              } else {
                var6 = var6 | 8;
                break L7;
              }
            }
            L8: {
              if (lf.field_N == null) {
                break L8;
              } else {
                var6 = var6 | 16;
                break L8;
              }
            }
            L9: {
              qn.field_U.c(var6, (byte) 52);
              var7 = m.a(bh.i(81), (byte) 87);
              if (var7 == null) {
                var7 = "";
                break L9;
              } else {
                break L9;
              }
            }
            qn.field_U.a(param1 ^ 27325, var7);
            if (null == lf.field_N) {
              lk.a(dk.field_k, mn.field_h, (p) (Object) qn.field_U, 91, se.field_M);
              qn.field_U.d(qn.field_U.field_l - var5, 111);
              vh.a(-1, (byte) -42);
              return;
            } else {
              qn.field_U.a(true, lf.field_N);
              lk.a(dk.field_k, mn.field_h, (p) (Object) qn.field_U, 91, se.field_M);
              qn.field_U.d(qn.field_U.field_l - var5, 111);
              vh.a(-1, (byte) -42);
              return;
            }
          } else {
            return;
          }
        }
    }

    final void a(byte[] param0, byte param1, p param2) {
        try {
            if (31 == param2.field_o[param2.field_l]) {
                // if_icmpne L47
            } else {
                throw new RuntimeException("");
            }
            if (null == ((pj) this).field_a) {
                ((pj) this).field_a = new java.util.zip.Inflater(true);
            }
            try {
                if (param1 >= -19) {
                    pj.b(106, 101);
                }
                ((pj) this).field_a.setInput(param2.field_o, param2.field_l - -10, -8 - (param2.field_l + 10 - param2.field_o.length));
                int discarded$0 = ((pj) this).field_a.inflate(param0);
            } catch (Exception exception) {
                ((pj) this).field_a.reset();
                throw new RuntimeException("");
            }
            ((pj) this).field_a.reset();
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public pj() {
        this(-1, 1000000, 1000000);
    }

    private pj(int param0, int param1, int param2) {
    }

    public static void a(int param0) {
        field_e = null;
        field_h = null;
        field_b = null;
        field_f = null;
        field_c = null;
        if (param0 != -6145) {
            field_f = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[]{4096, 0, 4096, 0, 4096, 0, 4096, 0, 0, 4096, 0, 4096, 0, 4096, 0, 4096, 4096, 0, 4096, 0, 4096, 0, 4096, 0, 0, 4096, 0, 4096, 0, 4096, 0, 4096, 4096, 0, 4096, 0, 4096, 0, 4096, 0, 0, 4096, 0, 4096, 0, 4096, 0, 4096, 4096, 0, 4096, 0, 4096, 0, 4096, 0, 0, 4096, 0, 4096, 0, 4096, 0, 4096};
        field_g = 0L;
        field_d = 3;
        field_c = new dd[7];
    }
}
