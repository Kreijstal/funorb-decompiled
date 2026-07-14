/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb extends ana {
    static String field_w;
    static int field_v;
    private wga field_x;

    private final void e(byte param0) {
        int var2 = 120 / ((param0 - -3) / 44);
    }

    final boolean c(byte param0) {
        int var2 = 44 % ((71 - param0) / 47);
        ((lb) this).field_l = ((lb) this).field_l - 1;
        if (!(-1 < (((lb) this).field_l - 1 ^ -1))) {
            if (25 != ((lb) this).field_l) {
                return false;
            }
            jja.a(256, -1, 31);
            this.d(15084);
            return false;
        }
        this.e((byte) -61);
        return true;
    }

    private final void d(int param0) {
        Object var3 = null;
        iv var3_ref = null;
        int var5 = 0;
        aga var6 = null;
        ad var7 = null;
        aga var8 = null;
        ad var9 = null;
        var3 = null;
        var5 = BachelorFridge.field_y;
        if (param0 == 15084) {
          var8 = ((lb) this).field_x.field_l.a(79, ((lb) this).field_q.field_h);
          if (var8.i(-82)) {
            return;
          } else {
            var3_ref = (iv) (Object) ((lb) this).field_x.field_o.b((byte) 90);
            oha discarded$3 = al.a(param0 + -14993, ((lb) this).field_x.field_k);
            L0: while (true) {
              if (var3_ref == null) {
                return;
              } else {
                var3_ref.a(var8, ((lb) this).field_q.field_h, 12);
                var9 = var3_ref.field_h.a(-27449, ((lb) this).field_q);
                var9.b(-1, 6);
                var9.a(24831, 101, kna.field_g[33]);
                var3_ref = (iv) (Object) ((lb) this).field_x.field_o.c(0);
                continue L0;
              }
            }
          }
        } else {
          boolean discarded$4 = lb.g((byte) -55);
          var6 = ((lb) this).field_x.field_l.a(79, ((lb) this).field_q.field_h);
          if (var6.i(-82)) {
            return;
          } else {
            var3_ref = (iv) (Object) ((lb) this).field_x.field_o.b((byte) 90);
            oha discarded$5 = al.a(param0 + -14993, ((lb) this).field_x.field_k);
            L1: while (true) {
              if (var3_ref == null) {
                return;
              } else {
                var3_ref.a(var6, ((lb) this).field_q.field_h, 12);
                var7 = var3_ref.field_h.a(-27449, ((lb) this).field_q);
                var7.b(-1, 6);
                var7.a(24831, 101, kna.field_g[33]);
                var3_ref = (iv) (Object) ((lb) this).field_x.field_o.c(0);
                continue L1;
              }
            }
          }
        }
    }

    final static boolean g(byte param0) {
        int var1 = 0;
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        var1 = -88 % ((0 - param0) / 39);
        if (ms.field_u == null) {
          if (!em.d((byte) -104)) {
            if (wt.field_n == null) {
              if (ng.b(92)) {
                return true;
              } else {
                return false;
              }
            } else {
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    lb(gj param0, wga param1) {
        super(param0, (bca) (Object) param1);
        ((lb) this).field_x = param1;
    }

    public static void f(byte param0) {
        field_w = null;
        if (param0 != 39) {
            field_w = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = 640;
    }
}
