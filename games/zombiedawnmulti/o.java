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
        int var1 = 0;
        int var2 = ZombieDawnMulti.field_E ? 1 : 0;
        kj.field_r.b(-102);
        for (var1 = 0; -33 < var1; var1++) {
            dc.field_Ib[var1] = 0L;
        }
        if (param0 != 26673) {
            o.b(-5);
        }
        for (var1 = 0; -33 > var1; var1++) {
            pj.field_K[var1] = 0L;
        }
        ic.field_a = 0;
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        ((o) this).field_f = ((o) this).field_f + 1;
        ((o) this).field_e = ((o) this).field_e + (((o) this).field_f + 1);
        var2 = 0;
        if (param0 == 2) {
          L0: while (true) {
            if (-257 >= (var2 ^ -1)) {
              return;
            } else {
              L1: {
                var3 = ((o) this).field_c[var2];
                if ((2 & var2) != 0) {
                  if (-1 == (var2 & 1 ^ -1)) {
                    ((o) this).field_a = ((o) this).field_a ^ ((o) this).field_a << 1147010754;
                    break L1;
                  } else {
                    ((o) this).field_a = ((o) this).field_a ^ ((o) this).field_a >>> -465059280;
                    break L1;
                  }
                } else {
                  if ((1 & var2) == 0) {
                    ((o) this).field_a = ((o) this).field_a ^ ((o) this).field_a << 30377645;
                    break L1;
                  } else {
                    ((o) this).field_a = ((o) this).field_a ^ ((o) this).field_a >>> 143456070;
                    break L1;
                  }
                }
              }
              ((o) this).field_a = ((o) this).field_a + ((o) this).field_c[255 & var2 + 128];
              var4 = ((o) this).field_c[tq.b(var3 >> 2130026562, 255)] - (-((o) this).field_a + -((o) this).field_e);
              ((o) this).field_c[var2] = ((o) this).field_c[tq.b(var3 >> 2130026562, 255)] - (-((o) this).field_a + -((o) this).field_e);
              ((o) this).field_e = var3 + ((o) this).field_c[tq.b(var4 >> 2054902344, 1020) >> -2036713214];
              ((o) this).field_g[var2] = var3 + ((o) this).field_c[tq.b(var4 >> 2054902344, 1020) >> -2036713214];
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
        if (((o) this).field_k == 0) {
            this.c(2);
            ((o) this).field_k = 256;
        }
        ((o) this).field_k = ((o) this).field_k - 1;
        return ((o) this).field_g[((o) this).field_k - 1];
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
              if (-257 >= (var2 ^ -1)) {
                var2 = 0;
                L2: while (true) {
                  if (var2 >= 256) {
                    L3: {
                      if (!param0) {
                        break L3;
                      } else {
                        this.c(104);
                        break L3;
                      }
                    }
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
            var2++;
            continue L0;
          }
        }
    }

    o(int[] param0) {
        int var2 = 0;
        ((o) this).field_c = new int[256];
        ((o) this).field_g = new int[256];
        for (var2 = 0; var2 < param0.length; var2++) {
            ((o) this).field_g[var2] = param0[var2];
        }
        this.a(false);
    }

    final static void a(u param0, int param1, int param2) {
        ga var3 = ma.field_a;
        var3.b((byte) -35, param1);
        var3.a(-54, 2);
        if (param2 >= -69) {
            return;
        }
        var3.a(125, 0);
        var3.a(-55, param0.field_g);
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
