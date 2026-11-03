/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiFileReader {
    private static byte[] field_f;
    private PacketBuffer field_g;
    private int field_h;
    int[] field_i;
    private long field_e;
    private int[] field_d;
    int field_a;
    private int[] field_b;
    private int[] field_c;

    public static void releaseStatics() {
        field_f = null;
    }

    final int c() {
        return this.field_b.length;
    }

    private final int a(int param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        int var3 = 0;
        int var4 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        if (param1 == 255) {
          var3 = this.field_g.readUnsignedByte(16711935);
          var4 = this.field_g.readVarInt(-1);
          if (var3 == 47) {
            this.field_g.position = this.field_g.position + var4;
            return 1;
          }
          if (var3 == 81) {
            var5 = this.field_g.a(3);
            var4 -= 3;
            var6 = this.field_i[param0];
            this.field_e = this.field_e + (long)var6 * (long)(this.field_h - var5);
            this.field_h = var5;
            this.field_g.position = this.field_g.position + var4;
            return 2;
          }
          this.field_g.position = this.field_g.position + var4;
          return 3;
        }
        var3Lifetime1 = field_f[param1 - 128];
        var4Lifetime1 = param1;
        if (var3Lifetime1 >= 1) {
          var4Lifetime1 = var4Lifetime1 | this.field_g.readUnsignedByte(16711935) << 8;
        }
        if (var3Lifetime1 >= 2) {
          var4Lifetime1 = var4Lifetime1 | this.field_g.readUnsignedByte(16711935) << 16;
        }
        return var4Lifetime1;
    }

    final void c(int param0) {
        this.field_g.position = this.field_b[param0];
    }

    final void release() {
        this.field_g.payload = null;
        this.field_c = null;
        this.field_b = null;
        this.field_i = null;
        this.field_d = null;
    }

    final void a(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        int var3Lifetime1;
        this.field_g.payload = param0;
        this.field_g.position = 10;
        int var2 = this.field_g.readUnsignedShort((byte) 126);
        this.field_a = this.field_g.readUnsignedShort((byte) 110);
        this.field_h = 500000;
        this.field_c = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
          var4 = this.field_g.readInt(80);
          var5 = this.field_g.readInt(-95);
          if (var4 == 1297379947) {
            this.field_c[var3] = this.field_g.position;
            var3++;
          }
          this.field_g.position = this.field_g.position + var5;
        }
        this.field_e = 0L;
        this.field_b = new int[var2];
        int var6 = 0;
        var3Lifetime1 = var6;
        while (var6 < var2) {
          this.field_b[var6] = this.field_c[var6];
          var6++;
        }
        this.field_i = new int[var2];
        this.field_d = new int[var2];
    }

    private final int d(int param0) {
        int var2;
        int var3;
        int var4;
        var2 = this.field_g.payload[this.field_g.position];
        if (var2 >= 0) {
          var2 = this.field_d[param0];
        } else {
          var2 = var2 & 255;
          this.field_d[param0] = var2;
          this.field_g.position = this.field_g.position + 1;
        }
        if (var2 != 240 &&
          var2 != 247) {
          return this.a(param0, var2);
        }
        var3 = this.field_g.readVarInt(-1);
        if (var2 == 247 &&
          var3 > 0) {
          var4 = this.field_g.payload[this.field_g.position] & 255;
          if (!(var4 < 241) &&
            !(var4 > 243) || (var4 == 246 ||
            var4 == 248) || !(var4 < 250) &&
            !(var4 > 252) || var4 == 254) {
            this.field_g.position = this.field_g.position + 1;
            this.field_d[param0] = var4;
            return this.a(param0, var4);
          }
        }
        this.field_g.position = this.field_g.position + var3;
        return 0;
    }

    final void e(int param0) {
        int var2 = this.field_g.readVarInt(-1);
        this.field_i[param0] = this.field_i[param0] + var2;
    }

    final boolean isDone() {
        int var2 = 0;
        int var1 = this.field_b.length;
        for (var2 = 0; var2 < var1; var2++) {
          if (this.field_b[var2] >= 0) {
            return false;
          }
        }
        return true;
    }

    final boolean f() {
        return this.field_g.payload != null;
    }

    final void f(int param0) {
        this.field_b[param0] = this.field_g.position;
    }

    final void d() {
        this.field_g.position = -1;
    }

    final long b(int param0) {
        return this.field_e + (long)param0 * (long)this.field_h;
    }

    final int nextTrack() {
        int var4 = 0;
        int var1;
        int var2;
        int var3;
        var1 = this.field_b.length;
        var2 = -1;
        var3 = 2147483647;
        for (var4 = 0; var4 < var1; var4++) {
          if (this.field_b[var4] >= 0 &&
            this.field_i[var4] < var3) {
            var2 = var4;
            var3 = this.field_i[var4];
          }
        }
        return var2;
    }

    final void a(long param0) {
        int var4 = 0;
        this.field_e = param0;
        int var3 = this.field_b.length;
        for (var4 = 0; var4 < var3; var4++) {
          this.field_i[var4] = 0;
          this.field_d[var4] = 0;
          this.field_g.position = this.field_c[var4];
          this.e(var4);
          this.field_b[var4] = this.field_g.position;
        }
    }

    final int a(int param0) {
        int var2 = this.d(param0);
        return var2;
    }

    MidiFileReader() {
        this.field_g = new PacketBuffer((byte[]) null);
    }

    MidiFileReader(byte[] param0) {
        this.field_g = new PacketBuffer((byte[]) null);
        this.a(param0);
    }

    static {
        field_f = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
