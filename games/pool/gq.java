/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gq {
    private PacketBuffer field_c;
    private int[] field_h;
    private long field_e;
    int field_f;
    private int[] field_b;
    private int[] field_i;
    private int field_a;
    private static byte[] field_d;
    int[] field_g;

    final int d(int param0) {
        int var2 = this.c(param0);
        return var2;
    }

    final boolean a() {
        return this.field_c.payload != null;
    }

    final long b(int param0) {
        return this.field_e + (long)param0 * (long)this.field_a;
    }

    final boolean f() {
        int var2 = 0;
        int var1 = this.field_i.length;
        for (var2 = 0; var2 < var1; var2++) {
          if (this.field_i[var2] >= 0) {
            return false;
          }
        }
        return true;
    }

    final void e() {
        this.field_c.payload = null;
        this.field_h = null;
        this.field_i = null;
        this.field_g = null;
        this.field_b = null;
    }

    final void e(int param0) {
        this.field_i[param0] = this.field_c.position;
    }

    final void a(int param0) {
        this.field_c.position = this.field_i[param0];
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        int var3Lifetime1;
        this.field_c.payload = param0;
        this.field_c.position = 10;
        int var2 = this.field_c.readUnsignedShort(-1034);
        this.field_f = this.field_c.readUnsignedShort(-1034);
        this.field_a = 500000;
        this.field_h = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
          var4 = this.field_c.readInt(true);
          var5 = this.field_c.readInt(true);
          if (var4 == 1297379947) {
            this.field_h[var3] = this.field_c.position;
            var3++;
          }
          this.field_c.position = this.field_c.position + var5;
        }
        this.field_e = 0L;
        this.field_i = new int[var2];
        int var6 = 0;
        var3Lifetime1 = var6;
        while (var6 < var2) {
          this.field_i[var6] = this.field_h[var6];
          var6++;
        }
        this.field_g = new int[var2];
        this.field_b = new int[var2];
    }

    final int d() {
        return this.field_i.length;
    }

    final void f(int param0) {
        int var2 = this.field_c.k(88);
        this.field_g[param0] = this.field_g[param0] + var2;
    }

    final int b() {
        int var4 = 0;
        int var1;
        int var2;
        int var3;
        var1 = this.field_i.length;
        var2 = -1;
        var3 = 2147483647;
        for (var4 = 0; var4 < var1; var4++) {
          if (this.field_i[var4] >= 0 &&
            this.field_g[var4] < var3) {
            var2 = var4;
            var3 = this.field_g[var4];
          }
        }
        return var2;
    }

    public static void g() {
        field_d = null;
    }

    final void a(long param0) {
        int var4 = 0;
        this.field_e = param0;
        int var3 = this.field_i.length;
        for (var4 = 0; var4 < var3; var4++) {
          this.field_g[var4] = 0;
          this.field_b[var4] = 0;
          this.field_c.position = this.field_h[var4];
          this.f(var4);
          this.field_i[var4] = this.field_c.position;
        }
    }

    private final int a(int param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        int var3 = 0;
        int var4 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        if (param1 == 255) {
          var3 = this.field_c.readUnsignedByte(-123);
          var4 = this.field_c.k(91);
          if (var3 == 47) {
            this.field_c.position = this.field_c.position + var4;
            return 1;
          }
          if (var3 == 81) {
            var5 = this.field_c.readUnsignedMedium(56);
            var4 -= 3;
            var6 = this.field_g[param0];
            this.field_e = this.field_e + (long)var6 * (long)(this.field_a - var5);
            this.field_a = var5;
            this.field_c.position = this.field_c.position + var4;
            return 2;
          }
          this.field_c.position = this.field_c.position + var4;
          return 3;
        }
        var3Lifetime1 = field_d[param1 - 128];
        var4Lifetime1 = param1;
        if (var3Lifetime1 >= 1) {
          var4Lifetime1 = var4Lifetime1 | this.field_c.readUnsignedByte(-65) << 8;
        }
        if (var3Lifetime1 >= 2) {
          var4Lifetime1 = var4Lifetime1 | this.field_c.readUnsignedByte(-127) << 16;
        }
        return var4Lifetime1;
    }

    private final int c(int param0) {
        int var2;
        int var3;
        int var4;
        var2 = this.field_c.payload[this.field_c.position];
        if (var2 >= 0) {
          var2 = this.field_b[param0];
        } else {
          var2 = var2 & 255;
          this.field_b[param0] = var2;
          this.field_c.position = this.field_c.position + 1;
        }
        if (var2 != 240 &&
          var2 != 247) {
          return this.a(param0, var2);
        }
        var3 = this.field_c.k(-75);
        if (var2 == 247 &&
          var3 > 0) {
          var4 = this.field_c.payload[this.field_c.position] & 255;
          if (!(var4 < 241) &&
            !(var4 > 243) || (var4 == 246 ||
            var4 == 248) || !(var4 < 250) &&
            !(var4 > 252) || var4 == 254) {
            this.field_c.position = this.field_c.position + 1;
            this.field_b[param0] = var4;
            return this.a(param0, var4);
          }
        }
        this.field_c.position = this.field_c.position + var3;
        return 0;
    }

    gq() {
        this.field_c = new PacketBuffer((byte[]) null);
    }

    gq(byte[] param0) {
        this.field_c = new PacketBuffer((byte[]) null);
        this.a(param0);
    }

    final void c() {
        this.field_c.position = -1;
    }

    static {
        field_d = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
