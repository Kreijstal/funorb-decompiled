/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k extends si {
    static id field_J;
    static int field_L;
    static int[] field_M;
    static rf field_H;
    private vd field_K;
    static int[] field_I;

    public static void g() {
        field_M = null;
        field_J = null;
        field_H = null;
        field_I = null;
    }

    final static int b(int param0, int param1) {
        return uc.field_b[param1 & 2047];
    }

    final static void a(int param0, int param1) {
        ma.field_vb = 1000000000L / (long)param1;
    }

    final void j(int param0) {
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        rh var2 = new rh(((k) this).field_K);
        bd var3 = (bd) (Object) var2.c(-1);
        while (var3 != null) {
            var3.field_Q = false;
            var3 = (bd) (Object) var2.a((byte) -82);
        }
        ((k) this).field_z = null;
        if (param0 != 300) {
            field_J = null;
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (!(((k) this).field_l == null)) {
            ((k) this).field_l.a(true, 119, (vg) this, param3, param0);
        }
        rh var5 = new rh(((k) this).field_K);
        if (param2 != -21) {
            field_H = null;
        }
        vg var6 = (vg) (Object) var5.a(-119);
        while (var6 != null) {
            var6.a(((k) this).field_o + param0, param1, (byte) -21, ((k) this).field_m + param3);
            var6 = (vg) (Object) var5.b((byte) 87);
        }
    }

    final void b(boolean param0) {
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        rh var2 = new rh(((k) this).field_K);
        bd var3 = (bd) (Object) var2.c(-1);
        if (param0) {
            ((k) this).j(-61);
        }
        while (var3 != null) {
            if (var3.k(2968)) {
                var3.a(-16175);
            }
            var3 = (bd) (Object) var2.a((byte) -103);
        }
        ((k) this).field_z = (vg) (Object) ((k) this).k(-29);
    }

    final void a(byte param0) {
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 >= -6) {
            return;
        }
        rh var2 = new rh(((k) this).field_K);
        bd var3 = (bd) (Object) var2.c(-1);
        while (var3 != null) {
            if (!(!var3.j(0))) {
                var3.a(-16175);
            }
            var3 = (bd) (Object) var2.a((byte) -100);
        }
    }

    final bd k(int param0) {
        rh var2 = null;
        int var3 = 0;
        bd var4 = null;
        int var5 = 0;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var3 = 87 % ((param0 - 56) / 53);
        var2 = new rh(((k) this).field_K);
        var4 = (bd) (Object) var2.c(-1);
        L0: while (true) {
          if (var4 != null) {
            if (!var4.field_Q) {
              var4 = (bd) (Object) var2.a((byte) -81);
              continue L0;
            } else {
              return var4;
            }
          } else {
            return null;
          }
        }
    }

    public k() {
        super(0, 0, di.field_a, qe.field_l, (cg) null, (fd) null);
        ((k) this).field_K = new vd();
    }

    final void a(byte param0, vg param1) {
        bd var3 = null;
        try {
            if (!(param1 instanceof bd)) {
                throw new IllegalArgumentException();
            }
            var3 = (bd) (Object) param1;
            ((k) this).field_K.a(48, (gi) (Object) var3);
            if (param0 > -82) {
                field_M = null;
            }
            var3.field_Q = true;
            boolean discarded$0 = var3.a(false, (vg) this);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "k.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final vg h(int param0) {
        rh var2 = null;
        int var3 = 0;
        bd var4 = null;
        int var5 = 0;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var3 = -123 / ((param0 - -28) / 57);
        var2 = new rh(((k) this).field_K);
        var4 = (bd) (Object) var2.c(-1);
        L0: while (true) {
          if (var4 != null) {
            if (!var4.field_Q) {
              var4 = (bd) (Object) var2.a((byte) -108);
              continue L0;
            } else {
              return var4.g(-22426);
            }
          } else {
            return null;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = new int[]{1, 0, 50, 0, 25, 500, 0, 10, 0, 0, 0, 450, 600, 200, 150, 300, 180, 400, 350, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 50, 100, 0, 0, 200, 25, 25, 25, 0, 50, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 40, 50, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        field_L = 0;
        field_I = new int[8192];
    }
}
