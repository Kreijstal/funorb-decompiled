/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh {
    private static byte[] field_i;
    private vi field_h;
    private int[] field_c;
    int field_f;
    private long field_e;
    private int[] field_g;
    private int field_b;
    int[] field_a;
    private int[] field_d;

    final int c(int param0) {
        int var2 = this.f(param0);
        return var2;
    }

    final void a(long param0) {
        int var4 = 0;
        this.field_e = param0;
        int var3 = this.field_d.length;
        for (var4 = 0; var4 < var3; var4++) {
          this.field_a[var4] = 0;
          this.field_c[var4] = 0;
          this.field_h.field_i = this.field_g[var4];
          this.d(var4);
          this.field_d[var4] = this.field_h.field_i;
        }
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        int var3Lifetime1;
        this.field_h.field_n = param0;
        this.field_h.field_i = 10;
        int var2 = this.field_h.e(8);
        this.field_f = this.field_h.e(8);
        this.field_b = 500000;
        this.field_g = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
          var4 = this.field_h.d(8195);
          var5 = this.field_h.d(8195);
          if (var4 == 1297379947) {
            this.field_g[var3] = this.field_h.field_i;
            var3++;
          }
          this.field_h.field_i = this.field_h.field_i + var5;
        }
        this.field_e = 0L;
        this.field_d = new int[var2];
        int var6 = 0;
        var3Lifetime1 = var6;
        while (var6 < var2) {
          this.field_d[var6] = this.field_g[var6];
          var6++;
        }
        this.field_a = new int[var2];
        this.field_c = new int[var2];
    }

    final void a() {
        this.field_h.field_i = -1;
    }

    final void d(int param0) {
        int var2 = this.field_h.m(127);
        this.field_a[param0] = this.field_a[param0] + var2;
    }

    final int g() {
        return this.field_d.length;
    }

    final boolean e() {
        int var2 = 0;
        int var1 = this.field_d.length;
        for (var2 = 0; var2 < var1; var2++) {
          if (this.field_d[var2] >= 0) {
            return false;
          }
        }
        return true;
    }

    final int d() {
        int var4 = 0;
        int var1;
        int var2;
        int var3;
        var1 = this.field_d.length;
        var2 = -1;
        var3 = 2147483647;
        for (var4 = 0; var4 < var1; var4++) {
          if (this.field_d[var4] >= 0 &&
            this.field_a[var4] < var3) {
            var2 = var4;
            var3 = this.field_a[var4];
          }
        }
        return var2;
    }

    final long b(int param0) {
        return this.field_e + (long)param0 * (long)this.field_b;
    }

    final void e(int param0) {
        this.field_h.field_i = this.field_d[param0];
    }

    final void b() {
        this.field_h.field_n = null;
        this.field_g = null;
        this.field_d = null;
        this.field_a = null;
        this.field_c = null;
    }

    final boolean c() {
        return this.field_h.field_n != null;
    }

    private final int f(int param0) {
        int var2;
        int var3;
        int var4;
        var2 = this.field_h.field_n[this.field_h.field_i];
        if (var2 >= 0) {
          var2 = this.field_c[param0];
        } else {
          var2 = var2 & 255;
          this.field_c[param0] = var2;
          this.field_h.field_i = this.field_h.field_i + 1;
        }
        if (var2 != 240 &&
          var2 != 247) {
          return this.a(param0, var2);
        }
        var3 = this.field_h.m(127);
        if (var2 == 247 &&
          var3 > 0) {
          var4 = this.field_h.field_n[this.field_h.field_i] & 255;
          if (!(var4 < 241) &&
            !(var4 > 243) || (var4 == 246 ||
            var4 == 248) || !(var4 < 250) &&
            !(var4 > 252) || var4 == 254) {
            this.field_h.field_i = this.field_h.field_i + 1;
            this.field_c[param0] = var4;
            return this.a(param0, var4);
          }
        }
        this.field_h.field_i = this.field_h.field_i + var3;
        return 0;
    }

    public static void f() {
        field_i = null;
    }

    final void a(int param0) {
        this.field_d[param0] = this.field_h.field_i;
    }

    private final int a(int param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        int var3 = 0;
        int var4 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        if (param1 == 255) {
          var3 = this.field_h.l(32270);
          var4 = this.field_h.m(127);
          if (var3 == 47) {
            this.field_h.field_i = this.field_h.field_i + var4;
            return 1;
          }
          if (var3 == 81) {
            var5 = this.field_h.h(83);
            var4 -= 3;
            var6 = this.field_a[param0];
            this.field_e = this.field_e + (long)var6 * (long)(this.field_b - var5);
            this.field_b = var5;
            this.field_h.field_i = this.field_h.field_i + var4;
            return 2;
          }
          this.field_h.field_i = this.field_h.field_i + var4;
          return 3;
        }
        var3Lifetime1 = field_i[param1 - 128];
        var4Lifetime1 = param1;
        if (var3Lifetime1 >= 1) {
          var4Lifetime1 = var4Lifetime1 | this.field_h.l(32270) << 8;
        }
        if (var3Lifetime1 >= 2) {
          var4Lifetime1 = var4Lifetime1 | this.field_h.l(32270) << 16;
        }
        return var4Lifetime1;
    }

    gh() {
        this.field_h = new vi((byte[]) null);
    }

    gh(byte[] param0) {
        this.field_h = new vi((byte[]) null);
        this.a(param0);
    }

    static {
        field_i = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
