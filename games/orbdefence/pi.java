/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi {
    static uh field_j;
    private cd field_i;
    private mg field_f;
    private ge field_h;
    private java.math.BigInteger field_a;
    private java.math.BigInteger field_e;
    static String field_g;
    static String field_c;
    private vl field_d;
    private ak[] field_b;

    public static void a(boolean param0) {
        field_j = null;
        field_c = null;
        field_g = null;
        if (!param0) {
          pi.a(true);
        }
    }

    final boolean a(int param0) {
        int var7 = 0;
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var8;
        mg var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = OrbDefence.field_D ? 1 : 0;
        if (null != this.field_f) {
          return true;
        }
        if (this.field_i == null) {
          if (this.field_h.d(-114)) {
            return false;
          }
          this.field_i = this.field_h.a(15937, 255, true, 255, (byte) 0);
        }
        if (this.field_i.field_l) {
          return false;
        }
        var10 = new mg(this.field_i.f(0));
        var10.field_i = 5;
        var3 = var10.b((byte) 90);
        var10.field_i = var10.field_i + var3 * 72;
        var13 = new byte[var10.field_j.length - var10.field_i];
        var11 = var13;
        var4 = var11;
        var10.a((byte) 126, var4, 0, var13.length);
        if (this.field_e != null &&
          this.field_a != null) {
          var12 = new java.math.BigInteger(var13);
          var7_ref_java_math_BigInteger = var12.modPow(this.field_e, this.field_a);
          var5 = var7_ref_java_math_BigInteger.toByteArray();
        } else {
          var5 = var4;
        }
        if (var5.length != 65) {
          throw new RuntimeException();
        }
        var15 = ee.a(-1, -var13.length + (var10.field_i - 5), 5, var10.field_j);
        for (var7 = param0; var7 < 64; var7++) {
          if (var15[var7] != var5[var7 + 1]) {
            throw new RuntimeException();
          }
        }
        this.field_f = var10;
        this.field_b = new ak[var3];
        return true;
    }

    pi(ge param0, vl param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final ak a(boolean param0, int param1, boolean param2, eh param3, eh param4) {
        ak stackIn_8_0 = null;
        ak stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        ak var9 = null;
        byte[] var13 = null;
        try {
          if (null == this.field_f) {
            throw new RuntimeException();
          }
          if (param1 >= 0 &&
            param1 < this.field_b.length) {
            if (null != this.field_b[param1]) {
              stackIn_8_0 = this.field_b[param1];
              return stackIn_8_0;
            }
            this.field_f.field_i = 6 + param1 * 72;
            var6_int = this.field_f.l(0);
            var7 = this.field_f.l(0);
            if (param2) {
              this.field_f = (mg) null;
            }
            var13 = new byte[64];
            this.field_f.a((byte) 123, var13, 0, 64);
            var9 = new ak(param1, param4, param3, this.field_h, this.field_d, var6_int, var13, var7, param0);
            this.field_b[param1] = var9;
            stackIn_12_0 = var9;
            return stackIn_12_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("pi.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void b(int param0) {
        int var2;
        int var3;
        int var4;
        int var2Lifetime1;
        var3 = OrbDefence.field_D ? 1 : 0;
        if (null == this.field_b) {
          return;
        }
        for (var2 = 0; var2 < this.field_b.length; var2++) {
          if (null != this.field_b[var2]) {
            this.field_b[var2].e((byte) 57);
          }
        }
        var4 = param0;
        var2Lifetime1 = var4;
        while (var4 < this.field_b.length) {
          if (this.field_b[var4] != null) {
            this.field_b[var4].a(true);
          }
          var4++;
        }
        return;
    }

    final static void a(int param0, int param1, int param2) {
        lc.field_r = 1;
        dm.field_a = param2;
        da.field_B = param0;
        if (param1 != 19741) {
          field_g = (String) null;
        }
    }

    private pi(ge param0, vl param1, java.math.BigInteger param2, java.math.BigInteger param3) {
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
          this.field_h = param0;
          this.field_e = param2;
          this.field_a = param3;
          this.field_d = param1;
          if (!this.field_h.d(-92)) {
            this.field_i = this.field_h.a(15937, 255, true, 255, (byte) 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("pi.<init>(");
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
          throw dd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_g = "Checking";
        field_c = "Age:";
    }
}
