/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class al extends nb {
    static ng field_C;
    private eg field_B;
    boolean field_D;
    private int field_E;
    static String field_G;
    static gk field_F;
    static ei field_H;

    private final int g(int param0) {
        if (param0 < -70) {
          return this.field_D ? this == this.field_B.e(false) ? 256 : 0 : 0;
        }
        this.field_E = -87;
        return this.field_D ? this == this.field_B.e(false) ? 256 : 0 : 0;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (this.field_E == 0) {
          return;
        }
        if (256 <= this.field_E) {
          if (param3 != 0) {
            return;
          }
          this.a(param1 + this.field_o, (byte) -99, this.field_t + param2);
          super.a((byte) -115, param1, param2, param3);
          return;
        }
        if (ki.field_c == null) {
          ki.field_c = new db(this.field_j, this.field_v);
          de.a(ki.field_c, param0 + 121);
          lf.a();
          this.a(0, (byte) 115, 0);
          super.a(param0, -this.field_o - param1, -param2 - this.field_t, param3);
          pd.a(-22949);
          ki.field_c.b(param2 + this.field_t, this.field_o + param1, this.field_E);
          return;
        }
        if (ki.field_c.field_p < this.field_j) {
          ki.field_c = new db(this.field_j, this.field_v);
          de.a(ki.field_c, param0 + 121);
          lf.a();
          this.a(0, (byte) 115, 0);
          super.a(param0, -this.field_o - param1, -param2 - this.field_t, param3);
          pd.a(-22949);
          ki.field_c.b(param2 + this.field_t, this.field_o + param1, this.field_E);
          return;
        }
        if (this.field_v <= ki.field_c.field_u) {
          de.a(ki.field_c, param0 + 121);
          lf.a();
          this.a(0, (byte) 115, 0);
          super.a(param0, -this.field_o - param1, -param2 - this.field_t, param3);
          pd.a(-22949);
          ki.field_c.b(param2 + this.field_t, this.field_o + param1, this.field_E);
          return;
        }
        ki.field_c = new db(this.field_j, this.field_v);
        de.a(ki.field_c, param0 + 121);
        lf.a();
        this.a(0, (byte) 115, 0);
        super.a(param0, -this.field_o - param1, -param2 - this.field_t, param3);
        pd.a(-22949);
        ki.field_c.b(param2 + this.field_t, this.field_o + param1, this.field_E);
    }

    boolean a(byte param0) {
        if (param0 != 26) {
          this.a(-114, (byte) -25, 68);
          this.field_E = this.g(-101);
          if (0 != this.field_E) {
            return false;
          }
          if (!this.field_D) {
            return true;
          }
          return false;
        }
        this.field_E = this.g(-101);
        if (0 != this.field_E) {
          return false;
        }
        if (!this.field_D) {
          return true;
        }
        return false;
    }

    al(eg param0, int param1, int param2) {
        super(-param1 + ql.field_O >> 1, kg.field_C - param2 >> 1, param1, param2, (rd) null);
        try {
          this.field_D = false;
          this.field_E = 0;
          this.field_B = param0;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "al.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final w e(int param0) {
        w var2 = super.e(param0);
        if (var2 != null) {
          return var2;
        }
        return (w) (this);
    }

    public static void d(byte param0) {
        if (param0 <= 0) {
          return;
        }
        field_G = null;
        field_F = null;
        field_C = null;
        field_H = null;
    }

    boolean f(byte param0) {
        boolean stackIn_11_0 = false;
        boolean stackIn_21_0 = false;
        boolean stackIn_30_0 = false;
        boolean stackIn_36_0 = false;
        int var2;
        int var3;
        var2 = this.g(-111);
        var3 = -this.field_E + var2;
        if (var3 > 0) {
          this.field_E = this.field_E + (-1 + (var3 + 8)) / 8;
        }
        if (param0 > -21) {
          al.e((byte) -102);
          if (0 <= var3) {
            if (this.field_E != 0) {
              return false;
            }
            if (var2 != 0) {
              return false;
            }
            stackIn_11_0 = !(this.field_D);
            return stackIn_11_0;
          }
          this.field_E = this.field_E + (var3 - 16 + 1) / 16;
          if (this.field_E != 0) {
            return false;
          }
          if (var2 != 0) {
            return false;
          }
          stackIn_21_0 = !(this.field_D);
          return stackIn_21_0;
        }
        if (0 <= var3) {
          stackIn_30_0 = (this.field_E == 0) && (var2 == 0) && (!this.field_D);
          return stackIn_30_0;
        }
        this.field_E = this.field_E + (var3 - 16 + 1) / 16;
        stackIn_36_0 = (this.field_E == 0) && (var2 == 0) && (!this.field_D);
        return stackIn_36_0;
    }

    abstract void a(int param0, byte param1, int param2);

    final static void a(int param0, String param1, float param2) {
        try {
          pb.field_j = param1;
          tl.field_g = param2;
          if (param0 != 16) {
            al.e((byte) 114);
          }
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "al.RA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void b(int param0, int param1, int param2) {
        this.a(param2, param0, true, -param2 + kg.field_C >> 1, ql.field_O - param0 >> 1);
        if (param1 >= -94) {
          field_H = (ei) null;
        }
    }

    final static Boolean e(byte param0) {
        if (param0 >= -109) {
          return (Boolean) null;
        }
        Boolean var1 = wh.field_d;
        wh.field_d = null;
        return var1;
    }

    static {
        field_G = "Create a free account to start using this feature";
        field_C = new ng();
        field_F = new gk();
    }
}
