/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fma {
    private qqa field_b;
    private java.math.BigInteger field_a;
    static String field_d;
    private java.math.BigInteger field_e;
    static iw field_f;
    private ss field_c;
    private qda field_h;
    private uia field_g;
    private js[] field_i;

    public static void a(byte param0) {
        int var1 = 82 % ((-34 - param0) / 61);
        field_f = null;
        field_d = null;
    }

    final boolean a(boolean param0) {
        int var3;
        byte[] var4;
        byte[] var5;
        int var7;
        int var8;
        byte[] var9;
        uia var10;
        byte[] var11;
        byte[] var13;
        byte[] var14;
        java.math.BigInteger var15;
        java.math.BigInteger var16;
        java.math.BigInteger var19;
        java.math.BigInteger var20;
        byte[] var22;
        byte[] var23;
        byte[] var24;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        byte[] var4Lifetime1;
        byte[] var5Lifetime1;
        byte[] var5Lifetime2;
        byte[] var11Lifetime1;
        byte[] var13Lifetime1;
        int var3Lifetime1;
        var8 = TombRacer.field_G ? 1 : 0;
        if (this.field_g != null) {
          return true;
        }
        if (null == this.field_b) {
          if (this.field_h.d(-21)) {
            return false;
          }
          this.field_b = this.field_h.a(255, true, 255, -21, (byte) 0);
        }
        if (this.field_b.field_m) {
          return false;
        }
        var10 = new uia(this.field_b.b((byte) -126));
        if (!param0) {
          var10.field_h = 5;
          var3 = var10.h(255);
          var10.field_h = var10.field_h + 72 * var3;
          var13 = new byte[-var10.field_h + var10.field_g.length];
          var11 = var13;
          var4 = var11;
          var10.a(var4, 0, -116, var13.length);
          if (null == this.field_e) {
            var5 = var4;
          } else {
            if (this.field_a == null) {
              var5 = var4;
              if (var5.length != 65) {
                throw new RuntimeException();
              }
              var23 = fja.a(-5 + (var10.field_h - var13.length), var10.field_g, 5, 8);
              for (var7 = 0; var7 < 64; var7++) {
                if (var23[var7] != var5[var7 + 1]) {
                  throw new RuntimeException();
                }
              }
              this.field_i = new js[var3];
              this.field_g = var10;
              return true;
            }
            var19 = new java.math.BigInteger(var13);
            var20 = var19.modPow(this.field_e, this.field_a);
            var5 = var20.toByteArray();
          }
          if (var5.length != 65) {
            throw new RuntimeException();
          }
          var24 = fja.a(-5 + (var10.field_h - var13.length), var10.field_g, 5, 8);
          for (var7Lifetime3 = 0; var7Lifetime3 < 64; var7Lifetime3++) {
            if (var24[var7Lifetime3] != var5[var7Lifetime3 + 1]) {
              throw new RuntimeException();
            }
          }
          this.field_i = new js[var3];
          this.field_g = var10;
          return true;
        }
        this.field_g = (uia) null;
        var10.field_h = 5;
        var3Lifetime1 = var10.h(255);
        var10.field_h = var10.field_h + 72 * var3Lifetime1;
        var13Lifetime1 = new byte[-var10.field_h + var10.field_g.length];
        var11Lifetime1 = var13Lifetime1;
        var4Lifetime1 = var11Lifetime1;
        var10.a(var4Lifetime1, 0, -116, var13Lifetime1.length);
        if (null == this.field_e) {
          var5Lifetime1 = var4Lifetime1;
          if (var5Lifetime1.length != 65) {
            throw new RuntimeException();
          }
          var14 = fja.a(-5 + (var10.field_h - var13Lifetime1.length), var10.field_g, 5, 8);
          var9 = var14;
          for (var7Lifetime1 = 0; var7Lifetime1 < 64; var7Lifetime1++) {
            if (var14[var7Lifetime1] != var5Lifetime1[var7Lifetime1 + 1]) {
              throw new RuntimeException();
            }
          }
          this.field_i = new js[var3Lifetime1];
          this.field_g = var10;
          return true;
        }
        if (this.field_a != null) {
          var15 = new java.math.BigInteger(var13Lifetime1);
          var16 = var15.modPow(this.field_e, this.field_a);
          var5Lifetime2 = var16.toByteArray();
        } else {
          var5Lifetime2 = var4Lifetime1;
        }
        if (var5Lifetime2.length != 65) {
          throw new RuntimeException();
        }
        var22 = fja.a(-5 + (var10.field_h - var13Lifetime1.length), var10.field_g, 5, 8);
        for (var7Lifetime2 = 0; var7Lifetime2 < 64; var7Lifetime2++) {
          if (var22[var7Lifetime2] != var5Lifetime2[var7Lifetime2 + 1]) {
            throw new RuntimeException();
          }
        }
        this.field_i = new js[var3Lifetime1];
        this.field_g = var10;
        return true;
    }

    final js a(ppa param0, int param1, ppa param2, boolean param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        js var9 = null;
        byte[] var13 = null;
        js stackIn_10_0 = null;
        js stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_g == null) {
            throw new RuntimeException();
          }
          if (param1 >= 0 &&
            this.field_i.length > param1) {
            if (null != this.field_i[param1]) {
              stackIn_10_0 = this.field_i[param1];
              return stackIn_10_0;
            }
            if (param4 <= 42) {
              fma.a((byte) -48);
            }
            this.field_g.field_h = param1 * 72 + 6;
            var6_int = this.field_g.e(121);
            var7 = this.field_g.e(-88);
            var13 = new byte[64];
            this.field_g.a(var13, 0, -107, 64);
            var9 = new js(param1, param0, param2, this.field_h, this.field_c, var6_int, var13, var7, param3);
            this.field_i[param1] = var9;
            stackIn_14_0 = var9;
            return stackIn_14_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("fma.C(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0) {
        int var2;
        int var3;
        int var4;
        int var2Lifetime1;
        var3 = TombRacer.field_G ? 1 : 0;
        if (this.field_i == null) {
          return;
        }
        for (var2 = 0; this.field_i.length > var2; var2++) {
          if (null != this.field_i[var2]) {
            this.field_i[var2].c(-28613);
          }
        }
        var4 = 0;
        var2Lifetime1 = var4;
        while (this.field_i.length > var4) {
          if (this.field_i[var4] != null) {
            this.field_i[var4].b(1000);
          }
          var4++;
        }
        if (param0 < -106) {
          return;
        }
        this.field_h = (qda) null;
        return;
    }

    fma(qda param0, ss param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    private fma(qda param0, ss param1, java.math.BigInteger param2, java.math.BigInteger param3) {
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
          this.field_e = param2;
          this.field_h = param0;
          this.field_a = param3;
          this.field_c = param1;
          if (!this.field_h.d(-21)) {
            this.field_b = this.field_h.a(255, true, 255, -21, (byte) 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("fma.<init>(");
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
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_d = "1st";
        field_f = new iw();
    }
}
