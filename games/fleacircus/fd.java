/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd {
    private static byte[] field_f;
    private ni field_c;
    private int[] field_h;
    private long field_i;
    int[] field_g;
    private int[] field_b;
    int field_a;
    private int field_e;
    private int[] field_d;

    final int b() {
        int var4 = 0;
        int var1;
        int var2;
        int var3;
        var1 = this.field_d.length;
        var2 = -1;
        var3 = 2147483647;
        for (var4 = 0; var4 < var1; var4++) {
          if (this.field_d[var4] >= 0 &&
            this.field_g[var4] < var3) {
            var2 = var4;
            var3 = this.field_g[var4];
          }
        }
        return var2;
    }

    final int a() {
        return this.field_d.length;
    }

    final void e(int param0) {
        int var2 = this.field_c.b(true);
        this.field_g[param0] = this.field_g[param0] + var2;
    }

    private final int d(int param0) {
        int var2;
        int var3;
        int var4;
        var2 = this.field_c.field_k[this.field_c.field_i];
        if (var2 >= 0) {
          var2 = this.field_h[param0];
        } else {
          var2 = var2 & 255;
          this.field_h[param0] = var2;
          this.field_c.field_i = this.field_c.field_i + 1;
        }
        if (var2 != 240 &&
          var2 != 247) {
          return this.a(param0, var2);
        }
        var3 = this.field_c.b(true);
        if (var2 == 247 &&
          var3 > 0) {
          var4 = this.field_c.field_k[this.field_c.field_i] & 255;
          if (!(var4 < 241) &&
            !(var4 > 243) || (var4 == 246 ||
            var4 == 248) || !(var4 < 250) &&
            !(var4 > 252) || var4 == 254) {
            this.field_c.field_i = this.field_c.field_i + 1;
            this.field_h[param0] = var4;
            return this.a(param0, var4);
          }
        }
        this.field_c.field_i = this.field_c.field_i + var3;
        return 0;
    }

    final boolean g() {
        int var2 = 0;
        int var1 = this.field_d.length;
        for (var2 = 0; var2 < var1; var2++) {
          if (this.field_d[var2] >= 0) {
            return false;
          }
        }
        return true;
    }

    final void f() {
        this.field_c.field_k = null;
        this.field_b = null;
        this.field_d = null;
        this.field_g = null;
        this.field_h = null;
    }

    public static void e() {
        field_f = null;
    }

    final long a(int param0) {
        return this.field_i + (long)param0 * (long)this.field_e;
    }

    final void c(int param0) {
        this.field_d[param0] = this.field_c.field_i;
    }

    final int b(int param0) {
        int var2 = this.d(param0);
        return var2;
    }

    final void d() {
        this.field_c.field_i = -1;
    }

    final void f(int param0) {
        this.field_c.field_i = this.field_d[param0];
    }

    private final int a(int param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        int var3 = 0;
        int var4 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        if (param1 == 255) {
          var3 = this.field_c.e(false);
          var4 = this.field_c.b(true);
          if (var3 == 47) {
            this.field_c.field_i = this.field_c.field_i + var4;
            return 1;
          }
          if (var3 == 81) {
            var5 = this.field_c.c(true);
            var4 -= 3;
            var6 = this.field_g[param0];
            this.field_i = this.field_i + (long)var6 * (long)(this.field_e - var5);
            this.field_e = var5;
            this.field_c.field_i = this.field_c.field_i + var4;
            return 2;
          }
          this.field_c.field_i = this.field_c.field_i + var4;
          return 3;
        }
        var3Lifetime1 = field_f[param1 - 128];
        var4Lifetime1 = param1;
        if (var3Lifetime1 >= 1) {
          var4Lifetime1 = var4Lifetime1 | this.field_c.e(false) << 8;
        }
        if (var3Lifetime1 >= 2) {
          var4Lifetime1 = var4Lifetime1 | this.field_c.e(false) << 16;
        }
        return var4Lifetime1;
    }

    final void a(long param0) {
        int var4 = 0;
        this.field_i = param0;
        int var3 = this.field_d.length;
        for (var4 = 0; var4 < var3; var4++) {
          this.field_g[var4] = 0;
          this.field_h[var4] = 0;
          this.field_c.field_i = this.field_b[var4];
          this.e(var4);
          this.field_d[var4] = this.field_c.field_i;
        }
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        int var3Lifetime1;
        this.field_c.field_k = param0;
        this.field_c.field_i = 10;
        int var2 = this.field_c.d((byte) -82);
        this.field_a = this.field_c.d((byte) 112);
        this.field_e = 500000;
        this.field_b = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
          var4 = this.field_c.c((byte) 127);
          var5 = this.field_c.c((byte) 127);
          if (var4 == 1297379947) {
            this.field_b[var3] = this.field_c.field_i;
            var3++;
          }
          this.field_c.field_i = this.field_c.field_i + var5;
        }
        this.field_i = 0L;
        this.field_d = new int[var2];
        int var6 = 0;
        var3Lifetime1 = var6;
        while (var6 < var2) {
          this.field_d[var6] = this.field_b[var6];
          var6++;
        }
        this.field_g = new int[var2];
        this.field_h = new int[var2];
    }

    final boolean c() {
        return this.field_c.field_k != null;
    }

    fd() {
        this.field_c = new ni((byte[]) null);
    }

    fd(byte[] param0) {
        this.field_c = new ni((byte[]) null);
        this.a(param0);
    }

    static {
        field_f = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
