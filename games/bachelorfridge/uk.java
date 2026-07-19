/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk extends ana {
    private kh field_v;
    static String field_w;

    public static void d(int param0) {
        int var1 = 100 / ((param0 - 59) / 61);
        field_w = null;
    }

    private final void e(int param0) {
        oha discarded$3 = null;
        boolean discarded$4 = false;
        oha discarded$5 = null;
        Object var3 = null;
        iv var3_ref = null;
        int var5 = 0;
        aga var7 = null;
        ad var8 = null;
        aga var9 = null;
        ad var10 = null;
        var3 = null;
        var5 = BachelorFridge.field_y;
        if (param0 == 1) {
          var9 = this.field_v.field_l.a(98, this.field_q.field_h);
          if (var9.i(-123)) {
            return;
          } else {
            var3_ref = (iv) ((Object) this.field_v.field_o.b((byte) 90));
            discarded$3 = al.a(param0 + 106, this.field_v.field_k);
            L0: while (true) {
              if (var3_ref == null) {
                return;
              } else {
                var3_ref.a(var9, this.field_q.field_h, 12);
                var10 = var3_ref.field_h.a(param0 + -27450, this.field_q);
                var10.b(-1, 6);
                var10.a(24831, param0 ^ 98, kna.field_g[1]);
                var3_ref = (iv) ((Object) this.field_v.field_o.c(param0 ^ 1));
                continue L0;
              }
            }
          }
        } else {
          discarded$4 = this.c((byte) -34);
          var7 = this.field_v.field_l.a(98, this.field_q.field_h);
          if (var7.i(-123)) {
            return;
          } else {
            var3_ref = (iv) ((Object) this.field_v.field_o.b((byte) 90));
            discarded$5 = al.a(param0 + 106, this.field_v.field_k);
            L1: while (true) {
              if (var3_ref == null) {
                return;
              } else {
                var3_ref.a(var7, this.field_q.field_h, 12);
                var8 = var3_ref.field_h.a(param0 + -27450, this.field_q);
                var8.b(-1, 6);
                var8.a(24831, param0 ^ 98, kna.field_g[1]);
                var3_ref = (iv) ((Object) this.field_v.field_o.c(param0 ^ 1));
                continue L1;
              }
            }
          }
        }
    }

    final boolean c(byte param0) {
        int var2 = 0;
        int fieldTemp$2 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (fieldTemp$2 >= 0) {
          if ((this.field_l ^ -1) == -26) {
            jja.a(256, -1, 35);
            this.e(1);
            return false;
          } else {
            return false;
          }
        } else {
          this.f(11642);
          var2 = -109 % ((param0 - 71) / 47);
          return true;
        }
    }

    private final void f(int param0) {
        boolean discarded$0 = false;
        if (param0 != 11642) {
            discarded$0 = this.c((byte) 8);
        }
    }

    uk(gj param0, kh param1) {
        super(param0, param1);
        try {
            this.field_v = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "uk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_w = "Match by...";
    }
}
