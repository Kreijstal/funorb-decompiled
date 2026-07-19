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
        if (param0 != 4) {
            return;
        }
        field_w = null;
    }

    private final void d(int param0) {
        oha discarded$8 = null;
        iv var3 = null;
        ad var4 = null;
        int var5 = 0;
        aga var6 = null;
        var5 = BachelorFridge.field_y;
        var6 = this.field_v.field_l.a(99, this.field_q.field_h);
        if (!var6.i(-118)) {
          var3 = (iv) ((Object) this.field_v.field_o.b((byte) 90));
          discarded$8 = al.a(-46, this.field_v.field_k);
          L0: while (true) {
            if (var3 == null) {
              if (param0 != 24831) {
                this.f(3);
                return;
              } else {
                return;
              }
            } else {
              var3.a(var6, this.field_q.field_h, 12);
              var4 = var3.field_h.a(-27449, this.field_q);
              this.a(27799, new taa(this.field_q, var4));
              this.a(27799, new cb(var4, 7));
              this.a(27799, new wn(var4, kna.field_g[17], 24831));
              var3 = (iv) ((Object) this.field_v.field_o.c(0));
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final boolean c(byte param0) {
        int fieldTemp$0 = 0;
        if (this.field_m.a((byte) -106)) {
            return false;
        }
        int var2 = 12 % ((param0 - 71) / 47);
        if (this.field_l > 75) {
            if (this.field_l % 10 != 0) {
                fieldTemp$0 = this.field_l - 1;
                this.field_l = this.field_l - 1;
                if (!(0 > fieldTemp$0)) {
                    if ((this.field_l ^ -1) == -76) {
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
        int fieldTemp$1 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (!(0 > fieldTemp$1)) {
            if ((this.field_l ^ -1) != -76) {
                return false;
            }
            this.d(24831);
            return false;
        }
        this.f(-6020);
        return true;
    }

    nt(gj param0, lk param1) {
        super(param0, param1);
        try {
            this.field_v = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "nt.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
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
        field_x = "Go Back";
        field_w = "Offer draw";
    }
}
