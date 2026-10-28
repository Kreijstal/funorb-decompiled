/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IsaacRandom {
    static int[] field_f;
    private int field_a;
    private int field_e;
    private int[] field_i;
    private int[] field_c;
    private int field_b;
    static FullscreenFocusCanvas field_d;
    static ValidationState field_h;
    private int field_g;

    private final void initialize(boolean guard) {
        int var11 = EscapeVector.obfuscationControl;
        int var5 = -1640531527;
        int var7 = -1640531527;
        int var6 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var10 = -1640531527;
        for (int var2 = 0; var2 < 4; var2++) {
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
          var10 = var10 + var7;
          var8 = var8 + var9;
          var8 = var8 ^ var9 >>> 4;
          var9 = var9 + var10;
          var3 = var3 + var8;
          var9 = var9 ^ var10 << 8;
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
        }
        if (guard) {
          IsaacRandom.releaseStatics((byte) -116);
        }
        for (int var2Lifetime1 = 0; var2Lifetime1 < 256; var2Lifetime1 += 8) {
          var7 = var7 + this.field_c[var2Lifetime1 + 4];
          var3 = var3 + this.field_c[var2Lifetime1];
          var8 = var8 + this.field_c[5 + var2Lifetime1];
          var9 = var9 + this.field_c[6 + var2Lifetime1];
          var4 = var4 + this.field_c[1 + var2Lifetime1];
          var10 = var10 + this.field_c[var2Lifetime1 + 7];
          var5 = var5 + this.field_c[var2Lifetime1 + 2];
          var6 = var6 + this.field_c[3 + var2Lifetime1];
          var3 = var3 ^ var4 << 11;
          var4 = var4 + var5;
          var6 = var6 + var3;
          var4 = var4 ^ var5 >>> 2;
          var7 = var7 + var4;
          var5 = var5 + var6;
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
          var3 = var3 + var4;
          var5 = var5 + var10;
          this.field_i[var2Lifetime1] = var3;
          this.field_i[var2Lifetime1 + 1] = var4;
          this.field_i[2 + var2Lifetime1] = var5;
          this.field_i[3 + var2Lifetime1] = var6;
          this.field_i[var2Lifetime1 + 4] = var7;
          this.field_i[5 + var2Lifetime1] = var8;
          this.field_i[6 + var2Lifetime1] = var9;
          this.field_i[var2Lifetime1 + 7] = var10;
        }
        for (int var2Lifetime2 = 0; var2Lifetime2 < 256; var2Lifetime2 += 8) {
          var9 = var9 + this.field_i[6 + var2Lifetime2];
          var3 = var3 + this.field_i[var2Lifetime2];
          var6 = var6 + this.field_i[var2Lifetime2 + 3];
          var8 = var8 + this.field_i[var2Lifetime2 + 5];
          var4 = var4 + this.field_i[var2Lifetime2 + 1];
          var5 = var5 + this.field_i[2 + var2Lifetime2];
          var7 = var7 + this.field_i[var2Lifetime2 + 4];
          var10 = var10 + this.field_i[var2Lifetime2 + 7];
          var3 = var3 ^ var4 << 11;
          var4 = var4 + var5;
          var6 = var6 + var3;
          var4 = var4 ^ var5 >>> 2;
          var7 = var7 + var4;
          var5 = var5 + var6;
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
          var10 = var10 + var3;
          var4 = var4 + var9;
          var10 = var10 ^ var3 >>> 9;
          var5 = var5 + var10;
          var3 = var3 + var4;
          this.field_i[var2Lifetime2] = var3;
          this.field_i[var2Lifetime2 + 1] = var4;
          this.field_i[2 + var2Lifetime2] = var5;
          this.field_i[3 + var2Lifetime2] = var6;
          this.field_i[4 + var2Lifetime2] = var7;
          this.field_i[var2Lifetime2 + 5] = var8;
          this.field_i[6 + var2Lifetime2] = var9;
          this.field_i[var2Lifetime2 + 7] = var10;
        }
        this.generateBlock(-115);
        this.field_g = 256;
    }

    final int nextInt(int guard) {
        if (guard != 1736563940) {
          this.field_e = -4;
        }
        if (0 == this.field_g) {
          this.generateBlock(-118);
          this.field_g = 256;
        }
        int fieldTemp$0 = this.field_g - 1;
        this.field_g = this.field_g - 1;
        return this.field_c[fieldTemp$0];
    }

    private final void generateBlock(int guard) {
        int var5 = EscapeVector.obfuscationControl;
        int fieldTemp$0 = this.field_a + 1;
        this.field_a = this.field_a + 1;
        this.field_e = this.field_e + fieldTemp$0;
        if (guard > -96) {
          return;
        }
        for (int var2 = 0; var2 < 256; var2++) {
          int var3 = this.field_i[var2];
          if (0 != (var2 & 2)) {
            if ((1 & var2) != 0) {
              this.field_b = this.field_b ^ this.field_b >>> 16;
            } else {
              this.field_b = this.field_b ^ this.field_b << 2;
            }
          } else if ((var2 & 1) != 0) {
            this.field_b = this.field_b ^ this.field_b >>> 6;
          } else {
            this.field_b = this.field_b ^ this.field_b << 13;
          }
          this.field_b = this.field_b + this.field_i[255 & var2 + 128];
          int dupTemp$1 = this.field_b + (this.field_i[SpriteCheckboxPainter.bitwiseAnd(var3, 1020) >> 2] + this.field_e);
          int var4 = dupTemp$1;
          this.field_i[var2] = dupTemp$1;
          int dupTemp$2 = var3 + this.field_i[SpriteCheckboxPainter.bitwiseAnd(var4 >> 8, 1020) >> 2];
          this.field_e = dupTemp$2;
          this.field_c[var2] = dupTemp$2;
        }
        return;
    }

    public static void releaseStatics(byte guard) {
        field_f = null;
        field_d = null;
        if (guard != -88) {
          return;
        }
        field_h = null;
    }

    static boolean a(boolean param0, boolean param1) {
        return param0 | param1;
    }

    IsaacRandom(int[] param0) {
        try {
          this.field_i = new int[256];
          this.field_c = new int[256];
          for (int var2_int = 0; param0.length > var2_int; var2_int++) {
            this.field_c[var2_int] = param0[var2_int];
          }
          this.initialize(false);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "df.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = new int[8192];
        field_h = new ValidationState();
    }
}
