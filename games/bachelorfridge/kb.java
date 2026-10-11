/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb {
    private qfa field_d;
    static int field_h;
    private vm field_i;
    private fp[] field_a;
    private java.math.BigInteger field_f;
    private ea field_k;
    private java.math.BigInteger field_b;
    private lu field_c;
    static qia field_e;
    static int field_g;
    static int field_j;

    public static void a(int param0) {
        field_e = null;
        if (param0 <= 26) {
          kb.a(-88);
        }
    }

    final boolean a(byte param0) {
        int var7 = 0;
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var8;
        lu var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = BachelorFridge.field_y;
        if (null != this.field_c) {
          return true;
        }
        if (this.field_d == null) {
          if (this.field_i.b(20)) {
            return false;
          }
          this.field_d = this.field_i.a(255, 255, 123, (byte) 0, true);
        }
        if (this.field_d.field_n) {
          return false;
        }
        var10 = new lu(this.field_d.d((byte) -65));
        var10.field_g = 5;
        var3 = var10.b(param0 + 16711924);
        var10.field_g = var10.field_g + 72 * var3;
        var13 = new byte[-var10.field_g + var10.field_h.length];
        var11 = var13;
        var4 = var11;
        var10.a(var4, var13.length, 128, 0);
        if (null != this.field_b &&
          null != this.field_f) {
          var12 = new java.math.BigInteger(var13);
          var7_ref_java_math_BigInteger = var12.modPow(this.field_b, this.field_f);
          var5 = var7_ref_java_math_BigInteger.toByteArray();
        } else {
          var5 = var4;
        }
        if (var5.length != 65) {
          throw new RuntimeException();
        }
        var15 = ln.a(-5 + (var10.field_g - var13.length), var10.field_h, 5, 8);
        for (var7 = 0; var7 < 64; var7++) {
          if (var15[var7] != var5[var7 + 1]) {
            throw new RuntimeException();
          }
        }
        this.field_c = var10;
        if (param0 != 11) {
          this.b((byte) -34);
        }
        this.field_a = new fp[var3];
        return true;
    }

    final fp a(boolean param0, int param1, ta param2, ta param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        fp var9 = null;
        byte[] var13 = null;
        fp stackIn_9_0 = null;
        fp stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == this.field_c) {
            throw new RuntimeException();
          }
          if (param1 >= 0 &&
            param1 < this.field_a.length) {
            if (null != this.field_a[param1]) {
              stackIn_9_0 = this.field_a[param1];
              return stackIn_9_0;
            }
            this.field_c.field_g = param1 * 72 + 6;
            var6_int = this.field_c.f(81);
            var7 = this.field_c.f(-121);
            var13 = new byte[param4];
            this.field_c.a(var13, 64, 128, 0);
            var9 = new fp(param1, param2, param3, this.field_i, this.field_k, var6_int, var13, var7, param0);
            this.field_a[param1] = var9;
            stackIn_11_0 = var9;
            return stackIn_11_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("kb.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(')').toString());
        }
    }

    private kb(vm param0, ea param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        try {
          this.field_b = param2;
          this.field_f = param3;
          this.field_k = param1;
          this.field_i = param0;
          if (!this.field_i.b(20)) {
            this.field_d = this.field_i.a(255, 255, 126, (byte) 0, true);
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "kb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var2Lifetime1;
        var4 = BachelorFridge.field_y;
        if (this.field_a == null) {
          return;
        }
        var3 = 14 % ((-16 - param0) / 51);
        for (var2 = 0; var2 < this.field_a.length; var2++) {
          if (null != this.field_a[var2]) {
            this.field_a[var2].e(62);
          }
        }
        var5 = 0;
        var2Lifetime1 = var5;
        while (this.field_a.length > var5) {
          if (this.field_a[var5] != null) {
            this.field_a[var5].c(14075);
          }
          var5++;
        }
        return;
    }

    kb(vm param0, ea param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    static {
        field_e = new qia();
        field_g = 0;
    }
}
