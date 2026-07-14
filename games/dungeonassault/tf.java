/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    private cn field_c;
    int[] field_h;
    String field_f;
    private cn field_b;
    int field_i;
    private int field_d;
    private se field_a;
    static boolean[] field_e;
    static int[] field_k;
    static String field_g;
    static cn field_j;

    final static boolean a(java.applet.Applet param0, int param1) {
        if (param1 == 1041792321) {
          if (ia.field_W == null) {
            if (null != ll.field_r) {
              tp.a(param1 + -1041792311, 75.0f, i.field_s);
              g.a(fi.d(false), param1 ^ 1041775506);
              ll.field_r = null;
              nf.d(0);
              return false;
            } else {
              if (null == bl.field_t) {
                if (null == np.field_A) {
                  if (kf.field_p == null) {
                    if (id.field_i != null) {
                      df.a((byte) 11, new ja(id.field_i.a("", "huffman", (byte) -110)));
                      id.field_i = null;
                      nf.d(0);
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    tp.a(param1 ^ 1041792331, 92.0f, he.field_n);
                    g.a(fi.d(false), param1 ^ 1041775506);
                    vf.c((byte) 117);
                    kf.field_p = null;
                    nf.d(0);
                    return false;
                  }
                } else {
                  tp.a(param1 ^ 1041792331, 84.0f, ib.field_i);
                  g.a(fi.d(false), 18131);
                  sl.a((byte) -97, param0);
                  bl.c((byte) -101);
                  gh.field_c = null;
                  np.field_A = null;
                  nf.d(param1 + -1041792321);
                  return false;
                }
              } else {
                tp.a(10, 80.0f, ik.field_a);
                g.a(fi.d(false), 18131);
                mi.a(-114);
                tl.field_k = null;
                bl.field_t = null;
                nf.d(0);
                return false;
              }
            }
          } else {
            ck.h(-116);
            tp.a(10, 75.0f, i.field_s);
            g.a(fi.d(false), param1 + -1041774190);
            ra.b(9);
            ia.field_W = null;
            nf.d(0);
            return false;
          }
        } else {
          return false;
        }
    }

    final void b(int param0, int param1, int param2) {
        bp.a(param0, ((tf) this).field_c, param2, (byte) 99);
        ((tf) this).field_b.h(param2, param0);
        if (param1 != 32) {
            Object var5 = null;
            boolean discarded$0 = tf.a((java.applet.Applet) null, -18);
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param2 != 1699) {
            ((tf) this).field_f = null;
        }
        ((tf) this).b(param1 - (((tf) this).field_d >> 1041792321), param2 ^ 1667, param0 + -(((tf) this).field_i >> 1499939521));
    }

    tf(se param0, String param1, int[] param2) {
        int var5 = 0;
        cn var7 = null;
        cn var8 = null;
        ((tf) this).field_f = param1;
        ((tf) this).field_a = param0;
        ((tf) this).field_h = param2;
        jh.c();
        ((tf) this).field_i = ((tf) this).field_a.b(((tf) this).field_f);
        ((tf) this).field_d = ((tf) this).field_a.field_H + ((tf) this).field_a.field_E;
        var7 = new cn(((tf) this).field_i, ((tf) this).field_d);
        var8 = var7;
        var8.e();
        ((tf) this).field_a.b(((tf) this).field_f, 0, ((tf) this).field_a.field_H, 16777215, -1);
        ((tf) this).field_b = te.a(((tf) this).field_i, ((tf) this).field_d, ((tf) this).field_h, 32, 32, 0.125);
        var5 = 0;
        L0: while (true) {
          if (var5 >= ((tf) this).field_b.field_B.length) {
            ((tf) this).field_c = dd.a((byte) -112, 4, var8);
            jh.b();
          } else {
            if (-1 != (var7.field_B[var5] ^ -1)) {
              if (((tf) this).field_b.field_B[var5] == 0) {
                ((tf) this).field_b.field_B[var5] = 65793;
                var5++;
                continue L0;
              } else {
                var5++;
                continue L0;
              }
            } else {
              ((tf) this).field_b.field_B[var5] = 0;
              var5++;
              continue L0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_k = null;
        if (param0 != -1) {
            Object var2 = null;
            boolean discarded$0 = tf.a((java.applet.Applet) null, 12);
        }
        field_j = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = rb.b(8421504, 4210752, 64);
        field_g = "CLOSE";
    }
}
