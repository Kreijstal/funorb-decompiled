/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wq {
    private rb field_b;
    private gp field_h;
    static eg field_e;
    private java.math.BigInteger field_c;
    private un field_a;
    private java.math.BigInteger field_f;
    private fg[] field_g;
    static String field_i;
    private dk field_d;

    public static void b(int param0) {
        if (param0 != -14991) {
          return;
        }
        field_e = null;
        field_i = null;
    }

    final static el a(wl param0, int param1, int param2, boolean param3, int param4, int param5, int param6, byte[] param7) {
        RuntimeException var8 = null;
        el stackIn_8_0 = null;
        el stackIn_10_0 = null;
        el stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 != 9980) {
            field_i = (String) null;
          }
          if (!param0.field_Cc && (!mg.a(param1, (byte) -26) ||
            !mg.a(param2, (byte) 124))) {
            if (param0.field_u) {
              stackIn_10_0 = new el(param0, 34037, param4, param1, param2, param3, param7, param5);
              return stackIn_10_0;
            }
            stackIn_8_0 = new el(param0, param4, param1, param2, fk.a(param1, 87), fk.a(param2, 61), param7, param5);
            return stackIn_8_0;
          }
          stackIn_12_0 = new el(param0, 3553, param4, param1, param2, param3, param7, param5);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("wq.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void a(byte param0) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = AceOfSkies.field_G ? 1 : 0;
        if (null == this.field_g) {
          return;
        }
        for (var2 = 0; this.field_g.length > var2; var2++) {
          if (null != this.field_g[var2]) {
            this.field_g[var2].b(-20254);
          }
        }
        if (param0 < 65) {
          this.field_g = (fg[]) null;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < this.field_g.length; var2Lifetime1++) {
          if (null != this.field_g[var2Lifetime1]) {
            this.field_g[var2Lifetime1].a((byte) 89);
          }
        }
    }

    wq(un param0, dk param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final fg a(byte param0, bl param1, bl param2, boolean param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        fg var10 = null;
        byte[] var14 = null;
        fg stackIn_8_0 = null;
        fg stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_b == null) {
            throw new RuntimeException();
          }
          var6_int = -115 % ((param0 - 8) / 42);
          if (param4 >= 0 &&
            this.field_g.length > param4) {
            if (this.field_g[param4] != null) {
              stackIn_8_0 = this.field_g[param4];
              return stackIn_8_0;
            }
            this.field_b.field_g = 6 + param4 * 72;
            var7 = this.field_b.a((byte) 122);
            var8 = this.field_b.a((byte) 125);
            var14 = new byte[64];
            this.field_b.a(0, 7186, 64, var14);
            var10 = new fg(param4, param2, param1, this.field_a, this.field_d, var7, var14, var8, param3);
            this.field_g[param4] = var10;
            stackIn_10_0 = var10;
            return stackIn_10_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("wq.E(").append(param0).append(',');
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
          throw pn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean a(int param0) {
        int var7 = 0;
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var8;
        rb var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = AceOfSkies.field_G ? 1 : 0;
        if (null != this.field_b) {
          return true;
        }
        if (this.field_h == null) {
          if (this.field_a.a(false)) {
            return false;
          }
          this.field_h = this.field_a.a(255, 255, -21, true, (byte) 0);
        }
        if (this.field_h.field_p) {
          return false;
        }
        var10 = new rb(this.field_h.a(true));
        var10.field_g = 5;
        if (param0 <= 2) {
          this.a(115);
        }
        var3 = var10.g(-52);
        var10.field_g = var10.field_g + 72 * var3;
        var13 = new byte[var10.field_f.length - var10.field_g];
        var11 = var13;
        var4 = var11;
        var10.a(0, 7186, var13.length, var13);
        if (null != this.field_f &&
          null != this.field_c) {
          var12 = new java.math.BigInteger(var13);
          var7_ref_java_math_BigInteger = var12.modPow(this.field_f, this.field_c);
          var5 = var7_ref_java_math_BigInteger.toByteArray();
        } else {
          var5 = var4;
        }
        if (var5.length != 65) {
          throw new RuntimeException();
        }
        var15 = qm.a(0, var10.field_g - var13.length - 5, var10.field_f, 5);
        for (var7 = 0; 64 > var7; var7++) {
          if (var15[var7] != var5[var7 + 1]) {
            throw new RuntimeException();
          }
        }
        this.field_g = new fg[var3];
        this.field_b = var10;
        return true;
    }

    private wq(un param0, dk param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        try {
          this.field_d = param1;
          this.field_a = param0;
          this.field_f = param2;
          this.field_c = param3;
          if (!this.field_a.a(false)) {
            this.field_h = this.field_a.a(255, 255, -21, true, (byte) 0);
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "wq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = "arcade";
        field_e = new eg();
    }
}
