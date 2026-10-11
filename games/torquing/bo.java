/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bo {
    private ac field_b;
    private jp field_g;
    private co field_c;
    private java.math.BigInteger field_a;
    private gl[] field_f;
    private java.math.BigInteger field_j;
    static int field_d;
    static uc field_e;
    static ei field_l;
    private fj field_h;
    static String field_i;
    static int field_k;

    public static void a(int param0) {
        if (param0 != 21384) {
          field_i = (String) null;
        }
        field_i = null;
        field_e = null;
        field_l = null;
    }

    bo(jp param0, co param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final void a(boolean param0) {
        int var2;
        int var3;
        int var4;
        int var2Lifetime1;
        var3 = Torquing.field_u;
        if (this.field_f == null) {
          return;
        }
        for (var2 = 0; var2 < this.field_f.length; var2++) {
          if (null != this.field_f[var2]) {
            this.field_f[var2].c((byte) -94);
          }
        }
        if (param0) {
          this.a(true);
        }
        var4 = 0;
        var2Lifetime1 = var4;
        while (var4 < this.field_f.length) {
          if (this.field_f[var4] != null) {
            this.field_f[var4].b(-1);
          }
          var4++;
        }
        return;
    }

    final gl a(pb param0, byte param1, int param2, pb param3, boolean param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        gl var9 = null;
        byte[] var13 = null;
        gl stackIn_9_0 = null;
        gl stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == this.field_h) {
            throw new RuntimeException();
          }
          if (param2 >= 0 &&
            param2 < this.field_f.length) {
            if (this.field_f[param2] != null) {
              stackIn_9_0 = this.field_f[param2];
              return stackIn_9_0;
            }
            this.field_h.field_n = param2 * 72 + 6;
            var6_int = this.field_h.c((byte) -127);
            var7 = this.field_h.c((byte) -49);
            var13 = new byte[64];
            this.field_h.a(48, 64, var13, 0);
            var9 = new gl(param2, param0, param3, this.field_g, this.field_c, var6_int, var13, var7, param4);
            this.field_f[param2] = var9;
            if (param1 != 101) {
              field_k = -42;
            }
            stackIn_13_0 = var9;
            return stackIn_13_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("bo.B(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param4).append(')').toString());
        }
    }

    final boolean a(byte param0) {
        int var7 = 0;
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var8;
        fj var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = Torquing.field_u;
        if (null != this.field_h) {
          return true;
        }
        if (null == this.field_b) {
          if (this.field_g.a(20)) {
            return false;
          }
          this.field_b = this.field_g.a((byte) 0, 255, true, (byte) -51, 255);
        }
        if (this.field_b.field_r) {
          return false;
        }
        var10 = new fj(this.field_b.c((byte) 119));
        if (param0 != -74) {
          field_l = (ei) null;
        }
        var10.field_n = 5;
        var3 = var10.i((byte) -101);
        var10.field_n = var10.field_n + 72 * var3;
        var13 = new byte[-var10.field_n + var10.field_j.length];
        var11 = var13;
        var4 = var11;
        var10.a(48, var13.length, var13, 0);
        if (null != this.field_j &&
          this.field_a != null) {
          var12 = new java.math.BigInteger(var13);
          var7_ref_java_math_BigInteger = var12.modPow(this.field_j, this.field_a);
          var5 = var7_ref_java_math_BigInteger.toByteArray();
        } else {
          var5 = var4;
        }
        if (65 != var5.length) {
          throw new RuntimeException();
        }
        var15 = np.a(5, var10.field_j, -5 + (var10.field_n - var13.length), -81);
        for (var7 = 0; var7 < 64; var7++) {
          if (var5[var7 + 1] != var15[var7]) {
            throw new RuntimeException();
          }
        }
        this.field_f = new gl[var3];
        this.field_h = var10;
        return true;
    }

    private bo(jp param0, co param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        try {
          this.field_c = param1;
          this.field_a = param3;
          this.field_j = param2;
          this.field_g = param0;
          if (!this.field_g.a(20)) {
            this.field_b = this.field_g.a((byte) 0, 255, true, (byte) -51, 255);
          }
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "bo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = "Waiting for graphics";
        field_l = new ei();
    }
}
