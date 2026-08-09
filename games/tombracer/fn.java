/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fn extends vw {
    static int[] field_f;
    private float field_e;
    private hk field_d;

    final static void a(int param0, long param1, int param2) {
        kh var4 = ql.field_k;
        var4.k(param0, -2988);
        var4.field_h = var4.field_h + 1;
        int var6 = -78 % ((-78 - param2) / 40);
        int var5 = var4.field_h;
        var4.i(7, 0);
        var4.a(1736565456, param1);
        var4.d(var4.field_h - var5, (byte) 11);
    }

    fn(eo param0, hk param1) {
        super(param0);
        this.field_e = 0.0f;
        try {
            this.field_d = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "fn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4;
        int var5;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          if (param0 == 55) {
            break L0;
          } else {
            this.c(66);
            break L0;
          }
        }
        this.field_c.e(1, false);
        if (-1 == (param1 & 128 ^ -1)) {
          if ((1 & param2 ^ -1) != -2) {
            if (this.field_d.field_g) {
              this.field_c.a(true, this.field_d.field_c);
              this.field_c.e(0, false);
              return;
            } else {
              this.field_c.a(true, this.field_d.field_d[0]);
              this.field_c.e(0, false);
              return;
            }
          } else {
            if (this.field_d.field_g) {
              this.field_e = (float)(this.field_c.field_Dc % 4000) / 4000.0f;
              this.field_c.a(true, this.field_d.field_c);
              this.field_c.e(0, false);
              return;
            } else {
              var4 = this.field_c.field_Dc % 4000 * 16 / 4000;
              this.field_c.a(true, this.field_d.field_d[var4]);
              this.field_c.e(0, false);
              return;
            }
          }
        } else {
          this.field_c.a(true, (iva) null);
          this.field_c.e(0, false);
          return;
        }
    }

    final void a(int param0) {
        if (param0 > -4) {
          field_f = (int[]) null;
          this.field_c.e(1, false);
          this.field_c.a(iw.field_c, (byte) -110, iw.field_c);
          this.field_c.a(ej.field_c, 0, -55);
          this.field_c.a(0, false, ej.field_c);
          this.field_c.a(1, (byte) 58);
          this.field_c.a(true, (iva) null);
          this.field_c.e(0, false);
          this.field_c.a(0, false, ej.field_c);
          return;
        } else {
          this.field_c.e(1, false);
          this.field_c.a(iw.field_c, (byte) -110, iw.field_c);
          this.field_c.a(ej.field_c, 0, -55);
          this.field_c.a(0, false, ej.field_c);
          this.field_c.a(1, (byte) 58);
          this.field_c.a(true, (iva) null);
          this.field_c.e(0, false);
          this.field_c.a(0, false, ej.field_c);
          return;
        }
    }

    final void c(boolean param0) {
        asa var2;
        asa var3;
        eo stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        eo stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        if (!param0) {
          return;
        } else {
          L0: {
            if (0 == this.field_c.o((byte) 122)) {
              L1: {
                var2 = this.field_c.a((byte) 80);
                stackIn_5_0 = this.field_c;

                stackIn_5_1 = 1;

                if (param0) {
                  stackIn_6_0 = (eo) ((Object) stackIn_5_0);
                  stackIn_6_1 = stackIn_5_1;
                  stackIn_6_2 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = (eo) ((Object) stackIn_5_0);
                  stackIn_6_1 = stackIn_5_1;
                  stackIn_6_2 = 1;
                  break L1;
                }
              }
              ((eo) (Object) stackIn_6_0).e(stackIn_6_1, stackIn_6_2 != 0);
              var3 = this.field_c.C(0);
              var3.a(var2, 1);
              var3.b(11403, 1.0f, 0.125f, 0.125f);
              var3.a(0.0f, -120, 0.0f, this.field_e);
              this.field_c.a(cva.field_b, false);
              this.field_c.e(0, false);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    final boolean c(int param0) {
        if (param0 != 1185) {
            return false;
        }
        return this.field_d.c(param0 + -31819);
    }

    final void a(boolean param0, int param1) {
        if (param1 != 5744) {
          this.field_e = 1.964166283607483f;
          this.field_c.a(ln.field_F, (byte) -110, iw.field_c);
          return;
        } else {
          this.field_c.a(ln.field_F, (byte) -110, iw.field_c);
          return;
        }
    }

    final void a(int param0, iva param1, int param2) {
        try {
            this.field_c.a(true, param1);
            if (param2 != 24595) {
                this.field_e = -1.8459935188293457f;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "fn.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void d(int param0) {
        field_f = null;
        if (param0 != -16973) {
            field_f = (int[]) null;
        }
    }

    final void a(int param0, boolean param1) {
        this.field_c.e(1, false);
        this.field_c.a(ln.field_F, (byte) -110, jv.field_m);
        this.field_c.a(ej.field_c, 0, -6219, true, false);
        this.field_c.a(0, false, lja.field_j);
        this.field_c.a(0, (byte) 77);
        this.field_c.e(0, false);
        this.field_c.g(3625, -16777216);
        this.field_c.a(0, false, pea.field_c);
        this.c(true);
        int var3 = -101 % ((41 - param0) / 62);
    }

    static {
        field_f = new int[]{16777215, 16777215, 16711680};
    }
}
