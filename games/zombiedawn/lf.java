/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf extends le {
    int field_y;
    int field_w;
    static boolean field_n;
    static vn field_h;
    int field_C;
    ma field_u;
    int field_A;
    int field_D;
    int field_l;
    fn field_E;
    int field_q;
    int field_p;
    int field_r;
    nf field_t;
    int field_k;
    gi field_s;
    static volatile int field_m;
    int field_v;
    int field_z;
    int field_B;
    int field_o;
    int field_j;
    int field_x;
    int field_i;

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        String var4 = null;
        String var5 = null;
        int stackIn_12_0 = 0;
        int stackIn_28_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_10_0 = 0;
        if (param2 == -7235) {
          var5 = am.a(param0, 1);
          if (0 == (param1.indexOf(param0) ^ -1)) {
            if ((param1.indexOf(var5) ^ -1) == 0) {
              if (!param1.startsWith(param0)) {
                if (!param1.startsWith(var5)) {
                  if (!param1.endsWith(param0)) {
                    if (param1.endsWith(var5)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_26_0 = 1;
                    stackIn_28_0 = stackOut_26_0;
                    return stackIn_28_0 != 0;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          lf.a(-15);
          var4 = am.a(param0, 1);
          var3 = var4;
          if (0 == (param1.indexOf(param0) ^ -1)) {
            if ((param1.indexOf(var4) ^ -1) == 0) {
              if (!param1.startsWith(param0)) {
                if (!param1.startsWith(var4)) {
                  if (!param1.endsWith(param0)) {
                    if (param1.endsWith(var4)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    return stackIn_12_0 != 0;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    public static void a(int param0) {
        if (param0 != -9742) {
            field_m = 16;
            field_h = null;
            return;
        }
        field_h = null;
    }

    final static void a(int param0, int param1, int param2) {
        cn.field_f = null;
        kj.field_c = param0;
        id.field_D = param0;
        rl.field_f = true;
        te.field_eb = param1;
        ul.field_d = param1;
        Object var4 = null;
        bi.a((int[]) null, 0, 0);
        cn.field_f = l.a(-1, param0, (java.awt.Component) (Object) cj.field_d, param1);
        cn.field_f.b(param2 + -129);
        ba.a(18002, param0 / 2, param1 / 2);
        pl.a(param1, param0, (byte) 50);
        ep.a(param0, param1, -21141);
        hn.a(param1 / 2, (byte) -91, param0 / param2);
    }

    final void c(byte param0) {
        Object var3 = null;
        ((lf) this).field_s = null;
        ((lf) this).field_u = null;
        if (param0 <= 122) {
          var3 = null;
          boolean discarded$2 = lf.a((String) null, (String) null, -37);
          ((lf) this).field_t = null;
          ((lf) this).field_E = null;
          return;
        } else {
          ((lf) this).field_t = null;
          ((lf) this).field_E = null;
          return;
        }
    }

    lf() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = -1;
        field_h = new vn(640, 480);
    }
}
