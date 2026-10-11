/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab {
    private static byte[] field_d;
    private PacketBuffer field_f;
    private int[] field_i;
    private int[] field_b;
    private long field_g;
    private int[] field_h;
    private int field_c;
    int[] field_a;
    int field_e;

    final void d(int param0) {
        this.field_f.position = this.field_h[param0];
    }

    final void a(long param0) {
        int var4 = 0;
        this.field_g = param0;
        int var3 = this.field_h.length;
        for (var4 = 0; var4 < var3; var4++) {
          this.field_a[var4] = 0;
          this.field_i[var4] = 0;
          this.field_f.position = this.field_b[var4];
          this.c(var4);
          this.field_h[var4] = this.field_f.position;
        }
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        int var3Lifetime1;
        this.field_f.payload = param0;
        this.field_f.position = 10;
        int var2 = this.field_f.c((byte) -60);
        this.field_e = this.field_f.c((byte) -60);
        this.field_c = 500000;
        this.field_b = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
          var4 = this.field_f.i(0);
          var5 = this.field_f.i(0);
          if (var4 == 1297379947) {
            this.field_b[var3] = this.field_f.position;
            var3++;
          }
          this.field_f.position = this.field_f.position + var5;
        }
        this.field_g = 0L;
        this.field_h = new int[var2];
        int var6 = 0;
        var3Lifetime1 = var6;
        while (var6 < var2) {
          this.field_h[var6] = this.field_b[var6];
          var6++;
        }
        this.field_a = new int[var2];
        this.field_i = new int[var2];
    }

    public static void a() {
        field_d = null;
    }

    final void g() {
        this.field_f.payload = null;
        this.field_b = null;
        this.field_h = null;
        this.field_a = null;
        this.field_i = null;
    }

    final int b() {
        return this.field_h.length;
    }

    private final int a(int param0) {
        int var2;
        int var3;
        int var4;
        var2 = this.field_f.payload[this.field_f.position];
        if (var2 >= 0) {
          var2 = this.field_i[param0];
        } else {
          var2 = var2 & 255;
          this.field_i[param0] = var2;
          this.field_f.position = this.field_f.position + 1;
        }
        if (var2 != 240 &&
          var2 != 247) {
          return this.a(param0, var2);
        }
        var3 = this.field_f.e(96);
        if (var2 == 247 &&
          var3 > 0) {
          var4 = this.field_f.payload[this.field_f.position] & 255;
          if (!(var4 < 241) &&
            !(var4 > 243) || (var4 == 246 ||
            var4 == 248) || !(var4 < 250) &&
            !(var4 > 252) || var4 == 254) {
            this.field_f.position = this.field_f.position + 1;
            this.field_i[param0] = var4;
            return this.a(param0, var4);
          }
        }
        this.field_f.position = this.field_f.position + var3;
        return 0;
    }

    final int f(int param0) {
        int var2 = this.a(param0);
        return var2;
    }

    final int f() {
        int var4 = 0;
        int var1;
        int var2;
        int var3;
        var1 = this.field_h.length;
        var2 = -1;
        var3 = 2147483647;
        for (var4 = 0; var4 < var1; var4++) {
          if (this.field_h[var4] >= 0 &&
            this.field_a[var4] < var3) {
            var2 = var4;
            var3 = this.field_a[var4];
          }
        }
        return var2;
    }

    final long b(int param0) {
        return this.field_g + (long)param0 * (long)this.field_c;
    }

    final boolean d() {
        return this.field_f.payload != null;
    }

    final void e(int param0) {
        this.field_h[param0] = this.field_f.position;
    }

    final void c(int param0) {
        int var2 = this.field_f.e(60);
        this.field_a[param0] = this.field_a[param0] + var2;
    }

    private final int a(int param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        int var3 = 0;
        int var4 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        if (param1 == 255) {
          var3 = this.field_f.f((byte) -121);
          var4 = this.field_f.e(7);
          if (var3 == 47) {
            this.field_f.position = this.field_f.position + var4;
            return 1;
          }
          if (var3 == 81) {
            var5 = this.field_f.a(false);
            var4 -= 3;
            var6 = this.field_a[param0];
            this.field_g = this.field_g + (long)var6 * (long)(this.field_c - var5);
            this.field_c = var5;
            this.field_f.position = this.field_f.position + var4;
            return 2;
          }
          this.field_f.position = this.field_f.position + var4;
          return 3;
        }
        var3Lifetime1 = field_d[param1 - 128];
        var4Lifetime1 = param1;
        if (var3Lifetime1 >= 1) {
          var4Lifetime1 = var4Lifetime1 | this.field_f.f((byte) -113) << 8;
        }
        if (var3Lifetime1 >= 2) {
          var4Lifetime1 = var4Lifetime1 | this.field_f.f((byte) -90) << 16;
        }
        return var4Lifetime1;
    }

    final void e() {
        this.field_f.position = -1;
    }

    final boolean c() {
        int var2 = 0;
        int var1 = this.field_h.length;
        for (var2 = 0; var2 < var1; var2++) {
          if (this.field_h[var2] >= 0) {
            return false;
          }
        }
        return true;
    }

    ab() {
        this.field_f = new PacketBuffer((byte[]) null);
    }

    ab(byte[] param0) {
        this.field_f = new PacketBuffer((byte[]) null);
        this.a(param0);
    }

    static {
        field_d = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
