/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg {
    static int field_e;
    private be field_i;
    private sd field_f;
    private gd[] field_g;
    private ae field_a;
    static String field_h;
    private java.math.BigInteger field_b;
    private hi field_c;
    private java.math.BigInteger field_d;

    final static void b(int param0) {
        if (param0 <= 113) {
          field_h = (String) null;
        }
        wb var2 = (wb) null;
        rg.a((wb) null, 14915);
    }

    final void a(byte param0) {
        int var2;
        int var3;
        gd stackIn_15_0 = null;
        int var2Lifetime1;
        var3 = TrackController.field_F ? 1 : 0;
        if (null == this.field_g) {
          return;
        }
        for (var2 = 0; this.field_g.length > var2; var2++) {
          if (this.field_g[var2] != null) {
            this.field_g[var2].a((byte) -41);
          }
        }
        if (param0 != 95) {
          this.a((byte) -54);
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < this.field_g.length; var2Lifetime1++) {
          stackIn_15_0 = this.field_g[var2Lifetime1];
          if (stackIn_15_0 != null) {
            this.field_g[var2Lifetime1].b(false);
          }
        }
    }

    wg(ae param0, sd param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final static void a(int param0, boolean param1) {
        nk.a(false, 40, param1);
        if (param0 >= -99) {
          wg.a(-69, false);
        }
    }

    final boolean a(int param0) {
        int var7 = 0;
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var8;
        be var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = TrackController.field_F ? 1 : 0;
        if (null != this.field_i) {
          return true;
        }
        if (null == this.field_c) {
          if (this.field_a.d(-18316)) {
            return false;
          }
          this.field_c = this.field_a.a(255, true, false, 255, (byte) 0);
        }
        if (this.field_c.field_w) {
          return false;
        }
        var10 = new be(this.field_c.g(512));
        var10.field_k = 5;
        var3 = var10.h(16383);
        var10.field_k = var10.field_k + 72 * var3;
        var13 = new byte[-var10.field_k + var10.field_j.length];
        var11 = var13;
        var4 = var11;
        var10.a(122, var4, 0, var13.length);
        if (this.field_d != null &&
          this.field_b != null) {
          var12 = new java.math.BigInteger(var13);
          var7_ref_java_math_BigInteger = var12.modPow(this.field_d, this.field_b);
          var5 = var7_ref_java_math_BigInteger.toByteArray();
        } else {
          var5 = var4;
        }
        if (65 != var5.length) {
          throw new RuntimeException();
        }
        var15 = cf.a(5, var10.field_j, -5 + var10.field_k - var13.length, -6196);
        if (param0 > -62) {
          this.a((byte) -115);
        }
        for (var7 = 0; var7 < 64; var7++) {
          if (var15[var7] != var5[var7 + 1]) {
            throw new RuntimeException();
          }
        }
        this.field_i = var10;
        this.field_g = new gd[var3];
        return true;
    }

    public static void c(int param0) {
        if (param0 != 6883) {
          wg.b(-95);
        }
        field_h = null;
    }

    final static nj a(byte param0, int param1, String param2) {
        nj var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        nj stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new nj(false);
          var3.field_b = param1;
          var4 = 109 / ((param0 + 54) / 61);
          var3.field_c = param2;
          stackIn_1_0 = var3;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_4_0 = var3_ref;
          stackIn_4_1 = new StringBuilder().append("wg.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    private wg(ae param0, sd param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        try {
          this.field_f = param1;
          this.field_b = param3;
          this.field_a = param0;
          this.field_d = param2;
          if (!this.field_a.d(-18316)) {
            this.field_c = this.field_a.a(255, true, false, 255, (byte) 0);
          }
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "wg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final gd a(int param0, int param1, hf param2, boolean param3, hf param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        gd var9 = null;
        byte[] var13 = null;
        gd stackIn_8_0 = null;
        gd stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == this.field_i) {
            throw new RuntimeException();
          }
          if (param1 >= 0 &&
            param1 < this.field_g.length) {
            if (this.field_g[param1] != null) {
              stackIn_8_0 = this.field_g[param1];
              return stackIn_8_0;
            }
            this.field_i.field_k = param1 * 72 + 6;
            var6_int = this.field_i.e((byte) 113);
            if (param0 < 67) {
              field_h = (String) null;
            }
            var7 = this.field_i.e((byte) 113);
            var13 = new byte[64];
            this.field_i.a(102, var13, 0, 64);
            var9 = new gd(param1, param4, param2, this.field_a, this.field_f, var6_int, var13, var7, param3);
            this.field_g[param1] = var9;
            stackIn_12_0 = var9;
            return stackIn_12_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("wg.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    static {
        field_e = 0;
        field_h = "Play free version";
    }
}
