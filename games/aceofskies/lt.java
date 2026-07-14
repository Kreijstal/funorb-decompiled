/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lt extends to {
    static int field_u;
    private kp field_w;
    static vd field_v;

    public static void k(int param0) {
        int var1 = -1 / ((param0 - 25) / 48);
        field_v = null;
    }

    public lt() {
        super(0, 0, fj.field_c, nc.field_d, (ir) null, (no) null);
        ((lt) this).field_w = new kp();
    }

    final gm d(byte param0) {
        an var2 = null;
        gm var3 = null;
        int var4 = 0;
        var4 = AceOfSkies.field_G ? 1 : 0;
        if (param0 == -112) {
          var2 = new an(((lt) this).field_w);
          var3 = (gm) var2.c(-1372);
          L0: while (true) {
            if (var3 != null) {
              if (((gm) var3).field_z) {
                return var3;
              } else {
                var3 = (gm) var2.a(-122);
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return (gm) null;
        }
    }

    final void j(int param0) {
        int var4 = AceOfSkies.field_G ? 1 : 0;
        if (param0 != 0) {
            ea discarded$0 = ((lt) this).i(92);
        }
        an var2 = new an(((lt) this).field_w);
        gm var3 = (gm) var2.c(-1372);
        while (var3 != null) {
            if (!(!var3.i(param0 + -72))) {
                var3.c(-125);
            }
            var3 = (gm) var2.a(param0 + 59);
        }
    }

    final void e(byte param0) {
        int var4 = AceOfSkies.field_G ? 1 : 0;
        an var2 = new an(((lt) this).field_w);
        gm var3 = (gm) var2.c(-1372);
        while (var3 != null) {
            var3.field_z = false;
            var3 = (gm) var2.a(67);
        }
        if (param0 < 19) {
            return;
        }
        ((lt) this).field_s = null;
    }

    final void a(ea param0, int param1) {
        if (param1 != 0) {
            ((lt) this).field_w = (kp) null;
        }
        if (!(param0 instanceof gm)) {
            throw new IllegalArgumentException();
        }
        gm var3 = (gm) param0;
        ((lt) this).field_w.a((wf) (Object) var3, 25611);
        var3.field_z = true;
        boolean discarded$0 = var3.a((ea) this, (byte) -42);
    }

    final ea i(int param0) {
        int var4 = AceOfSkies.field_G ? 1 : 0;
        an var2 = new an(((lt) this).field_w);
        gm var3 = (gm) var2.c(-1372);
        while (var3 != null) {
            if (((gm) var3).field_z) {
                return var3.a(0);
            }
            var3 = (gm) var2.a(107);
        }
        if (param0 == 0) {
            return null;
        }
        lt.k(30);
        return null;
    }

    final void f(byte param0) {
        int var5 = AceOfSkies.field_G ? 1 : 0;
        int var3 = 96 % ((-31 - param0) / 58);
        an var2 = new an(((lt) this).field_w);
        gm var4 = (gm) var2.c(-1372);
        while (var4 != null) {
            if (var4.h(11)) {
                var4.c(-127);
            }
            var4 = (gm) var2.a(-127);
        }
        ((lt) this).field_s = (ea) (Object) ((lt) this).d((byte) -112);
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var7 = AceOfSkies.field_G ? 1 : 0;
        if (!(((lt) this).field_e == null)) {
            ((lt) this).field_e.a(true, -7592, param3, (ea) this, param2);
        }
        an var5 = new an(((lt) this).field_w);
        if (param0 < 64) {
            field_u = 45;
        }
        ea var6 = (ea) var5.b(true);
        while (var6 != null) {
            var6.a((byte) 112, param1, ((lt) this).field_h + param2, ((lt) this).field_p + param3);
            var6 = (ea) var5.a((byte) 120);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = 0;
    }
}
