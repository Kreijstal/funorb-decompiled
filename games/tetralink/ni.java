/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni {
    static int field_c;
    private java.math.BigInteger field_j;
    private java.math.BigInteger field_e;
    private bh field_d;
    private th field_a;
    static db field_h;
    private bo[] field_f;
    private rh field_g;
    static String field_i;
    private ke field_b;

    final bo a(int param0, int param1, sk param2, sk param3, boolean param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        bo var9 = null;
        byte[] var13 = null;
        bo stackIn_9_0 = null;
        bo stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == this.field_d) {
            throw new RuntimeException();
          }
          if (0 <= param0 &&
            param0 < this.field_f.length) {
            if (this.field_f[param0] != null) {
              stackIn_9_0 = this.field_f[param0];
              return stackIn_9_0;
            }
            this.field_d.field_t = param0 * 72 + 6;
            var6_int = this.field_d.f(12);
            var7 = this.field_d.f(126);
            var13 = new byte[64];
            if (param1 < 10) {
              this.field_g = (rh) null;
            }
            this.field_d.b(64, 0, var13, -54);
            var9 = new bo(param0, param2, param3, this.field_a, this.field_b, var6_int, var13, var7, param4);
            this.field_f[param0] = var9;
            stackIn_13_0 = var9;
            return stackIn_13_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("ni.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param4).append(')').toString());
        }
    }

    ni(th param0, ke param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final boolean a(int param0) {
        int var7 = 0;
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var8;
        bh var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = TetraLink.field_J;
        if (null != this.field_d) {
          return true;
        }
        if (null == this.field_g) {
          if (this.field_a.b((byte) 119)) {
            return false;
          }
          this.field_g = this.field_a.a(false, 255, (byte) 0, 255, true);
        }
        if (this.field_g.field_v) {
          return false;
        }
        var10 = new bh(this.field_g.c(true));
        var10.field_t = 5;
        var3 = var10.d((byte) -99);
        if (param0 != 9) {
          ni.c((byte) 110);
        }
        var10.field_t = var10.field_t + var3 * 72;
        var13 = new byte[-var10.field_t + var10.field_u.length];
        var11 = var13;
        var4 = var11;
        var10.b(var13.length, 0, var13, -26);
        if (this.field_e != null &&
          this.field_j != null) {
          var12 = new java.math.BigInteger(var13);
          var7_ref_java_math_BigInteger = var12.modPow(this.field_e, this.field_j);
          var5 = var7_ref_java_math_BigInteger.toByteArray();
        } else {
          var5 = var4;
        }
        if (65 != var5.length) {
          throw new RuntimeException();
        }
        var15 = qb.a(var10.field_u, (byte) -89, -var13.length + (var10.field_t - 5), 5);
        for (var7 = 0; 64 > var7; var7++) {
          if (var5[var7 + 1] != var15[var7]) {
            throw new RuntimeException();
          }
        }
        this.field_f = new bo[var3];
        this.field_d = var10;
        return true;
    }

    final static void d(byte param0) {
        int var1 = 78 % ((param0 - 60) / 52);
        rf.a(0);
    }

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 10) {
            stackIn_4_0 = nl.a(param0, 10, true, true);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ni.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(ah param0, fg param1, int param2, byte param3) {
        try {
          cn.field_f = va.a(param3 ^ 4) * param2 / 1000;
          ug.a(param3 ^ -126, param0);
          ji.a(param0, 1);
          kj.a(3, param0);
          gg.b(120);
          af.b(param3 ^ -18425);
          if (param3 != -5) {
            field_c = -68;
          }
          en.field_K = -cn.field_f + 0;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "ni.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void c(byte param0) {
        field_i = null;
        if (param0 <= 4) {
          field_c = 88;
        }
        field_h = null;
    }

    final static void a(byte param0) {
        int var15 = 0;
        int var17_int = 0;
        int var18 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        id var4_ref_id = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        id var17 = null;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        double var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = TetraLink.field_J;
        try {
          ec.field_e = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = wa.field_f.length;
          var21 = new int[var1_int];
          var20 = var21;
          var2 = var20;
          for (var3 = 0; var1_int > var3; var3++) {
            var4_ref_id = wa.field_f[var3];
            var4_ref_id.b(false);
            na.a(var3, false);
            var5 = var4_ref_id.field_a + var4_ref_id.field_j >> 1;
            var6 = var4_ref_id.field_L + var4_ref_id.field_f >> 1;
            var7 = var4_ref_id.field_m + var4_ref_id.field_P >> 1;
            var8 = ec.field_e[9] >> 2;
            var9 = ec.field_e[10] >> 2;
            var10_int = ec.field_e[11] >> 2;
            var11 = bk.field_k[4] * var9 + bk.field_k[3] * var8 + var10_int * bk.field_k[5] >> 14;
            var12 = bk.field_k[8] * var10_int + var8 * bk.field_k[6] + var9 * bk.field_k[7] >> 14;
            var13 = bk.field_k[11] * var10_int + var9 * bk.field_k[10] + bk.field_k[9] * var8 >> 14;
            var2[var3] = var13 * var7 + (var6 * var12 + var11 * var5) >> 16;
          }
          var3Lifetime1 = ec.field_e[9] >> 8;
          var4 = ec.field_e[10] >> 8;
          var5Lifetime1 = ec.field_e[11] >> 8;
          var6Lifetime1 = en.field_K << 4;
          var7Lifetime1 = 0;
          var8Lifetime1 = le.d(var6Lifetime1, -28583) >> 8;
          var9Lifetime1 = ua.a(78, var6Lifetime1) >> 8;
          if (aa.field_Nb != -1 &&
            -1 != a.field_a) {
            var7Lifetime1 = -320 + aa.field_Nb;
            var9Lifetime1 = -128;
            var8Lifetime1 = 240 - a.field_a;
          }
          var10 = 256.0 / Math.sqrt((double)(var9Lifetime1 * var9Lifetime1 + var8Lifetime1 * var8Lifetime1 + var7Lifetime1 * var7Lifetime1));
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          var12Lifetime1 = var7Lifetime1 - var3Lifetime1;
          var13Lifetime1 = -var4 + var8Lifetime1;
          var14 = -var5Lifetime1 + var9Lifetime1;
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var12Lifetime1 * var12Lifetime1 + (var13Lifetime1 * var13Lifetime1 + var14 * var14)));
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          if (param0 != 71) {
            field_h = (db) null;
          }
          var14 = (int)((double)var14 * var10Lifetime1);
          for (var15 = 0; wa.field_f.length > var15; var15++) {
            var16 = 0;
            for (var17_int = 1; wa.field_f.length > var17_int; var17_int++) {
              if (var21[var17_int] > var21[var16]) {
                var16 = var17_int;
              }
            }
            var2[var16] = -2147483648;
            var17 = wa.field_f[var16];
            na.a(var16, false);
            for (var18 = 0; var18 < 3; var18++) {
              bk.field_k[var18] = bk.field_k[var18] + da.field_b[var15][var18];
            }
            na.a(ec.field_e, true, bk.field_k, 9, false, false, var17);
            bf.a(65793, var7Lifetime1, var17, var12Lifetime1, var13Lifetime1, var8Lifetime1, var9Lifetime1, var14);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1), "ni.C(" + param0 + ')');
        }
    }

    final void b(byte param0) {
        int var2;
        int var4;
        int var3;
        int var5;
        int var2Lifetime1;
        var4 = TetraLink.field_J;
        if (null == this.field_f) {
          return;
        }
        for (var2 = 0; var2 < this.field_f.length; var2++) {
          if (null != this.field_f[var2]) {
            this.field_f[var2].b((byte) 110);
          }
        }
        var3 = 88 / ((51 - param0) / 55);
        var5 = 0;
        var2Lifetime1 = var5;
        while (var5 < this.field_f.length) {
          if (this.field_f[var5] != null) {
            this.field_f[var5].e(2);
          }
          var5++;
        }
        return;
    }

    private ni(th param0, ke param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        try {
          this.field_a = param0;
          this.field_j = param3;
          this.field_b = param1;
          this.field_e = param2;
          if (!this.field_a.b((byte) 119)) {
            this.field_g = this.field_a.a(false, 255, (byte) 0, 255, true);
          }
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "ni.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = "Searching for an opponent";
        field_h = new db(4, 1, 1, 1);
    }
}
