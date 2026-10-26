/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    private int field_a;
    private int field_d;
    private int[] field_b;
    private int field_c;
    private int[] field_e;
    private int field_f;

    private final void a(int param0) {
        int var11 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (param0 > -101) {
          return;
        }
        int var9 = -1640531527;
        int var6 = -1640531527;
        int var10 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var7 = -1640531527;
        int var5 = -1640531527;
        int var8 = -1640531527;
        for (int var2 = 0; var2 < 4; var2++) {
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
          var5 = var5 + var10;
          var3 = var3 + var4;
        }
        for (int var2Lifetime1 = 0; var2Lifetime1 < 256; var2Lifetime1 += 8) {
          var7 = var7 + this.field_b[var2Lifetime1 + 4];
          var10 = var10 + this.field_b[7 + var2Lifetime1];
          var3 = var3 + this.field_b[var2Lifetime1];
          var4 = var4 + this.field_b[var2Lifetime1 + 1];
          var5 = var5 + this.field_b[2 + var2Lifetime1];
          var9 = var9 + this.field_b[var2Lifetime1 + 6];
          var8 = var8 + this.field_b[5 + var2Lifetime1];
          var6 = var6 + this.field_b[var2Lifetime1 + 3];
          var3 = var3 ^ var4 << 11;
          var6 = var6 + var3;
          var4 = var4 + var5;
          var4 = var4 ^ var5 >>> 2;
          var7 = var7 + var4;
          var5 = var5 + var6;
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
          var5 = var5 + var10;
          var3 = var3 + var4;
          this.field_e[var2Lifetime1] = var3;
          this.field_e[var2Lifetime1 + 1] = var4;
          this.field_e[2 + var2Lifetime1] = var5;
          this.field_e[var2Lifetime1 + 3] = var6;
          this.field_e[4 + var2Lifetime1] = var7;
          this.field_e[var2Lifetime1 + 5] = var8;
          this.field_e[var2Lifetime1 + 6] = var9;
          this.field_e[var2Lifetime1 + 7] = var10;
        }
        for (int var2Lifetime2 = 0; var2Lifetime2 < 256; var2Lifetime2 += 8) {
          var10 = var10 + this.field_e[var2Lifetime2 + 7];
          var7 = var7 + this.field_e[var2Lifetime2 + 4];
          var4 = var4 + this.field_e[var2Lifetime2 + 1];
          var3 = var3 + this.field_e[var2Lifetime2];
          var6 = var6 + this.field_e[var2Lifetime2 + 3];
          var5 = var5 + this.field_e[2 + var2Lifetime2];
          var9 = var9 + this.field_e[var2Lifetime2 + 6];
          var8 = var8 + this.field_e[var2Lifetime2 + 5];
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
          var10 = var10 + var3;
          var4 = var4 + var9;
          var10 = var10 ^ var3 >>> 9;
          var5 = var5 + var10;
          var3 = var3 + var4;
          this.field_e[var2Lifetime2] = var3;
          this.field_e[var2Lifetime2 + 1] = var4;
          this.field_e[2 + var2Lifetime2] = var5;
          this.field_e[3 + var2Lifetime2] = var6;
          this.field_e[var2Lifetime2 + 4] = var7;
          this.field_e[5 + var2Lifetime2] = var8;
          this.field_e[6 + var2Lifetime2] = var9;
          this.field_e[var2Lifetime2 + 7] = var10;
        }
        this.c(1);
        this.field_a = 256;
    }

    final int b(int param0) {
        if (param0 != 256) {
          return -43;
        }
        if (this.field_a == 0) {
          this.c(param0 ^ 257);
          this.field_a = 256;
        }
        int fieldTemp$0 = this.field_a - 1;
        this.field_a = this.field_a - 1;
        return this.field_b[fieldTemp$0];
    }

    private final void c(int param0) {
        int var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (param0 != 1) {
          this.field_e = (int[]) null;
        }
        int fieldTemp$0 = this.field_f + 1;
        this.field_f = this.field_f + 1;
        this.field_d = this.field_d + fieldTemp$0;
        for (int var2 = 0; 256 > var2; var2++) {
          int var3 = this.field_e[var2];
          if (0 == (2 & var2)) {
            if ((1 & var2) != 0) {
              this.field_c = this.field_c ^ this.field_c >>> 6;
            } else {
              this.field_c = this.field_c ^ this.field_c << 13;
            }
          } else if ((1 & var2) == 0) {
            this.field_c = this.field_c ^ this.field_c << 2;
          } else {
            this.field_c = this.field_c ^ this.field_c >>> 16;
          }
          this.field_c = this.field_c + this.field_e[255 & var2 + 128];
          int dupTemp$1 = this.field_c + (this.field_e[pg.a(1020, var3) >> 2] + this.field_d);
          int var4 = dupTemp$1;
          this.field_e[var2] = dupTemp$1;
          int dupTemp$2 = var3 + this.field_e[pg.a(261124, var4) >> 8 >> 2];
          this.field_d = dupTemp$2;
          this.field_b[var2] = dupTemp$2;
        }
    }

    fc(int[] param0) {
        try {
          this.field_b = new int[256];
          this.field_e = new int[256];
          for (int var2_int = 0; param0.length > var2_int; var2_int++) {
            this.field_b[var2_int] = param0[var2_int];
          }
          this.a(-104);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "fc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
