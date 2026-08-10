/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i extends si {
    private nc field_L;
    static long field_H;
    static qh field_J;
    static int field_K;
    static String[] field_I;

    final void c(boolean param0) {
        int var4 = SolKnight.field_L ? 1 : 0;
        ck var2 = new ck(this.field_L);
        if (param0) {
            return;
        }
        kf var3 = (kf) ((Object) var2.a((byte) 94));
        while (var3 != null) {
            if (var3.h(1784)) {
                var3.c(10);
            }
            var3 = (kf) ((Object) var2.c(122));
        }
        this.field_G = (rc) ((Object) this.d((byte) 115));
    }

    public static void a(byte param0) {
        field_J = null;
        field_I = null;
        if (param0 != 30) {
            i.a((byte) -67);
        }
    }

    final rc h(int param0) {
        ck var2;
        kf var3;
        int var4;
        var4 = SolKnight.field_L ? 1 : 0;
        if (param0 == 0) {
          var2 = new ck(this.field_L);
          var3 = (kf) ((Object) var2.a((byte) 84));
          L0: while (true) {
            if (var3 != null) {
              if (var3.field_J) {
                return var3.d((byte) -48);
              } else {
                var3 = (kf) ((Object) var2.c(param0 ^ 113));
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return (rc) null;
        }
    }

    final void b(rc param0, int param1) {
        kf var4 = null;
        try {
            if (!(param0 instanceof kf)) {
                throw new IllegalArgumentException();
            }
            int var3_int = 63 % ((18 - param1) / 59);
            var4 = (kf) ((Object) param0);
            this.field_L.a(-3024, var4);
            var4.field_J = true;
            var4.a(-1463, (rc) (this));
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "i.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void j(int param0) {
        int var4 = SolKnight.field_L ? 1 : 0;
        ck var2 = new ck(this.field_L);
        kf var3 = (kf) ((Object) var2.a((byte) 109));
        while (var3 != null) {
            var3.field_J = false;
            var3 = (kf) ((Object) var2.c(117));
        }
        if (param0 != 1) {
            field_I = (String[]) null;
        }
        this.field_G = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var7 = SolKnight.field_L ? 1 : 0;
        if (null != this.field_w) {
            this.field_w.a((byte) 125, param0, true, param2, (rc) (this));
        }
        if (param3 != 0) {
            this.h(-93);
        }
        ck var5 = new ck(this.field_L);
        rc var6 = (rc) ((Object) var5.a(param3 ^ -25119));
        while (var6 != null) {
            var6.a(param0 - -this.field_j, param1, this.field_m + param2, param3 ^ 0);
            var6 = (rc) ((Object) var5.b(640));
        }
    }

    final kf d(byte param0) {
        ck var2;
        kf var3;
        int var4;
        L0: {
          var4 = SolKnight.field_L ? 1 : 0;
          var2 = new ck(this.field_L);
          var3 = (kf) ((Object) var2.a((byte) 92));
          if (param0 >= 81) {
            break L0;
          } else {
            field_I = (String[]) null;
            break L0;
          }
        }
        L1: while (true) {
          if (var3 != null) {
            if (!var3.field_J) {
              var3 = (kf) ((Object) var2.c(121));
              continue L1;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        }
    }

    final void d(boolean param0) {
        int var4 = SolKnight.field_L ? 1 : 0;
        ck var2 = new ck(this.field_L);
        kf var3 = (kf) ((Object) var2.a((byte) -66));
        while (var3 != null) {
            if (!(!var3.e((byte) 124))) {
                var3.c(10);
            }
            var3 = (kf) ((Object) var2.c(119));
        }
        if (!param0) {
            this.field_L = (nc) null;
        }
    }

    public i() {
        super(0, 0, og.field_f, wc.field_e, (j) null, (dg) null);
        this.field_L = new nc();
    }

    final static void a(byte param0, long param1) {
        if (!(param1 > 0L)) {
            return;
        }
        if (param1 % 10L == 0L) {
            lc.a(2767, param1 - 1L);
            lc.a(2767, 1L);
        } else {
            lc.a(2767, param1);
        }
        if (param0 < 11) {
            field_I = (String[]) null;
        }
    }

    static {
        field_J = new qh();
    }
}
