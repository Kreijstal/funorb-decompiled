/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id {
    private th field_f;
    int[] field_c;
    private int[] field_e;
    int field_a;
    private long field_h;
    private int field_d;
    private int[] field_g;
    private static byte[] field_i;
    private int[] field_b;

    private final int a(int param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        int var3 = 0;
        int var4 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        if (param1 == 255) {
          var3 = this.field_f.f((byte) -34);
          var4 = this.field_f.d((byte) -16);
          if (var3 == 47) {
            this.field_f.field_l = this.field_f.field_l + var4;
            return 1;
          }
          if (var3 == 81) {
            var5 = this.field_f.c(false);
            var4 -= 3;
            var6 = this.field_c[param0];
            this.field_h = this.field_h + (long)var6 * (long)(this.field_d - var5);
            this.field_d = var5;
            this.field_f.field_l = this.field_f.field_l + var4;
            return 2;
          }
          this.field_f.field_l = this.field_f.field_l + var4;
          return 3;
        }
        var3Lifetime1 = field_i[param1 - 128];
        var4Lifetime1 = param1;
        if (var3Lifetime1 >= 1) {
          var4Lifetime1 = var4Lifetime1 | this.field_f.f((byte) -71) << 8;
        }
        if (var3Lifetime1 >= 2) {
          var4Lifetime1 = var4Lifetime1 | this.field_f.f((byte) -123) << 16;
        }
        return var4Lifetime1;
    }

    final int f() {
        int var4 = 0;
        int var1;
        int var2;
        int var3;
        var1 = this.field_e.length;
        var2 = -1;
        var3 = 2147483647;
        for (var4 = 0; var4 < var1; var4++) {
          if (this.field_e[var4] >= 0 &&
            this.field_c[var4] < var3) {
            var2 = var4;
            var3 = this.field_c[var4];
          }
        }
        return var2;
    }

    final long a(int param0) {
        return this.field_h + (long)param0 * (long)this.field_d;
    }

    final boolean e() {
        return this.field_f.field_i != null;
    }

    final void a(long param0) {
        int var4 = 0;
        this.field_h = param0;
        int var3 = this.field_e.length;
        for (var4 = 0; var4 < var3; var4++) {
          this.field_c[var4] = 0;
          this.field_g[var4] = 0;
          this.field_f.field_l = this.field_b[var4];
          this.c(var4);
          this.field_e[var4] = this.field_f.field_l;
        }
    }

    final void b() {
        this.field_f.field_i = null;
        this.field_b = null;
        this.field_e = null;
        this.field_c = null;
        this.field_g = null;
    }

    final boolean g() {
        int var2 = 0;
        int var1 = this.field_e.length;
        for (var2 = 0; var2 < var1; var2++) {
          if (this.field_e[var2] >= 0) {
            return false;
          }
        }
        return true;
    }

    final int a() {
        return this.field_e.length;
    }

    public static void d() {
        field_i = null;
    }

    final void e(int param0) {
        this.field_f.field_l = this.field_e[param0];
    }

    private final int f(int param0) {
        int var2;
        int var3;
        int var4;
        var2 = this.field_f.field_i[this.field_f.field_l];
        if (var2 >= 0) {
          var2 = this.field_g[param0];
        } else {
          var2 = var2 & 255;
          this.field_g[param0] = var2;
          this.field_f.field_l = this.field_f.field_l + 1;
        }
        if (var2 != 240 &&
          var2 != 247) {
          return this.a(param0, var2);
        }
        var3 = this.field_f.d((byte) -23);
        if (var2 == 247 &&
          var3 > 0) {
          var4 = this.field_f.field_i[this.field_f.field_l] & 255;
          if (!(var4 < 241) &&
            !(var4 > 243) || (var4 == 246 ||
            var4 == 248) || !(var4 < 250) &&
            !(var4 > 252) || var4 == 254) {
            this.field_f.field_l = this.field_f.field_l + 1;
            this.field_g[param0] = var4;
            return this.a(param0, var4);
          }
        }
        this.field_f.field_l = this.field_f.field_l + var3;
        return 0;
    }

    final void c() {
        this.field_f.field_l = -1;
    }

    final void d(int param0) {
        this.field_e[param0] = this.field_f.field_l;
    }

    final void c(int param0) {
        int var2 = this.field_f.d((byte) -127);
        this.field_c[param0] = this.field_c[param0] + var2;
    }

    final int b(int param0) {
        int var2 = this.f(param0);
        return var2;
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        int var3Lifetime1;
        this.field_f.field_i = param0;
        this.field_f.field_l = 10;
        int var2 = this.field_f.k(-94);
        this.field_a = this.field_f.k(113);
        this.field_d = 500000;
        this.field_b = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
          var4 = this.field_f.a(104);
          var5 = this.field_f.a(-117);
          if (var4 == 1297379947) {
            this.field_b[var3] = this.field_f.field_l;
            var3++;
          }
          this.field_f.field_l = this.field_f.field_l + var5;
        }
        this.field_h = 0L;
        this.field_e = new int[var2];
        int var6 = 0;
        var3Lifetime1 = var6;
        while (var6 < var2) {
          this.field_e[var6] = this.field_b[var6];
          var6++;
        }
        this.field_c = new int[var2];
        this.field_g = new int[var2];
    }

    id() {
        this.field_f = new th((byte[]) null);
    }

    id(byte[] param0) {
        this.field_f = new th((byte[]) null);
        this.a(param0);
    }

    static {
        field_i = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
