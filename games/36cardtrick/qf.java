/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qf extends g {
    private j field_D;
    private int field_H;
    static int field_F;
    boolean field_E;
    static ue field_J;
    static String[] field_I;
    static int field_G;

    final static int m(int param0) {
        if (param0 != -32749) {
          return -57;
        }
        return cc.field_d - cb.field_i;
    }

    qf(j param0, int param1, int param2) {
        super(-param1 + lb.field_g >> 1, kb.field_d - param2 >> 1, param1, param2, (ci) null);
        try {
          this.field_D = param0;
          this.field_E = false;
          this.field_H = 0;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "qf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        this.a(param0, -param0 + kb.field_d >> 1, param1, -param1 + lb.field_g >> 1, true);
        if (param2 != -1) {
          field_J = (ue) null;
        }
    }

    abstract void b(int param0, byte param1, int param2);

    public static void n(int param0) {
        field_J = null;
        field_I = null;
        if (param0 != 8736) {
          qf.m(111);
        }
    }

    private final int l(int param0) {
        if (param0 >= 66) {
          return !this.field_E ? 0 : this != this.field_D.d((byte) 10) ? 0 : 256;
        }
        this.field_D = (j) null;
        return !this.field_E ? 0 : this != this.field_D.d((byte) 10) ? 0 : 256;
    }

    final lk i(int param0) {
        lk var2 = super.i(param0 + 0);
        if (var2 != null) {
          return var2;
        }
        if (param0 == -1) {
          return (lk) (this);
        }
        field_F = -107;
        return (lk) (this);
    }

    boolean a(boolean param0) {
        boolean stackIn_11_0 = false;
        boolean stackIn_20_0 = false;
        boolean stackIn_32_0 = false;
        boolean stackIn_38_0 = false;
        int var2;
        int var3;
        int var2Lifetime1;
        int var3Lifetime1;
        if (!param0) {
          this.o(-76);
          var2 = this.l(70);
          var3 = var2 - this.field_H;
          if (var3 > 0) {
            this.field_H = this.field_H + (var3 + 7) / 8;
          }
          if (var3 >= 0) {
            if (0 != this.field_H) {
              return false;
            }
            if (var2 != 0) {
              return false;
            }
            stackIn_11_0 = !(this.field_E);
            return stackIn_11_0;
          }
          this.field_H = this.field_H + (var3 - 16 + 1) / 16;
          if (0 != this.field_H) {
            return false;
          }
          if (var2 != 0) {
            return false;
          }
          stackIn_20_0 = !(this.field_E);
          return stackIn_20_0;
        }
        var2Lifetime1 = this.l(70);
        var3Lifetime1 = var2Lifetime1 - this.field_H;
        if (var3Lifetime1 > 0) {
          this.field_H = this.field_H + (var3Lifetime1 + 7) / 8;
        }
        if (var3Lifetime1 >= 0) {
          stackIn_32_0 = (0 == this.field_H) && (var2Lifetime1 == 0) && (!this.field_E);
          return stackIn_32_0;
        }
        this.field_H = this.field_H + (var3Lifetime1 - 16 + 1) / 16;
        stackIn_38_0 = (0 == this.field_H) && (var2Lifetime1 == 0) && (!this.field_E);
        return stackIn_38_0;
    }

    boolean o(int param0) {
        if (param0 != 928516712) {
          this.b(-79, (byte) -32, 90);
          this.field_H = this.l(param0 ^ 928516616);
          if (this.field_H != 0) {
            return false;
          }
          if (!this.field_E) {
            return true;
          }
          return false;
        }
        this.field_H = this.l(param0 ^ 928516616);
        if (this.field_H != 0) {
          return false;
        }
        if (!this.field_E) {
          return true;
        }
        return false;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (~this.field_H == param2) {
          return;
        }
        if (256 <= this.field_H) {
          if (param3 != 0) {
            return;
          }
          this.b(param0 + this.field_o, (byte) -77, this.field_i + param1);
          super.a(param0, param1, -1, param3);
          return;
        }
        if (null == ad.field_j) {
          ad.field_j = new kc(this.field_h, this.field_q);
          dl.a(param2 ^ -128, ad.field_j);
          vj.d();
          this.b(0, (byte) -77, 0);
          super.a(-this.field_o - param0, -this.field_i - param1, -1, param3);
          gg.a(14756);
          ad.field_j.e(param0 + this.field_o, param1 + this.field_i, this.field_H);
          return;
        }
        if (this.field_h > ad.field_j.field_p) {
          ad.field_j = new kc(this.field_h, this.field_q);
          dl.a(param2 ^ -128, ad.field_j);
          vj.d();
          this.b(0, (byte) -77, 0);
          super.a(-this.field_o - param0, -this.field_i - param1, -1, param3);
          gg.a(14756);
          ad.field_j.e(param0 + this.field_o, param1 + this.field_i, this.field_H);
          return;
        }
        if (ad.field_j.field_o < this.field_q) {
          ad.field_j = new kc(this.field_h, this.field_q);
          dl.a(param2 ^ -128, ad.field_j);
          vj.d();
          this.b(0, (byte) -77, 0);
          super.a(-this.field_o - param0, -this.field_i - param1, -1, param3);
          gg.a(14756);
          ad.field_j.e(param0 + this.field_o, param1 + this.field_i, this.field_H);
          return;
        }
        dl.a(param2 ^ -128, ad.field_j);
        vj.d();
        this.b(0, (byte) -77, 0);
        super.a(-this.field_o - param0, -this.field_i - param1, -1, param3);
        gg.a(14756);
        ad.field_j.e(param0 + this.field_o, param1 + this.field_i, this.field_H);
    }

    static {
        field_G = 0;
        field_I = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
