/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fwa {
    private pfa field_i;
    static llb field_a;
    static coa field_g;
    private java.math.BigInteger field_e;
    static int field_h;
    private ga[] field_f;
    private java.math.BigInteger field_b;
    private ona field_j;
    private km field_d;
    private ds field_c;

    public static void b(int param0) {
        field_a = null;
        if (param0 != 5) {
          int[] var2 = (int[]) null;
          fwa.a(69, -75, (int[]) null);
        }
        field_g = null;
    }

    final boolean a(boolean param0) {
        int var7 = 0;
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var8;
        ds var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = VoidHunters.field_G;
        if (null != this.field_c) {
          return true;
        }
        if (null == this.field_d) {
          if (this.field_j.d(74)) {
            return false;
          }
          this.field_d = this.field_j.a(true, -21, 255, (byte) 0, 255);
        }
        if (this.field_d.field_n) {
          return false;
        }
        var10 = new ds(this.field_d.a(-94));
        var10.field_e = 5;
        var3 = var10.e((byte) -108);
        var10.field_e = var10.field_e + 72 * var3;
        var13 = new byte[var10.field_h.length - var10.field_e];
        var11 = var13;
        var4 = var11;
        var10.a(0, var4, (byte) -59, var13.length);
        if (null != this.field_b &&
          null != this.field_e) {
          var12 = new java.math.BigInteger(var13);
          var7_ref_java_math_BigInteger = var12.modPow(this.field_b, this.field_e);
          var5 = var7_ref_java_math_BigInteger.toByteArray();
        } else {
          var5 = var4;
        }
        if (var5.length != 65) {
          throw new RuntimeException();
        }
        var15 = fqb.a((byte) 25, -var13.length + (var10.field_e - 5), var10.field_h, 5);
        if (!param0) {
          return true;
        }
        for (var7 = 0; var7 < 64; var7++) {
          if (var15[var7] != var5[var7 + 1]) {
            throw new RuntimeException();
          }
        }
        this.field_c = var10;
        this.field_f = new ga[var3];
        return true;
    }

    final void a(int param0) {
        int var2;
        int var3;
        int var4;
        int var2Lifetime1;
        var3 = VoidHunters.field_G;
        if (this.field_f == null) {
          return;
        }
        for (var2 = param0; this.field_f.length > var2; var2++) {
          if (null != this.field_f[var2]) {
            this.field_f[var2].c(param0 + 0);
          }
        }
        var4 = 0;
        var2Lifetime1 = var4;
        while (var4 < this.field_f.length) {
          if (this.field_f[var4] != null) {
            this.field_f[var4].b(-83);
          }
          var4++;
        }
        return;
    }

    final ga a(int param0, int param1, fo param2, fo param3, boolean param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        ga var9 = null;
        byte[] var13 = null;
        ga stackIn_8_0 = null;
        ga stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_c == null) {
            throw new RuntimeException();
          }
          if (param0 >= 0 &&
            this.field_f.length > param0) {
            if (null != this.field_f[param0]) {
              stackIn_8_0 = this.field_f[param0];
              return stackIn_8_0;
            }
            this.field_c.field_e = 6 + 72 * param0;
            var6_int = this.field_c.h(param1 ^ 20);
            var7 = this.field_c.h(47);
            var13 = new byte[64];
            this.field_c.a(0, var13, (byte) -59, 64);
            var9 = new ga(param0, param3, param2, this.field_j, this.field_i, var6_int, var13, var7, param4);
            if (param1 != 5) {
              this.a(false);
            }
            this.field_f[param0] = var9;
            stackIn_12_0 = var9;
            return stackIn_12_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("fwa.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param4).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, int[] param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var6 = 0;
        int var4Lifetime1;
        var5 = VoidHunters.field_G;
        try {
          if (param2 == null) {
            return false;
          }
          if (param2.length == 0) {
            return false;
          }
          var3_int = -1;
          for (var4 = 0; param2.length > var4; var4++) {
            if (param0 != param2[var4]) {
              continue;
            }
            var3_int = var4;
            break;
          }
          if (-1 == var3_int) {
            return false;
          }
          var6 = var3_int + param1;
          var4Lifetime1 = var6;
          while (param2.length > var6) {
            param2[-1 + var6] = param2[var6];
            var6++;
          }
          param2[param2.length - 1] = param0;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("fwa.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    fwa(ona param0, pfa param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    private fwa(ona param0, pfa param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        try {
          this.field_e = param3;
          this.field_b = param2;
          this.field_i = param1;
          this.field_j = param0;
          if (!this.field_j.d(52)) {
            this.field_d = this.field_j.a(true, -21, 255, (byte) 0, 255);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "fwa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = 6;
    }
}
