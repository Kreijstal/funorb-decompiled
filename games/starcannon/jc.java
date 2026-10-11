/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc {
    private ra field_a;
    private rb field_d;
    private java.math.BigInteger field_c;
    private ef field_f;
    private java.math.BigInteger field_b;
    private eh field_g;
    private t[] field_e;

    final boolean a(int param0) {
        int var7 = 0;
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        rb var9;
        byte[] var10;
        java.math.BigInteger var11;
        byte[] var12;
        byte[] var14;
        if (this.field_d != null) {
          return true;
        }
        if (null == this.field_a) {
          if (this.field_g.b((byte) -50)) {
            return false;
          }
          this.field_a = this.field_g.a(255, 255, -28612, true, (byte) 0);
        }
        if (this.field_a.field_r) {
          return false;
        }
        var9 = new rb(this.field_a.f(0));
        var9.field_g = 5;
        var3 = var9.j(7909);
        var9.field_g = var9.field_g + 72 * var3;
        if (param0 != -6) {
          return true;
        }
        var12 = new byte[var9.field_f.length - var9.field_g];
        var10 = var12;
        var4 = var10;
        var9.a(var12.length, (byte) 88, var12, 0);
        if (null != this.field_b &&
          this.field_c != null) {
          var11 = new java.math.BigInteger(var12);
          var7_ref_java_math_BigInteger = var11.modPow(this.field_b, this.field_c);
          var5 = var7_ref_java_math_BigInteger.toByteArray();
        } else {
          var5 = var4;
        }
        if (var5.length != 65) {
          throw new RuntimeException();
        }
        var14 = bd.a(-5 - var12.length + var9.field_g, var9.field_f, (byte) 93, 5);
        for (var7 = 0; var7 < 64; var7++) {
          if (var5[1 + var7] != var14[var7]) {
            throw new RuntimeException();
          }
        }
        this.field_e = new t[var3];
        this.field_d = var9;
        return true;
    }

    jc(eh param0, ef param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final t a(boolean param0, int param1, uf param2, int param3, uf param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        t var9 = null;
        byte[] var13 = null;
        t stackIn_9_0 = null;
        t stackIn_12_0 = null;
        t stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == this.field_d) {
            throw new RuntimeException();
          }
          if (0 <= param3 &&
            param3 < this.field_e.length) {
            if (param1 >= -61) {
              stackIn_9_0 = (t) null;
              return stackIn_9_0;
            }
            if (null != this.field_e[param3]) {
              stackIn_12_0 = this.field_e[param3];
              return stackIn_12_0;
            }
            this.field_d.field_g = 72 * param3 + 6;
            var6_int = this.field_d.f((byte) -83);
            var7 = this.field_d.f((byte) -118);
            var13 = new byte[64];
            this.field_d.a(64, (byte) 88, var13, 0);
            var9 = new t(param3, param2, param4, this.field_g, this.field_f, var6_int, var13, var7, param0);
            this.field_e[param3] = var9;
            stackIn_14_0 = var9;
            return stackIn_14_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("jc.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static void b(int param0) {
        if (param0 != 0) {
          jc.b(77);
        }
    }

    final void a(byte param0) {
        int var2;
        int var3;
        t stackIn_19_0 = null;
        int var2Lifetime1;
        var3 = StarCannon.field_A;
        if (param0 != -71) {
          this.a(85);
        }
        if (this.field_e == null) {
          return;
        }
        for (var2 = 0; this.field_e.length > var2; var2++) {
          if (this.field_e[var2] != null) {
            this.field_e[var2].b(0);
          }
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < this.field_e.length; var2Lifetime1++) {
          if (null != this.field_e[var2Lifetime1]) {
            stackIn_19_0 = this.field_e[var2Lifetime1];
            ((t) (Object) stackIn_19_0).d((byte) -12);
          }
        }
    }

    private jc(eh param0, ef param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        try {
          this.field_c = param3;
          this.field_g = param0;
          this.field_b = param2;
          this.field_f = param1;
          if (!this.field_g.b((byte) -114)) {
            this.field_a = this.field_g.a(255, 255, -28612, true, (byte) 0);
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "jc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
