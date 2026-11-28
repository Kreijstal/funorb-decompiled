/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiFileReader {
    private static byte[] field_i;
    private PacketBuffer field_h;
    private int[] field_c;
    int field_g;
    int[] field_b;
    private int[] field_a;
    private long field_f;
    private int[] field_e;
    private int field_d;

    final int ticksAtTime(long param0) {
        long var3 = param0 - this.field_f;
        return (int)((var3 + (long)this.field_d - 1L) / (long)this.field_d);
    }

    final int nextTrack() {
        int var4 = 0;
        int var1;
        int var2;
        int var3;
        var1 = this.field_a.length;
        var2 = -1;
        var3 = 2147483647;
        for (var4 = 0; var4 < var1; var4++) {
          if (this.field_a[var4] >= 0 &&
            this.field_b[var4] < var3) {
            var2 = var4;
            var3 = this.field_b[var4];
          }
        }
        return var2;
    }

    final void parse(byte[] param0) {
        int var4 = 0;
        int var5 = 0;
        int var3Lifetime1;
        this.field_h.payload = param0;
        this.field_h.position = 10;
        int var2 = this.field_h.readUnsignedShort(-110);
        this.field_g = this.field_h.readUnsignedShort(-107);
        this.field_d = 500000;
        this.field_e = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
          var4 = this.field_h.readInt((byte) 28);
          var5 = this.field_h.readInt((byte) 15);
          if (var4 == 1297379947) {
            this.field_e[var3] = this.field_h.position;
            var3++;
          }
          this.field_h.position = this.field_h.position + var5;
        }
        this.field_f = 0L;
        this.field_a = new int[var2];
        int var6 = 0;
        var3Lifetime1 = var6;
        while (var6 < var2) {
          this.field_a[var6] = this.field_e[var6];
          var6++;
        }
        this.field_b = new int[var2];
        this.field_c = new int[var2];
    }

    final void markTrackDone() {
        this.field_h.position = -1;
    }

    final boolean isDone() {
        int var2 = 0;
        int var1 = this.field_a.length;
        for (var2 = 0; var2 < var1; var2++) {
          if (this.field_a[var2] >= 0) {
            return false;
          }
        }
        return true;
    }

    final void readDelta(int param0) {
        int var2 = this.field_h.readVarInt(8);
        this.field_b[param0] = this.field_b[param0] + var2;
    }

    private final int decodeMessagePayload(int param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        int var3 = 0;
        int var4 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        if (param1 == 255) {
          var3 = this.field_h.readUnsignedByte((byte) -54);
          var4 = this.field_h.readVarInt(8);
          if (var3 == 47) {
            this.field_h.position = this.field_h.position + var4;
            return 1;
          }
          if (var3 == 81) {
            var5 = this.field_h.readUnsignedMedium(71);
            var4 -= 3;
            var6 = this.field_b[param0];
            this.field_f = this.field_f + (long)var6 * (long)(this.field_d - var5);
            this.field_d = var5;
            this.field_h.position = this.field_h.position + var4;
            return 2;
          }
          this.field_h.position = this.field_h.position + var4;
          return 3;
        }
        var3Lifetime1 = field_i[param1 - 128];
        var4Lifetime1 = param1;
        if (var3Lifetime1 >= 1) {
          var4Lifetime1 = var4Lifetime1 | this.field_h.readUnsignedByte((byte) -54) << 8;
        }
        if (var3Lifetime1 >= 2) {
          var4Lifetime1 = var4Lifetime1 | this.field_h.readUnsignedByte((byte) -54) << 16;
        }
        return var4Lifetime1;
    }

    final void reset(long param0) {
        int var4 = 0;
        this.field_f = param0;
        int var3 = this.field_a.length;
        for (var4 = 0; var4 < var3; var4++) {
          this.field_b[var4] = 0;
          this.field_c[var4] = 0;
          this.field_h.position = this.field_e[var4];
          this.readDelta(var4);
          this.field_a[var4] = this.field_h.position;
        }
    }

    final int readMessage(int param0) {
        int var2 = this.readNextMessage(param0);
        return var2;
    }

    final long tickTime(int param0) {
        return this.field_f + (long)param0 * (long)this.field_d;
    }

    private final int readNextMessage(int param0) {
        int var2;
        int var3;
        int var4;
        var2 = this.field_h.payload[this.field_h.position];
        if (var2 >= 0) {
          var2 = this.field_c[param0];
        } else {
          var2 = var2 & 255;
          this.field_c[param0] = var2;
          this.field_h.position = this.field_h.position + 1;
        }
        if (var2 != 240 &&
          var2 != 247) {
          return this.decodeMessagePayload(param0, var2);
        }
        var3 = this.field_h.readVarInt(8);
        if (var2 == 247 &&
          var3 > 0) {
          var4 = this.field_h.payload[this.field_h.position] & 255;
          if (!(var4 < 241) &&
            !(var4 > 243) || (var4 == 246 ||
            var4 == 248) || !(var4 < 250) &&
            !(var4 > 252) || var4 == 254) {
            this.field_h.position = this.field_h.position + 1;
            this.field_c[param0] = var4;
            return this.decodeMessagePayload(param0, var4);
          }
        }
        this.field_h.position = this.field_h.position + var3;
        return 0;
    }

    final void seekTrack(int param0) {
        this.field_h.position = this.field_a[param0];
    }

    final void release() {
        this.field_h.payload = null;
        this.field_e = null;
        this.field_a = null;
        this.field_b = null;
        this.field_c = null;
    }

    final int trackCount() {
        return this.field_a.length;
    }

    public static void clearStaticReferences() {
        field_i = null;
    }

    final boolean hasMidiData() {
        return this.field_h.payload != null;
    }

    final void saveTrackPosition(int param0) {
        this.field_a[param0] = this.field_h.position;
    }

    MidiFileReader() {
        this.field_h = new PacketBuffer((byte[]) null);
    }

    MidiFileReader(byte[] param0) {
        this.field_h = new PacketBuffer((byte[]) null);
        this.parse(param0);
    }

    static {
        field_i = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
