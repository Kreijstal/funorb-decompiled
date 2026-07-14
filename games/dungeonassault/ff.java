/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff {
    private int[] field_b;
    static String[] field_f;
    private int field_c;
    private int field_d;
    private int field_e;
    private int[] field_g;
    private int field_a;

    final int a(int param0) {
        if (((ff) this).field_a == 0) {
            this.b(256);
            ((ff) this).field_a = 256;
        }
        if (param0 != 26979) {
            return -68;
        }
        ((ff) this).field_a = ((ff) this).field_a - 1;
        return ((ff) this).field_b[((ff) this).field_a - 1];
    }

    private final void b(byte param0) {
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
        L0: {
          var11 = DungeonAssault.field_K;
          var6 = -1640531527;
          var9 = -1640531527;
          var4 = -1640531527;
          var7 = -1640531527;
          var10 = -1640531527;
          var8 = -1640531527;
          var3 = -1640531527;
          if (param0 > 66) {
            break L0;
          } else {
            ff.c(89);
            break L0;
          }
        }
        var5 = -1640531527;
        var2 = 0;
        L1: while (true) {
          if (4 <= var2) {
            var2 = 0;
            L2: while (true) {
              if (-257 >= (var2 ^ -1)) {
                var2 = 0;
                L3: while (true) {
                  if (256 <= var2) {
                    this.b(256);
                    ((ff) this).field_a = 256;
                    return;
                  } else {
                    var6 = var6 + ((ff) this).field_g[var2 + 3];
                    var8 = var8 + ((ff) this).field_g[5 + var2];
                    var9 = var9 + ((ff) this).field_g[6 + var2];
                    var4 = var4 + ((ff) this).field_g[var2 + 1];
                    var3 = var3 + ((ff) this).field_g[var2];
                    var7 = var7 + ((ff) this).field_g[4 + var2];
                    var5 = var5 + ((ff) this).field_g[2 + var2];
                    var10 = var10 + ((ff) this).field_g[var2 - -7];
                    var3 = var3 ^ var4 << 1027563339;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> 532792418;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << -1159207288;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> -1700270672;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << 322925066;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> 2013924068;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << -534831384;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> 198279977;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    ((ff) this).field_g[var2] = var3;
                    ((ff) this).field_g[1 + var2] = var4;
                    ((ff) this).field_g[var2 - -2] = var5;
                    ((ff) this).field_g[3 + var2] = var6;
                    ((ff) this).field_g[4 + var2] = var7;
                    ((ff) this).field_g[5 + var2] = var8;
                    ((ff) this).field_g[var2 + 6] = var9;
                    ((ff) this).field_g[7 + var2] = var10;
                    var2 += 8;
                    continue L3;
                  }
                }
              } else {
                var10 = var10 + ((ff) this).field_b[var2 + 7];
                var6 = var6 + ((ff) this).field_b[3 + var2];
                var3 = var3 + ((ff) this).field_b[var2];
                var5 = var5 + ((ff) this).field_b[2 + var2];
                var8 = var8 + ((ff) this).field_b[5 + var2];
                var4 = var4 + ((ff) this).field_b[var2 + 1];
                var9 = var9 + ((ff) this).field_b[var2 - -6];
                var7 = var7 + ((ff) this).field_b[4 + var2];
                var3 = var3 ^ var4 << 1812542955;
                var6 = var6 + var3;
                var4 = var4 + var5;
                var4 = var4 ^ var5 >>> 1972984706;
                var7 = var7 + var4;
                var5 = var5 + var6;
                var5 = var5 ^ var6 << 1692357960;
                var6 = var6 + var7;
                var8 = var8 + var5;
                var6 = var6 ^ var7 >>> 679070256;
                var9 = var9 + var6;
                var7 = var7 + var8;
                var7 = var7 ^ var8 << 1494103082;
                var8 = var8 + var9;
                var10 = var10 + var7;
                var8 = var8 ^ var9 >>> -677505436;
                var9 = var9 + var10;
                var3 = var3 + var8;
                var9 = var9 ^ var10 << 1701963752;
                var10 = var10 + var3;
                var4 = var4 + var9;
                var10 = var10 ^ var3 >>> 821769609;
                var5 = var5 + var10;
                var3 = var3 + var4;
                ((ff) this).field_g[var2] = var3;
                ((ff) this).field_g[1 + var2] = var4;
                ((ff) this).field_g[var2 + 2] = var5;
                ((ff) this).field_g[var2 + 3] = var6;
                ((ff) this).field_g[4 + var2] = var7;
                ((ff) this).field_g[5 + var2] = var8;
                ((ff) this).field_g[6 + var2] = var9;
                ((ff) this).field_g[var2 - -7] = var10;
                var2 += 8;
                continue L2;
              }
            }
          } else {
            var3 = var3 ^ var4 << 447717163;
            var6 = var6 + var3;
            var4 = var4 + var5;
            var4 = var4 ^ var5 >>> -2112630782;
            var5 = var5 + var6;
            var7 = var7 + var4;
            var5 = var5 ^ var6 << -231484536;
            var6 = var6 + var7;
            var8 = var8 + var5;
            var6 = var6 ^ var7 >>> 1446369584;
            var7 = var7 + var8;
            var9 = var9 + var6;
            var7 = var7 ^ var8 << -540527702;
            var10 = var10 + var7;
            var8 = var8 + var9;
            var8 = var8 ^ var9 >>> 1728692452;
            var3 = var3 + var8;
            var9 = var9 + var10;
            var9 = var9 ^ var10 << 707153768;
            var10 = var10 + var3;
            var4 = var4 + var9;
            var10 = var10 ^ var3 >>> -585731927;
            var5 = var5 + var10;
            var3 = var3 + var4;
            var2++;
            continue L1;
          }
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = DungeonAssault.field_K;
        ((ff) this).field_e = ((ff) this).field_e + 1;
        ((ff) this).field_c = ((ff) this).field_c + (((ff) this).field_e + 1);
        if (param0 == 256) {
          var2 = 0;
          L0: while (true) {
            if (256 <= var2) {
              return;
            } else {
              L1: {
                var3 = ((ff) this).field_g[var2];
                if (-1 != (var2 & 2 ^ -1)) {
                  if (0 != (var2 & 1)) {
                    ((ff) this).field_d = ((ff) this).field_d ^ ((ff) this).field_d >>> -1019605360;
                    break L1;
                  } else {
                    ((ff) this).field_d = ((ff) this).field_d ^ ((ff) this).field_d << 2000516162;
                    break L1;
                  }
                } else {
                  if ((var2 & 1) != 0) {
                    ((ff) this).field_d = ((ff) this).field_d ^ ((ff) this).field_d >>> -2142932122;
                    break L1;
                  } else {
                    ((ff) this).field_d = ((ff) this).field_d ^ ((ff) this).field_d << 2094736781;
                    break L1;
                  }
                }
              }
              ((ff) this).field_d = ((ff) this).field_d + ((ff) this).field_g[var2 + 128 & 255];
              var4 = ((ff) this).field_g[nb.a(var3 >> -2071862558, 255)] + (((ff) this).field_d - -((ff) this).field_c);
              ((ff) this).field_g[var2] = ((ff) this).field_g[nb.a(var3 >> -2071862558, 255)] + (((ff) this).field_d - -((ff) this).field_c);
              ((ff) this).field_c = ((ff) this).field_g[nb.a(255, var4 >> -2028406552 >> -147005246)] + var3;
              ((ff) this).field_b[var2] = ((ff) this).field_g[nb.a(255, var4 >> -2028406552 >> -147005246)] + var3;
              var2++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final static cn a(byte param0) {
        int var4_int = 0;
        int var5 = DungeonAssault.field_K;
        int var1 = jc.field_f[0] * jn.field_k[0];
        byte[] var2 = ub.field_q[0];
        int[] var3 = new int[var1];
        if (param0 < 1) {
            return null;
        }
        for (var4_int = 0; var4_int < var1; var4_int++) {
            var3[var4_int] = uo.field_b[nb.a(255, (int) var2[var4_int])];
        }
        cn var4 = new cn(ce.field_x, tb.field_i, hg.field_t[0], fe.field_g[0], jc.field_f[0], jn.field_k[0], var3);
        sb.a(500);
        return var4;
    }

    public static void c(int param0) {
        if (param0 >= -72) {
            return;
        }
        field_f = null;
    }

    ff(int[] param0) {
        int var2 = 0;
        ((ff) this).field_b = new int[256];
        ((ff) this).field_g = new int[256];
        for (var2 = 0; var2 < param0.length; var2++) {
            ((ff) this).field_b[var2] = param0[var2];
        }
        this.b((byte) 77);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{"<%0> of the Orb", "<%0> the Wise", "<%0> the Cunning", "<%0> the Potent", "<%0> the Mighty", "<%0>, Mistress of the Tower", "<%0> the Magnificent", "<%0> the Unbound"};
    }
}
