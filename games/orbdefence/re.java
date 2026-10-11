/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re {
    private int field_e;
    private int field_d;
    private int field_h;
    private int[] field_a;
    static String field_g;
    private int[] field_b;
    static String field_f;
    private int field_c;

    private final void b(byte param0) {
        int var2 = 0;
        int var12 = OrbDefence.field_D ? 1 : 0;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var10 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        int var5 = -1640531527;
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
          var10 = var10 + var3;
          var4 = var4 + var9;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 256; var2Lifetime1 += 8) {
          var3 = var3 + this.field_b[var2Lifetime1];
          var7 = var7 + this.field_b[4 + var2Lifetime1];
          var9 = var9 + this.field_b[var2Lifetime1 + 6];
          var6 = var6 + this.field_b[3 + var2Lifetime1];
          var4 = var4 + this.field_b[var2Lifetime1 + 1];
          var10 = var10 + this.field_b[7 + var2Lifetime1];
          var5 = var5 + this.field_b[2 + var2Lifetime1];
          var8 = var8 + this.field_b[5 + var2Lifetime1];
          var3 = var3 ^ var4 << 11;
          var6 = var6 + var3;
          var4 = var4 + var5;
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
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
          this.field_a[var2Lifetime1] = var3;
          this.field_a[var2Lifetime1 + 1] = var4;
          this.field_a[var2Lifetime1 + 2] = var5;
          this.field_a[3 + var2Lifetime1] = var6;
          this.field_a[4 + var2Lifetime1] = var7;
          this.field_a[var2Lifetime1 + 5] = var8;
          this.field_a[6 + var2Lifetime1] = var9;
          this.field_a[7 + var2Lifetime1] = var10;
        }
        int var11 = -97 / ((param0 - 3) / 50);
        for (var2Lifetime2 = 0; var2Lifetime2 < 256; var2Lifetime2 += 8) {
          var3 = var3 + this.field_a[var2Lifetime2];
          var5 = var5 + this.field_a[2 + var2Lifetime2];
          var6 = var6 + this.field_a[var2Lifetime2 + 3];
          var10 = var10 + this.field_a[7 + var2Lifetime2];
          var9 = var9 + this.field_a[6 + var2Lifetime2];
          var8 = var8 + this.field_a[var2Lifetime2 + 5];
          var7 = var7 + this.field_a[4 + var2Lifetime2];
          var4 = var4 + this.field_a[1 + var2Lifetime2];
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
          var5 = var5 + var10;
          var3 = var3 + var4;
          this.field_a[var2Lifetime2] = var3;
          this.field_a[var2Lifetime2 + 1] = var4;
          this.field_a[var2Lifetime2 + 2] = var5;
          this.field_a[3 + var2Lifetime2] = var6;
          this.field_a[4 + var2Lifetime2] = var7;
          this.field_a[5 + var2Lifetime2] = var8;
          this.field_a[6 + var2Lifetime2] = var9;
          this.field_a[7 + var2Lifetime2] = var10;
        }
        this.a((byte) 122);
        this.field_c = 256;
    }

    public static void c(byte param0) {
        field_g = null;
        if (param0 > -62) {
          field_f = (String) null;
        }
        field_f = null;
    }

    final int a(int param0) {
        if (0 == this.field_c) {
          this.a((byte) 119);
          this.field_c = 256;
        }
        if (param0 != 128) {
          this.field_d = -48;
        }
        int fieldTemp$0 = this.field_c - 1;
        this.field_c = this.field_c - 1;
        return this.field_b[fieldTemp$0];
    }

    private final void a(byte param0) {
        int var2 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var3;
        int var4;
        int var5;
        var5 = OrbDefence.field_D ? 1 : 0;
        if (param0 < 118) {
          this.a(92);
        }
        int fieldTemp$0 = this.field_h + 1;
        this.field_h = this.field_h + 1;
        this.field_e = this.field_e + fieldTemp$0;
        for (var2 = 0; 256 > var2; var2++) {
          var3 = this.field_a[var2];
          if ((var2 & 2) != 0) {
            if ((var2 & 1) == 0) {
              this.field_d = this.field_d ^ this.field_d << 2;
            } else {
              this.field_d = this.field_d ^ this.field_d >>> 16;
            }
          } else {
            if ((1 & var2) != 0) {
              this.field_d = this.field_d ^ this.field_d >>> 6;
            } else {
              this.field_d = this.field_d ^ this.field_d << 13;
            }
          }
          this.field_d = this.field_d + this.field_a[128 + var2 & 255];
          dupTemp$1 = this.field_a[vi.a(var3 >> 2, 255)] + (this.field_d + this.field_e);
          var4 = dupTemp$1;
          this.field_a[var2] = dupTemp$1;
          dupTemp$2 = var3 + this.field_a[vi.a(var4 >> 8 >> 2, 255)];
          this.field_e = dupTemp$2;
          this.field_b[var2] = dupTemp$2;
        }
    }

    re(int[] param0) {
        int var2_int = 0;
        try {
          this.field_b = new int[256];
          this.field_a = new int[256];
          for (var2_int = 0; var2_int < param0.length; var2_int++) {
            this.field_b[var2_int] = param0[var2_int];
          }
          this.b((byte) 92);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "re.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "FLYBO";
        field_f = "ZOOMO";
    }
}
