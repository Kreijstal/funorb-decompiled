/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    private int field_f;
    private int[] field_e;
    static String field_c;
    private int field_h;
    static String field_d;
    private int[] field_a;
    private int field_g;
    private int field_i;
    static dm field_b;

    private final void a(boolean param0) {
        int var2 = 0;
        int var11 = Geoblox.field_C;
        int var8 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var10 = -1640531527;
        if (!param0) {
            return;
        }
        int var4 = -1640531527;
        int var3 = -1640531527;
        int var7 = -1640531527;
        int var9 = -1640531527;
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
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << 10;
            var10 = var10 + var7;
            var8 = var8 + var9;
            var8 = var8 ^ var9 >>> 4;
            var3 = var3 + var8;
            var9 = var9 + var10;
            var9 = var9 ^ var10 << 8;
            var4 = var4 + var9;
            var10 = var10 + var3;
            var10 = var10 ^ var3 >>> 9;
            var3 = var3 + var4;
            var5 = var5 + var10;
        }
        for (var2 = 0; var2 < 256; var2 += 8) {
            var8 = var8 + this.field_e[var2 + 5];
            var6 = var6 + this.field_e[3 + var2];
            var10 = var10 + this.field_e[7 + var2];
            var3 = var3 + this.field_e[var2];
            var5 = var5 + this.field_e[2 + var2];
            var7 = var7 + this.field_e[4 + var2];
            var4 = var4 + this.field_e[1 + var2];
            var9 = var9 + this.field_e[var2 + 6];
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
            var5 = var5 + var10;
            var3 = var3 + var4;
            this.field_a[var2] = var3;
            this.field_a[1 + var2] = var4;
            this.field_a[2 + var2] = var5;
            this.field_a[3 + var2] = var6;
            this.field_a[var2 + 4] = var7;
            this.field_a[var2 + 5] = var8;
            this.field_a[6 + var2] = var9;
            this.field_a[7 + var2] = var10;
        }
        for (var2 = 0; 256 > var2; var2 += 8) {
            var9 = var9 + this.field_a[var2 + 6];
            var3 = var3 + this.field_a[var2];
            var10 = var10 + this.field_a[var2 + 7];
            var6 = var6 + this.field_a[3 + var2];
            var4 = var4 + this.field_a[1 + var2];
            var8 = var8 + this.field_a[5 + var2];
            var5 = var5 + this.field_a[var2 + 2];
            var7 = var7 + this.field_a[var2 + 4];
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
            var7 = var7 + var8;
            var9 = var9 + var6;
            var7 = var7 ^ var8 << 10;
            var10 = var10 + var7;
            var8 = var8 + var9;
            var8 = var8 ^ var9 >>> 4;
            var3 = var3 + var8;
            var9 = var9 + var10;
            var9 = var9 ^ var10 << 8;
            var4 = var4 + var9;
            var10 = var10 + var3;
            var10 = var10 ^ var3 >>> 9;
            var3 = var3 + var4;
            var5 = var5 + var10;
            this.field_a[var2] = var3;
            this.field_a[1 + var2] = var4;
            this.field_a[var2 + 2] = var5;
            this.field_a[3 + var2] = var6;
            this.field_a[4 + var2] = var7;
            this.field_a[5 + var2] = var8;
            this.field_a[6 + var2] = var9;
            this.field_a[7 + var2] = var10;
        }
        this.a(-108);
        this.field_i = 256;
    }

    final int b(int param0) {
        if (!(this.field_i != param0)) {
            this.a(-125);
            this.field_i = 256;
        }
        int fieldTemp$0 = this.field_i - 1;
        this.field_i = this.field_i - 1;
        return this.field_e[fieldTemp$0];
    }

    private final void a(int param0) {
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var2;
        int var3;
        int var4;
        int fieldTemp$0 = this.field_h + 1;
        this.field_h = this.field_h + 1;
        this.field_f = this.field_f + fieldTemp$0;
        var2 = 0;
        if (param0 >= -10) {
          ne.a((byte) 89);
        }
        L1: while (var2 < 256) {
          var3 = this.field_a[var2];
          if (0 == (2 & var2)) {
            if ((1 & var2) != 0) {
              this.field_g = this.field_g ^ this.field_g >>> 6;
            } else {
              this.field_g = this.field_g ^ this.field_g << 13;
            }
          } else {
            if ((var2 & 1) != 0) {
              this.field_g = this.field_g ^ this.field_g >>> 16;
            } else {
              this.field_g = this.field_g ^ this.field_g << 2;
            }
          }
          this.field_g = this.field_g + this.field_a[255 & 128 + var2];
          dupTemp$1 = this.field_f + (this.field_g + this.field_a[cd.a(255, var3 >> 2)]);
          var4 = dupTemp$1;
          this.field_a[var2] = dupTemp$1;
          dupTemp$2 = var3 + this.field_a[cd.a(var4 >> 8, 1020) >> 2];
          this.field_f = dupTemp$2;
          this.field_e[var2] = dupTemp$2;
          var2++;
        }
    }

    final static void a(byte param0) {
        int var1 = uf.field_h[-1 + uf.field_h.length];
        kk.field_x = (float)(-(255 & si.field_j) + (255 & var1));
        ka.field_c = (float)(-(si.field_j >> 8 & 255) + (var1 >> 8 & 255));
        lk.field_b = (float)(((var1 & 16735942) >> 16) - (si.field_j >> 16 & 255));
        int var2 = 80 % ((5 - param0) / 52);
        fi.a(0, ll.field_d);
    }

    public static void b(byte param0) {
        field_b = null;
        if (param0 > -92) {
            field_d = (String) null;
            field_c = null;
            field_d = null;
            return;
        }
        field_c = null;
        field_d = null;
    }

    ne(int[] param0) {
        int var2_int = 0;
        try {
            this.field_a = new int[256];
            this.field_e = new int[256];
            for (var2_int = 0; param0.length > var2_int; var2_int++) {
                this.field_e[var2_int] = param0[var2_int];
            }
            this.a(true);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ne.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "Visit the Account Management section on the main site to view.";
        field_c = "Discard results";
    }
}
