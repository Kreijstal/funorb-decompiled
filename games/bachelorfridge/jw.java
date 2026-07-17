/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jw extends ana {
    private fia field_w;
    static String field_x;
    static kv[] field_v;

    public static void d(int param0) {
        field_x = null;
        if (param0 != 32) {
            jw.d(-106);
            field_v = null;
            return;
        }
        field_v = null;
    }

    private final void e() {
        aga var2 = null;
        iv var3 = null;
        int var5 = 0;
        ad var6 = null;
        var5 = BachelorFridge.field_y;
        var2 = ((jw) this).field_w.field_l.a(14, ((jw) this).field_q.field_h);
        if (!var2.i(80)) {
          var3 = (iv) (Object) ((jw) this).field_w.field_o.b((byte) 90);
          oha discarded$8 = al.a(-44, ((jw) this).field_w.field_k);
          L0: while (true) {
            if (var3 != null) {
              var3.a(var2, ((jw) this).field_q.field_h, 12);
              var6 = var3.field_h.a(-27449, ((jw) this).field_q);
              var6.b(-1, 7);
              var6.a(24831, 9, kna.field_g[32]);
              var3 = (iv) (Object) ((jw) this).field_w.field_o.c(0);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    private final void f() {
    }

    final boolean c(byte param0) {
        int fieldTemp$0 = ((jw) this).field_l - 1;
        ((jw) this).field_l = ((jw) this).field_l - 1;
        if (!(fieldTemp$0 > -1)) {
            if (-26 == ((jw) this).field_l) {
                jja.a(256, -1, 33);
                int discarded$1 = -23403;
                this.e();
                return false;
            }
            return false;
        }
        int var2 = -38 / ((param0 - 71) / 47);
        int discarded$2 = 7;
        this.f();
        return true;
    }

    jw(gj param0, fia param1) {
        super(param0, (bca) (Object) param1);
        try {
            ((jw) this).field_w = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "jw.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "FULL ACCESS";
    }
}
