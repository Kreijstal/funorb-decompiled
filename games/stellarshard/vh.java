/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh {
    private rk field_j;
    private ph field_f;
    private ka field_d;
    private java.math.BigInteger field_b;
    private wc[] field_a;
    static int field_i;
    static int[] field_h;
    static int field_e;
    private java.math.BigInteger field_c;
    private fb field_g;

    final void a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var2Lifetime1;
        var3 = stellarshard.field_B;
        if (null == this.field_a) {
          return;
        }
        for (var2 = 0; var2 < this.field_a.length; var2++) {
          if (null != this.field_a[var2]) {
            this.field_a[var2].c(13596);
          }
        }
        if (param0 != -123) {
          this.field_f = (ph) null;
        }
        var4 = 0;
        var2Lifetime1 = var4;
        while (var4 < this.field_a.length) {
          if (this.field_a[var4] != null) {
            this.field_a[var4].b(false);
          }
          var4++;
        }
        return;
    }

    final static boolean a(boolean param0, java.applet.Applet param1) {
        try {
          int var5 = 0;
          RuntimeException var2 = null;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          ha var8 = null;
          String var9 = null;
          boolean stackIn_20_0 = false;
          RuntimeException stackIn_23_0 = null;
          StringBuilder stackIn_23_1 = null;
          String stackIn_24_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2_ref = null;
          var7 = stellarshard.field_B;
          try {
            if (sl.field_c) {
              return true;
            }
            try {
              var9 = "tuhstatbut";
              var3 = (String) (sh.a("getcookies", param1, (byte) 78));
              var4 = qj.a(';', var3, 10287);
              for (var5 = 0; var5 < var4.length; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(var9)) {
                  return true;
                }
              }
              if (!param0) {
                var8 = (ha) null;
                vh.a((byte) 94, (short[]) null, -37, (ha) null);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = decompiledCaughtException;
            }
            stackIn_20_0 = (null != param1.getParameter("tuhstatbut"));
            return stackIn_20_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_23_0 = var2;
            stackIn_23_1 = new StringBuilder().append("vh.D(").append(param0).append(',');
            if (param1 == null) {
              stackIn_24_2 = "null";
            } else {
              stackIn_24_2 = "{...}";
            }
            throw ma.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final wc a(int param0, gi param1, gi param2, boolean param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        wc var9 = null;
        byte[] var13 = null;
        wc stackIn_8_0 = null;
        wc stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_d == null) {
            throw new RuntimeException();
          }
          if (0 <= param4 &&
            this.field_a.length > param4) {
            if (this.field_a[param4] != null) {
              stackIn_8_0 = this.field_a[param4];
              return stackIn_8_0;
            }
            this.field_d.field_k = 6 + 72 * param4;
            var6_int = this.field_d.b(false);
            var7 = this.field_d.b(false);
            var13 = new byte[param0];
            this.field_d.a(0, (byte) -101, 64, var13);
            var9 = new wc(param4, param1, param2, this.field_g, this.field_j, var6_int, var13, var7, param3);
            this.field_a[param4] = var9;
            stackIn_10_0 = var9;
            return stackIn_10_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("vh.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static short[] a(byte param0, short[] param1, int param2, ha param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = stellarshard.field_B;
        try {
          if (param0 < 21) {
            field_e = -63;
          }
          var4_int = param3.e(param2, 8);
          if (var4_int == 0) {
            return null;
          }
          if (param1 == null ||
            param1.length != var4_int) {
            param1 = new short[var4_int];
          }
          var5 = param3.e(4, 8);
          var6 = (short)param3.e(16, 8);
          if (0 < var5) {
            for (var7 = 0; var4_int > var7; var7++) {
              param1[var7] = (short)(var6 + param3.e(var5, 8));
            }
          } else {
            for (var7 = 0; var7 < var4_int; var7++) {
              param1[var7] = (short)var6;
            }
          }
          stackIn_18_0 = (short[]) (param1);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("vh.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    vh(fb param0, rk param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    public static void b(byte param0) {
        if (param0 != 48) {
          field_i = 87;
        }
        field_h = null;
    }

    final boolean a(int param0) {
        int var8 = 0;
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var6_ref_java_math_BigInteger;
        int var6;
        int var9;
        ka var11;
        byte[] var12;
        java.math.BigInteger var13;
        byte[] var14;
        byte[] var16;
        var9 = stellarshard.field_B;
        if (null != this.field_d) {
          return true;
        }
        if (this.field_f == null) {
          if (this.field_g.d(2)) {
            return false;
          }
          this.field_f = this.field_g.a((byte) 0, 255, true, 255, true);
        }
        if (this.field_f.field_w) {
          return false;
        }
        var11 = new ka(this.field_f.g(-27203));
        var11.field_k = 5;
        var3 = var11.f(4);
        var11.field_k = var11.field_k + 72 * var3;
        var14 = new byte[-var11.field_k + var11.field_r.length];
        var12 = var14;
        var4 = var12;
        var11.a(0, (byte) -124, var14.length, var14);
        if (null != this.field_c &&
          null != this.field_b) {
          var6_ref_java_math_BigInteger = new java.math.BigInteger(var14);
          var13 = var6_ref_java_math_BigInteger.modPow(this.field_c, this.field_b);
          var5 = var13.toByteArray();
        } else {
          var5 = var4;
        }
        if (var5.length != 65) {
          throw new RuntimeException();
        }
        var6 = -19 % ((param0 - 54) / 60);
        var16 = bc.a(0, 5, -5 + (-var14.length + var11.field_k), var11.field_r);
        for (var8 = 0; var8 < 64; var8++) {
          if (var16[var8] != var5[1 + var8]) {
            throw new RuntimeException();
          }
        }
        this.field_d = var11;
        this.field_a = new wc[var3];
        return true;
    }

    private vh(fb param0, rk param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        try {
          this.field_g = param0;
          this.field_j = param1;
          this.field_b = param3;
          this.field_c = param2;
          if (!this.field_g.d(2)) {
            this.field_f = this.field_g.a((byte) 0, 255, true, 255, true);
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "vh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
