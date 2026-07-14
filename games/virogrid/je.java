/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je extends ec {
    private p field_F;
    static boolean[] field_J;
    static String field_E;
    static String field_G;
    static String field_I;
    static String[] field_B;
    static String field_H;

    final static uh h(boolean param0) {
        if (!param0) {
            field_I = null;
        }
        String var1 = ne.a((byte) -52);
        if (var1 != null) {
            if (0 <= var1.indexOf('@')) {
                var1 = "";
            }
        }
        return new uh(ne.a((byte) -52), db.b(16));
    }

    public je() {
        super(0, 0, mm.field_i, mn.field_a, (ol) null, (cd) null);
        ((je) this).field_F = new p();
    }

    public static void h(int param0) {
        field_H = null;
        field_E = null;
        field_B = null;
        if (param0 != -202) {
            field_G = null;
        }
        field_G = null;
        field_I = null;
        field_J = null;
    }

    final static void a(lk param0, byte param1) {
        int var3 = Virogrid.field_F ? 1 : 0;
        if (param1 <= 87) {
            field_J = null;
        }
        param0.a(false);
        lk var2 = (lk) (Object) ci.field_o.a((byte) -64);
        while (var2 != null) {
            // ifeq L67
            var2 = (lk) (Object) ci.field_o.a(16213);
        }
        if (var2 == null) {
            ci.field_o.a((l) (Object) param0, (byte) -91);
        } else {
            td.a((l) (Object) var2, (byte) -73, (l) (Object) param0);
        }
    }

    final static void f(int param0) {
        int var1 = (-640 + eb.field_f) / 2;
        int var2 = ve.field_t * ve.field_t;
        int var3 = var2 + -(kh.field_d * kh.field_d);
        fd.field_y.a(-(199 * var3 / var2) + var1, -124 + df.field_f + -90, 199, (byte) -115, 90);
        if (param0 != -17491) {
            je.h(84);
        }
        hg.field_p.a(var1 - (-202 - 438 * var3 / var2), -120 + (df.field_f + -4), 438, (byte) -42, 0);
    }

    final void i(int param0) {
        int var5 = Virogrid.field_F ? 1 : 0;
        ma var2 = new ma(((je) this).field_F);
        gg var3 = (gg) (Object) var2.c(12677);
        while (var3 != null) {
            if (var3.f(3)) {
                var3.a(false);
            }
            var3 = (gg) (Object) var2.b(41);
        }
        int var4 = 91 / ((param0 - 65) / 38);
        ((je) this).field_x = (fi) (Object) ((je) this).c((byte) 51);
    }

    final gg c(byte param0) {
        ma var2 = null;
        gg var3 = null;
        int var4 = 0;
        L0: {
          var4 = Virogrid.field_F ? 1 : 0;
          if (param0 == 51) {
            break L0;
          } else {
            field_H = null;
            break L0;
          }
        }
        var2 = new ma(((je) this).field_F);
        var3 = (gg) (Object) var2.c(12677);
        L1: while (true) {
          if (var3 != null) {
            if (var3.field_G) {
              return var3;
            } else {
              var3 = (gg) (Object) var2.b(41);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final void g(int param0) {
        int var5 = Virogrid.field_F ? 1 : 0;
        int var2 = -32 % ((param0 - -40) / 48);
        ma var3 = new ma(((je) this).field_F);
        gg var4 = (gg) (Object) var3.c(12677);
        while (var4 != null) {
            if (var4.a((byte) -75)) {
                var4.a(false);
            }
            var4 = (gg) (Object) var3.b(41);
        }
    }

    final void a(int param0, fi param1) {
        if (!(param1 instanceof gg)) {
            throw new IllegalArgumentException();
        }
        gg var3 = (gg) (Object) param1;
        if (param0 != 0) {
            je.h(112);
        }
        ((je) this).field_F.b((l) (Object) var3, (byte) -45);
        var3.field_G = true;
        boolean discarded$0 = var3.a((fi) this, param0 ^ -8515);
    }

    final void a(byte param0) {
        int var4 = Virogrid.field_F ? 1 : 0;
        ma var2 = new ma(((je) this).field_F);
        gg var3 = (gg) (Object) var2.c(12677);
        if (param0 != 76) {
            fi discarded$0 = ((je) this).g(true);
        }
        while (var3 != null) {
            var3.field_G = false;
            var3 = (gg) (Object) var2.b(41);
        }
        ((je) this).field_x = null;
    }

    final fi g(boolean param0) {
        ma var2 = null;
        gg var3 = null;
        int var4 = 0;
        L0: {
          var4 = Virogrid.field_F ? 1 : 0;
          var2 = new ma(((je) this).field_F);
          var3 = (gg) (Object) var2.c(12677);
          if (!param0) {
            break L0;
          } else {
            ((je) this).a((byte) -34);
            break L0;
          }
        }
        L1: while (true) {
          if (var3 != null) {
            if (var3.field_G) {
              return var3.c((byte) -3);
            } else {
              var3 = (gg) (Object) var2.b(41);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var7 = Virogrid.field_F ? 1 : 0;
        if (!(null == ((je) this).field_w)) {
            ((je) this).field_w.a(param1, (fi) this, true, param2, -23294);
        }
        if (param0 != 37) {
            return;
        }
        ma var5 = new ma(((je) this).field_F);
        fi var6 = (fi) (Object) var5.a((byte) 48);
        while (var6 != null) {
            var6.a((byte) 37, ((je) this).field_l + param1, param2 + ((je) this).field_u, param3);
            var6 = (fi) (Object) var5.a(-1);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "Cancel draw";
        field_G = "Quick Chat Help";
        field_B = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_I = "Close";
        field_H = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
