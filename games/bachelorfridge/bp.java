/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bp extends ana {
    static int field_x;
    static ee[] field_y;
    static String field_w;
    static int field_z;
    private kk field_v;

    private final void g() {
    }

    bp(gj param0, kk param1) {
        super(param0, (bca) (Object) param1);
        try {
            ((bp) this).field_v = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "bp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean c(byte param0) {
        int var2 = 0;
        if (((bp) this).field_m.a((byte) -106)) {
            return false;
        }
        if (((bp) this).field_l > 75) {
            if (((bp) this).field_l % 10 != 0) {
                int fieldTemp$0 = ((bp) this).field_l - 1;
                ((bp) this).field_l = ((bp) this).field_l - 1;
                if (!(fieldTemp$0 < 0)) {
                    if (((bp) this).field_l == 75) {
                        int discarded$1 = -2602;
                        this.f();
                        return false;
                    }
                    return false;
                }
                var2 = 89 / ((71 - param0) / 47);
                int discarded$2 = -114;
                this.g();
                return true;
            }
            wf.a(3, (byte) 126);
        }
        int fieldTemp$3 = ((bp) this).field_l - 1;
        ((bp) this).field_l = ((bp) this).field_l - 1;
        if (!(fieldTemp$3 < 0)) {
            if (!(((bp) this).field_l != 75)) {
                int discarded$4 = -2602;
                this.f();
            }
            return false;
        }
        var2 = 89 / ((71 - param0) / 47);
        int discarded$5 = -114;
        this.g();
        return true;
    }

    private final void f() {
        iv var3 = null;
        ad var4 = null;
        int var5 = 0;
        aga var6 = null;
        var5 = BachelorFridge.field_y;
        var6 = ((bp) this).field_v.field_l.a(63, ((bp) this).field_q.field_h);
        if (var6.i(-100)) {
          return;
        } else {
          var3 = (iv) (Object) ((bp) this).field_v.field_o.b((byte) 90);
          oha discarded$1 = al.a(106, ((bp) this).field_v.field_k);
          L0: while (true) {
            if (var3 == null) {
              return;
            } else {
              L1: {
                var3.a(var6, ((bp) this).field_q.field_h, 12);
                var4 = var3.field_h.a(-27449, ((bp) this).field_q);
                if (var4 != null) {
                  ((bp) this).a(27799, (at) (Object) new taa(((bp) this).field_q, var4));
                  ((bp) this).a(27799, (at) (Object) new iu(3));
                  ((bp) this).a(27799, (at) (Object) new cb(var4, 7));
                  ((bp) this).a(27799, (at) (Object) new wn(var4, kna.field_g[18], 24831));
                  break L1;
                } else {
                  break L1;
                }
              }
              var3 = (iv) (Object) ((bp) this).field_v.field_o.c(0);
              continue L0;
            }
          }
        }
    }

    final static void d(int param0) {
        if (null != gja.field_m) {
            gja.field_m.g((byte) 127);
            return;
        }
    }

    public static void e() {
        field_y = null;
        field_w = null;
    }

    final static boolean e(int param0) {
        if (param0 != -29919) {
            return false;
        }
        return qo.field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "Food. Have a look at your first food in the fridge.";
        field_z = 5;
    }
}
