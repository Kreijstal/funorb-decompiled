/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kf extends ki {
    private int field_I;
    static String field_D;
    static rb[] field_G;
    private i field_E;
    static String field_F;
    boolean field_J;
    static String field_H;

    kf(i param0, int param1, int param2) {
        super(-param1 + og.field_f >> 1, -param2 + wc.field_e >> 1, param1, param2, (j) null);
        try {
          this.field_J = false;
          this.field_I = 0;
          this.field_E = param0;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "kf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    boolean e(byte param0) {
        if (param0 != 124) {
          field_H = (String) null;
          this.field_I = this.a((byte) 11);
          if (this.field_I != 0) {
            return false;
          }
          if (!this.field_J) {
            return true;
          }
          return false;
        }
        this.field_I = this.a((byte) 11);
        if (this.field_I != 0) {
          return false;
        }
        if (!this.field_J) {
          return true;
        }
        return false;
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        fl.b((byte) 91);
        if (param0 == 97) {
          mi.d(param1, param2, param3, param4);
          return;
        }
        field_G = (rb[]) null;
        mi.d(param1, param2, param3, param4);
    }

    final void b(int param0, int param1, int param2) {
        this.b(param2, param0, og.field_f - param0 >> 1, 0, -param2 + wc.field_e >> 1);
        if (param1 != -2038584927) {
          String[] var5 = (String[]) null;
          kf.a(-72, (String[]) null);
        }
    }

    abstract void a(int param0, byte param1, int param2);

    boolean h(int param0) {
        boolean stackIn_11_0 = false;
        boolean stackIn_20_0 = false;
        boolean stackIn_32_0 = false;
        boolean stackIn_38_0 = false;
        int var2;
        int var3;
        int var2Lifetime1;
        int var3Lifetime1;
        if (param0 != 1784) {
          kf.a((byte) -47, 114, 13, 107, 118);
          var2 = this.a((byte) -104);
          var3 = -this.field_I + var2;
          if (var3 > 0) {
            this.field_I = this.field_I + (8 + var3 - 1) / 8;
          }
          if (0 <= var3) {
            if (this.field_I != 0) {
              return false;
            }
            if (var2 != 0) {
              return false;
            }
            stackIn_11_0 = !(this.field_J);
            return stackIn_11_0;
          }
          this.field_I = this.field_I + (-16 + var3 + 1) / 16;
          if (this.field_I != 0) {
            return false;
          }
          if (var2 != 0) {
            return false;
          }
          stackIn_20_0 = !(this.field_J);
          return stackIn_20_0;
        }
        var2Lifetime1 = this.a((byte) -104);
        var3Lifetime1 = -this.field_I + var2Lifetime1;
        if (var3Lifetime1 > 0) {
          this.field_I = this.field_I + (8 + var3Lifetime1 - 1) / 8;
        }
        if (0 <= var3Lifetime1) {
          stackIn_32_0 = (this.field_I == 0) && (var2Lifetime1 == 0) && (!this.field_J);
          return stackIn_32_0;
        }
        this.field_I = this.field_I + (-16 + var3Lifetime1 + 1) / 16;
        stackIn_38_0 = (this.field_I == 0) && (var2Lifetime1 == 0) && (!this.field_J);
        return stackIn_38_0;
    }

    final static void a(int param0, String[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1) {
            return;
          }
          if (k.field_d != null) {
            k.field_d.field_G.a(20870, param1);
          }
          if (null == sj.field_d) {
            return;
          }
          sj.field_d.field_F.a(20870, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("kf.WB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final int a(byte param0) {
        int var2 = 98 / ((-50 - param0) / 54);
        return !this.field_J ? 0 : this.field_E.d((byte) 109) == this ? 256 : 0;
    }

    final rc d(byte param0) {
        rc var2 = super.d(param0);
        if (var2 != null) {
          return var2;
        }
        return (rc) (this);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (this.field_I == 0) {
          return;
        }
        if (256 <= this.field_I) {
          if (param1 == 0) {
            this.a(this.field_m + param2, (byte) 55, this.field_j + param0);
            super.a(param0, param1, param2, param3 ^ 0);
            return;
          }
          return;
        }
        if (jj.field_x == null) {
          jj.field_x = new o(this.field_t, this.field_x);
          cl.a(-100, jj.field_x);
          mi.a();
          this.a(param3, (byte) 94, 0);
          super.a(-this.field_j - param0, param1, -this.field_m - param2, 0);
          mf.e(4096);
          jj.field_x.c(this.field_m + param2, this.field_j + param0, this.field_I);
          return;
        }
        if (jj.field_x.field_p < this.field_t) {
          jj.field_x = new o(this.field_t, this.field_x);
          cl.a(-100, jj.field_x);
          mi.a();
          this.a(param3, (byte) 94, 0);
          super.a(-this.field_j - param0, param1, -this.field_m - param2, 0);
          mf.e(4096);
          jj.field_x.c(this.field_m + param2, this.field_j + param0, this.field_I);
          return;
        }
        if (jj.field_x.field_t < this.field_x) {
          jj.field_x = new o(this.field_t, this.field_x);
          cl.a(-100, jj.field_x);
          mi.a();
          this.a(param3, (byte) 94, 0);
          super.a(-this.field_j - param0, param1, -this.field_m - param2, 0);
          mf.e(4096);
          jj.field_x.c(this.field_m + param2, this.field_j + param0, this.field_I);
          return;
        }
        cl.a(-100, jj.field_x);
        mi.a();
        this.a(param3, (byte) 94, 0);
        super.a(-this.field_j - param0, param1, -this.field_m - param2, 0);
        mf.e(4096);
        jj.field_x.c(this.field_m + param2, this.field_j + param0, this.field_I);
    }

    public static void i(int param0) {
        field_G = null;
        field_F = null;
        if (param0 >= 16) {
          field_H = null;
          field_D = null;
          return;
        }
        field_D = (String) null;
        field_H = null;
        field_D = null;
    }

    static {
        field_H = "Username: ";
        field_F = "Return to game";
    }
}
