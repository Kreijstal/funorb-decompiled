/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class b extends kj {
    private si field_L;
    static int[] field_N;
    static int field_J;
    static int field_M;
    boolean field_K;
    static String field_R;
    private int field_P;

    final void a(int param0, int param1, boolean param2, int param3) {
        if (this.field_P == 0) {
          return;
        }
        if (this.field_P >= 256) {
          if (param3 != 0) {
            return;
          }
          this.c(103, this.field_i + param0, param1 + this.field_m);
          super.a(param0, param1, false, param3);
          return;
        }
        if (param2) {
          this.b(-50, 9, 119);
        }
        if (null == nb.field_a) {
          nb.field_a = new ka(this.field_p, this.field_l);
          ad.a(-15, nb.field_a);
          qg.b();
          this.c(103, 0, 0);
          super.a(-param0 - this.field_i, -this.field_m - param1, param2, param3);
          ie.b((byte) -9);
          nb.field_a.d(param1 + this.field_m, this.field_i + param0, this.field_P);
          return;
        }
        if (this.field_p > nb.field_a.field_u) {
          nb.field_a = new ka(this.field_p, this.field_l);
          ad.a(-15, nb.field_a);
          qg.b();
          this.c(103, 0, 0);
          super.a(-param0 - this.field_i, -this.field_m - param1, param2, param3);
          ie.b((byte) -9);
          nb.field_a.d(param1 + this.field_m, this.field_i + param0, this.field_P);
          return;
        }
        if (nb.field_a.field_x >= this.field_l) {
          ad.a(-15, nb.field_a);
          qg.b();
          this.c(103, 0, 0);
          super.a(-param0 - this.field_i, -this.field_m - param1, param2, param3);
          ie.b((byte) -9);
          nb.field_a.d(param1 + this.field_m, this.field_i + param0, this.field_P);
          return;
        }
        nb.field_a = new ka(this.field_p, this.field_l);
        ad.a(-15, nb.field_a);
        qg.b();
        this.c(103, 0, 0);
        super.a(-param0 - this.field_i, -this.field_m - param1, param2, param3);
        ie.b((byte) -9);
        nb.field_a.d(param1 + this.field_m, this.field_i + param0, this.field_P);
    }

    final void b(int param0, int param1, int param2) {
        if (param0 == 0) {
          this.a((byte) 113, -param2 + TorChallenge.field_G >> 1, param1, param2, -param1 + md.field_h >> 1);
          return;
        }
    }

    private final int i(int param0) {
        if (param0 == 0) {
          return !this.field_K ? 0 : this == this.field_L.f((byte) 123) ? 256 : 0;
        }
        return 92;
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = gl.field_l[param5][param2][1][0];
        int var8 = gl.field_l[param5][param2][1][1];
        qg.a(ae.field_y);
        qg.a(var7, param6, var8, param4);
        we.field_e[param1][param2].a(var7, param6);
        if (param0 < 105) {
          b.a(-8);
        } else {
          qg.b(ae.field_y);
          return;
        }
        qg.b(ae.field_y);
    }

    abstract void c(int param0, int param1, int param2);

    public static void a(int param0) {
        field_N = null;
        field_R = null;
        if (param0 != 0) {
          field_R = (String) null;
        }
    }

    final ee d(byte param0) {
        ee var2 = super.d(param0);
        if (var2 != null) {
          return var2;
        }
        return (ee) (this);
    }

    boolean h(int param0) {
        if (param0 < 83) {
          this.j(-66);
          this.field_P = this.i(0);
          if (this.field_P != 0) {
            return false;
          }
          if (!this.field_K) {
            return true;
          }
          return false;
        }
        this.field_P = this.i(0);
        if (this.field_P != 0) {
          return false;
        }
        if (!this.field_K) {
          return true;
        }
        return false;
    }

    boolean j(int param0) {
        boolean stackIn_10_0 = false;
        boolean stackIn_19_0 = false;
        boolean stackIn_29_0 = false;
        boolean stackIn_38_0 = false;
        int var2;
        int var3;
        var2 = this.i(0);
        var3 = var2 - this.field_P;
        if (var3 > 0) {
          this.field_P = this.field_P + (-1 + (var3 + 8)) / 8;
          if (var3 >= 0) {
            if (param0 != 1) {
              return false;
            }
            if (0 != this.field_P) {
              return false;
            }
            if (var2 != 0) {
              return false;
            }
            stackIn_10_0 = !(this.field_K);
            return stackIn_10_0;
          }
          this.field_P = this.field_P + (-16 + var3 + 1) / 16;
          if (param0 != 1) {
            return false;
          }
          stackIn_19_0 = (0 == this.field_P) && (var2 == 0) && (!this.field_K);
          return stackIn_19_0;
        }
        if (var3 >= 0) {
          if (param0 != 1) {
            return false;
          }
          stackIn_38_0 = (0 == this.field_P) && (var2 == 0) && (!this.field_K);
          return stackIn_38_0;
        }
        this.field_P = this.field_P + (-16 + var3 + 1) / 16;
        if (param0 != 1) {
          return false;
        }
        stackIn_29_0 = (0 == this.field_P) && (var2 == 0) && (!this.field_K);
        return stackIn_29_0;
    }

    b(si param0, int param1, int param2) {
        super(TorChallenge.field_G - param1 >> 1, md.field_h - param2 >> 1, param1, param2, (j) null);
        try {
          this.field_P = 0;
          this.field_L = param0;
          this.field_K = false;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "b.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_N = new int[]{0, 0, 0, 0, 0, 1};
        field_M = 0;
        field_R = "Back";
    }
}
