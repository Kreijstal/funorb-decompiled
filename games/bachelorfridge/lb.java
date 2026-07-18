/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb extends ana {
    static String field_w;
    static int field_v;
    private wga field_x;

    private final void e(byte param0) {
        int var2 = -120;
    }

    final boolean c(byte param0) {
        int var2 = 44 % ((71 - param0) / 47);
        int fieldTemp$0 = ((lb) this).field_l - 1;
        ((lb) this).field_l = ((lb) this).field_l - 1;
        if (!(fieldTemp$0 < 0)) {
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
        ad var4 = null;
        int var5 = BachelorFridge.field_y;
        aga var2 = ((lb) this).field_x.field_l.a(79, ((lb) this).field_q.field_h);
        if (!(!var2.i(-82))) {
            return;
        }
        iv var3 = (iv) (Object) ((lb) this).field_x.field_o.b((byte) 90);
        oha discarded$6 = al.a(91, ((lb) this).field_x.field_k);
        while (var3 != null) {
            var3.a(var2, ((lb) this).field_q.field_h, 12);
            var4 = var3.field_h.a(-27449, ((lb) this).field_q);
            var4.b(-1, 6);
            var4.a(24831, 101, kna.field_g[33]);
            var3 = (iv) (Object) ((lb) this).field_x.field_o.c(0);
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
        try {
            ((lb) this).field_x = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "lb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void f(byte param0) {
        field_w = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = 640;
    }
}
