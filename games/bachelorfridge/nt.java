/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nt extends ana {
    static String field_x;
    static ee[] field_z;
    static String[] field_y;
    static String field_w;
    private lk field_v;

    public static void e(int param0) {
        field_x = null;
        field_y = null;
        field_z = null;
        field_w = null;
    }

    private final void d(int param0) {
        iv var3 = null;
        ad var4 = null;
        int var5 = 0;
        aga var6 = null;
        var5 = BachelorFridge.field_y;
        var6 = ((nt) this).field_v.field_l.a(99, ((nt) this).field_q.field_h);
        if (var6.i(-118)) {
          return;
        } else {
          var3 = (iv) (Object) ((nt) this).field_v.field_o.b((byte) 90);
          oha discarded$1 = al.a(-46, ((nt) this).field_v.field_k);
          L0: while (true) {
            if (var3 == null) {
              return;
            } else {
              var3.a(var6, ((nt) this).field_q.field_h, 12);
              var4 = var3.field_h.a(-27449, ((nt) this).field_q);
              ((nt) this).a(27799, (at) (Object) new taa(((nt) this).field_q, var4));
              ((nt) this).a(27799, (at) (Object) new cb(var4, 7));
              ((nt) this).a(27799, (at) (Object) new wn(var4, kna.field_g[17], 24831));
              var3 = (iv) (Object) ((nt) this).field_v.field_o.c(0);
              continue L0;
            }
          }
        }
    }

    final boolean c(byte param0) {
        if (((nt) this).field_m.a((byte) -106)) {
            return false;
        }
        int var2 = 12 % ((param0 - 71) / 47);
        if (((nt) this).field_l > 75) {
            if (((nt) this).field_l % 10 != 0) {
                int fieldTemp$0 = ((nt) this).field_l - 1;
                ((nt) this).field_l = ((nt) this).field_l - 1;
                if (!(0 > fieldTemp$0)) {
                    if (((nt) this).field_l == 75) {
                        this.d(24831);
                        return false;
                    }
                    return false;
                }
                this.f(-6020);
                return true;
            }
            wf.a(3, (byte) 126);
        }
        int fieldTemp$1 = ((nt) this).field_l - 1;
        ((nt) this).field_l = ((nt) this).field_l - 1;
        if (!(0 > fieldTemp$1)) {
            if (((nt) this).field_l != 75) {
                return false;
            }
            this.d(24831);
            return false;
        }
        this.f(-6020);
        return true;
    }

    nt(gj param0, lk param1) {
        super(param0, (bca) (Object) param1);
        try {
            ((nt) this).field_v = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "nt.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private final void f(int param0) {
        if (param0 != -6020) {
            this.f(92);
        }
    }

    final static void e(byte param0) {
        if (param0 <= 77) {
            return;
        }
        bi.o(2);
        ep.a(4, 8192);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "Go Back";
        field_w = "Offer draw";
    }
}
