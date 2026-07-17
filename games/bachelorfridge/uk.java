/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk extends ana {
    private kh field_v;
    static String field_w;

    public static void d(int param0) {
        int var1 = -100;
        field_w = null;
    }

    private final void e() {
        aga var2 = null;
        iv var3 = null;
        ad var4 = null;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        var2 = ((uk) this).field_v.field_l.a(98, ((uk) this).field_q.field_h);
        if (var2.i(-123)) {
          return;
        } else {
          var3 = (iv) (Object) ((uk) this).field_v.field_o.b((byte) 90);
          oha discarded$1 = al.a(107, ((uk) this).field_v.field_k);
          L0: while (true) {
            if (var3 == null) {
              return;
            } else {
              var3.a(var2, ((uk) this).field_q.field_h, 12);
              var4 = var3.field_h.a(-27449, ((uk) this).field_q);
              var4.b(-1, 6);
              var4.a(24831, 99, kna.field_g[1]);
              var3 = (iv) (Object) ((uk) this).field_v.field_o.c(0);
              continue L0;
            }
          }
        }
    }

    final boolean c(byte param0) {
        int var2 = 0;
        int fieldTemp$6 = ((uk) this).field_l - 1;
        ((uk) this).field_l = ((uk) this).field_l - 1;
        if (fieldTemp$6 >= 0) {
          if (((uk) this).field_l == 25) {
            jja.a(256, -1, 35);
            int discarded$7 = 1;
            this.e();
            return false;
          } else {
            return false;
          }
        } else {
          int discarded$8 = 11642;
          this.f();
          var2 = -109 % ((param0 - 71) / 47);
          return true;
        }
    }

    private final void f() {
    }

    uk(gj param0, kh param1) {
        super(param0, (bca) (Object) param1);
        try {
            ((uk) this).field_v = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "uk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "Match by...";
    }
}
