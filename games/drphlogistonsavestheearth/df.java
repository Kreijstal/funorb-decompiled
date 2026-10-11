/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df {
    static q field_l;
    static vj field_a;
    static int field_h;
    private de[] field_e;
    static he[] field_f;
    static boolean field_o;
    static he[] field_k;
    private n field_d;
    private od field_c;
    private java.math.BigInteger field_n;
    private cm field_i;
    private gb field_j;
    static vj field_m;
    private java.math.BigInteger field_g;
    static String field_b;

    final void a(int param0) {
        int var2;
        int var3;
        int var4;
        int var2Lifetime1;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (null == this.field_e) {
          return;
        }
        for (var2 = 0; this.field_e.length > var2; var2++) {
          if (null != this.field_e[var2]) {
            this.field_e[var2].a(false);
          }
        }
        if (param0 != 64) {
          this.field_n = (java.math.BigInteger) null;
        }
        var4 = 0;
        var2Lifetime1 = var4;
        while (this.field_e.length > var4) {
          if (this.field_e[var4] != null) {
            this.field_e[var4].c(97);
          }
          var4++;
        }
        return;
    }

    final de a(int param0, boolean param1, ik param2, ik param3, byte param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        de var9 = null;
        byte[] var13 = null;
        de stackIn_10_0 = null;
        de stackIn_13_0 = null;
        de stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == this.field_c) {
            throw new RuntimeException();
          }
          if (param0 >= 0 &&
            param0 < this.field_e.length) {
            if (this.field_e[param0] != null) {
              stackIn_10_0 = this.field_e[param0];
              return stackIn_10_0;
            }
            this.field_c.field_j = param0 * 72 + 6;
            if (param4 < 64) {
              stackIn_13_0 = (de) null;
              return stackIn_13_0;
            }
            var6_int = this.field_c.h(-97);
            var7 = this.field_c.h(9);
            var13 = new byte[64];
            this.field_c.b(0, 64, 128, var13);
            var9 = new de(param0, param3, param2, this.field_j, this.field_d, var6_int, var13, var7, param1);
            this.field_e[param0] = var9;
            stackIn_15_0 = var9;
            return stackIn_15_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_18_0 = var6;
          stackIn_18_1 = new StringBuilder().append("df.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param4).append(')').toString());
        }
    }

    df(gb param0, n param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final static void a(byte param0) {
        p.field_a.field_c = 0;
        p.field_a.field_h = 0;
        int var1 = 19 % ((54 - param0) / 39);
    }

    final boolean b(int param0) {
        int var7 = 0;
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var8;
        od var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (this.field_c != null) {
          return true;
        }
        if (this.field_i == null) {
          if (this.field_j.a(true)) {
            return false;
          }
          this.field_i = this.field_j.a(255, 11259, (byte) 0, 255, true);
        }
        if (this.field_i.field_u) {
          return false;
        }
        var10 = new od(this.field_i.i(13095));
        var10.field_j = 5;
        var3 = var10.l(31760);
        var10.field_j = var10.field_j + var3 * 72;
        var13 = new byte[-var10.field_j + var10.field_h.length];
        var11 = var13;
        var4 = var11;
        var10.b(0, var13.length, 128, var13);
        if (null != this.field_n &&
          this.field_g != null) {
          var12 = new java.math.BigInteger(var13);
          var7_ref_java_math_BigInteger = var12.modPow(this.field_n, this.field_g);
          var5 = var7_ref_java_math_BigInteger.toByteArray();
        } else {
          var5 = var4;
        }
        if (param0 != 64) {
          field_f = (he[]) null;
        }
        if (65 != var5.length) {
          throw new RuntimeException();
        }
        var15 = b.a(5, 51, var10.field_h, -5 + var10.field_j - var13.length);
        for (var7 = 0; var7 < 64; var7++) {
          if (var15[var7] != var5[1 + var7]) {
            throw new RuntimeException();
          }
        }
        this.field_e = new de[var3];
        this.field_c = var10;
        return true;
    }

    public static void c(int param0) {
        field_a = null;
        field_k = null;
        int var1 = -124 % ((param0 + 2) / 60);
        field_b = null;
        field_l = null;
        field_f = null;
        field_m = null;
    }

    private df(gb param0, n param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        try {
          this.field_j = param0;
          this.field_d = param1;
          this.field_g = param3;
          this.field_n = param2;
          if (!this.field_j.a(true)) {
            this.field_i = this.field_j.a(255, 11259, (byte) 0, 255, true);
          }
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "df.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_o = false;
    }
}
