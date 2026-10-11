/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk {
    private java.math.BigInteger field_i;
    private wk field_d;
    private lk field_l;
    private java.math.BigInteger field_j;
    static java.awt.Frame field_c;
    private vk field_h;
    private tj[] field_b;
    static String[] field_f;
    private pa field_e;
    static kc field_g;
    static m field_k;
    static String field_a;

    final boolean b(byte param0) {
        int var7 = 0;
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var8;
        wk var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        if (this.field_d != null) {
          return true;
        }
        if (this.field_h == null) {
          if (this.field_l.c((byte) 96)) {
            return false;
          }
          this.field_h = this.field_l.a(255, true, 255, (byte) -80, (byte) 0);
        }
        if (this.field_h.field_p) {
          return false;
        }
        var10 = new wk(this.field_h.c(-20));
        var10.field_g = 5;
        var3 = var10.e((byte) 103);
        var10.field_g = var10.field_g + var3 * 72;
        var13 = new byte[-var10.field_g + var10.field_j.length];
        var11 = var13;
        var4 = var11;
        var10.a((byte) 74, 0, var4, var13.length);
        if (null != this.field_j &&
          this.field_i != null) {
          var12 = new java.math.BigInteger(var13);
          var7_ref_java_math_BigInteger = var12.modPow(this.field_j, this.field_i);
          var5 = var7_ref_java_math_BigInteger.toByteArray();
        } else {
          var5 = var4;
        }
        if (param0 != -52) {
          this.field_e = (pa) null;
        }
        if (65 != var5.length) {
          throw new RuntimeException();
        }
        var15 = nn.a(var10.field_g - (var13.length + 5), (byte) -93, var10.field_j, 5);
        for (var7 = 0; var7 < 64; var7++) {
          if (var15[var7] != var5[1 + var7]) {
            throw new RuntimeException();
          }
        }
        this.field_b = new tj[var3];
        this.field_d = var10;
        return true;
    }

    gk(lk param0, pa param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final tj a(be param0, boolean param1, int param2, be param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        tj var9 = null;
        byte[] var13 = null;
        tj stackIn_10_0 = null;
        tj stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_d == null) {
            throw new RuntimeException();
          }
          if (0 <= param4 &&
            this.field_b.length > param4) {
            if (this.field_b[param4] != null) {
              stackIn_10_0 = this.field_b[param4];
              return stackIn_10_0;
            }
            this.field_d.field_g = 6 + 72 * param4;
            if (param2 > -51) {
              field_g = (kc) null;
            }
            var6_int = this.field_d.d(-10674);
            var7 = this.field_d.d(-10674);
            var13 = new byte[64];
            this.field_d.a((byte) 92, 0, var13, 64);
            var9 = new tj(param4, param3, param0, this.field_l, this.field_e, var6_int, var13, var7, param1);
            this.field_b[param4] = var9;
            stackIn_14_0 = var9;
            return stackIn_14_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("gk.E(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_k = null;
        field_c = null;
        field_g = null;
        if (param0 != -90) {
          field_a = (String) null;
        }
        field_f = null;
        field_a = null;
    }

    private gk(lk param0, pa param1, java.math.BigInteger param2, java.math.BigInteger param3) {
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
          this.field_e = param1;
          this.field_i = param3;
          this.field_j = param2;
          this.field_l = param0;
          if (!this.field_l.c((byte) -91)) {
            this.field_h = this.field_l.a(255, true, 255, (byte) -80, (byte) 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("gk.<init>(");
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
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void a(int param0) {
        int var2;
        int var3;
        tj stackIn_15_0 = null;
        CharSequence var4;
        int var2Lifetime1;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (this.field_b == null) {
          return;
        }
        for (var2 = 0; this.field_b.length > var2; var2++) {
          if (this.field_b[var2] != null) {
            this.field_b[var2].a(false);
          }
        }
        if (param0 != -8456) {
          var4 = (CharSequence) null;
          gk.a((CharSequence) null, 112);
        }
        for (var2Lifetime1 = 0; this.field_b.length > var2Lifetime1; var2Lifetime1++) {
          stackIn_15_0 = this.field_b[var2Lifetime1];
          if (stackIn_15_0 != null) {
            this.field_b[var2Lifetime1].f((byte) 59);
          }
        }
    }

    final static String a(CharSequence param0, int param1) {
        int var6 = 0;
        StringBuilder discarded$0 = null;
        Object stackIn_27_0 = null;
        String stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param0 == null) {
            return null;
          }
          var2_int = 0;
          var3 = param0.length();
          while (var3 > var2_int) {
            if (rk.a((byte) 120, param0.charAt(var2_int))) {
              var2_int++;
              continue;
            }
            break;
          }
          if (param1 != -13) {
            field_g = (kc) null;
          }
          while (var2_int < var3) {
            if (rk.a((byte) -16, param0.charAt(-1 + var3))) {
              var3--;
              continue;
            }
            break;
          }
          var4 = var3 - var2_int;
          if (var4 < 1) {
            return null;
          }
          if (var4 > 12) {
            return null;
          }
          var5 = new StringBuilder(var4);
          for (var6 = var2_int; var6 < var3; var6++) {
            var7 = param0.charAt(var6);
            if (qo.a((char) var7, param1 ^ -13)) {
              var8 = af.a((char) var7, (byte) 22);
              if (var8 != 0) {
                discarded$0 = var5.append((char) var8);
              }
            }
          }
          if (var5.length() != 0) {
            stackIn_29_0 = var5.toString();
            return stackIn_29_0;
          }
          stackIn_27_0 = null;
          return (String) (stackIn_27_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_32_0 = var2;
          stackIn_32_1 = new StringBuilder().append("gk.C(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_f = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_a = "MOST BOUNCY - ";
    }
}
