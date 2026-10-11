/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ud extends ch {
    static String field_O;
    private int field_J;
    static up[] field_I;
    boolean field_N;
    private kn field_M;
    static int[] field_L;
    static boolean field_K;

    abstract void a(int param0, int param1, boolean param2);

    final ng k(int param0) {
        ng var2 = super.k(48);
        int var3 = -47 / ((-51 - param0) / 39);
        if (var2 != null) {
          return var2;
        }
        return (ng) (this);
    }

    boolean a(byte param0) {
        this.field_J = this.d(false);
        if (param0 < 120) {
          field_L = (int[]) null;
          if (0 != this.field_J) {
            return false;
          }
          if (!this.field_N) {
            return true;
          }
          return false;
        }
        if (0 != this.field_J) {
          return false;
        }
        if (!this.field_N) {
          return true;
        }
        return false;
    }

    private final int d(boolean param0) {
        if (!param0) {
          return !this.field_N ? 0 : this == this.field_M.n(640) ? 256 : 0;
        }
        field_L = (int[]) null;
        return !this.field_N ? 0 : this == this.field_M.n(640) ? 256 : 0;
    }

    ud(kn param0, int param1, int param2) {
        super(kn.field_O - param1 >> 1, sl.field_c - param2 >> 1, param1, param2, (eb) null);
        try {
          this.field_M = param0;
          this.field_N = false;
          this.field_J = 0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ud.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 > -11) {
          return;
        }
        field_L = null;
        field_O = null;
        field_I = null;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        if (this.field_J == 0) {
          return;
        }
        if (256 <= this.field_J) {
          if (param1 != 0) {
            return;
          }
          this.a(param2 + this.field_z, param0 + this.field_p, true);
          super.a(param0, param1, param2, (byte) 119);
          return;
        }
        if (null == fd.field_a) {
          fd.field_a = new tf(this.field_E, this.field_C);
          h.a(-90, fd.field_a);
          t.d();
          this.a(0, 0, true);
          super.a(-this.field_p - param0, param1, -param2 - this.field_z, (byte) -61);
          var5 = -94 / ((param3 - 70) / 49);
          ia.a((byte) 92);
          fd.field_a.a(this.field_z + param2, this.field_p + param0, this.field_J);
          return;
        }
        if (fd.field_a.field_F < this.field_E) {
          fd.field_a = new tf(this.field_E, this.field_C);
          h.a(-90, fd.field_a);
          t.d();
          this.a(0, 0, true);
          super.a(-this.field_p - param0, param1, -param2 - this.field_z, (byte) -61);
          var5Lifetime1 = -94 / ((param3 - 70) / 49);
          ia.a((byte) 92);
          fd.field_a.a(this.field_z + param2, this.field_p + param0, this.field_J);
          return;
        }
        if (this.field_C > fd.field_a.field_E) {
          fd.field_a = new tf(this.field_E, this.field_C);
          h.a(-90, fd.field_a);
          t.d();
          this.a(0, 0, true);
          super.a(-this.field_p - param0, param1, -param2 - this.field_z, (byte) -61);
          var5Lifetime2 = -94 / ((param3 - 70) / 49);
          ia.a((byte) 92);
          fd.field_a.a(this.field_z + param2, this.field_p + param0, this.field_J);
          return;
        }
        h.a(-90, fd.field_a);
        t.d();
        this.a(0, 0, true);
        super.a(-this.field_p - param0, param1, -param2 - this.field_z, (byte) -61);
        var5Lifetime3 = -94 / ((param3 - 70) / 49);
        ia.a((byte) 92);
        fd.field_a.a(this.field_z + param2, this.field_p + param0, this.field_J);
    }

    boolean c(boolean param0) {
        boolean stackIn_8_0 = false;
        boolean stackIn_15_0 = false;
        boolean stackIn_24_0 = false;
        boolean stackIn_30_0 = false;
        boolean stackIn_39_0 = false;
        boolean stackIn_45_0 = false;
        boolean stackIn_53_0 = false;
        boolean stackIn_59_0 = false;
        int var2;
        int var3;
        int var2Lifetime1;
        int var3Lifetime1;
        if (param0) {
          this.a(-46, -6, false);
          var2 = this.d(param0);
          var3 = -this.field_J + var2;
          if (var3 <= 0) {
            if (var3 < 0) {
              this.field_J = this.field_J + (-16 + (var3 + 1)) / 16;
              if (this.field_J != 0) {
                return false;
              }
              if (var2 != 0) {
                return false;
              }
              stackIn_15_0 = !(this.field_N);
              return stackIn_15_0;
            }
            stackIn_8_0 = (this.field_J == 0) && (var2 == 0) && (!this.field_N);
            return stackIn_8_0;
          }
          this.field_J = this.field_J + (7 + var3) / 8;
          if (var3 >= 0) {
            stackIn_30_0 = (this.field_J == 0) && (var2 == 0) && (!this.field_N);
            return stackIn_30_0;
          }
          this.field_J = this.field_J + (-16 + (var3 + 1)) / 16;
          stackIn_24_0 = (this.field_J == 0) && (var2 == 0) && (!this.field_N);
          return stackIn_24_0;
        }
        var2Lifetime1 = this.d(param0);
        var3Lifetime1 = -this.field_J + var2Lifetime1;
        if (var3Lifetime1 <= 0) {
          if (var3Lifetime1 >= 0) {
            stackIn_53_0 = (this.field_J == 0) && (var2Lifetime1 == 0) && (!this.field_N);
            return stackIn_53_0;
          }
          this.field_J = this.field_J + (-16 + (var3Lifetime1 + 1)) / 16;
          stackIn_59_0 = (this.field_J == 0) && (var2Lifetime1 == 0) && (!this.field_N);
          return stackIn_59_0;
        }
        this.field_J = this.field_J + (7 + var3Lifetime1) / 8;
        if (var3Lifetime1 >= 0) {
          stackIn_39_0 = (this.field_J == 0) && (var2Lifetime1 == 0) && (!this.field_N);
          return stackIn_39_0;
        }
        this.field_J = this.field_J + (-16 + (var3Lifetime1 + 1)) / 16;
        stackIn_45_0 = (this.field_J == 0) && (var2Lifetime1 == 0) && (!this.field_N);
        return stackIn_45_0;
    }

    final void a(int param0, byte param1, int param2) {
        this.a(param2, (byte) 88, -param0 + sl.field_c >> 1, kn.field_O - param2 >> 1, param0);
        if (param1 != -110) {
          field_K = true;
        }
    }

    static {
        field_I = new up[50];
        field_L = new int[4];
        field_O = "<%0> wants to join";
        field_K = false;
    }
}
