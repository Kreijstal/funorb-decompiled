/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiTrackReader {
    private PacketBuffer field_d;
    private static byte[] field_c;
    int[] field_a;
    private int[] field_b;
    private int[] field_f;
    private int field_i;
    private long field_h;
    private int[] field_g;
    int field_e;

    final boolean d() {
        return this.field_d.payload != null;
    }

    private final int e(int param0) {
        int var2;
        int var3;
        int var4;
        var2 = this.field_d.payload[this.field_d.position];
        if (var2 >= 0) {
          var2 = this.field_f[param0];
        } else {
          var2 = var2 & 255;
          this.field_f[param0] = var2;
          this.field_d.position = this.field_d.position + 1;
        }
        if (var2 != 240 &&
          var2 != 247) {
          return this.a(param0, var2);
        }
        var3 = this.field_d.readVarInt((byte) -104);
        if (var2 == 247 &&
          var3 > 0) {
          var4 = this.field_d.payload[this.field_d.position] & 255;
          if (!(var4 < 241) &&
            !(var4 > 243) || (var4 == 246 ||
            var4 == 248) || !(var4 < 250) &&
            !(var4 > 252) || var4 == 254) {
            this.field_d.position = this.field_d.position + 1;
            this.field_f[param0] = var4;
            return this.a(param0, var4);
          }
        }
        this.field_d.position = this.field_d.position + var3;
        return 0;
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        int var3Lifetime1;
        this.field_d.payload = param0;
        this.field_d.position = 10;
        int var2 = this.field_d.readUnsignedShort(-1698573656);
        this.field_e = this.field_d.readUnsignedShort(-1698573656);
        this.field_i = 500000;
        this.field_g = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
          var4 = this.field_d.readInt((byte) 19);
          var5 = this.field_d.readInt((byte) 19);
          if (var4 == 1297379947) {
            this.field_g[var3] = this.field_d.position;
            var3++;
          }
          this.field_d.position = this.field_d.position + var5;
        }
        this.field_h = 0L;
        this.field_b = new int[var2];
        int var6 = 0;
        var3Lifetime1 = var6;
        while (var6 < var2) {
          this.field_b[var6] = this.field_g[var6];
          var6++;
        }
        this.field_a = new int[var2];
        this.field_f = new int[var2];
    }

    final void a(long param0) {
        int var4 = 0;
        this.field_h = param0;
        int var3 = this.field_b.length;
        for (var4 = 0; var4 < var3; var4++) {
          this.field_a[var4] = 0;
          this.field_f[var4] = 0;
          this.field_d.position = this.field_g[var4];
          this.a(var4);
          this.field_b[var4] = this.field_d.position;
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
          var3 = this.field_d.readUnsignedByte(true);
          var4 = this.field_d.readVarInt((byte) -104);
          if (var3 == 47) {
            this.field_d.position = this.field_d.position + var4;
            return 1;
          }
          if (var3 == 81) {
            var5 = this.field_d.readUnsignedMedium(78);
            var4 -= 3;
            var6 = this.field_a[param0];
            this.field_h = this.field_h + (long)var6 * (long)(this.field_i - var5);
            this.field_i = var5;
            this.field_d.position = this.field_d.position + var4;
            return 2;
          }
          this.field_d.position = this.field_d.position + var4;
          return 3;
        }
        var3Lifetime1 = field_c[param1 - 128];
        var4Lifetime1 = param1;
        if (var3Lifetime1 >= 1) {
          var4Lifetime1 = var4Lifetime1 | this.field_d.readUnsignedByte(true) << 8;
        }
        if (var3Lifetime1 >= 2) {
          var4Lifetime1 = var4Lifetime1 | this.field_d.readUnsignedByte(true) << 16;
        }
        return var4Lifetime1;
    }

    final void a(int param0) {
        int var2 = this.field_d.readVarInt((byte) -82);
        this.field_a[param0] = this.field_a[param0] + var2;
    }

    final void f() {
        this.field_d.position = -1;
    }

    final void g() {
        this.field_d.payload = null;
        this.field_g = null;
        this.field_b = null;
        this.field_a = null;
        this.field_f = null;
    }

    final boolean c() {
        int var2 = 0;
        int var1 = this.field_b.length;
        for (var2 = 0; var2 < var1; var2++) {
          if (this.field_b[var2] >= 0) {
            return false;
          }
        }
        return true;
    }

    public static void clearStaticReferences() {
        field_c = null;
    }

    final int e() {
        return this.field_b.length;
    }

    final int a() {
        int var4 = 0;
        int var1;
        int var2;
        int var3;
        var1 = this.field_b.length;
        var2 = -1;
        var3 = 2147483647;
        for (var4 = 0; var4 < var1; var4++) {
          if (this.field_b[var4] >= 0 &&
            this.field_a[var4] < var3) {
            var2 = var4;
            var3 = this.field_a[var4];
          }
        }
        return var2;
    }

    final int f(int param0) {
        int var2 = this.e(param0);
        return var2;
    }

    final void b(int param0) {
        this.field_b[param0] = this.field_d.position;
    }

    final void c(int param0) {
        this.field_d.position = this.field_b[param0];
    }

    final long d(int param0) {
        return this.field_h + (long)param0 * (long)this.field_i;
    }

    MidiTrackReader() {
        this.field_d = new PacketBuffer((byte[]) null);
    }

    MidiTrackReader(byte[] param0) {
        this.field_d = new PacketBuffer((byte[]) null);
        this.a(param0);
    }

    static {
        field_c = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
