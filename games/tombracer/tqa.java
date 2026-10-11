/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tqa implements fo {
    private int field_c;
    private int field_m;
    private int field_h;
    private int field_b;
    private int field_i;
    static char field_o;
    static byte[] field_e;
    static int field_g;
    static String field_k;
    private int field_a;
    private la field_f;
    private int field_d;
    private vna field_p;
    private int field_l;
    private pca[] field_j;
    private int field_n;

    public final int c(byte param0) {
        if (param0 < 91) {
          this.field_h = 23;
        }
        return this.field_f.s(38) / 2;
    }

    private final int a(byte param0, int param1, int param2) {
        int var4 = 55 / ((-30 - param0) / 56);
        return param2 + (-this.field_c + (-this.field_l + param1) * this.field_i);
    }

    final static void a(boolean param0, byte param1) {
        int var2 = -75 / ((param1 + 12) / 44);
        ej.field_a.b(-42, 0, 0);
    }

    private final void a(int param0, la param1, int param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          this.field_c = 0;
          this.field_l = 0;
          this.field_a = param3 / param0;
          this.field_h = param2 / param0;
          this.field_n = this.field_a + param4;
          this.field_d = 0 + this.field_h;
          this.field_m = param0;
          this.field_f = param1;
          this.field_b = -this.field_l + this.field_n;
          this.field_i = -this.field_c + this.field_d;
          this.field_j = new pca[this.field_b * this.field_i];
          for (var6_int = this.field_c; var6_int < this.field_d; var6_int++) {
            for (var7 = this.field_l; var7 < this.field_n; var7++) {
              this.a(var6_int, new pca(), var7, 10);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("tqa.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final int b(byte param0) {
        int var2 = -60 % ((param0 + 23) / 53);
        return this.field_f.m((byte) -86) / 2;
    }

    public final void f(int param0) {
        if (param0 != -4366) {
          this.c((byte) -59);
        }
    }

    final void a(byte param0, kh param1, la param2) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        lk var6 = null;
        int var7 = 0;
        int var4_intLifetime1;
        int var5Lifetime1;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 != 25) {
            this.field_f = (la) null;
          }
          this.field_p.d(8);
          if (param2.field_E > 8) {
            if (param2.field_E <= 9) {
              param1.b((byte) 44, 8);
              param1.b((byte) 44, 8);
            }
            for (var4_int = 0; var4_int < this.field_a; var4_int++) {
              for (var5 = 0; this.field_h > var5; var5++) {
                this.a(param0 - 133, var5, var4_int).a((byte) 29, param2, param1);
              }
            }
            if (10 <= param2.field_E) {
              var4_intLifetime1 = param1.b((byte) 44, 8);
              for (var5Lifetime1 = 0; var5Lifetime1 < var4_intLifetime1; var5Lifetime1++) {
                var6 = new lk(param2, param1);
                this.field_p.b((byte) -77, var6);
              }
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("tqa.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final int c(int param0) {
        if (param0 < 0) {
          this.field_l = 127;
        }
        return this.field_a;
    }

    final void f(byte param0) {
        int var3 = 0;
        int var4 = 0;
        pca var5 = null;
        int var6 = TombRacer.field_G ? 1 : 0;
        pca[] var2 = this.field_j;
        this.a(this.field_m, this.field_f, -125);
        if (param0 != 64) {
          this.field_d = -6;
        }
        for (var3 = this.field_c; this.field_d > var3; var3++) {
          for (var4 = this.field_l; this.field_n > var4; var4++) {
            var5 = var2[this.a((byte) 93, var4, -1 - var3 + this.field_h)];
            this.a(var3, var5, var4, 10);
            var5.e(param0 - 64);
          }
        }
        lk var7 = (lk) (this.field_p.f(param0 ^ -16));
        while (var7 != null) {
          var7.a(this.field_f, (byte) 104);
          var7 = (lk) (this.field_p.e(107));
        }
    }

    final boolean a(int param0, byte param1, int param2) {
        boolean stackIn_8_0 = false;
        if (param1 != 48) {
          return false;
        }
        stackIn_8_0 = (param2 >= 0) && (0 <= param0) && (param2 < this.field_h) && (this.field_a > param0);
        return stackIn_8_0;
    }

    public static void a(byte param0) {
        if (param0 < 24) {
          return;
        }
        field_k = null;
        field_e = null;
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
          this.a(8, 65, true, 67, -80, 46, 77);
        }
        return false;
    }

    public final void a(int param0, iq param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        lk var6 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 <= 103) {
            return;
          }
          for (var3_int = 0; var3_int < this.field_i; var3_int++) {
            for (var4 = 0; this.field_b > var4; var4++) {
              this.a(-118, var3_int, var4).a((byte) 117, param1);
            }
          }
          var6 = (lk) (this.field_p.f(-80));
          while (var6 != null) {
            var6.a(119, param1);
            var6 = (lk) (this.field_p.e(107));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("tqa.DB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public final int e(byte param0) {
        if (param0 > -86) {
          this.field_d = -124;
          return 0;
        }
        return 0;
    }

    private final void a(int param0, pca param1, int param2, int param3) {
        int var5_int = 0;
        try {
          if (param3 != 10) {
            field_g = -103;
          }
          var5_int = this.a((byte) 113, param2, param0);
          this.field_j[var5_int] = param1;
          this.field_j[var5_int].a(param0, 125, param2, this);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "tqa.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int a(int param0) {
        int var2 = -52 / ((-4 - param0) / 62);
        return this.field_h;
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        this.a(param6, param3, -123, param0, param4, param1, param5, -1);
        if (!param2) {
          this.field_j = (pca[]) null;
        }
    }

    final int d(int param0) {
        if (param0 != -30551) {
          this.a(1, false);
        }
        return this.field_m;
    }

    final boolean b(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int var15 = 0;
        int var16 = 0;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        pca var17;
        int var18;
        var18 = TombRacer.field_G ? 1 : 0;
        var8 = 1;
        var9 = param5 / 2;
        var10 = param0 / 2;
        if (param3 != 8597) {
          this.field_c = -71;
        }
        var11 = this.a(param4 - var9 + var8, false);
        var12 = this.a(-var10 + (param1 + var8), false);
        var13 = this.a(-var8 + (param4 + var9), false);
        var14 = this.a(-var8 + (param1 + var10), false);
        for (var15 = var11; var13 >= var15; var15++) {
          for (var16 = var12; var14 >= var16; var16++) {
            if (!this.a(var16, (byte) 48, var15)) {
              if (param2) {
                return true;
              }
            } else {
              var17 = this.a(-115, var15, var16);
              if (var17.a(param6, 0)) {
                return true;
              }
            }
          }
        }
        return false;
    }

    final la b(int param0) {
        if (param0 != 0) {
          field_g = -85;
        }
        return this.field_f;
    }

    final int a(int param0, boolean param1) {
        int var3 = 0;
        if (param1) {
          return -102;
        }
        if (param0 < 0) {
          var3 = (param0 + 1 - this.field_m) / this.field_m;
        } else {
          var3 = param0 / this.field_m;
        }
        return var3;
    }

    final void a(uw param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          for (var3_int = param1; var3_int < this.field_j.length; var3_int++) {
            this.field_j[var3_int].a(param0, (byte) 84);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("tqa.H(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final void b(int param0, int param1, int param2) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = TombRacer.field_G ? 1 : 0;
        if (param1 != 2) {
          this.field_i = -62;
        }
        pca[] var4 = this.field_j;
        int var5 = this.field_i;
        int var6 = this.field_b;
        this.a(param0, this.field_f, 0);
        int var7 = param2 / param0;
        int var8 = param2 / param0;
        for (var9_int = 0; this.field_i > var9_int; var9_int++) {
          for (var10 = 0; this.field_b > var10; var10++) {
            var11 = za.$cfr$intArgs$a$c604db63f465(0, 113, var5 - 1, var9_int - var7);
            var12 = za.$cfr$intArgs$a$c604db63f465(0, 85, -1 + var6, var10 - var8);
            this.a(param1 - 115, var9_int, var10).a(var4[var12 * var5 + var11], 21324);
          }
        }
        lk var9 = (lk) (this.field_p.f(-80));
        while (var9 != null) {
          var9.a(-6492, var9.a((byte) 124) + param2);
          var9.b(param1 ^ 2, param2 + var9.g((byte) -121));
          var9 = (lk) (this.field_p.e(118));
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var16 = 0;
        int var17 = 0;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        pca var18;
        int var19;
        la var20;
        var19 = TombRacer.field_G ? 1 : 0;
        var9 = -1 + this.field_m;
        var10 = param6 / 2;
        var11 = param4 / 2;
        if (param1 == 1) {
          var10 = var10 + this.field_m;
          var11 = var11 + this.field_m;
        }
        var12 = iia.d(this.field_c, this.a(-var10 + param0 + var9, false), 2);
        var13 = iia.d(this.field_l, this.a(var9 - var11 + param3, false), 2);
        var14 = et.b(this.a(-var9 + var10 + param0, false), -1 + this.field_d, 124);
        var15 = et.b(this.a(var11 + (param3 - var9), false), this.field_n - 1, 101);
        if (param2 > -104) {
          var20 = (la) null;
          this.a((byte) -39, (kh) null, (la) null);
        }
        for (var16 = var12; var14 >= var16; var16++) {
          for (var17 = var13; var17 <= var15; var17++) {
            if (this.a(var17, (byte) 48, var16)) {
              var18 = this.a(127, var16, var17);
              if (param5 != -1) {
                var18.a(param7, param5, true);
              }
              if (param1 != -1) {
                var18.a((byte) 29, param7);
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        this.a(param3, param0, -110, param5, param1, param4, param2, 1);
        if (!param6) {
          this.field_p = (vna) null;
        }
    }

    final void a(int param0, la param1, int param2) {
        try {
          this.a(param0, param1, param1.m((byte) -86), param1.s(-125), 0);
          int var4_int = 17 / ((-78 - param2) / 43);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "tqa.U(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final pca a(int param0, int param1, byte param2) {
        int var4 = this.a(param1, false);
        int var5 = this.a(param0, false);
        if (!this.a(var5, (byte) 48, var4)) {
          return null;
        }
        if (param2 != 119) {
          return (pca) null;
        }
        return this.a(-116, var4, var5);
    }

    final void a(int param0, byte param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        lk var5 = (lk) (this.field_p.f(-80));
        while (var5 != null) {
          if (!var5.a(param0, false)) {
            var5.p(56);
          }
          var5 = (lk) (this.field_p.e(126));
        }
        if (param1 > -11) {
          this.field_n = 14;
        }
    }

    final void a(int param0, kh param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        lk var6 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          for (var3_int = 0; this.field_a > var3_int; var3_int++) {
            for (var4 = 0; this.field_h > var4; var4++) {
              this.a(-98, var4, var3_int).a(param1, -78);
            }
          }
          param1.a((byte) -128, this.field_p.a((byte) -16), param0);
          var6 = (lk) (this.field_p.f(-80));
          while (var6 != null) {
            var6.a((byte) -128, param1);
            var6 = (lk) (this.field_p.e(123));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("tqa.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final pca a(int param0, int param1, int param2) {
        int var4 = -107 % ((param0 + 36) / 59);
        return this.field_j[this.a((byte) 31, param2, param1)];
    }

    tqa(la param0, int param1) {
        this.field_p = new vna();
        try {
          this.a(param1, param0, 107);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "tqa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_o = '/';
        field_g = -1;
        field_k = "You need a rating of <%1> to play with the current options.";
    }
}
