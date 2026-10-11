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
        if (this.field_a == 0) {
          this.b(256);
          this.field_a = 256;
        }
        if (param0 != 26979) {
          return -68;
        }
        int fieldTemp$0 = this.field_a - 1;
        this.field_a = this.field_a - 1;
        return this.field_b[fieldTemp$0];
    }

    private final void b(byte param0) {
        int var2 = 0;
        int var11 = DungeonAssault.field_K;
        int var6 = -1640531527;
        int var9 = -1640531527;
        int var4 = -1640531527;
        int var7 = -1640531527;
        int var10 = -1640531527;
        int var8 = -1640531527;
        int var3 = -1640531527;
        int var2Lifetime1;
        int var2Lifetime2;
        if (param0 <= 66) {
          ff.c(89);
        }
        int var5 = -1640531527;
        for (var2 = 0; 4 > var2; var2++) {
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
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 256; var2Lifetime1 += 8) {
          var10 = var10 + this.field_b[var2Lifetime1 + 7];
          var6 = var6 + this.field_b[3 + var2Lifetime1];
          var3 = var3 + this.field_b[var2Lifetime1];
          var5 = var5 + this.field_b[2 + var2Lifetime1];
          var8 = var8 + this.field_b[5 + var2Lifetime1];
          var4 = var4 + this.field_b[var2Lifetime1 + 1];
          var9 = var9 + this.field_b[var2Lifetime1 + 6];
          var7 = var7 + this.field_b[4 + var2Lifetime1];
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
          this.field_g[var2Lifetime1] = var3;
          this.field_g[1 + var2Lifetime1] = var4;
          this.field_g[var2Lifetime1 + 2] = var5;
          this.field_g[var2Lifetime1 + 3] = var6;
          this.field_g[4 + var2Lifetime1] = var7;
          this.field_g[5 + var2Lifetime1] = var8;
          this.field_g[6 + var2Lifetime1] = var9;
          this.field_g[var2Lifetime1 + 7] = var10;
        }
        for (var2Lifetime2 = 0; 256 > var2Lifetime2; var2Lifetime2 += 8) {
          var6 = var6 + this.field_g[var2Lifetime2 + 3];
          var8 = var8 + this.field_g[5 + var2Lifetime2];
          var9 = var9 + this.field_g[6 + var2Lifetime2];
          var4 = var4 + this.field_g[var2Lifetime2 + 1];
          var3 = var3 + this.field_g[var2Lifetime2];
          var7 = var7 + this.field_g[4 + var2Lifetime2];
          var5 = var5 + this.field_g[2 + var2Lifetime2];
          var10 = var10 + this.field_g[var2Lifetime2 + 7];
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
          this.field_g[var2Lifetime2] = var3;
          this.field_g[1 + var2Lifetime2] = var4;
          this.field_g[var2Lifetime2 + 2] = var5;
          this.field_g[3 + var2Lifetime2] = var6;
          this.field_g[4 + var2Lifetime2] = var7;
          this.field_g[5 + var2Lifetime2] = var8;
          this.field_g[var2Lifetime2 + 6] = var9;
          this.field_g[7 + var2Lifetime2] = var10;
        }
        this.b(256);
        this.field_a = 256;
    }

    private final void b(int param0) {
        int var2 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var3;
        int var4;
        int var5;
        var5 = DungeonAssault.field_K;
        int fieldTemp$0 = this.field_e + 1;
        this.field_e = this.field_e + 1;
        this.field_c = this.field_c + fieldTemp$0;
        if (param0 != 256) {
          return;
        }
        for (var2 = 0; 256 > var2; var2++) {
          var3 = this.field_g[var2];
          if ((var2 & 2) != 0) {
            if (0 != (var2 & 1)) {
              this.field_d = this.field_d ^ this.field_d >>> 16;
            } else {
              this.field_d = this.field_d ^ this.field_d << 2;
            }
          } else {
            if ((var2 & 1) != 0) {
              this.field_d = this.field_d ^ this.field_d >>> 6;
            } else {
              this.field_d = this.field_d ^ this.field_d << 13;
            }
          }
          this.field_d = this.field_d + this.field_g[var2 + 128 & 255];
          dupTemp$1 = this.field_g[nb.a(var3 >> 2, 255)] + (this.field_d + this.field_c);
          var4 = dupTemp$1;
          this.field_g[var2] = dupTemp$1;
          dupTemp$2 = this.field_g[nb.a(255, var4 >> 8 >> 2)] + var3;
          this.field_c = dupTemp$2;
          this.field_b[var2] = dupTemp$2;
        }
        return;
    }

    final static cn a(byte param0) {
        int var4_int = 0;
        int var5 = DungeonAssault.field_K;
        int var1 = jc.field_f[0] * jn.field_k[0];
        byte[] var2 = ub.field_q[0];
        int[] var3 = new int[var1];
        if (param0 < 1) {
          return (cn) null;
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
        int var2_int = 0;
        try {
          this.field_b = new int[256];
          this.field_g = new int[256];
          for (var2_int = 0; var2_int < param0.length; var2_int++) {
            this.field_b[var2_int] = param0[var2_int];
          }
          this.b((byte) 77);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "ff.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = new String[]{"<%0> of the Orb", "<%0> the Wise", "<%0> the Cunning", "<%0> the Potent", "<%0> the Mighty", "<%0>, Mistress of the Tower", "<%0> the Magnificent", "<%0> the Unbound"};
    }
}
