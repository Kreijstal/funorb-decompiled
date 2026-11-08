/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiFileReader {
    private PacketBuffer field_e;
    private int[] field_d;
    int field_c;
    private int[] field_g;
    private static byte[] field_f;
    private int field_h;
    int[] field_a;
    private int[] field_b;
    private long field_i;

    final void reset(long param0) {
        int var4 = 0;
        this.field_i = param0;
        int var3 = this.field_b.length;
        for (var4 = 0; var4 < var3; var4++) {
          this.field_a[var4] = 0;
          this.field_g[var4] = 0;
          this.field_e.position = this.field_d[var4];
          this.readDelta(var4);
          this.field_b[var4] = this.field_e.position;
        }
    }

    final void saveTrackPosition(int param0) {
        this.field_b[param0] = this.field_e.position;
    }

    final boolean isReady() {
        return this.field_e.payload != null;
    }

    final void seekTrack(int param0) {
        this.field_e.position = this.field_b[param0];
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

    final void readDelta(int param0) {
        int var2 = this.field_e.readVarInt(0);
        this.field_a[param0] = this.field_a[param0] + var2;
    }

    public static void releaseStatics() {
        field_f = null;
    }

    final void release() {
        this.field_e.payload = null;
        this.field_d = null;
        this.field_b = null;
        this.field_a = null;
        this.field_g = null;
    }

    final void parse(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        int var3Lifetime1;
        this.field_e.payload = param0;
        this.field_e.position = 10;
        int var2 = this.field_e.readUnsignedShort((byte) 58);
        this.field_c = this.field_e.readUnsignedShort((byte) 97);
        this.field_h = 500000;
        this.field_d = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
          var4 = this.field_e.readInt((byte) 115);
          var5 = this.field_e.readInt((byte) 126);
          if (var4 == 1297379947) {
            this.field_d[var3] = this.field_e.position;
            var3++;
          }
          this.field_e.position = this.field_e.position + var5;
        }
        this.field_i = 0L;
        this.field_b = new int[var2];
        int var6 = 0;
        var3Lifetime1 = var6;
        while (var6 < var2) {
          this.field_b[var6] = this.field_d[var6];
          var6++;
        }
        this.field_a = new int[var2];
        this.field_g = new int[var2];
    }

    final int trackCount() {
        return this.field_b.length;
    }

    final void markTrackDone() {
        this.field_e.position = -1;
    }

    final int readMessage(int param0) {
        int var2 = this.readNextMessage(param0);
        return var2;
    }

    final long tickTime(int param0) {
        return this.field_i + (long)param0 * (long)this.field_h;
    }

    private final int decodeMessagePayload(int param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        int var3 = 0;
        int var4 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        if (param1 == 255) {
          var3 = this.field_e.readUnsignedByte(11132);
          var4 = this.field_e.readVarInt(0);
          if (var3 == 47) {
            this.field_e.position = this.field_e.position + var4;
            return 1;
          }
          if (var3 == 81) {
            var5 = this.field_e.readMedium(-25842);
            var4 -= 3;
            var6 = this.field_a[param0];
            this.field_i = this.field_i + (long)var6 * (long)(this.field_h - var5);
            this.field_h = var5;
            this.field_e.position = this.field_e.position + var4;
            return 2;
          }
          this.field_e.position = this.field_e.position + var4;
          return 3;
        }
        var3Lifetime1 = field_f[param1 - 128];
        var4Lifetime1 = param1;
        if (var3Lifetime1 >= 1) {
          var4Lifetime1 = var4Lifetime1 | this.field_e.readUnsignedByte(11132) << 8;
        }
        if (var3Lifetime1 >= 2) {
          var4Lifetime1 = var4Lifetime1 | this.field_e.readUnsignedByte(11132) << 16;
        }
        return var4Lifetime1;
    }

    MidiFileReader() {
        this.field_e = new PacketBuffer((byte[]) null);
    }

    MidiFileReader(byte[] param0) {
        this.field_e = new PacketBuffer((byte[]) null);
        this.parse(param0);
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
            this.field_a[var4] < var3) {
            var2 = var4;
            var3 = this.field_a[var4];
          }
        }
        return var2;
    }

    private final int readNextMessage(int param0) {
        int var2;
        int var3;
        int var4;
        var2 = this.field_e.payload[this.field_e.position];
        if (var2 >= 0) {
          var2 = this.field_g[param0];
        } else {
          var2 = var2 & 255;
          this.field_g[param0] = var2;
          this.field_e.position = this.field_e.position + 1;
        }
        if (var2 != 240 &&
          var2 != 247) {
          return this.decodeMessagePayload(param0, var2);
        }
        var3 = this.field_e.readVarInt(0);
        if (var2 == 247 &&
          var3 > 0) {
          var4 = this.field_e.payload[this.field_e.position] & 255;
          if (!(var4 < 241) &&
            !(var4 > 243) || (var4 == 246 ||
            var4 == 248) || !(var4 < 250) &&
            !(var4 > 252) || var4 == 254) {
            this.field_e.position = this.field_e.position + 1;
            this.field_g[param0] = var4;
            return this.decodeMessagePayload(param0, var4);
          }
        }
        this.field_e.position = this.field_e.position + var3;
        return 0;
    }

    static {
        field_f = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
