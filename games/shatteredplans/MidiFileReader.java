/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiFileReader {
    private static byte[] field_g;
    private PacketBuffer field_i;
    int field_e;
    int[] field_b;
    private int[] field_h;
    private int[] field_c;
    private int[] field_d;
    private long field_f;
    private int field_a;

    final boolean isFinished() {
        int var2 = 0;
        int var1 = this.field_h.length;
        for (var2 = 0; var2 < var1; var2++) {
          if (this.field_h[var2] >= 0) {
            return false;
          }
        }
        return true;
    }

    final int readEvent(int param0) {
        int var2 = this.f(param0);
        return var2;
    }

    final void reset(long param0) {
        int var4 = 0;
        this.field_f = param0;
        int var3 = this.field_h.length;
        for (var4 = 0; var4 < var3; var4++) {
          this.field_b[var4] = 0;
          this.field_d[var4] = 0;
          this.field_i.position = this.field_c[var4];
          this.advanceTime(var4);
          this.field_h[var4] = this.field_i.position;
        }
    }

    final long eventTime(int param0) {
        return this.field_f + (long)param0 * (long)this.field_a;
    }

    public static void b() {
        field_g = null;
    }

    final void seekToTrack(int param0) {
        this.field_i.position = this.field_h[param0];
    }

    private final int a(int param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        int var3 = 0;
        int var4 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        if (param1 == 255) {
          var3 = this.field_i.readUnsignedByte(-82);
          var4 = this.field_i.readVariableInt(false);
          if (var3 == 47) {
            this.field_i.position = this.field_i.position + var4;
            return 1;
          }
          if (var3 == 81) {
            var5 = this.field_i.readMedium(255);
            var4 -= 3;
            var6 = this.field_b[param0];
            this.field_f = this.field_f + (long)var6 * (long)(this.field_a - var5);
            this.field_a = var5;
            this.field_i.position = this.field_i.position + var4;
            return 2;
          }
          this.field_i.position = this.field_i.position + var4;
          return 3;
        }
        var3Lifetime1 = field_g[param1 - 128];
        var4Lifetime1 = param1;
        if (var3Lifetime1 >= 1) {
          var4Lifetime1 = var4Lifetime1 | this.field_i.readUnsignedByte(-71) << 8;
        }
        if (var3Lifetime1 >= 2) {
          var4Lifetime1 = var4Lifetime1 | this.field_i.readUnsignedByte(-79) << 16;
        }
        return var4Lifetime1;
    }

    final int nextTrack() {
        int var4 = 0;
        int var1;
        int var2;
        int var3;
        var1 = this.field_h.length;
        var2 = -1;
        var3 = 2147483647;
        for (var4 = 0; var4 < var1; var4++) {
          if (this.field_h[var4] >= 0 &&
            this.field_b[var4] < var3) {
            var2 = var4;
            var3 = this.field_b[var4];
          }
        }
        return var2;
    }

    final void e() {
        this.field_i.position = -1;
    }

    final void savePosition(int param0) {
        this.field_h[param0] = this.field_i.position;
    }

    final int trackCount() {
        return this.field_h.length;
    }

    private final int f(int param0) {
        int var2;
        int var3;
        int var4;
        var2 = this.field_i.payload[this.field_i.position];
        if (var2 >= 0) {
          var2 = this.field_d[param0];
        } else {
          var2 = var2 & 255;
          this.field_d[param0] = var2;
          this.field_i.position = this.field_i.position + 1;
        }
        if (var2 != 240 &&
          var2 != 247) {
          return this.a(param0, var2);
        }
        var3 = this.field_i.readVariableInt(false);
        if (var2 == 247 &&
          var3 > 0) {
          var4 = this.field_i.payload[this.field_i.position] & 255;
          if (!(var4 < 241) &&
            !(var4 > 243) || (var4 == 246 ||
            var4 == 248) || !(var4 < 250) &&
            !(var4 > 252) || var4 == 254) {
            this.field_i.position = this.field_i.position + 1;
            this.field_d[param0] = var4;
            return this.a(param0, var4);
          }
        }
        this.field_i.position = this.field_i.position + var3;
        return 0;
    }

    final void release() {
        this.field_i.payload = null;
        this.field_c = null;
        this.field_h = null;
        this.field_b = null;
        this.field_d = null;
    }

    final boolean isLoaded() {
        return this.field_i.payload != null;
    }

    final void advanceTime(int param0) {
        int var2 = this.field_i.readVariableInt(false);
        this.field_b[param0] = this.field_b[param0] + var2;
    }

    final void load(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        int var3Lifetime1;
        this.field_i.payload = param0;
        this.field_i.position = 10;
        int var2 = this.field_i.readUnsignedShort(-20976);
        this.field_e = this.field_i.readUnsignedShort(-20976);
        this.field_a = 500000;
        this.field_c = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
          var4 = this.field_i.readInt(16711680);
          var5 = this.field_i.readInt(16711680);
          if (var4 == 1297379947) {
            this.field_c[var3] = this.field_i.position;
            var3++;
          }
          this.field_i.position = this.field_i.position + var5;
        }
        this.field_f = 0L;
        this.field_h = new int[var2];
        int var6 = 0;
        var3Lifetime1 = var6;
        while (var6 < var2) {
          this.field_h[var6] = this.field_c[var6];
          var6++;
        }
        this.field_b = new int[var2];
        this.field_d = new int[var2];
    }

    MidiFileReader() {
        this.field_i = new PacketBuffer((byte[]) null);
    }

    MidiFileReader(byte[] param0) {
        this.field_i = new PacketBuffer((byte[]) null);
        this.load(param0);
    }

    static {
        field_g = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
