/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uo {
    private int field_e;
    private int[] field_i;
    private int field_c;
    private int field_b;
    static int field_j;
    static boolean field_d;
    static int field_h;
    private int[] field_f;
    static String field_a;
    private int field_g;

    public static void c(int param0) {
        if (param0 != -1640531527) {
          uo.c(-56);
        }
        field_a = null;
    }

    final static void a(boolean param0, int param1, boolean param2) {
        if (param0) {
          bi.a(0, 0, bi.field_f, bi.field_a, 0, 192);
        } else {
          bi.d();
        }
        if (param1 != -28518) {
          uo.a(true, 65, false);
        }
        rc.a(param0, (byte) -120);
    }

    final int a(int param0) {
        if (this.field_e == 0) {
          this.a(true);
          this.field_e = 256;
        }
        if (param0 < 13) {
          this.a(32);
        }
        int fieldTemp$0 = this.field_e - 1;
        this.field_e = this.field_e - 1;
        return this.field_i[fieldTemp$0];
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var3;
        int var4;
        int var5;
        var5 = ZombieDawn.field_J;
        if (!param0) {
          this.a(-79);
        }
        int fieldTemp$0 = this.field_g + 1;
        this.field_g = this.field_g + 1;
        this.field_b = this.field_b + fieldTemp$0;
        for (var2 = 0; var2 < 256; var2++) {
          var3 = this.field_f[var2];
          if ((var2 & 2) == 0) {
            if ((1 & var2) == 0) {
              this.field_c = this.field_c ^ this.field_c << 13;
            } else {
              this.field_c = this.field_c ^ this.field_c >>> 6;
            }
          } else {
            if ((1 & var2) != 0) {
              this.field_c = this.field_c ^ this.field_c >>> 16;
            } else {
              this.field_c = this.field_c ^ this.field_c << 2;
            }
          }
          this.field_c = this.field_c + this.field_f[var2 + 128 & 255];
          dupTemp$1 = this.field_f[eg.a(var3 >> 2, 255)] + this.field_c + this.field_b;
          var4 = dupTemp$1;
          this.field_f[var2] = dupTemp$1;
          dupTemp$2 = this.field_f[eg.a(1020, var4 >> 8) >> 2] + var3;
          this.field_b = dupTemp$2;
          this.field_i[var2] = dupTemp$2;
        }
    }

    uo(int[] param0) {
        int var2_int = 0;
        try {
          this.field_i = new int[256];
          this.field_f = new int[256];
          for (var2_int = 0; param0.length > var2_int; var2_int++) {
            this.field_i[var2_int] = param0[var2_int];
          }
          this.b(20196);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "uo.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var11 = ZombieDawn.field_J;
        int var10 = -1640531527;
        int var3 = -1640531527;
        int var7 = -1640531527;
        int var4 = -1640531527;
        int var8 = -1640531527;
        int var5 = -1640531527;
        int var9 = -1640531527;
        int var6 = -1640531527;
        int var2Lifetime1;
        int var2Lifetime2;
        for (var2 = 0; var2 < 4; var2++) {
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
        for (var2Lifetime1 = 0; 256 > var2Lifetime1; var2Lifetime1 += 8) {
          var5 = var5 + this.field_i[2 + var2Lifetime1];
          var9 = var9 + this.field_i[6 + var2Lifetime1];
          var7 = var7 + this.field_i[4 + var2Lifetime1];
          var6 = var6 + this.field_i[3 + var2Lifetime1];
          var10 = var10 + this.field_i[7 + var2Lifetime1];
          var8 = var8 + this.field_i[var2Lifetime1 + 5];
          var3 = var3 + this.field_i[var2Lifetime1];
          var4 = var4 + this.field_i[1 + var2Lifetime1];
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
          this.field_f[var2Lifetime1] = var3;
          this.field_f[1 + var2Lifetime1] = var4;
          this.field_f[var2Lifetime1 + 2] = var5;
          this.field_f[var2Lifetime1 + 3] = var6;
          this.field_f[4 + var2Lifetime1] = var7;
          this.field_f[5 + var2Lifetime1] = var8;
          this.field_f[var2Lifetime1 + 6] = var9;
          this.field_f[var2Lifetime1 + 7] = var10;
        }
        for (var2Lifetime2 = 0; var2Lifetime2 < 256; var2Lifetime2 += 8) {
          var9 = var9 + this.field_f[6 + var2Lifetime2];
          var5 = var5 + this.field_f[2 + var2Lifetime2];
          var7 = var7 + this.field_f[var2Lifetime2 + 4];
          var8 = var8 + this.field_f[var2Lifetime2 + 5];
          var4 = var4 + this.field_f[var2Lifetime2 + 1];
          var10 = var10 + this.field_f[7 + var2Lifetime2];
          var6 = var6 + this.field_f[3 + var2Lifetime2];
          var3 = var3 + this.field_f[var2Lifetime2];
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
          this.field_f[var2Lifetime2] = var3;
          this.field_f[1 + var2Lifetime2] = var4;
          this.field_f[var2Lifetime2 + 2] = var5;
          this.field_f[var2Lifetime2 + 3] = var6;
          this.field_f[4 + var2Lifetime2] = var7;
          this.field_f[var2Lifetime2 + 5] = var8;
          this.field_f[6 + var2Lifetime2] = var9;
          this.field_f[7 + var2Lifetime2] = var10;
        }
        this.a(true);
        if (param0 != 20196) {
          uo.c(121);
        }
        this.field_e = 256;
    }

    static {
        field_a = "This password is part of your Player Name, and would be easy to guess";
        field_h = 60;
        field_j = 10;
    }
}
