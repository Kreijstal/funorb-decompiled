/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eq {
    private ai field_d;
    private java.math.BigInteger field_e;
    static ri field_c;
    private qb field_i;
    static int field_g;
    private tn field_h;
    private k field_b;
    private cn[] field_f;
    private java.math.BigInteger field_a;

    final static void a(java.awt.Component param0, byte param1) {
        try {
          param0.removeKeyListener(um.field_c);
          param0.removeFocusListener(um.field_c);
          qf.field_f = -1;
          int var2_int = -120 % ((param1 - 66) / 53);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "eq.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    eq(qb param0, ai param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final cn a(int param0, bq param1, int param2, bq param3, boolean param4) {
        cn stackIn_11_0 = null;
        cn stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        cn var9 = null;
        CharSequence[] var10 = null;
        byte[] var14 = null;
        try {
          if (param2 != -15893) {
            var10 = (CharSequence[]) null;
            eq.a((CharSequence[]) null, 8, 88, 1);
          }
          if (null == this.field_b) {
            throw new RuntimeException();
          }
          if (param0 >= 0 &&
            this.field_f.length > param0) {
            if (null != this.field_f[param0]) {
              stackIn_11_0 = this.field_f[param0];
              return stackIn_11_0;
            }
            this.field_b.field_j = 6 + 72 * param0;
            var6_int = this.field_b.i(-1478490344);
            var7 = this.field_b.i(param2 - 1478474451);
            var14 = new byte[64];
            this.field_b.a(0, param2 ^ 9946, 64, var14);
            var9 = new cn(param0, param3, param1, this.field_i, this.field_d, var6_int, var14, var7, param4);
            this.field_f[param0] = var9;
            stackIn_13_0 = var9;
            return stackIn_13_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("eq.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param4).append(')').toString());
        }
    }

    final static String a(CharSequence[] param0, int param1, int param2, int param3) {
        int var6_int = 0;
        int var7 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        String stackIn_27_0 = null;
        String stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param3 == 0) {
            stackIn_3_0 = "";
            return stackIn_3_0;
          }
          if (param3 == 1) {
            var10 = param0[param1];
            var4 = var10;
            if (var4 != null) {
              stackIn_10_0 = var10.toString();
              return stackIn_10_0;
            }
            stackIn_8_0 = "null";
            return stackIn_8_0;
          }
          var4_int = param3 + param1;
          var5 = 0;
          for (var6_int = param1; var4_int > var6_int; var6_int++) {
            var7_ref_CharSequence = param0[var6_int];
            if (var7_ref_CharSequence != null) {
              var5 = var5 + var7_ref_CharSequence.length();
            } else {
              var5 += 4;
            }
          }
          var6 = new StringBuilder(var5);
          for (var7 = param1; var4_int > var7; var7++) {
            var8 = param0[var7];
            if (var8 == null) {
              discarded$0 = var6.append("null");
            } else {
              discarded$1 = var6.append(var8);
            }
          }
          if (param2 == 4) {
            stackIn_29_0 = var6.toString();
            return stackIn_29_0;
          }
          stackIn_27_0 = (String) null;
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_32_0 = var4_ref;
          stackIn_32_1 = new StringBuilder().append("eq.A(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 0) {
          eq.a(-117);
        }
    }

    private eq(qb param0, ai param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_d = param1;
          this.field_i = param0;
          this.field_e = param3;
          this.field_a = param2;
          if (this.field_i.e(82)) {
            return;
          }
          this.field_h = this.field_i.a(487989472, 255, true, 255, (byte) 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("eq.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final boolean c(int param0) {
        int var7 = 0;
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var8;
        k var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        if (null != this.field_b) {
          return true;
        }
        if (null == this.field_h) {
          if (this.field_i.e(54)) {
            return false;
          }
          this.field_h = this.field_i.a(487989472, 255, true, 255, (byte) 0);
        }
        if (this.field_h.field_t) {
          return false;
        }
        var10 = new k(this.field_h.e(0));
        var10.field_j = 5;
        var3 = var10.g(31365);
        var10.field_j = var10.field_j + var3 * 72;
        var13 = new byte[var10.field_m.length - var10.field_j];
        var11 = var13;
        var4 = var11;
        var10.a(0, -6351, var13.length, var13);
        if (null != this.field_a &&
          null != this.field_e) {
          var12 = new java.math.BigInteger(var13);
          var7_ref_java_math_BigInteger = var12.modPow(this.field_a, this.field_e);
          var5 = var7_ref_java_math_BigInteger.toByteArray();
        } else {
          var5 = var4;
        }
        if (var5.length != 65) {
          throw new RuntimeException();
        }
        var15 = ho.a(4246, 5, var10.field_m, -var13.length + (var10.field_j - 5));
        for (var7 = 0; 64 > var7; var7++) {
          if (var15[var7] != var5[var7 + 1]) {
            throw new RuntimeException();
          }
        }
        if (param0 > -113) {
          this.field_h = (tn) null;
        }
        this.field_b = var10;
        this.field_f = new cn[var3];
        return true;
    }

    final void b(int param0) {
        cn stackIn_12_0 = null;
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_f == null) {
          return;
        }
        for (var2 = param0; this.field_f.length > var2; var2++) {
          if (this.field_f[var2] != null) {
            this.field_f[var2].c(90);
          }
        }
        for (var2Lifetime1 = 0; this.field_f.length > var2Lifetime1; var2Lifetime1++) {
          stackIn_12_0 = this.field_f[var2Lifetime1];
          if (stackIn_12_0 != null) {
            this.field_f[var2Lifetime1].b(-2);
          }
        }
        return;
    }

    static {
        field_g = 9;
    }
}
