/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh extends am {
    static volatile int field_K;
    private mn field_J;

    final void i(byte param0) {
        int var4 = Confined.field_J ? 1 : 0;
        if (param0 <= 9) {
            return;
        }
        vb var2 = new vb(((sh) this).field_J);
        oe var3 = (oe) (Object) var2.a((byte) 120);
        while (var3 != null) {
            if (!(!var3.l(-6))) {
                var3.a(true);
            }
            var3 = (oe) (Object) var2.b(-92);
        }
        ((sh) this).field_H = (fj) (Object) ((sh) this).h(0);
    }

    public sh() {
        super(0, 0, tg.field_L, qk.field_c, (fe) null, (uk) null);
        ((sh) this).field_J = new mn();
    }

    final oe h(int param0) {
        vb var2 = null;
        oe var3 = null;
        int var4 = 0;
        var4 = Confined.field_J ? 1 : 0;
        var2 = new vb(((sh) this).field_J);
        if (param0 == 0) {
          var3 = (oe) (Object) var2.a((byte) 120);
          L0: while (true) {
            if (var3 != null) {
              if (var3.field_H) {
                return var3;
              } else {
                var3 = (oe) (Object) var2.b(param0 ^ -90);
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final void g(byte param0) {
        int var4 = Confined.field_J ? 1 : 0;
        vb var2 = new vb(((sh) this).field_J);
        oe var3 = (oe) (Object) var2.a((byte) 120);
        while (var3 != null) {
            var3.field_H = false;
            var3 = (oe) (Object) var2.b(-102);
        }
        ((sh) this).field_H = null;
        if (param0 <= 103) {
            ((sh) this).field_J = null;
        }
    }

    final void c(fj param0, int param1) {
        if (!(param0 instanceof oe)) {
            throw new IllegalArgumentException();
        }
        oe var3 = (oe) (Object) param0;
        ((sh) this).field_J.a((rk) (Object) var3, -1);
        var3.field_H = true;
        boolean discarded$8 = var3.a((fj) this, param1 ^ 418);
        if (param1 != 0) {
            ((sh) this).h((byte) -3);
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var7 = Confined.field_J ? 1 : 0;
        if (((sh) this).field_n != null) {
            ((sh) this).field_n.a((byte) -122, param3, true, (fj) this, param0);
        }
        if (param2 < 36) {
            return;
        }
        vb var5 = new vb(((sh) this).field_J);
        fj var6 = (fj) (Object) var5.c(7);
        while (var6 != null) {
            var6.a(((sh) this).field_m + param0, param1, (byte) 38, ((sh) this).field_q + param3);
            var6 = (fj) (Object) var5.a(0);
        }
    }

    final static em a(int param0, String param1, String param2, boolean param3) {
        CharSequence var7 = null;
        long var4 = 0L;
        String var6 = null;
        if (0 != (param1.indexOf('@') ^ -1)) {
            var6 = param1;
        } else {
            var7 = (CharSequence) (Object) param1;
            var4 = ra.a(var7, 125);
        }
        if (param0 != 12831) {
            return null;
        }
        return g.a(-26547, var4, param3, var6, param2);
    }

    final fj a(byte param0) {
        vb var2 = null;
        oe var3 = null;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = Confined.field_J ? 1 : 0;
          var2 = new vb(((sh) this).field_J);
          var3 = (oe) (Object) var2.a((byte) 120);
          if (param0 == -110) {
            break L0;
          } else {
            var5 = null;
            em discarded$2 = sh.a(64, (String) null, (String) null, false);
            break L0;
          }
        }
        L1: while (true) {
          if (var3 != null) {
            if (!var3.field_H) {
              var3 = (oe) (Object) var2.b(-24);
              continue L1;
            } else {
              return var3.f(-1);
            }
          } else {
            return null;
          }
        }
    }

    final void h(byte param0) {
        int var4 = Confined.field_J ? 1 : 0;
        vb var2 = new vb(((sh) this).field_J);
        if (param0 != -3) {
            ((sh) this).h((byte) -125);
        }
        oe var3 = (oe) (Object) var2.a((byte) 120);
        while (var3 != null) {
            if (!(!var3.j(-53))) {
                var3.a(true);
            }
            var3 = (oe) (Object) var2.b(62);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = 0;
    }
}
