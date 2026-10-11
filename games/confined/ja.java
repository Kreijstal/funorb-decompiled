/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    private pc field_c;
    private kg field_j;
    private java.math.BigInteger field_h;
    private tn field_i;
    private jf field_f;
    private tj[] field_a;
    private java.math.BigInteger field_e;
    static bi[] field_b;
    static int field_d;
    static String field_g;

    final static nf[] a(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = Confined.field_J ? 1 : 0;
        nf[] var1 = new nf[wc.field_hc];
        if (param0 > -65) {
          ja.a(-63);
        }
        for (var2 = 0; wc.field_hc > var2; var2++) {
          var3 = sd.field_f[var2] * rg.field_I[var2];
          var4 = rj.field_f[var2];
          var5 = new int[var3];
          for (var6 = 0; var6 < var3; var6++) {
            var5[var6] = an.field_p[va.a((int) var4[var6], 255)];
          }
          var1[var2] = new nf(kb.field_a, em.field_e, jl.field_p[var2], ij.field_r[var2], rg.field_I[var2], sd.field_f[var2], var5);
        }
        ql.a(false);
        return var1;
    }

    final boolean a(boolean param0) {
        int var7 = 0;
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var8;
        kg var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = Confined.field_J ? 1 : 0;
        if (this.field_j != null) {
          return true;
        }
        if (this.field_i == null) {
          if (this.field_f.c(111)) {
            return false;
          }
          this.field_i = this.field_f.a(255, true, -1911606496, 255, (byte) 0);
        }
        if (this.field_i.field_v) {
          return false;
        }
        var10 = new kg(this.field_i.e((byte) 118));
        var10.field_n = 5;
        var3 = var10.c(32);
        var10.field_n = var10.field_n + 72 * var3;
        var13 = new byte[var10.field_m.length - var10.field_n];
        var11 = var13;
        var4 = var11;
        var10.a(0, (byte) 115, var13.length, var13);
        if (this.field_e != null &&
          this.field_h != null) {
          var12 = new java.math.BigInteger(var13);
          var7_ref_java_math_BigInteger = var12.modPow(this.field_e, this.field_h);
          var5 = var7_ref_java_math_BigInteger.toByteArray();
        } else {
          var5 = var4;
        }
        if (var5.length != 65) {
          throw new RuntimeException();
        }
        var15 = in.a(5, var10.field_m, -var13.length + var10.field_n - 5, -26879);
        if (param0) {
          this.a(true);
        }
        for (var7 = 0; var7 < 64; var7++) {
          if (var5[var7 + 1] != var15[var7]) {
            throw new RuntimeException();
          }
        }
        this.field_j = var10;
        this.field_a = new tj[var3];
        return true;
    }

    public static void a(byte param0) {
        field_b = null;
        field_g = null;
        int var1 = 104 % ((43 - param0) / 52);
    }

    private ja(jf param0, pc param1, java.math.BigInteger param2, java.math.BigInteger param3) {
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
          this.field_c = param1;
          this.field_e = param2;
          this.field_h = param3;
          this.field_f = param0;
          if (!this.field_f.c(-87)) {
            this.field_i = this.field_f.a(255, true, -1911606496, 255, (byte) 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ja.<init>(");
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
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    ja(jf param0, pc param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final void b(byte param0) {
        int var2;
        int var3;
        tj stackIn_16_0 = null;
        int var2Lifetime1;
        var3 = Confined.field_J ? 1 : 0;
        if (param0 != 28) {
          return;
        }
        if (null == this.field_a) {
          return;
        }
        for (var2 = 0; this.field_a.length > var2; var2++) {
          if (this.field_a[var2] != null) {
            this.field_a[var2].c((byte) -121);
          }
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < this.field_a.length; var2Lifetime1++) {
          stackIn_16_0 = this.field_a[var2Lifetime1];
          if (stackIn_16_0 != null) {
            this.field_a[var2Lifetime1].b((byte) 109);
          }
        }
    }

    final static boolean c(byte param0) {
        if (param0 >= -53) {
          field_b = (bi[]) null;
          return true;
        }
        return true;
    }

    final tj a(ae param0, byte param1, boolean param2, int param3, ae param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        tj var9 = null;
        byte[] var13 = null;
        tj stackIn_8_0 = null;
        tj stackIn_11_0 = null;
        tj stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == this.field_j) {
            throw new RuntimeException();
          }
          if (param3 >= 0 &&
            param3 < this.field_a.length) {
            if (this.field_a[param3] != null) {
              stackIn_8_0 = this.field_a[param3];
              return stackIn_8_0;
            }
            this.field_j.field_n = 6 + 72 * param3;
            var6_int = this.field_j.f((byte) 91);
            if (param1 != -60) {
              stackIn_11_0 = (tj) null;
              return stackIn_11_0;
            }
            var7 = this.field_j.f((byte) 115);
            var13 = new byte[64];
            this.field_j.a(0, (byte) 86, 64, var13);
            var9 = new tj(param3, param4, param0, this.field_f, this.field_c, var6_int, var13, var7, param2);
            this.field_a[param3] = var9;
            stackIn_13_0 = var9;
            return stackIn_13_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("ja.A(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    static {
        field_b = new bi[4];
        field_d = 48;
        field_g = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
