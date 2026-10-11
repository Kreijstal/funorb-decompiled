/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bp {
    private og field_e;
    private java.math.BigInteger field_b;
    static String[] field_a;
    static jk field_h;
    private java.math.BigInteger field_c;
    private sh field_i;
    private om[] field_g;
    static String field_j;
    private de field_d;
    private pc field_f;

    public static void a(int param0) {
        field_j = null;
        field_h = null;
        if (param0 != -16785) {
          bp.a(23);
        }
        field_a = null;
    }

    final om a(na param0, byte param1, boolean param2, int param3, na param4) {
        om stackIn_10_0 = null;
        om stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        om var9 = null;
        byte[] var13 = null;
        try {
          if (this.field_d == null) {
            throw new RuntimeException();
          }
          if (param3 >= 0 &&
            this.field_g.length > param3) {
            if (this.field_g[param3] != null) {
              stackIn_10_0 = this.field_g[param3];
              return stackIn_10_0;
            }
            this.field_d.field_j = 72 * param3 + 6;
            if (param1 >= -99) {
              this.field_b = (java.math.BigInteger) null;
            }
            var6_int = this.field_d.c(89);
            var7 = this.field_d.c(-95);
            var13 = new byte[64];
            this.field_d.a(64, 0, var13, 11240);
            var9 = new om(param3, param0, param4, this.field_f, this.field_i, var6_int, var13, var7, param2);
            this.field_g[param3] = var9;
            stackIn_14_0 = var9;
            return stackIn_14_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("bp.B(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    bp(pc param0, sh param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final boolean a(byte param0) {
        int var7 = 0;
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var8;
        de var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = ZombieDawn.field_J;
        if (this.field_d != null) {
          return true;
        }
        if (null == this.field_e) {
          if (this.field_f.b(107)) {
            return false;
          }
          this.field_e = this.field_f.a((byte) 0, true, 255, (byte) -102, 255);
        }
        if (this.field_e.field_q) {
          return false;
        }
        var10 = new de(this.field_e.d(0));
        var10.field_j = 5;
        var3 = var10.d((byte) -118);
        var10.field_j = var10.field_j + 72 * var3;
        var13 = new byte[var10.field_h.length - var10.field_j];
        var11 = var13;
        var4 = var11;
        var10.a(var13.length, 0, var13, 11240);
        if (null != this.field_b &&
          this.field_c != null) {
          var12 = new java.math.BigInteger(var13);
          var7_ref_java_math_BigInteger = var12.modPow(this.field_b, this.field_c);
          var5 = var7_ref_java_math_BigInteger.toByteArray();
        } else {
          var5 = var4;
        }
        if (65 != var5.length) {
          throw new RuntimeException();
        }
        var15 = nl.a(5, -5 + (var10.field_j - var13.length), -117, var10.field_h);
        for (var7 = 0; var7 < 64; var7++) {
          if (var15[var7] != var5[var7 + 1]) {
            throw new RuntimeException();
          }
        }
        if (param0 != 0) {
          field_j = (String) null;
        }
        this.field_g = new om[var3];
        this.field_d = var10;
        return true;
    }

    final void a(boolean param0) {
        int var2;
        int var3;
        int var4;
        int var2Lifetime1;
        var3 = ZombieDawn.field_J;
        if (this.field_g == null) {
          return;
        }
        for (var2 = 0; this.field_g.length > var2; var2++) {
          if (null != this.field_g[var2]) {
            this.field_g[var2].b(0);
          }
        }
        var4 = 0;
        var2Lifetime1 = var4;
        while (this.field_g.length > var4) {
          if (this.field_g[var4] != null) {
            this.field_g[var4].a(84);
          }
          var4++;
        }
        if (!param0) {
          bp.a(79);
        }
        return;
    }

    private bp(pc param0, sh param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_f = param0;
          this.field_c = param3;
          this.field_i = param1;
          this.field_b = param2;
          if (!this.field_f.b(105)) {
            this.field_e = this.field_f.a((byte) 0, true, 255, (byte) 50, 255);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("bp.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_j = "Age:";
    }
}
