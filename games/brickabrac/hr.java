/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hr {
    private PacketBuffer field_b;
    private static byte[] field_e;
    private int field_c;
    private int[] field_i;
    int[] field_f;
    int field_d;
    private int[] field_g;
    private long field_a;
    private int[] field_h;

    final int e() {
        return this.field_g.length;
    }

    final int e(int param0) {
        int var2 = this.d(param0);
        return var2;
    }

    final void a(int param0) {
        this.field_b.position = this.field_g[param0];
    }

    final int b(long param0) {
        long var3 = param0 - this.field_a;
        return (int)((var3 + (long)this.field_c - 1L) / (long)this.field_c);
    }

    final boolean f() {
        int var2 = 0;
        int var1 = this.field_g.length;
        for (var2 = 0; var2 < var1; var2++) {
          if (this.field_g[var2] >= 0) {
            return false;
          }
        }
        return true;
    }

    public static void g() {
        field_e = null;
    }

    final void b() {
        this.field_b.position = -1;
    }

    final void f(int param0) {
        int var2 = this.field_b.readVarInt((byte) 127);
        this.field_f[param0] = this.field_f[param0] + var2;
    }

    final int a() {
        int var4 = 0;
        int var1;
        int var2;
        int var3;
        var1 = this.field_g.length;
        var2 = -1;
        var3 = 2147483647;
        for (var4 = 0; var4 < var1; var4++) {
          if (this.field_g[var4] >= 0 &&
            this.field_f[var4] < var3) {
            var2 = var4;
            var3 = this.field_f[var4];
          }
        }
        return var2;
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        int var3Lifetime1;
        this.field_b.data = param0;
        this.field_b.position = 10;
        int var2 = this.field_b.readUnsignedShort(65280);
        this.field_d = this.field_b.readUnsignedShort(65280);
        this.field_c = 500000;
        this.field_h = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
          var4 = this.field_b.readInt(255);
          var5 = this.field_b.readInt(255);
          if (var4 == 1297379947) {
            this.field_h[var3] = this.field_b.position;
            var3++;
          }
          this.field_b.position = this.field_b.position + var5;
        }
        this.field_a = 0L;
        this.field_g = new int[var2];
        int var6 = 0;
        var3Lifetime1 = var6;
        while (var6 < var2) {
          this.field_g[var6] = this.field_h[var6];
          var6++;
        }
        this.field_f = new int[var2];
        this.field_i = new int[var2];
    }

    private final int d(int param0) {
        int var2;
        int var3;
        int var4;
        var2 = this.field_b.data[this.field_b.position];
        if (var2 >= 0) {
          var2 = this.field_i[param0];
        } else {
          var2 = var2 & 255;
          this.field_i[param0] = var2;
          this.field_b.position = this.field_b.position + 1;
        }
        if (var2 != 240 &&
          var2 != 247) {
          return this.a(param0, var2);
        }
        var3 = this.field_b.readVarInt((byte) -73);
        if (var2 == 247 &&
          var3 > 0) {
          var4 = this.field_b.data[this.field_b.position] & 255;
          if (!(var4 < 241) &&
            !(var4 > 243) || (var4 == 246 ||
            var4 == 248) || !(var4 < 250) &&
            !(var4 > 252) || var4 == 254) {
            this.field_b.position = this.field_b.position + 1;
            this.field_i[param0] = var4;
            return this.a(param0, var4);
          }
        }
        this.field_b.position = this.field_b.position + var3;
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
          var3 = this.field_b.readUnsignedByte(255);
          var4 = this.field_b.readVarInt((byte) -75);
          if (var3 == 47) {
            this.field_b.position = this.field_b.position + var4;
            return 1;
          }
          if (var3 == 81) {
            var5 = this.field_b.readUnsignedMedium((byte) -34);
            var4 -= 3;
            var6 = this.field_f[param0];
            this.field_a = this.field_a + (long)var6 * (long)(this.field_c - var5);
            this.field_c = var5;
            this.field_b.position = this.field_b.position + var4;
            return 2;
          }
          this.field_b.position = this.field_b.position + var4;
          return 3;
        }
        var3Lifetime1 = field_e[param1 - 128];
        var4Lifetime1 = param1;
        if (var3Lifetime1 >= 1) {
          var4Lifetime1 = var4Lifetime1 | this.field_b.readUnsignedByte(255) << 8;
        }
        if (var3Lifetime1 >= 2) {
          var4Lifetime1 = var4Lifetime1 | this.field_b.readUnsignedByte(255) << 16;
        }
        return var4Lifetime1;
    }

    final void d() {
        this.field_b.data = null;
        this.field_h = null;
        this.field_g = null;
        this.field_f = null;
        this.field_i = null;
    }

    final long c(int param0) {
        return this.field_a + (long)param0 * (long)this.field_c;
    }

    final void a(long param0) {
        int var4 = 0;
        this.field_a = param0;
        int var3 = this.field_g.length;
        for (var4 = 0; var4 < var3; var4++) {
          this.field_f[var4] = 0;
          this.field_i[var4] = 0;
          this.field_b.position = this.field_h[var4];
          this.f(var4);
          this.field_g[var4] = this.field_b.position;
        }
    }

    final boolean c() {
        return this.field_b.data != null;
    }

    final void b(int param0) {
        this.field_g[param0] = this.field_b.position;
    }

    hr() {
        this.field_b = new PacketBuffer((byte[]) null);
    }

    hr(byte[] param0) {
        this.field_b = new PacketBuffer((byte[]) null);
        this.a(param0);
    }

    static {
        field_e = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
