/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    private java.math.BigInteger field_e;
    static String field_c;
    private java.math.BigInteger field_g;
    private cd field_b;
    private fh[] field_i;
    private va field_h;
    private na field_a;
    private fi field_f;
    static java.math.BigInteger field_d;

    final static int a(int param0, int param1, boolean param2, int param3) {
        if (param3 != 72) {
          return -89;
        }
        return tf.a(-20232);
    }

    final void a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var2Lifetime1;
        var3 = wizardrun.field_H;
        if (this.field_i == null) {
          return;
        }
        for (var2 = 0; var2 < this.field_i.length; var2++) {
          if (null != this.field_i[var2]) {
            this.field_i[var2].a(param0 + 81);
          }
        }
        var4 = 0;
        var2Lifetime1 = var4;
        if (param0 != -84) {
          ad.a(-2, -101, true, -78);
        }
        while (var4 < this.field_i.length) {
          if (this.field_i[var4] != null) {
            this.field_i[var4].c((byte) 25);
          }
          var4++;
        }
        return;
    }

    final boolean b(byte param0) {
        int var7 = 0;
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var8;
        va var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = wizardrun.field_H;
        if (this.field_h != null) {
          return true;
        }
        if (this.field_f == null) {
          if (this.field_a.a(param0 + 3490)) {
            return false;
          }
          this.field_f = this.field_a.a(255, 255, (byte) -94, (byte) 0, true);
        }
        if (this.field_f.field_s) {
          return false;
        }
        var10 = new va(this.field_f.d(95));
        var10.field_m = 5;
        var3 = var10.f(255);
        var10.field_m = var10.field_m + 72 * var3;
        var13 = new byte[var10.field_k.length - var10.field_m];
        var11 = var13;
        var4 = var11;
        var10.a(true, var13.length, var13, 0);
        if (this.field_g != null &&
          this.field_e != null) {
          var12 = new java.math.BigInteger(var13);
          var7_ref_java_math_BigInteger = var12.modPow(this.field_g, this.field_e);
          var5 = var7_ref_java_math_BigInteger.toByteArray();
        } else {
          var5 = var4;
        }
        if (var5.length != 65) {
          throw new RuntimeException();
        }
        var15 = id.a(var10.field_k, 0, -5 + (-var13.length + var10.field_m), 5);
        if (param0 != -17) {
          ad.a(-98);
        }
        for (var7 = 0; var7 < 64; var7++) {
          if (var15[var7] != var5[1 + var7]) {
            throw new RuntimeException();
          }
        }
        this.field_i = new fh[var3];
        this.field_h = var10;
        return true;
    }

    final fh a(boolean param0, int param1, sg param2, int param3, sg param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        fh var9 = null;
        byte[] var13 = null;
        fh stackIn_8_0 = null;
        fh stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_h == null) {
            throw new RuntimeException();
          }
          if (param3 >= 0 &&
            param3 < this.field_i.length) {
            if (null != this.field_i[param3]) {
              stackIn_8_0 = this.field_i[param3];
              return stackIn_8_0;
            }
            this.field_h.field_m = param1 * param3 + 6;
            var6_int = this.field_h.i(255);
            var7 = this.field_h.i(param1 + 183);
            var13 = new byte[64];
            this.field_h.a(true, 64, var13, 0);
            var9 = new fh(param3, param2, param4, this.field_a, this.field_b, var6_int, var13, var7, param0);
            this.field_i[param3] = var9;
            stackIn_10_0 = var9;
            return stackIn_10_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("ad.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static sf a(String param0, int param1) {
        RuntimeException var2 = null;
        sf stackIn_5_0 = null;
        sf stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (we.field_c.a(true) &&
            !param0.equals(we.field_c.b((byte) 8))) {
            we.field_c = ql.a(param0, false);
          }
          if (param1 == 6) {
            stackIn_7_0 = we.field_c;
            return stackIn_7_0;
          }
          stackIn_5_0 = (sf) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("ad.G(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_d = null;
        int var1 = -94 % ((param0 + 39) / 58);
        field_c = null;
    }

    final static boolean a(CharSequence param0, byte param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > 104) {
            stackIn_4_0 = mi.a(param0, false, 0);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ad.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    ad(na param0, cd param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    private ad(na param0, cd param1, java.math.BigInteger param2, java.math.BigInteger param3) {
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
          this.field_b = param1;
          this.field_g = param2;
          this.field_e = param3;
          this.field_a = param0;
          if (!this.field_a.a(3473)) {
            this.field_f = this.field_a.a(255, 255, (byte) -88, (byte) 0, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ad.<init>(");
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
          throw bd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_c = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_d = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
