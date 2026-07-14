/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class maa extends ana {
    private jl field_w;
    static String field_x;
    static int field_v;

    private final void b(boolean param0) {
        aga var2 = null;
        iv var3 = null;
        int var5 = 0;
        ad var6 = null;
        ad var7 = null;
        var5 = BachelorFridge.field_y;
        var2 = ((maa) this).field_w.field_l.a(62, ((maa) this).field_q.field_h);
        if (var2.i(-114)) {
          return;
        } else {
          var3 = (iv) (Object) ((maa) this).field_w.field_o.b((byte) 90);
          oha discarded$2 = al.a(-84, ((maa) this).field_w.field_k);
          if (param0) {
            boolean discarded$3 = ((maa) this).c((byte) -57);
            L0: while (true) {
              if (var3 != null) {
                var3.a(var2, ((maa) this).field_q.field_h, 12);
                var7 = var3.field_h.a(-27449, ((maa) this).field_q);
                var7.b(-1, 7);
                var7.a(24831, 98, kna.field_g[28]);
                var3 = (iv) (Object) ((maa) this).field_w.field_o.c(0);
                continue L0;
              } else {
                return;
              }
            }
          } else {
            L1: while (true) {
              if (var3 != null) {
                var3.a(var2, ((maa) this).field_q.field_h, 12);
                var6 = var3.field_h.a(-27449, ((maa) this).field_q);
                var6.b(-1, 7);
                var6.a(24831, 98, kna.field_g[28]);
                var3 = (iv) (Object) ((maa) this).field_w.field_o.c(0);
                continue L1;
              } else {
                return;
              }
            }
          }
        }
    }

    maa(gj param0, jl param1) {
        super(param0, (bca) (Object) param1);
        ((maa) this).field_w = param1;
    }

    public static void e(byte param0) {
        field_x = null;
        if (param0 >= 17) {
            return;
        }
        maa.e((byte) 8);
    }

    private final void d(int param0) {
        if (param0 == 15642) {
            return;
        }
        ((maa) this).field_w = null;
    }

    final boolean c(byte param0) {
        int var2 = -91 % ((param0 - 71) / 47);
        ((maa) this).field_l = ((maa) this).field_l - 1;
        if (!(-1 < (((maa) this).field_l - 1 ^ -1))) {
            if (25 != ((maa) this).field_l) {
                return false;
            }
            jja.a(256, -1, 3);
            this.b(false);
            return false;
        }
        this.d(15642);
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "Log in / Create account";
    }
}
