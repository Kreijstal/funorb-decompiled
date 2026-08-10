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
        try {
            kj.field_r.b(-102);
            for (var1_int = 0; -33 < (var1_int ^ -1); var1_int++) {
                dc.field_Ib[var1_int] = 0L;
            }
            if (param0 != 26673) {
                o.b(-5);
            }
            for (var1_int = 0; -33 < (var1_int ^ -1); var1_int++) {
                pj.field_K[var1_int] = 0L;
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
        if (param0 == 2) {
          L0: while (true) {
            if (-257 >= (var2 ^ -1)) {
              return;
            } else {
              L1: {
                var3 = this.field_c[var2];
                if ((2 & var2) != 0) {
                  if (-1 == (var2 & 1 ^ -1)) {
                    this.field_a = this.field_a ^ this.field_a << 1147010754;
                    break L1;
                  } else {
                    this.field_a = this.field_a ^ this.field_a >>> -465059280;
                    break L1;
                  }
                } else {
                  if ((1 & var2) == 0) {
                    this.field_a = this.field_a ^ this.field_a << 30377645;
                    break L1;
                  } else {
                    this.field_a = this.field_a ^ this.field_a >>> 143456070;
                    break L1;
                  }
                }
              }
              this.field_a = this.field_a + this.field_c[255 & var2 + 128];
              dupTemp$1 = this.field_c[tq.b(var3 >> 2130026562, 255)] - (-this.field_a + -this.field_e);
              var4 = dupTemp$1;
              this.field_c[var2] = dupTemp$1;
              dupTemp$2 = var3 + this.field_c[tq.b(var4 >> 2054902344, 1020) >> -2036713214];
              this.field_e = dupTemp$2;
              this.field_g[var2] = dupTemp$2;
              var2++;
              continue L0;
            }
          }
        } else {
          return;
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
        for (var2 = 0; 4 > var2; var2++) {
            var3 = var3 ^ var4 << -1613804693;
            var4 = var4 + var5;
            var6 = var6 + var3;
            var4 = var4 ^ var5 >>> -1121109854;
            var5 = var5 + var6;
            var7 = var7 + var4;
            var5 = var5 ^ var6 << 913084296;
            var8 = var8 + var5;
            var6 = var6 + var7;
            var6 = var6 ^ var7 >>> -691264880;
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << -683511286;
            var10 = var10 + var7;
            var8 = var8 + var9;
            var8 = var8 ^ var9 >>> -1328579900;
            var9 = var9 + var10;
            var3 = var3 + var8;
            var9 = var9 ^ var10 << 688162056;
            var10 = var10 + var3;
            var4 = var4 + var9;
            var10 = var10 ^ var3 >>> -1655429527;
            var3 = var3 + var4;
            var5 = var5 + var10;
        }
        for (var2 = 0; -257 < (var2 ^ -1); var2 += 8) {
            var9 = var9 + this.field_g[var2 + 6];
            var10 = var10 + this.field_g[7 + var2];
            var7 = var7 + this.field_g[4 + var2];
            var3 = var3 + this.field_g[var2];
            var5 = var5 + this.field_g[var2 + 2];
            var8 = var8 + this.field_g[5 + var2];
            var4 = var4 + this.field_g[1 + var2];
            var6 = var6 + this.field_g[3 + var2];
            var3 = var3 ^ var4 << 1979023147;
            var4 = var4 + var5;
            var6 = var6 + var3;
            var4 = var4 ^ var5 >>> -1830220158;
            var5 = var5 + var6;
            var7 = var7 + var4;
            var5 = var5 ^ var6 << 664497352;
            var6 = var6 + var7;
            var8 = var8 + var5;
            var6 = var6 ^ var7 >>> -1421901168;
            var7 = var7 + var8;
            var9 = var9 + var6;
            var7 = var7 ^ var8 << 1588423242;
            var8 = var8 + var9;
            var10 = var10 + var7;
            var8 = var8 ^ var9 >>> 391159908;
            var3 = var3 + var8;
            var9 = var9 + var10;
            var9 = var9 ^ var10 << 302716168;
            var4 = var4 + var9;
            var10 = var10 + var3;
            var10 = var10 ^ var3 >>> -1688836407;
            var5 = var5 + var10;
            var3 = var3 + var4;
            this.field_c[var2] = var3;
            this.field_c[1 + var2] = var4;
            this.field_c[2 + var2] = var5;
            this.field_c[3 + var2] = var6;
            this.field_c[var2 + 4] = var7;
            this.field_c[5 + var2] = var8;
            this.field_c[6 + var2] = var9;
            this.field_c[var2 + 7] = var10;
        }
        for (var2 = 0; var2 < 256; var2 += 8) {
            var9 = var9 + this.field_c[var2 + 6];
            var5 = var5 + this.field_c[2 + var2];
            var6 = var6 + this.field_c[3 + var2];
            var4 = var4 + this.field_c[1 + var2];
            var3 = var3 + this.field_c[var2];
            var8 = var8 + this.field_c[5 + var2];
            var10 = var10 + this.field_c[7 + var2];
            var7 = var7 + this.field_c[4 + var2];
            var3 = var3 ^ var4 << 912764459;
            var4 = var4 + var5;
            var6 = var6 + var3;
            var4 = var4 ^ var5 >>> -1922193342;
            var5 = var5 + var6;
            var7 = var7 + var4;
            var5 = var5 ^ var6 << 689781704;
            var8 = var8 + var5;
            var6 = var6 + var7;
            var6 = var6 ^ var7 >>> 136627088;
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << -215086742;
            var8 = var8 + var9;
            var10 = var10 + var7;
            var8 = var8 ^ var9 >>> -1417220188;
            var9 = var9 + var10;
            var3 = var3 + var8;
            var9 = var9 ^ var10 << -1419521080;
            var4 = var4 + var9;
            var10 = var10 + var3;
            var10 = var10 ^ var3 >>> -2047021143;
            var3 = var3 + var4;
            var5 = var5 + var10;
            this.field_c[var2] = var3;
            this.field_c[var2 - -1] = var4;
            this.field_c[2 + var2] = var5;
            this.field_c[var2 - -3] = var6;
            this.field_c[var2 + 4] = var7;
            this.field_c[var2 - -5] = var8;
            this.field_c[var2 - -6] = var9;
            this.field_c[7 + var2] = var10;
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
