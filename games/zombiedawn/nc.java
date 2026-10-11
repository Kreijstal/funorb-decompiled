/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc extends le {
    private int field_l;
    int field_m;
    static fn field_r;
    static int field_j;
    private int field_i;
    static vn field_k;
    private int field_s;
    private int field_n;
    int field_q;
    private fn field_o;
    static tp field_p;
    private int field_h;

    final boolean c(int param0) {
        if (param0 < 81) {
          return true;
        }
        if (this.field_n < 750) {
          return false;
        }
        if (this.field_l == 0) {
          return true;
        }
        return false;
    }

    final static void a(int param0) {
        sl.field_b = new be(so.field_a.nextInt(), 3, 256, 256, 256, 2.0f, true);
        if (param0 == 11800) {
          na.field_c = sl.field_b.c(256, 256, param0 - 11827);
          return;
        }
    }

    public static void d(int param0) {
        field_p = null;
        if (param0 != -2135443998) {
          nc.d(30);
          field_r = null;
          field_k = null;
          return;
        }
        field_r = null;
        field_k = null;
    }

    final void a(boolean param0) {
        int fieldTemp$0 = 0;
        fb var2;
        ah var3;
        int var4;
        var4 = ZombieDawn.field_J;
        if (this.c(116)) {
          return;
        }
        fieldTemp$0 = this.field_s;
        this.field_s = this.field_s + 1;
        if (fieldTemp$0 <= 10) {
          this.field_i = this.field_i + 7;
          if (param0) {
            return;
          }
          if (256 < this.field_i) {
            this.field_i = 0;
          }
          if (this.field_n >= 750) {
            this.field_l = this.field_l - this.field_h;
          } else {
            if (this.field_l < 256) {
              this.field_l = this.field_l + this.field_h;
            }
            this.field_n = this.field_n + 1;
          }
          if (this.field_l > 256) {
            this.field_l = 256;
          }
          if (0 > this.field_l) {
            this.field_l = 0;
          }
          return;
        }
        this.field_s = 0;
        var2 = (fb) (dj.field_e.field_R.b((byte) 26));
        while (var2 != null) {
          if (var2 instanceof ah) {
            var3 = (ah) (var2);
            var3.a(this, -26246);
          }
          var2 = (fb) (dj.field_e.field_R.a(false));
        }
        this.field_i = this.field_i + 7;
        if (param0) {
          return;
        }
        if (256 < this.field_i) {
          this.field_i = 0;
        }
        if (this.field_n >= 750) {
          this.field_l = this.field_l - this.field_h;
        } else {
          if (this.field_l < 256) {
            this.field_l = this.field_l + this.field_h;
          }
          this.field_n = this.field_n + 1;
        }
        if (this.field_l > 256) {
          this.field_l = 256;
        }
        if (0 > this.field_l) {
          this.field_l = 0;
        }
        return;
    }

    final void c(byte param0) {
        this.field_n = 750;
        if (param0 != -64) {
          return;
        }
        this.field_l = 0;
    }

    final static void d(byte param0) {
        int var1 = 0;
        int var1Lifetime1;
        int var1Lifetime2;
        if (fl.field_a == 10) {
          gf.a((byte) 41);
          fl.field_a = 11;
          ma.field_p = true;
          var1 = 39 / ((46 - param0) / 34);
          return;
        }
        if (!nm.c(-23022)) {
          gf.a((byte) 41);
          fl.field_a = 11;
          ma.field_p = true;
          var1Lifetime1 = 39 / ((46 - param0) / 34);
          return;
        }
        ma.field_p = true;
        var1Lifetime2 = 39 / ((46 - param0) / 34);
    }

    final void a(wk param0, boolean param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = param0.a(this.field_m, (byte) -61);
          var4 = param0.a(this.field_q, 0);
          this.field_o.h(pj.a(var4, 51, var3_int));
          if (!param1) {
            return;
          }
          if (var3_int >= -256 &&
            -256 <= var4 &&
            var3_int <= bd.field_e + 256 &&
            256 + nh.field_P >= var4) {
            if (this.field_l < 256) {
              stackIn_11_0 = (-this.field_i + 256) * this.field_l >> 10;
            } else {
              stackIn_11_0 = -this.field_i + 256 >> 2;
            }
            var5 = stackIn_11_0;
            bi.d(var3_int, var4, this.field_i, 0, var5);
            so.b(wk.field_o, -256 + var3_int, -256 + var4, this.field_l);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("nc.C(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    nc(int param0, int param1) {
        this.field_s = 0;
        this.field_o = null;
        this.field_i = 0;
        this.field_l = 0;
        this.field_q = param1;
        this.field_n = 0;
        this.field_h = 3;
        this.field_m = param0;
        this.field_o = kh.a(17, false);
    }

    static {
        field_r = null;
        field_j = 0;
    }
}
