/*
 * Decompiled by CFR-JS 0.4.0.
 */
class uh extends gi {
    long field_t;
    uh field_p;
    static nh field_r;
    private static int[] field_o;
    static rf field_i;
    static int[] field_j;
    static int[] field_s;
    private static int[] field_k;
    static int[] field_l;
    static String field_q;
    static int field_m;
    static int[] field_h;
    uh field_n;

    final static nh[] a(byte param0, int param1) {
        if (param0 != 121) {
            field_s = null;
        }
        nh[] var3 = new nh[9];
        nh[] var2 = var3;
        var3[4] = mi.a(64, (byte) -93, param1);
        return var2;
    }

    final static he e(int param0) {
        he var1 = new he(oe.field_b, ih.field_K, kh.field_i[0], vi.field_b[0], gf.field_o[0], qa.field_J[0], a.field_e[0], aj.field_a);
        oc.a((byte) -21);
        return var1;
    }

    final void f(int param0) {
        if (!(((uh) this).field_n != null)) {
            return;
        }
        ((uh) this).field_n.field_p = ((uh) this).field_p;
        ((uh) this).field_p.field_n = ((uh) this).field_n;
        ((uh) this).field_p = null;
        if (param0 != 64) {
            field_o = null;
        }
        ((uh) this).field_n = null;
    }

    public static void d(int param0) {
        field_s = null;
        field_o = null;
        field_l = null;
        field_q = null;
        field_j = null;
        field_k = null;
        field_i = null;
        field_h = null;
        field_r = null;
    }

    protected uh() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_o = new int[256];
        field_j = new int[256];
        field_s = new int[]{24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 12, 12, 24, 1, 24, 124, 12, 12, 24, 24, 99, 24};
        field_k = new int[256];
        field_l = new int[256];
        var0 = 0;
        L0: while (true) {
          if (var0 >= 256) {
            var0 = 0;
            L1: while (true) {
              if (var0 >= 128) {
                var0 = 128;
                L2: while (true) {
                  if (var0 >= 256) {
                    field_m = 0;
                    field_q = "Skip";
                    field_h = new int[128];
                    return;
                  } else {
                    field_o[var0] = li.a(512 * (-128 + var0), 16711680);
                    var0++;
                    continue L2;
                  }
                }
              } else {
                field_o[var0] = 131072 * var0;
                var0++;
                continue L1;
              }
            }
          } else {
            field_j[var0] = 65793 * var0;
            field_k[var0] = var0;
            field_l[var0] = var0 * 65537;
            var0++;
            continue L0;
          }
        }
    }
}
