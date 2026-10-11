/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk {
    private java.math.BigInteger field_c;
    static la field_d;
    private hk[] field_e;
    private n field_b;
    private s field_h;
    private kk field_a;
    private sb field_f;
    private java.math.BigInteger field_g;

    public static void b(boolean param0) {
        if (!param0) {
          field_d = (la) null;
          field_d = null;
          return;
        }
        field_d = null;
    }

    final void a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var2Lifetime1;
        var3 = EscapeVector.field_A;
        if (this.field_e == null) {
          return;
        }
        for (var2 = 0; this.field_e.length > var2; var2++) {
          if (null != this.field_e[var2]) {
            this.field_e[var2].d(param0 - 13);
          }
        }
        var4 = 0;
        var2Lifetime1 = var4;
        while (this.field_e.length > var4) {
          if (this.field_e[var4] != null) {
            this.field_e[var4].c(-26);
          }
          var4++;
        }
        if (param0 == 12) {
          return;
        }
        this.a(false);
        return;
    }

    final hk a(boolean param0, int param1, jg param2, int param3, jg param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        hk var9 = null;
        byte[] var13 = null;
        hk stackIn_8_0 = null;
        hk stackIn_11_0 = null;
        hk stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_b == null) {
            throw new RuntimeException();
          }
          if (0 <= param3 &&
            param3 < this.field_e.length) {
            if (this.field_e[param3] != null) {
              stackIn_8_0 = this.field_e[param3];
              return stackIn_8_0;
            }
            this.field_b.field_m = 6 + param3 * 72;
            var6_int = this.field_b.g(param1 ^ -4932);
            var7 = this.field_b.g(-5053);
            var13 = new byte[64];
            this.field_b.a(var13, (byte) -96, 0, 64);
            var9 = new hk(param3, param4, param2, this.field_f, this.field_a, var6_int, var13, var7, param0);
            if (param1 != 255) {
              stackIn_11_0 = (hk) null;
              return stackIn_11_0;
            }
            this.field_e[param3] = var9;
            stackIn_13_0 = var9;
            return stackIn_13_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("sk.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    sk(sb param0, kk param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final boolean a(boolean param0) {
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var7;
        int var8;
        n var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var16;
        byte[] var17;
        int var7Lifetime1;
        var8 = EscapeVector.field_A;
        if (null != this.field_b) {
          return true;
        }
        if (null == this.field_h) {
          if (this.field_f.c(20)) {
            return false;
          }
          this.field_h = this.field_f.a(255, true, (byte) 0, 255, (byte) 0);
        }
        if (this.field_h.field_u) {
          return false;
        }
        var10 = new n(this.field_h.a(true));
        var10.field_m = 5;
        var3 = var10.e(0);
        var10.field_m = var10.field_m + 72 * var3;
        var13 = new byte[var10.field_g.length - var10.field_m];
        var11 = var13;
        var4 = var11;
        var10.a(var4, (byte) -96, 0, var13.length);
        if (this.field_g == null) {
          var5 = var4;
        } else {
          if (null == this.field_c) {
            var5 = var4;
            if (65 != var5.length) {
              throw new RuntimeException();
            }
            if (param0) {
              return true;
            }
            var16 = vn.a(var10.field_g, 5, -5 + (-var13.length + var10.field_m), 0);
            for (var7 = 0; var7 < 64; var7++) {
              if (var5[1 + var7] != var16[var7]) {
                throw new RuntimeException();
              }
            }
            this.field_e = new hk[var3];
            this.field_b = var10;
            return true;
          }
          var12 = new java.math.BigInteger(var13);
          var7_ref_java_math_BigInteger = var12.modPow(this.field_g, this.field_c);
          var5 = var7_ref_java_math_BigInteger.toByteArray();
        }
        if (65 != var5.length) {
          throw new RuntimeException();
        }
        if (param0) {
          return true;
        }
        var17 = vn.a(var10.field_g, 5, -5 + (-var13.length + var10.field_m), 0);
        for (var7Lifetime1 = 0; var7Lifetime1 < 64; var7Lifetime1++) {
          if (var5[1 + var7Lifetime1] != var17[var7Lifetime1]) {
            throw new RuntimeException();
          }
        }
        this.field_e = new hk[var3];
        this.field_b = var10;
        return true;
    }

    private sk(sb param0, kk param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_a = param1;
          this.field_f = param0;
          this.field_c = param3;
          this.field_g = param2;
          if (this.field_f.c(20)) {
            return;
          }
          this.field_h = this.field_f.a(255, true, (byte) 0, 255, (byte) 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("sk.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
    }
}
