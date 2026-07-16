/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec extends mg {
    static String field_n;
    private boolean field_s;
    static int field_t;
    static String field_m;
    static int field_r;
    static java.awt.Canvas field_u;
    static tf field_q;
    private String field_p;
    static String field_o;

    final String a(int param0, String param1) {
        id var4 = null;
        CharSequence var5 = (CharSequence) (Object) param1;
        String var3 = sn.a(var5, 0);
        if (!(var3 == null)) {
            return var3;
        }
        if (param0 > -76) {
            int discarded$0 = ec.a(true, 49, -104);
        }
        if (!param1.equals((Object) (Object) ((ec) this).field_p)) {
            var4 = ig.a(200, param1);
            if (var4 == null) {
                return null;
            }
            if (var4.field_c != null) {
                return null;
            }
            ((ec) this).field_p = param1;
            ((ec) this).field_s = var4.field_g;
        }
        if (!((ec) this).field_s) {
            return ek.field_e;
        }
        return vi.field_L;
    }

    final void f(int param0) {
        ((ec) this).field_p = null;
        int var2 = -118 / ((param0 - -56) / 56);
    }

    ec(c param0) {
        super(param0);
        ((ec) this).field_s = false;
    }

    final static int a(boolean param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Pixelate.field_H ? 1 : 0;
        var3 = 0;
        var4 = ce.field_c;
        L0: while (true) {
          if (var3 >= pl.field_J.length) {
            L1: {
              if (!param0) {
                break L1;
              } else {
                int discarded$1 = ec.a(true, 50, 69);
                break L1;
              }
            }
            return -1;
          } else {
            var5 = uf.field_e[var3];
            if (-1 >= (var5 ^ -1)) {
              var6 = jp.a(pl.field_J[var3], 8192, true);
              var4 = var4 + ki.field_e;
              var7 = bq.field_d + -(var6 >> 447013697);
              if (!mn.a(param1, var4, 59, (lf.field_b << -653544671) + dk.field_d, -uf.field_a + var7, param2, (uf.field_a << -1849595423) + var6)) {
                var4 = var4 + ((lf.field_b << 1458915521) - -ki.field_e + dk.field_d);
                var3++;
                continue L0;
              } else {
                return var5;
              }
            } else {
              var4 = var4 + da.field_m;
              var3++;
              continue L0;
            }
          }
        }
    }

    final static void a(boolean param0, fm param1) {
        tf var2 = new tf(param1.a((byte) 24, "", "final_frame.jpg"), (java.awt.Component) (Object) field_u);
        int var3 = var2.field_F;
        int var4 = var2.field_E;
        ti.a(param0);
        th.field_b = new tf(var3, 3 * var4 / 4);
        th.field_b.c();
        var2.f(0, 0);
        in.field_s = new tf(var3, var4 + -th.field_b.field_E);
        in.field_s.c();
        var2.f(0, -th.field_b.field_E);
        in.field_s.field_y = th.field_b.field_E;
        ia.a((byte) 92);
    }

    public static void e(int param0) {
        if (param0 != 0) {
            return;
        }
        field_q = null;
        field_n = null;
        field_u = null;
        field_m = null;
        field_o = null;
    }

    final dj a(String param0, boolean param1) {
        id var3 = null;
        CharSequence var4 = null;
        dj stackIn_14_0 = null;
        dj stackOut_13_0 = null;
        dj stackOut_12_0 = null;
        var4 = (CharSequence) (Object) param0;
        if (fm.a((byte) 63, var4)) {
          if (param1) {
            L0: {
              if (!param0.equals((Object) (Object) ((ec) this).field_p)) {
                L1: {
                  var3 = ig.a(200, param0);
                  if (var3 == null) {
                    break L1;
                  } else {
                    if (null != var3.field_c) {
                      break L1;
                    } else {
                      ((ec) this).field_p = param0;
                      ((ec) this).field_s = var3.field_g;
                      break L0;
                    }
                  }
                }
                return tg.field_j;
              } else {
                break L0;
              }
            }
            L2: {
              if (((ec) this).field_s) {
                stackOut_13_0 = qk.field_g;
                stackIn_14_0 = stackOut_13_0;
                break L2;
              } else {
                stackOut_12_0 = sk.field_a;
                stackIn_14_0 = stackOut_12_0;
                break L2;
              }
            }
            return stackIn_14_0;
          } else {
            return null;
          }
        } else {
          return sk.field_a;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Checking";
        field_n = "Hide game chat";
        field_o = "Close";
    }
}
