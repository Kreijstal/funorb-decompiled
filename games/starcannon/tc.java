/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc extends kf {
    static boolean field_x;
    private rk field_w;
    static String field_y;

    final void a(byte param0, uj param1) {
        qd var3 = null;
        boolean discarded$0 = false;
        if (param0 <= 68) {
            return;
        }
        try {
            if (!(param1 instanceof qd)) {
                throw new IllegalArgumentException();
            }
            var3 = (qd) ((Object) param1);
            this.field_w.a(-125, var3);
            var3.field_G = true;
            discarded$0 = var3.a(0, (uj) (this));
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "tc.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public tc() {
        super(0, 0, ui.field_o, ak.field_h, (de) null, (qg) null);
        this.field_w = new rk();
    }

    final static void j(int param0) {
        int var1_int = 0;
        int var2 = StarCannon.field_A;
        p.field_d.b((byte) -78);
        for (var1_int = 0; 32 > var1_int; var1_int++) {
            jb.field_j[var1_int] = 0L;
        }
        if (param0 != 32) {
            return;
        }
        try {
            for (var1_int = 0; 32 > var1_int; var1_int++) {
                vd.field_g[var1_int] = 0L;
            }
            sg.field_k = 0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "tc.B(" + param0 + ')');
        }
    }

    final qd k(int param0) {
        ba var2 = null;
        qd var3 = null;
        var2 = new ba(this.field_w);
        var3 = (qd) ((Object) var2.a(param0 ^ param0));
        L0: while (true) {
          if (var3 != null) {
            if (!var3.field_G) {
              var3 = (qd) ((Object) var2.b(param0 ^ 97));
              continue L0;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        }
    }

    final void h(int param0) {
        ba var2 = new ba(this.field_w);
        qd var3 = (qd) ((Object) var2.a(0));
        if (param0 != -10597) {
            field_x = false;
        }
        while (var3 != null) {
            if (var3.g((byte) -124)) {
                var3.b(4);
            }
            var3 = (qd) ((Object) var2.b(param0 + 10679));
        }
        this.field_t = (uj) ((Object) this.k(0));
    }

    final void l(int param0) {
        uj discarded$0 = null;
        ba var2 = new ba(this.field_w);
        qd var3 = (qd) ((Object) var2.a(0));
        while (var3 != null) {
            var3.field_G = false;
            var3 = (qd) ((Object) var2.b(102));
        }
        this.field_t = null;
        if (param0 != 26756) {
            discarded$0 = this.e(-38);
        }
    }

    final uj e(int param0) {
        ba var2 = null;
        qd var3 = null;
        var2 = new ba(this.field_w);
        var3 = (qd) ((Object) var2.a(param0 + param0));
        L0: while (true) {
          if (var3 != null) {
            if (var3.field_G) {
              return var3.h(1);
            } else {
              var3 = (qd) ((Object) var2.b(99));
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var7 = StarCannon.field_A;
        if (!(this.field_o == null)) {
            this.field_o.a(param1, true, -93, param3, (uj) (this));
        }
        ba var5 = new ba(this.field_w);
        if (param2 != 49) {
            return;
        }
        uj var6 = (uj) ((Object) var5.a(false));
        while (var6 != null) {
            var6.a(param0, this.field_s + param1, (byte) 49, param3 + this.field_j);
            var6 = (uj) ((Object) var5.a((byte) -34));
        }
    }

    final void i(int param0) {
        int var4 = StarCannon.field_A;
        ba var2 = new ba(this.field_w);
        qd var3 = (qd) ((Object) var2.a(param0 ^ param0));
        while (var3 != null) {
            if (var3.i(-126)) {
                var3.b(4);
            }
            var3 = (qd) ((Object) var2.b(99));
        }
    }

    public static void g(int param0) {
        field_y = null;
        if (param0 != -14528) {
            tc.g(39);
        }
    }

    static {
        field_y = "CONTROLS:";
    }
}
