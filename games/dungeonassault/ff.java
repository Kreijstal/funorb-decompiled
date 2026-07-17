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
        int fieldTemp$0 = ((ff) this).field_a - 1;
        ((ff) this).field_a = ((ff) this).field_a - 1;
        return ((ff) this).field_b[fieldTemp$0];
    }

    private final void b() {
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
        var11 = DungeonAssault.field_K;
        var6 = -1640531527;
        var9 = -1640531527;
        var4 = -1640531527;
        var7 = -1640531527;
        var10 = -1640531527;
        var8 = -1640531527;
        var3 = -1640531527;
        var5 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if (4 <= var2) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 256) {
                var2 = 0;
                L2: while (true) {
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
                    var3 = var3 ^ var4 << 11;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> 2;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << 8;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> 16;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
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
                    ((ff) this).field_g[var2] = var3;
                    ((ff) this).field_g[1 + var2] = var4;
                    ((ff) this).field_g[var2 - -2] = var5;
                    ((ff) this).field_g[3 + var2] = var6;
                    ((ff) this).field_g[4 + var2] = var7;
                    ((ff) this).field_g[5 + var2] = var8;
                    ((ff) this).field_g[var2 + 6] = var9;
                    ((ff) this).field_g[7 + var2] = var10;
                    var2 += 8;
                    continue L2;
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
                var3 = var3 ^ var4 << 11;
                var6 = var6 + var3;
                var4 = var4 + var5;
                var4 = var4 ^ var5 >>> 2;
                var7 = var7 + var4;
                var5 = var5 + var6;
                var5 = var5 ^ var6 << 8;
                var6 = var6 + var7;
                var8 = var8 + var5;
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
                var10 = var10 + var3;
                var4 = var4 + var9;
                var10 = var10 ^ var3 >>> 9;
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
                continue L1;
              }
            }
          } else {
            var3 = var3 ^ var4 << 11;
            var6 = var6 + var3;
            var4 = var4 + var5;
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
            var10 = var10 + var7;
            var8 = var8 + var9;
            var8 = var8 ^ var9 >>> 4;
            var3 = var3 + var8;
            var9 = var9 + var10;
            var9 = var9 ^ var10 << 8;
            var10 = var10 + var3;
            var4 = var4 + var9;
            var10 = var10 ^ var3 >>> 9;
            var5 = var5 + var10;
            var3 = var3 + var4;
            var2++;
            continue L0;
          }
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = DungeonAssault.field_K;
        int fieldTemp$3 = ((ff) this).field_e + 1;
        ((ff) this).field_e = ((ff) this).field_e + 1;
        ((ff) this).field_c = ((ff) this).field_c + fieldTemp$3;
        var2 = 0;
        L0: while (true) {
          if (256 <= var2) {
            return;
          } else {
            L1: {
              var3 = ((ff) this).field_g[var2];
              if ((var2 & 2) != 0) {
                if (0 != (var2 & 1)) {
                  ((ff) this).field_d = ((ff) this).field_d ^ ((ff) this).field_d >>> 16;
                  break L1;
                } else {
                  ((ff) this).field_d = ((ff) this).field_d ^ ((ff) this).field_d << 2;
                  break L1;
                }
              } else {
                if ((var2 & 1) != 0) {
                  ((ff) this).field_d = ((ff) this).field_d ^ ((ff) this).field_d >>> 6;
                  break L1;
                } else {
                  ((ff) this).field_d = ((ff) this).field_d ^ ((ff) this).field_d << 13;
                  break L1;
                }
              }
            }
            ((ff) this).field_d = ((ff) this).field_d + ((ff) this).field_g[var2 + 128 & 255];
            int dupTemp$4 = ((ff) this).field_g[nb.a(var3 >> 2, 255)] + (((ff) this).field_d - -((ff) this).field_c);
            var4 = dupTemp$4;
            ((ff) this).field_g[var2] = dupTemp$4;
            int dupTemp$5 = ((ff) this).field_g[nb.a(255, var4 >> 8 >> 2)] + var3;
            ((ff) this).field_c = dupTemp$5;
            ((ff) this).field_b[var2] = dupTemp$5;
            var2++;
            continue L0;
          }
        }
    }

    final static cn a() {
        int var4_int = 0;
        int var5 = DungeonAssault.field_K;
        int var1 = jc.field_f[0] * jn.field_k[0];
        byte[] var2 = ub.field_q[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var4_int < var1; var4_int++) {
            var3[var4_int] = uo.field_b[nb.a(255, (int) var2[var4_int])];
        }
        cn var4 = new cn(ce.field_x, tb.field_i, hg.field_t[0], fe.field_g[0], jc.field_f[0], jn.field_k[0], var3);
        int discarded$0 = 500;
        sb.a();
        return var4;
    }

    public static void c() {
        field_f = null;
    }

    ff(int[] param0) {
        int var2_int = 0;
        try {
            ((ff) this).field_b = new int[256];
            ((ff) this).field_g = new int[256];
            for (var2_int = 0; var2_int < param0.length; var2_int++) {
                ((ff) this).field_b[var2_int] = param0[var2_int];
            }
            int discarded$0 = 77;
            this.b();
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "ff.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{"<%0> of the Orb", "<%0> the Wise", "<%0> the Cunning", "<%0> the Potent", "<%0> the Mighty", "<%0>, Mistress of the Tower", "<%0> the Magnificent", "<%0> the Unbound"};
    }
}
