/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn {
    private int[] field_k;
    private int field_c;
    static cd field_h;
    static wc field_l;
    private int field_e;
    private int[] field_a;
    private int field_g;
    private int field_j;
    static qd field_b;
    static mn field_m;
    static String field_i;
    static int field_d;
    static String field_f;

    public static void a(byte param0) {
        field_m = null;
        field_h = null;
        field_b = null;
        int var1 = 91 % ((param0 - 6) / 54);
        field_l = null;
        field_i = null;
        field_f = null;
    }

    private final void a(int param0) {
        int var2 = 0;
        int var11 = Torquing.field_u;
        int var3 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var10 = -1640531527;
        int var8 = -1640531527;
        int var7 = -1640531527;
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
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 256; var2Lifetime1 += 8) {
          var3 = var3 + this.field_k[var2Lifetime1];
          var8 = var8 + this.field_k[var2Lifetime1 + 5];
          var9 = var9 + this.field_k[var2Lifetime1 + 6];
          var7 = var7 + this.field_k[var2Lifetime1 + 4];
          var5 = var5 + this.field_k[2 + var2Lifetime1];
          var10 = var10 + this.field_k[var2Lifetime1 + 7];
          var6 = var6 + this.field_k[3 + var2Lifetime1];
          var4 = var4 + this.field_k[1 + var2Lifetime1];
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
          var9 = var9 + var10;
          var3 = var3 + var8;
          var9 = var9 ^ var10 << 8;
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
          this.field_a[var2Lifetime1] = var3;
          this.field_a[var2Lifetime1 + 1] = var4;
          this.field_a[var2Lifetime1 + 2] = var5;
          this.field_a[3 + var2Lifetime1] = var6;
          this.field_a[var2Lifetime1 + 4] = var7;
          this.field_a[5 + var2Lifetime1] = var8;
          this.field_a[var2Lifetime1 + 6] = var9;
          this.field_a[7 + var2Lifetime1] = var10;
        }
        for (var2Lifetime2 = param0; 256 > var2Lifetime2; var2Lifetime2 += 8) {
          var4 = var4 + this.field_a[1 + var2Lifetime2];
          var6 = var6 + this.field_a[3 + var2Lifetime2];
          var8 = var8 + this.field_a[var2Lifetime2 + 5];
          var9 = var9 + this.field_a[6 + var2Lifetime2];
          var3 = var3 + this.field_a[var2Lifetime2];
          var10 = var10 + this.field_a[var2Lifetime2 + 7];
          var5 = var5 + this.field_a[var2Lifetime2 + 2];
          var7 = var7 + this.field_a[4 + var2Lifetime2];
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
          var5 = var5 + var10;
          var3 = var3 + var4;
          this.field_a[var2Lifetime2] = var3;
          this.field_a[var2Lifetime2 + 1] = var4;
          this.field_a[2 + var2Lifetime2] = var5;
          this.field_a[var2Lifetime2 + 3] = var6;
          this.field_a[var2Lifetime2 + 4] = var7;
          this.field_a[var2Lifetime2 + 5] = var8;
          this.field_a[6 + var2Lifetime2] = var9;
          this.field_a[var2Lifetime2 + 7] = var10;
        }
        this.a(false);
        this.field_c = 256;
    }

    private final void a(boolean param0) {
        int fieldTemp$0 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int fieldTemp$3 = 0;
        int dupTemp$4 = 0;
        int dupTemp$5 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = Torquing.field_u;
        if (!param0) {
          fieldTemp$0 = this.field_e + 1;
          this.field_e = this.field_e + 1;
          this.field_j = this.field_j + fieldTemp$0;
          for (var2 = 0; 256 > var2; var2++) {
            var3 = this.field_a[var2];
            if (0 == (var2 & 2)) {
              if ((1 & var2) != 0) {
                this.field_g = this.field_g ^ this.field_g >>> 6;
              } else {
                this.field_g = this.field_g ^ this.field_g << 13;
              }
            } else {
              if ((1 & var2) == 0) {
                this.field_g = this.field_g ^ this.field_g << 2;
              } else {
                this.field_g = this.field_g ^ this.field_g >>> 16;
              }
            }
            this.field_g = this.field_g + this.field_a[var2 + 128 & 255];
            dupTemp$1 = this.field_j + this.field_a[ie.a(var3 >> 2, 255)] + this.field_g;
            var4 = dupTemp$1;
            this.field_a[var2] = dupTemp$1;
            dupTemp$2 = this.field_a[ie.a(var4 >> 8 >> 2, 255)] + var3;
            this.field_j = dupTemp$2;
            this.field_k[var2] = dupTemp$2;
          }
          return;
        }
        this.a(104);
        fieldTemp$3 = this.field_e + 1;
        this.field_e = this.field_e + 1;
        this.field_j = this.field_j + fieldTemp$3;
        for (var2Lifetime1 = 0; 256 > var2Lifetime1; var2Lifetime1++) {
          var3Lifetime1 = this.field_a[var2Lifetime1];
          if (0 == (var2Lifetime1 & 2)) {
            if ((1 & var2Lifetime1) != 0) {
              this.field_g = this.field_g ^ this.field_g >>> 6;
            } else {
              this.field_g = this.field_g ^ this.field_g << 13;
            }
          } else {
            if ((1 & var2Lifetime1) == 0) {
              this.field_g = this.field_g ^ this.field_g << 2;
            } else {
              this.field_g = this.field_g ^ this.field_g >>> 16;
            }
          }
          this.field_g = this.field_g + this.field_a[var2Lifetime1 + 128 & 255];
          dupTemp$4 = this.field_j + this.field_a[ie.a(var3Lifetime1 >> 2, 255)] + this.field_g;
          var4Lifetime1 = dupTemp$4;
          this.field_a[var2Lifetime1] = dupTemp$4;
          dupTemp$5 = this.field_a[ie.a(var4Lifetime1 >> 8 >> 2, 255)] + var3Lifetime1;
          this.field_j = dupTemp$5;
          this.field_k[var2Lifetime1] = dupTemp$5;
        }
        return;
    }

    final int b(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        if (param0 != -103) {
          this.field_k = (int[]) null;
          if (this.field_c == 0) {
            this.a(false);
            this.field_c = 256;
            fieldTemp$0 = this.field_c - 1;
            this.field_c = this.field_c - 1;
            return this.field_k[fieldTemp$0];
          }
          fieldTemp$1 = this.field_c - 1;
          this.field_c = this.field_c - 1;
          return this.field_k[fieldTemp$1];
        }
        if (this.field_c != 0) {
          fieldTemp$2 = this.field_c - 1;
          this.field_c = this.field_c - 1;
          return this.field_k[fieldTemp$2];
        }
        this.a(false);
        this.field_c = 256;
        int fieldTemp$3 = this.field_c - 1;
        this.field_c = this.field_c - 1;
        return this.field_k[fieldTemp$3];
    }

    gn(int[] param0) {
        int var2_int = 0;
        try {
          this.field_k = new int[256];
          this.field_a = new int[256];
          for (var2_int = 0; param0.length > var2_int; var2_int++) {
            this.field_k[var2_int] = param0[var2_int];
          }
          this.a(0);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "gn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = null;
        field_h = new cd();
        field_b = new qd();
        field_i = "If you are a member, log in to start at any level you've reached.";
        field_d = 0;
        field_f = "to keep fullscreen or";
    }
}
