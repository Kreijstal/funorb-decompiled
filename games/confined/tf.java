/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        String var4 = null;
        String var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ce stackIn_6_0 = null;
        ce stackIn_7_0 = null;
        ce stackIn_8_0 = null;
        String stackIn_8_1 = null;
        ce stackIn_22_0 = null;
        ce stackIn_23_0 = null;
        ce stackIn_24_0 = null;
        String stackIn_24_1 = null;
        ce stackOut_21_0 = null;
        ce stackOut_23_0 = null;
        String stackOut_23_1 = null;
        ce stackOut_22_0 = null;
        String stackOut_22_1 = null;
        ce stackOut_5_0 = null;
        ce stackOut_7_0 = null;
        String stackOut_7_1 = null;
        ce stackOut_6_0 = null;
        String stackOut_6_1 = null;
        var7 = Confined.field_J ? 1 : 0;
        pn.field_a.b(he.field_b[param1], 320, param2 + 36, 16777215, -1);
        if (-1 == (1 << param1 & param3 ^ -1)) {
          L0: {
            kn.field_g.d(256, param2 + 44);
            if ((32800 & (param3 ^ -1) & 1 << param1) != 0) {
              var4 = n.field_e;
              break L0;
            } else {
              var4_ref = jf.field_c[param1];
              break L0;
            }
          }
          var5 = pn.field_a.b(var4, 171);
          int discarded$2 = pn.field_a.a(var4, 80, -166 + -pn.field_a.field_C + (-(var5 * 10) + 274 - -param2), 171, 1000, 4243584, -1, 0, 0, 20);
          if (param0 == 59) {
            L1: {
              stackOut_21_0 = pn.field_a;
              stackIn_23_0 = stackOut_21_0;
              stackIn_22_0 = stackOut_21_0;
              if (0 == (param3 & 1 << param1)) {
                stackOut_23_0 = (ce) (Object) stackIn_23_0;
                stackOut_23_1 = an.field_m;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                break L1;
              } else {
                stackOut_22_0 = (ce) (Object) stackIn_22_0;
                stackOut_22_1 = fj.field_r;
                stackIn_24_0 = stackOut_22_0;
                stackIn_24_1 = stackOut_22_1;
                break L1;
              }
            }
            ((ce) (Object) stackIn_24_0).c(stackIn_24_1, 80, 10 * var5 + 118 + param2, 16777215, -1);
            pn.field_a.a(hh.field_a, 500, 103 - -param2, 4243584, -1);
            pn.field_a.a(ei.field_ib, 500, 123 + param2, 4243584, -1);
            if (-1 == (32800 & param3 & 1 << param1)) {
              pn.field_a.c(Integer.toString(sb.field_b[param1]), 500, param2 + 103, 16777215, -1);
              var6 = 0;
              L2: while (true) {
                if (eg.field_j[param1] > var6) {
                  sb.field_h.d(var6 * 5 + 500, param2 + 108);
                  var6++;
                  continue L2;
                } else {
                  return;
                }
              }
            } else {
              pn.field_a.c("???", 500, 103 + param2, 16777215, -1);
              pn.field_a.c("???", 500, param2 + 123, 16777215, -1);
              return;
            }
          } else {
            return;
          }
        } else {
          L3: {
            db.field_w[param1].d(256, param2 + 44);
            if ((32800 & (param3 ^ -1) & 1 << param1) != 0) {
              var4 = n.field_e;
              break L3;
            } else {
              var4_ref = jf.field_c[param1];
              break L3;
            }
          }
          var5 = pn.field_a.b(var4, 171);
          int discarded$3 = pn.field_a.a(var4, 80, -166 + -pn.field_a.field_C + (-(var5 * 10) + 274 - -param2), 171, 1000, 4243584, -1, 0, 0, 20);
          if (param0 != 59) {
            return;
          } else {
            L4: {
              stackOut_5_0 = pn.field_a;
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (0 == (param3 & 1 << param1)) {
                stackOut_7_0 = (ce) (Object) stackIn_7_0;
                stackOut_7_1 = an.field_m;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                break L4;
              } else {
                stackOut_6_0 = (ce) (Object) stackIn_6_0;
                stackOut_6_1 = fj.field_r;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                break L4;
              }
            }
            L5: {
              ((ce) (Object) stackIn_8_0).c(stackIn_8_1, 80, 10 * var5 + 118 + param2, 16777215, -1);
              pn.field_a.a(hh.field_a, 500, 103 - -param2, 4243584, -1);
              pn.field_a.a(ei.field_ib, 500, 123 + param2, 4243584, -1);
              if (-1 != (32800 & param3 & 1 << param1)) {
                pn.field_a.c("???", 500, 103 + param2, 16777215, -1);
                pn.field_a.c("???", 500, param2 + 123, 16777215, -1);
                break L5;
              } else {
                pn.field_a.c(Integer.toString(sb.field_b[param1]), 500, param2 + 103, 16777215, -1);
                var6 = 0;
                L6: while (true) {
                  if (eg.field_j[param1] <= var6) {
                    break L5;
                  } else {
                    sb.field_h.d(var6 * 5 + 500, param2 + 108);
                    var6++;
                    continue L6;
                  }
                }
              }
            }
            return;
          }
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
        ((tf) this).field_l = param0;
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
