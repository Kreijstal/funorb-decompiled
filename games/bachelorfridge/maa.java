/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class maa extends ana {
    private jl field_w;
    static String field_x;
    static int field_v;

    private final void b() {
        aga var2 = null;
        iv var3 = null;
        int var5 = 0;
        ad var6 = null;
        var5 = BachelorFridge.field_y;
        var2 = ((maa) this).field_w.field_l.a(62, ((maa) this).field_q.field_h);
        if (var2.i(-114)) {
          return;
        } else {
          var3 = (iv) (Object) ((maa) this).field_w.field_o.b((byte) 90);
          oha discarded$8 = al.a(-84, ((maa) this).field_w.field_k);
          L0: while (true) {
            if (var3 != null) {
              var3.a(var2, ((maa) this).field_q.field_h, 12);
              var6 = var3.field_h.a(-27449, ((maa) this).field_q);
              var6.b(-1, 7);
              var6.a(24831, 98, kna.field_g[28]);
              var3 = (iv) (Object) ((maa) this).field_w.field_o.c(0);
              continue L0;
            } else {
              return;
            }
          }
        }
    }

    maa(gj param0, jl param1) {
        super(param0, (bca) (Object) param1);
        try {
            ((maa) this).field_w = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "maa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(byte param0) {
        field_x = null;
        if (param0 >= 17) {
            return;
        }
        maa.e((byte) 8);
    }

    private final void d(int param0) {
    }

    final boolean c(byte param0) {
        int var2 = -91 % ((param0 - 71) / 47);
        int fieldTemp$0 = ((maa) this).field_l - 1;
        ((maa) this).field_l = ((maa) this).field_l - 1;
        if (!(fieldTemp$0 < 0)) {
            if (25 != ((maa) this).field_l) {
                return false;
            }
            jja.a(256, -1, 3);
            int discarded$1 = 0;
            this.b();
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
