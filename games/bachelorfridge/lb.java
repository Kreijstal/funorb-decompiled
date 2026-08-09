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
        int fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (!(-1 < (fieldTemp$0 ^ -1))) {
            if (25 != this.field_l) {
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
        Object var3;
        iv var3_ref;
        int var5;
        aga var6;
        ad var7;
        aga var8;
        ad var9;
        var3 = null;
        var5 = BachelorFridge.field_y;
        if (param0 == 15084) {
          var8 = this.field_x.field_l.a(79, this.field_q.field_h);
          if (var8.i(-82)) {
            return;
          } else {
            var3_ref = (iv) ((Object) this.field_x.field_o.b((byte) 90));
            al.a(param0 + -14993, this.field_x.field_k);
            L0: while (true) {
              if (var3_ref == null) {
                return;
              } else {
                var3_ref.a(var8, this.field_q.field_h, 12);
                var9 = var3_ref.field_h.a(-27449, this.field_q);
                var9.b(-1, 6);
                var9.a(24831, 101, kna.field_g[33]);
                var3_ref = (iv) ((Object) this.field_x.field_o.c(0));
                continue L0;
              }
            }
          }
        } else {
          lb.g((byte) -55);
          var6 = this.field_x.field_l.a(79, this.field_q.field_h);
          if (var6.i(-82)) {
            return;
          } else {
            var3_ref = (iv) ((Object) this.field_x.field_o.b((byte) 90));
            al.a(param0 + -14993, this.field_x.field_k);
            L1: while (true) {
              if (var3_ref == null) {
                return;
              } else {
                var3_ref.a(var6, this.field_q.field_h, 12);
                var7 = var3_ref.field_h.a(-27449, this.field_q);
                var7.b(-1, 6);
                var7.a(24831, 101, kna.field_g[33]);
                var3_ref = (iv) ((Object) this.field_x.field_o.c(0));
                continue L1;
              }
            }
          }
        }
    }

    final static boolean g(byte param0) {
        int var1;
        int stackIn_7_0 = 0;
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
              stackIn_7_0 = 1;
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
        super(param0, param1);
        try {
            this.field_x = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "lb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void f(byte param0) {
        field_w = null;
        if (param0 != 39) {
            field_w = (String) null;
        }
    }

    static {
        field_v = 640;
    }
}
