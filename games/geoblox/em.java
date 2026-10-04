/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em {
    private ji field_g;
    private uf field_f;
    private sd field_h;
    private java.math.BigInteger field_e;
    private java.math.BigInteger field_c;
    private bj[] field_d;
    static String field_a;
    private qc field_b;

    final static boolean b(int param0) {
        if (param0 != 255) {
            return false;
        }
        if (null == vl.field_n) {
            return false;
        }
        nb.a(-2, vl.field_n);
        vl.field_n.a(0, ka.field_i);
        vl.field_n = null;
        return true;
    }

    final static boolean a(char param0, int param1) {
        boolean stackIn_10_0 = false;
        if (param1 != 97) {
          field_a = (String) null;
        }
        if ((((65 > param0)) ||
              ((param0 > 90))) &&
            (((97 > param0)) ||
              ((param0 > 122)))) {
          stackIn_10_0 = false;
        } else {
          stackIn_10_0 = true;
        }
        return stackIn_10_0;
    }

    public static void a(int param0) {
        if (param0 < 8) {
            return;
        }
        field_a = null;
    }

    em(ji param0, uf param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final bj a(int param0, byte param1, boolean param2, jh param3, jh param4) {
        bj stackIn_9_0 = null;
        bj stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        bj var9 = null;
        byte[] var13 = null;
        try {
          if (this.field_b == null) {
            throw new RuntimeException();
          }
          if ((param0 >= 0) &&
              (this.field_d.length > param0)) {
            if (null != this.field_d[param0]) {
              stackIn_9_0 = this.field_d[param0];
              return stackIn_9_0;
            }
            this.field_b.field_f = 6 + 72 * param0;
            var6_int = this.field_b.a((byte) -108);
            var7 = this.field_b.a((byte) -55);
            var13 = new byte[64];
            if (param1 != -9) {
              this.field_h = (sd) null;
            }
            this.field_b.b(29915, 64, var13, 0);
            var9 = new bj(param0, param4, param3, this.field_g, this.field_f, var6_int, var13, var7, param2);
            this.field_d[param0] = var9;
            stackIn_13_0 = var9;
            return stackIn_13_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("em.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param4 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final void a(byte param0) {
        int var2;
        int var3;
        bj stackIn_16_0 = null;
        var3 = Geoblox.field_C;
        if (null == this.field_d) {
          return;
        }
        for (var2 = 0; this.field_d.length > var2; var2++) {
          if (this.field_d[var2] == null) {
            continue;
          }
          this.field_d[var2].a(6924);
        }
        if (param0 != -65) {
          em.a('', 15);
        }
        for (var2 = 0; var2 < this.field_d.length; var2++) {
          if (null == this.field_d[var2]) {
            continue;
          }
          stackIn_16_0 = this.field_d[var2];
          ((bj) (Object) stackIn_16_0).b((byte) -38);
        }
    }

    final boolean b(byte param0) {
        int var7 = 0;
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var8;
        qc var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = Geoblox.field_C;
        if (null != this.field_b) {
          return true;
        }
        if (this.field_h == null) {
          if (this.field_g.g(20)) {
            return false;
          }
          this.field_h = this.field_g.a((byte) 0, 255, -21, 255, true);
        }
        if (param0 <= 121) {
          return false;
        }
        if (this.field_h.field_u) {
          return false;
        }
        var10 = new qc(this.field_h.e(397));
        var10.field_f = 5;
        var3 = var10.c((byte) 34);
        var10.field_f = var10.field_f + var3 * 72;
        var13 = new byte[var10.field_j.length - var10.field_f];
        var11 = var13;
        var4 = var11;
        var10.b(29915, var13.length, var13, 0);
        if ((this.field_c != null) &&
            (this.field_e != null)) {
          var12 = new java.math.BigInteger(var13);
          var7_ref_java_math_BigInteger = var12.modPow(this.field_c, this.field_e);
          var5 = var7_ref_java_math_BigInteger.toByteArray();
        } else {
          var5 = var4;
        }
        if (var5.length != 65) {
          throw new RuntimeException();
        }
        var15 = wh.a(-var13.length + var10.field_f - 5, 5, var10.field_j, 8);
        for (var7 = 0; var7 < 64; var7++) {
          if (var15[var7] != var5[1 + var7]) {
            throw new RuntimeException();
          }
        }
        this.field_b = var10;
        this.field_d = new bj[var3];
        return true;
    }

    private em(ji param0, uf param1, java.math.BigInteger param2, java.math.BigInteger param3) {
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
          this.field_c = param2;
          this.field_e = param3;
          this.field_f = param1;
          this.field_g = param0;
          if (!this.field_g.g(20)) {
            this.field_h = this.field_g.a((byte) 0, 255, -21, 255, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("em.<init>(");
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
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 53) {
            em.a(26);
          }
          if ((param0 != null) &&
              (param0.length() >= wg.field_m)) {
            if (param0.length() > bm.field_j) {
              return true;
            }
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("em.D(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = "Replay tutorial";
    }
}
