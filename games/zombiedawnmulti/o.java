/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o {
    static boolean field_j;
    private int[] field_c;
    private int field_f;
    static int field_b;
    static ja field_h;
    static String field_l;
    private int field_k;
    static boolean field_i;
    private int field_a;
    private int[] field_g;
    private int field_e;
    static String field_d;

    final static void d(int param0) {
        int var1_int = 0;
        int var2 = ZombieDawnMulti.field_E ? 1 : 0;
        int var1_intLifetime1;
        try {
          kj.field_r.b(-102);
          for (var1_int = 0; var1_int < 32; var1_int++) {
            dc.field_Ib[var1_int] = 0L;
          }
          if (param0 != 26673) {
            o.b(-5);
          }
          for (var1_intLifetime1 = 0; var1_intLifetime1 < 32; var1_intLifetime1++) {
            pj.field_K[var1_intLifetime1] = 0L;
          }
          ic.field_a = 0;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "o.F(" + param0 + ')');
        }
    }

    private final void c(int param0) {
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        int fieldTemp$0 = this.field_f + 1;
        this.field_f = this.field_f + 1;
        this.field_e = this.field_e + fieldTemp$0;
        var2 = 0;
        if (param0 != 2) {
          return;
        }
        while (var2 < 256) {
          var3 = this.field_c[var2];
          if ((2 & var2) != 0) {
            if ((var2 & 1) == 0) {
              this.field_a = this.field_a ^ this.field_a << 2;
            } else {
              this.field_a = this.field_a ^ this.field_a >>> 16;
            }
          } else {
            if ((1 & var2) == 0) {
              this.field_a = this.field_a ^ this.field_a << 13;
            } else {
              this.field_a = this.field_a ^ this.field_a >>> 6;
            }
          }
          this.field_a = this.field_a + this.field_c[255 & var2 + 128];
          dupTemp$1 = this.field_c[tq.b(var3 >> 2, 255)] - (-this.field_a - this.field_e);
          var4 = dupTemp$1;
          this.field_c[var2] = dupTemp$1;
          dupTemp$2 = var3 + this.field_c[tq.b(var4 >> 8, 1020) >> 2];
          this.field_e = dupTemp$2;
          this.field_g[var2] = dupTemp$2;
          var2++;
        }
    }

    final int a(int param0) {
        if (param0 > -20) {
          field_b = -115;
        }
        if (this.field_k == 0) {
          this.c(2);
          this.field_k = 256;
        }
        int fieldTemp$0 = this.field_k - 1;
        this.field_k = this.field_k - 1;
        return this.field_g[fieldTemp$0];
    }

    public static void b(int param0) {
        field_l = null;
        field_d = null;
        field_h = null;
        if (param0 != -13532) {
          o.b(-51);
        }
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var11 = ZombieDawnMulti.field_E ? 1 : 0;
        int var3 = -1640531527;
        int var10 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var5 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        int var4 = -1640531527;
        int var2Lifetime1;
        int var2Lifetime2;
        for (var2 = 0; 4 > var2; var2++) {
          var3 = var3 ^ var4 << 11;
          var4 = var4 + var5;
          var6 = var6 + var3;
          var4 = var4 ^ var5 >>> 2;
          var5 = var5 + var6;
          var7 = var7 + var4;
          var5 = var5 ^ var6 << 8;
          var8 = var8 + var5;
          var6 = var6 + var7;
          var6 = var6 ^ var7 >>> 16;
          var9 = var9 + var6;
          var7 = var7 + var8;
          var7 = var7 ^ var8 << 10;
          var10 = var10 + var7;
          var8 = var8 + var9;
          var8 = var8 ^ var9 >>> 4;
          var9 = var9 + var10;
          var3 = var3 + var8;
          var9 = var9 ^ var10 << 8;
          var10 = var10 + var3;
          var4 = var4 + var9;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 256; var2Lifetime1 += 8) {
          var9 = var9 + this.field_g[var2Lifetime1 + 6];
          var10 = var10 + this.field_g[7 + var2Lifetime1];
          var7 = var7 + this.field_g[4 + var2Lifetime1];
          var3 = var3 + this.field_g[var2Lifetime1];
          var5 = var5 + this.field_g[var2Lifetime1 + 2];
          var8 = var8 + this.field_g[5 + var2Lifetime1];
          var4 = var4 + this.field_g[1 + var2Lifetime1];
          var6 = var6 + this.field_g[3 + var2Lifetime1];
          var3 = var3 ^ var4 << 11;
          var4 = var4 + var5;
          var6 = var6 + var3;
          var4 = var4 ^ var5 >>> 2;
          var5 = var5 + var6;
          var7 = var7 + var4;
          var5 = var5 ^ var6 << 8;
          var6 = var6 + var7;
          var8 = var8 + var5;
          var6 = var6 ^ var7 >>> 16;
          var7 = var7 + var8;
          var9 = var9 + var6;
          var7 = var7 ^ var8 << 10;
          var8 = var8 + var9;
          var10 = var10 + var7;
          var8 = var8 ^ var9 >>> 4;
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var5 = var5 + var10;
          var3 = var3 + var4;
          this.field_c[var2Lifetime1] = var3;
          this.field_c[1 + var2Lifetime1] = var4;
          this.field_c[2 + var2Lifetime1] = var5;
          this.field_c[3 + var2Lifetime1] = var6;
          this.field_c[var2Lifetime1 + 4] = var7;
          this.field_c[5 + var2Lifetime1] = var8;
          this.field_c[6 + var2Lifetime1] = var9;
          this.field_c[var2Lifetime1 + 7] = var10;
        }
        for (var2Lifetime2 = 0; var2Lifetime2 < 256; var2Lifetime2 += 8) {
          var9 = var9 + this.field_c[var2Lifetime2 + 6];
          var5 = var5 + this.field_c[2 + var2Lifetime2];
          var6 = var6 + this.field_c[3 + var2Lifetime2];
          var4 = var4 + this.field_c[1 + var2Lifetime2];
          var3 = var3 + this.field_c[var2Lifetime2];
          var8 = var8 + this.field_c[5 + var2Lifetime2];
          var10 = var10 + this.field_c[7 + var2Lifetime2];
          var7 = var7 + this.field_c[4 + var2Lifetime2];
          var3 = var3 ^ var4 << 11;
          var4 = var4 + var5;
          var6 = var6 + var3;
          var4 = var4 ^ var5 >>> 2;
          var5 = var5 + var6;
          var7 = var7 + var4;
          var5 = var5 ^ var6 << 8;
          var8 = var8 + var5;
          var6 = var6 + var7;
          var6 = var6 ^ var7 >>> 16;
          var9 = var9 + var6;
          var7 = var7 + var8;
          var7 = var7 ^ var8 << 10;
          var8 = var8 + var9;
          var10 = var10 + var7;
          var8 = var8 ^ var9 >>> 4;
          var9 = var9 + var10;
          var3 = var3 + var8;
          var9 = var9 ^ var10 << 8;
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
          this.field_c[var2Lifetime2] = var3;
          this.field_c[var2Lifetime2 + 1] = var4;
          this.field_c[2 + var2Lifetime2] = var5;
          this.field_c[var2Lifetime2 + 3] = var6;
          this.field_c[var2Lifetime2 + 4] = var7;
          this.field_c[var2Lifetime2 + 5] = var8;
          this.field_c[var2Lifetime2 + 6] = var9;
          this.field_c[7 + var2Lifetime2] = var10;
        }
        if (param0) {
          this.c(104);
        }
        this.c(2);
        this.field_k = 256;
    }

    o(int[] param0) {
        int var2_int = 0;
        try {
          this.field_c = new int[256];
          this.field_g = new int[256];
          for (var2_int = 0; var2_int < param0.length; var2_int++) {
            this.field_g[var2_int] = param0[var2_int];
          }
          this.a(false);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "o.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(u param0, int param1, int param2) {
        ga var3 = ma.field_a;
        var3.b((byte) -35, param1);
        var3.a(-54, 2);
        if (param2 >= -69) {
          return;
        }
        try {
          var3.a(125, 0);
          var3.a(-55, param0.field_g);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "o.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_l = "If you are not, please change your password to something more obscure!";
        field_i = true;
        field_d = "Type your email address again to make sure it's correct";
    }
}
