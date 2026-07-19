/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class maa extends ana {
    private jl field_w;
    static String field_x;
    static int field_v;

    private final void b(boolean param0) {
        oha discarded$2 = null;
        boolean discarded$3 = false;
        aga var2 = null;
        iv var3 = null;
        int var5 = 0;
        ad var6 = null;
        ad var7 = null;
        var5 = BachelorFridge.field_y;
        var2 = this.field_w.field_l.a(62, this.field_q.field_h);
        if (var2.i(-114)) {
          return;
        } else {
          var3 = (iv) ((Object) this.field_w.field_o.b((byte) 90));
          discarded$2 = al.a(-84, this.field_w.field_k);
          if (param0) {
            discarded$3 = this.c((byte) -57);
            L0: while (true) {
              if (var3 != null) {
                var3.a(var2, this.field_q.field_h, 12);
                var7 = var3.field_h.a(-27449, this.field_q);
                var7.b(-1, 7);
                var7.a(24831, 98, kna.field_g[28]);
                var3 = (iv) ((Object) this.field_w.field_o.c(0));
                continue L0;
              } else {
                return;
              }
            }
          } else {
            L1: while (true) {
              if (var3 != null) {
                var3.a(var2, this.field_q.field_h, 12);
                var6 = var3.field_h.a(-27449, this.field_q);
                var6.b(-1, 7);
                var6.a(24831, 98, kna.field_g[28]);
                var3 = (iv) ((Object) this.field_w.field_o.c(0));
                continue L1;
              } else {
                return;
              }
            }
          }
        }
    }

    maa(gj param0, jl param1) {
        super(param0, param1);
        try {
            this.field_w = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "maa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
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
        if (param0 == 15642) {
            return;
        }
        this.field_w = (jl) null;
    }

    final boolean c(byte param0) {
        int var2 = -91 % ((param0 - 71) / 47);
        int fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (!(-1 < (fieldTemp$0 ^ -1))) {
            if (25 != this.field_l) {
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
        field_x = "Log in / Create account";
    }
}
