/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class maa {
    private static byte[] field_b;
    private uia field_d;
    private int[] field_c;
    private long field_i;
    private int[] field_f;
    private int[] field_h;
    int field_e;
    private int field_g;
    int[] field_a;

    final boolean d() {
        int var2 = 0;
        int var1 = this.field_c.length;
        for (var2 = 0; var2 < var1; var2++) {
          if (this.field_c[var2] >= 0) {
            return false;
          }
        }
        return true;
    }

    final int b(int param0) {
        int var2 = this.a(param0);
        return var2;
    }

    final void e() {
        this.field_d.field_h = -1;
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        int var3Lifetime1;
        this.field_d.field_g = param0;
        this.field_d.field_h = 10;
        int var2 = this.field_d.d(126);
        this.field_e = this.field_d.d(124);
        this.field_g = 500000;
        this.field_h = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
          var4 = this.field_d.e(-67);
          var5 = this.field_d.e(109);
          if (var4 == 1297379947) {
            this.field_h[var3] = this.field_d.field_h;
            var3++;
          }
          this.field_d.field_h = this.field_d.field_h + var5;
        }
        this.field_i = 0L;
        this.field_c = new int[var2];
        int var6 = 0;
        var3Lifetime1 = var6;
        while (var6 < var2) {
          this.field_c[var6] = this.field_h[var6];
          var6++;
        }
        this.field_a = new int[var2];
        this.field_f = new int[var2];
    }

    final int c() {
        return this.field_c.length;
    }

    final void c(int param0) {
        int var2 = this.field_d.b((byte) 13);
        this.field_a[param0] = this.field_a[param0] + var2;
    }

    private final int a(int param0) {
        int var2;
        int var3;
        int var4;
        var2 = this.field_d.field_g[this.field_d.field_h];
        if (var2 >= 0) {
          var2 = this.field_f[param0];
        } else {
          var2 = var2 & 255;
          this.field_f[param0] = var2;
          this.field_d.field_h = this.field_d.field_h + 1;
        }
        if (var2 != 240 &&
          var2 != 247) {
          return this.a(param0, var2);
        }
        var3 = this.field_d.b((byte) -125);
        if (var2 == 247 &&
          var3 > 0) {
          var4 = this.field_d.field_g[this.field_d.field_h] & 255;
          if (!(var4 < 241) &&
            !(var4 > 243) || (var4 == 246 ||
            var4 == 248) || !(var4 < 250) &&
            !(var4 > 252) || var4 == 254) {
            this.field_d.field_h = this.field_d.field_h + 1;
            this.field_f[param0] = var4;
            return this.a(param0, var4);
          }
        }
        this.field_d.field_h = this.field_d.field_h + var3;
        return 0;
    }

    private final int a(int param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        int var3 = 0;
        int var4 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        if (param1 == 255) {
          var3 = this.field_d.h(255);
          var4 = this.field_d.b((byte) -127);
          if (var3 == 47) {
            this.field_d.field_h = this.field_d.field_h + var4;
            return 1;
          }
          if (var3 == 81) {
            var5 = this.field_d.a(-32768);
            var4 -= 3;
            var6 = this.field_a[param0];
            this.field_i = this.field_i + (long)var6 * (long)(this.field_g - var5);
            this.field_g = var5;
            this.field_d.field_h = this.field_d.field_h + var4;
            return 2;
          }
          this.field_d.field_h = this.field_d.field_h + var4;
          return 3;
        }
        var3Lifetime1 = field_b[param1 - 128];
        var4Lifetime1 = param1;
        if (var3Lifetime1 >= 1) {
          var4Lifetime1 = var4Lifetime1 | this.field_d.h(255) << 8;
        }
        if (var3Lifetime1 >= 2) {
          var4Lifetime1 = var4Lifetime1 | this.field_d.h(255) << 16;
        }
        return var4Lifetime1;
    }

    final long d(int param0) {
        return this.field_i + (long)param0 * (long)this.field_g;
    }

    final void a() {
        this.field_d.field_g = null;
        this.field_h = null;
        this.field_c = null;
        this.field_a = null;
        this.field_f = null;
    }

    final int f() {
        int var4 = 0;
        int var1;
        int var2;
        int var3;
        var1 = this.field_c.length;
        var2 = -1;
        var3 = 2147483647;
        for (var4 = 0; var4 < var1; var4++) {
          if (this.field_c[var4] >= 0 &&
            this.field_a[var4] < var3) {
            var2 = var4;
            var3 = this.field_a[var4];
          }
        }
        return var2;
    }

    final boolean g() {
        return this.field_d.field_g != null;
    }

    final void e(int param0) {
        this.field_d.field_h = this.field_c[param0];
    }

    final void f(int param0) {
        this.field_c[param0] = this.field_d.field_h;
    }

    public static void b() {
        field_b = null;
    }

    maa() {
        this.field_d = new uia((byte[]) null);
    }

    final void a(long param0) {
        int var4 = 0;
        this.field_i = param0;
        int var3 = this.field_c.length;
        for (var4 = 0; var4 < var3; var4++) {
          this.field_a[var4] = 0;
          this.field_f[var4] = 0;
          this.field_d.field_h = this.field_h[var4];
          this.c(var4);
          this.field_c[var4] = this.field_d.field_h;
        }
    }

    maa(byte[] param0) {
        this.field_d = new uia((byte[]) null);
        this.a(param0);
    }

    static {
        field_b = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
