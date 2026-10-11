/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga {
    static RgbSprite[] field_k;
    private int[] field_e;
    private int[] field_c;
    static je field_i;
    private int field_f;
    static RgbSprite[] field_a;
    private int field_j;
    static kd field_g;
    private int field_b;
    static String field_d;
    private int field_h;

    private final void b(boolean param0) {
        int var2 = 0;
        int var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var9 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var10 = -1640531527;
        int var3 = -1640531527;
        int var6 = -1640531527;
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
          var7 = var7 + var8;
          var9 = var9 + var6;
          var7 = var7 ^ var8 << 10;
          var8 = var8 + var9;
          var10 = var10 + var7;
          var8 = var8 ^ var9 >>> 4;
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var10 = var10 + var3;
          var4 = var4 + var9;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
        }
        for (var2Lifetime1 = 0; 256 > var2Lifetime1; var2Lifetime1 += 8) {
          var3 = var3 + this.field_e[var2Lifetime1];
          var10 = var10 + this.field_e[7 + var2Lifetime1];
          var5 = var5 + this.field_e[2 + var2Lifetime1];
          var8 = var8 + this.field_e[var2Lifetime1 + 5];
          var7 = var7 + this.field_e[var2Lifetime1 + 4];
          var6 = var6 + this.field_e[3 + var2Lifetime1];
          var9 = var9 + this.field_e[6 + var2Lifetime1];
          var4 = var4 + this.field_e[var2Lifetime1 + 1];
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
          var7 = var7 + var8;
          var9 = var9 + var6;
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
          var3 = var3 + var4;
          var5 = var5 + var10;
          this.field_c[var2Lifetime1] = var3;
          this.field_c[var2Lifetime1 + 1] = var4;
          this.field_c[var2Lifetime1 + 2] = var5;
          this.field_c[var2Lifetime1 + 3] = var6;
          this.field_c[4 + var2Lifetime1] = var7;
          this.field_c[var2Lifetime1 + 5] = var8;
          this.field_c[6 + var2Lifetime1] = var9;
          this.field_c[var2Lifetime1 + 7] = var10;
        }
        for (var2Lifetime2 = 0; 256 > var2Lifetime2; var2Lifetime2 += 8) {
          var5 = var5 + this.field_c[var2Lifetime2 + 2];
          var7 = var7 + this.field_c[4 + var2Lifetime2];
          var3 = var3 + this.field_c[var2Lifetime2];
          var4 = var4 + this.field_c[var2Lifetime2 + 1];
          var6 = var6 + this.field_c[var2Lifetime2 + 3];
          var10 = var10 + this.field_c[var2Lifetime2 + 7];
          var8 = var8 + this.field_c[5 + var2Lifetime2];
          var9 = var9 + this.field_c[var2Lifetime2 + 6];
          var3 = var3 ^ var4 << 11;
          var4 = var4 + var5;
          var6 = var6 + var3;
          var4 = var4 ^ var5 >>> 2;
          var7 = var7 + var4;
          var5 = var5 + var6;
          var5 = var5 ^ var6 << 8;
          var8 = var8 + var5;
          var6 = var6 + var7;
          var6 = var6 ^ var7 >>> 16;
          var7 = var7 + var8;
          var9 = var9 + var6;
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
          var5 = var5 + var10;
          var3 = var3 + var4;
          this.field_c[var2Lifetime2] = var3;
          this.field_c[var2Lifetime2 + 1] = var4;
          this.field_c[var2Lifetime2 + 2] = var5;
          this.field_c[var2Lifetime2 + 3] = var6;
          this.field_c[var2Lifetime2 + 4] = var7;
          this.field_c[var2Lifetime2 + 5] = var8;
          this.field_c[6 + var2Lifetime2] = var9;
          this.field_c[var2Lifetime2 + 7] = var10;
        }
        this.a(param0);
        this.field_b = 256;
    }

    public static void b(int param0) {
        int var1 = -102 / ((param0 - 45) / 43);
        field_i = null;
        field_d = null;
        field_g = null;
        field_k = null;
        field_a = null;
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var3;
        int var4;
        int var5;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int fieldTemp$0 = this.field_h + 1;
        this.field_h = this.field_h + 1;
        this.field_j = this.field_j + fieldTemp$0;
        if (!param0) {
          return;
        }
        for (var2 = 0; var2 < 256; var2++) {
          var3 = this.field_c[var2];
          if ((var2 & 2) != 0) {
            if ((var2 & 1) == 0) {
              this.field_f = this.field_f ^ this.field_f << 2;
            } else {
              this.field_f = this.field_f ^ this.field_f >>> 16;
            }
          } else {
            if (0 != (1 & var2)) {
              this.field_f = this.field_f ^ this.field_f >>> 6;
            } else {
              this.field_f = this.field_f ^ this.field_f << 13;
            }
          }
          this.field_f = this.field_f + this.field_c[var2 + 128 & 255];
          dupTemp$1 = this.field_j + (this.field_c[rn.a(255, var3 >> 2)] + this.field_f);
          var4 = dupTemp$1;
          this.field_c[var2] = dupTemp$1;
          dupTemp$2 = this.field_c[rn.a(var4 >> 8, 1020) >> 2] + var3;
          this.field_j = dupTemp$2;
          this.field_e[var2] = dupTemp$2;
        }
        return;
    }

    final int a(int param0) {
        if (0 == this.field_b) {
          this.a(true);
          this.field_b = 256;
        }
        if (param0 != 256) {
          this.a(false);
        }
        int fieldTemp$0 = this.field_b - 1;
        this.field_b = this.field_b - 1;
        return this.field_e[fieldTemp$0];
    }

    ga(int[] param0) {
        int var2_int = 0;
        try {
          this.field_e = new int[256];
          this.field_c = new int[256];
          for (var2_int = 0; var2_int < param0.length; var2_int++) {
            this.field_e[var2_int] = param0[var2_int];
          }
          this.b(true);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "ga.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
