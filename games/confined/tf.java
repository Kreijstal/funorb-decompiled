/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class tf {
    double field_i;
    static int[] field_b;
    private double field_o;
    private double field_h;
    private double field_q;
    double field_j;
    static String[] field_d;
    private ee field_l;
    static int[][] field_c;
    static int[][] field_n;
    double field_f;
    static bh field_a;
    static int[] field_m;
    static bg field_p;
    static String field_g;
    static mi field_k;
    static double field_e;

    public static void d(int param0) {
        field_k = null;
        field_a = null;
        if (param0 < 47) {
          return;
        } else {
          field_c = null;
          field_d = null;
          field_n = null;
          field_b = null;
          field_p = null;
          field_m = null;
          field_g = null;
          return;
        }
    }

    final void a(double param0, double param1, double param2, int param3) {
        ((tf) this).field_f = ((tf) this).field_f - param1;
        ((tf) this).field_j = ((tf) this).field_j - param2;
        if (param3 < 27) {
          ((tf) this).c(-77);
          ((tf) this).field_i = ((tf) this).field_i - param0;
          return;
        } else {
          ((tf) this).field_i = ((tf) this).field_i - param0;
          return;
        }
    }

    final static void a(byte param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        String var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ce stackIn_10_0 = null;
        ce stackIn_11_0 = null;
        ce stackIn_12_0 = null;
        String stackIn_12_1 = null;
        RuntimeException decompiledCaughtException = null;
        ce stackOut_9_0 = null;
        ce stackOut_11_0 = null;
        String stackOut_11_1 = null;
        ce stackOut_10_0 = null;
        String stackOut_10_1 = null;
        var7 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              pn.field_a.b(he.field_b[param1], 320, param2 + 36, 16777215, -1);
              if ((1 << param1 & param3) == 0) {
                kn.field_g.d(256, param2 + 44);
                break L1;
              } else {
                db.field_w[param1].d(256, param2 + 44);
                break L1;
              }
            }
            L2: {
              if ((32800 & ~param3 & 1 << param1) != 0) {
                var4_ref = n.field_e;
                break L2;
              } else {
                var4_ref = jf.field_c[param1];
                break L2;
              }
            }
            var5 = pn.field_a.b(var4_ref, 171);
            int discarded$1 = pn.field_a.a(var4_ref, 80, -166 + -pn.field_a.field_C + (-(var5 * 10) + 274 - -param2), 171, 1000, 4243584, -1, 0, 0, 20);
            L3: {
              stackOut_9_0 = pn.field_a;
              stackIn_11_0 = stackOut_9_0;
              stackIn_10_0 = stackOut_9_0;
              if (0 == (param3 & 1 << param1)) {
                stackOut_11_0 = (ce) (Object) stackIn_11_0;
                stackOut_11_1 = an.field_m;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                break L3;
              } else {
                stackOut_10_0 = (ce) (Object) stackIn_10_0;
                stackOut_10_1 = fj.field_r;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                break L3;
              }
            }
            ((ce) (Object) stackIn_12_0).c(stackIn_12_1, 80, 10 * var5 + 118 + param2, 16777215, -1);
            pn.field_a.a(hh.field_a, 500, 103 - -param2, 4243584, -1);
            pn.field_a.a(ei.field_ib, 500, 123 + param2, 4243584, -1);
            if (-1 != (32800 & param3 & 1 << param1)) {
              pn.field_a.c("???", 500, 103 + param2, 16777215, -1);
              pn.field_a.c("???", 500, param2 + 123, 16777215, -1);
              return;
            } else {
              pn.field_a.c(Integer.toString(sb.field_b[param1]), 500, param2 + 103, 16777215, -1);
              var6 = 0;
              L4: while (true) {
                if (eg.field_j[param1] <= var6) {
                  break L0;
                } else {
                  sb.field_h.d(var6 * 5 + 500, param2 + 108);
                  var6++;
                  continue L4;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var4, "tf.B(" + 59 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final double[] a(int param0) {
        if (param0 != 16777215) {
          tf.d(111);
          return new double[]{((tf) this).field_i, ((tf) this).field_f, ((tf) this).field_j, ((tf) this).field_h, ((tf) this).field_q, ((tf) this).field_o};
        } else {
          return new double[]{((tf) this).field_i, ((tf) this).field_f, ((tf) this).field_j, ((tf) this).field_h, ((tf) this).field_q, ((tf) this).field_o};
        }
    }

    final void c(int param0) {
        ((tf) this).field_i = ((tf) this).field_i + ((tf) this).field_h;
        if (param0 != 16777215) {
          return;
        } else {
          ((tf) this).field_f = ((tf) this).field_f + ((tf) this).field_q;
          ((tf) this).field_j = ((tf) this).field_j + ((tf) this).field_o;
          return;
        }
    }

    final void b(int param0) {
        ((tf) this).field_q = ((tf) this).field_l.field_G;
        if (param0 != 118) {
          ((tf) this).c(66);
          ((tf) this).field_o = ((tf) this).field_l.field_L;
          ((tf) this).field_j = ((tf) this).field_l.field_D;
          ((tf) this).field_h = ((tf) this).field_l.field_K;
          ((tf) this).field_f = ((tf) this).field_l.field_t;
          ((tf) this).field_i = ((tf) this).field_l.field_E;
          return;
        } else {
          ((tf) this).field_o = ((tf) this).field_l.field_L;
          ((tf) this).field_j = ((tf) this).field_l.field_D;
          ((tf) this).field_h = ((tf) this).field_l.field_K;
          ((tf) this).field_f = ((tf) this).field_l.field_t;
          ((tf) this).field_i = ((tf) this).field_l.field_E;
          return;
        }
    }

    tf(ee param0) {
        try {
            ((tf) this).field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "tf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[]{5, 12, 7, 14};
        field_n = new int[][]{new int[field_b[0]], new int[field_b[1]], new int[field_b[2]], new int[field_b[3]]};
        field_c = new int[][]{new int[field_b[0]], new int[field_b[1]], new int[field_b[2]], new int[field_b[3]]};
        field_a = new bh();
        field_m = new int[8192];
        field_g = "Type your email address again to make sure it's correct";
        field_p = new bg();
    }
}
