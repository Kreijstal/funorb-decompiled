/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    private PacketBuffer field_c;
    private static byte[] field_g;
    private int[] field_i;
    int field_h;
    private int[] field_a;
    private int[] field_e;
    private long field_b;
    private int field_d;
    int[] field_f;

    public static void b() {
        field_g = null;
    }

    final boolean d() {
        return this.field_c.payload != null;
    }

    final int c() {
        int var4 = 0;
        int var1;
        int var2;
        int var3;
        var1 = this.field_i.length;
        var2 = -1;
        var3 = 2147483647;
        for (var4 = 0; var4 < var1; var4++) {
          if (this.field_i[var4] >= 0 &&
            this.field_f[var4] < var3) {
            var2 = var4;
            var3 = this.field_f[var4];
          }
        }
        return var2;
    }

    final void e(int param0) {
        this.field_c.position = this.field_i[param0];
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        int var3Lifetime1;
        this.field_c.payload = param0;
        this.field_c.position = 10;
        int var2 = this.field_c.readUnsignedShort(false);
        this.field_h = this.field_c.readUnsignedShort(false);
        this.field_d = 500000;
        this.field_e = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
          var4 = this.field_c.readInt(123);
          var5 = this.field_c.readInt(67);
          if (var4 == 1297379947) {
            this.field_e[var3] = this.field_c.position;
            var3++;
          }
          this.field_c.position = this.field_c.position + var5;
        }
        this.field_b = 0L;
        this.field_i = new int[var2];
        int var6 = 0;
        var3Lifetime1 = var6;
        while (var6 < var2) {
          this.field_i[var6] = this.field_e[var6];
          var6++;
        }
        this.field_f = new int[var2];
        this.field_a = new int[var2];
    }

    final boolean a() {
        int var2 = 0;
        int var1 = this.field_i.length;
        for (var2 = 0; var2 < var1; var2++) {
          if (this.field_i[var2] >= 0) {
            return false;
          }
        }
        return true;
    }

    final int a(int param0) {
        int var2 = this.d(param0);
        return var2;
    }

    final void c(int param0) {
        int var2 = this.field_c.readVarInt(-10);
        this.field_f[param0] = this.field_f[param0] + var2;
    }

    final int f() {
        return this.field_i.length;
    }

    final long b(int param0) {
        return this.field_b + (long)param0 * (long)this.field_d;
    }

    final void e() {
        this.field_c.payload = null;
        this.field_e = null;
        this.field_i = null;
        this.field_f = null;
        this.field_a = null;
    }

    private final int d(int param0) {
        int var2;
        int var3;
        int var4;
        var2 = this.field_c.payload[this.field_c.position];
        if (var2 >= 0) {
          var2 = this.field_a[param0];
        } else {
          var2 = var2 & 255;
          this.field_a[param0] = var2;
          this.field_c.position = this.field_c.position + 1;
        }
        if (var2 != 240 &&
          var2 != 247) {
          return this.a(param0, var2);
        }
        var3 = this.field_c.readVarInt(127);
        if (var2 == 247 &&
          var3 > 0) {
          var4 = this.field_c.payload[this.field_c.position] & 255;
          if (!(var4 < 241) &&
            !(var4 > 243) || (var4 == 246 ||
            var4 == 248) || !(var4 < 250) &&
            !(var4 > 252) || var4 == 254) {
            this.field_c.position = this.field_c.position + 1;
            this.field_a[param0] = var4;
            return this.a(param0, var4);
          }
        }
        this.field_c.position = this.field_c.position + var3;
        return 0;
    }

    final void g() {
        this.field_c.position = -1;
    }

    final void f(int param0) {
        this.field_i[param0] = this.field_c.position;
    }

    final void a(long param0) {
        int var4 = 0;
        this.field_b = param0;
        int var3 = this.field_i.length;
        for (var4 = 0; var4 < var3; var4++) {
          this.field_f[var4] = 0;
          this.field_a[var4] = 0;
          this.field_c.position = this.field_e[var4];
          this.c(var4);
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
          var3 = this.field_c.readUnsignedByte(-111);
          var4 = this.field_c.readVarInt(-124);
          if (var3 == 47) {
            this.field_c.position = this.field_c.position + var4;
            return 1;
          }
          if (var3 == 81) {
            var5 = this.field_c.readUnsignedMedium(0);
            var4 -= 3;
            var6 = this.field_f[param0];
            this.field_b = this.field_b + (long)var6 * (long)(this.field_d - var5);
            this.field_d = var5;
            this.field_c.position = this.field_c.position + var4;
            return 2;
          }
          this.field_c.position = this.field_c.position + var4;
          return 3;
        }
        var3Lifetime1 = field_g[param1 - 128];
        var4Lifetime1 = param1;
        if (var3Lifetime1 >= 1) {
          var4Lifetime1 = var4Lifetime1 | this.field_c.readUnsignedByte(-118) << 8;
        }
        if (var3Lifetime1 >= 2) {
          var4Lifetime1 = var4Lifetime1 | this.field_c.readUnsignedByte(-108) << 16;
        }
        return var4Lifetime1;
    }

    pc() {
        this.field_c = new PacketBuffer((byte[]) null);
    }

    pc(byte[] param0) {
        this.field_c = new PacketBuffer((byte[]) null);
        this.a(param0);
    }

    static {
        field_g = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
