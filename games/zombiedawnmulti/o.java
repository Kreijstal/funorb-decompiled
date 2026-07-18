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
            for (var1_int = 0; var1_int < 32; var1_int++) {
                dc.field_Ib[var1_int] = 0L;
            }
            for (var1_int = 0; var1_int < 32; var1_int++) {
                pj.field_K[var1_int] = 0L;
            }
            ic.field_a = 0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "o.F(" + 26673 + ')');
        }
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        int fieldTemp$3 = ((o) this).field_f + 1;
        ((o) this).field_f = ((o) this).field_f + 1;
        ((o) this).field_e = ((o) this).field_e + fieldTemp$3;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 256) {
            return;
          } else {
            L1: {
              var3 = ((o) this).field_c[var2];
              if ((2 & var2) != 0) {
                if ((var2 & 1) == 0) {
                  ((o) this).field_a = ((o) this).field_a ^ ((o) this).field_a << 2;
                  break L1;
                } else {
                  ((o) this).field_a = ((o) this).field_a ^ ((o) this).field_a >>> 16;
                  break L1;
                }
              } else {
                if ((1 & var2) == 0) {
                  ((o) this).field_a = ((o) this).field_a ^ ((o) this).field_a << 13;
                  break L1;
                } else {
                  ((o) this).field_a = ((o) this).field_a ^ ((o) this).field_a >>> 6;
                  break L1;
                }
              }
            }
            ((o) this).field_a = ((o) this).field_a + ((o) this).field_c[255 & var2 + 128];
            int dupTemp$4 = ((o) this).field_c[tq.b(var3 >> 2, 255)] - (-((o) this).field_a + -((o) this).field_e);
            var4 = dupTemp$4;
            ((o) this).field_c[var2] = dupTemp$4;
            int dupTemp$5 = var3 + ((o) this).field_c[tq.b(var4 >> 8, 1020) >> 2];
            ((o) this).field_e = dupTemp$5;
            ((o) this).field_g[var2] = dupTemp$5;
            var2++;
            continue L0;
          }
        }
    }

    final int a(int param0) {
        if (param0 > -20) {
            field_b = -115;
        }
        if (((o) this).field_k == 0) {
            this.c(2);
            ((o) this).field_k = 256;
        }
        int fieldTemp$0 = ((o) this).field_k - 1;
        ((o) this).field_k = ((o) this).field_k - 1;
        return ((o) this).field_g[fieldTemp$0];
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
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        var3 = -1640531527;
        var10 = -1640531527;
        var6 = -1640531527;
        var7 = -1640531527;
        var5 = -1640531527;
        var8 = -1640531527;
        var9 = -1640531527;
        var4 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if (4 <= var2) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 256) {
                var2 = 0;
                L2: while (true) {
                  if (var2 >= 256) {
                    this.c(104);
                    this.c(2);
                    ((o) this).field_k = 256;
                    return;
                  } else {
                    var9 = var9 + ((o) this).field_c[var2 + 6];
                    var5 = var5 + ((o) this).field_c[2 + var2];
                    var6 = var6 + ((o) this).field_c[3 + var2];
                    var4 = var4 + ((o) this).field_c[1 + var2];
                    var3 = var3 + ((o) this).field_c[var2];
                    var8 = var8 + ((o) this).field_c[5 + var2];
                    var10 = var10 + ((o) this).field_c[7 + var2];
                    var7 = var7 + ((o) this).field_c[4 + var2];
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
                    ((o) this).field_c[var2] = var3;
                    ((o) this).field_c[var2 - -1] = var4;
                    ((o) this).field_c[2 + var2] = var5;
                    ((o) this).field_c[var2 - -3] = var6;
                    ((o) this).field_c[var2 + 4] = var7;
                    ((o) this).field_c[var2 - -5] = var8;
                    ((o) this).field_c[var2 - -6] = var9;
                    ((o) this).field_c[7 + var2] = var10;
                    var2 += 8;
                    continue L2;
                  }
                }
              } else {
                var9 = var9 + ((o) this).field_g[var2 + 6];
                var10 = var10 + ((o) this).field_g[7 + var2];
                var7 = var7 + ((o) this).field_g[4 + var2];
                var3 = var3 + ((o) this).field_g[var2];
                var5 = var5 + ((o) this).field_g[var2 + 2];
                var8 = var8 + ((o) this).field_g[5 + var2];
                var4 = var4 + ((o) this).field_g[1 + var2];
                var6 = var6 + ((o) this).field_g[3 + var2];
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
                ((o) this).field_c[var2] = var3;
                ((o) this).field_c[1 + var2] = var4;
                ((o) this).field_c[2 + var2] = var5;
                ((o) this).field_c[3 + var2] = var6;
                ((o) this).field_c[var2 + 4] = var7;
                ((o) this).field_c[5 + var2] = var8;
                ((o) this).field_c[6 + var2] = var9;
                ((o) this).field_c[var2 + 7] = var10;
                var2 += 8;
                continue L1;
              }
            }
          } else {
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
            var2++;
            continue L0;
          }
        }
    }

    o(int[] param0) {
        int var2_int = 0;
        try {
            ((o) this).field_c = new int[256];
            ((o) this).field_g = new int[256];
            for (var2_int = 0; var2_int < param0.length; var2_int++) {
                ((o) this).field_g[var2_int] = param0[var2_int];
            }
            this.a(false);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "o.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(u param0, int param1, int param2) {
        ga var3 = ma.field_a;
        var3.b((byte) -35, 5);
        var3.a(-54, 2);
        try {
            var3.a(125, 0);
            var3.a(-55, param0.field_g);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "o.C(" + (param0 != null ? "{...}" : "null") + ',' + 5 + ',' + -85 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "If you are not, please change your password to something more obscure!";
        field_i = true;
        field_d = "Type your email address again to make sure it's correct";
    }
}
